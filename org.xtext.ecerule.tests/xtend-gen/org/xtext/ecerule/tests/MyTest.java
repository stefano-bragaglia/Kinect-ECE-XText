package org.xtext.ecerule.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.ecerule.EceInjectorProvider;
import org.xtext.ecerule.ece.EceModel;

@RunWith(XtextRunner.class)
@InjectWith(EceInjectorProvider.class)
@SuppressWarnings("all")
public class MyTest {
  @Inject
  @Extension
  private ParseHelper<EceModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testErrorParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on BilanciaMisuraEasy(pesata) set peso to pesata if pesata <=100, set peso to 88888 if pesata >100, expect peso == 88888 before 3600 if pesata>100;");
      _builder.newLine();
      EceModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGeneratedCode() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on BilanciaMisuraEasy(pesata) set peso to pesata if pesata <=100, set peso to 88888 if pesata >100, expect peso == 88888 before 3600 if pesata>100;");
      _builder.newLine();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import org.xtext.ecerule.model.*;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class MainEce {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public static void main (String[] args) {\t");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("Model model = new Model();");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Statement statement = new Statement();");
      _builder_1.newLine();
      _builder_1.append("Event event = new Event();");
      _builder_1.newLine();
      _builder_1.append("String eventName = \"BilanciaMisuraEasy\";");
      _builder_1.newLine();
      _builder_1.append("event.setEventName(eventName);");
      _builder_1.newLine();
      _builder_1.append("statement.setEvent(event);");
      _builder_1.newLine();
      _builder_1.append(" \t\t\t\t\t\t\t\t");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("ExpContext expContext = new ExpContext();");
      _builder_1.newLine();
      _builder_1.append("//default compileCond\t\t\t//default compileCond\t\t\t\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("statement.addExpContext(expContext);");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t\t\t");
      _builder_1.append("model.add(\"StmBilanciaMisuraEasy\", statement);");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
