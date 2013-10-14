package org.xtext.ecerule.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
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
  
  @Test
  public void testParsingLite() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on EventoNome set FluenteNome to 52, expect (true);");
      _builder.newLine();
      EceModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingSimplePro() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("on BilanciaMisura (lettura, tara) \tset peso to (lettura-tara)*100 in 26 if tara<=16 ,");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("set totPesate to [totPesate] + (lettura-tara)*100 if (lettura-tara)*100>60,");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.append("expect [totPesate] >= (lettura-tara)*100 finishes 264 if [totPesate]>=0 ;");
      _builder.newLine();
      EceModel _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
