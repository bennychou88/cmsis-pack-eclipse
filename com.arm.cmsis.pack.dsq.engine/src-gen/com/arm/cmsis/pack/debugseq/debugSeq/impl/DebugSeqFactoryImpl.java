/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq.impl;

import com.arm.cmsis.pack.debugseq.debugSeq.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DebugSeqFactoryImpl extends EFactoryImpl implements DebugSeqFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DebugSeqFactory init()
  {
    try
    {
      DebugSeqFactory theDebugSeqFactory = (DebugSeqFactory)EPackage.Registry.INSTANCE.getEFactory(DebugSeqPackage.eNS_URI);
      if (theDebugSeqFactory != null)
      {
        return theDebugSeqFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DebugSeqFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugSeqFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DebugSeqPackage.DEBUG_SEQ_MODEL: return createDebugSeqModel();
      case DebugSeqPackage.DEBUG_VARS: return createDebugVars();
      case DebugSeqPackage.STATEMENT: return createStatement();
      case DebugSeqPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case DebugSeqPackage.SEQUENCES: return createSequences();
      case DebugSeqPackage.SEQUENCE: return createSequence();
      case DebugSeqPackage.CODE_BLOCK: return createCodeBlock();
      case DebugSeqPackage.BLOCK: return createBlock();
      case DebugSeqPackage.CONTROL: return createControl();
      case DebugSeqPackage.EXPRESSION: return createExpression();
      case DebugSeqPackage.PARAMETER: return createParameter();
      case DebugSeqPackage.ASSIGNMENT: return createAssignment();
      case DebugSeqPackage.TERNARY: return createTernary();
      case DebugSeqPackage.OR: return createOr();
      case DebugSeqPackage.AND: return createAnd();
      case DebugSeqPackage.BIT_OR: return createBitOr();
      case DebugSeqPackage.BIT_XOR: return createBitXor();
      case DebugSeqPackage.BIT_AND: return createBitAnd();
      case DebugSeqPackage.EQUALITY: return createEquality();
      case DebugSeqPackage.COMPARISON: return createComparison();
      case DebugSeqPackage.SHIFT: return createShift();
      case DebugSeqPackage.PLUS: return createPlus();
      case DebugSeqPackage.MINUS: return createMinus();
      case DebugSeqPackage.MUL: return createMul();
      case DebugSeqPackage.DIV: return createDiv();
      case DebugSeqPackage.REM: return createRem();
      case DebugSeqPackage.NOT: return createNot();
      case DebugSeqPackage.BIT_NOT: return createBitNot();
      case DebugSeqPackage.SEQUENCE_CALL: return createSequenceCall();
      case DebugSeqPackage.QUERY: return createQuery();
      case DebugSeqPackage.QUERY_VALUE: return createQueryValue();
      case DebugSeqPackage.MESSAGE: return createMessage();
      case DebugSeqPackage.LOAD_DEBUG_INFO: return createLoadDebugInfo();
      case DebugSeqPackage.READ8: return createRead8();
      case DebugSeqPackage.READ16: return createRead16();
      case DebugSeqPackage.READ32: return createRead32();
      case DebugSeqPackage.READ64: return createRead64();
      case DebugSeqPackage.READ_AP: return createReadAP();
      case DebugSeqPackage.READ_DP: return createReadDP();
      case DebugSeqPackage.WRITE8: return createWrite8();
      case DebugSeqPackage.WRITE16: return createWrite16();
      case DebugSeqPackage.WRITE32: return createWrite32();
      case DebugSeqPackage.WRITE64: return createWrite64();
      case DebugSeqPackage.WRITE_AP: return createWriteAP();
      case DebugSeqPackage.WRITE_DP: return createWriteDP();
      case DebugSeqPackage.DAP_DELAY: return createDapDelay();
      case DebugSeqPackage.DAP_WRITE_ABORT: return createDapWriteABORT();
      case DebugSeqPackage.DAP_SWJ_PINS: return createDapSwjPins();
      case DebugSeqPackage.DAP_SWJ_CLOCK: return createDapSwjClock();
      case DebugSeqPackage.DAP_SWJ_SEQUENCE: return createDapSwjSequence();
      case DebugSeqPackage.DAP_JTAG_SEQUENCE: return createDapJtagSequence();
      case DebugSeqPackage.INT_CONSTANT: return createIntConstant();
      case DebugSeqPackage.STRING_CONSTANT: return createStringConstant();
      case DebugSeqPackage.VARIABLE_REF: return createVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugSeqModel createDebugSeqModel()
  {
    DebugSeqModelImpl debugSeqModel = new DebugSeqModelImpl();
    return debugSeqModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugVars createDebugVars()
  {
    DebugVarsImpl debugVars = new DebugVarsImpl();
    return debugVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequences createSequences()
  {
    SequencesImpl sequences = new SequencesImpl();
    return sequences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeBlock createCodeBlock()
  {
    CodeBlockImpl codeBlock = new CodeBlockImpl();
    return codeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Control createControl()
  {
    ControlImpl control = new ControlImpl();
    return control;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ternary createTernary()
  {
    TernaryImpl ternary = new TernaryImpl();
    return ternary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitOr createBitOr()
  {
    BitOrImpl bitOr = new BitOrImpl();
    return bitOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitXor createBitXor()
  {
    BitXorImpl bitXor = new BitXorImpl();
    return bitXor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitAnd createBitAnd()
  {
    BitAndImpl bitAnd = new BitAndImpl();
    return bitAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shift createShift()
  {
    ShiftImpl shift = new ShiftImpl();
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rem createRem()
  {
    RemImpl rem = new RemImpl();
    return rem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitNot createBitNot()
  {
    BitNotImpl bitNot = new BitNotImpl();
    return bitNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceCall createSequenceCall()
  {
    SequenceCallImpl sequenceCall = new SequenceCallImpl();
    return sequenceCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryValue createQueryValue()
  {
    QueryValueImpl queryValue = new QueryValueImpl();
    return queryValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadDebugInfo createLoadDebugInfo()
  {
    LoadDebugInfoImpl loadDebugInfo = new LoadDebugInfoImpl();
    return loadDebugInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read8 createRead8()
  {
    Read8Impl read8 = new Read8Impl();
    return read8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read16 createRead16()
  {
    Read16Impl read16 = new Read16Impl();
    return read16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read32 createRead32()
  {
    Read32Impl read32 = new Read32Impl();
    return read32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read64 createRead64()
  {
    Read64Impl read64 = new Read64Impl();
    return read64;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadAP createReadAP()
  {
    ReadAPImpl readAP = new ReadAPImpl();
    return readAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadDP createReadDP()
  {
    ReadDPImpl readDP = new ReadDPImpl();
    return readDP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write8 createWrite8()
  {
    Write8Impl write8 = new Write8Impl();
    return write8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write16 createWrite16()
  {
    Write16Impl write16 = new Write16Impl();
    return write16;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write32 createWrite32()
  {
    Write32Impl write32 = new Write32Impl();
    return write32;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write64 createWrite64()
  {
    Write64Impl write64 = new Write64Impl();
    return write64;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WriteAP createWriteAP()
  {
    WriteAPImpl writeAP = new WriteAPImpl();
    return writeAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WriteDP createWriteDP()
  {
    WriteDPImpl writeDP = new WriteDPImpl();
    return writeDP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapDelay createDapDelay()
  {
    DapDelayImpl dapDelay = new DapDelayImpl();
    return dapDelay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapWriteABORT createDapWriteABORT()
  {
    DapWriteABORTImpl dapWriteABORT = new DapWriteABORTImpl();
    return dapWriteABORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapSwjPins createDapSwjPins()
  {
    DapSwjPinsImpl dapSwjPins = new DapSwjPinsImpl();
    return dapSwjPins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapSwjClock createDapSwjClock()
  {
    DapSwjClockImpl dapSwjClock = new DapSwjClockImpl();
    return dapSwjClock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapSwjSequence createDapSwjSequence()
  {
    DapSwjSequenceImpl dapSwjSequence = new DapSwjSequenceImpl();
    return dapSwjSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DapJtagSequence createDapJtagSequence()
  {
    DapJtagSequenceImpl dapJtagSequence = new DapJtagSequenceImpl();
    return dapJtagSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DebugSeqPackage getDebugSeqPackage()
  {
    return (DebugSeqPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DebugSeqPackage getPackage()
  {
    return DebugSeqPackage.eINSTANCE;
  }

} //DebugSeqFactoryImpl