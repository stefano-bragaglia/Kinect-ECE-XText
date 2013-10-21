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
import org.xtext.ecerule.ece.EceModel;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.EventFeature;
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
    _builder.append("\t\t");
    _builder.append("//PER OGNI STATEMENT");
    _builder.newLine();
    {
      EList<Statement> _statements = eceModel.getStatements();
      for(final Statement stm : _statements) {
        _builder.append("\t\t");
        _builder.append("Statement statement = new Statement();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("Event event = new Event();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("String eventName = \"");
        Event _event = stm.getEvent();
        String _eventName = _event.getEventName();
        _builder.append(_eventName, "		");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("event.setEventName(eventName);");
        _builder.newLine();
        {
          Event _event_1 = stm.getEvent();
          EList<EventFeature> _params = _event_1.getParams();
          for(final EventFeature feature : _params) {
            _builder.append("\t\t");
            _builder.append("event.addEventFeature(");
            String _name = feature.getName();
            _builder.append(_name, "		");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("statement.setEvent(event);");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("//AGGIUNGO LO STM AL MODEL");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("model.add(\"Stm");
        Event _event_2 = stm.getEvent();
        String _eventName_1 = _event_2.getEventName();
        _builder.append(_eventName_1, "		");
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
}
