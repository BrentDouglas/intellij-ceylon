package au.com.machinecode.intellij.ceylon.lang.psi;

import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAdaptedTypesImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAnnotationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonArgumentsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAssignmentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAtomImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeGetterImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeHeaderImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeSetterImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonBlockImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonBooleanConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonBreakImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCallableReferenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCallableVariableImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseItemImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseTypesImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCasesImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCatchImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCharacterLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassBodyImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassHeaderImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassInheritanceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassTypeConstraintsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonCommentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonContinueImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonControlStructureImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonDeclarationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonDefaultCaseItemImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonDirectiveImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonDirectiveStatementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonElseImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonEntryVariablePairImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonExistsOrIsNonemptyConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonExpressionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonExpressionStatementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonExtendedTypeImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFailImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFinallyImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFloatLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonForFailImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonForImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonForIteratorImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFullPackageNameImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionalArgumentsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionalNamedArgumentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIdentifierImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIfElseImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIfImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportElementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportElementsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportMethodAttributeElementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportTypeElementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportWildcardImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIncrementOrDecrementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInitializerImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInitializerReferenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIntegerLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceBodyImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceHeaderImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceInheritanceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonInvocationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIsConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonIteratorVariableImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonLocalNamedArgumentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonLoopConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMemberNameImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMetaTypesImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodAttributeAliasImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodHeaderImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodReferenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonNamedArgumentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonNamedArgumentsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectHeaderImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectInheritanceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonOperatorExpressionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonOperatorImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonPackageNameImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonParExpressionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonParamsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonPositionalArgumentsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonPrimaryImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonQuotedLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonReceiverImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonResourceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonReturnImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSatisfiedTypesImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSatisfiesConditionImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSelfReferenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequenceInstantiationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSimpleAttributeImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecificationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecifiedNamedArgumentImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecifierImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonStatementImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonStringLiteralImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonStringTemplateImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSwitchCaseElseImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonSwitchImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonThrowImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTopLevelDeclarationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTryCatchFinallyImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTryImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeAliasImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeArgumentsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeConstraintsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeDeclarationImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeNameImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeParamsImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeSpecifierImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypedVariableImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonUnionTypeImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonValueMetaImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonValueReferenceImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonVariableImpl;
import au.com.machinecode.intellij.ceylon.lang.psi.impl.CeylonWhileImpl;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.*;

public class CeylonPsiCreator {

