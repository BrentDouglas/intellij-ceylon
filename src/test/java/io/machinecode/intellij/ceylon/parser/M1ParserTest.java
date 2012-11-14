package io.machinecode.intellij.ceylon.parser;

import com.intellij.ide.util.PropertiesComponent;
import io.machinecode.intellij.ceylon.CeylonLanguageLevel;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M1ParserTest extends CeylonTestCase implements CeylonElementTypes {

    @Override
    public String getResourceDirectory() {
        return "parser/m1";
    }

    @Override
    protected void setUp() {
        super.setUp();
        PropertiesComponent.getInstance(myProject).setValue(
                CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M1.name()
        );
    }

    //Abbreviation: "?" | "[]"
    @Test
    public void testAbbreviation() {
        assertEmpty(parseLines("abbreviation.lines.pass.ceylon", ABBREVIATION));
        assertEmpty(failParseLines("abbreviation.lines.fail.ceylon", ABBREVIATION));
    }

    //AbbreviatedType: Type Abbreviation*
    @Test
    public void testAbbreviatedType() {

    }

    //AbstractedType: "abstracts" Type
    @Test
    public void testAbstractedType() {

    }

    //Annotation: MemberName ( Arguments | Literal+ )?
    @Test
    public void testAnnotation() {

    }

    //Arguments: PositionalArguments FunctionalArguments? | NamedArguments
    @Test
    public void testArguments() {

    }

    //Atom: Literal | StringTemplate | SelfReference | ParExpression
    @Test
    public void testAtom() {
        assertEmpty(parseLines("atom.lines.pass.ceylon", ATOM));
        assertEmpty(failParseLines("atom.lines.fail.ceylon", ATOM));
    }

    //Attribute: Annotation* (SimpleAttribute | AttributeGetter | AttributeSetter)
    @Test
    public void testAttribute() {

    }

    //AttributeGetter: AttributeHeader Block
    @Test
    public void testAttributeGetter() {

    }

    //AttributeHeader: (UnionType | "value") MemberName
    @Test
    public void testAttributeHeader() {

    }

    //AttributeMeta: Type "." MemberName
    @Test
    public void testAttributeMeta() {

    }

    //AttributeSetter: "assign" MemberName Block
    @Test
    public void testAttributeSetter() {

    }

    //Block: "{" (Declaration | Statement)* "}"
    @Test
    public void testBlock() {

    }

    //BooleanCondition: Expression
    @Test
    public void testBooleanCondition() {

    }

    //Break: "break"
    @Test
    public void testBreak() {
        assertEmpty(parseLines("break.lines.pass.ceylon", BREAK));
    }

    //CallableParam: (UnionType | "void") MemberName Params+
    @Test
    public void testCallableParam() {

    }

    //CallableReference: MethodReference | InitializerReference
    @Test
    public void testCallableReference() {

    }

    //CallableVariable: (UnionType | "void")? MemberName Params+
    @Test
    public void testCallableVariable() {

    }

    //Case: Expression ("," Expression)* | "is" UnionType | "satisfies" Type
    @Test
    public void testCase() {

    }

    //CaseItem: "case" "(" Case ")" Block
    @Test
    public void testCaseItem() {

    }

    //Cases: CaseItem+ DefaultCaseItem?
    @Test
    public void testCases() {

    }

    //CaseType: MemberName | Type
    @Test
    public void testCaseType() {

    }

    //CaseTypes: "of" CaseType ("|" CaseType)*
    @Test
    public void testCaseTypes() {

    }

    //Catch: "catch" "(" Variable ")" Block
    @Test
    public void testCatch() {

    }

    //Class: Annotation* ClassHeader (ClassBody | TypeSpecifier ";")
    @Test
    public void testClass() {

    }

    //ClassBody: "{" (Declaration | Statement)* "}"
    @Test
    public void testClassBody() {

    }

    //ClassHeader: "class" TypeName TypeParams? Params ClassInheritance TypeConstraints?
    @Test
    public void testClassHeader() {

    }

    //ClassInheritance: CaseTypes? Metatypes? ExtendedType? SatisfiedTypes?
    @Test
    public void testClassInheritance() {

    }

    //CompilationUnit: Import* ToplevelDeclaration+
    @Test
    public void testCompilationUnit() {

    }

    //Condition: BooleanCondition | IsCondition | ExistsOrNonemptyCondition | SatisfiesCondition
    @Test
    public void testCondition() {

    }

    //Continue: "continue"
    @Test
    public void testContinue() {
        assertEmpty(parseLines("continue.lines.pass.ceylon", CONTINUE));
    }

    //ControlStructure: IfElse | SwitchCaseElse | While | ForFail | TryCatchFinally
    @Test
    public void testControlStructure() {

    }

    //Declaration: Method | Attribute | TypeDeclaration
    @Test
    public void testDeclaration() {

    }

    //DefaultCaseItem: "else" Block
    @Test
    public void testDefaultCaseItem() {

    }

    //DefaultParam: Param Specifier
    @Test
    public void testDefaultParam() {

    }

    //Directive: Return | Throw | Break | Continue
    @Test
    public void testDirective() {

    }

    //DirectiveStatement: Directive ";"
    @Test
    public void testDirectiveStatement() {

    }

    //Else: "else" (Block | IfElse)
    @Test
    public void testElse() {

    }

    //EntryParamPair: SimpleParam "->" SimpleParam
    @Test
    public void testEntryParamPair() {

    }

    //EntryType: AbbreviatedType ("->" AbbreviatedType)?
    @Test
    public void testEntryType() {

    }

    //EntryVariablePair: Variable "->" Variable
    @Test
    public void testEntryVariablePair() {

    }

    //ExistsOrNonemptyCondition: ("exists" | "nonempty") (Variable Specifier | MemberName)
    @Test
    public void testExistsOrIsNonEmptyCondition() {

    }

    //Expression: Primary | OperatorExpression
    @Test
    public void testExpression() {

    }

    //ExpressionStatement: ( Assignment | IncrementOrDecrement | Invocation ) ";"
    @Test
    public void testExpressionStatement() {
        assertEmpty(parseLines("expression_statement.lines.pass.ceylon", EXPRESSION_STATEMENT));
        assertEmpty(failParseLines("expression_statement.lines.fail.ceylon", EXPRESSION_STATEMENT));
    }

    //ExtendedType: "extends" ("super" ".")? Type PositionalArguments
    @Test
    public void testExtendedType() {

    }

    //Fail: "else" Block
    @Test
    public void testFail() {

    }

    //Finally: "finally" Block
    @Test
    public void testFinally() {

    }

    //For: "for" "(" ForIterator ")" Block
    @Test
    public void testFor() {

    }

    //ForFail: For Fail?
    @Test
    public void testForFail() {

    }

    //ForIterator: IteratorVariable "in" Expression
    @Test
    public void testForIterator() {

    }

    //FullPackageName: PackageName ("." PackageName)*
    @Test
    public void testFullPackageName() {

    }

    //FunctionalArguments: (MemberName FunctionalBody)+
    @Test
    public void testFunctionalArguments() {

    }

    //FunctionalBody: Params? ( Block | "(" Expression ")" )
    @Test
    public void testFunctionalBody() {

    }

    //FunctionalNamedArgument: (UnionType | "function" | "void") MemberName Params+ (Block | NamedArguments)
    @Test
    public void testFunctionalNamedArgument() {

    }

    //FunctionMeta: MemberName TypeArguments?
    @Test
    public void testFunctionMeta() {

    }

    //If: "if" "(" Condition ")" Block
    @Test
    public void testIf() {

    }

    //IfElse: If Else?
    @Test
    public void testIfElse() {

    }

    //Import: "import" FullPackageName "{" ImportElements? "}"
    @Test
    public void testImport() {

    }

    //ImportElement: ImportTypeElement | ImportMethodAttributeElement
    @Test
    public void testImportElement() {

    }

    //ImportElements: ImportElement ("," ImportElement)* ("," ImportWildcard)? | ImportWildcard
    @Test
    public void testImportElements() {

    }

    //ImportMethodAttributeElement: MethodAttributeAlias? MemberName
    @Test
    public void testImportMethodAttributeElement() {

    }

    //ImportTypeElement: TypeAlias? TypeName
    @Test
    public void testImportTypeElement() {

    }

    //ImportWildcard: "..."
    @Test
    public void testImportWildcard() {
        assertEmpty(parseLines("import_wildcard.lines.pass.ceylon", IMPORT_WILDCARD));
        assertEmpty(failParseLines("import_wildcard.lines.fail.ceylon", IMPORT_WILDCARD));
    }

    //Initializer: ":=" Expression
    @Test
    public void testInitializer() {

    }

    //InitializerReference: (Receiver ".")? TypeName TypeArguments?
    @Test
    public void testInitializerReference() {

    }

    //Interface: Annotation* InterfaceHeader (InterfaceBody | TypeSpecifier ";")
    @Test
    public void testInterface() {

    }

    //InterfaceBody: "{" Declaration* "}"
    @Test
    public void testInterfaceBody() {

    }

    //InterfaceHeader: "interface" TypeName TypeParams? InterfaceInheritance TypeConstraints?
    @Test
    public void testInterfaceHeader() {

    }

    //InterfaceInheritance: CaseTypes? MetaTypes? AdaptedTypes? SatisfiedTypes?
    @Test
    public void testInterfaceInheritance() {

    }

    //IntersectionType: EntryType ("&" EntryType)*
    @Test
    public void testIntersectionType() {

    }

    //Invocation: Primary Arguments | SequenceInstantiation
    @Test
    public void testInvocation() {
        assertEmpty(parseLines("invocation.lines.pass.ceylon", INVOCATION));
        assertEmpty(failParseLines("invocation.lines.fail.ceylon", INVOCATION));
    }

    //IsCondition: "is" (TypedVariable Specifier | UnionType MemberName)
    @Test
    public void testIsCondition() {

    }

    //IteratorVariable: Variable | CallableVariable | EntryVariablePair
    @Test
    public void testIteratorVariable() {

    }

    //Literal: IntegerLiteral | FloatLiteral | CharacterLiteral | StringLiteral | QuotedLiteral
    @Test
    public void testLiteral() {
        assertEmpty(parseLines("literal.lines.pass.ceylon", LITERAL));
        assertEmpty(failParseLines("literal.lines.fail.ceylon", LITERAL));
    }

    //LocalNamedArgument: (UnionType | "value") MemberName (Block | NamedArguments)
    @Test
    public void testLocalNamedArgument() {

    }

    //LoopCondition: "while" "(" Condition ")"
    @Test
    public void testLoopCondition() {

    }

    //MemberName: LIdentifier
    @Test
    public void testMemberName() {
        assertEmpty(parseLines("member_name.lines.pass.ceylon", MEMBER_NAME));
        assertEmpty(failParseLines("member_name.lines.fail.ceylon", MEMBER_NAME));
    }

    //MemberReference: CallableReference | ValueReference
    @Test
    public void testMemberReference() {

    }

    //Meta: TypeMeta | MethodMeta | AttributeMeta | FunctionMeta | ValueMeta
    @Test
    public void testMeta() {

    }

    //Method: Annotation* MethodHeader (Block | NamedArguments | Specifier? ";")
    @Test
    public void testMethod() {

    }

    //MethodAttributeAlias: MemberName "="
    @Test
    public void testMethodAttributeAlias() {
        assertEmpty(parseLines("method_attribute_alias.lines.pass.ceylon", METHOD_ATTRIBUTE_ALIAS));
        assertEmpty(failParseLines("method_attribute_alias.lines.fail.ceylon", METHOD_ATTRIBUTE_ALIAS));
    }

    //MethodHeader: (UnionType | "function" | "void") MemberName TypeParams? Params+ Metatypes? TypeConstraints?
    @Test
    public void testMethodHeader() {

    }

    //MethodMeta: Type "." MemberName TypeArguments?
    @Test
    public void testMethodMeta() {

    }

    //MethodReference: (Receiver ".")? MemberName TypeArguments?
    @Test
    public void testMethodReference() {

    }

    //NamedArgument: SpecifiedNamedArgument | LocalNamedArgument | FunctionalNamedArgument | Object
    @Test
    public void testNamedArgument() {

    }

    //NamedArguments: "{" NamedArgument* Sequence? "}"
    @Test
    public void testNamedArguments() {

    }

    //Object: Annotation* ObjectHeader ClassBody
    @Test
    public void testObject() {

    }

    //ObjectHeader: "object" MemberName ObjectInheritance
    @Test
    public void testObjectHeader() {

    }

    //ObjectInheritance: ExtendedType? SatisfiedTypes?
    @Test
    public void testObjectInheritance() {

    }

    //PackageName: PIdentifier
    @Test
    public void testPackageName() {
        assertEmpty(parseLines("package_name.lines.pass.ceylon", PACKAGE_NAME));
        assertEmpty(failParseLines("package_name.lines.fail.ceylon", PACKAGE_NAME));
    }

    //Param: Annotation* (SimpleParam | CallableParam | EntryParamPair)
    @Test
    public void testParam() {

    }

    //Params: "(" Param ("," Param)* ("," DefaultParam)* ("," SequencedParam)? | DefaultParam ("," DefaultParam)* ("," SequencedParam)? | SequencedParam? ")"
    @Test
    public void testParams() {

    }

    //ParExpression: "(" Expression ")"
    @Test
    public void testParExpression() {
        assertEmpty(parseLines("par_expression.lines.pass.ceylon", PAR_EXPRESSION));
        assertEmpty(failParseLines("par_expression.lines.fail.ceylon", PAR_EXPRESSION));
    }

    //PositionalArguments: "(" Expression ("," Expression)* ("," Sequence)? | Sequence? ")"
    @Test
    public void testPositionalArguments() {

    }

    //Primary: Atom | Meta | MemberReference | Invocation
    @Test
    public void testPrimary() {
        assertEmpty(parseLines("primary.lines.pass.ceylon", PRIMARY));
        assertEmpty(failParseLines("primary.lines.fail.ceylon", PRIMARY));
    }

    //Receiver: Primary
    @Test
    public void testReciever() {

    }

    //Resource: MemberName | InitializerReference Arguments | Variable Specifier
    @Test
    public void testResource() {

    }

    //Return: "return" Expression?
    @Test
    public void testReturn() {

    }

    //SatisfiedTypes: "satisfies" Type ("&" Type)*
    @Test
    public void testSatisfiedTypes() {

    }

    //SatisfiesCondition: "satisfies" Type Type
    @Test
    public void testSatisfiesCondition() {

    }

    //SelfReference: "this" | "super" | "outer"
    @Test
    public void testSelfReference() {
        assertEmpty(parseLines("self_reference.lines.pass.ceylon", SELF_REFERENCE));
    }

    //Sequence: Expression ("," Expression)* | Expression "..."
    @Test
    public void testSequence() {

    }

    //SequencedParam: Annotation* UnionType "..." MemberName
    @Test
    public void testSequencedParam() {

    }

    //SequencedType: TypeName "..."
    @Test
    public void testSequencedType() {
        assertEmpty(parseLines("sequenced_type.lines.pass.ceylon", SEQUENCED_TYPE));
        assertEmpty(failParseLines("sequenced_type.lines.fail.ceylon", SEQUENCED_TYPE));
    }

    //SequencedTypeParam: TypeName "..."
    @Test
    public void testSequencedTypeParam() {
        assertEmpty(parseLines("sequenced_type_param.lines.pass.ceylon", SEQUENCED_TYPE_PARAM));
        assertEmpty(failParseLines("sequenced_type_param.lines.fail.ceylon", SEQUENCED_TYPE_PARAM));
    }

    //SequenceInstantiation = "{" Sequence? "}"
    @Test
    public void testSequenceInstantiation() {

    }

    //SimpleAttribute: AttributeHeader ( (Specifier | Initializer)? ";" | NamedArguments )
    @Test
    public void testSimpleAttribute() {

    }

    //SimpleParam: UnionType MemberName
    @Test
    public void testSimpleParam() {

    }

    //Specification: MemberName Specifier ";"
    @Test
    public void testSpecification() {
        assertEmpty(parseLines("specification.lines.pass.ceylon", SPECIFICATION));
        assertEmpty(failParseLines("specification.lines.fail.ceylon", SPECIFICATION));
    }

    //SpecifiedNamedArgument: MemberName Specifier ";"
    @Test
    public void testSpecifiedNamedArgument() {
        assertEmpty(parseLines("specified_named_argument.lines.pass.ceylon", SPECIFIED_NAMED_ARGUMENT));
        assertEmpty(failParseLines("specified_named_argument.lines.fail.ceylon", SPECIFIED_NAMED_ARGUMENT));
    }

    //Specifier: "=" Expression
    @Test
    public void testSpecifier() {

    }

    //Statement: ExpressionStatement | Specification | DirectiveStatement | ControlStructure
    @Test
    public void testStatement() {

    }

    //StringTemplate: StringLiteral (Expression StringLiteral)+
    @Test
    public void testStringTemplate() {
        assertEmpty(parseLines("string_template.lines.pass.ceylon", STRING_TEMPLATE));
        assertEmpty(failParseLines("string_template.lines.fail.ceylon", STRING_TEMPLATE));
    }

    //Switch: "switch" "(" Expression ")"
    @Test
    public void testSwitchCaseElse() {

    }

    //SwitchCaseElse: Switch ( Cases | "{" Cases "}" )
    @Test
    public void testSwitch() {

    }

    //Throw: "throw" Expression?
    @Test
    public void testThrow() {

    }

    //TopLevelDeclaration: TypeDeclaration | Method | SimpleAttribute | AttributeGetter
    @Test
    public void testTopLevelDeclaration() {

    }

    //Try: "try" ("(" Resource ")")? Block
    @Test
    public void testTry() {

    }

    //TryCatchFinally: Try Catch* Finally?
    @Test
    public void testTryCatchFinally() {

    }

    //Type: TypeNameWithArguments ("." TypeNameWithArguments)*
    @Test
    public void testType() {

    }

    //TypeAlias: TypeName "="
    @Test
    public void testTypeAlias() {
        assertEmpty(parseLines("type_alias.lines.pass.ceylon", TYPE_ALIAS));
        assertEmpty(failParseLines("type_alias.lines.fail.ceylon", TYPE_ALIAS));
    }

    //TypeArguments: "<" (UnionType ",")* (UnionType | SequencedType) ">"
    @Test
    public void testTypeArguments() {

    }

    //TypeConstraint: "given" TypeName TypeParams? Params? TypeConstraintInheritance
    @Test
    public void testTypeConstraint() {

    }

    //TypeConstraintInheritance: CaseTypes? Metatypes? SatisfiedTypes? AbstractedType?
    @Test
    public void testTypeConstraintInheritance() {

    }

    //TypeConstraints: TypeConstraint+
    @Test
    public void testTypeConstraints() {

    }

    //TypeDeclaration: Class | Object | Interface
    @Test
    public void testTypeDeclaration() {

    }

    //TypedVariable: UnionType MemberName
    @Test
    public void testTypedVariable() {

    }

    //TypeMeta: Type
    @Test
    public void testTypeMeta() {

    }

    //TypeName: UIdentifier
    @Test
    public void testTypeName() {
        assertEmpty(parseLines("type_name.lines.pass.ceylon", TYPE_NAME));
        assertEmpty(failParseLines("type_name.lines.fail.ceylon", TYPE_NAME));
    }

    //TypeNameWithArguments: TypeName TypeArguments?
    @Test
    public void testTypeNameWithArguments() {

    }

    //TypeParam: Variance? TypeName
    @Test
    public void testTypeParam() {
        assertEmpty(parseLines("type_param.lines.pass.ceylon", TYPE_PARAM));
        assertEmpty(failParseLines("type_param.lines.fail.ceylon", TYPE_PARAM));
    }

    //TypeParams: "<" (TypeParam ",")* (TypeParam | SequencedTypeParam) ">"
    @Test
    public void testTypeParams() {

    }

    //TypeSpecifier: "=" Type
    @Test
    public void testTypeSpecifier() {

    }

    //UnionType: IntersectionType ("|" IntersectionType)*
    @Test
    public void testUnionType() {
        assertEmpty(parseLines("union_type.lines.pass.ceylon", UNION_TYPE));
        assertEmpty(failParseLines("union_type.lines.fail.ceylon", UNION_TYPE));
    }

    //ValueMeta: MemberName TypeArguments?
    @Test
    public void testValueMeta() {

    }

    //ValueReference: (Receiver ".")? MemberName
    @Test
    public void testValueReference() {

    }

    //Variable: UnionType? MemberName
    @Test
    public void testVariable() {

    }

    //Variance: "out" | "in"
    @Test
    public void testVariance() {
        assertEmpty(parseLines("variance.lines.pass.ceylon", VARIANCE));
    }

    //While: LoopCondition Block
    @Test
    public void testWhile() {

    }









    /*
    * OperatorExpression: Invocation | Assignment | CompoundAssignment | Format | Equalities | Comparison |
    *                    Containment | Assignability | Inheritance | Not | LogicalCondition | Existance | Default |
    *                    NullsafeInvocation | KeyedItemAccess | Spans | SpreadInvocation | RangeOrEntryConstruction |
    *                    Conditional | IncrementOrDecrement | NumericalOperation | NumericalAssignment |
    *                    SlotwiseOperator | SlotwiseAssignment | InversionOperation | Complement
    */
    @Test
    public void testOperatorExpression() {
    }

    /*
     * IncrementOrDecrement: MemberName ( "++" | "--" ) | ( "++" | "--" ) MemberName
     */
    @Test
    public void testIncrementOrDecrement() {
        assertEmpty(parseLines("increment_or_decrement.lines.pass.ceylon", INCREMENT_OR_DECREMENT));
        assertEmpty(failParseLines("increment_or_decrement.lines.fail.ceylon", INCREMENT_OR_DECREMENT));
    }

    /*
     * Assignment: MemberName ( ":=" | "+=" | "-=" | "*=" | "/=" | "%=" | "&=" | "|=" | "^=" | "~=" | "&&=" | "||=" ) Primary
     */
    @Test
    public void testAssignment() {
        assertEmpty(parseLines("assignment.lines.pass.ceylon", ASSIGNMENT));
        assertEmpty(failParseLines("assignment.lines.fail.ceylon", ASSIGNMENT));
    }

    /*
     * Equalities: Primary ".=" MemberName Arguments?
     */
    @Test
    public void testCompountAssignment() {
    }

    /*
     * Format: "$" Primary
     */
    @Test
    public void testFormat() {
    }

    /*
     * Equalities: Primary ( "===" | "==" | "!=" ) Primary
     */
    @Test
    public void testEqualities() {
    }

    /*
     * Comparison: Primary ( "<" | "<=" | "<=>" | "=>" | ">" ) Primary
     */
    @Test
    public void testComparison() {
    }

    /*
     * Containment: MemberName "in" Primary
     */
    @Test
    public void testContainment() {
    }

    /*
     * Assignability: "is" Type Primary
     */
    @Test
    public void testAssignability() {
    }

    /*
     * Inheritance: "satisfies" Type Primary
     */
    @Test
    public void testInheritance() {
    }

    /*
     * Not: "!" Primary
     */
    @Test
    public void testNot() {
    }

    /*
     * LogicalCondition: Primary ( "||" | "&&" ) Primary
     */
    @Test
    public void testLogicalCondition() {
    }

    /*
     * Existance: ( "exists" | "nonempty" ) Primary
     */
    @Test
    public void testExistance() {
    }

    /*
     * Default: Primary "?" Primary
     */
    @Test
    public void testDefault() {
    }

    /*
     * NullsafeInvocation: Primary "?." MemberName Arguments?
     */
    @Test
    public void testNullsafeInvocation() {
    }

    /*
     * KeyedItemAccess: Primary ( "[" | "?[" ) Primary "]"
     */
    @Test
    public void testKeyedItemAccess() {
    }

    /*
     * Spans: Primary "[" Primary ( ".." Primary | "..." ) "]"
     */
    @Test
    public void testSpans() {
    }

    /*
     * SpreadInvocation: Primary ( "[]." MemberName | Arguments )
     */
    @Test
    public void testSpreadInvocation() {
    }

    /*
     * RangeOrEntryConstruction: Primary ( ".." | "->" ) Primary
     */
    @Test
    public void testRangeOrEntryConstruction() {
    }

    /*
     * Conditional: Primary ( "then" | "else" ) Primary
     */
    @Test
    public void testConditional() {
    }

    /*
     * InversionOperation: ( "+" | "-" ) Primary
     */
    @Test
    public void testInversionOperation() {
    }

    /*
     * NumericalOperation: Primary ( "+" | "-" | "*" | "/" | "%" | "**" ) Primary
     */
    @Test
    public void testNumericalOperation() {
    }

    /*
     * Complement: "~" Primary
     */
    @Test
    public void testComplement() {
    }

    /*
     * SlotwiseOperator: Primary ( "|" | "&" | "^" | "~" ) Primary
     */
    @Test
    public void testSlotwiseOperator() {
    }
}
