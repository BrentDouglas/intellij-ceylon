package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.psi.TokenType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public interface CeylonTokenTypes extends TokenType {

    CeylonTokenType WHITE_SPACE = new CeylonTokenType("White space");

    CeylonTokenType SHELL_COMMENT = new CeylonTokenType("#!");
    CeylonTokenType LINE_COMMENT = new CeylonTokenType("//");
    CeylonTokenType MULTI_LINE_COMMENT = new CeylonTokenType("/* */");

    CeylonTokenType IMPORT_KEYWORD = new CeylonTokenType("import");
    CeylonTokenType CLASS_KEYWORD = new CeylonTokenType("class");
    CeylonTokenType INTERFACE_KEYWORD = new CeylonTokenType("interface");
    CeylonTokenType OBJECT_KEYWORD = new CeylonTokenType("object");
    CeylonTokenType GIVEN_KEYWORD = new CeylonTokenType("given");
    CeylonTokenType VALUE_KEYWORD = new CeylonTokenType("value");
    CeylonTokenType ASSIGN_KEYWORD = new CeylonTokenType("assign");
    CeylonTokenType VOID_KEYWORD = new CeylonTokenType("void");
    CeylonTokenType FUNCTION_KEYWORD = new CeylonTokenType("function");
    CeylonTokenType OF_KEYWORD = new CeylonTokenType("of");
    CeylonTokenType EXTENDS_KEYWORD = new CeylonTokenType("extends");
    CeylonTokenType SATISFIES_KEYWORD = new CeylonTokenType("satisfies");
    CeylonTokenType ADAPTS_KEYWORD = new CeylonTokenType("adapts");
    CeylonTokenType ABSTRACTS_KEYWORD = new CeylonTokenType("abstracts");
    CeylonTokenType IN_KEYWORD = new CeylonTokenType("in");
    CeylonTokenType OUT_KEYWORD = new CeylonTokenType("out");
    CeylonTokenType RETURN_KEYWORD = new CeylonTokenType("return");
    CeylonTokenType BREAK_KEYWORD = new CeylonTokenType("break");
    CeylonTokenType CONTINUE_KEYWORD = new CeylonTokenType("continue");
    CeylonTokenType THROW_KEYWORD = new CeylonTokenType("throw");
    CeylonTokenType IF_KEYWORD = new CeylonTokenType("if");
    CeylonTokenType ELSE_KEYWORD = new CeylonTokenType("else");
    CeylonTokenType SWITCH_KEYWORD = new CeylonTokenType("switch");
    CeylonTokenType CASE_KEYWORD = new CeylonTokenType("case");
    CeylonTokenType FOR_KEYWORD = new CeylonTokenType("for");
    CeylonTokenType WHILE_KEYWORD = new CeylonTokenType("while");
    CeylonTokenType TRY_KEYWORD = new CeylonTokenType("try");
    CeylonTokenType CATCH_KEYWORD = new CeylonTokenType("catch");
    CeylonTokenType FINALLY_KEYWORD = new CeylonTokenType("finally");
    CeylonTokenType THEN_KEYWORD = new CeylonTokenType("then");
    CeylonTokenType THIS_KEYWORD = new CeylonTokenType("this");
    CeylonTokenType OUTER_KEYWORD = new CeylonTokenType("outer");
    CeylonTokenType SUPER_KEYWORD = new CeylonTokenType("super");
    CeylonTokenType IS_KEYWORD = new CeylonTokenType("is");
    CeylonTokenType EXISTS_KEYWORD = new CeylonTokenType("exists");
    CeylonTokenType NONEMPTY_KEYWORD = new CeylonTokenType("nonempty");


    CeylonTokenType COMMA_OPERATOR = new CeylonTokenType(",");
    CeylonTokenType SEMICOLON_OPERATOR = new CeylonTokenType(";");
    CeylonTokenType ELLIPSES_OPERATOR = new CeylonTokenType("...");
    CeylonTokenType HASH_OPERATOR = new CeylonTokenType("#");
    CeylonTokenType LEFT_BRACE_OPERATOR = new CeylonTokenType("{");
    CeylonTokenType RIGHT_BRACE_OPERATOR = new CeylonTokenType("}");
    CeylonTokenType LEFT_PARENTHESIS_OPERATOR = new CeylonTokenType("(");
    CeylonTokenType RIGHT_PARENTHESIS_OPERATOR = new CeylonTokenType(")");
    CeylonTokenType LEFT_BRACKET_OPERATOR = new CeylonTokenType("[");
    CeylonTokenType RIGHT_BRACKET_OPERATOR = new CeylonTokenType("]");
    CeylonTokenType ARRAY_OPERATOR = new CeylonTokenType("[]");
    CeylonTokenType MEMBER_OPERATOR = new CeylonTokenType(".");
    CeylonTokenType SAFE_MEMBER_OPERATOR = new CeylonTokenType("?.");
    CeylonTokenType SPREAD_OPERATOR = new CeylonTokenType("[].");
    CeylonTokenType SPECIFY_OPERATOR = new CeylonTokenType("=");
    CeylonTokenType ADD_OPERATOR = new CeylonTokenType("+");
    CeylonTokenType SUBTRACT_OPERATOR = new CeylonTokenType("-");
    CeylonTokenType DIVIDE_OPERATOR = new CeylonTokenType("/");
    CeylonTokenType MULTIPLY_OPERATOR = new CeylonTokenType("*");
    CeylonTokenType MODULO_OPERATOR = new CeylonTokenType("%");
    CeylonTokenType POWER_OPERATOR = new CeylonTokenType("**");
    CeylonTokenType INCREMENT_OPERATOR = new CeylonTokenType("++");
    CeylonTokenType DECREMENT_OPERATOR = new CeylonTokenType("--");
    CeylonTokenType RANGE_OPERATOR = new CeylonTokenType("..");
    CeylonTokenType ENTRY_OPERATOR = new CeylonTokenType("->");
    CeylonTokenType DEFAULT_OPERATOR = new CeylonTokenType("?");
    CeylonTokenType NOT_OPERATOR = new CeylonTokenType("!");
    CeylonTokenType AND_OPERATOR = new CeylonTokenType("&&");
    CeylonTokenType OR_OPERATOR = new CeylonTokenType("||");
    CeylonTokenType COMPLEMENT_OPERATOR = new CeylonTokenType("~");
    CeylonTokenType INTERSECTION_OPERATOR = new CeylonTokenType("&");
    CeylonTokenType UNION_OPERATOR = new CeylonTokenType("|");
    CeylonTokenType XOR_OPERATOR = new CeylonTokenType("^");
    CeylonTokenType IDENTICAL_OPERATOR = new CeylonTokenType("===");
    CeylonTokenType EQUAL_OPERATOR = new CeylonTokenType("==");
    CeylonTokenType NOT_EQUAL_OPERATOR = new CeylonTokenType("!=");
    CeylonTokenType LESS_THAN_OPERATOR = new CeylonTokenType("<");
    CeylonTokenType GREATER_THAN_OPERATOR = new CeylonTokenType(">");
    CeylonTokenType LESS_THAN_OR_EQUAL_TO_OPERATOR = new CeylonTokenType("<=");
    CeylonTokenType GREATER_THAN_OR_EQUAL_TO_OPERATOR = new CeylonTokenType(">=");
    CeylonTokenType COMPARE_OPERATOR = new CeylonTokenType("<=>");
    CeylonTokenType ASSIGN_OPERATOR = new CeylonTokenType(":=");
    CeylonTokenType APPLY_OPERATOR = new CeylonTokenType(".=");
    CeylonTokenType ADD_ASSIGN_OPERATOR = new CeylonTokenType("+=");
    CeylonTokenType SUBTRACT_ASSIGN_OPERATOR = new CeylonTokenType("-=");
    CeylonTokenType DIVIDE_ASSIGN_OPERATOR = new CeylonTokenType("/=");
    CeylonTokenType MULTIPLY_ASSIGN_OPERATOR = new CeylonTokenType("*=");
    CeylonTokenType MODULO_ASSIGN_OPERATOR = new CeylonTokenType("%=");
    CeylonTokenType UNION_ASSIGN_OPERATOR = new CeylonTokenType("|=");
    CeylonTokenType INTERSECTION_ASSIGN_OPERATOR = new CeylonTokenType("&=");
    CeylonTokenType XOR_ASSIGN_OPERATOR = new CeylonTokenType("^=");
    CeylonTokenType COMPLEMENT_ASSIGN_OPERATOR = new CeylonTokenType("~=");
    CeylonTokenType OR_ASSIGN_OPERATOR = new CeylonTokenType("||=");
    CeylonTokenType AND_ASSIGN_OPERATOR = new CeylonTokenType("&&=");
    CeylonTokenType AMPERSAND_OPERATOR = new CeylonTokenType("@");

    CeylonTokenType ESCAPE_SEQUENCE = new CeylonTokenType("Escape sequence");

    CeylonTokenType DIGIT = new CeylonTokenType("Digit");
    CeylonTokenType DIGITS = new CeylonTokenType("Digits");

    CeylonTokenType INTEGER_LITERAL = new CeylonTokenType("Integer literal");
    CeylonTokenType FLOAT_LITERAL = new CeylonTokenType("Float literal");

    CeylonTokenType FRACTIONAL_DIGITS = new CeylonTokenType("Fractional digits");

    CeylonTokenType EXPONENT = new CeylonTokenType("Exponent");
    CeylonTokenType MAGNITUDE = new CeylonTokenType("Magnitude");
    CeylonTokenType FRACTIONAL_MAGNITUDE = new CeylonTokenType("Fractional magnitude");

    CeylonTokenType CHARACTER_LITERAL = new CeylonTokenType("Character literal");

    CeylonTokenType STRING_LITERAL = new CeylonTokenType("String literal");

    CeylonTokenType QUOTED_LITERAL = new CeylonTokenType("Quoted literal");

    CeylonTokenType LOWERCASE_IDENTIFIER = new CeylonTokenType("Lowercase identifier");
    CeylonTokenType UPPERCASE_IDENTIFIER = new CeylonTokenType("Uppercase identifier");
    CeylonTokenType PACKAGE_IDENTIFIER = new CeylonTokenType("Package identifier");

    CeylonTokenType BAD_CHARACTER = new CeylonTokenType("Bad character");
}
