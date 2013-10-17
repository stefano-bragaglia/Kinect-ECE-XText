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
    Iterable<Statement> _filter = Iterables.<Statement>filter(_iterable, Statement.class);
    for (final Statement stm : _filter) {
      Event _event = stm.getEvent();
      String _eventName = _event.getEventName();
      String _plus = ("statements/" + _eventName);
      String _plus_1 = (_plus + ".java");
      CharSequence _compile = this.compile(stm);
      fsa.generateFile(_plus_1, _compile);
    }
  }
  
  public CharSequence compile(final Statement stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("public class Stm");
    Event _event = stm.getEvent();
    String _eventName = _event.getEventName();
    _builder.append(_eventName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("private Event event;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private List<EcContext> ecContextsList;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private List<ExpContext> expContextsList;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Stm");
    Event _event_1 = stm.getEvent();
    String _eventName_1 = _event_1.getEventName();
    _builder.append(_eventName_1, "		");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("String eventName = \"");
    Event _event_2 = stm.getEvent();
    String _eventName_2 = _event_2.getEventName();
    _builder.append(_eventName_2, "		");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("List<String> eventFeatureList = new ArrayList<String>();");
    _builder.newLine();
    {
      Event _event_3 = stm.getEvent();
      EList<EventFeature> _param = _event_3.getParam();
      for(final EventFeature feature : _param) {
        _builder.append("\t\t");
        _builder.append("eventFeatureList.add(\"");
        String _name = feature.getName();
        _builder.append(_name, "		");
        _builder.append("\");\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("event.setEventFeatureList(eventFeatureList);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