    public static PsiElement createElement(final ASTNode node) {
        final IElementType type = node.getElementType();

        if (type == ADAPTED_TYPES) return new CeylonAdaptedTypesImpl();
        if (type == ANNOTATION) return new CeylonAnnotationImpl();
        if (type == ARGUMENTS) return new CeylonArgumentsImpl();
        if (type == ASSIGNMENT) return new CeylonAssignmentImpl();
        if (type == ATOM) return new CeylonAtomImpl();
        if (type == ATTRIBUTE_GETTER) return new CeylonAttributeGetterImpl();
        if (type == ATTRIBUTE_HEADER) return new CeylonAttributeHeaderImpl();
        if (type == ATTRIBUTE) return new CeylonAttributeImpl();
        if (type == ATTRIBUTE_META) return new CeylonAttributeMetaImpl();
        if (type == ATTRIBUTE_SETTER) return new CeylonAttributeSetterImpl();
        if (type == BLOCK) return new CeylonBlockImpl();
        if (type == BOOLEAN_CONDITION) return new CeylonBooleanConditionImpl();
        if (type == BREAK) return new CeylonBreakImpl();
        if (type == CALLABLE_REFERENCE) return new CeylonCallableReferenceImpl();
        if (type == CALLABLE_VARIABLE) return new CeylonCallableVariableImpl();
        if (type == CASE_ITEM) return new CeylonCaseItemImpl();
        if (type == CASE) return new CeylonCaseImpl();
        if (type == CASES) return new CeylonCasesImpl();
        if (type == CASE_TYPES) return new CeylonCaseTypesImpl();
        if (type == CATCH) return new CeylonCatchImpl();
        if (type == CHARACTER_LITERAL) return new CeylonCharacterLiteralImpl();
        if (type == CLASS_BODY) return new CeylonClassBodyImpl();
        if (type == CLASS_HEADER) return new CeylonClassHeaderImpl();
        if (type == CLASS_INHERITANCE) return new CeylonClassInheritanceImpl();
        if (type == CLASS) return new CeylonClassImpl();
        if (type == CLASS_TYPE_CONSTRAINTS) return new CeylonClassTypeConstraintsImpl();
        if (type == COMMENTS) return new CeylonCommentImpl();
        //if (type == COMPILATION_UNIT) return new CeylonCompilationUnitImpl();
        if (type == CONDITION) return new CeylonConditionImpl();
        if (type == CONTINUE) return new CeylonContinueImpl();
        if (type == CONTROL_STRUCTURE) return new CeylonControlStructureImpl();
        if (type == DECLARATION) return new CeylonDeclarationImpl();
        if (type == DEFAULT_CASE_ITEM) return new CeylonDefaultCaseItemImpl();
        if (type == DIRECTIVE) return new CeylonDirectiveImpl();
        if (type == DIRECTIVE_STATEMENT) return new CeylonDirectiveStatementImpl();
        if (type == ELSE) return new CeylonElseImpl();
        if (type == ENTRY_VARIABLE_PAIR) return new CeylonEntryVariablePairImpl();
        if (type == EXISTS_OR_IS_NONEMPTY_CONDITION) return new CeylonExistsOrIsNonemptyConditionImpl();
        if (type == EXPRESSIONS) return new CeylonExpressionImpl();
        if (type == EXPRESSION_STATEMENT) return new CeylonExpressionStatementImpl();
        if (type == EXTENDED_TYPE) return new CeylonExtendedTypeImpl();
        if (type == FAIL) return new CeylonFailImpl();
        if (type == FINALLY) return new CeylonFinallyImpl();
        if (type == FLOAT_LITERAL) return new CeylonFloatLiteralImpl();
        if (type == FOR_FAIL) return new CeylonForFailImpl();
        if (type == FOR_ITERATOR) return new CeylonForIteratorImpl();
        if (type == FOR) return new CeylonForImpl();
        if (type == FULL_PACKAGE_NAME) return new CeylonFullPackageNameImpl();
        if (type == FUNCTIONAL_ARGUMENTS) return new CeylonFunctionalArgumentsImpl();
        if (type == FUNCTIONAL_NAMED_ARGUMENT) return new CeylonFunctionalNamedArgumentImpl();
        if (type == FUNCTIONAL_META) return new CeylonFunctionMetaImpl();
        if (type == IDENTIFIER) return new CeylonIdentifierImpl();
        if (type == IF_ELSE) return new CeylonIfElseImpl();
        if (type == IF) return new CeylonIfImpl();
        if (type == IMPORT_ELEMENT) return new CeylonImportElementImpl();
        if (type == IMPORT_ELEMENTS) return new CeylonImportElementsImpl();
        if (type == IMPORT) return new CeylonImportImpl();
        if (type == IMPORT_METHOD_ATTRIBUTE_ELEMENT) return new CeylonImportMethodAttributeElementImpl();
        if (type == IMPORT_TYPE_ELEMENT) return new CeylonImportTypeElementImpl();
        if (type == IMPORT_WILDCARD) return new CeylonImportWildcardImpl();
        if (type == INCREMENT_OR_DECREMENT) return new CeylonIncrementOrDecrementImpl();
        if (type == INITIALIZER) return new CeylonInitializerImpl();
        if (type == INITIALIZER_REFERENCE) return new CeylonInitializerReferenceImpl();
        if (type == INTEGER_LITERAL) return new CeylonIntegerLiteralImpl();
        if (type == INTERFACE_BODY) return new CeylonInterfaceBodyImpl();
        if (type == INTERFACE_HEADER) return new CeylonInterfaceHeaderImpl();
        if (type == INTERFACE_INHERITANCE) return new CeylonInterfaceInheritanceImpl();
        if (type == INTERFACE) return new CeylonInterfaceImpl();
        if (type == INVOCATION) return new CeylonInvocationImpl();
        if (type == IS_CONDITION) return new CeylonIsConditionImpl();
        if (type == ITERATOR_VARIABLE) return new CeylonIteratorVariableImpl();
        if (type == LITERAL) return new CeylonLiteralImpl();
        if (type == LOCAL_NAMED_ARGUMENT) return new CeylonLocalNamedArgumentImpl();
        if (type == LOOP_CONDITION) return new CeylonLoopConditionImpl();
        if (type == MEMBER_NAME) return new CeylonMemberNameImpl();
        if (type == META) return new CeylonMetaImpl();
        if (type == META_TYPES) return new CeylonMetaTypesImpl();
        if (type == METHOD_ATTRIBUTE_ALIAS) return new CeylonMethodAttributeAliasImpl();
        if (type == METHOD_HEADER) return new CeylonMethodHeaderImpl();
        if (type == METHOD) return new CeylonMethodImpl();
        if (type == METHOD_META) return new CeylonMethodMetaImpl();
        if (type == METHOD_REFERENCE) return new CeylonMethodReferenceImpl();
        if (type == NAMED_ARGUMENT) return new CeylonNamedArgumentImpl();
        if (type == NAMED_ARGUMENTS) return new CeylonNamedArgumentsImpl();
        if (type == OBJECT_HEADER) return new CeylonObjectHeaderImpl();
        if (type == OBJECT_INHERITANCE) return new CeylonObjectInheritanceImpl();
        if (type == OBJECT) return new CeylonObjectImpl();
        if (type == OPERATOR_EXPRESSION) return new CeylonOperatorExpressionImpl();
        if (type == OPERATOR) return new CeylonOperatorImpl();
        if (type == PACKAGE_NAME) return new CeylonPackageNameImpl();
        if (type == PARAMS) return new CeylonParamsImpl();
        if (type == PAR_EXPRESSION) return new CeylonParExpressionImpl();
        if (type == POSITIONAL_ARGUMENTS) return new CeylonPositionalArgumentsImpl();
        if (type == PRIMARY) return new CeylonPrimaryImpl();
        if (type == QUOTED_LITERAL) return new CeylonQuotedLiteralImpl();
        if (type == RECEIVER) return new CeylonReceiverImpl();
        if (type == RESOURCE) return new CeylonResourceImpl();
        if (type == RETURN) return new CeylonReturnImpl();
        if (type == SATISFIED_TYPES) return new CeylonSatisfiedTypesImpl();
        if (type == SATISFIES_CONDITION) return new CeylonSatisfiesConditionImpl();
        if (type == SELF_REFERENCE) return new CeylonSelfReferenceImpl();
        if (type == SEQUENCE_INSTANTIATION) return new CeylonSequenceInstantiationImpl();
        if (type == SEQUENCE) return new CeylonSequenceImpl();
        if (type == SIMPLE_ATTRIBUTE) return new CeylonSimpleAttributeImpl();
        if (type == SPECIFICATION) return new CeylonSpecificationImpl();
        if (type == SPECIFIED_NAMED_ARGUMENT) return new CeylonSpecifiedNamedArgumentImpl();
        if (type == SPECIFIER) return new CeylonSpecifierImpl();
        if (type == STATEMENT) return new CeylonStatementImpl();
        if (type == STRING_LITERAL) return new CeylonStringLiteralImpl();
        if (type == STRING_TEMPLATE) return new CeylonStringTemplateImpl();
        if (type == SWITCH_CASE_ELSE) return new CeylonSwitchCaseElseImpl();
        if (type == SWITCH) return new CeylonSwitchImpl();
        if (type == THROW) return new CeylonThrowImpl();
        if (type == TOP_LEVEL_DECLARATION) return new CeylonTopLevelDeclarationImpl();
        if (type == TRY_CATCH_FINALLY) return new CeylonTryCatchFinallyImpl();
        if (type == TRY) return new CeylonTryImpl();
        if (type == TYPE_ALIAS) return new CeylonTypeAliasImpl();
        if (type == TYPE_ARGUMENTS) return new CeylonTypeArgumentsImpl();
        if (type == TYPE_CONSTRAINTS) return new CeylonTypeConstraintsImpl();
        if (type == TYPE_DECLARATION) return new CeylonTypeDeclarationImpl();
        if (type == TYPED_VARIABLE) return new CeylonTypedVariableImpl();
        if (type == TYPE) return new CeylonTypeImpl();
        if (type == TYPE_META) return new CeylonTypeMetaImpl();
        if (type == TYPE_NAME) return new CeylonTypeNameImpl();
        if (type == TYPE_PARAMS) return new CeylonTypeParamsImpl();
        if (type == TYPE_SPECIFIER) return new CeylonTypeSpecifierImpl();
        if (type == UNION_TYPE) return new CeylonUnionTypeImpl();
        if (type == VALUE_META) return new CeylonValueMetaImpl();
        if (type == VALUE_REFERENCE) return new CeylonValueReferenceImpl();
        if (type == VARIABLE) return new CeylonVariableImpl();
        if (type == WHILE) return new CeylonWhileImpl();

        return new ASTWrapperPsiElement(node);
    }
}