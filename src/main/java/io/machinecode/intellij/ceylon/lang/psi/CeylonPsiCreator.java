package io.machinecode.intellij.ceylon.lang.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAbbreviatedTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAbbreviationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAbstractedTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAdaptedTypesImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAnnotationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAssignmentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAtomImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeGetterImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeHeaderImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonAttributeSetterImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonBlockImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonBooleanConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonBreakImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCallableParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCallableReferenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCallableVariableImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseItemImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCaseTypesImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCasesImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonCatchImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassBodyImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassHeaderImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonClassInheritanceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonContinueImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonControlStructureImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonDeclarationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonDefaultCaseItemImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonDirectiveImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonDirectiveStatementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonElseImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonEntryParamPairImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonEntryTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonEntryVariablePairImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonExistsOrIsNonemptyConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonExpressionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonExpressionStatementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonExtendedTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFailImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFinallyImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonForFailImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonForImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonForIteratorImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFullPackageNameImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionalArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionalBodyImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonFunctionalNamedArgumentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIfElseImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIfImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportElementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportElementsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportMethodAttributeElementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportTypeElementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonImportWildcardImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIncrementOrDecrementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInitializerImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInitializerReferenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceBodyImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceHeaderImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInterfaceInheritanceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIntersectionTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonInvocationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIsConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonIteratorVariableImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonLiteralImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonLocalNamedArgumentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonLoopConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMemberNameImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMetaTypesImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodAttributeAliasImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodHeaderImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonMethodReferenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonNamedArgumentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonNamedArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectHeaderImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonObjectInheritanceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonOperatorExpressionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonOperatorImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonPackageNameImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonParExpressionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonParamsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonPositionalArgumentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonPositionalArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonPrimaryImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonReceiverImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonResourceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonReturnImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSatisfiedTypesImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSatisfiesConditionImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSelfReferenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequenceInstantiationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequencedParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequencedTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSequencedTypeParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSimpleAttributeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSimpleParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecificationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecifiedNamedArgumentImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSpecifierImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonStatementImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonStringTemplateImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSwitchCaseElseImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonSwitchImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonThrowImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTopLevelDeclarationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTryCatchFinallyImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTryImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeAliasImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeConstraintImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeConstraintInheritanceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeConstraintsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeDeclarationImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeNameImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeNameWithArgumentsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeParamImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeParamsImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypeSpecifierImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonTypedVariableImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonUnionTypeImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonValueMetaImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonValueReferenceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonVariableImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonVarianceImpl;
import io.machinecode.intellij.ceylon.lang.psi.impl.CeylonWhileImpl;

import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ABBREVIATED_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ABBREVIATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ABSTRACTED_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ADAPTED_TYPES;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ANNOTATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ASSIGNMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATOM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_GETTER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_HEADER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_SETTER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.BLOCK;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.BOOLEAN_CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.BREAK;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CALLABLE_PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CALLABLE_REFERENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CALLABLE_VARIABLE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASES;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE_ITEM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASE_TYPES;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CATCH;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_BODY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_HEADER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_INHERITANCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONTINUE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONTROL_STRUCTURE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.DECLARATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.DEFAULT_CASE_ITEM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.DIRECTIVE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.DIRECTIVE_STATEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ELSE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ENTRY_PARAM_PAIR;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ENTRY_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ENTRY_VARIABLE_PAIR;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXISTS_OR_IS_NONEMPTY_CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXPRESSION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXPRESSION_STATEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.EXTENDED_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FAIL;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FINALLY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FOR;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FOR_FAIL;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FOR_ITERATOR;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FULL_PACKAGE_NAME;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FUNCTION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FUNCTIONAL_ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FUNCTIONAL_BODY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FUNCTIONAL_NAMED_ARGUMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.FUNCTION_META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IF;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IF_ELSE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_ELEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_ELEMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_METHOD_ATTRIBUTE_ELEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_TYPE_ELEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IMPORT_WILDCARD;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INCREMENT_OR_DECREMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INITIALIZER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INITIALIZER_REFERENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE_BODY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE_HEADER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE_INHERITANCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERSECTION_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.INVOCATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.IS_CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.ITERATOR_VARIABLE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.LITERAL;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.LOCAL_NAMED_ARGUMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.LOOP_CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.MEMBER_NAME;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.META_TYPES;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_ATTRIBUTE_ALIAS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_HEADER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_REFERENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.NAMED_ARGUMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.NAMED_ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT_HEADER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT_INHERITANCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.OPERATOR;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.OPERATOR_EXPRESSION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.PACKAGE_NAME;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.PARAMS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.PAR_EXPRESSION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.POSITIONAL_ARGUMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.POSITIONAL_ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.PRIMARY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.RECEIVER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.RESOURCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.RETURN;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SATISFIED_TYPES;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SATISFIES_CONDITION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SELF_REFERENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SEQUENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SEQUENCED_PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SEQUENCED_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SEQUENCED_TYPE_PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SEQUENCE_INSTANTIATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SIMPLE_ATTRIBUTE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SIMPLE_PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SPECIFICATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SPECIFIED_NAMED_ARGUMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SPECIFIER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.STATEMENT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.STRING_TEMPLATE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SWITCH;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.SWITCH_CASE_ELSE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.THROW;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TOP_LEVEL_DECLARATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TRY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TRY_CATCH_FINALLY;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPED_VARIABLE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_ALIAS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_CONSTRAINT;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_CONSTRAINTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_CONSTRAINT_INHERITANCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_DECLARATION;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_NAME;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_NAME_WITH_ARGUMENTS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_PARAM;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_PARAMS;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_SPECIFIER;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.UNION_TYPE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.VALUE_META;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.VALUE_REFERENCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.VARIABLE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.VARIANCE;
import static io.machinecode.intellij.ceylon.lang.CeylonElementTypes.WHILE;

