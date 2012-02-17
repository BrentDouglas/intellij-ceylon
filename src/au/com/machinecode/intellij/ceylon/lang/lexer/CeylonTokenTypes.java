package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.psi.TokenType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public interface CeylonTokenTypes extends TokenType {

    public static final CeylonTokenType WHITE_SPACE = new CeylonTokenType("White space");

    public static final CeylonTokenType SHELL_COMMENT = new CeylonTokenType("#!");
    public static final CeylonTokenType LINE_COMMENT = new CeylonTokenType("//");
    public static final CeylonTokenType MULTI_LINE_COMMENT = new CeylonTokenType("/* */");

    public static final CeylonTokenType IMPORT_KEYWORD = new CeylonTokenType("import");
    public static final CeylonTokenType CLASS_KEYWORD = new CeylonTokenType("class");
    public static final CeylonTokenType INTERFACE_KEYWORD = new CeylonTokenType("interface");
    public static final CeylonTokenType OBJECT_KEYWORD = new CeylonTokenType("object");
    public static final CeylonTokenType GIVEN_KEYWORD = new CeylonTokenType("given");
    public static final CeylonTokenType VALUE_KEYWORD = new CeylonTokenType("value");
    public static final CeylonTokenType ASSIGN_KEYWORD = new CeylonTokenType("assign");
    public static final CeylonTokenType VOID_KEYWORD = new CeylonTokenType("void");
    public static final CeylonTokenType FUNCTION_KEYWORD = new CeylonTokenType("function");
    public static final CeylonTokenType OF_KEYWORD = new CeylonTokenType("of");
    public static final CeylonTokenType EXTENDS_KEYWORD = new CeylonTokenType("extends");
    public static final CeylonTokenType SATISFIES_KEYWORD = new CeylonTokenType("satisfies");
    public static final CeylonTokenType ADAPTS_KEYWORD = new CeylonTokenType("adapts");
    public static final CeylonTokenType ABSTRACTS_KEYWORD = new CeylonTokenType("abstracts");
    public static final CeylonTokenType IN_KEYWORD = new CeylonTokenType("in");
    public static final CeylonTokenType OUT_KEYWORD = new CeylonTokenType("out");
    public static final CeylonTokenType RETURN_KEYWORD = new CeylonTokenType("return");
    public static final CeylonTokenType BREAK_KEYWORD = new CeylonTokenType("break");
    public static final CeylonTokenType CONTINUE_KEYWORD = new CeylonTokenType("continue");
    public static final CeylonTokenType THROW_KEYWORD = new CeylonTokenType("throw");
    public static final CeylonTokenType IF_KEYWORD = new CeylonTokenType("if");
    public static final CeylonTokenType ELSE_KEYWORD = new CeylonTokenType("else");
    public static final CeylonTokenType SWITCH_KEYWORD = new CeylonTokenType("switch");
    public static final CeylonTokenType CASE_KEYWORD = new CeylonTokenType("case");
    public static final CeylonTokenType FOR_KEYWORD = new CeylonTokenType("for");
    public static final CeylonTokenType WHILE_KEYWORD = new CeylonTokenType("while");
    public static final CeylonTokenType TRY_KEYWORD = new CeylonTokenType("try");
    public static final CeylonTokenType CATCH_KEYWORD = new CeylonTokenType("catch");
    public static final CeylonTokenType FINALLY_KEYWORD = new CeylonTokenType("finally");
    public static final CeylonTokenType THEN_KEYWORD = new CeylonTokenType("then");
    public static final CeylonTokenType THIS_KEYWORD = new CeylonTokenType("this");
    public static final CeylonTokenType OUTER_KEYWORD = new CeylonTokenType("outer");
    public static final CeylonTokenType SUPER_KEYWORD = new CeylonTokenType("super");
    public static final CeylonTokenType IS_KEYWORD = new CeylonTokenType("is");
    public static final CeylonTokenType EXISTS_KEYWORD = new CeylonTokenType("exists");
    public static final CeylonTokenType NONEMPTY_KEYWORD = new CeylonTokenType("nonempty");


    public static final CeylonTokenType COMMA_OPERATOR = new CeylonTokenType(",");
    public static final CeylonTokenType SEMICOLON_OPERATOR = new CeylonTokenType(";");
    public static final CeylonTokenType ELLIPSES_OPERATOR = new CeylonTokenType("...");
    public static final CeylonTokenType HASH_OPERATOR = new CeylonTokenType("#");
    public static final CeylonTokenType LEFT_BRACE_OPERATOR = new CeylonTokenType("{");
    public static final CeylonTokenType RIGHT_BRACE_OPERATOR = new CeylonTokenType("}");
    public static final CeylonTokenType LEFT_PARENTHESIS_OPERATOR = new CeylonTokenType("(");
    public static final CeylonTokenType RIGHT_PARENTHESIS_OPERATOR = new CeylonTokenType(")");
    public static final CeylonTokenType LEFT_BRACKET_OPERATOR = new CeylonTokenType("[");
    public static final CeylonTokenType RIGHT_BRACKET_OPERATOR = new CeylonTokenType("]");
    public static final CeylonTokenType ARRAY_OPERATOR = new CeylonTokenType("[]");
    public static final CeylonTokenType MEMBER_OPERATOR = new CeylonTokenType(".");
    public static final CeylonTokenType SAFE_MEMBER_OPERATOR = new CeylonTokenType("?.");
    public static final CeylonTokenType SPREAD_OPERATOR = new CeylonTokenType("[].");
    public static final CeylonTokenType SPECIFY_OPERATOR = new CeylonTokenType("=");
    public static final CeylonTokenType ADD_OPERATOR = new CeylonTokenType("+");
    public static final CeylonTokenType SUBTRACT_OPERATOR = new CeylonTokenType("-");
    public static final CeylonTokenType DIVIDE_OPERATOR = new CeylonTokenType("/");
    public static final CeylonTokenType MULTIPLY_OPERATOR = new CeylonTokenType("*");
    public static final CeylonTokenType MODULO_OPERATOR = new CeylonTokenType("%");
    public static final CeylonTokenType POWER_OPERATOR = new CeylonTokenType("**");
    public static final CeylonTokenType INCREMENT_OPERATOR = new CeylonTokenType("++");
    public static final CeylonTokenType DECREMENT_OPERATOR = new CeylonTokenType("--");
    public static final CeylonTokenType RANGE_OPERATOR = new CeylonTokenType("..");
    public static final CeylonTokenType ENTRY_OPERATOR = new CeylonTokenType("->");
    public static final CeylonTokenType DEFAULT_OPERATOR = new CeylonTokenType("?");
    public static final CeylonTokenType NOT_OPERATOR = new CeylonTokenType("!");
    public static final CeylonTokenType AND_OPERATOR = new CeylonTokenType("&&");
    public static final CeylonTokenType OR_OPERATOR = new CeylonTokenType("||");
    public static final CeylonTokenType COMPLEMENT_OPERATOR = new CeylonTokenType("~");
    public static final CeylonTokenType INTERSECTION_OPERATOR = new CeylonTokenType("&");
    public static final CeylonTokenType UNION_OPERATOR = new CeylonTokenType("|");
    public static final CeylonTokenType XOR_OPERATOR = new CeylonTokenType("^");
    public static final CeylonTokenType IDENTICAL_OPERATOR = new CeylonTokenType("===");
    public static final CeylonTokenType EQUAL_OPERATOR = new CeylonTokenType("==");
    public static final CeylonTokenType NOT_EQUAL_OPERATOR = new CeylonTokenType("!=");
    public static final CeylonTokenType LESS_THAN_OPERATOR = new CeylonTokenType("<");
    public static final CeylonTokenType GREATER_THAN_OPERATOR = new CeylonTokenType(">");
    public static final CeylonTokenType LESS_THAN_OR_EQUAL_TO_OPERATOR = new CeylonTokenType("<=");
    public static final CeylonTokenType GREATER_THAN_OR_EQUAL_TO_OPERATOR = new CeylonTokenType(">=");
    public static final CeylonTokenType COMPARE_OPERATOR = new CeylonTokenType("<=>");
    public static final CeylonTokenType ASSIGN_OPERATOR = new CeylonTokenType(":=");
    public static final CeylonTokenType APPLY_OPERATOR = new CeylonTokenType(".=");
    public static final CeylonTokenType ADD_ASSIGN_OPERATOR = new CeylonTokenType("+=");
    public static final CeylonTokenType SUBTRACT_ASSIGN_OPERATOR = new CeylonTokenType("-=");
    public static final CeylonTokenType DIVIDE_ASSIGN_OPERATOR = new CeylonTokenType("/=");
    public static final CeylonTokenType MULTIPLY_ASSIGN_OPERATOR = new CeylonTokenType("*=");
    public static final CeylonTokenType MODULO_ASSIGN_OPERATOR = new CeylonTokenType("%=");
    public static final CeylonTokenType UNION_ASSIGN_OPERATOR = new CeylonTokenType("|=");
    public static final CeylonTokenType INTERSECTION_ASSIGN_OPERATOR = new CeylonTokenType("&=");
    public static final CeylonTokenType XOR_ASSIGN_OPERATOR = new CeylonTokenType("^=");
    public static final CeylonTokenType COMPLEMENT_ASSIGN_OPERATOR = new CeylonTokenType("~=");
    public static final CeylonTokenType OR_ASSIGN_OPERATOR = new CeylonTokenType("||=");
    public static final CeylonTokenType AND_ASSIGN_OPERATOR = new CeylonTokenType("&&=");
    public static final CeylonTokenType AMPERSAND_OPERATOR = new CeylonTokenType("@");

    public static final CeylonTokenType ESCAPE_SEQUENCE = new CeylonTokenType("Escape sequence");

    public static final CeylonTokenType DIGIT = new CeylonTokenType("Digit");
    public static final CeylonTokenType DIGITS = new CeylonTokenType("Digits");

    public static final CeylonTokenType INTEGER_LITERAL = new CeylonTokenType("Integer literal");
    public static final CeylonTokenType FLOAT_LITERAL = new CeylonTokenType("Float literal");

    public static final CeylonTokenType FRACTIONAL_DIGITS = new CeylonTokenType("Fractional digits");

    public static final CeylonTokenType EXPONENT = new CeylonTokenType("Exponent");
    public static final CeylonTokenType MAGNITUDE = new CeylonTokenType("Magnitude");
    public static final CeylonTokenType FRACTIONAL_MAGNITUDE = new CeylonTokenType("Fractional magnitude");

    public static final CeylonTokenType CHARACTER_LITERAL = new CeylonTokenType("Character literal");

    public static final CeylonTokenType STRING_LITERAL = new CeylonTokenType("String literal");

    public static final CeylonTokenType QUOTED_LITERAL = new CeylonTokenType("Quoted literal");

    public static final CeylonTokenType LOWERCASE_IDENTIFIER = new CeylonTokenType("Lowercase identifier");
    public static final CeylonTokenType UPPERCASE_IDENTIFIER = new CeylonTokenType("Uppercase identifier");
    public static final CeylonTokenType PACKAGE_IDENTIFIER = new CeylonTokenType("Package identifier");

    public static final CeylonTokenType BAD_CHARACTER = new CeylonTokenType("Bad character");
}
