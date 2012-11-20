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
        assertEmpty(parseLines("abbreviated_type.lines.pass.ceylon", ABBREVIATED_TYPE));
        assertEmpty(failParseLines("abbreviated_type.lines.fail.ceylon", ABBREVIATED_TYPE));
    }

    //AbstractedType: "abstracts" Type
    @Test
    public void testAbstractedType() {
        assertEmpty(parseLines("abstracted_type.lines.pass.ceylon", ABSTRACTED_TYPE));
        assertEmpty(failParseLines("abstracted_type.lines.fail.ceylon", ABSTRACTED_TYPE));
    }

    //Annotation: MemberName ( Arguments | Literal+ )?
    @Test
    public void testAnnotation() {
        assertEmpty(parseLines("annotation.lines.pass.ceylon", ANNOTATION));
        assertEmpty(failParseLines("annotation.lines.fail.ceylon", ANNOTATION));
    }

    //Arguments: PositionalArguments FunctionalArguments? | NamedArguments
    @Test
    public void testArguments() {
        assertEmpty(parseLines("arguments.lines.pass.ceylon", ARGUMENTS));
        assertEmpty(failParseLines("arguments.lines.fail.ceylon", ARGUMENTS));
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
        assertEmpty(parseLines("attribute.lines.pass.ceylon", ATTRIBUTE));
        assertEmpty(failParseLines("attribute.lines.fail.ceylon", ATTRIBUTE));
    }

    //AttributeGetter: AttributeHeader Block
    @Test
    public void testAttributeGetter() {
        assertEmpty(parseLines("attribute_getter.lines.pass.ceylon", ATTRIBUTE_GETTER));
        assertEmpty(failParseLines("attribute_getter.lines.fail.ceylon", ATTRIBUTE_GETTER));
    }

    //AttributeHeader: (UnionType | "value") MemberName
    @Test
    public void testAttributeHeader() {
        assertEmpty(parseLines("attribute_header.lines.pass.ceylon", ATTRIBUTE_HEADER));
        assertEmpty(failParseLines("attribute_header.lines.fail.ceylon", ATTRIBUTE_HEADER));
    }

    //AttributeMeta: Type "." MemberName
    @Test
    public void testAttributeMeta() {
        assertEmpty(parseLines("attribute_meta.lines.pass.ceylon", ATTRIBUTE_META));
        assertEmpty(failParseLines("attribute_meta.lines.fail.ceylon", ATTRIBUTE_META));
    }

    //AttributeSetter: "assign" MemberName Block
    @Test
    public void testAttributeSetter() {
        assertEmpty(parseLines("attribute_setter.lines.pass.ceylon", ATTRIBUTE_SETTER));
        assertEmpty(failParseLines("attribute_setter.lines.fail.ceylon", ATTRIBUTE_SETTER));
    }

    //Block: "{" (Declaration | Statement)* "}"
    @Test
    public void testBlock() {
        assertEmpty(parseLines("block.lines.pass.ceylon", BLOCK));
        assertEmpty(failParseLines("block.lines.fail.ceylon", BLOCK));
    }

    //BooleanCondition: Expression
    @Test
    public void testBooleanCondition() {
        assertEmpty(parseLines("boolean_reference.lines.pass.ceylon", BOOLEAN_CONDITION));
        assertEmpty(failParseLines("boolean_reference.lines.fail.ceylon", BOOLEAN_CONDITION));
    }

    //Break: "break"
    @Test
    public void testBreak() {
        assertEmpty(parseLines("break.lines.pass.ceylon", BREAK));
    }

    //CallableParam: (UnionType | "void") MemberName Params+
    @Test
    public void testCallableParam() {
        assertEmpty(parseLines("callable_param.lines.pass.ceylon", CALLABLE_PARAM));
        assertEmpty(failParseLines("callable_param.lines.fail.ceylon", CALLABLE_PARAM));
    }

    //CallableReference: MethodReference | InitializerReference
    @Test
    public void testCallableReference() {
        assertEmpty(parseLines("callable_reference.lines.pass.ceylon", CALLABLE_REFERENCE));
        assertEmpty(failParseLines("callable_reference.lines.fail.ceylon", CALLABLE_REFERENCE));
    }

    //CallableVariable: (UnionType | "void")? MemberName Params+
    @Test
    public void testCallableVariable() {
        assertEmpty(parseLines("callable_variable.lines.pass.ceylon", CALLABLE_VARIABLE));
        assertEmpty(failParseLines("callable_variable.lines.fail.ceylon", CALLABLE_VARIABLE));
    }

    //Case: Expression ("," Expression)* | "is" UnionType | "satisfies" Type
    @Test
    public void testCase() {
        assertEmpty(parseLines("case.lines.pass.ceylon", CASE));
        assertEmpty(failParseLines("case.lines.fail.ceylon", CASE));
    }

    //CaseItem: "case" "(" Case ")" Block
    @Test
    public void testCaseItem() {
        assertEmpty(parseLines("case_item.lines.pass.ceylon", CASE_ITEM));
        assertEmpty(failParseLines("case_item.lines.fail.ceylon", CASE_ITEM));
    }

    //Cases: CaseItem+ DefaultCaseItem?
    @Test
    public void testCases() {
        assertEmpty(parseLines("cases.lines.pass.ceylon", CASES));
        assertEmpty(failParseLines("cases.lines.fail.ceylon", CASES));
    }

    //CaseType: MemberName | Type
    @Test
    public void testCaseType() {
        assertEmpty(parseLines("case_type.lines.pass.ceylon", CASE_TYPE));
        assertEmpty(failParseLines("case_type.lines.fail.ceylon", CASE_TYPE));
    }

    //CaseTypes: "of" CaseType ("|" CaseType)*
    @Test
    public void testCaseTypes() {
        assertEmpty(parseLines("case_types.lines.pass.ceylon", CASE_TYPES));
        assertEmpty(failParseLines("case_types.lines.fail.ceylon", CASE_TYPES));
    }

    //Catch: "catch" "(" Variable ")" Block
    @Test
    public void testCatch() {
        assertEmpty(parseLines("catch.lines.pass.ceylon", CATCH));
        assertEmpty(failParseLines("catch.lines.fail.ceylon", CATCH));
    }

    //Class: Annotation* ClassHeader (ClassBody | TypeSpecifier ";")
    @Test
    public void testClass() {
        assertEmpty(parseLines("class.lines.pass.ceylon", CLASS));
        assertEmpty(failParseLines("class.lines.fail.ceylon", CLASS));
    }

    //ClassBody: "{" (Declaration | Statement)* "}"
    @Test
    public void testClassBody() {
        assertEmpty(parseLines("class_body.lines.pass.ceylon", CLASS_BODY));
        assertEmpty(failParseLines("class_body.lines.fail.ceylon", CLASS_BODY));
    }

    //ClassHeader: "class" TypeName TypeParams? Params ClassInheritance TypeConstraints?
    @Test
    public void testClassHeader() {
        assertEmpty(parseLines("class_header.lines.pass.ceylon", CLASS_HEADER));
        assertEmpty(failParseLines("class_header.lines.fail.ceylon", CLASS_HEADER));
    }

    //ClassInheritance: CaseTypes? Metatypes? ExtendedType? SatisfiedTypes?
    @Test
    public void testClassInheritance() {
        assertEmpty(parseLines("class_inheritance.lines.pass.ceylon", CLASS_INHERITANCE));
        assertEmpty(failParseLines("class_inheritance.lines.fail.ceylon", CLASS_INHERITANCE));
    }

    //CompilationUnit: Import* ToplevelDeclaration+
    @Test
    public void testCompilationUnit() {
        assertEmpty(parseLines("compilation_unit.lines.pass.ceylon", COMPILATION_UNIT));
        assertEmpty(failParseLines("compilation_unit.lines.fail.ceylon", COMPILATION_UNIT));
    }

    //Condition: BooleanCondition | IsCondition | ExistsOrNonemptyCondition | SatisfiesCondition
    @Test
    public void testCondition() {
        assertEmpty(parseLines("condition.lines.pass.ceylon", CONDITION));
        assertEmpty(failParseLines("condition.lines.fail.ceylon", CONDITION));
    }

    //Continue: "continue"
    @Test
    public void testContinue() {
        assertEmpty(parseLines("continue.lines.pass.ceylon", CONTINUE));
    }

    //ControlStructure: IfElse | SwitchCaseElse | While | ForFail | TryCatchFinally
    @Test
    public void testControlStructure() {
        assertEmpty(parseLines("control_structure.lines.pass.ceylon", CONTROL_STRUCTURE));
        assertEmpty(failParseLines("control_structure.lines.fail.ceylon", CONTROL_STRUCTURE));
    }

    //Declaration: Method | Attribute | TypeDeclaration
    @Test
    public void testDeclaration() {
        assertEmpty(parseLines("declaration.lines.pass.ceylon", DECLARATION));
        assertEmpty(failParseLines("declaration.lines.fail.ceylon", DECLARATION));
    }

    //DefaultCaseItem: "else" Block
    @Test
    public void testDefaultCaseItem() {
        assertEmpty(parseLines("default_case_item.lines.pass.ceylon", DEFAULT_CASE_ITEM));
        assertEmpty(failParseLines("default_case_item.lines.fail.ceylon", DEFAULT_CASE_ITEM));
    }

    //DefaultParam: Param Specifier
    @Test
    public void testDefaultParam() {
        assertEmpty(parseLines("default_param.lines.pass.ceylon", DEFAULT_PARAM));
        assertEmpty(failParseLines("default_param.lines.fail.ceylon", DEFAULT_PARAM));
    }

    //Directive: Return | Throw | Break | Continue
    @Test
    public void testDirective() {
        assertEmpty(parseLines("directive.lines.pass.ceylon", DIRECTIVE));
        assertEmpty(failParseLines("directive.lines.fail.ceylon", DIRECTIVE));
    }

    //DirectiveStatement: Directive ";"
    @Test
    public void testDirectiveStatement() {
        assertEmpty(parseLines("directive_statement.lines.pass.ceylon", DIRECTIVE_STATEMENT));
        assertEmpty(failParseLines("directive_statement.lines.fail.ceylon", DIRECTIVE_STATEMENT));
    }

    //Else: "else" (Block | IfElse)
    @Test
    public void testElse() {
        assertEmpty(parseLines("else.lines.pass.ceylon", ELSE));
        assertEmpty(failParseLines("else.lines.fail.ceylon", ELSE));
    }

    //EntryParamPair: SimpleParam "->" SimpleParam
    @Test
    public void testEntryParamPair() {
        assertEmpty(parseLines("entry_param_pair.lines.pass.ceylon", ENTRY_PARAM_PAIR));
        assertEmpty(failParseLines("entry_param_pair.lines.fail.ceylon", ENTRY_PARAM_PAIR));
    }

    //EntryType: AbbreviatedType ("->" AbbreviatedType)?
    @Test
    public void testEntryType() {
        assertEmpty(parseLines("entry_type.lines.pass.ceylon", ENTRY_TYPE));
        assertEmpty(failParseLines("entry_type.lines.fail.ceylon", ENTRY_TYPE));
    }

    //EntryVariablePair: Variable "->" Variable
    @Test
    public void testEntryVariablePair() {
        assertEmpty(parseLines("entry_variable_pair.lines.pass.ceylon", ENTRY_VARIABLE_PAIR));
        assertEmpty(failParseLines("entry_variable_pair.lines.fail.ceylon", ENTRY_VARIABLE_PAIR));
    }

    //ExistsOrNonemptyCondition: ("exists" | "nonempty") (Variable Specifier | MemberName)
    @Test
    public void testExistsOrIsNonEmptyCondition() {
        assertEmpty(parseLines("exists_or_nonempty_condition.lines.pass.ceylon", EXISTS_OR_IS_NONEMPTY_CONDITION));
        assertEmpty(failParseLines("exists_or_nonempty_condition.lines.fail.ceylon", EXISTS_OR_IS_NONEMPTY_CONDITION));
    }

    //Expression: Primary | OperatorExpression
    @Test
    public void testExpression() {
        assertEmpty(parseLines("expression.lines.pass.ceylon", EXPRESSION));
        assertEmpty(failParseLines("expression.lines.fail.ceylon", EXPRESSION));
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
        assertEmpty(parseLines("extended_type.lines.pass.ceylon", EXTENDED_TYPE));
        assertEmpty(failParseLines("extended_type.lines.fail.ceylon", EXTENDED_TYPE));
    }

    //Fail: "else" Block
    @Test
    public void testFail() {
        assertEmpty(parseLines("fail.lines.pass.ceylon", FAIL));
        assertEmpty(failParseLines("fail.lines.fail.ceylon", FAIL));
    }

    //Finally: "finally" Block
    @Test
    public void testFinally() {
        assertEmpty(parseLines("finally.lines.pass.ceylon", FINALLY));
        assertEmpty(failParseLines("finally.lines.fail.ceylon", FINALLY));
    }

    //For: "for" "(" ForIterator ")" Block
    @Test
    public void testFor() {
        assertEmpty(parseLines("for.lines.pass.ceylon", FOR));
        assertEmpty(failParseLines("for.lines.fail.ceylon", FOR));
    }

    //ForFail: For Fail?
    @Test
    public void testForFail() {
        assertEmpty(parseLines("for_fail.lines.pass.ceylon", FOR_FAIL));
        assertEmpty(failParseLines("for_fail.lines.fail.ceylon", FOR_FAIL));
    }

    //ForIterator: IteratorVariable "in" Expression
    @Test
    public void testForIterator() {
        assertEmpty(parseLines("for_iterator.lines.pass.ceylon", FOR_ITERATOR));
        assertEmpty(failParseLines("for_iterator.lines.fail.ceylon", FOR_ITERATOR));
    }

    //FullPackageName: PackageName ("." PackageName)*
    @Test
    public void testFullPackageName() {
        assertEmpty(parseLines("full_package_name.lines.pass.ceylon", FULL_PACKAGE_NAME));
        assertEmpty(failParseLines("full_package_name.lines.fail.ceylon", FULL_PACKAGE_NAME));
    }

    //FunctionalArguments: (MemberName FunctionalBody)+
    @Test
    public void testFunctionalArguments() {
        assertEmpty(parseLines("functional_arguments.lines.pass.ceylon", FUNCTIONAL_ARGUMENTS));
        assertEmpty(failParseLines("functional_arguments.lines.fail.ceylon", FUNCTIONAL_ARGUMENTS));
    }

    //FunctionalBody: Params? ( Block | "(" Expression ")" )
    @Test
    public void testFunctionalBody() {
        assertEmpty(parseLines("functional_body.lines.pass.ceylon", FUNCTIONAL_BODY));
        assertEmpty(failParseLines("functional_body.lines.fail.ceylon", FUNCTIONAL_BODY));
    }

    //FunctionalNamedArgument: (UnionType | "function" | "void") MemberName Params+ (Block | NamedArguments)
    @Test
    public void testFunctionalNamedArgument() {
        assertEmpty(parseFileSections("functional_named_argument.lines.pass.ceylon", FUNCTIONAL_NAMED_ARGUMENT));
        assertEmpty(failParseFileSections("functional_named_argument.lines.fail.ceylon", FUNCTIONAL_NAMED_ARGUMENT));
    }

    //FunctionMeta: MemberName TypeArguments?
    @Test
    public void testFunctionMeta() {
        assertEmpty(parseLines("function_meta.lines.pass.ceylon", FUNCTION_META));
        assertEmpty(failParseLines("function_meta.lines.fail.ceylon", FUNCTION_META));
    }

    //If: "if" "(" Condition ")" Block
    @Test
    public void testIf() {
        assertEmpty(parseLines("if.lines.pass.ceylon", IF));
        assertEmpty(failParseLines("if.lines.fail.ceylon", IF));
    }

    //IfElse: If Else?
    @Test
    public void testIfElse() {
        assertEmpty(parseLines("if_else.lines.pass.ceylon", IF_ELSE));
        assertEmpty(failParseLines("if_else.lines.fail.ceylon", IF_ELSE));
    }

    //Import: "import" FullPackageName "{" ImportElements? "}"
    @Test
    public void testImport() {
        assertEmpty(parseLines("import.lines.pass.ceylon", IMPORT));
        assertEmpty(failParseLines("import.lines.fail.ceylon", IMPORT));
    }

    //ImportElement: ImportTypeElement | ImportMethodAttributeElement
    @Test
    public void testImportElement() {
        assertEmpty(parseLines("import_element.lines.pass.ceylon", IMPORT_ELEMENT));
        assertEmpty(failParseLines("import_element.lines.fail.ceylon", IMPORT_ELEMENT));
    }

    //ImportElements: ImportElement ("," ImportElement)* ("," ImportWildcard)? | ImportWildcard
    @Test
    public void testImportElements() {
        assertEmpty(parseLines("import_elements.lines.pass.ceylon", IMPORT_ELEMENTS));
        assertEmpty(failParseLines("import_elements.lines.fail.ceylon", IMPORT_ELEMENTS));
    }

    //ImportMethodAttributeElement: MethodAttributeAlias? MemberName
    @Test
    public void testImportMethodAttributeElement() {
        assertEmpty(parseLines("import_method_attribute_element.lines.pass.ceylon", IMPORT_METHOD_ATTRIBUTE_ELEMENT));
        assertEmpty(failParseLines("import_method_attribute_element.lines.fail.ceylon", IMPORT_METHOD_ATTRIBUTE_ELEMENT));
    }

    //ImportTypeElement: TypeAlias? TypeName
    @Test
    public void testImportTypeElement() {
        assertEmpty(parseLines("import_type_element.lines.pass.ceylon", IMPORT_TYPE_ELEMENT));
        assertEmpty(failParseLines("import_type_element.lines.fail.ceylon", IMPORT_TYPE_ELEMENT));
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
        assertEmpty(parseLines("initializer.lines.pass.ceylon", INITIALIZER));
        assertEmpty(failParseLines("initializer.lines.fail.ceylon", INITIALIZER));
    }

    //InitializerReference: (Receiver ".")? TypeName TypeArguments?
    @Test
    public void testInitializerReference() {
        assertEmpty(parseLines("initializer_reference.lines.pass.ceylon", INITIALIZER_REFERENCE));
        assertEmpty(failParseLines("initializer_reference.lines.fail.ceylon", INITIALIZER_REFERENCE));
    }

    //Interface: Annotation* InterfaceHeader (InterfaceBody | TypeSpecifier ";")
    @Test
    public void testInterface() {
        assertEmpty(parseLines("interface.lines.pass.ceylon", INTERFACE));
        assertEmpty(failParseLines("interface.lines.fail.ceylon", INTERFACE));
    }

    //InterfaceBody: "{" Declaration* "}"
    @Test
    public void testInterfaceBody() {
        assertEmpty(parseLines("interface_body.lines.pass.ceylon", INTERFACE_BODY));
        assertEmpty(failParseLines("interface_body.lines.fail.ceylon", INTERFACE_BODY));
    }

    //InterfaceHeader: "interface" TypeName TypeParams? InterfaceInheritance TypeConstraints?
    @Test
    public void testInterfaceHeader() {
        assertEmpty(parseLines("interface_header.lines.pass.ceylon", INTERFACE_HEADER));
        assertEmpty(failParseLines("interface_header.lines.fail.ceylon", INTERFACE_HEADER));
    }

    //InterfaceInheritance: CaseTypes? MetaTypes? AdaptedTypes? SatisfiedTypes?
    @Test
    public void testInterfaceInheritance() {
        assertEmpty(parseLines("interface_inheritance.lines.pass.ceylon", INTERFACE_INHERITANCE));
        assertEmpty(failParseLines("interface_inheritance.lines.fail.ceylon", INTERFACE_INHERITANCE));
    }

    //IntersectionType: EntryType ("&" EntryType)*
    @Test
    public void testIntersectionType() {
        assertEmpty(parseLines("intersection_type.lines.pass.ceylon", INTERSECTION_TYPE));
        assertEmpty(failParseLines("intersection_type.lines.fail.ceylon", INTERSECTION_TYPE));
    }

    //Invocation: Primary Arguments | SequenceInstantiation
    @Test
    public void testInvocation() {
        assertEmpty(parseFileSections("invocation.sections.pass.ceylon", INVOCATION));
        assertEmpty(failParseFileSections("invocation.sections.fail.ceylon", INVOCATION));
    }

    //IsCondition: "is" (TypedVariable Specifier | UnionType MemberName)
    @Test
    public void testIsCondition() {
        assertEmpty(parseLines("is_condition.lines.pass.ceylon", IS_CONDITION));
        assertEmpty(failParseLines("ids_condition.lines.fail.ceylon", IS_CONDITION));
    }

    //IteratorVariable: Variable | CallableVariable | EntryVariablePair
    @Test
    public void testIteratorVariable() {
        assertEmpty(parseLines("iterator_variable.lines.pass.ceylon", ITERATOR_VARIABLE));
        assertEmpty(failParseLines("iterator_variable.lines.fail.ceylon", ITERATOR_VARIABLE));
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
        assertEmpty(parseFileSections("local_named_argument.lines.pass.ceylon", LOCAL_NAMED_ARGUMENT));
        assertEmpty(failParseFileSections("local_named_argument.lines.fail.ceylon", LOCAL_NAMED_ARGUMENT));
    }

    //LoopCondition: "while" "(" Condition ")"
    @Test
    public void testLoopCondition() {
        assertEmpty(parseLines("loop_condition.lines.pass.ceylon", LOOP_CONDITION));
        assertEmpty(failParseLines("loop_condition.lines.fail.ceylon", LOOP_CONDITION));
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
        assertEmpty(parseLines("member_reference.lines.pass.ceylon", MEMBER_REFERENCE));
        assertEmpty(failParseLines("member_reference.lines.fail.ceylon", MEMBER_REFERENCE));
    }

    //Meta: TypeMeta | MethodMeta | AttributeMeta | FunctionMeta | ValueMeta
    @Test
    public void testMeta() {
        assertEmpty(parseLines("meta.lines.pass.ceylon", META));
        assertEmpty(failParseLines("meta.lines.fail.ceylon", META));
    }

    //Method: Annotation* MethodHeader (Block | NamedArguments | Specifier? ";")
    @Test
    public void testMethod() {
        assertEmpty(parseLines("method.lines.pass.ceylon", METHOD));
        assertEmpty(failParseLines("method.lines.fail.ceylon", METHOD));
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
        assertEmpty(parseLines("method_header.lines.pass.ceylon", METHOD_HEADER));
        assertEmpty(failParseLines("method_header.lines.fail.ceylon", METHOD_HEADER));
    }

    //MethodMeta: Type "." MemberName TypeArguments?
    @Test
    public void testMethodMeta() {
        assertEmpty(parseLines("method_meta.lines.pass.ceylon", METHOD_META));
        assertEmpty(failParseLines("method_meta.lines.fail.ceylon", METHOD_META));
    }

    //MethodReference: (Receiver ".")? MemberName TypeArguments?
    @Test
    public void testMethodReference() {
        assertEmpty(parseLines("method_reference.lines.pass.ceylon", METHOD_REFERENCE));
        assertEmpty(failParseLines("method_reference.lines.fail.ceylon", METHOD_REFERENCE));
    }

    //NamedArgument: SpecifiedNamedArgument | LocalNamedArgument | FunctionalNamedArgument | Object
    @Test
    public void testNamedArgument() {
        assertEmpty(parseFileSections("named_argument.lines.pass.ceylon", NAMED_ARGUMENT));
        assertEmpty(failParseFileSections("named_argument.lines.fail.ceylon", NAMED_ARGUMENT));
    }

    //NamedArguments: "{" NamedArgument* Sequence? "}"
    @Test
    public void testNamedArguments() {
        assertEmpty(parseFileSections("named_arguments.lines.pass.ceylon", NAMED_ARGUMENTS));
        assertEmpty(failParseFileSections("named_arguments.lines.fail.ceylon", NAMED_ARGUMENTS));
    }

    //Object: Annotation* ObjectHeader ClassBody
    @Test
    public void testObject() {
        assertEmpty(parseLines("object.lines.pass.ceylon", OBJECT));
        assertEmpty(failParseLines("object.lines.fail.ceylon", OBJECT));
    }

    //ObjectHeader: "object" MemberName ObjectInheritance
    @Test
    public void testObjectHeader() {
        assertEmpty(parseLines("object_header.lines.pass.ceylon", OBJECT_HEADER));
        assertEmpty(failParseLines("object_header.lines.fail.ceylon", OBJECT_HEADER));
    }

    //ObjectInheritance: ExtendedType? SatisfiedTypes?
    @Test
    public void testObjectInheritance() {
        assertEmpty(parseLines("object_inheritance.lines.pass.ceylon", OBJECT_INHERITANCE));
        assertEmpty(failParseLines("object_inheritance.lines.fail.ceylon", OBJECT_INHERITANCE));
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
        assertEmpty(parseLines("param.lines.pass.ceylon", PARAM));
        assertEmpty(failParseLines("param.lines.fail.ceylon", PARAM));
    }

    //Params: "(" Param ("," Param)* ("," DefaultParam)* ("," SequencedParam)? | DefaultParam ("," DefaultParam)* ("," SequencedParam)? | SequencedParam? ")"
    @Test
    public void testParams() {
        assertEmpty(parseLines("params.lines.pass.ceylon", PARAMS));
        assertEmpty(failParseLines("params.lines.fail.ceylon", PARAMS));
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
        assertEmpty(parseLines("positional_arguments.lines.pass.ceylon", POSITIONAL_ARGUMENTS));
        assertEmpty(failParseLines("positional_arguments.lines.fail.ceylon", POSITIONAL_ARGUMENTS));
    }

    //Primary: Atom | Meta | MemberReference | Invocation
    @Test
    public void testPrimary() {
        assertEmpty(parseLines("primary.lines.pass.ceylon", PRIMARY));
        assertEmpty(failParseLines("primary.lines.fail.ceylon", PRIMARY));
    }

    //Receiver: Primary
    @Test
    public void testReceiver() {
        assertEmpty(parseLines("primary.lines.pass.ceylon", RECEIVER));
        assertEmpty(failParseLines("primary.lines.fail.ceylon", RECEIVER));
    }

    //Resource: MemberName | InitializerReference Arguments | Variable Specifier
    @Test
    public void testResource() {
        assertEmpty(parseLines("resource.lines.pass.ceylon", RESOURCE));
        assertEmpty(failParseLines("resource.lines.fail.ceylon", RESOURCE));
    }

    //Return: "return" Expression?
    @Test
    public void testReturn() {
        assertEmpty(parseLines("return.lines.pass.ceylon", RETURN));
        assertEmpty(failParseLines("return.lines.fail.ceylon", RETURN));
    }

    //SatisfiedTypes: "satisfies" Type ("&" Type)*
    @Test
    public void testSatisfiedTypes() {
        assertEmpty(parseLines("satisfied_types.lines.pass.ceylon", SATISFIED_TYPES));
        assertEmpty(failParseLines("satisfied_types.lines.fail.ceylon", SATISFIED_TYPES));
    }

    //SatisfiesCondition: "satisfies" Type Type
    @Test
    public void testSatisfiesCondition() {
        assertEmpty(parseLines("satisfies_condition.lines.pass.ceylon", SATISFIES_CONDITION));
        assertEmpty(failParseLines("satisfies_condition.lines.fail.ceylon", SATISFIES_CONDITION));
    }

    //SelfReference: "this" | "super" | "outer"
    @Test
    public void testSelfReference() {
        assertEmpty(parseLines("self_reference.lines.pass.ceylon", SELF_REFERENCE));
        assertEmpty(failParseLines("self_reference.lines.fail.ceylon", SELF_REFERENCE));
    }

    //Sequence: Expression ("," Expression)* | Expression "..."
    @Test
    public void testSequence() {
        assertEmpty(parseLines("sequence.lines.pass.ceylon", SEQUENCE));
        assertEmpty(failParseLines("sequence.lines.fail.ceylon", SEQUENCE));
    }

    //SequencedParam: Annotation* UnionType "..." MemberName
    @Test
    public void testSequencedParam() {
        assertEmpty(parseLines("sequenced_param.lines.pass.ceylon", SEQUENCED_PARAM));
        assertEmpty(failParseLines("sequenced_param.lines.fail.ceylon", SEQUENCED_PARAM));
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
        assertEmpty(parseLines("sequence_instantiation.lines.pass.ceylon", SEQUENCE_INSTANTIATION));
        assertEmpty(failParseLines("sequence_instantiation.lines.fail.ceylon", SEQUENCE_INSTANTIATION));
    }

    //SimpleAttribute: AttributeHeader ( (Specifier | Initializer)? ";" | NamedArguments )
    @Test
    public void testSimpleAttribute() {
        assertEmpty(parseLines("simple_attribute.lines.pass.ceylon", SIMPLE_ATTRIBUTE));
        assertEmpty(failParseLines("simple_attribute.lines.fail.ceylon", SIMPLE_ATTRIBUTE));
    }

    //SimpleParam: UnionType MemberName
    @Test
    public void testSimpleParam() {
        assertEmpty(parseLines("simple_param.lines.pass.ceylon", SIMPLE_PARAM));
        assertEmpty(failParseLines("simple_param.lines.fail.ceylon", SIMPLE_PARAM));
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
        assertEmpty(parseLines("specifier.lines.pass.ceylon", SPECIFIER));
        assertEmpty(failParseLines("specifier.lines.fail.ceylon", SPECIFIER));
    }

    //Statement: ExpressionStatement | Specification | DirectiveStatement | ControlStructure
    @Test
    public void testStatement() {
        assertEmpty(parseLines("statement.lines.pass.ceylon", STATEMENT));
        assertEmpty(failParseLines("statement.lines.fail.ceylon", STATEMENT));
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
        assertEmpty(parseLines("switch.lines.pass.ceylon", SWITCH));
        assertEmpty(failParseLines("switch.lines.fail.ceylon", SWITCH));
    }

    //SwitchCaseElse: Switch ( Cases | "{" Cases "}" )
    @Test
    public void testSwitch() {
        assertEmpty(parseLines("switch_case_else.lines.pass.ceylon", SWITCH_CASE_ELSE));
        assertEmpty(failParseLines("switch_case_else.lines.fail.ceylon", SWITCH_CASE_ELSE));
    }

    //Throw: "throw" Expression?
    @Test
    public void testThrow() {
        assertEmpty(parseLines("throw.lines.pass.ceylon", THROW));
        assertEmpty(failParseLines("throw.lines.fail.ceylon", THROW));
    }

    //TopLevelDeclaration: TypeDeclaration | Method | SimpleAttribute | AttributeGetter
    @Test
    public void testTopLevelDeclaration() {
        assertEmpty(parseLines("top_level_declaration.lines.pass.ceylon", TOP_LEVEL_DECLARATION));
        assertEmpty(failParseLines("top_level_declaration.lines.fail.ceylon", TOP_LEVEL_DECLARATION));
    }

    //Try: "try" ("(" Resource ")")? Block
    @Test
    public void testTry() {
        assertEmpty(parseLines("try.lines.pass.ceylon", TRY));
        assertEmpty(failParseLines("try.lines.fail.ceylon", TRY));
    }

    //TryCatchFinally: Try Catch* Finally?
    @Test
    public void testTryCatchFinally() {
        assertEmpty(parseLines("try_catch_finally.lines.pass.ceylon", TRY_CATCH_FINALLY));
        assertEmpty(failParseLines("try_catch_finally.lines.fail.ceylon", TRY_CATCH_FINALLY));
    }

    //Type: TypeNameWithArguments ("." TypeNameWithArguments)*
    @Test
    public void testType() {
        assertEmpty(parseLines("type.lines.pass.ceylon", TYPE));
        assertEmpty(failParseLines("type.lines.fail.ceylon", TYPE));
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
        assertEmpty(parseLines("type_arguments.lines.pass.ceylon", TYPE_ARGUMENTS));
        assertEmpty(failParseLines("type_arguments.lines.fail.ceylon", TYPE_ARGUMENTS));
    }

    //TypeConstraint: "given" TypeName TypeParams? Params? TypeConstraintInheritance
    @Test
    public void testTypeConstraint() {
        assertEmpty(parseLines("type_constraint.lines.pass.ceylon", TYPE_CONSTRAINT));
        assertEmpty(failParseLines("type_constraint.lines.fail.ceylon", TYPE_CONSTRAINT));
    }

    //TypeConstraintInheritance: CaseTypes? Metatypes? SatisfiedTypes? AbstractedType?
    @Test
    public void testTypeConstraintInheritance() {
        assertEmpty(parseLines("type_constraint_inheritance.lines.pass.ceylon", TYPE_CONSTRAINT_INHERITANCE));
        assertEmpty(failParseLines("type_constraint_inheritance.lines.fail.ceylon", TYPE_CONSTRAINT_INHERITANCE));

    }

    //TypeConstraints: TypeConstraint+
    @Test
    public void testTypeConstraints() {
        assertEmpty(parseLines("type_constraints.lines.pass.ceylon", TYPE_CONSTRAINTS));
        assertEmpty(failParseLines("type_constraints.lines.fail.ceylon", TYPE_CONSTRAINTS));
    }

    //TypeDeclaration: Class | Object | Interface
    @Test
    public void testTypeDeclaration() {
        assertEmpty(parseLines("type_declaration.lines.pass.ceylon", TYPE_DECLARATION));
        assertEmpty(failParseLines("type_declaration.lines.fail.ceylon", TYPE_DECLARATION));
    }

    //TypedVariable: UnionType MemberName
    @Test
    public void testTypedVariable() {
        assertEmpty(parseLines("typed_variable.lines.pass.ceylon", TYPED_VARIABLE));
        assertEmpty(failParseLines("typed_variable.lines.fail.ceylon", TYPED_VARIABLE));
    }

    //TypeMeta: Type
    @Test
    public void testTypeMeta() {
        assertEmpty(parseLines("type_meta.lines.pass.ceylon", TYPE_META));
        assertEmpty(failParseLines("type_meta.lines.fail.ceylon", TYPE_META));
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
        assertEmpty(parseLines("type_name_with_arguments.lines.pass.ceylon", TYPE_NAME_WITH_ARGUMENTS));
        assertEmpty(failParseLines("type_name_with_arguments.lines.fail.ceylon", TYPE_NAME_WITH_ARGUMENTS));
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
        assertEmpty(parseLines("type_params.lines.pass.ceylon", TYPE_PARAMS));
        assertEmpty(failParseLines("type_params.lines.fail.ceylon", TYPE_PARAMS));
    }

    //TypeSpecifier: "=" Type
    @Test
    public void testTypeSpecifier() {
        assertEmpty(parseLines("type_specifier.lines.pass.ceylon", TYPE_SPECIFIER));
        assertEmpty(failParseLines("type_specifier.lines.fail.ceylon", TYPE_SPECIFIER));
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
        assertEmpty(parseLines("value_meta.lines.pass.ceylon", VALUE_META));
        assertEmpty(failParseLines("value_meta.lines.fail.ceylon", VALUE_META));
    }

    //ValueReference: (Receiver ".")? MemberName
    @Test
    public void testValueReference() {
        assertEmpty(parseLines("value_reference.lines.pass.ceylon", VALUE_REFERENCE));
        assertEmpty(failParseLines("value_reference.lines.fail.ceylon", VALUE_REFERENCE));
    }

    //Variable: UnionType? MemberName
    @Test
    public void testVariable() {
        assertEmpty(parseLines("variable.lines.pass.ceylon", VARIABLE));
        assertEmpty(failParseLines("variable.lines.fail.ceylon", VARIABLE));
    }

    //Variance: "out" | "in"
    @Test
    public void testVariance() {
        assertEmpty(parseLines("variance.lines.pass.ceylon", VARIANCE));
    }

    //While: LoopCondition Block
    @Test
    public void testWhile() {
        assertEmpty(parseLines("while.lines.pass.ceylon", WHILE));
        assertEmpty(failParseLines("while.lines.fail.ceylon", WHILE));
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
     * IncrementOrDecrement: ( ( "++" | "--" ) Primary ) | ( Primary ( "++" | "--" ) )
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
}
