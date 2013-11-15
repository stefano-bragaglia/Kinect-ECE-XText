package org.xtext.ecerule.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl.Container;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.ecerule.ece.AllenOp;
import org.xtext.ecerule.ece.ConditionRule;
import org.xtext.ecerule.ece.ContextsList;
import org.xtext.ecerule.ece.EceModel;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.EventFeature;
import org.xtext.ecerule.ece.ExpContext;
import org.xtext.ecerule.ece.ExpContextsList;
import org.xtext.ecerule.ece.Expression;
import org.xtext.ecerule.ece.ReferenceType;
import org.xtext.ecerule.ece.Statement;
import org.xtext.ecerule.ece.impl.AllenOperatorImpl;
import org.xtext.ecerule.ece.impl.AndImpl;
import org.xtext.ecerule.ece.impl.BoolConstantImpl;
import org.xtext.ecerule.ece.impl.ComparisonImpl;
import org.xtext.ecerule.ece.impl.EqualityImpl;
import org.xtext.ecerule.ece.impl.EventFeatureImpl;
import org.xtext.ecerule.ece.impl.ExpressionImpl;
import org.xtext.ecerule.ece.impl.FloatConstantImpl;
import org.xtext.ecerule.ece.impl.FluentImpl;
import org.xtext.ecerule.ece.impl.IntConstantImpl;
import org.xtext.ecerule.ece.impl.MinusImpl;
import org.xtext.ecerule.ece.impl.MulOrDivImpl;
import org.xtext.ecerule.ece.impl.NotImpl;
import org.xtext.ecerule.ece.impl.OrImpl;
import org.xtext.ecerule.ece.impl.PlusImpl;
import org.xtext.ecerule.ece.impl.ReferenceImpl;
import org.xtext.ecerule.ece.impl.ReferenceTypeImpl;

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
    _builder.append("import org.xtext.ecerule.model.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class MainEce {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main (String[] args) {\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Statement statement;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Event event;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public String eventName;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ExpressionDescr exprContainer;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ConditionDescr condContainer;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ExpContext expContext;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Time time;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Model model = new Model();");
    _builder.newLine();
    {
      EList<Statement> _statements = eceModel.getStatements();
      for(final Statement stm : _statements) {
        _builder.append("statement = new Statement();");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        CharSequence _compileContextsList = this.compileContextsList(stm);
        _builder.append(_compileContextsList, "						");
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
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileEvent(final Statement stm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("event = new Event();");
    _builder.newLine();
    _builder.append("eventName = \"");
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
      boolean _notEquals = (!Objects.equal(_expContextsList, null));
      if (_notEquals) {
        {
          ContextsList _contextsList_1 = stm.getContextsList();
          ExpContextsList _expContextsList_1 = _contextsList_1.getExpContextsList();
          EList<ExpContext> _expContexts = _expContextsList_1.getExpContexts();
          for(final ExpContext expContext : _expContexts) {
            CharSequence _compileExpContext = this.compileExpContext(expContext, stm);
            _builder.append(_compileExpContext, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileExpContext(final ExpContext expContext, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("expContext = new ExpContext();");
    _builder.newLine();
    ConditionRule _initialCondition = expContext.getInitialCondition();
    CharSequence _compileCond = this.compileCond(((ExpressionImpl) _initialCondition), statement, "Initial");
    _builder.append(_compileCond, "");
    _builder.append("\t");
    _builder.append("\t\t");
    ConditionRule _finalCondition = expContext.getFinalCondition();
    CharSequence _compileCond_1 = this.compileCond(((ExpressionImpl) _finalCondition), statement, "Final");
    _builder.append(_compileCond_1, "");
    _builder.append("\t\t");
    _builder.append("\t\t");
    AllenOp _allenOp = expContext.getAllenOp();
    Expression _time = expContext.getTime();
    CharSequence _compileTime = this.compileTime(((AllenOperatorImpl) _allenOp), ((ExpressionImpl) _time), statement);
    _builder.append(_compileTime, "");
    _builder.append("\t");
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("statement.addExpContext(expContext);");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCond(final ExpressionImpl condExpr, final Statement statement, final String condType) {
    CharSequence _xblockexpression = null;
    {
      Expression cond = condExpr.getCondition();
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (cond instanceof NotImpl) {
          final NotImpl _notImpl = (NotImpl)cond;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          {
            Expression _expression = _notImpl.getExpression();
            EClass _eClass = _expression.eClass();
            String _name = _eClass.getName();
            boolean _equals = _name.equals("Constant");
            if (_equals) {
              _builder.append(" ");
              _builder.append("\t\t\t\t\tcondContainer = new NotDescr( ");
              Expression _expression_1 = _notImpl.getExpression();
              CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _expression_1), statement);
              _builder.append(_compileTerminalLeft, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append(" ");
              _builder.append("\t\t\t\t\tcondContainer = new NotDescr(");
              Expression _expression_2 = _notImpl.getExpression();
              CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _expression_2), statement);
              _builder.append(_compileRecExpr, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.newLine();
          _builder.append("expContext.set");
          _builder.append(condType, "");
          _builder.append("Condition(condContainer);");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (cond instanceof OrImpl) {
          final OrImpl _orImpl = (OrImpl)cond;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          {
            boolean _and = false;
            Expression _left = _orImpl.getLeft();
            EClass _eClass = _left.eClass();
            String _name = _eClass.getName();
            boolean _contains = _name.contains("Constant");
            if (!_contains) {
              _and = false;
            } else {
              Expression _right = _orImpl.getRight();
              EClass _eClass_1 = _right.eClass();
              String _name_1 = _eClass_1.getName();
              boolean _contains_1 = _name_1.contains("Constant");
              _and = (_contains && _contains_1);
            }
            if (_and) {
              _builder.append("condContainer = new OrDescr( ");
              Expression _left_1 = _orImpl.getLeft();
              CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
              _builder.append(_compileTerminalLeft, "");
              _builder.append(",");
              Expression _right_1 = _orImpl.getRight();
              CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
              _builder.append(_compileTerminalRight, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              {
                Expression _left_2 = _orImpl.getLeft();
                EClass _eClass_2 = _left_2.eClass();
                String _name_2 = _eClass_2.getName();
                boolean _contains_2 = _name_2.contains("Constant");
                if (_contains_2) {
                  _builder.append("condContainer = new OrDescr(");
                  Expression _left_3 = _orImpl.getLeft();
                  CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                  _builder.append(_compileTerminalLeft_1, "");
                  _builder.append(",");
                  Expression _right_2 = _orImpl.getRight();
                  CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                  _builder.append(_compileRecExpr, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Expression _left_4 = _orImpl.getLeft();
                EClass _eClass_3 = _left_4.eClass();
                String _name_3 = _eClass_3.getName();
                boolean _contains_3 = _name_3.contains("Constant");
                boolean _not = (!_contains_3);
                if (_not) {
                  _builder.append("condContainer = new OrDescr(");
                  Expression _left_5 = _orImpl.getLeft();
                  CharSequence _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                  _builder.append(_compileRecExpr_1, "");
                  _builder.append(",");
                  Expression _right_3 = _orImpl.getRight();
                  CharSequence _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                  _builder.append(_compileRecExpr_2, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.newLine();
          _builder.append("expContext.set");
          _builder.append(condType, "");
          _builder.append("Condition(condContainer);");
          _builder.newLineIfNotEmpty();
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (cond instanceof AndImpl) {
          final AndImpl _andImpl = (AndImpl)cond;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          {
            boolean _and = false;
            Expression _left = _andImpl.getLeft();
            EClass _eClass = _left.eClass();
            String _name = _eClass.getName();
            boolean _contains = _name.contains("Constant");
            if (!_contains) {
              _and = false;
            } else {
              Expression _right = _andImpl.getRight();
              EClass _eClass_1 = _right.eClass();
              String _name_1 = _eClass_1.getName();
              boolean _contains_1 = _name_1.contains("Constant");
              _and = (_contains && _contains_1);
            }
            if (_and) {
              _builder.append("condContainer = new AndDescr( ");
              Expression _left_1 = _andImpl.getLeft();
              CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
              _builder.append(_compileTerminalLeft, "");
              _builder.append(",");
              Expression _right_1 = _andImpl.getRight();
              CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
              _builder.append(_compileTerminalRight, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              {
                Expression _left_2 = _andImpl.getLeft();
                EClass _eClass_2 = _left_2.eClass();
                String _name_2 = _eClass_2.getName();
                boolean _contains_2 = _name_2.contains("Constant");
                if (_contains_2) {
                  _builder.append("condContainer = new AndDescr(");
                  Expression _left_3 = _andImpl.getLeft();
                  CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                  _builder.append(_compileTerminalLeft_1, "");
                  _builder.append(",");
                  Expression _right_2 = _andImpl.getRight();
                  CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                  _builder.append(_compileRecExpr, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Expression _left_4 = _andImpl.getLeft();
                EClass _eClass_3 = _left_4.eClass();
                String _name_3 = _eClass_3.getName();
                boolean _contains_3 = _name_3.contains("Constant");
                boolean _not = (!_contains_3);
                if (_not) {
                  _builder.append("condContainer = new AndDescr(");
                  Expression _left_5 = _andImpl.getLeft();
                  CharSequence _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                  _builder.append(_compileRecExpr_1, "");
                  _builder.append(",");
                  Expression _right_3 = _andImpl.getRight();
                  CharSequence _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                  _builder.append(_compileRecExpr_2, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.newLine();
          _builder.append("expContext.set");
          _builder.append(condType, "");
          _builder.append("Condition(condContainer);");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (cond instanceof EqualityImpl) {
          final EqualityImpl _equalityImpl = (EqualityImpl)cond;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          {
            String _op = _equalityImpl.getOp();
            boolean _equals = _op.equals("==");
            if (_equals) {
              {
                boolean _and = false;
                Expression _left = _equalityImpl.getLeft();
                EClass _eClass = _left.eClass();
                String _name = _eClass.getName();
                boolean _contains = _name.contains("Constant");
                if (!_contains) {
                  _and = false;
                } else {
                  Expression _right = _equalityImpl.getRight();
                  EClass _eClass_1 = _right.eClass();
                  String _name_1 = _eClass_1.getName();
                  boolean _contains_1 = _name_1.contains("Constant");
                  _and = (_contains && _contains_1);
                }
                if (_and) {
                  _builder.append("condContainer = new SameDescr( ");
                  Expression _left_1 = _equalityImpl.getLeft();
                  CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
                  _builder.append(_compileTerminalLeft, "");
                  _builder.append(",");
                  Expression _right_1 = _equalityImpl.getRight();
                  CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
                  _builder.append(_compileTerminalRight, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    Expression _left_2 = _equalityImpl.getLeft();
                    EClass _eClass_2 = _left_2.eClass();
                    String _name_2 = _eClass_2.getName();
                    boolean _contains_2 = _name_2.contains("Constant");
                    if (_contains_2) {
                      _builder.append("condContainer = new SameDescr(");
                      Expression _left_3 = _equalityImpl.getLeft();
                      CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                      _builder.append(_compileTerminalLeft_1, "");
                      _builder.append(",");
                      Expression _right_2 = _equalityImpl.getRight();
                      CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                      _builder.append(_compileRecExpr, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    Expression _left_4 = _equalityImpl.getLeft();
                    EClass _eClass_3 = _left_4.eClass();
                    String _name_3 = _eClass_3.getName();
                    boolean _contains_3 = _name_3.contains("Constant");
                    boolean _not = (!_contains_3);
                    if (_not) {
                      _builder.append("condContainer = new SameDescr(");
                      Expression _left_5 = _equalityImpl.getLeft();
                      CharSequence _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                      _builder.append(_compileRecExpr_1, "");
                      _builder.append(",");
                      Expression _right_3 = _equalityImpl.getRight();
                      CharSequence _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                      _builder.append(_compileRecExpr_2, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("expContext.set");
              _builder.append(condType, "");
              _builder.append("Condition(condContainer);");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            } else {
              {
                boolean _and_1 = false;
                Expression _left_6 = _equalityImpl.getLeft();
                EClass _eClass_4 = _left_6.eClass();
                String _name_4 = _eClass_4.getName();
                boolean _contains_4 = _name_4.contains("Constant");
                if (!_contains_4) {
                  _and_1 = false;
                } else {
                  Expression _right_4 = _equalityImpl.getRight();
                  EClass _eClass_5 = _right_4.eClass();
                  String _name_5 = _eClass_5.getName();
                  boolean _contains_5 = _name_5.contains("Constant");
                  _and_1 = (_contains_4 && _contains_5);
                }
                if (_and_1) {
                  _builder.append("condContainer = new DifferentDescr( ");
                  Expression _left_7 = _equalityImpl.getLeft();
                  CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_7), statement);
                  _builder.append(_compileTerminalLeft_2, "");
                  _builder.append(",");
                  Expression _right_5 = _equalityImpl.getRight();
                  CharSequence _compileTerminalRight_1 = this.compileTerminalRight(((ExpressionImpl) _right_5), statement);
                  _builder.append(_compileTerminalRight_1, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    Expression _left_8 = _equalityImpl.getLeft();
                    EClass _eClass_6 = _left_8.eClass();
                    String _name_6 = _eClass_6.getName();
                    boolean _contains_6 = _name_6.contains("Constant");
                    if (_contains_6) {
                      _builder.append("condContainer = new DifferentDescr(");
                      Expression _left_9 = _equalityImpl.getLeft();
                      CharSequence _compileTerminalLeft_3 = this.compileTerminalLeft(((ExpressionImpl) _left_9), statement);
                      _builder.append(_compileTerminalLeft_3, "");
                      _builder.append(",");
                      Expression _right_6 = _equalityImpl.getRight();
                      CharSequence _compileRecExpr_3 = this.compileRecExpr(((ExpressionImpl) _right_6), statement);
                      _builder.append(_compileRecExpr_3, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    Expression _left_10 = _equalityImpl.getLeft();
                    EClass _eClass_7 = _left_10.eClass();
                    String _name_7 = _eClass_7.getName();
                    boolean _contains_7 = _name_7.contains("Constant");
                    boolean _not_1 = (!_contains_7);
                    if (_not_1) {
                      _builder.append("condContainer = new DifferentDescr(");
                      Expression _left_11 = _equalityImpl.getLeft();
                      CharSequence _compileRecExpr_4 = this.compileRecExpr(((ExpressionImpl) _left_11), statement);
                      _builder.append(_compileRecExpr_4, "");
                      _builder.append(",");
                      Expression _right_7 = _equalityImpl.getRight();
                      CharSequence _compileRecExpr_5 = this.compileRecExpr(((ExpressionImpl) _right_7), statement);
                      _builder.append(_compileRecExpr_5, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("expContext.set");
              _builder.append(condType, "");
              _builder.append("Condition(condContainer);");
              _builder.newLineIfNotEmpty();
            }
          }
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        if (cond instanceof ComparisonImpl) {
          final ComparisonImpl _comparisonImpl = (ComparisonImpl)cond;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          {
            String _op = _comparisonImpl.getOp();
            boolean _equals = _op.equals(">=");
            if (_equals) {
              {
                boolean _and = false;
                Expression _left = _comparisonImpl.getLeft();
                EClass _eClass = _left.eClass();
                String _name = _eClass.getName();
                boolean _contains = _name.contains("Constant");
                if (!_contains) {
                  _and = false;
                } else {
                  Expression _right = _comparisonImpl.getRight();
                  EClass _eClass_1 = _right.eClass();
                  String _name_1 = _eClass_1.getName();
                  boolean _contains_1 = _name_1.contains("Constant");
                  _and = (_contains && _contains_1);
                }
                if (_and) {
                  _builder.append("condContainer = new MoreEqualsDescr( ");
                  Expression _left_1 = _comparisonImpl.getLeft();
                  CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
                  _builder.append(_compileTerminalLeft, "");
                  _builder.append(",");
                  Expression _right_1 = _comparisonImpl.getRight();
                  CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
                  _builder.append(_compileTerminalRight, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                } else {
                  {
                    Expression _left_2 = _comparisonImpl.getLeft();
                    EClass _eClass_2 = _left_2.eClass();
                    String _name_2 = _eClass_2.getName();
                    boolean _contains_2 = _name_2.contains("Constant");
                    if (_contains_2) {
                      _builder.append("condContainer = new MoreEqualsDescr(");
                      Expression _left_3 = _comparisonImpl.getLeft();
                      CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                      _builder.append(_compileTerminalLeft_1, "");
                      _builder.append(",");
                      Expression _right_2 = _comparisonImpl.getRight();
                      CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                      _builder.append(_compileRecExpr, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    Expression _left_4 = _comparisonImpl.getLeft();
                    EClass _eClass_3 = _left_4.eClass();
                    String _name_3 = _eClass_3.getName();
                    boolean _contains_3 = _name_3.contains("Constant");
                    boolean _not = (!_contains_3);
                    if (_not) {
                      _builder.append("condContainer = new MoreEqualsDescr(");
                      Expression _left_5 = _comparisonImpl.getLeft();
                      CharSequence _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                      _builder.append(_compileRecExpr_1, "");
                      _builder.append(",");
                      Expression _right_3 = _comparisonImpl.getRight();
                      CharSequence _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                      _builder.append(_compileRecExpr_2, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              _builder.append("expContext.set");
              _builder.append(condType, "");
              _builder.append("Condition(condContainer);\t\t\t\t");
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            } else {
              String _op_1 = _comparisonImpl.getOp();
              boolean _equals_1 = _op_1.equals("<=");
              if (_equals_1) {
                {
                  boolean _and_1 = false;
                  Expression _left_6 = _comparisonImpl.getLeft();
                  EClass _eClass_4 = _left_6.eClass();
                  String _name_4 = _eClass_4.getName();
                  boolean _contains_4 = _name_4.contains("Constant");
                  if (!_contains_4) {
                    _and_1 = false;
                  } else {
                    Expression _right_4 = _comparisonImpl.getRight();
                    EClass _eClass_5 = _right_4.eClass();
                    String _name_5 = _eClass_5.getName();
                    boolean _contains_5 = _name_5.contains("Constant");
                    _and_1 = (_contains_4 && _contains_5);
                  }
                  if (_and_1) {
                    _builder.append("condContainer = new LessEqualsDescr( ");
                    Expression _left_7 = _comparisonImpl.getLeft();
                    CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_7), statement);
                    _builder.append(_compileTerminalLeft_2, "");
                    _builder.append(",");
                    Expression _right_5 = _comparisonImpl.getRight();
                    CharSequence _compileTerminalRight_1 = this.compileTerminalRight(((ExpressionImpl) _right_5), statement);
                    _builder.append(_compileTerminalRight_1, "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      Expression _left_8 = _comparisonImpl.getLeft();
                      EClass _eClass_6 = _left_8.eClass();
                      String _name_6 = _eClass_6.getName();
                      boolean _contains_6 = _name_6.contains("Constant");
                      if (_contains_6) {
                        _builder.append("condContainer = new LessEqualsDescr(");
                        Expression _left_9 = _comparisonImpl.getLeft();
                        CharSequence _compileTerminalLeft_3 = this.compileTerminalLeft(((ExpressionImpl) _left_9), statement);
                        _builder.append(_compileTerminalLeft_3, "");
                        _builder.append(",");
                        Expression _right_6 = _comparisonImpl.getRight();
                        CharSequence _compileRecExpr_3 = this.compileRecExpr(((ExpressionImpl) _right_6), statement);
                        _builder.append(_compileRecExpr_3, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    {
                      Expression _left_10 = _comparisonImpl.getLeft();
                      EClass _eClass_7 = _left_10.eClass();
                      String _name_7 = _eClass_7.getName();
                      boolean _contains_7 = _name_7.contains("Constant");
                      boolean _not_1 = (!_contains_7);
                      if (_not_1) {
                        _builder.append("condContainer = new LessEqualsDescr(");
                        Expression _left_11 = _comparisonImpl.getLeft();
                        CharSequence _compileRecExpr_4 = this.compileRecExpr(((ExpressionImpl) _left_11), statement);
                        _builder.append(_compileRecExpr_4, "");
                        _builder.append(",");
                        Expression _right_7 = _comparisonImpl.getRight();
                        CharSequence _compileRecExpr_5 = this.compileRecExpr(((ExpressionImpl) _right_7), statement);
                        _builder.append(_compileRecExpr_5, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                _builder.append("expContext.set");
                _builder.append(condType, "");
                _builder.append("Condition(condContainer);");
                _builder.newLineIfNotEmpty();
                _builder.newLine();
              } else {
                String _op_2 = _comparisonImpl.getOp();
                boolean _equals_2 = _op_2.equals(">");
                if (_equals_2) {
                  {
                    boolean _and_2 = false;
                    Expression _left_12 = _comparisonImpl.getLeft();
                    EClass _eClass_8 = _left_12.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _contains_8 = _name_8.contains("Constant");
                    if (!_contains_8) {
                      _and_2 = false;
                    } else {
                      Expression _right_8 = _comparisonImpl.getRight();
                      EClass _eClass_9 = _right_8.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _contains_9 = _name_9.contains("Constant");
                      _and_2 = (_contains_8 && _contains_9);
                    }
                    if (_and_2) {
                      _builder.append("condContainer = new MoreDescr( ");
                      Expression _left_13 = _comparisonImpl.getLeft();
                      CharSequence _compileTerminalLeft_4 = this.compileTerminalLeft(((ExpressionImpl) _left_13), statement);
                      _builder.append(_compileTerminalLeft_4, "");
                      _builder.append(",");
                      Expression _right_9 = _comparisonImpl.getRight();
                      CharSequence _compileTerminalRight_2 = this.compileTerminalRight(((ExpressionImpl) _right_9), statement);
                      _builder.append(_compileTerminalRight_2, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      {
                        Expression _left_14 = _comparisonImpl.getLeft();
                        EClass _eClass_10 = _left_14.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _contains_10 = _name_10.contains("Constant");
                        if (_contains_10) {
                          _builder.append("condContainer = new MoreDescr(");
                          Expression _left_15 = _comparisonImpl.getLeft();
                          CharSequence _compileTerminalLeft_5 = this.compileTerminalLeft(((ExpressionImpl) _left_15), statement);
                          _builder.append(_compileTerminalLeft_5, "");
                          _builder.append(",");
                          Expression _right_10 = _comparisonImpl.getRight();
                          CharSequence _compileRecExpr_6 = this.compileRecExpr(((ExpressionImpl) _right_10), statement);
                          _builder.append(_compileRecExpr_6, "");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      {
                        Expression _left_16 = _comparisonImpl.getLeft();
                        EClass _eClass_11 = _left_16.eClass();
                        String _name_11 = _eClass_11.getName();
                        boolean _contains_11 = _name_11.contains("Constant");
                        boolean _not_2 = (!_contains_11);
                        if (_not_2) {
                          _builder.append("condContainer = new MoreDescr(");
                          Expression _left_17 = _comparisonImpl.getLeft();
                          CharSequence _compileRecExpr_7 = this.compileRecExpr(((ExpressionImpl) _left_17), statement);
                          _builder.append(_compileRecExpr_7, "");
                          _builder.append(",");
                          Expression _right_11 = _comparisonImpl.getRight();
                          CharSequence _compileRecExpr_8 = this.compileRecExpr(((ExpressionImpl) _right_11), statement);
                          _builder.append(_compileRecExpr_8, "");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                  _builder.append("expContext.set");
                  _builder.append(condType, "");
                  _builder.append("Condition(condContainer);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.newLine();
                } else {
                  {
                    boolean _and_3 = false;
                    Expression _left_18 = _comparisonImpl.getLeft();
                    EClass _eClass_12 = _left_18.eClass();
                    String _name_12 = _eClass_12.getName();
                    boolean _contains_12 = _name_12.contains("Constant");
                    if (!_contains_12) {
                      _and_3 = false;
                    } else {
                      Expression _right_12 = _comparisonImpl.getRight();
                      EClass _eClass_13 = _right_12.eClass();
                      String _name_13 = _eClass_13.getName();
                      boolean _contains_13 = _name_13.contains("Constant");
                      _and_3 = (_contains_12 && _contains_13);
                    }
                    if (_and_3) {
                      _builder.append("condContainer = new LessDescr(");
                      Expression _left_19 = _comparisonImpl.getLeft();
                      CharSequence _compileTerminalLeft_6 = this.compileTerminalLeft(((ExpressionImpl) _left_19), statement);
                      _builder.append(_compileTerminalLeft_6, "");
                      _builder.append(",");
                      Expression _right_13 = _comparisonImpl.getRight();
                      CharSequence _compileTerminalRight_3 = this.compileTerminalRight(((ExpressionImpl) _right_13), statement);
                      _builder.append(_compileTerminalRight_3, "");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    } else {
                      {
                        Expression _left_20 = _comparisonImpl.getLeft();
                        EClass _eClass_14 = _left_20.eClass();
                        String _name_14 = _eClass_14.getName();
                        boolean _contains_14 = _name_14.contains("Constant");
                        if (_contains_14) {
                          _builder.append("condContainer = new LessDescr(");
                          Expression _left_21 = _comparisonImpl.getLeft();
                          CharSequence _compileTerminalLeft_7 = this.compileTerminalLeft(((ExpressionImpl) _left_21), statement);
                          _builder.append(_compileTerminalLeft_7, "");
                          _builder.append(",");
                          Expression _right_14 = _comparisonImpl.getRight();
                          CharSequence _compileRecExpr_9 = this.compileRecExpr(((ExpressionImpl) _right_14), statement);
                          _builder.append(_compileRecExpr_9, "");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                      {
                        Expression _left_22 = _comparisonImpl.getLeft();
                        EClass _eClass_15 = _left_22.eClass();
                        String _name_15 = _eClass_15.getName();
                        boolean _contains_15 = _name_15.contains("Constant");
                        boolean _not_3 = (!_contains_15);
                        if (_not_3) {
                          _builder.append("condContainer = new LessDescr(");
                          Expression _left_23 = _comparisonImpl.getLeft();
                          CharSequence _compileRecExpr_10 = this.compileRecExpr(((ExpressionImpl) _left_23), statement);
                          _builder.append(_compileRecExpr_10, "");
                          _builder.append(",");
                          Expression _right_15 = _comparisonImpl.getRight();
                          CharSequence _compileRecExpr_11 = this.compileRecExpr(((ExpressionImpl) _right_15), statement);
                          _builder.append(_compileRecExpr_11, "");
                          _builder.append(");");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                  _builder.newLine();
                  _builder.append("expContext.set");
                  _builder.append(condType, "");
                  _builder.append("Condition(condContainer);\t\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _switchResult = _builder;
        }
      }
      if (!_matched) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("//default compileCond");
        _builder.newLine();
        _builder.append("//TYPE OF condExpr IS---> ");
        EClass _eClass = cond.eClass();
        String _name = _eClass.getName();
        _builder.append(_name, "");
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
      _xblockexpression = (_switchResult);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _compileTerminalLeft(final ExpressionImpl term, final Statement statement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (term instanceof IntConstantImpl) {
        final IntConstantImpl _intConstantImpl = (IntConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        int _value = _intConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof FloatConstantImpl) {
        final FloatConstantImpl _floatConstantImpl = (FloatConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        float _value = _floatConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof BoolConstantImpl) {
        final BoolConstantImpl _boolConstantImpl = (BoolConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        String _value = _boolConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _compileTerminalRight(final ExpressionImpl term, final Statement statement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (term instanceof IntConstantImpl) {
        final IntConstantImpl _intConstantImpl = (IntConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        int _value = _intConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof FloatConstantImpl) {
        final FloatConstantImpl _floatConstantImpl = (FloatConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        float _value = _floatConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof BoolConstantImpl) {
        final BoolConstantImpl _boolConstantImpl = (BoolConstantImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new NumberDescr(");
        String _value = _boolConstantImpl.getValue();
        _builder.append(_value, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _compileTerminalLeft(final ReferenceTypeImpl term, final Statement statement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (term instanceof EventFeatureImpl) {
        final EventFeatureImpl _eventFeatureImpl = (EventFeatureImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Event _event = statement.getEvent();
        EList<EventFeature> _params = _event.getParams();
        String _name = _eventFeatureImpl.getName();
        int _retrieveParam = this.retrieveParam(_name, statement);
        EventFeature _get = _params.get(_retrieveParam);
        String _name_1 = _get.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof FluentImpl) {
        final FluentImpl _fluentImpl = (FluentImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new SampleDescr(");
        String _name = _fluentImpl.getName();
        _builder.append(_name, "");
        _builder.append(")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _compileTerminalRight(final ReferenceTypeImpl term, final Statement statement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (term instanceof EventFeatureImpl) {
        final EventFeatureImpl _eventFeatureImpl = (EventFeatureImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        Event _event = statement.getEvent();
        EList<EventFeature> _params = _event.getParams();
        String _name = _eventFeatureImpl.getName();
        int _retrieveParam = this.retrieveParam(_name, statement);
        EventFeature _get = _params.get(_retrieveParam);
        String _name_1 = _get.getName();
        _builder.append(_name_1, "");
        _builder.newLineIfNotEmpty();
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (term instanceof FluentImpl) {
        final FluentImpl _fluentImpl = (FluentImpl)term;
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("new SampleDescr(\"");
        String _name = _fluentImpl.getName();
        _builder.append(_name, "");
        _builder.append("\")");
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public int retrieveParam(final String paramName, final Statement statement) {
    int paramNumTemp = 100;
    Event _event = statement.getEvent();
    EList<EventFeature> _params = _event.getParams();
    for (final EventFeature p : _params) {
      String _name = p.getName();
      boolean _equals = _name.equals(paramName);
      if (_equals) {
        Event _event_1 = statement.getEvent();
        EList<EventFeature> _params_1 = _event_1.getParams();
        int _indexOf = _params_1.indexOf(p);
        paramNumTemp = _indexOf;
      }
    }
    return paramNumTemp;
  }
  
  protected CharSequence _compileRecExpr(final NotImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expression _expression = conditionExpr.getExpression();
      EClass _eClass = _expression.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Constant");
      if (_contains) {
        _builder.append("new NotDescr( ");
        Expression _expression_1 = conditionExpr.getExpression();
        CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _expression_1), statement);
        _builder.append(_compileTerminalLeft, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("new NotDescr(");
        Expression _expression_2 = conditionExpr.getExpression();
        Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _expression_2), statement);
        _builder.append(_compileRecExpr, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final OrImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Expression _left = conditionExpr.getLeft();
      EClass _eClass = _left.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Constant");
      if (!_contains) {
        _and = false;
      } else {
        Expression _right = conditionExpr.getRight();
        EClass _eClass_1 = _right.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _contains_1 = _name_1.contains("Constant");
        _and = (_contains && _contains_1);
      }
      if (_and) {
        _builder.append("new OrDescr( ");
        Expression _left_1 = conditionExpr.getLeft();
        CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
        _builder.append(_compileTerminalLeft, "");
        _builder.append(",");
        Expression _right_1 = conditionExpr.getRight();
        CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _right_1), statement);
        _builder.append(_compileTerminalLeft_1, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Expression _left_2 = conditionExpr.getLeft();
          EClass _eClass_2 = _left_2.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _contains_2 = _name_2.contains("Constant");
          if (_contains_2) {
            _builder.append("new OrDescr(");
            Expression _left_3 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
            _builder.append(_compileTerminalLeft_2, "");
            _builder.append(",");
            Expression _right_2 = conditionExpr.getRight();
            Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
            _builder.append(_compileRecExpr, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Expression _left_4 = conditionExpr.getLeft();
          EClass _eClass_3 = _left_4.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _contains_3 = _name_3.contains("Constant");
          boolean _not = (!_contains_3);
          if (_not) {
            _builder.append("new OrDescr(");
            Expression _left_5 = conditionExpr.getLeft();
            Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
            _builder.append(_compileRecExpr_1, "");
            _builder.append(",");
            Expression _right_3 = conditionExpr.getRight();
            Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
            _builder.append(_compileRecExpr_2, "");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final AndImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Expression _left = conditionExpr.getLeft();
      EClass _eClass = _left.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Constant");
      if (!_contains) {
        _and = false;
      } else {
        Expression _right = conditionExpr.getRight();
        EClass _eClass_1 = _right.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _contains_1 = _name_1.contains("Constant");
        _and = (_contains && _contains_1);
      }
      if (_and) {
        _builder.append("new AndDescr( ");
        Expression _left_1 = conditionExpr.getLeft();
        CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
        _builder.append(_compileTerminalLeft, "");
        _builder.append(",");
        Expression _right_1 = conditionExpr.getRight();
        CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
        _builder.append(_compileTerminalRight, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Expression _left_2 = conditionExpr.getLeft();
          EClass _eClass_2 = _left_2.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _contains_2 = _name_2.contains("Constant");
          if (_contains_2) {
            _builder.append("new AndDescr(");
            Expression _left_3 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
            _builder.append(_compileTerminalLeft_1, "");
            _builder.append(",");
            Expression _right_2 = conditionExpr.getRight();
            Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
            _builder.append(_compileRecExpr, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Expression _left_4 = conditionExpr.getLeft();
          EClass _eClass_3 = _left_4.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _contains_3 = _name_3.contains("Constant");
          boolean _not = (!_contains_3);
          if (_not) {
            _builder.append("new AndDescr(");
            Expression _left_5 = conditionExpr.getLeft();
            Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
            _builder.append(_compileRecExpr_1, "");
            _builder.append(",");
            Expression _right_3 = conditionExpr.getRight();
            Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
            _builder.append(_compileRecExpr_2, "");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final EqualityImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = conditionExpr.getOp();
      boolean _equals = _op.equals("==");
      if (_equals) {
        {
          boolean _and = false;
          Expression _left = conditionExpr.getLeft();
          EClass _eClass = _left.eClass();
          String _name = _eClass.getName();
          boolean _contains = _name.contains("Constant");
          if (!_contains) {
            _and = false;
          } else {
            Expression _right = conditionExpr.getRight();
            EClass _eClass_1 = _right.eClass();
            String _name_1 = _eClass_1.getName();
            boolean _contains_1 = _name_1.contains("Constant");
            _and = (_contains && _contains_1);
          }
          if (_and) {
            _builder.append("new SameDescr( ");
            Expression _left_1 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
            _builder.append(_compileTerminalLeft, "");
            _builder.append(",");
            Expression _right_1 = conditionExpr.getRight();
            CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
            _builder.append(_compileTerminalRight, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            {
              Expression _left_2 = conditionExpr.getLeft();
              EClass _eClass_2 = _left_2.eClass();
              String _name_2 = _eClass_2.getName();
              boolean _contains_2 = _name_2.contains("Constant");
              if (_contains_2) {
                _builder.append("new SameDescr(");
                Expression _left_3 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                _builder.append(_compileTerminalLeft_1, "");
                _builder.append(",");
                _builder.newLineIfNotEmpty();
                Expression _right_2 = conditionExpr.getRight();
                Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                _builder.append(_compileRecExpr, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Expression _left_4 = conditionExpr.getLeft();
              EClass _eClass_3 = _left_4.eClass();
              String _name_3 = _eClass_3.getName();
              boolean _contains_3 = _name_3.contains("Constant");
              boolean _not = (!_contains_3);
              if (_not) {
                _builder.append("new SameDescr(");
                Expression _left_5 = conditionExpr.getLeft();
                Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                _builder.append(_compileRecExpr_1, "");
                _builder.append(",");
                _builder.newLineIfNotEmpty();
                Expression _right_3 = conditionExpr.getRight();
                Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                _builder.append(_compileRecExpr_2, "");
                _builder.append(")");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        String _op_1 = conditionExpr.getOp();
        boolean _equals_1 = _op_1.equals("!=");
        if (_equals_1) {
          {
            boolean _and_1 = false;
            Expression _left_6 = conditionExpr.getLeft();
            EClass _eClass_4 = _left_6.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _contains_4 = _name_4.contains("Constant");
            if (!_contains_4) {
              _and_1 = false;
            } else {
              Expression _right_4 = conditionExpr.getRight();
              EClass _eClass_5 = _right_4.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _contains_5 = _name_5.contains("Constant");
              _and_1 = (_contains_4 && _contains_5);
            }
            if (_and_1) {
              _builder.append("new DifferentDescr( ");
              Expression _left_7 = conditionExpr.getLeft();
              CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_7), statement);
              _builder.append(_compileTerminalLeft_2, "");
              _builder.append(",");
              Expression _right_5 = conditionExpr.getRight();
              CharSequence _compileTerminalLeft_3 = this.compileTerminalLeft(((ExpressionImpl) _right_5), statement);
              _builder.append(_compileTerminalLeft_3, "");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              {
                Expression _left_8 = conditionExpr.getLeft();
                EClass _eClass_6 = _left_8.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _contains_6 = _name_6.contains("Constant");
                if (_contains_6) {
                  _builder.append("new DifferentDescr(");
                  Expression _left_9 = conditionExpr.getLeft();
                  CharSequence _compileTerminalLeft_4 = this.compileTerminalLeft(((ExpressionImpl) _left_9), statement);
                  _builder.append(_compileTerminalLeft_4, "");
                  _builder.append(",");
                  Expression _right_6 = conditionExpr.getRight();
                  Object _compileRecExpr_3 = this.compileRecExpr(((ExpressionImpl) _right_6), statement);
                  _builder.append(_compileRecExpr_3, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Expression _left_10 = conditionExpr.getLeft();
                EClass _eClass_7 = _left_10.eClass();
                String _name_7 = _eClass_7.getName();
                boolean _contains_7 = _name_7.contains("Constant");
                boolean _not_1 = (!_contains_7);
                if (_not_1) {
                  _builder.append("new DifferentDescr(");
                  Expression _left_11 = conditionExpr.getLeft();
                  Object _compileRecExpr_4 = this.compileRecExpr(((ExpressionImpl) _left_11), statement);
                  _builder.append(_compileRecExpr_4, "");
                  _builder.append(",");
                  Expression _right_7 = conditionExpr.getRight();
                  Object _compileRecExpr_5 = this.compileRecExpr(((ExpressionImpl) _right_7), statement);
                  _builder.append(_compileRecExpr_5, "");
                  _builder.append(")");
                }
              }
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final ComparisonImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = conditionExpr.getOp();
      boolean _equals = _op.equals(">=");
      if (_equals) {
        {
          boolean _and = false;
          Expression _left = conditionExpr.getLeft();
          EClass _eClass = _left.eClass();
          String _name = _eClass.getName();
          boolean _contains = _name.contains("Constant");
          if (!_contains) {
            _and = false;
          } else {
            Expression _right = conditionExpr.getRight();
            EClass _eClass_1 = _right.eClass();
            String _name_1 = _eClass_1.getName();
            boolean _contains_1 = _name_1.contains("Constant");
            _and = (_contains && _contains_1);
          }
          if (_and) {
            _builder.append("new MoreEqualsDescr( ");
            Expression _left_1 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
            _builder.append(_compileTerminalLeft, "");
            _builder.append(",");
            Expression _right_1 = conditionExpr.getRight();
            CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _right_1), statement);
            _builder.append(_compileTerminalLeft_1, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            {
              Expression _left_2 = conditionExpr.getLeft();
              EClass _eClass_2 = _left_2.eClass();
              String _name_2 = _eClass_2.getName();
              boolean _contains_2 = _name_2.contains("Constant");
              if (_contains_2) {
                _builder.append("new MoreEqualsDescr(");
                Expression _left_3 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                _builder.append(_compileTerminalLeft_2, "");
                _builder.append(",");
                _builder.newLineIfNotEmpty();
                Expression _right_2 = conditionExpr.getRight();
                Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                _builder.append(_compileRecExpr, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Expression _left_4 = conditionExpr.getLeft();
              EClass _eClass_3 = _left_4.eClass();
              String _name_3 = _eClass_3.getName();
              boolean _contains_3 = _name_3.contains("Constant");
              boolean _not = (!_contains_3);
              if (_not) {
                _builder.append("new MoreEqualsDescr(");
                Expression _left_5 = conditionExpr.getLeft();
                Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                _builder.append(_compileRecExpr_1, "");
                _builder.append(",");
                _builder.newLineIfNotEmpty();
                Expression _right_3 = conditionExpr.getRight();
                Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                _builder.append(_compileRecExpr_2, "");
                _builder.append(")");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        String _op_1 = conditionExpr.getOp();
        boolean _equals_1 = _op_1.equals("<=");
        if (_equals_1) {
          {
            boolean _and_1 = false;
            Expression _left_6 = conditionExpr.getLeft();
            EClass _eClass_4 = _left_6.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _contains_4 = _name_4.contains("Constant");
            if (!_contains_4) {
              _and_1 = false;
            } else {
              Expression _right_4 = conditionExpr.getRight();
              EClass _eClass_5 = _right_4.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _contains_5 = _name_5.contains("Constant");
              _and_1 = (_contains_4 && _contains_5);
            }
            if (_and_1) {
              _builder.append("new LessEqualsDescr( ");
              Expression _left_7 = conditionExpr.getLeft();
              CharSequence _compileTerminalLeft_3 = this.compileTerminalLeft(((ExpressionImpl) _left_7), statement);
              _builder.append(_compileTerminalLeft_3, "");
              _builder.append(",");
              Expression _right_5 = conditionExpr.getRight();
              CharSequence _compileTerminalLeft_4 = this.compileTerminalLeft(((ExpressionImpl) _right_5), statement);
              _builder.append(_compileTerminalLeft_4, "");
              _builder.append(")");
              _builder.newLineIfNotEmpty();
            } else {
              {
                Expression _left_8 = conditionExpr.getLeft();
                EClass _eClass_6 = _left_8.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _contains_6 = _name_6.contains("Constant");
                if (_contains_6) {
                  _builder.append("new LessEqualsDescr(");
                  Expression _left_9 = conditionExpr.getLeft();
                  CharSequence _compileTerminalLeft_5 = this.compileTerminalLeft(((ExpressionImpl) _left_9), statement);
                  _builder.append(_compileTerminalLeft_5, "");
                  _builder.append(",");
                  _builder.newLineIfNotEmpty();
                  Expression _right_6 = conditionExpr.getRight();
                  Object _compileRecExpr_3 = this.compileRecExpr(((ExpressionImpl) _right_6), statement);
                  _builder.append(_compileRecExpr_3, "");
                  _builder.append(")");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                Expression _left_10 = conditionExpr.getLeft();
                EClass _eClass_7 = _left_10.eClass();
                String _name_7 = _eClass_7.getName();
                boolean _contains_7 = _name_7.contains("Constant");
                boolean _not_1 = (!_contains_7);
                if (_not_1) {
                  _builder.append("new LessEqualsDescr(");
                  Expression _left_11 = conditionExpr.getLeft();
                  Object _compileRecExpr_4 = this.compileRecExpr(((ExpressionImpl) _left_11), statement);
                  _builder.append(_compileRecExpr_4, "");
                  _builder.append(",");
                  _builder.newLineIfNotEmpty();
                  Expression _right_7 = conditionExpr.getRight();
                  Object _compileRecExpr_5 = this.compileRecExpr(((ExpressionImpl) _right_7), statement);
                  _builder.append(_compileRecExpr_5, "");
                  _builder.append(")");
                }
              }
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          String _op_2 = conditionExpr.getOp();
          boolean _equals_2 = _op_2.equals(">");
          if (_equals_2) {
            {
              boolean _and_2 = false;
              Expression _left_12 = conditionExpr.getLeft();
              EClass _eClass_8 = _left_12.eClass();
              String _name_8 = _eClass_8.getName();
              boolean _contains_8 = _name_8.contains("Constant");
              if (!_contains_8) {
                _and_2 = false;
              } else {
                Expression _right_8 = conditionExpr.getRight();
                EClass _eClass_9 = _right_8.eClass();
                String _name_9 = _eClass_9.getName();
                boolean _contains_9 = _name_9.contains("Constant");
                _and_2 = (_contains_8 && _contains_9);
              }
              if (_and_2) {
                _builder.append("new MoreDescr( ");
                Expression _left_13 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_6 = this.compileTerminalLeft(((ExpressionImpl) _left_13), statement);
                _builder.append(_compileTerminalLeft_6, "");
                _builder.append(",");
                Expression _right_9 = conditionExpr.getRight();
                CharSequence _compileTerminalLeft_7 = this.compileTerminalLeft(((ExpressionImpl) _right_9), statement);
                _builder.append(_compileTerminalLeft_7, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  Expression _left_14 = conditionExpr.getLeft();
                  EClass _eClass_10 = _left_14.eClass();
                  String _name_10 = _eClass_10.getName();
                  boolean _contains_10 = _name_10.contains("Constant");
                  if (_contains_10) {
                    _builder.append("new MoreDescr(");
                    Expression _left_15 = conditionExpr.getLeft();
                    CharSequence _compileTerminalLeft_8 = this.compileTerminalLeft(((ExpressionImpl) _left_15), statement);
                    _builder.append(_compileTerminalLeft_8, "");
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    Expression _right_10 = conditionExpr.getRight();
                    Object _compileRecExpr_6 = this.compileRecExpr(((ExpressionImpl) _right_10), statement);
                    _builder.append(_compileRecExpr_6, "");
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Expression _left_16 = conditionExpr.getLeft();
                  EClass _eClass_11 = _left_16.eClass();
                  String _name_11 = _eClass_11.getName();
                  boolean _contains_11 = _name_11.contains("Constant");
                  boolean _not_2 = (!_contains_11);
                  if (_not_2) {
                    _builder.append("new MoreDescr(");
                    Expression _left_17 = conditionExpr.getLeft();
                    Object _compileRecExpr_7 = this.compileRecExpr(((ExpressionImpl) _left_17), statement);
                    _builder.append(_compileRecExpr_7, "");
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    Expression _right_11 = conditionExpr.getRight();
                    Object _compileRecExpr_8 = this.compileRecExpr(((ExpressionImpl) _right_11), statement);
                    _builder.append(_compileRecExpr_8, "");
                    _builder.append(")");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              boolean _and_3 = false;
              Expression _left_18 = conditionExpr.getLeft();
              EClass _eClass_12 = _left_18.eClass();
              String _name_12 = _eClass_12.getName();
              boolean _contains_12 = _name_12.contains("Constant");
              if (!_contains_12) {
                _and_3 = false;
              } else {
                Expression _right_12 = conditionExpr.getRight();
                EClass _eClass_13 = _right_12.eClass();
                String _name_13 = _eClass_13.getName();
                boolean _contains_13 = _name_13.contains("Constant");
                _and_3 = (_contains_12 && _contains_13);
              }
              if (_and_3) {
                _builder.append("new LessDescr( ");
                Expression _left_19 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_9 = this.compileTerminalLeft(((ExpressionImpl) _left_19), statement);
                _builder.append(_compileTerminalLeft_9, "");
                _builder.append(",");
                Expression _right_13 = conditionExpr.getRight();
                CharSequence _compileTerminalLeft_10 = this.compileTerminalLeft(((ExpressionImpl) _right_13), statement);
                _builder.append(_compileTerminalLeft_10, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  Expression _left_20 = conditionExpr.getLeft();
                  EClass _eClass_14 = _left_20.eClass();
                  String _name_14 = _eClass_14.getName();
                  boolean _contains_14 = _name_14.contains("Constant");
                  if (_contains_14) {
                    _builder.append("new LessDescr(");
                    Expression _left_21 = conditionExpr.getLeft();
                    CharSequence _compileTerminalLeft_11 = this.compileTerminalLeft(((ExpressionImpl) _left_21), statement);
                    _builder.append(_compileTerminalLeft_11, "");
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    Expression _right_14 = conditionExpr.getRight();
                    Object _compileRecExpr_9 = this.compileRecExpr(((ExpressionImpl) _right_14), statement);
                    _builder.append(_compileRecExpr_9, "");
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  Expression _left_22 = conditionExpr.getLeft();
                  EClass _eClass_15 = _left_22.eClass();
                  String _name_15 = _eClass_15.getName();
                  boolean _contains_15 = _name_15.contains("Constant");
                  boolean _not_3 = (!_contains_15);
                  if (_not_3) {
                    _builder.append("new LessDescr(");
                    Expression _left_23 = conditionExpr.getLeft();
                    Object _compileRecExpr_10 = this.compileRecExpr(((ExpressionImpl) _left_23), statement);
                    _builder.append(_compileRecExpr_10, "");
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    Expression _right_15 = conditionExpr.getRight();
                    Object _compileRecExpr_11 = this.compileRecExpr(((ExpressionImpl) _right_15), statement);
                    _builder.append(_compileRecExpr_11, "");
                    _builder.append(")");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final IntConstantImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new NumberDescr(");
    int _value = conditionExpr.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final FloatConstantImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new NumberDescr(");
    float _value = conditionExpr.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final BoolConstantImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new NumberDescr(");
    String _value = conditionExpr.getValue();
    _builder.append(_value, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final ReferenceImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ReferenceType _ref = conditionExpr.getRef();
      EClass _eClass = _ref.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Feature");
      if (_contains) {
        Event _event = statement.getEvent();
        EList<EventFeature> _params = _event.getParams();
        ReferenceType _ref_1 = conditionExpr.getRef();
        String _name_1 = _ref_1.getName();
        int _retrieveParam = this.retrieveParam(_name_1, statement);
        EventFeature _get = _params.get(_retrieveParam);
        String _name_2 = _get.getName();
        _builder.append(_name_2, "");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("new SampleDescr(\"");
        ReferenceType _ref_2 = conditionExpr.getRef();
        String _name_3 = _ref_2.getName();
        _builder.append(_name_3, "");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final PlusImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Expression _left = conditionExpr.getLeft();
      EClass _eClass = _left.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Constant");
      if (!_contains) {
        _and = false;
      } else {
        Expression _right = conditionExpr.getRight();
        EClass _eClass_1 = _right.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _contains_1 = _name_1.contains("Constant");
        _and = (_contains && _contains_1);
      }
      if (_and) {
        _builder.append("new PlusDescr( ");
        Expression _left_1 = conditionExpr.getLeft();
        CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
        _builder.append(_compileTerminalLeft, "");
        _builder.append(",");
        Expression _right_1 = conditionExpr.getRight();
        CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
        _builder.append(_compileTerminalRight, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Expression _left_2 = conditionExpr.getLeft();
          EClass _eClass_2 = _left_2.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _contains_2 = _name_2.contains("Constant");
          if (_contains_2) {
            _builder.append("new PlusDescr(");
            Expression _left_3 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
            _builder.append(_compileTerminalLeft_1, "");
            _builder.append(",");
            Expression _right_2 = conditionExpr.getRight();
            Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
            _builder.append(_compileRecExpr, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Expression _left_4 = conditionExpr.getLeft();
          EClass _eClass_3 = _left_4.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _contains_3 = _name_3.contains("Constant");
          boolean _not = (!_contains_3);
          if (_not) {
            _builder.append("new PlusDescr(");
            Expression _left_5 = conditionExpr.getLeft();
            Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
            _builder.append(_compileRecExpr_1, "");
            _builder.append(",");
            Expression _right_3 = conditionExpr.getRight();
            Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
            _builder.append(_compileRecExpr_2, "");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final MinusImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      Expression _left = conditionExpr.getLeft();
      EClass _eClass = _left.eClass();
      String _name = _eClass.getName();
      boolean _contains = _name.contains("Constant");
      if (!_contains) {
        _and = false;
      } else {
        Expression _right = conditionExpr.getRight();
        EClass _eClass_1 = _right.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _contains_1 = _name_1.contains("Constant");
        _and = (_contains && _contains_1);
      }
      if (_and) {
        _builder.append("new MinusDescr( ");
        Expression _left_1 = conditionExpr.getLeft();
        CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
        _builder.append(_compileTerminalLeft, "");
        _builder.append(",");
        Expression _right_1 = conditionExpr.getRight();
        CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
        _builder.append(_compileTerminalRight, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        {
          Expression _left_2 = conditionExpr.getLeft();
          EClass _eClass_2 = _left_2.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _contains_2 = _name_2.contains("Constant");
          if (_contains_2) {
            _builder.append("new MinusDescr(");
            Expression _left_3 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
            _builder.append(_compileTerminalLeft_1, "");
            _builder.append(",");
            Expression _right_2 = conditionExpr.getRight();
            Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
            _builder.append(_compileRecExpr, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Expression _left_4 = conditionExpr.getLeft();
          EClass _eClass_3 = _left_4.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _contains_3 = _name_3.contains("Constant");
          boolean _not = (!_contains_3);
          if (_not) {
            _builder.append("new MinusDescr(");
            Expression _left_5 = conditionExpr.getLeft();
            Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
            _builder.append(_compileRecExpr_1, "");
            _builder.append(",");
            Expression _right_3 = conditionExpr.getRight();
            Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
            _builder.append(_compileRecExpr_2, "");
            _builder.append(")");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _compileRecExpr(final MulOrDivImpl conditionExpr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = conditionExpr.getOp();
      boolean _equals = _op.equals("*");
      if (_equals) {
        {
          boolean _and = false;
          Expression _left = conditionExpr.getLeft();
          EClass _eClass = _left.eClass();
          String _name = _eClass.getName();
          boolean _contains = _name.contains("Constant");
          if (!_contains) {
            _and = false;
          } else {
            Expression _right = conditionExpr.getRight();
            EClass _eClass_1 = _right.eClass();
            String _name_1 = _eClass_1.getName();
            boolean _contains_1 = _name_1.contains("Constant");
            _and = (_contains && _contains_1);
          }
          if (_and) {
            _builder.append("new MultDescr( ");
            Expression _left_1 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft = this.compileTerminalLeft(((ExpressionImpl) _left_1), statement);
            _builder.append(_compileTerminalLeft, "");
            _builder.append(",");
            Expression _right_1 = conditionExpr.getRight();
            CharSequence _compileTerminalRight = this.compileTerminalRight(((ExpressionImpl) _right_1), statement);
            _builder.append(_compileTerminalRight, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            {
              Expression _left_2 = conditionExpr.getLeft();
              EClass _eClass_2 = _left_2.eClass();
              String _name_2 = _eClass_2.getName();
              boolean _contains_2 = _name_2.contains("Constant");
              if (_contains_2) {
                _builder.append("new MultDescr(");
                Expression _left_3 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_1 = this.compileTerminalLeft(((ExpressionImpl) _left_3), statement);
                _builder.append(_compileTerminalLeft_1, "");
                _builder.append(",");
                Expression _right_2 = conditionExpr.getRight();
                Object _compileRecExpr = this.compileRecExpr(((ExpressionImpl) _right_2), statement);
                _builder.append(_compileRecExpr, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Expression _left_4 = conditionExpr.getLeft();
              EClass _eClass_3 = _left_4.eClass();
              String _name_3 = _eClass_3.getName();
              boolean _contains_3 = _name_3.contains("Constant");
              boolean _not = (!_contains_3);
              if (_not) {
                _builder.append("new MultDescr(");
                Expression _left_5 = conditionExpr.getLeft();
                Object _compileRecExpr_1 = this.compileRecExpr(((ExpressionImpl) _left_5), statement);
                _builder.append(_compileRecExpr_1, "");
                _builder.append(",");
                Expression _right_3 = conditionExpr.getRight();
                Object _compileRecExpr_2 = this.compileRecExpr(((ExpressionImpl) _right_3), statement);
                _builder.append(_compileRecExpr_2, "");
                _builder.append(")");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          boolean _and_1 = false;
          Expression _left_6 = conditionExpr.getLeft();
          EClass _eClass_4 = _left_6.eClass();
          String _name_4 = _eClass_4.getName();
          boolean _contains_4 = _name_4.contains("Constant");
          if (!_contains_4) {
            _and_1 = false;
          } else {
            Expression _right_4 = conditionExpr.getRight();
            EClass _eClass_5 = _right_4.eClass();
            String _name_5 = _eClass_5.getName();
            boolean _contains_5 = _name_5.contains("Constant");
            _and_1 = (_contains_4 && _contains_5);
          }
          if (_and_1) {
            _builder.append("new ObelusDescr( ");
            Expression _left_7 = conditionExpr.getLeft();
            CharSequence _compileTerminalLeft_2 = this.compileTerminalLeft(((ExpressionImpl) _left_7), statement);
            _builder.append(_compileTerminalLeft_2, "");
            _builder.append(",");
            Expression _right_5 = conditionExpr.getRight();
            CharSequence _compileTerminalRight_1 = this.compileTerminalRight(((ExpressionImpl) _right_5), statement);
            _builder.append(_compileTerminalRight_1, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            {
              Expression _left_8 = conditionExpr.getLeft();
              EClass _eClass_6 = _left_8.eClass();
              String _name_6 = _eClass_6.getName();
              boolean _contains_6 = _name_6.contains("Constant");
              if (_contains_6) {
                _builder.append("new ObelusDescr(");
                Expression _left_9 = conditionExpr.getLeft();
                CharSequence _compileTerminalLeft_3 = this.compileTerminalLeft(((ExpressionImpl) _left_9), statement);
                _builder.append(_compileTerminalLeft_3, "");
                _builder.append(",");
                Expression _right_6 = conditionExpr.getRight();
                Object _compileRecExpr_3 = this.compileRecExpr(((ExpressionImpl) _right_6), statement);
                _builder.append(_compileRecExpr_3, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              Expression _left_10 = conditionExpr.getLeft();
              EClass _eClass_7 = _left_10.eClass();
              String _name_7 = _eClass_7.getName();
              boolean _contains_7 = _name_7.contains("Constant");
              boolean _not_1 = (!_contains_7);
              if (_not_1) {
                _builder.append("new ObelusDescr(");
                Expression _left_11 = conditionExpr.getLeft();
                Object _compileRecExpr_4 = this.compileRecExpr(((ExpressionImpl) _left_11), statement);
                _builder.append(_compileRecExpr_4, "");
                _builder.append(",");
                Expression _right_7 = conditionExpr.getRight();
                Object _compileRecExpr_5 = this.compileRecExpr(((ExpressionImpl) _right_7), statement);
                _builder.append(_compileRecExpr_5, "");
                _builder.append(")");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileTime(final AllenOperatorImpl op, final ExpressionImpl expr, final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("time = new Time();");
    _builder.newLine();
    _builder.append("time.setllenOp(");
    String _value = op.getValue();
    _builder.append(_value, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("time.setTimeValue(");
    CharSequence _compileRecExpr = this.compileRecExpr(((ExpressionImpl) expr), statement);
    _builder.append(_compileRecExpr, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("expContext.setTime(time);");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileTerminalLeft(final Container term, final Statement statement) {
    if (term instanceof ExpressionImpl) {
      return _compileTerminalLeft((ExpressionImpl)term, statement);
    } else if (term instanceof ReferenceTypeImpl) {
      return _compileTerminalLeft((ReferenceTypeImpl)term, statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(term, statement).toString());
    }
  }
  
  public CharSequence compileTerminalRight(final Container term, final Statement statement) {
    if (term instanceof ExpressionImpl) {
      return _compileTerminalRight((ExpressionImpl)term, statement);
    } else if (term instanceof ReferenceTypeImpl) {
      return _compileTerminalRight((ReferenceTypeImpl)term, statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(term, statement).toString());
    }
  }
  
  public CharSequence compileRecExpr(final ExpressionImpl conditionExpr, final Statement statement) {
    if (conditionExpr instanceof AndImpl) {
      return _compileRecExpr((AndImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof BoolConstantImpl) {
      return _compileRecExpr((BoolConstantImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof ComparisonImpl) {
      return _compileRecExpr((ComparisonImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof EqualityImpl) {
      return _compileRecExpr((EqualityImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof FloatConstantImpl) {
      return _compileRecExpr((FloatConstantImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof IntConstantImpl) {
      return _compileRecExpr((IntConstantImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof MinusImpl) {
      return _compileRecExpr((MinusImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof MulOrDivImpl) {
      return _compileRecExpr((MulOrDivImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof NotImpl) {
      return _compileRecExpr((NotImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof OrImpl) {
      return _compileRecExpr((OrImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof PlusImpl) {
      return _compileRecExpr((PlusImpl)conditionExpr, statement);
    } else if (conditionExpr instanceof ReferenceImpl) {
      return _compileRecExpr((ReferenceImpl)conditionExpr, statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(conditionExpr, statement).toString());
    }
  }
}
