package org.xtext.ecerule.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.ecerule.ece.AllenOp;
import org.xtext.ecerule.ece.AtExpr;
import org.xtext.ecerule.ece.ConditionRule;
import org.xtext.ecerule.ece.ContextsList;
import org.xtext.ecerule.ece.EceModel;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.EventFeature;
import org.xtext.ecerule.ece.ExpContext;
import org.xtext.ecerule.ece.ExpContextsList;
import org.xtext.ecerule.ece.Statement;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class EceGenerator implements IGenerator {
  public void doGenerate(final Resource res, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = res.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EceModel> _filter = Iterables.<EceModel>filter(_iterable, EceModel.class);
    for (final EceModel eceModel : _filter) {
      CharSequence _compile = this.compile(eceModel);
      fsa.generateFile("gen/MainEce.java", _compile);
    }
  }
  
  public CharSequence compile(final EceModel eceModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.xtext.ecerule.model.Model;");
    _builder.newLine();
    _builder.append("import org.xtext.ecerule.model.Statement;");
    _builder.newLine();
    _builder.append("import org.xtext.ecerule.model.Event;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class MainEce {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Model model = new Model();");
    _builder.newLine();
    {
      EList<Statement> _statements = eceModel.getStatements();
      for(final Statement stm : _statements) {
        _builder.append("Statement statement = new Statement();");
        _builder.newLine();
        CharSequence _compileEvent = this.compileEvent(stm);
        _builder.append(_compileEvent, "");
        _builder.append(" \t\t");
        _builder.append("\t\t\t\t\t\t");
        CharSequence _compileContextsList = this.compileContextsList(stm);
        _builder.append(_compileContextsList, "");
        _builder.append("\t");
        _builder.append("\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("model.add(\"Stm");
        Event _event = stm.getEvent();
        String _eventName = _event.getEventName();
        _builder.append(_eventName, "						");
        _builder.append("\", statement);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEvent(final Statement stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Event event = new Event();");
    _builder.newLine();
    _builder.append("String eventName = \"");
    Event _event = stm.getEvent();
    String _eventName = _event.getEventName();
    _builder.append(_eventName, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("event.setEventName(eventName);");
    _builder.newLine();
    {
      Event _event_1 = stm.getEvent();
      EList<EventFeature> _params = _event_1.getParams();
      for(final EventFeature feature : _params) {
        _builder.append("event.addEventFeature(");
        String _name = feature.getName();
        _builder.append(_name, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("statement.setEvent(event);");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileContextsList(final Statement stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.newLine();
    {
      ContextsList _contextsList = stm.getContextsList();
      ExpContextsList _expContextsList = _contextsList.getExpContextsList();
      EList<ExpContext> _expContexts = _expContextsList.getExpContexts();
      for(final ExpContext expContext : _expContexts) {
        CharSequence _compileExpContext = this.compileExpContext(expContext);
        _builder.append(_compileExpContext, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileExpContext(final ExpContext expContext) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ExpContext expContext = new ExpContext();");
    _builder.newLine();
    ConditionRule _initialCondition = expContext.getInitialCondition();
    CharSequence _compileInitialCond = this.compileInitialCond(_initialCondition);
    _builder.append(_compileInitialCond, "");
    _builder.append("\t");
    _builder.append("\t\t");
    ConditionRule _finalCondition = expContext.getFinalCondition();
    this.compileFinalCond(_finalCondition);
    _builder.append("\t\t");
    _builder.append("\t\t");
    AllenOp _allenOp = expContext.getAllenOp();
    AtExpr _time = expContext.getTime();
    this.compileTime(_allenOp, _time);
    _builder.append("\t");
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("statement.addExpContext(expContext);");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileInitialCond(final ConditionRule cond) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileTerminalRight is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileTerminalRight is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileTerminalRight is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileTerminalRight is undefined for the type EceGenerator"
      + "\nThe method compileTerminalLeft is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator"
      + "\nThe method compileRecExpr is undefined for the type EceGenerator");
  }
  
  public void compileFinalCond(final ConditionRule rule) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
  
  public void compileTime(final AllenOp op, final AtExpr expr) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("TODO: auto-generated method stub");
    throw _unsupportedOperationException;
  }
}
