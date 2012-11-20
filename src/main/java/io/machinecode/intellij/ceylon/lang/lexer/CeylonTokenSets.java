package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.psi.tree.TokenSet;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTokenSets {

    public static final TokenSet LINE_COMMENT_TOKENS = TokenSet.create(
            CeylonTokenTypes.LINE_COMMENT
    );

    public static final TokenSet BLOCK_COMMENT_TOKENS = TokenSet.create(
            CeylonTokenTypes.MULTI_LINE_COMMENT
    );

    public static final TokenSet COMMENT_TOKENS = TokenSet.create(
            CeylonTokenTypes.SHELL_COMMENT,
            CeylonTokenTypes.LINE_COMMENT,
            CeylonTokenTypes.MULTI_LINE_COMMENT
    );

    public static final TokenSet WHITE_SPACE_TOKENS = TokenSet.create(
            CeylonTokenTypes.WHITE_SPACE
    );

    public static final TokenSet STRING_LITERAL_TOKENS = TokenSet.create(
            CeylonTokenTypes.STRING_LITERAL
    );

    public static final TokenSet KEYWORD_TOKENS = TokenSet.create(
            CeylonTokenTypes.IMPORT_KEYWORD,
            CeylonTokenTypes.CLASS_KEYWORD,
            CeylonTokenTypes.INTERFACE_KEYWORD,
            CeylonTokenTypes.OBJECT_KEYWORD,
            CeylonTokenTypes.GIVEN_KEYWORD,
            CeylonTokenTypes.VALUE_KEYWORD,
            CeylonTokenTypes.ASSIGN_KEYWORD,
            CeylonTokenTypes.VOID_KEYWORD,
            CeylonTokenTypes.FUNCTION_KEYWORD,
            CeylonTokenTypes.OF_KEYWORD,
            CeylonTokenTypes.EXTENDS_KEYWORD,
            CeylonTokenTypes.SATISFIES_KEYWORD,
            CeylonTokenTypes.ADAPTS_KEYWORD,
            CeylonTokenTypes.ABSTRACTS_KEYWORD,
            CeylonTokenTypes.IN_KEYWORD,
            CeylonTokenTypes.OUT_KEYWORD,
            CeylonTokenTypes.RETURN_KEYWORD,
            CeylonTokenTypes.BREAK_KEYWORD,
            CeylonTokenTypes.CONTINUE_KEYWORD,
            CeylonTokenTypes.THROW_KEYWORD,
            CeylonTokenTypes.IF_KEYWORD,
            CeylonTokenTypes.ELSE_KEYWORD,
            CeylonTokenTypes.SWITCH_KEYWORD,
            CeylonTokenTypes.CASE_KEYWORD,
            CeylonTokenTypes.FOR_KEYWORD,
            CeylonTokenTypes.WHILE_KEYWORD,
            CeylonTokenTypes.TRY_KEYWORD,
            CeylonTokenTypes.CATCH_KEYWORD,
            CeylonTokenTypes.FINALLY_KEYWORD,
            CeylonTokenTypes.THEN_KEYWORD,
            CeylonTokenTypes.THIS_KEYWORD,
            CeylonTokenTypes.OUTER_KEYWORD,
            CeylonTokenTypes.SUPER_KEYWORD,
            CeylonTokenTypes.IS_KEYWORD,
            CeylonTokenTypes.EXISTS_KEYWORD,
            CeylonTokenTypes.NONEMPTY_KEYWORD
    );

    public static final TokenSet SEPERATOR_TOKENS = TokenSet.create(
            CeylonTokenTypes.COMMA_OPERATOR
    );

    public static final TokenSet DELIMETER_TOKENS = TokenSet.create(
            CeylonTokenTypes.SEMICOLON_OPERATOR
    );


    public static final TokenSet ALL_OPERATOR_TOKENS = TokenSet.create(
            CeylonTokenTypes.COMMA_OPERATOR,
            CeylonTokenTypes.SEMICOLON_OPERATOR,
            CeylonTokenTypes.ELLIPSES_OPERATOR,
            CeylonTokenTypes.HASH_OPERATOR,
            CeylonTokenTypes.RIGHT_BRACE_OPERATOR,
            CeylonTokenTypes.LEFT_BRACE_OPERATOR,
            CeylonTokenTypes.RIGHT_PARENTHESIS_OPERATOR,
            CeylonTokenTypes.LEFT_PARENTHESIS_OPERATOR,
            CeylonTokenTypes.RIGHT_BRACKET_OPERATOR,
            CeylonTokenTypes.LEFT_BRACKET_OPERATOR,
            CeylonTokenTypes.ARRAY_OPERATOR,
            CeylonTokenTypes.MEMBER_OPERATOR,
            CeylonTokenTypes.SAFE_MEMBER_OPERATOR,
            CeylonTokenTypes.SPREAD_OPERATOR,
            CeylonTokenTypes.SPECIFY_OPERATOR,
            CeylonTokenTypes.ADD_OPERATOR,
            CeylonTokenTypes.SUBTRACT_OPERATOR,
            CeylonTokenTypes.DIVIDE_OPERATOR,
            CeylonTokenTypes.MULTIPLY_OPERATOR,
            CeylonTokenTypes.MODULO_OPERATOR,
            CeylonTokenTypes.POWER_OPERATOR,
            CeylonTokenTypes.INCREMENT_OPERATOR,
            CeylonTokenTypes.DECREMENT_OPERATOR,
            CeylonTokenTypes.RANGE_OPERATOR,
            CeylonTokenTypes.ENTRY_OPERATOR,
            CeylonTokenTypes.DEFAULT_OPERATOR,
            CeylonTokenTypes.NOT_OPERATOR,
            CeylonTokenTypes.AND_OPERATOR,
            CeylonTokenTypes.OR_OPERATOR,
            CeylonTokenTypes.COMPLEMENT_OPERATOR,
            CeylonTokenTypes.INTERSECTION_OPERATOR,
            CeylonTokenTypes.UNION_OPERATOR,
            CeylonTokenTypes.XOR_OPERATOR,
            CeylonTokenTypes.IDENTICAL_OPERATOR,
            CeylonTokenTypes.EQUAL_OPERATOR,
            CeylonTokenTypes.NOT_EQUAL_OPERATOR,
            CeylonTokenTypes.LESS_THAN_OPERATOR,
            CeylonTokenTypes.GREATER_THAN_OPERATOR,
            CeylonTokenTypes.LESS_THAN_OR_EQUAL_TO_OPERATOR,
            CeylonTokenTypes.GREATER_THAN_OR_EQUAL_TO_OPERATOR,
            CeylonTokenTypes.COMPARE_OPERATOR,
            CeylonTokenTypes.ASSIGN_OPERATOR,
            CeylonTokenTypes.APPLY_OPERATOR,
            CeylonTokenTypes.ADD_ASSIGN_OPERATOR,
            CeylonTokenTypes.SUBTRACT_ASSIGN_OPERATOR,
            CeylonTokenTypes.DIVIDE_ASSIGN_OPERATOR,
            CeylonTokenTypes.MULTIPLY_ASSIGN_OPERATOR,
            CeylonTokenTypes.MODULO_ASSIGN_OPERATOR,
            CeylonTokenTypes.UNION_ASSIGN_OPERATOR,
            CeylonTokenTypes.INTERSECTION_ASSIGN_OPERATOR,
            CeylonTokenTypes.XOR_ASSIGN_OPERATOR,
            CeylonTokenTypes.COMPLEMENT_ASSIGN_OPERATOR,
            CeylonTokenTypes.OR_ASSIGN_OPERATOR,
            CeylonTokenTypes.AND_ASSIGN_OPERATOR
    );
}