public class CeylonPsiCreator {

    public static PsiElement createElement(final ASTNode node) {
        final IElementType type = node.getElementType();
        if (type == ABBREVIATION) return new CeylonAbbreviationImpl(node);
        if (type == ABBREVIATED_TYPE) return new CeylonAbbreviatedTypeImpl(node);
        if (type == ABSTRACTED_TYPE) return new CeylonAbstractedTypeImpl(node);
        if (type == ADAPTED_TYPES) return new CeylonAdaptedTypesImpl(node);
        if (type == ANNOTATION) return new CeylonAnnotationImpl(node);
        if (type == ARGUMENTS) return new CeylonArgumentsImpl(node);
        if (type == ASSIGNMENT) return new CeylonAssignmentImpl(node);
        if (type == ATOM) return new CeylonAtomImpl(node);
        if (type == ATTRIBUTE_GETTER) return new CeylonAttributeGetterImpl(node);
        if (type == ATTRIBUTE_HEADER) return new CeylonAttributeHeaderImpl(node);
        if (type == ATTRIBUTE) return new CeylonAttributeImpl(node);
        if (type == ATTRIBUTE_META) return new CeylonAttributeMetaImpl(node);
        if (type == ATTRIBUTE_SETTER) return new CeylonAttributeSetterImpl(node);
        if (type == BLOCK) return new CeylonBlockImpl(node);
        if (type == BOOLEAN_CONDITION) return new CeylonBooleanConditionImpl(node);
        if (type == BREAK) return new CeylonBreakImpl(node);
        if (type == CALLABLE_PARAM) return new CeylonCallableParamImpl(node);
        if (type == CALLABLE_REFERENCE) return new CeylonCallableReferenceImpl(node);
        if (type == CALLABLE_VARIABLE) return new CeylonCallableVariableImpl(node);
        if (type == CASE_ITEM) return new CeylonCaseItemImpl(node);
        if (type == CASE) return new CeylonCaseImpl(node);
        if (type == CASES) return new CeylonCasesImpl(node);
        if (type == CASE_TYPE) return new CeylonCaseTypeImpl(node);
        if (type == CASE_TYPES) return new CeylonCaseTypesImpl(node);
        if (type == CATCH) return new CeylonCatchImpl(node);
        if (type == CLASS_BODY) return new CeylonClassBodyImpl(node);
        if (type == CLASS_HEADER) return new CeylonClassHeaderImpl(node);
        if (type == CLASS_INHERITANCE) return new CeylonClassInheritanceImpl(node);
        if (type == CLASS) return new CeylonClassImpl(node);
        //if (type == COMPILATION_UNIT) return new CeylonCompilationUnitImpl(node);
        if (type == CONDITION) return new CeylonConditionImpl(node);
        if (type == CONTINUE) return new CeylonContinueImpl(node);
        if (type == CONTROL_STRUCTURE) return new CeylonControlStructureImpl(node);
        if (type == DECLARATION) return new CeylonDeclarationImpl(node);
        if (type == DEFAULT_CASE_ITEM) return new CeylonDefaultCaseItemImpl(node);
        if (type == DIRECTIVE) return new CeylonDirectiveImpl(node);
        if (type == DIRECTIVE_STATEMENT) return new CeylonDirectiveStatementImpl(node);
        if (type == ELSE) return new CeylonElseImpl(node);
        if (type == ENTRY_PARAM_PAIR) return new CeylonEntryParamPairImpl(node);
        if (type == ENTRY_TYPE) return new CeylonEntryTypeImpl(node);
        if (type == ENTRY_VARIABLE_PAIR) return new CeylonEntryVariablePairImpl(node);
        if (type == EXISTS_OR_IS_NONEMPTY_CONDITION) return new CeylonExistsOrIsNonemptyConditionImpl(node);
        if (type == EXPRESSION) return new CeylonExpressionImpl(node);
        if (type == EXPRESSION_STATEMENT) return new CeylonExpressionStatementImpl(node);
        if (type == EXTENDED_TYPE) return new CeylonExtendedTypeImpl(node);
        if (type == FAIL) return new CeylonFailImpl(node);
        if (type == FINALLY) return new CeylonFinallyImpl(node);
        if (type == FOR_FAIL) return new CeylonForFailImpl(node);
        if (type == FOR_ITERATOR) return new CeylonForIteratorImpl(node);
        if (type == FOR) return new CeylonForImpl(node);
        if (type == FULL_PACKAGE_NAME) return new CeylonFullPackageNameImpl(node);
        if (type == FUNCTION) return new CeylonFunctionImpl(node);
        if (type == FUNCTIONAL_ARGUMENTS) return new CeylonFunctionalArgumentsImpl(node);
        if (type == FUNCTIONAL_BODY) return new CeylonFunctionalBodyImpl(node);
        if (type == FUNCTIONAL_NAMED_ARGUMENT) return new CeylonFunctionalNamedArgumentImpl(node);
        if (type == FUNCTION_META) return new CeylonFunctionMetaImpl(node);
        if (type == IF_ELSE) return new CeylonIfElseImpl(node);
        if (type == IF) return new CeylonIfImpl(node);
        if (type == IMPORT_ELEMENT) return new CeylonImportElementImpl(node);
        if (type == IMPORT_ELEMENTS) return new CeylonImportElementsImpl(node);
        if (type == IMPORT) return new CeylonImportImpl(node);
        if (type == IMPORT_METHOD_ATTRIBUTE_ELEMENT) return new CeylonImportMethodAttributeElementImpl(node);
        if (type == IMPORT_TYPE_ELEMENT) return new CeylonImportTypeElementImpl(node);
        if (type == IMPORT_WILDCARD) return new CeylonImportWildcardImpl(node);
        if (type == INCREMENT_OR_DECREMENT) return new CeylonIncrementOrDecrementImpl(node);
        if (type == INITIALIZER) return new CeylonInitializerImpl(node);
        if (type == INITIALIZER_REFERENCE) return new CeylonInitializerReferenceImpl(node);
        if (type == INTERFACE_BODY) return new CeylonInterfaceBodyImpl(node);
        if (type == INTERFACE_HEADER) return new CeylonInterfaceHeaderImpl(node);
        if (type == INTERFACE_INHERITANCE) return new CeylonInterfaceInheritanceImpl(node);
        if (type == INTERFACE) return new CeylonInterfaceImpl(node);
        if (type == INTERSECTION_TYPE) return new CeylonIntersectionTypeImpl(node);
        if (type == INVOCATION) return new CeylonInvocationImpl(node);
        if (type == IS_CONDITION) return new CeylonIsConditionImpl(node);
        if (type == ITERATOR_VARIABLE) return new CeylonIteratorVariableImpl(node);
        if (type == LITERAL) return new CeylonLiteralImpl(node);
        if (type == LOCAL_NAMED_ARGUMENT) return new CeylonLocalNamedArgumentImpl(node);
        if (type == LOOP_CONDITION) return new CeylonLoopConditionImpl(node);
        if (type == MEMBER_NAME) return new CeylonMemberNameImpl(node);
        if (type == META) return new CeylonMetaImpl(node);
        if (type == META_TYPES) return new CeylonMetaTypesImpl(node);
        if (type == METHOD_ATTRIBUTE_ALIAS) return new CeylonMethodAttributeAliasImpl(node);
        if (type == METHOD_HEADER) return new CeylonMethodHeaderImpl(node);
        if (type == METHOD) return new CeylonMethodImpl(node);
        if (type == METHOD_META) return new CeylonMethodMetaImpl(node);
        if (type == METHOD_REFERENCE) return new CeylonMethodReferenceImpl(node);
        if (type == NAMED_ARGUMENT) return new CeylonNamedArgumentImpl(node);
        if (type == NAMED_ARGUMENTS) return new CeylonNamedArgumentsImpl(node);
        if (type == OBJECT_HEADER) return new CeylonObjectHeaderImpl(node);
        if (type == OBJECT_INHERITANCE) return new CeylonObjectInheritanceImpl(node);
        if (type == OBJECT) return new CeylonObjectImpl(node);
        if (type == OPERATOR_EXPRESSION) return new CeylonOperatorExpressionImpl(node);
        if (type == OPERATOR) return new CeylonOperatorImpl(node);
        if (type == PACKAGE_NAME) return new CeylonPackageNameImpl(node);
        if (type == PARAM) return new CeylonParamImpl(node);
        if (type == PARAMS) return new CeylonParamsImpl(node);
        if (type == PAR_EXPRESSION) return new CeylonParExpressionImpl(node);
        if (type == POSITIONAL_ARGUMENT) return new CeylonPositionalArgumentImpl(node);
        if (type == POSITIONAL_ARGUMENTS) return new CeylonPositionalArgumentsImpl(node);
        if (type == PRIMARY) return new CeylonPrimaryImpl(node);
        if (type == RECEIVER) return new CeylonReceiverImpl(node);
        if (type == RESOURCE) return new CeylonResourceImpl(node);
        if (type == RETURN) return new CeylonReturnImpl(node);
        if (type == SATISFIED_TYPES) return new CeylonSatisfiedTypesImpl(node);
        if (type == SATISFIES_CONDITION) return new CeylonSatisfiesConditionImpl(node);
        if (type == SELF_REFERENCE) return new CeylonSelfReferenceImpl(node);
        if (type == SEQUENCED_PARAM) return new CeylonSequencedParamImpl(node);
        if (type == SEQUENCED_TYPE) return new CeylonSequencedTypeImpl(node);
        if (type == SEQUENCED_TYPE_PARAM) return new CeylonSequencedTypeParamImpl(node);
        if (type == SEQUENCE_INSTANTIATION) return new CeylonSequenceInstantiationImpl(node);
        if (type == SEQUENCE) return new CeylonSequenceImpl(node);
        if (type == SIMPLE_ATTRIBUTE) return new CeylonSimpleAttributeImpl(node);
        if (type == SIMPLE_PARAM) return new CeylonSimpleParamImpl(node);
        if (type == SPECIFICATION) return new CeylonSpecificationImpl(node);
        if (type == SPECIFIED_NAMED_ARGUMENT) return new CeylonSpecifiedNamedArgumentImpl(node);
        if (type == SPECIFIER) return new CeylonSpecifierImpl(node);
        if (type == STATEMENT) return new CeylonStatementImpl(node);
        if (type == STRING_TEMPLATE) return new CeylonStringTemplateImpl(node);
        if (type == SWITCH_CASE_ELSE) return new CeylonSwitchCaseElseImpl(node);
        if (type == SWITCH) return new CeylonSwitchImpl(node);
        if (type == THROW) return new CeylonThrowImpl(node);
        if (type == TOP_LEVEL_DECLARATION) return new CeylonTopLevelDeclarationImpl(node);
        if (type == TRY_CATCH_FINALLY) return new CeylonTryCatchFinallyImpl(node);
        if (type == TRY) return new CeylonTryImpl(node);
        if (type == TYPE_ALIAS) return new CeylonTypeAliasImpl(node);
        if (type == TYPE_ARGUMENTS) return new CeylonTypeArgumentsImpl(node);
        if (type == TYPE_CONSTRAINT) return new CeylonTypeConstraintImpl(node);
        if (type == TYPE_CONSTRAINTS) return new CeylonTypeConstraintsImpl(node);
        if (type == TYPE_CONSTRAINT_INHERITANCE) return new CeylonTypeConstraintInheritanceImpl(node);
        if (type == TYPE_DECLARATION) return new CeylonTypeDeclarationImpl(node);
        if (type == TYPED_VARIABLE) return new CeylonTypedVariableImpl(node);
        if (type == TYPE) return new CeylonTypeImpl(node);
        if (type == TYPE_META) return new CeylonTypeMetaImpl(node);
        if (type == TYPE_NAME) return new CeylonTypeNameImpl(node);
        if (type == TYPE_NAME_WITH_ARGUMENTS) return new CeylonTypeNameWithArgumentsImpl(node);
        if (type == TYPE_PARAM) return new CeylonTypeParamImpl(node);
        if (type == TYPE_PARAMS) return new CeylonTypeParamsImpl(node);
        if (type == TYPE_SPECIFIER) return new CeylonTypeSpecifierImpl(node);
        if (type == UNION_TYPE) return new CeylonUnionTypeImpl(node);
        if (type == VALUE_META) return new CeylonValueMetaImpl(node);
        if (type == VALUE_REFERENCE) return new CeylonValueReferenceImpl(node);
        if (type == VARIABLE) return new CeylonVariableImpl(node);
        if (type == VARIANCE) return new CeylonVarianceImpl(node);
        if (type == WHILE) return new CeylonWhileImpl(node);

        return new ASTWrapperPsiElement(node);
    }
}