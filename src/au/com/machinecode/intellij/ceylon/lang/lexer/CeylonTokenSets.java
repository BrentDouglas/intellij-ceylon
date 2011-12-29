package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.psi.tree.TokenSet;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenType.SEMICOLON;
import static com.intellij.psi.TokenType.WHITE_SPACE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTokenSets {

    public static final TokenSet LINE_COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT
    );

    public static final TokenSet BLOCK_COMMENT_TOKENS = TokenSet.create(
            MULTI_COMMENT
    );

    public static final TokenSet COMMENT_TOKENS = TokenSet.create(
            LINE_COMMENT,
            MULTI_COMMENT
    );

    public static final TokenSet WHITE_SPACE_TOKENS = TokenSet.create(
            WHITE_SPACE
    );

    public static final TokenSet STRING_LITERAL_TOKENS = TokenSet.create(
            STRING_LITERAL
    );

    public static final TokenSet KEYWORD_TOKENS = TokenSet.create(
            IMPORT,
            CLASS_DEFINITION,
            INTERFACE_DEFINITION,
            OBJECT_DEFINITION,
            TYPE_CONSTRAINT,
            VALUE_MODIFIER,
            ASSIGN,
            VOID_MODIFIER,
            FUNCTION_MODIFIER,
            CASE_TYPES,
            EXTENDS,
            SATISFIES,
            ADAPTED_TYPES,
            ABSTRACTED_TYPE,
            IN_OP,
            OUT,
            RETURN,
            BREAK,
            CONTINUE,
            THROW,
            IF_CLAUSE,
            ELSE_CLAUSE,
            SWITCH_CLAUSE,
            CASE_CLAUSE,
            FOR_CLAUSE,
            WHILE_CLAUSE,
            TRY_CLAUSE,
            CATCH_CLAUSE,
            FINALLY_CLAUSE,
            THEN_CLAUSE,
            THIS,
            OUTER,
            SUPER,
            IS_OP,
            EXISTS,
            NONEMPTY
    );

    public static final TokenSet SEPERATOR_TOKENS = TokenSet.create(
            COMMA
    );

    public static final TokenSet DELIMETER_TOKENS = TokenSet.create(
            SEMICOLON
    );


    public static final TokenSet ALL_OPERATOR_TOKENS = TokenSet.create(
            COMMA,
            SEMICOLON,
            ELLIPSIS,
            //HASH?
            RBRACE,
            LBRACE,
            RPAREN,
            LPAREN,
            RBRACKET,
            LBRACKET,
            ARRAY,
            MEMBER_OP,
            SAFE_MEMBER_OP,
            SPREAD_OP,
            SPECIFY,
            SUM_OP,
            DIFFERENCE_OP,
            QUOTIENT_OP,
            PRODUCT_OP,
            REMAINDER_OP,
            POWER_OP,
            INCREMENT_OP,
            DECREMENT_OP,
            RANGE_OP,
            ENTRY_OP,
            DEFAULT_OP,
            NOT_OP,
            AND_OP,
            OR_OP,
            COMPLEMENT_OP,
            INTERSECTION_OP,
            UNION_OP,
            XOR_OP,
            IDENTICAL_OP,
            EQUAL_OP,
            NOT_EQUAL_OP,
            SMALLER_OP,
            LARGER_OP,
            SMALL_AS_OP,
            LARGE_AS_OP,
            COMPARE_OP,
            ASSIGN_OP,
            APPLY_OP,
            ADD_ASSIGN_OP,
            SUBTRACT_ASSIGN_OP,
            DIVIDE_ASSIGN_OP,
            MULTIPLY_ASSIGN_OP,
            REMAINDER_ASSIGN_OP,
            UNION_ASSIGN_OP,
            INTERSECT_ASSIGN_OP,
            XOR_ASSIGN_OP,
            COMPLEMENT_ASSIGN_OP,
            OR_ASSIGN_OP,
            AND_ASSIGN_OP
    );

    /*
      EOF
      ABSTRACTED_TYPE
      ADAPTED_TYPES
      ADD_ASSIGN_OP
      AND_ASSIGN_OP
      AND_OP
      APPLY_OP
      ARRAY
      ASSIGN
      ASSIGN_OP
      BREAK
      CASE_CLAUSE
      CASE_TYPES
      CATCH_CLAUSE
      CHAR_LITERAL
      CLASS_DEFINITION
      COMMA
      COMPARE_OP
      COMPILER_ANNOTATION
      COMPLEMENT_ASSIGN_OP
      COMPLEMENT_OP
      CONTINUE
      DECREMENT_OP
      DEFAULT_OP
      DIFFERENCE_OP
      DIVIDE_ASSIGN_OP
      DIGIT
      DIGITS
      ELLIPSIS
      ELSE_CLAUSE
      ENTRY_OP
      EQUAL_OP
      EXISTS
      EXTENDS
      ESCAPE_SEQUENCE
      EXPONENT
      FINALLY_CLAUSE
      FLOAT_LITERAL
      FOR_CLAUSE
      FUNCTION_MODIFIER
      FRACTIONAL_MAGNITUDE
      IDENTICAL_OP
      IF_CLAUSE
      IMPORT
      INCREMENT_OP
      INDEX_OP
      INTERFACE_DEFINITION
      INTERSECTION_OP
      INTERSECT_ASSIGN_OP
      IN_OP
      IS_OP
      IDENTIFIER_PART
      IDENTIFIER_START
      LARGER_OP
      LARGE_AS_OP
      LBRACE
      LBRACKET
      LIDENTIFIER
      LINE_COMMENT
      LPAREN
      LETTER
      MEMBER_OP
      MULTIPLY_ASSIGN_OP
      MULTI_COMMENT
      MAGNITUDE
      NATURAL_LITERAL
      NONEMPTY
      NOT_EQUAL_OP
      NOT_OP
      NON_CHARACTER_CHARS
      NON_STRING_CHARS
      OBJECT_DEFINITION
      OR_ASSIGN_OP
      OR_OP
      OUT
      OUTER
      POWER_OP
      PRODUCT_OP
      QMARK
      QUOTED_LITERAL
      QUOTIENT_OP
      QUOTED_LITERAL_PART
      RANGE_OP
      RBRACE
      RBRACKET
      REMAINDER_ASSIGN_OP
      REMAINDER_OP
      RETURN
      RPAREN
      SAFE_INDEX_OP
      SAFE_MEMBER_OP
      SATISFIES
      SEMICOLON
      SMALLER_OP
      SMALL_AS_OP
      SPECIFY
      SPREAD_OP
      STRING_LITERAL
      SUBTRACT_ASSIGN_OP
      SUM_OP
      SUPER
      SWITCH_CLAUSE
      STRING_PART
      THEN_CLAUSE
      THIS
      THROW
      TRY_CLAUSE
      TYPE_CONSTRAINT
      UIDENTIFIER
      UNION_ASSIGN_OP
      UNION_OP
      VALUE_MODIFIER
      VOID_MODIFIER
      WHILE_CLAUSE
      WS
      XOR_ASSIGN_OP
      XOR_OP
      */
}
