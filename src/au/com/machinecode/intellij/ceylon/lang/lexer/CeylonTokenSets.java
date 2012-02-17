package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.psi.tree.TokenSet;

import static au.com.machinecode.intellij.ceylon.lang.lexer.CeylonTokenTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTokenSets {

    public static final TokenSet LINE_COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT
    );

    public static final TokenSet BLOCK_COMMENT_TOKENS = TokenSet.create(
            MULTI_LINE_COMMENT
    );

    public static final TokenSet COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT,
            MULTI_LINE_COMMENT
    );

    public static final TokenSet TOKEN_SEPARATOR_TOKENS = TokenSet.create(
            WHITE_SPACE,
            LINE_COMMENT,
            MULTI_LINE_COMMENT
    );

    public static final TokenSet WHITE_SPACE_TOKENS = TokenSet.create(
            WHITE_SPACE
    );

    public static final TokenSet STRING_LITERAL_TOKENS = TokenSet.create(
            STRING_LITERAL
    );

    public static final TokenSet KEYWORD_TOKENS = TokenSet.create(
            IMPORT_KEYWORD,
            CLASS_KEYWORD,
            INTERFACE_KEYWORD,
            OBJECT_KEYWORD,
            GIVEN_KEYWORD,
            VALUE_KEYWORD,
            ASSIGN_KEYWORD,
            VOID_KEYWORD,
            FUNCTION_KEYWORD,
            OF_KEYWORD,
            EXTENDS_KEYWORD,
            SATISFIES_KEYWORD,
            ADAPTS_KEYWORD,
            ABSTRACTS_KEYWORD,
            IN_KEYWORD,
            OUT_KEYWORD,
            RETURN_KEYWORD,
            BREAK_KEYWORD,
            CONTINUE_KEYWORD,
            THROW_KEYWORD,
            IF_KEYWORD,
            ELSE_KEYWORD,
            SWITCH_KEYWORD,
            CASE_KEYWORD,
            FOR_KEYWORD,
            WHILE_KEYWORD,
            TRY_KEYWORD,
            CATCH_KEYWORD,
            FINALLY_KEYWORD,
            THEN_KEYWORD,
            THIS_KEYWORD,
            OUTER_KEYWORD,
            SUPER_KEYWORD,
            IS_KEYWORD,
            EXISTS_KEYWORD,
            NONEMPTY_KEYWORD
    );

    public static final TokenSet SEPERATOR_TOKENS = TokenSet.create(
            COMMA_OPERATOR
    );

    public static final TokenSet DELIMETER_TOKENS = TokenSet.create(
            SEMICOLON_OPERATOR
    );


    public static final TokenSet ALL_OPERATOR_TOKENS = TokenSet.create(
            COMMA_OPERATOR,
            SEMICOLON_OPERATOR,
            ELLIPSES_OPERATOR,
            HASH_OPERATOR,
            RIGHT_BRACE_OPERATOR,
            LEFT_BRACE_OPERATOR,
            RIGHT_PARENTHESIS_OPERATOR,
            LEFT_PARENTHESIS_OPERATOR,
            RIGHT_BRACKET_OPERATOR,
            LEFT_BRACKET_OPERATOR,
            ARRAY_OPERATOR,
            MEMBER_OPERATOR,
            SAFE_MEMBER_OPERATOR,
            SPREAD_OPERATOR,
            SPECIFY_OPERATOR,
            ADD_OPERATOR,
            SUBTRACT_OPERATOR,
            DIVIDE_OPERATOR,
            MULTIPLY_OPERATOR,
            MODULO_OPERATOR,
            POWER_OPERATOR,
            INCREMENT_OPERATOR,
            DECREMENT_OPERATOR,
            RANGE_OPERATOR,
            ENTRY_OPERATOR,
            DEFAULT_OPERATOR,
            NOT_OPERATOR,
            AND_OPERATOR,
            OR_OPERATOR,
            COMPLEMENT_OPERATOR,
            INTERSECTION_OPERATOR,
            UNION_OPERATOR,
            XOR_OPERATOR,
            IDENTICAL_OPERATOR,
            EQUAL_OPERATOR,
            NOT_EQUAL_OPERATOR,
            LESS_THAN_OPERATOR,
            GREATER_THAN_OPERATOR,
            LESS_THAN_OR_EQUAL_TO_OPERATOR,
            GREATER_THAN_OR_EQUAL_TO_OPERATOR,
            COMPARE_OPERATOR,
            ASSIGN_OPERATOR,
            APPLY_OPERATOR,
            ADD_ASSIGN_OPERATOR,
            SUBTRACT_ASSIGN_OPERATOR,
            DIVIDE_ASSIGN_OPERATOR,
            MULTIPLY_ASSIGN_OPERATOR,
            MODULO_ASSIGN_OPERATOR,
            UNION_ASSIGN_OPERATOR,
            INTERSECTION_ASSIGN_OPERATOR,
            XOR_ASSIGN_OPERATOR,
            COMPLEMENT_ASSIGN_OPERATOR,
            OR_ASSIGN_OPERATOR,
            AND_ASSIGN_OPERATOR
    );
}
