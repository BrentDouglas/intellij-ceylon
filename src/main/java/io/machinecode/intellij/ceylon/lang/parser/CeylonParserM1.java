package io.machinecode.intellij.ceylon.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import io.machinecode.intellij.ceylon.CeylonBundle;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParserM1 extends CeylonParser {

    public static final CeylonParserM1 INSTANCE = new CeylonParserM1();

    /*
     * Main entry point
     */
    @NotNull
    public ASTNode parse(final IElementType root, final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (root == ABBREVIATION) parseAbbreviation(builder);
        if (root == ABBREVIATED_TYPE) parseAbbreviatedType(builder);
        if (root == ABSTRACTED_TYPE) parseAbstractedType(builder);
        //if (root == ADAPTED_TYPES) parseAdaptedTypes(builder);
        if (root == ANNOTATION) parseAnnotation(builder);
        if (root == ARGUMENTS) parseArguments(builder);
        if (root == ASSIGNMENT) parseAssignment(builder);
        if (root == ATOM) parseAtom(builder);
        if (root == ATTRIBUTE_GETTER) parseAttributeGetter(builder);
        if (root == ATTRIBUTE_HEADER) parseAttributeHeader(builder);
        if (root == ATTRIBUTE) parseAttribute(builder);
        if (root == ATTRIBUTE_META) parseAttributeMeta(builder);
        if (root == ATTRIBUTE_SETTER) parseAttributeSetter(builder);
        if (root == BLOCK) parseBlock(builder);
        if (root == BOOLEAN_CONDITION) parseBooleanCondition(builder);
        if (root == BREAK) parseBreak(builder);
        if (root == CALLABLE_PARAM) parseCallableParam(builder);
        if (root == CALLABLE_REFERENCE) parseCallableReference(builder);
        if (root == CALLABLE_VARIABLE) parseCallableVariable(builder);
        if (root == CASE_ITEM) parseCaseItem(builder);
        if (root == CASE) parseCase(builder);
        if (root == CASES) parseCases(builder);
        if (root == CASE_TYPE) parseCaseType(builder);
        if (root == CASE_TYPES) parseCaseTypes(builder);
        if (root == CATCH) parseCatch(builder);
        if (root == CLASS_BODY) parseClassBody(builder);
        if (root == CLASS_HEADER) parseClassHeader(builder);
        if (root == CLASS_INHERITANCE) parseClassInheritance(builder);
        if (root == CLASS) parseClass(builder);
        if (root == COMPILATION_UNIT) parseCompilationUnit(builder);
        if (root == CONDITION) parseCondition(builder);
        if (root == CONTINUE) parseContinue(builder);
        if (root == CONTROL_STRUCTURE) parseControlStructure(builder);
        if (root == DECLARATION) parseDeclaration(builder);
        if (root == DEFAULT_CASE_ITEM) parseDefaultCaseItem(builder);
        if (root == DEFAULT_PARAM) parseDefaultParam(builder);
        if (root == DIRECTIVE) parseDirective(builder);
        if (root == DIRECTIVE_STATEMENT) parseDirectiveStatement(builder);
        if (root == ELSE) parseElse(builder);
        if (root == ENTRY_PARAM_PAIR) parseEntryParamPair(builder);
        if (root == ENTRY_TYPE) parseEntryType(builder);
        if (root == ENTRY_VARIABLE_PAIR) parseEntryVariablePair(builder);
        if (root == EXISTS_OR_IS_NONEMPTY_CONDITION) parseExistsOrIsNonEmptyCondition(builder);
        if (root == EXPRESSION) parseExpression(builder);
        if (root == EXPRESSION_STATEMENT) parseExpressionStatement(builder);
        if (root == EXTENDED_TYPE) parseExtendedType(builder);
        if (root == FAIL) parseFail(builder);
        if (root == FINALLY) parseFinally(builder);
        if (root == FOR_FAIL) parseForFail(builder);
        if (root == FOR_ITERATOR) parseForIterator(builder);
        if (root == FOR) parseFor(builder);
        if (root == FULL_PACKAGE_NAME) parseFullPackageName(builder);
        if (root == FUNCTIONAL_ARGUMENTS) parseFunctionalArguments(builder);
        if (root == FUNCTIONAL_BODY) parseFunctionalBody(builder);
        if (root == FUNCTIONAL_NAMED_ARGUMENT) parseFunctionalNamedArgument(builder);
        if (root == FUNCTION_META) parseFunctionMeta(builder);
        if (root == IF_ELSE) parseIfElse(builder);
        if (root == IF) parseIf(builder);
        if (root == IMPORT_ELEMENT) parseImportElement(builder);
        if (root == IMPORT_ELEMENTS) parseImportElements(builder);
        if (root == IMPORT) parseImport(builder);
        if (root == IMPORT_METHOD_ATTRIBUTE_ELEMENT) parseImportMethodAttributeElement(builder);
        if (root == IMPORT_TYPE_ELEMENT) parseImportTypeElement(builder);
        if (root == IMPORT_WILDCARD) parseImportWildcard(builder);
        if (root == INCREMENT_OR_DECREMENT) parseIncrementOrDecrement(builder);
        if (root == INITIALIZER) parseInitializer(builder);
        if (root == INITIALIZER_REFERENCE) parseInitializerReference(builder);
        if (root == INTERFACE_BODY) parseInterfaceBody(builder);
        if (root == INTERFACE_HEADER) parseInterfaceHeader(builder);
        if (root == INTERFACE_INHERITANCE) parseInterfaceInheritance(builder);
        if (root == INTERFACE) parseInterface(builder);
        if (root == INTERSECTION_TYPE) parseIntersectionType(builder);
        if (root == INVOCATION) parseInvocation(builder);
        if (root == IS_CONDITION) parseIsCondition(builder);
        if (root == ITERATOR_VARIABLE) parseIteratorVariable(builder);
        if (root == LITERAL) parseLiteral(builder);
        if (root == LOCAL_NAMED_ARGUMENT) parseLocalNamedArgument(builder);
        if (root == LOOP_CONDITION) parseLoopCondition(builder);
        if (root == MEMBER_NAME) parseMemberName(builder);
        if (root == MEMBER_REFERENCE) parseMemberReference(builder);
        if (root == META) parseMeta(builder);
        //if (root == META_TYPES) parseMetaTypes(builder);
        if (root == METHOD_ATTRIBUTE_ALIAS) parseMethodAttributeAlias(builder);
        if (root == METHOD_HEADER) parseMethodHeader(builder);
        if (root == METHOD) parseMethod(builder);
        if (root == METHOD_META) parseMethodMeta(builder);
        if (root == METHOD_REFERENCE) parseMethodReference(builder);
        if (root == NAMED_ARGUMENT) parseNamedArgument(builder);
        if (root == NAMED_ARGUMENTS) parseNamedArguments(builder);
        if (root == OBJECT_HEADER) parseObjectHeader(builder);
        if (root == OBJECT_INHERITANCE) parseObjectInheritance(builder);
        if (root == OBJECT) parseObject(builder);
        if (root == OPERATOR_EXPRESSION) parseOperatorExpression(builder);
        //if (root == OPERATOR) parseOperator(builder);
        if (root == PACKAGE_NAME) parsePackageName(builder);
        if (root == PARAM) parseParam(builder);
        //if (root == PARAMETER_TYPES) parseParameterTypes(builder);
        if (root == PARAMS) parseParams(builder);
        if (root == PAR_EXPRESSION) parseParExpression(builder);
        if (root == POSITIONAL_ARGUMENTS) parsePositionalArguments(builder);
        if (root == PRIMARY) parsePrimary(builder);
        if (root == RECEIVER) parseReciever(builder);
        if (root == RESOURCE) parseResource(builder);
        if (root == RETURN) parseReturn(builder);
        if (root == SATISFIED_TYPES) parseSatisfiedTypes(builder);
        if (root == SATISFIES_CONDITION) parseSatisfiesCondition(builder);
        if (root == SELF_REFERENCE) parseSelfReference(builder);
        if (root == SEQUENCED_PARAM) parseSequencedParam(builder);
        if (root == SEQUENCED_TYPE) parseSequencedType(builder);
        if (root == SEQUENCED_TYPE_PARAM) parseSequencedTypeParam(builder);
        if (root == SEQUENCE_INSTANTIATION) parseSequenceInstantiation(builder);
        if (root == SEQUENCE) parseSequence(builder);
        if (root == SIMPLE_ATTRIBUTE) parseSimpleAttribute(builder);
        if (root == SIMPLE_PARAM) parseSimpleParam(builder);
        if (root == SPECIFICATION) parseSpecification(builder);
        if (root == SPECIFIED_NAMED_ARGUMENT) parseSpecifiedNamedArgument(builder);
        if (root == SPECIFIER) parseSpecifier(builder);
        if (root == STATEMENT) parseStatement(builder);
        if (root == STRING_TEMPLATE) parseStringTemplate(builder);
        if (root == SWITCH_CASE_ELSE) parseSwitchCaseElse(builder);
        if (root == SWITCH) parseSwitch(builder);
        if (root == THROW) parseThrow(builder);
        if (root == TOP_LEVEL_DECLARATION) parseTopLevelDeclaration(builder);
        if (root == TRY_CATCH_FINALLY) parseTryCatchFinally(builder);
        if (root == TRY) parseTry(builder);
        if (root == TYPE_ALIAS) parseTypeAlias(builder);
        if (root == TYPE_ARGUMENTS) parseTypeArguments(builder);
        if (root == TYPE_CONSTRAINT) parseTypeConstraint(builder);
        if (root == TYPE_CONSTRAINTS) parseTypeConstraints(builder);
        if (root == TYPE_CONSTRAINT_INHERITANCE) parseTypeConstraintInheritance(builder);
        if (root == TYPE_DECLARATION) parseTypeDeclaration(builder);
        if (root == TYPED_VARIABLE) parseTypedVariable(builder);
        if (root == TYPE) parseType(builder);
        if (root == TYPE_META) parseTypeMeta(builder);
        if (root == TYPE_NAME) parseTypeName(builder);
        if (root == TYPE_NAME_WITH_ARGUMENTS) parseTypeNameWithArguments(builder);
        if (root == TYPE_PARAM) parseTypeParam(builder);
        if (root == TYPE_PARAMS) parseTypeParams(builder);
        if (root == TYPE_SPECIFIER) parseTypeSpecifier(builder);
        if (root == UNION_TYPE) parseUnionType(builder);
        if (root == VALUE_META) parseValueMeta(builder);
        if (root == VALUE_REFERENCE) parseValueReference(builder);
        if (root == VARIABLE) parseVariable(builder);
        if (root == VARIANCE) parseVariance(builder);
        if (root == WHILE) parseWhile(builder);

        if (root == OPERATOR_EXPRESSION) parseOperatorExpression(builder);
        if (root == INCREMENT_OR_DECREMENT) parseIncrementOrDecrement(builder);
        if (root == ASSIGNMENT) parseAssignment(builder);
        if (root == COMPOUND_ASSIGNMENT) parseCompountAssignment(builder);
        if (root == FORMAT) parseFormat(builder);
        if (root == EQUALITIES) parseEqualities(builder);
        if (root == COMPARISON) parseComparison(builder);
        if (root == CONTAINMENT) parseContainment(builder);
        if (root == ASSIGNABILITY)  parseAssignability(builder);
        if (root == INHERITANCE) parseInheritance(builder);
        if (root == NOT) parseNot(builder);
        if (root == LOGICAL_CONDITION) parseLogicalCondition(builder);
        if (root == EXISTANCE) parseExistance(builder);
        if (root == DEFAULT) parseDefault(builder);
        if (root == NULLSAFE_INVOCATION) parseNullsafeInvocation(builder);
        if (root == KEYED_ITEM_ACCESS) parseKeyedItemAccess(builder);
        if (root == SPANS) parseSpans(builder);
        if (root == SPREAD_INVOCATION) parseSpreadInvocation(builder);
        if (root == RANGE_OR_ENTRY_CONSTRUCTION) parseRangeOrEntryConstruction(builder);
        if (root == CONDITIONAL) parseConditional(builder);
        if (root == INVERSION_OPERATION) parseInversionOperation(builder);
        if (root == NUMERICAL_OPERATION) parseNumericalOperation(builder);
        if (root == COMPLEMENT) parseComplement(builder);
        if (root == SLOTWISE_OPERATOR) parseSlotwiseOperator(builder);

        marker.done(root);
        return builder.getTreeBuilt();
    }

    /*
     * Abbreviation: "?" | "[]"
     */
    public static boolean parseAbbreviation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, DEFAULT_OPERATOR)
                && !find(builder, ARRAY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(ABBREVIATION);
        return true;
    }

    /*
     * AbbreviatedType: Type Abbreviation*
     */
    public static boolean parseAbbreviatedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (parseAbbreviation(builder)) {
            //
        }
        marker.done(ABBREVIATED_TYPE);
        return true;
    }

    /*
     * AbstractedType: "abstracts" Type
     */
    public static boolean parseAbstractedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ABSTRACTS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        marker.done(ABSTRACTED_TYPE);
        return true;
    }

    /*
     * PROPOSAL
     * AdaptedTypes: "adapts" Type ("&" Type)*
     */
    /*
    public static boolean parseAdaptedTypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ADAPTS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(ADAPTED_TYPES);
        return true;
    }
    */

    /*
     * Annotation: MemberName ( Arguments | Literal+ )?
     */
    public static boolean parseAnnotation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseArguments(builder)) {
            //TODO: Clarify
            while (parseLiteral(builder)) {
                //
            }
        }
        marker.done(ANNOTATION);
        return true;
    }

    /*
     * Arguments: PositionalArguments FunctionalArguments? | NamedArguments
     */
    public static boolean parseArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parsePositionalArguments(builder)) {
            parseFunctionalArguments(builder);
        } else if (parseNamedArguments(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(ARGUMENTS);
        return true;
    }

    /*
     * Atom: Literal | StringTemplate | SelfReference | ParExpression
     */
    public static boolean parseAtom(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseLiteral(builder)
                && !parseStringTemplate(builder)
                && !parseSelfReference(builder)
                && !parseParExpression(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(ATOM);
        return true;
    }

    /*
     * Attribute: Annotation* (SimpleAttribute | AttributeGetter | AttributeSetter)
     */
    public static boolean parseAttribute(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseSimpleAttribute(builder)
                && !parseAttributeGetter(builder)
                && !parseAttributeSetter(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(ATTRIBUTE);
        return true;
    }

    /*
     * AttributeGetter: AttributeHeader Block
     */
    public static boolean parseAttributeGetter(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseAttributeHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(ATTRIBUTE_GETTER);
        return true;
    }

    /*
     * AttributeHeader: (UnionType | "value") MemberName
     */
    public static boolean parseAttributeHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)
                && ! find(builder, VALUE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(ATTRIBUTE_HEADER);
        return true;
    }

    /*
     * AttributeMeta: Type "." MemberName
     */
    public static boolean parseAttributeMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, MEMBER_OPERATOR, CeylonBundle.message("expected.memberoperator"));
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(ATTRIBUTE_META);
        return true;
    }

    /*
     * AttributeSetter: "assign" MemberName Block
     */
    public static boolean parseAttributeSetter(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ASSIGN_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(ATTRIBUTE_SETTER);
        return true;
    }

    /*
     * Block: "{" (Declaration | Statement)* "}"
     */
    public static boolean parseBlock(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder) || parseStatement(builder)) {
            //
        }
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(BLOCK);
        return true;
    }

    /*
     * BooleanCondition: Expression
     */
    public static boolean parseBooleanCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseExpression(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(BOOLEAN_CONDITION);
        return true;
    }

    /*
     * Break: "break"
     */
    public static boolean parseBreak(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, BREAK_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(BREAK);
        return true;
    }

    /*
     * CallableParam: (UnionType | "void") MemberName Params+
     */
    public static boolean parseCallableParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)
                && !find(builder, VOID_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (parseParams(builder)) {
            while (parseParams(builder)) {
                //
            }
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        marker.done(CALLABLE_PARAM);
        return true;
    }

    /*
     * CallableReference: MethodReference | InitializerReference
     */
    public static boolean parseCallableReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMethodReference(builder)
                && !parseInitializerReference(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(CALLABLE_REFERENCE);
        return true;
    }

    /*
     * CallableVariable: (UnionType | "void")? MemberName Params+
     */
    public static boolean parseCallableVariable(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseUnionType(builder)) {
            find(builder, VOID_KEYWORD);
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (parseParams(builder)) {
            while (parseParams(builder)) {
                //
            }
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        marker.done(CALLABLE_VARIABLE);
        return true;
    }

    /*
     * Case: Expression ("," Expression)* | "is" UnionType | "satisfies" Type
     */
    public static boolean parseCase(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseExpression(builder)) {
            boolean found = false;
            while (find(builder, COMMA_OPERATOR)) {
                found = true;
                if (!parseExpression(builder)) {
                    builder.error(CeylonBundle.message("expected.expression"));
                }
            }
            if (!found) {
                if (find(builder, IS_KEYWORD)) {
                    found = true;
                    if (!parseUnionType(builder)) {
                        builder.error(CeylonBundle.message("expected.uniontype"));
                    }
                }
            }
            if (!found) {
                if (find(builder, SATISFIES_KEYWORD)) {
                    found = true;
                    if (!parseType(builder)) {
                        builder.error(CeylonBundle.message("expected.type"));
                    }
                }
            }
            if (!found) {
                builder.error(CeylonBundle.message("expected.expressionorisorsatisfies"));
            }
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(CASE);
        return true;
    }

    /*
     * CaseItem: "case" "(" Case ")" Block
     */
    public static boolean parseCaseItem(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, CASE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseCase(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(CASE_ITEM);
        return true;
    }

    /*
     * Cases: CaseItem+ DefaultCaseItem?
     */
    public static boolean parseCases(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseCaseItem(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (parseCaseItem(builder)) {
            //
        }
        parseDefaultCaseItem(builder);
        marker.done(CASES);
        return true;
    }

    /*
     * CaseType: MemberName | Type
     */
    public static boolean parseCaseType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)
                && !parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(CASE_TYPE);
        return true;
    }

    /*
     * CaseTypes: "of" CaseType ("|" CaseType)*
     */
    public static boolean parseCaseTypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, OF_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseCaseType(builder)) {
            builder.error(CeylonBundle.message("expected.casetype"));
        }
        while (find(builder, INTERSECTION_OPERATOR)) {
            if (!parseCaseType(builder)) {
                builder.error(CeylonBundle.message("expected.casetype"));
            }
        }
        marker.done(CASE_TYPES);
        return true;
    }

    /*
     * Catch: "catch" "(" Variable ")" Block
     */
    public static boolean parseCatch(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, CATCH_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseVariable(builder)) {
            builder.error(CeylonBundle.message("expected.variable"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(CATCH);
        return true;
    }

    /*
     * Class: Annotation* ClassHeader (ClassBody | TypeSpecifier ";")
     */
    public static boolean parseClass(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseClassHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseClassBody(builder)) {
        } else if (parseTypeSpecifier(builder)) {
            require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        } else {
            builder.error(CeylonBundle.message("expected.classbodyortypespecifier"));
        }
        marker.done(CLASS);
        return true;
    }

    /*
     * ClassBody: "{" (Declaration | Statement)* "}"
     */
    public static boolean parseClassBody(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder) || parseStatement(builder)) {
            //
        }
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(CLASS_BODY);
        return true;
    }

    /*
     * ClassHeader: "class" TypeName TypeParams? Params ClassInheritance TypeConstraints?
     */
    public static boolean parseClassHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, CLASS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseTypeName(builder)) {
            builder.error(CeylonBundle.message("expected.typename"));
        }
        parseTypeParams(builder);
        if (!parseParams(builder)) {
            builder.error(CeylonBundle.message("expected.params"));
        }
        if (!parseClassInheritance(builder)) {
            builder.error(CeylonBundle.message("expected.classinheritance"));
        }
        parseTypeConstraints(builder);
        marker.done(CLASS_HEADER);
        return true;
    }

    /*
     *                              PROPOSAL
     * ClassInheritance: CaseTypes? Metatypes? ExtendedType? SatisfiedTypes?
     */
    public static boolean parseClassInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        //parseMetaTypes(builder);
        parseExtendedType(builder);
        parseSatisfiedTypes(builder);
        marker.done(CLASS_INHERITANCE);
        return true;
    }

    /*
     * CompilationUnit: Import* ToplevelDeclaration+
     */
    public static boolean parseCompilationUnit(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseImport(builder)) {
            //
        }
        if (!parseTopLevelDeclaration(builder)) {
            while (parseTopLevelDeclaration(builder)) {
                //
            }
        } else {
            builder.error(CeylonBundle.message("expected.topleveldeclaration"));
        }
        marker.done(COMPILATION_UNIT);
        return true;
    }

    /*
     * Condition: BooleanCondition | IsCondition | ExistsOrNonemptyCondition | SatisfiesCondition
     */
    public static boolean parseCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseBooleanCondition(builder)
                && !parseIsCondition(builder)
                && !parseExistsOrIsNonEmptyCondition(builder)
                && !parseSatisfiesCondition(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(CONDITION);
        return true;
    }

    /*
     * Continue: "continue"
     */
    public static boolean parseContinue(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, CONTINUE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(CONTINUE);
        return true;
    }

    /*
     * ControlStructure: IfElse | SwitchCaseElse | While | ForFail | TryCatchFinally
     */
    public static boolean parseControlStructure(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseIfElse(builder)
                && !parseSwitchCaseElse(builder)
                && !parseWhile(builder)
                && !parseForFail(builder)
                && !parseTryCatchFinally(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(CONTROL_STRUCTURE);
        return true;
    }

    /*
     * Declaration: Method | Attribute | TypeDeclaration
     */
    public static boolean parseDeclaration(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMethod(builder)
                && !parseAttribute(builder)
                && !parseTypeDeclaration(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(DECLARATION);
        return true;
    }

    /*
     * DefaultCaseItem: "else" Block
     */
    public static boolean parseDefaultCaseItem(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ELSE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(DEFAULT_CASE_ITEM);
        return true;
    }

    /*
     * DefaultParam: Param Specifier
     */
    public static boolean parseDefaultParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseParam(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseSpecifier(builder)) {
            builder.error(CeylonBundle.message("expected.specifier"));
        }
        marker.done(DEFAULT_PARAM);
        return true;
    }

    /*
     * Directive: Return | Throw | Break | Continue
     */
    public static boolean parseDirective(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseReturn(builder)
                && !parseThrow(builder)
                && !parseBreak(builder)
                && !parseContinue(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(DIRECTIVE);
        return true;
    }

    /*
     * DirectiveStatement: Directive ";"
     */
    public static boolean parseDirectiveStatement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseDirective(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(DIRECTIVE_STATEMENT);
        return true;
    }

    /*
     * Else: "else" (Block | IfElse)
     */
    public static boolean parseElse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ELSE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)
                && !parseIfElse(builder)) {
            builder.error(CeylonBundle.message("expected.blockorifelse"));
        }
        marker.done(ELSE);
        return true;
    }

    /*
     * EntryParamPair: SimpleParam "->" SimpleParam
     */
    public static boolean parseEntryParamPair(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseSimpleParam(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, ENTRY_OPERATOR, CeylonBundle.message("expected.entryoperator"));
        if (!parseSimpleParam(builder)) {
            builder.error(CeylonBundle.message("expected.simpleparam"));
        }
        marker.done(ENTRY_PARAM_PAIR);
        return true;
    }

    /*
     * EntryType: AbbreviatedType ("->" AbbreviatedType)?
     */
    public static boolean parseEntryType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseAbbreviatedType(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (find(builder, ENTRY_OPERATOR)) {
            if (!parseAbbreviatedType(builder)) {
                builder.error(CeylonBundle.message("expected.abbreviatedtype"));
            }
        }
        marker.done(ENTRY_TYPE);
        return true;
    }

    /*
     * EntryVariablePair: Variable "->" Variable
     */
    public static boolean parseEntryVariablePair(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseVariable(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, ENTRY_OPERATOR, CeylonBundle.message("expected.entryoperator"));
        if (!parseVariable(builder)) {
            builder.error(CeylonBundle.message("expected.variable"));
        }
        marker.done(ENTRY_VARIABLE_PAIR);
        return true;
    }

    /*
     * ExistsOrNonemptyCondition: ("exists" | "nonempty") (Variable Specifier | MemberName)
     */
    public static boolean parseExistsOrIsNonEmptyCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, EXISTS_KEYWORD)
                && !find(builder, NONEMPTY_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (parseVariable(builder)) {
            if (!parseSpecifier(builder)) {
                builder.error(CeylonBundle.message("expected.specifier"));
            }
        } else if (parseMemberName(builder)) {
        } else {
            builder.error(CeylonBundle.message("expected.variableormembername"));
        }
        marker.done(EXISTS_OR_IS_NONEMPTY_CONDITION);
        return true;
    }

    /*
     * Expression: Primary | OperatorExpression
     */
    public static boolean parseExpression(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)
                && !parseOperatorExpression(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(EXPRESSION);
        return true;
    }

    /*
     * ExpressionStatement: ( Assignment | IncrementOrDecrement | Invocation ) ";"
     */
    public static boolean parseExpressionStatement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseAssignment(builder)
                && !parseIncrementOrDecrement(builder)
                && !parseInvocation(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(EXPRESSION_STATEMENT);
        return true;
    }

    /*
     * ExtendedType: "extends" ("super" ".")? Type PositionalArguments
     */
    public static boolean parseExtendedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, EXTENDS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (find(builder, SUPER_KEYWORD)) {
            require(builder, MEMBER_OPERATOR, CeylonBundle.message("expected.memberoperator"));
        }
        if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
        }
        if (!parsePositionalArguments(builder)) {
                builder.error(CeylonBundle.message("expected.positionalarguments"));
        }
        marker.done(EXTENDED_TYPE);
        return true;
    }

    /*
     * Fail: "else" Block
     */
    public static boolean parseFail(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ELSE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(FAIL);
        return true;
    }

    /*
     * Finally: "finally" Block
     */
    public static boolean parseFinally(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, FINALLY_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(FINALLY);
        return true;
    }

    /*
     * For: "for" "(" ForIterator ")" Block
     */
    public static boolean parseFor(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, FOR_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseForIterator(builder)) {
            builder.error(CeylonBundle.message("expected.iteratorvariable"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(FOR);
        return true;
    }

    /*
     * ForFail: For Fail?
     */
    public static boolean parseForFail(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseFor(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseFail(builder);
        marker.done(FOR_FAIL);
        return true;
    }

    /*
     * ForIterator: IteratorVariable "in" Expression
     */
    public static boolean parseForIterator(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseIteratorVariable(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, IN_KEYWORD, CeylonBundle.message("expected.in"));
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        marker.done(FOR_ITERATOR);
        return true;
    }

    /*
     * FullPackageName: PackageName ("." PackageName)*
     */
    public static boolean parseFullPackageName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePackageName(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (find(builder, MEMBER_OPERATOR)) {
            if (!parsePackageName(builder)) {
                builder.error(CeylonBundle.message("expected.packagename"));
            }
        }
        marker.done(FULL_PACKAGE_NAME);
        return true;
    }

    /*
    * FunctionalArguments: (MemberName FunctionalBody)+
    */
    public static boolean parseFunctionalArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseFunctionalBody(builder)) {
            builder.error(CeylonBundle.message("expected.functionalbody"));
        }
        while (parseMemberName(builder)) {
            if (!parseFunctionalBody(builder)) {
                builder.error(CeylonBundle.message("expected.membername"));
            }
        }
        marker.done(FUNCTIONAL_ARGUMENTS);
        return true;
    }

    /*
    * FunctionalBody: Params? ( Block | "(" Expression ")" )
    */
    public static boolean parseFunctionalBody(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseParams(builder);
        if (!parseBlock(builder)) {
            if (!find(builder, LEFT_PARENTHESIS_OPERATOR)) {
                marker.rollbackTo();
                return false;
            }
            if (!parseExpression(builder)) {
                CeylonBundle.message("expected.expression");
            }
            require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        }
        marker.done(FUNCTIONAL_BODY);
        return true;
    }


    /*
     * FunctionalNamedArgument: (UnionType | "function" | "void") MemberName Params+ (Block | NamedArguments)
     */
    public static boolean parseFunctionalNamedArgument(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)
                && !find(builder, FUNCTION_KEYWORD)
                && !find(builder, VOID_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (parseParams(builder)) {
            while (parseParams(builder)) {
                //
            }
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        if (!parseBlock(builder)
                && !parseNamedArguments(builder)) {
             builder.error(CeylonBundle.message("expected.blockornamedarguments"));
        }
        marker.done(FUNCTIONAL_NAMED_ARGUMENT);
        return true;
    }

    /*
     * FunctionMeta: MemberName TypeArguments?
     */
    public static boolean parseFunctionMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseTypeArguments(builder);
        marker.done(FUNCTION_META);
        return true;
    }

    /*
     * If: "if" "(" Condition ")" Block
     */
    public static boolean parseIf(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IF_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseCondition(builder)) {
            builder.error(CeylonBundle.message("expected.condition"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(IF);
        return true;
    }

    /*
     * IfElse: If Else?
     */
    public static boolean parseIfElse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseIf(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseElse(builder);
        marker.done(IF_ELSE);
        return true;
    }

    /*
     * Import: "import" FullPackageName "{" ImportElements? "}"
     */
    public static boolean parseImport(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IMPORT_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseFullPackageName(builder)) {
            marker.error(CeylonBundle.message("expected.fullpackagename"));
        }
        require(builder, LEFT_BRACE_OPERATOR, CeylonBundle.message("expected.leftbrace"));
        while (parseImportElements(builder)) {
            //
        }
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.leftbrace"));
        marker.done(IMPORT);
        return true;
    }

    /*
     * ImportElement: ImportTypeElement | ImportMethodAttributeElement
     */
    public static boolean parseImportElement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseImportTypeElement(builder)
                && !parseImportMethodAttributeElement(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(IMPORT_ELEMENT);
        return true;
    }

    /*
     * ImportElements: ImportElement ("," ImportElement)* ("," ImportWildcard)? | ImportWildcard
     */
    public static boolean parseImportElements(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseImportElement(builder)) {
            boolean foundComma = false;
            while (find(builder, COMMA_OPERATOR)) {
                foundComma = true;
                if (!parseImportElement(builder)) {
                    foundComma = false;
                } else {
                    break;
                }
            }
            if (foundComma || find(builder, COMMA_OPERATOR)) {
                if (!parseImportWildcard(builder)) {
                    builder.error(CeylonBundle.message("expected.importorimportwildcard"));
                }
            }
        } else {
            if (!parseImportWildcard(builder)) {
                marker.rollbackTo();
                return false;
            }
        }
        marker.done(IMPORT_ELEMENTS);
        return true;
    }

    /*
     * ImportMethodAttributeElement: MethodAttributeAlias? MemberName
     */
    public static boolean parseImportMethodAttributeElement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseMethodAttributeAlias(builder);
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(IMPORT_METHOD_ATTRIBUTE_ELEMENT);
        return true;
    }

    /*
     * ImportTypeElement: TypeAlias? TypeName
     */
    public static boolean parseImportTypeElement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseTypeAlias(builder);
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(IMPORT_TYPE_ELEMENT);
        return true;
    }

    /*
     * ImportWildcard: "..."
     */
    public static boolean parseImportWildcard(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ELLIPSES_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(IMPORT_WILDCARD);
        return true;
    }

    /*
     * Initializer: ":=" Expression
     */
    public static boolean parseInitializer(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ASSIGN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        marker.done(INITIALIZER);
        return true;
    }

    /*
     * InitializerReference: (Receiver ".")? TypeName TypeArguments?
     */
    public static boolean parseInitializerReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseReciever(builder)) {
            find(builder, MEMBER_OPERATOR);
        }
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseTypeArguments(builder);
        marker.done(INITIALIZER_REFERENCE);
        return true;
    }

    /*
     * Interface: Annotation* InterfaceHeader (InterfaceBody | TypeSpecifier ";")
     */
    public static boolean parseInterface(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseInterfaceHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseInterfaceBody(builder)) {
        } else if (parseTypeSpecifier(builder)) {
            require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        } else {
            builder.error(CeylonBundle.message("expected.interfacebodyortypespecifier"));
        }
        marker.done(INTERFACE);
        return true;
    }

    /*
     * InterfaceBody: "{" Declaration* "}"
     */
    public static boolean parseInterfaceBody(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder)) {
            //
        }
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(INTERFACE_BODY);
        return true;
    }

    /*
     * InterfaceHeader: "interface" TypeName TypeParams? InterfaceInheritance TypeConstraints?
     */
    public static boolean parseInterfaceHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, INTERFACE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseTypeName(builder)) {
            builder.error(CeylonBundle.message("expected.typename"));
        }
        parseTypeParams(builder);
        if (!parseInterfaceInheritance(builder)) {
            builder.error(CeylonBundle.message("expected.interfaceinheritance"));
        }
        parseTypeConstraints(builder);
        marker.done(INTERFACE_HEADER);
        return true;
    }

    /*
     *                                  PROPOSAL   PROPOSAL
     * InterfaceInheritance: CaseTypes? MetaTypes? AdaptedTypes? SatisfiedTypes?
     */
    public static boolean parseInterfaceInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        //parseMetaTypes(builder);
        //parseAdaptedTypes(builder);
        parseSatisfiedTypes(builder);
        marker.done(INTERFACE_INHERITANCE);
        return true;
    }

    /*
     * IntersectionType: EntryType ("&" EntryType)*
     */
    public static boolean parseIntersectionType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseEntryType(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (find(builder, INTERSECTION_OPERATOR)) {
            if (!parseEntryType(builder)) {
                builder.error(CeylonBundle.message("expected.entrytype"));
            }
        }
        marker.done(INTERSECTION_TYPE);
        return true;
    }

    /*
     * Invocation: Primary Arguments | SequenceInstantiation
     */
    public static boolean parseInvocation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if(parsePrimary(builder)) {
            if (!parseArguments(builder)) {
                builder.error(CeylonBundle.message("expected.arguments"));
            }
        } else if (parseSequenceInstantiation(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(INVOCATION);
        return true;
    }

    /*
     * IsCondition: "is" (TypedVariable Specifier | UnionType MemberName)
     */
    public static boolean parseIsCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (parseTypedVariable(builder)) {
            if (parseSpecifier(builder)) {
                builder.error(CeylonBundle.message("expected.specifier"));
            }
        } else if (parseUnionType(builder) ) {
            if (parseMemberName(builder)) {
                builder.error(CeylonBundle.message("expected.membername"));
            }
        } else {
            builder.error(CeylonBundle.message("expected.typedvariableoruniontype"));
        }
        marker.done(IS_CONDITION);
        return true;
    }

    /*
     * IteratorVariable: Variable | CallableVariable | EntryVariablePair
     */
    public static boolean parseIteratorVariable(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseVariable(builder)
                && !parseCallableVariable(builder)
                && !parseEntryVariablePair(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(ITERATOR_VARIABLE);
        return true;
    }

    /*
     * Literal: IntegerLiteral | FloatLiteral | CharacterLiteral | StringLiteral | QuotedLiteral
     */
    public static boolean parseLiteral(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, INTEGER_LITERAL)
                && !find(builder, FLOAT_LITERAL)
                && !find(builder, CHARACTER_LITERAL)
                && !find(builder, STRING_LITERAL)
                && !find(builder, QUOTED_LITERAL)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(LITERAL);
        return true;
    }

    /*
     * LocalNamedArgument: (UnionType | "value") MemberName (Block | NamedArguments)
     */
    public static boolean parseLocalNamedArgument(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)
                && !find(builder, VALUE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (!parseBlock(builder)
                && !parseNamedArgument(builder)) {
            builder.error(CeylonBundle.message("expected.blockornamedargument"));
        }
        marker.done(LOCAL_NAMED_ARGUMENT);
        return true;
    }

    /*
     * LoopCondition: "while" "(" Condition ")"
     */
    public static boolean parseLoopCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, WHILE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseCondition(builder)) {
            builder.error(CeylonBundle.message("expected.condition"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(LOOP_CONDITION);
        return true;
    }

    /*
     * MemberName: LIdentifier
     */
    public static boolean parseMemberName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LOWERCASE_IDENTIFIER)
                && !find(builder, PACKAGE_IDENTIFIER)) { //This is a valid lowercase identifier
            marker.rollbackTo();
            return false;
        }
        marker.done(MEMBER_NAME);
        return true;
    }

    /*
     * MemberReference: CallableReference | ValueReference
     */
    public static boolean parseMemberReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseCallableReference(builder)
                && !parseValueReference(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(MEMBER_REFERENCE);
        return true;
    }

    /*
     * Meta: TypeMeta | MethodMeta | AttributeMeta | FunctionMeta | ValueMeta
     */
    public static boolean parseMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeMeta(builder)
                && !parseMethodMeta(builder)
                && !parseAttributeMeta(builder)
                && !parseFunctionMeta(builder)
                && !parseValueMeta(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(META);
        return true;
    }

    /*
     * PROPOSAL
     * Metatypes: "is" Type ("&" Type)*
     */
    /*
    public static boolean parseMetaTypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(META_TYPES);
        return true;
    }
     */

    /*
     * Method: Annotation* MethodHeader (Block | NamedArguments | Specifier? ";")
     */
    public static boolean parseMethod(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseMethodHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseBlock(builder)) {
        } else if (parseNamedArguments(builder)) {
        } else {
            if (parseSpecifier(builder)) {
                require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
            } else {
                builder.error(CeylonBundle.message("expected.blockornamedargumentsorspecifier"));
            }
        }
        marker.done(METHOD);
        return true;
    }

    /*
     * MethodAttributeAlias: MemberName "="
     */
    public static boolean parseMethodAttributeAlias(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, SPECIFY_OPERATOR, CeylonBundle.message("expected.specify"));
        marker.done(METHOD_ATTRIBUTE_ALIAS);
        return true;
    }

    /*
     *                                                                                PROPOSAL
     * MethodHeader: (UnionType | "function" | "void") MemberName TypeParams? Params+ Metatypes? TypeConstraints?
     */
    public static boolean parseMethodHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseUnionType(builder)) {
        } else if (find(builder, FUNCTION_KEYWORD)) {
        } else if (find(builder, VOID_KEYWORD)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        parseTypeParams(builder);
        if (parseParams(builder)) {
            while (parseParams(builder)) {
                //
            }
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        //parseMetaTypes(builder);
        parseTypeConstraints(builder);
        marker.done(METHOD_HEADER);
        return true;
    }

    /*
     * MethodMeta: Type "." MemberName TypeArguments?
     */
    public static boolean parseMethodMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, MEMBER_OPERATOR, CeylonBundle.message("expected.memberoperator"));
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        parseTypeArguments(builder);
        marker.done(METHOD_META);
        return true;
    }

    /*
     * MethodReference: (Receiver ".")? MemberName TypeArguments?
     */
    public static boolean parseMethodReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseReciever(builder)) {
            find(builder, MEMBER_OPERATOR);
        }
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseTypeArguments(builder);
        marker.done(METHOD_REFERENCE);
        return true;
    }

    /*
     * NamedArgument: SpecifiedNamedArgument | LocalNamedArgument | FunctionalNamedArgument | Object
     */
    public static boolean parseNamedArgument(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseSpecifiedNamedArgument(builder)
                && !parseLocalNamedArgument(builder)
                && !parseFunctionalNamedArgument(builder)
                && !parseObject(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(NAMED_ARGUMENT);
        return true;
    }

    /*
     * NamedArguments: "{" NamedArgument* Sequence? "}"
     */
    public static boolean parseNamedArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseNamedArguments(builder)) {
            //
        }
        parseSequence(builder);
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(NAMED_ARGUMENTS);
        return true;
    }

    /*
     * Object: Annotation* ObjectHeader ClassBody
     */
    public static boolean parseObject(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseObjectHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseClassBody(builder)) {
            builder.error(CeylonBundle.message("expected.classbody"));
        }
        marker.done(OBJECT);
        return true;
    }

    /*
     * ObjectHeader: "object" MemberName ObjectInheritance
     */
    public static boolean parseObjectHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, OBJECT_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (!parseObjectInheritance(builder)) {
            builder.error(CeylonBundle.message("expected.objectinheritance"));
        }
        marker.done(OBJECT_HEADER);
        return true;
    }

    /*
     * ObjectInheritance: ExtendedType? SatisfiedTypes?
     */
    public static boolean parseObjectInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseExtendedType(builder);
        parseSatisfiedTypes(builder);
        marker.done(OBJECT_INHERITANCE);
        return true;
    }

    /*
     * PackageName: PIdentifier
     */
    public static boolean parsePackageName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, PACKAGE_IDENTIFIER)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(PACKAGE_NAME);
        return true;
    }

    /*
     * Param: Annotation* (SimpleParam | CallableParam | EntryParamPair)
     */
    public static boolean parseParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseSimpleParam(builder)
                && !parseCallableParam(builder)
                && !parseEntryParamPair(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(PARAM);
        return true;
    }

    /*
     * Params: "(" Param ("," Param)* ("," DefaultParam)* ("," SequencedParam)? | DefaultParam ("," DefaultParam)* ("," SequencedParam)? | SequencedParam? ")"
     */
    public static boolean parseParams(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_PARENTHESIS_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (parseParam(builder)) {
            boolean foundComma = false;
            while (find(builder, COMMA_OPERATOR)) {
                foundComma = true;
                if (parseParam(builder)) {
                    foundComma = false;
                } else {
                    break;
                }
            }
            while (foundComma || find(builder, COMMA_OPERATOR)) {
                foundComma = true;
                if (parseDefaultParam(builder)) {
                    foundComma = false;
                } else {
                    break;
                }
            }
            if (foundComma || find(builder, COMMA_OPERATOR)) {
                if (!parseSequencedParam(builder)) {
                    builder.error(CeylonBundle.message("expected.paramordefaultparamorsequencedparam"));
                }
            }
        } else if (parseDefaultParam(builder)) {
            boolean foundComma = false;
            while (find(builder, COMMA_OPERATOR) || foundComma) {
                foundComma = true;
                if (parseDefaultParam(builder)) {
                    foundComma = false;
                } else {
                    break;
                }
            }
            if (foundComma || find(builder, COMMA_OPERATOR)) {
                if (!parseSequencedParam(builder)) {
                    builder.error(CeylonBundle.message("expected.defaultparamorsequencedparam"));
                }
            }
        } else if (parseSequencedParam(builder)) {

        } else {
            builder.error(CeylonBundle.message("expected.paramordefaultparamorsequencedparam"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(PARAMS);
        return true;
    }

    /*
     * ParExpression: "(" Expression ")"
     */
    public static boolean parseParExpression(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_PARENTHESIS_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(PAR_EXPRESSION);
        return true;
    }

    /*
     * PositionalArguments: "(" Expression ("," Expression)* ("," Sequence)? | Sequence? ")"
     */
    public static boolean parsePositionalArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_PARENTHESIS_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (parseExpression(builder)) {
            while (find(builder, COMMA_OPERATOR)) {
                if (!parseExpression(builder)) {
                    if (parseSequence(builder)) {
                        break;
                    }
                    builder.error(CeylonBundle.message("expected.expressionorsequence"));
                }
            }
        } else if (parseSequence(builder)) {
        } else {
            builder.error(CeylonBundle.message("expected.expressionorsequence"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(POSITIONAL_ARGUMENTS);
        return true;
    }

    /*
     * Primary: Atom | Meta | MemberReference | Invocation
     */
    public static boolean parsePrimary(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        final IElementType next = builder.getTokenType();
        if (next != LOWERCASE_IDENTIFIER && next != PACKAGE_IDENTIFIER) {
            marker.rollbackTo();
            return false;
        }
        if (!parseAtom(builder)
                && !parseMeta(builder)
                && !parseMemberReference(builder)
                && !parseInvocation(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(PRIMARY);
        return true;
    }

    /*
     * Receiver: Primary
     */
    public static boolean parseReciever(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(RECEIVER);
        return true;
    }

    /*
     * Resource: MemberName | InitializerReference Arguments | Variable Specifier
     */
    public static boolean parseResource(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseMemberName(builder)) {
        } else if (parseInitializerReference(builder)) {
            if (!parseInitializerReference(builder)) {
                builder.error(CeylonBundle.message("expected.initializerreference"));
            }
        } else if (parseVariable(builder)) {
            if (!parseSpecifier(builder)) {
                builder.error(CeylonBundle.message("expected.specifier"));
            }
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(RESOURCE);
        return true;
    }

    /*
     * Return: "return" Expression?
     */
    public static boolean parseReturn(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, RETURN_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        parseExpression(builder);
        marker.done(RETURN);
        return true;
    }

    /*
     * SatisfiedTypes: "satisfies" Type ("&" Type)*
     */
    public static boolean parseSatisfiedTypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SATISFIES_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(SATISFIED_TYPES);
        return true;
    }

    /*
     * SatisfiesCondition: "satisfies" Type Type
     */
    public static boolean parseSatisfiesCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SATISFIES_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        marker.done(SATISFIES_CONDITION);
        return true;
    }

    /*
     * SelfReference: "this" | "super" | "outer"
     */
    public static boolean parseSelfReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, THIS_KEYWORD)
                && !find(builder, SUPER_KEYWORD)
                && !find(builder, OUTER_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(SELF_REFERENCE);
        return true;
    }

    /*
     * Sequence: Expression ("," Expression)* | Expression "..."
     */
    public static boolean parseSequence(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseExpression(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (find(builder, COMMA_OPERATOR)) {
            if (!parseExpression(builder)) {
                builder.error(CeylonBundle.message("expected.expression"));
            }
            while (find(builder, COMMA_OPERATOR)) {
                if (!parseExpression(builder)) {
                    builder.error(CeylonBundle.message("expected.expression"));
                }
            }
        } else if (find(builder, ELLIPSES_OPERATOR)) {
        } else {
            builder.error(CeylonBundle.message("expected.commaorellipses"));
        }
        marker.done(SEQUENCE);
        return true;
    }

    /*
     * SequencedParam: Annotation* UnionType "..." MemberName
     */
    public static boolean parseSequencedParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder)) {
            //
        }
        if (!parseUnionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(SEQUENCED_PARAM);
        return true;
    }

    /*
     * SequencedType: TypeName "..."
     */
    public static boolean parseSequencedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
        marker.done(SEQUENCED_TYPE);
        return true;
    }

    /*
     * SequencedTypeParam: TypeName "..."
     */
    public static boolean parseSequencedTypeParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
        marker.done(SEQUENCED_TYPE_PARAM);
        return true;
    }

    /*
     * SequenceInstantiation = "{" Sequence? "}"
     */
    public static boolean parseSequenceInstantiation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        parseSequence(builder);
        require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(SEQUENCE_INSTANTIATION);
        return true;
    }

    /*
     * SimpleAttribute: AttributeHeader ( (Specifier | Initializer)? ";" | NamedArguments )
     */
    public static boolean parseSimpleAttribute(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseAttributeHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if ((parseSpecifier(builder) || parseInitializer(builder))) {
            require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        } else if (parseNamedArguments(builder)) {
        } else {
            builder.error(CeylonBundle.message("expected.specifierorinitializerornamedarguments"));
        }
        marker.done(SIMPLE_ATTRIBUTE);
        return true;
    }

    /*
     * SimpleParam: UnionType MemberName
     */
    public static boolean parseSimpleParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(SIMPLE_PARAM);
        return true;
    }

    /*
     * Specification: MemberName Specifier ";"
     */
    public static boolean parseSpecification(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseSpecifier(builder)) {
            builder.error(CeylonBundle.message("expected.specifier"));
        }
        require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(SPECIFICATION);
        return true;
    }

    /*
     * SpecifiedNamedArgument: MemberName Specifier ";"
     */
    public static boolean parseSpecifiedNamedArgument(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseSpecifier(builder)) {
            builder.error(CeylonBundle.message("expected.specifier"));
        }
        require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(SPECIFIED_NAMED_ARGUMENT);
        return true;
    }

    /*
     * Specifier: "=" Expression
     */
    public static boolean parseSpecifier(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SPECIFY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        marker.done(SPECIFIER);
        return true;
    }

    /*
     * Statement: ExpressionStatement | Specification | DirectiveStatement | ControlStructure
     */
    public static boolean parseStatement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseExpressionStatement(builder)
                && !parseSpecification(builder)
                && !parseDirectiveStatement(builder)
                && !parseControlStructure(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(STATEMENT);
        return true;
    }

    /*
     * StringTemplate: StringLiteral (Expression StringLiteral)+
     */
    public static boolean parseStringTemplate(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, STRING_LITERAL)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        require(builder, STRING_LITERAL, CeylonBundle.message("expected.stringliteral"));
        while (parseExpression(builder)) {
            require(builder, STRING_LITERAL, CeylonBundle.message("expected.stringliteral"));
        }
        marker.done(STRING_TEMPLATE);
        return true;
    }

    /*
     * Switch: "switch" "(" Expression ")"
     */
    public static boolean parseSwitch(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SWITCH_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        require(builder, LEFT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.leftparenthesis"));
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.expression"));
        }
        require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(SWITCH);
        return true;
    }

    /*
     * SwitchCaseElse: Switch ( Cases | "{" Cases "}" )
     */
    public static boolean parseSwitchCaseElse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseSwitch(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseCases(builder)) {
        } else if (find(builder, LEFT_BRACE_OPERATOR)) {
            if (!parseCases(builder)) {
                builder.error(CeylonBundle.message("expected.cases"));
            }
            require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        } else {
            builder.error(CeylonBundle.message("expected.caseorleftbrace"));
        }
        marker.done(SWITCH_CASE_ELSE);
        return true;
    }

    /*
     * Throw: "throw" Expression?
     */
    public static boolean parseThrow(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, THROW_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        parseExpression(builder);
        marker.done(THROW);
        return true;
    }

    /*
     * TopLevelDeclaration: TypeDeclaration | Method | SimpleAttribute | AttributeGetter
     */
    public static boolean parseTopLevelDeclaration(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeDeclaration(builder)
                && !parseMethod(builder)
                && !parseSimpleAttribute(builder)
                && !parseAttributeGetter(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TOP_LEVEL_DECLARATION);
        return true;
    }

    /*
     * Try: "try" ("(" Resource ")")? Block
     */
    public static boolean parseTry(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, TRY_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }

        if (find(builder, LEFT_PARENTHESIS_OPERATOR)) {
            if (!parseResource(builder)) {
                builder.error(CeylonBundle.message("expected.resource"));
            }
            require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        }

        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(TRY);
        return true;
    }

    /*
     * TryCatchFinally: Try Catch* Finally?
     */
    public static boolean parseTryCatchFinally(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTry(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (parseCatch(builder)) {
            //
        }
        parseFinally(builder);
        marker.done(TRY_CATCH_FINALLY);
        return true;
    }

    /*
     * Type: TypeNameWithArguments ("." TypeNameWithArguments)*
     */
    public static boolean parseType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeNameWithArguments(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (find(builder, MEMBER_OPERATOR)) {
            if (!parseTypeNameWithArguments(builder)) {
                builder.error(CeylonBundle.message("expected.typenamewitharguments"));
            }
        }
        marker.done(TYPE);
        return true;
    }

    /*
     * TypeAlias: TypeName "="
     */
    public static boolean parseTypeAlias(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!require(builder, SPECIFY_OPERATOR, CeylonBundle.message("expected.specify"))) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TYPE_ALIAS);
        return true;
    }

    /*
     * TypeArguments: "<" (UnionType ",")* (UnionType | SequencedType) ">"
     */
    public static boolean parseTypeArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LESS_THAN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseUnionType(builder)) {
            require(builder, COMMA_OPERATOR, CeylonBundle.message("expected.comma"));
        }
        if (!parseUnionType(builder)
            || parseSequencedType(builder)) {
            builder.error(CeylonBundle.message("expected.uniontypeofsequencedtype"));
        }
        require(builder, GREATER_THAN_OPERATOR, CeylonBundle.message("expected.greaterthan"));
        marker.done(TYPE_ARGUMENTS);
        return true;
    }

    /*
     * TypeConstraint: "given" TypeName TypeParams? Params? TypeConstraintInheritance
     */
    public static boolean parseTypeConstraint(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, GIVEN_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseTypeName(builder)) {
            builder.error(CeylonBundle.message("expected.typename"));
        }
        parseTypeParams(builder);
        parseParams(builder);
        if (!parseTypeConstraintInheritance(builder)) {
            builder.error(CeylonBundle.message("expected.typeconstraintinheritance"));
        }
        marker.done(TYPE_CONSTRAINT);
        return true;
    }

    /*
     *                                       PROPOSAL
     * TypeConstraintInheritance: CaseTypes? Metatypes? SatisfiedTypes? AbstractedType?
     */
    public static boolean parseTypeConstraintInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        //parseMetaTypes(builder);
        parseSatisfiedTypes(builder);
        parseAbstractedType(builder);
        marker.done(TYPE_CONSTRAINT_INHERITANCE);
        return true;
    }

    /*
     * TypeConstraints: TypeConstraint+
     */
    public static boolean parseTypeConstraints(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeConstraint(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (parseTypeConstraint(builder)) {
            //
        }
        marker.done(TYPE_CONSTRAINTS);
        return true;
    }

    /*
     * TypeDeclaration: Class | Object | Interface
     */
    public static boolean parseTypeDeclaration(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseClass(builder)
                && !parseObject(builder)
                && !parseInterface(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TYPE_DECLARATION);
        return true;
    }

    /*
     * TypedVariable: UnionType MemberName
     */
    public static boolean parseTypedVariable(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(TYPED_VARIABLE);
        return true;
    }

    /*
     * TypeMeta: Type
     */
    public static boolean parseTypeMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TYPE_META);
        return true;
    }

    /*
     * TypeName: UIdentifier
     */
    public static boolean parseTypeName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, UPPERCASE_IDENTIFIER)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TYPE_NAME);
        return true;
    }

    /*
     * TypeNameWithArguments: TypeName TypeArguments?
     */
    public static boolean parseTypeNameWithArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseTypeArguments(builder);
        marker.done(TYPE_NAME_WITH_ARGUMENTS);
        return true;
    }

    /*
     * TypeParam: Variance? TypeName
     */
    public static boolean parseTypeParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseVariance(builder);
        if (!parseTypeName(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(TYPE_PARAM);
        return true;
    }

    /*
     * TypeParams: "<" (TypeParam ",")* (TypeParam | SequencedTypeParam) ">"
     */
    public static boolean parseTypeParams(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, LESS_THAN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseTypeParam(builder)) {
            require(builder, COMMA_OPERATOR, CeylonBundle.message("expected.comma"));
        }
        if (!parseTypeParam(builder)
                || parseSequencedTypeParam(builder)) {
            builder.error(CeylonBundle.message("expected.typeparamorsequencedtypeparam"));
        }
        require(builder, GREATER_THAN_OPERATOR, CeylonBundle.message("expected.greaterthan"));
        marker.done(TYPE_PARAMS);
        return true;
    }

    /*
     * TypeSpecifier: "=" Type
     */
    public static boolean parseTypeSpecifier(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SPECIFY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        marker.done(TYPE_SPECIFIER);
        return true;
    }

    /*
     * UnionType: IntersectionType ("|" IntersectionType)*
     */
    public static boolean parseUnionType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseIntersectionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        boolean found;
        do {
            found = false;
            final PsiBuilder.Marker next = builder.mark();
            if (find(builder, UNION_OPERATOR)) {
                if (parseIntersectionType(builder)) {
                    next.drop();
                    found = true;
                } else {
                    builder.error(CeylonBundle.message("expected.intersectiontype"));
                    next.rollbackTo();
                }
            } else {
                next.drop();
            }
        } while (found);
        marker.done(UNION_TYPE);
        return true;
    }

    /*
     * ValueMeta: MemberName TypeArguments?
     */
    public static boolean parseValueMeta(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        parseTypeArguments(builder);
        marker.done(VALUE_META);
        return true;
    }

    /*
     * ValueReference: (Receiver ".")? MemberName
     */
    public static boolean parseValueReference(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseReciever(builder)) {
            find(builder, MEMBER_OPERATOR);
        }
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(VALUE_REFERENCE);
        return true;
    }

    /*
     * Variable: UnionType? MemberName
     */
    public static boolean parseVariable(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseUnionType(builder);
        if (!parseMemberName(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(VARIABLE);
        return true;
    }

    /*
     * Variance: "out" | "in"
     */
    public static boolean parseVariance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IN_KEYWORD)
                && !find(builder, OUT_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(VARIANCE);
        return true;
    }

    /*
     * While: LoopCondition Block
     */
    public static boolean parseWhile(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseLoopCondition(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseBlock(builder)) {
            builder.error(CeylonBundle.message("expected.block"));
        }
        marker.done(WHILE);
        return true;
    }




    //
    // Operator expression
    //




    /*
     * OperatorExpression: Invocation | Assignment | CompoundAssignment | Format | Equalities | Comparison |
     *                    Containment | Assignability | Inheritance | Not | LogicalCondition | Existance | Default |
     *                    NullsafeInvocation | KeyedItemAccess | Spans | SpreadInvocation | RangeOrEntryConstruction |
     *                    Conditional | IncrementOrDecrement | NumericalOperation | NumericalAssignment |
     *                    SlotwiseOperator | SlotwiseAssignment | InversionOperation | Complement
     */
    public static boolean parseOperatorExpression(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseInvocation(builder)
                && !parseAssignment(builder)
                && !parseCompountAssignment(builder)
                && !parseFormat(builder)
                && !parseEqualities(builder)
                && !parseComparison(builder)
                && !parseContainment(builder)
                && !parseAssignability(builder)
                && !parseInheritance(builder)
                && !parseNot(builder)
                && !parseLogicalCondition(builder)
                && !parseExistance(builder)
                && !parseDefault(builder)
                && !parseNullsafeInvocation(builder)
                && !parseKeyedItemAccess(builder)
                && !parseSpans(builder)
                && !parseSpreadInvocation(builder)
                && !parseRangeOrEntryConstruction(builder)
                && !parseConditional(builder)
                && !parseComplement(builder)
                && !parseNumericalOperation(builder)
                && !parseSlotwiseOperator(builder)
                && !parseInversionOperation(builder)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(OPERATOR_EXPRESSION);
        return true;
    }

    /*
     * IncrementOrDecrement: Primary ( "++" | "--" ) | ( "++" | "--" ) Primary
     */
    public static boolean parseIncrementOrDecrement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parsePrimary(builder)) {
            if (!find(builder, INCREMENT_OPERATOR)
                    && !find(builder, DECREMENT_OPERATOR)) {
                builder.error(CeylonBundle.message("expected.incrementordecrement"));
            }
        } else if (find(builder, INCREMENT_OPERATOR)
                || find(builder, DECREMENT_OPERATOR)) {
            if (!parsePrimary(builder)) {
                builder.error(CeylonBundle.message("expected.primary"));
            }
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(INCREMENT_OR_DECREMENT);
        return true;
    }

    /*
     * Assignment: MemberReference ( ":=" | "+=" | "-=" | "*=" | "/=" | "%=" | "&=" | "|=" | "^=" | "~=" | "&&=" | "||=" ) Primary
     */
    public static boolean parseAssignment(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberReference(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, ASSIGN_OPERATOR)
                && !find(builder, ADD_ASSIGN_OPERATOR)
                && !find(builder, SUBTRACT_ASSIGN_OPERATOR)
                && !find(builder, DIVIDE_ASSIGN_OPERATOR)
                && !find(builder, MULTIPLY_ASSIGN_OPERATOR)
                && !find(builder, MODULO_ASSIGN_OPERATOR)
                && !find(builder, UNION_ASSIGN_OPERATOR)
                && !find(builder, INTERSECTION_ASSIGN_OPERATOR)
                && !find(builder, XOR_ASSIGN_OPERATOR)
                && !find(builder, COMPLEMENT_ASSIGN_OPERATOR)
                && !find(builder, OR_ASSIGN_OPERATOR)
                && !find(builder, AND_ASSIGN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(ASSIGNMENT);
        return true;
    }

    /*
     * Equalities: Primary ".=" MemberReference Arguments?
     */
    public static boolean parseCompountAssignment(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, APPLY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberReference(builder)) {
            builder.error(CeylonBundle.message("expected.memberreference"));
            marker.done(COMPOUND_ASSIGNMENT);
            return true;
        }
        parseArguments(builder);
        marker.done(COMPOUND_ASSIGNMENT);
        return true;
    }

    /*
     * Format: "$" Primary
     */
    public static boolean parseFormat(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, FORMAT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        marker.done(FORMAT);
        return true;
    }

    /*
     * Equalities: Primary ( "===" | "==" | "!=" ) Primary
     */
    public static boolean parseEqualities(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, IDENTICAL_OPERATOR)
                && !find(builder, EQUAL_OPERATOR)
                && !find(builder, NOT_EQUAL_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(EQUALITIES);
        return true;
    }

    /*
     * Comparison: Primary ( "<" | "<=" | "<=>" | "=>" | ">" ) Primary
     */
    public static boolean parseComparison(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, LESS_THAN_OPERATOR)
                && !find(builder, LESS_THAN_OR_EQUAL_TO_OPERATOR)
                && !find(builder, COMPARE_OPERATOR)
                && !find(builder, GREATER_THAN_OR_EQUAL_TO_OPERATOR)
                && !find(builder, GREATER_THAN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(COMPARISON);
        return true;
    }

    /*
     * Containment: MemberReference "in" Primary
     */
    public static boolean parseContainment(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberReference(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, IN_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(CONTAINMENT);
        return true;
    }

    /*
     * Assignability: "is" Type Primary
     */
    public static boolean parseAssignability(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, IS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(ASSIGNABILITY);
        return true;
    }

    /*
     * Inheritance: "satisfies" Type Primary
     */
    public static boolean parseInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, SATISFIES_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(INHERITANCE);
        return true;
    }

    /*
     * Not: "!" Primary
     */
    public static boolean parseNot(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, NOT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(NOT);
        return true;
    }

    /*
     * LogicalCondition: Primary ( "||" | "&&" ) Primary
     */
    public static boolean parseLogicalCondition(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, OR_OPERATOR)
                && !find(builder, AND_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(LOGICAL_CONDITION);
        return true;
    }

    /*
     * Existance: ( "exists" | "nonempty" ) Primary
     */
    public static boolean parseExistance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, EXISTS_KEYWORD)
              && !find(builder, NONEMPTY_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(EXISTANCE);
        return true;
    }

    /*
     * Default: Primary "?" Primary
     */
    public static boolean parseDefault(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, DEFAULT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        marker.done(DEFAULT);
        return true;
    }

    /*
     * NullsafeInvocation: Primary "?." MemberReference Arguments?
     */
    public static boolean parseNullsafeInvocation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, EXISTS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.memberreference"));
            marker.rollbackTo();
            return false;
        }
        parseArguments(builder);
        marker.done(NULLSAFE_INVOCATION);
        return true;
    }

    /*
     * KeyedItemAccess: Primary ( "[" | "?[" ) Primary "]"
     */
    public static boolean parseKeyedItemAccess(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, LEFT_BRACKET_OPERATOR)
                && !find(builder, NULLSAFE_LOOKUP_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, RIGHT_BRACKET_OPERATOR)) {
            builder.error(CeylonBundle.message("expected.rightbracket"));
            marker.rollbackTo();
            return false;
        }
        marker.done(KEYED_ITEM_ACCESS);
        return true;
    }

    /*
     * Spans: Primary "[" Primary ( ".." Primary | "..." ) "]"
     */
    public static boolean parseSpans(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, LEFT_BRACKET_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
            marker.rollbackTo();
            return false;
        }
        if (find(builder, RANGE_OPERATOR)) {
            if (!parsePrimary(builder)) {
                builder.error(CeylonBundle.message("expected.primary"));
                marker.done(SPANS);
                return true;
            }
        } else if (find(builder, RANGE_OPERATOR)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, RIGHT_BRACKET_OPERATOR)) {
            builder.error(CeylonBundle.message("expected.rightbracket"));
            marker.done(SPANS);
            return true;
        }
        marker.done(SPANS);
        return true;
    }

    /*
     * SpreadInvocation: Primary ( "[]." MemberReference | Arguments )
     */
    public static boolean parseSpreadInvocation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (find(builder, SPREAD_OPERATOR)) {
            if (!parseMemberReference(builder)) {
                builder.error(CeylonBundle.message("expected.memberreference"));
            }
        } else if (parseArguments(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        marker.done(SPREAD_INVOCATION);
        return true;
    }

    /*
     * RangeOrEntryConstruction: Primary ( ".." | "->" ) Primary
     */
    public static boolean parseRangeOrEntryConstruction(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, RANGE_OPERATOR)
                && !find(builder, ENTRY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(RANGE_OR_ENTRY_CONSTRUCTION);
        return true;
    }

    /*
     * Conditional: Primary ( "then" | "else" ) Primary
     */
    public static boolean parseConditional(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, THEN_KEYWORD)
                && !find(builder, ELSE_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(CONDITIONAL);
        return true;
    }

    /*
     * InversionOperation: ( "+" | "-" ) Primary
     */
    public static boolean parseInversionOperation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, ADD_OPERATOR)
                && !find(builder, SUBTRACT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(INVERSION_OPERATION);
        return true;
    }

    /*
     * NumericalOperation: Primary ( "+" | "-" | "*" | "/" | "%" | "**" ) Primary
     */
    public static boolean parseNumericalOperation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, ADD_OPERATOR)
                && !find(builder, SUBTRACT_OPERATOR)
                && !find(builder, MULTIPLY_OPERATOR)
                && !find(builder, DIVIDE_OPERATOR)
                && !find(builder, MODULO_OPERATOR)
                && !find(builder, EXPONENT)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(NUMERICAL_OPERATION);
        return true;
    }

    /*
     * Complement: "~" Primary
     */
    public static boolean parseComplement(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!find(builder, COMPLEMENT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(COMPLEMENT);
        return true;
    }

    /*
     * SlotwiseOperator: Primary ( "|" | "&" | "^" | "~" ) Primary
     */
    public static boolean parseSlotwiseOperator(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePrimary(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (!find(builder, OR_OPERATOR)
                && !find(builder, AND_OPERATOR)
                && !find(builder, XOR_OPERATOR)
                && !find(builder, COMPLEMENT_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parsePrimary(builder)) {
            builder.error(CeylonBundle.message("expected.primary"));
        }
        marker.done(SLOTWISE_OPERATOR);
        return true;
    }
}
