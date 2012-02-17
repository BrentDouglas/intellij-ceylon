package au.com.machinecode.intellij.ceylon.lang.parser;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import au.com.machinecode.intellij.ceylon.lang.lexer.CeylonTokenTypes;
import au.com.machinecode.intellij.ceylon.lang.parser.parsers.Util;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParser implements PsiParser, CeylonTokenTypes, CeylonElementTypes {
    @NotNull
    public ASTNode parse(final IElementType root, final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCompilationUnit(builder);
        marker.done(root);
        return builder.getTreeBuilt();
    }

    /*
     * Abbreviation: "?" | "[]"
     */
    public static boolean parseAbbreviation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, DEFAULT_OPERATOR)
                && !Util.find(builder, ARRAY_OPERATOR)) {
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
        while (parseAbbreviation(builder));
        marker.done(ABBREVIATED_TYPE);
        return true;
    }

    /*
     * AbstractedType: "abstracts" Type
     */
    public static boolean parseAbstractedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, ABSTRACTS_KEYWORD)) {
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
     * AdaptedTypes: "adapts" Type ("&" Type)*
     */
    public static boolean parseAdaptedTypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, ADAPTS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(ADAPTED_TYPES);
        return true;
    }

    /*
     * Annotation: MemberName ( Arguments | Literal+ )?
     */
    public static boolean parseAnnotation(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseMemberName(builder))) {
            marker.rollbackTo();
            return false;
        }
        if (!parseArguments(builder)) {
            //TODO: Clarify
            while (parseLiteral(builder));
        }
        marker.done(ANNOTATION);
        return true;
    }

    /*
     * Attribute: Annotation* (SimpleAttribute | AttributeGetter | AttributeSetter)
     */
    public static boolean parseAttribute(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
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
     * AttributeSetter: "assign" MemberName Block
     */
    public static boolean parseAttributeSetter(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, ASSIGN_KEYWORD)) {
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
     * AttributeHeader: (UnionType | "value") MemberName
     */
    public static boolean parseAttributeHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseUnionType(builder)
                && ! Util.find(builder, VALUE_KEYWORD)) {
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
     * Block: "{" (Declaration | Statement)* "}"
     */
    public static boolean parseBlock(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder) || parseStatement(builder));
        Util.require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace."));
        marker.done(BLOCK);
        return true;
    }

    /*
     * Break: "break"
     */
    public static boolean parseBreak(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, BREAK_KEYWORD)) {
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
                && !Util.find(builder, VOID_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        if (parseParams(builder)) {
            while (parseParams(builder));
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        marker.done(CALLABLE_PARAM);
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
        if (!Util.find(builder, OF_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseCaseType(builder)) {
            builder.error(CeylonBundle.message("expected.casetype"));
        }
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseCaseType(builder)) {
                builder.error(CeylonBundle.message("expected.casetype"));
            }
        }
        marker.done(CASE_TYPES);
        return true;
    }

    /*
     * Class: Annotation* ClassHeader (ClassBody | TypeSpecifier ";")
     */
    public static boolean parseClass(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
        if (!parseClassHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseClassBody(builder)) {
        } else if (parseTypeSpecifier(builder)) {
            Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
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
        if (!Util.find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder) || parseStatement(builder));
        Util.require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(CLASS_BODY);
        return true;
    }

    /*
     * ClassHeader: "class" TypeName TypeParams? Params ClassInheritance TypeConstraints?
     */
    public static boolean parseClassHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, CLASS_KEYWORD)) {
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
     * ClassInheritance: CaseTypes? Metatypes? ExtendedType? SatisfiedTypes?
     */
    public static boolean parseClassInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        parseMetaTypes(builder);
        parseAdaptedTypes(builder);
        parseSatisfiedTypes(builder);
        marker.done(CLASS_INHERITANCE);
        return true;
    }

    /*
     * CompilationUnit: Import* ToplevelDeclaration+
     */
    public static boolean parseCompilationUnit(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseImport(builder)) ;
        if (!parseTopLevelDeclaration(builder)) {
            while (parseTopLevelDeclaration(builder));
        } else {
            builder.error(CeylonBundle.message("expected.topleveldeclaration"));
        }
        marker.done(COMPILATION_UNIT);
        return true;
    }

    /*
     * Continue: "continue"
     */
    public static boolean parseContinue(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, CONTINUE_KEYWORD)) {
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
                && !parseSwitchCaseWhile(builder)
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
        Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(DIRECTIVE_STATEMENT);
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
        Util.require(builder, ENTRY_OPERATOR, CeylonBundle.message("expected.entryoperator"));
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
        if (Util.find(builder, ENTRY_OPERATOR)) {
            if (!parseAbbreviatedType(builder)) {
                builder.error(CeylonBundle.message("expected.abbreviatedtype"));
            }
        }
        marker.done(ENTRY_TYPE);
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
        Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(EXPRESSION_STATEMENT);
        return true;
    }

    /*
     * ExtendedType: "extends" ("super" ".")? Type PositionalArguments
     */
    public static boolean parseExtendedType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, EXTENDS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (Util.find(builder, SUPER_KEYWORD)) {
            Util.require(builder, MEMBER_OPERATOR, CeylonBundle.message("expected.memberoperator"));
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
     * FullPackageName: PackageName ("." PackageName)*
     */
    public static boolean parseFullPackageName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parsePackageName(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (Util.find(builder, MEMBER_OPERATOR)) {
            if (!parsePackageName(builder)) {
                builder.error(CeylonBundle.message("expected.packagename"));
            }
        }
        marker.done(FULL_PACKAGE_NAME);
        return true;
    }

    /*
     * Import: "import" FullPackageName "{" ImportElements? "}"
     */
    public static boolean parseImport(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, IMPORT_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseFullPackageName(builder)) {
            marker.error(CeylonBundle.message("expected.fullpackagename"));
        }
        Util.require(builder, LEFT_BRACE_OPERATOR, CeylonBundle.message("expected.leftbrace"));
        while (parseImportElements(builder));
        Util.require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.leftbrace"));
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
            while (Util.find(builder, COMMA_OPERATOR)) {
                if (!parseImportElement(builder)) {
                    builder.error(CeylonBundle.message("expected.comma"));
                }
            }
            //TODO: Error message and check wildcard on failed import element
            if (Util.find(builder, COMMA_OPERATOR)) {
                if (!parseImportWildcard(builder)) {
                    builder.error(CeylonBundle.message("expected.comma"));
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
        if (!Util.find(builder, ELLIPSES_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(IMPORT_WILDCARD);
        return true;
    }

    /*
     * Interface: Annotation* InterfaceHeader (InterfaceBody | TypeSpecifier ";")
     */
    public static boolean parseInterface(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
        if (!parseInterfaceHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        //TODO:
        if (parseInterfaceBody(builder)) {
        } else if (parseTypeSpecifier(builder)) {
            Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
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
        if (!Util.find(builder, LEFT_BRACE_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseDeclaration(builder));
        Util.require(builder, RIGHT_BRACE_OPERATOR, CeylonBundle.message("expected.rightbrace"));
        marker.done(INTERFACE_BODY);
        return true;
    }

    /*
     * InterfaceHeader: "interface" TypeName TypeParams? InterfaceInheritance TypeConstraints?
     */
    public static boolean parseInterfaceHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, INTERFACE_KEYWORD)) {
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
     * InterfaceInheritance: CaseTypes? Metatypes? AdaptedTypes? SatisfiedTypes?
     */
    public static boolean parseInterfaceInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        parseMetaTypes(builder);
        parseAdaptedTypes(builder);
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
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseEntryType(builder)) {
                builder.error(CeylonBundle.message("expected.entrytype"));
            }
        }
        marker.done(INTERSECTION_TYPE);
        return true;
    }

    /*
     * Initializer: ":=" Expression
     */
    public static boolean parseInitializer(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, ASSIGN_OPERATOR)) {
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
     * MemberName: LIdentifier
     */
    public static boolean parseMemberName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, LOWERCASE_IDENTIFIER)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(MEMBER_NAME);
        return true;
    }

    /*
     * Metatypes: "is" Type ("&" Type)*
     */
    public static boolean parseMetatypes(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, IS_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(META_TYPES);
        return true;
    }

    /*
     * Method: Annotation* MethodHeader (Block | NamedArguments | Specifier? ";")
     */
    public static boolean parseMethod(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
        if (!parseMethodHeader(builder)) {
            marker.rollbackTo();
            return false;
        }
        if (parseBlock(builder)) {
        } else if (parseNamedArguments(builder)) {
        } else {
            parseSpecifier(builder);
            if (!Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"))) {
                builder.error(CeylonBundle.message("expected.blockornamedargumentsorspecifierandsemicolon"));
            }
        }
        marker.done(METHOD);
        return true;
    }

    /*
     * MethodHeader: (UnionType | "function" | "void") MemberName TypeParams? Params+ Metatypes? TypeConstraints?
     */
    public static boolean parseMethodHeader(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (parseUnionType(builder)) {
        } else if (Util.find(builder, FUNCTION_KEYWORD)) {
        } else if (Util.find(builder, VOID_KEYWORD)) {
        } else {
            marker.rollbackTo();
            return false;
        }
        if (!parseMemberName(builder)) {
            builder.error(CeylonBundle.message("expected.membername"));
        }
        parseTypeParams(builder);
        if (parseParams(builder)) {
            while (parseParams(builder));
        } else {
            builder.error(CeylonBundle.message("expected.params"));
        }
        parseMetatypes(builder);
        parseTypeConstraints(builder);
        marker.done(METHOD_HEADER);
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
        Util.require(builder, SPECIFY_OPERATOR, CeylonBundle.message("expected.specify"));
        marker.done(METHOD_ATTRIBUTE_ALIAS);
        return true;
    }

    /*
     * Object: Annotation* ObjectHeader ClassBody
     */
    public static boolean parseObject(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
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
        if (!Util.find(builder, OBJECT_KEYWORD)) {
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
        if (!Util.find(builder, PACKAGE_IDENTIFIER)) {
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
        while (parseAnnotation(builder));
        if (!parseSimpleParam(builder)
                && !parseCallableParam(builder)
                && !parseEntryPairParam(builder)) {
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
        if (!Util.find(builder, LEFT_PARENTHESIS_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseParam(builder)) {
            builder.error(CeylonBundle.message("expected.param"));
        }
        //TODO:
        Util.require(builder, RIGHT_PARENTHESIS_OPERATOR, CeylonBundle.message("expected.rightparenthesis"));
        marker.done(PARAMS);
        return true;
    }

    /*
     * Return: "return" Expression?
     */
    public static boolean parseReturn(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, RETURN_KEYWORD)) {
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
        if (!Util.find(builder, SATISFIES_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseType(builder)) {
            builder.error(CeylonBundle.message("expected.type"));
        }
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseType(builder)) {
                builder.error(CeylonBundle.message("expected.type"));
            }
        }
        marker.done(SATISFIED_TYPES);
        return true;
    }

    /*
     * SequencedParam: Annotation* UnionType "..." MemberName
     */
    public static boolean parseSequencedParam(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        while (parseAnnotation(builder));
        if (!parseUnionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        Util.require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
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
        Util.require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
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
        Util.require(builder, ELLIPSES_OPERATOR, CeylonBundle.message("expected.ellipses"));
        marker.done(SEQUENCED_TYPE_PARAM);
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
        //TODO:
        if ((parseSpecifier(builder) || parseInitializer(builder)) && Util.find(builder, SEMICOLON_OPERATOR)) {
        } else if (parseNamedArguments(builder)) {
        } else {
            builder.error(CeylonBundle.message("expected.specifierorinitializerwithsemicolonornamedarguments"));
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
        Util.require(builder, SEMICOLON_OPERATOR, CeylonBundle.message("expected.semicolon"));
        marker.done(SPECIFICATION);
        return true;
    }

    /*
     * Specifier: "=" Expression
     */
    public static boolean parseSpecifier(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, SPECIFY_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        if (!parseExpression(builder)) {
            builder.error(CeylonBundle.message("expected.specifier"));
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
     * Throw: "throw" Expression?
     */
    public static boolean parseThrow(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, THROW_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        parseExpression(builder);
        marker.done(THROW);
        return true;
    }

    /*
     * ToplevelDeclaration: TypeDeclaration | Method | SimpleAttribute | AttributeGetter
     */
    public static boolean parseToplevelDeclaration(final PsiBuilder builder) {
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
     * Type: TypeNameWithArguments ("." TypeNameWithArguments)*
     */
    public static boolean parseType(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!parseTypeNameWithArguments(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (Util.find(builder, MEMBER_OPERATOR)) {
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
        Util.require(builder, SPECIFY_OPERATOR, CeylonBundle.message("expected.specify"));
        marker.done(TYPE_ALIAS);
        return true;
    }

    /*
     * TypeArguments: "<" (UnionType ",")* (UnionType | SequencedType) ">"
     */
    public static boolean parseTypeArguments(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, LESS_THAN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseUnionType(builder)) {
            Util.require(builder, COMMA_OPERATOR, CeylonBundle.message("expected.comma"));
        }
        if (!parseUnionType(builder)
            || parseSequencedType(builder)) {
            builder.error(CeylonBundle.message("expected.uniontypeofsequencedtype"));
        }
        Util.require(builder, GREATER_THAN_OPERATOR, CeylonBundle.message("expected.greaterthan"));
        marker.done(TYPE_ARGUMENTS);
        return true;
    }

    /*
     * TypeConstraint: "given" TypeName TypeParams? Params? TypeConstraintInheritance
     */
    public static boolean parseTypeConstraint(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, GIVEN_KEYWORD)) {
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
     * TypeConstraintInheritance: CaseTypes? Metatypes? SatisfiedTypes? AbstractedType?
     */
    public static boolean parseTypeConstraintInheritance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        parseCaseTypes(builder);
        parseMetatypes(builder);
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
        while (parseTypeConstraint(builder));
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
     * TypeName: UIdentifier
     */
    public static boolean parseTypeName(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, UPPERCASE_IDENTIFIER)) {
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
        if (!Util.find(builder, LESS_THAN_OPERATOR)) {
            marker.rollbackTo();
            return false;
        }
        while (parseTypeParam(builder)) {
            Util.require(builder, COMMA_OPERATOR, CeylonBundle.message("expected.comma"));
        }
        if (!parseTypeParam(builder)
                || parseSequencedTypeParam(builder)) {
            builder.error(CeylonBundle.message("expected.typeparamorsequencedtypeparam"));
        }
        Util.require(builder, GREATER_THAN_OPERATOR, CeylonBundle.message("expected.greaterthan"));
        marker.done(TYPE_PARAMS);
        return true;
    }

    /*
     * TypeSpecifier: "=" Type
     */
    public static boolean parseTypeSpecifier(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, SPECIFY_OPERATOR)) {
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
        if (parseIntersectionType(builder)) {
            marker.rollbackTo();
            return false;
        }
        while (Util.find(builder, INTERSECTION_OPERATOR)) {
            if (!parseIntersectionType(builder)) {
                builder.error(CeylonBundle.message("expected.intersectiontype"));
            }
        }
        marker.done(UNION_TYPE);
        return true;
    }

    /*
     * Variance: "out" | "in"
     */
    public static boolean parseVariance(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, IN_KEYWORD)
                || !Util.find(builder, OUT_KEYWORD)) {
            marker.rollbackTo();
            return false;
        }
        marker.done(VARIANCE);
        return true;
    }

    /*
     *
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (!Util.find(builder, )) {
            marker.rollbackTo();
            return false;
        }
        marker.done();
        return true;
    }
}
