package io.machinecode.intellij.ceylon.parser;

import com.intellij.ide.util.PropertiesComponent;
import io.machinecode.intellij.ceylon.CeylonLanguageLevel;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M4ParserTest extends CeylonTestCase {

    @Override
    public String getResourceDirectory() {
        return "parser/m4";
    }

    @Override
    protected void setUp() {
        super.setUp();
        PropertiesComponent.getInstance(myProject).setValue(
                CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M4.name()
        );
    }

    //Abbreviation: "?" | "[]"
    @Test
    public void testAbbreviation() {
        parseLines("abbreviation.lines.pass.ceylon", CeylonElementTypes.ABBREVIATION);
        assertEmpty(failParseLines("abbreviation.lines.fail.ceylon", CeylonElementTypes.ABBREVIATION));
    }

    //AbbreviatedType: Type (Abbreviation | ParameterTypes)*
    @Test
    public void testAbbreviatedType() {

    }

    @Test
    public void testAbstractedType() {

    }

    @Test
    public void testAnnotation() {

    }

    @Test
    public void testArguments() {

    }

    @Test
    public void testAssignment() {

    }

    @Test
    public void testAtom() {

    }

    @Test
    public void testAttributeGetter() {

    }

    @Test
    public void testAttributeHeader() {

    }

    @Test
    public void testAttribute() {

    }

    @Test
    public void testAttributeMeta() {

    }

    @Test
    public void testAttributeSetter() {

    }

    @Test
    public void testBlock() {

    }

    @Test
    public void testBooleanCondition() {

    }

    @Test
    public void testBreak() {

    }

    @Test
    public void testCallableParam() {

    }

    @Test
    public void testCallableReference() {

    }

    @Test
    public void testCallableVariable() {

    }

    @Test
    public void testCaseItem() {

    }

    @Test
    public void testCase() {

    }

    @Test
    public void testCases() {

    }

    @Test
    public void testCaseType() {

    }

    @Test
    public void testCaseTypes() {

    }

    @Test
    public void testCatch() {

    }

    @Test
    public void testClassBody() {

    }

    @Test
    public void testClassHeader() {

    }

    @Test
    public void testClassInheritance() {

    }

    @Test
    public void testClass() {

    }

    @Test
    public void testCompilationUnit() {

    }

    @Test
    public void testCondition() {

    }

    @Test
    public void testContinue() {

    }

    @Test
    public void testControlStructure() {

    }

    @Test
    public void testDeclaration() {

    }

    @Test
    public void testDefaultCaseItem() {

    }

    @Test
    public void testDefaultParam() {

    }

    @Test
    public void testDirective() {

    }

    @Test
    public void testDirectiveStatement() {

    }

    @Test
    public void testElse() {

    }

    @Test
    public void testEntryParamPair() {

    }

    @Test
    public void testEntryType() {

    }

    @Test
    public void testEntryVariablePair() {

    }

    @Test
    public void testExistsOrIsNonEmptyCondition() {

    }

    @Test
    public void testExpression() {

    }

    @Test
    public void testExpressionStatement() {

    }

    @Test
    public void testExtendedType() {

    }

    @Test
    public void testFail() {

    }

    @Test
    public void testFinally() {

    }

    @Test
    public void testForFail() {

    }

    @Test
    public void testForIterator() {

    }

    @Test
    public void testFor() {

    }

    @Test
    public void testFullPackageName() {

    }

    @Test
    public void testFunction() {

    }

    @Test
    public void testFunctionalArguments() {

    }

    @Test
    public void testFunctionalBody() {

    }

    @Test
    public void testFunctionalNamedArgument() {

    }

    @Test
    public void testFunctionMeta() {

    }

    @Test
    public void testIfElse() {

    }

    @Test
    public void testIf() {

    }

    @Test
    public void testImportElement() {

    }

    @Test
    public void testImportElements() {

    }

    @Test
    public void testImport() {

    }

    @Test
    public void testImportMethodAttributeElement() {

    }

    @Test
    public void testImportTypeElement() {

    }

    @Test
    public void testImportWildcard() {

    }

    @Test
    public void testIncrementOrDecrement() {

    }

    @Test
    public void testInitializer() {

    }

    @Test
    public void testInitializerReference() {

    }

    @Test
    public void testInterfaceBody() {

    }

    @Test
    public void testInterfaceHeader() {

    }

    @Test
    public void testInterfaceInheritance() {

    }

    @Test
    public void testInterface() {

    }

    @Test
    public void testIntersectionType() {

    }

    @Test
    public void testInvocation() {

    }

    @Test
    public void testIsCondition() {

    }

    @Test
    public void testIteratorVariable() {

    }

    @Test
    public void testLiteral() {

    }

    @Test
    public void testLocalNamedArgument() {

    }

    @Test
    public void testLoopCondition() {

    }

    @Test
    public void testMemberName() {

    }

    @Test
    public void testMemberReference() {

    }

    @Test
    public void testMeta() {

    }

    @Test
    public void testMethodAttributeAlias() {

    }

    @Test
    public void testMethodHeader() {

    }

    @Test
    public void testMethod() {

    }

    @Test
    public void testMethodMeta() {

    }

    @Test
    public void testMethodReference() {

    }

    @Test
    public void testNamedArgument() {

    }

    @Test
    public void testNamedArguments() {

    }

    @Test
    public void testObjectHeader() {

    }

    @Test
    public void testObjectInheritance() {

    }

    @Test
    public void testObject() {

    }

    @Test
    public void testOperatorExpression() {

    }

    @Test
    public void testPackageName() {

    }

    @Test
    public void testParam() {

    }

    @Test
    public void testParameterTypes() {

    }

    @Test
    public void testParams() {

    }

    @Test
    public void testParExpression() {

    }

    @Test
    public void testPositionalArgument() {

    }

    @Test
    public void testPositionalArguments() {

    }

    @Test
    public void testPrimary() {

    }

    @Test
    public void testReciever() {

    }

    @Test
    public void testResource() {

    }

    @Test
    public void testReturn() {

    }

    @Test
    public void testSatisfiedTypes() {

    }

    @Test
    public void testSatisfiesCondition() {

    }

    @Test
    public void testSelfReference() {

    }

    @Test
    public void testSequencedParam() {

    }

    @Test
    public void testSequencedType() {

    }

    @Test
    public void testSequencedTypeParam() {

    }

    @Test
    public void testSequenceInstantiation() {

    }

    @Test
    public void testSequence() {

    }

    @Test
    public void testSimpleAttribute() {

    }

    @Test
    public void testSimpleParam() {

    }

    @Test
    public void testSpecification() {

    }

    @Test
    public void testSpecifiedNamedArgument() {

    }

    @Test
    public void testSpecifier() {

    }

    @Test
    public void testStatement() {

    }

    @Test
    public void testStringTemplate() {

    }

    @Test
    public void testSwitchCaseElse() {

    }

    @Test
    public void testSwitch() {

    }

    @Test
    public void testThrow() {

    }

    @Test
    public void testTopLevelDeclaration() {

    }

    @Test
    public void testTryCatchFinally() {

    }

    @Test
    public void testTry() {

    }

    @Test
    public void testTypeAlias() {

    }

    @Test
    public void testTypeArguments() {

    }

    @Test
    public void testTypeConstraint() {

    }

    @Test
    public void testTypeConstraints() {

    }

    @Test
    public void testTypeConstraintInheritance() {

    }

    @Test
    public void testTypeDeclaration() {

    }

    @Test
    public void testTypedVariable() {

    }

    @Test
    public void testType() {

    }

    @Test
    public void testTypeMeta() {

    }

    @Test
    public void testTypeName() {

    }

    @Test
    public void testTypeNameWithArguments() {

    }

    @Test
    public void testTypeParam() {

    }

    @Test
    public void testTypeParams() {

    }

    @Test
    public void testTypeSpecifier() {

    }

    @Test
    public void testUnionType() {
        parseLines("uniontype.lines.pass.ceylon", CeylonElementTypes.UNION_TYPE, CeylonElementTypes.ATTRIBUTE_HEADER);
        assertEmpty(failParseLines("uniontype.lines.fail.ceylon", CeylonElementTypes.UNION_TYPE, CeylonElementTypes.ATTRIBUTE_HEADER));
    }

    @Test
    public void testValueMeta() {

    }

    @Test
    public void testValueReference() {

    }

    @Test
    public void testVariable() {

    }

    @Test
    public void testVariance() {

    }

    @Test
    public void testWhile() {

    }
}
