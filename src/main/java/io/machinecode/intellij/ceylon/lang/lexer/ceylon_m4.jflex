package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

@SuppressWarnings({"ALL"})

%%

%class _CeylonLexerM4
%implements FlexLexer
%function advance
%type IElementType

%unicode
%public

%{
    private int commentDepth = 0;

    public void goTo(int offset) {
        zzCurrentPos = zzMarkedPos = zzStartRead = offset;
        zzPushbackPos = 0;
        zzAtEOF = offset < zzEndRead;
    }
%}

%eof{
    return;
%eof}

%state MULTI_LINE_COMMENT


WHITE_SPACE_CHAR=[\ \t\f\n\r]

SHELL_COMMENT="#""!"[^\r\n]*(\r\n|\r|\n)?
LINE_COMMENT="/""/"[^\r\n]*(\r\n|\r|\n)?

LOWERCASE_IDENTIFIER_PREFIX="\i"
UPPERCASE_IDENTIFIER_PREFIX="\I"

IDENTIFIER_CHARACTER={LOWERCASE_CHARACTER}|{UPPERCASE_CHARACTER}|{DIGIT}
LOWERCASE_CHARACTER=[:lowercase:]|["_"]
UPPERCASE_CHARACTER=[:uppercase:]

LOWERCASE_IDENTIFIER={LOWERCASE_CHARACTER}{IDENTIFIER_CHARACTER}*|{LOWERCASE_IDENTIFIER_PREFIX}{IDENTIFIER_CHARACTER}+
UPPERCASE_IDENTIFIER={UPPERCASE_CHARACTER}{IDENTIFIER_CHARACTER}*|{UPPERCASE_IDENTIFIER_PREFIX}{IDENTIFIER_CHARACTER}+

DIGIT=[0-9]
DIGITS={DIGIT}+|{DIGIT}{1,3}("_"{DIGIT}{3})+
FRACTIONAL_DIGITS={DIGIT}+|({DIGIT}{3}"_")+{DIGIT}{1,3}

INTEGER_LITERAL={DIGITS}{MAGNITUDE}?
FLOAT_LITERAL={DIGITS}("."{FRACTIONAL_DIGITS}({EXPONENT}|{MAGNITUDE}|{FRACTIONAL_MAGNITUDE})?|{FRACTIONAL_MAGNITUDE})

EXPONENT=[eE][-+]?{DIGIT}+
MAGNITUDE=[kMGTP]
FRACTIONAL_MAGNITUDE=[munpf]

CHARACTER_LITERAL="`"{CHARACTER}"`"
CHARACTER=[^`\\]|{ESCAPE_SEQUENCE}

STRING_LITERAL=\"{STRING_CHARACTER}*\"
STRING_CHARACTER=[^"\""""]|{ESCAPE_SEQUENCE}

QUOTED_LITERAL="'"{QUOTED_LITERAL_CHARACTER}*"'"
QUOTED_LITERAL_CHARACTER=[^"'"]

ESCAPE_SEQUENCE=\\[btnfr\\\"\'`]|\\{CHARACTER_CODE}
CHARACTER_CODE={HEX_DIGIT}{4}|{HEX_DIGIT}{8}
HEX_DIGIT={DIGIT}|{UPPERCASE_CHARACTER}|{LOWERCASE_CHARACTER}

%%

<YYINITIAL> {WHITE_SPACE_CHAR}+ { return CeylonTokenTypes.WHITE_SPACE; }

<YYINITIAL> {SHELL_COMMENT} { return CeylonTokenTypes.SHELL_COMMENT; }
<YYINITIAL> {LINE_COMMENT} { return CeylonTokenTypes.LINE_COMMENT; }

<YYINITIAL> {
    "/*" {
        yybegin(MULTI_LINE_COMMENT);
        commentDepth++;
    }
}

<MULTI_LINE_COMMENT> {
    "/*" {
        commentDepth++;
    }

    "*/" {
        if (--commentDepth == 0) {
            yybegin(YYINITIAL);
            return CeylonTokenTypes.MULTI_LINE_COMMENT;
        }
    }
}

<YYINITIAL> "import" { return CeylonTokenTypes.IMPORT_KEYWORD; }
<YYINITIAL> "class" { return CeylonTokenTypes.CLASS_KEYWORD; }
<YYINITIAL> "interface" { return CeylonTokenTypes.INTERFACE_KEYWORD; }
<YYINITIAL> "object" { return CeylonTokenTypes.OBJECT_KEYWORD; }
<YYINITIAL> "given" { return CeylonTokenTypes.GIVEN_KEYWORD; }
<YYINITIAL> "value" { return CeylonTokenTypes.VALUE_KEYWORD; }
<YYINITIAL> "assign" { return CeylonTokenTypes.ASSIGN_KEYWORD; }
<YYINITIAL> "void" { return CeylonTokenTypes.VOID_KEYWORD; }
<YYINITIAL> "function" { return CeylonTokenTypes.FUNCTION_KEYWORD; }
<YYINITIAL> "of" { return CeylonTokenTypes.OF_KEYWORD; }
<YYINITIAL> "extends" { return CeylonTokenTypes.EXTENDS_KEYWORD; }
<YYINITIAL> "satisfies" { return CeylonTokenTypes.SATISFIES_KEYWORD; }
<YYINITIAL> "adapts" { return CeylonTokenTypes.ADAPTS_KEYWORD; }
<YYINITIAL> "abstracts" { return CeylonTokenTypes.ABSTRACTS_KEYWORD; }
<YYINITIAL> "in" { return CeylonTokenTypes.IN_KEYWORD; }
<YYINITIAL> "out" { return CeylonTokenTypes.OUT_KEYWORD; }
<YYINITIAL> "return" { return CeylonTokenTypes.RETURN_KEYWORD; }
<YYINITIAL> "break" { return CeylonTokenTypes.BREAK_KEYWORD; }
<YYINITIAL> "continue" { return CeylonTokenTypes.CONTINUE_KEYWORD; }
<YYINITIAL> "throw" { return CeylonTokenTypes.THROW_KEYWORD; }
<YYINITIAL> "if" { return CeylonTokenTypes.IF_KEYWORD; }
<YYINITIAL> "else" { return CeylonTokenTypes.ELSE_KEYWORD; }
<YYINITIAL> "switch" { return CeylonTokenTypes.SWITCH_KEYWORD; }
<YYINITIAL> "case" { return CeylonTokenTypes.CASE_KEYWORD; }
<YYINITIAL> "for" { return CeylonTokenTypes.FOR_KEYWORD; }
<YYINITIAL> "while" { return CeylonTokenTypes.WHILE_KEYWORD; }
<YYINITIAL> "try" { return CeylonTokenTypes.TRY_KEYWORD; }
<YYINITIAL> "catch" { return CeylonTokenTypes.CATCH_KEYWORD; }
<YYINITIAL> "finally" { return CeylonTokenTypes.FINALLY_KEYWORD; }
<YYINITIAL> "then" { return CeylonTokenTypes.THEN_KEYWORD; }
<YYINITIAL> "this" { return CeylonTokenTypes.THIS_KEYWORD; }
<YYINITIAL> "outer" { return CeylonTokenTypes.OUTER_KEYWORD; }
<YYINITIAL> "super" { return CeylonTokenTypes.SUPER_KEYWORD; }
<YYINITIAL> "is" { return CeylonTokenTypes.IS_KEYWORD; }
<YYINITIAL> "exists" { return CeylonTokenTypes.EXISTS_KEYWORD; }
<YYINITIAL> "nonempty" { return CeylonTokenTypes.NONEMPTY_KEYWORD; }


<YYINITIAL> "," { return CeylonTokenTypes.COMMA_OPERATOR; }
<YYINITIAL> ";" { return CeylonTokenTypes.SEMICOLON_OPERATOR; }
<YYINITIAL> "..." { return CeylonTokenTypes.ELLIPSES_OPERATOR; }
<YYINITIAL> ".." { return CeylonTokenTypes.RANGE_OPERATOR; }
<YYINITIAL> ".=" { return CeylonTokenTypes.APPLY_OPERATOR; }
<YYINITIAL> "." { return CeylonTokenTypes.MEMBER_OPERATOR; }
<YYINITIAL> "#" { return CeylonTokenTypes.HASH_OPERATOR; }
<YYINITIAL> "{" { return CeylonTokenTypes.LEFT_BRACE_OPERATOR; }
<YYINITIAL> "}" { return CeylonTokenTypes.RIGHT_BRACE_OPERATOR; }
<YYINITIAL> "(" { return CeylonTokenTypes.LEFT_PARENTHESIS_OPERATOR; }
<YYINITIAL> ")" { return CeylonTokenTypes.RIGHT_PARENTHESIS_OPERATOR; }
<YYINITIAL> "[]." { return CeylonTokenTypes.SPREAD_OPERATOR; }
<YYINITIAL> "[]" { return CeylonTokenTypes.ARRAY_OPERATOR; }
<YYINITIAL> "[" { return CeylonTokenTypes.LEFT_BRACKET_OPERATOR; }
<YYINITIAL> "]" { return CeylonTokenTypes.RIGHT_BRACKET_OPERATOR; }
<YYINITIAL> "?[" { return CeylonTokenTypes.NULLSAFE_LOOKUP_OPERATOR; }
<YYINITIAL> "?." { return CeylonTokenTypes.SAFE_MEMBER_OPERATOR; }
<YYINITIAL> "?" { return CeylonTokenTypes.DEFAULT_OPERATOR; }
<YYINITIAL> "&&=" { return CeylonTokenTypes.AND_ASSIGN_OPERATOR; }
<YYINITIAL> "&&" { return CeylonTokenTypes.AND_OPERATOR; }
<YYINITIAL> "||=" { return CeylonTokenTypes.OR_ASSIGN_OPERATOR; }
<YYINITIAL> "||" { return CeylonTokenTypes.OR_OPERATOR; }
<YYINITIAL> "|=" { return CeylonTokenTypes.UNION_ASSIGN_OPERATOR; }
<YYINITIAL> "|" { return CeylonTokenTypes.UNION_OPERATOR; }
<YYINITIAL> "===" { return CeylonTokenTypes.IDENTICAL_OPERATOR; }
<YYINITIAL> "==" { return CeylonTokenTypes.EQUAL_OPERATOR; }
<YYINITIAL> "=" { return CeylonTokenTypes.SPECIFY_OPERATOR; }
<YYINITIAL> "!=" { return CeylonTokenTypes.NOT_EQUAL_OPERATOR; }
<YYINITIAL> "!" { return CeylonTokenTypes.NOT_OPERATOR; }
<YYINITIAL> "<=>" { return CeylonTokenTypes.COMPARE_OPERATOR; }
<YYINITIAL> "<=" { return CeylonTokenTypes.LESS_THAN_OR_EQUAL_TO_OPERATOR; }
<YYINITIAL> "<" { return CeylonTokenTypes.LESS_THAN_OPERATOR; }
<YYINITIAL> ">=" { return CeylonTokenTypes.GREATER_THAN_OR_EQUAL_TO_OPERATOR; }
<YYINITIAL> ">" { return CeylonTokenTypes.GREATER_THAN_OPERATOR; }
<YYINITIAL> ":=" { return CeylonTokenTypes.ASSIGN_OPERATOR; }
<YYINITIAL> "+=" { return CeylonTokenTypes.ADD_ASSIGN_OPERATOR; }
<YYINITIAL> "++" { return CeylonTokenTypes.INCREMENT_OPERATOR; }
<YYINITIAL> "+" { return CeylonTokenTypes.ADD_OPERATOR; }
<YYINITIAL> "-=" { return CeylonTokenTypes.SUBTRACT_ASSIGN_OPERATOR; }
<YYINITIAL> "--" { return CeylonTokenTypes.DECREMENT_OPERATOR; }
<YYINITIAL> "->" { return CeylonTokenTypes.ENTRY_OPERATOR; }
<YYINITIAL> "-" { return CeylonTokenTypes.SUBTRACT_OPERATOR; }
<YYINITIAL> "/=" { return CeylonTokenTypes.DIVIDE_ASSIGN_OPERATOR; }
<YYINITIAL> "/" { return CeylonTokenTypes.DIVIDE_OPERATOR; }
<YYINITIAL> "*=" { return CeylonTokenTypes.MULTIPLY_ASSIGN_OPERATOR; }
<YYINITIAL> "**" { return CeylonTokenTypes.POWER_OPERATOR; }
<YYINITIAL> "*" { return CeylonTokenTypes.MULTIPLY_OPERATOR; }
<YYINITIAL> "%=" { return CeylonTokenTypes.MODULO_ASSIGN_OPERATOR; }
<YYINITIAL> "%" { return CeylonTokenTypes.MODULO_OPERATOR; }
<YYINITIAL> "&=" { return CeylonTokenTypes.INTERSECTION_ASSIGN_OPERATOR; }
<YYINITIAL> "&" { return CeylonTokenTypes.INTERSECTION_OPERATOR; }
<YYINITIAL> "^=" { return CeylonTokenTypes.XOR_ASSIGN_OPERATOR; }
<YYINITIAL> "^" { return CeylonTokenTypes.XOR_OPERATOR; }
<YYINITIAL> "~=" { return CeylonTokenTypes.COMPLEMENT_ASSIGN_OPERATOR; }
<YYINITIAL> "~" { return CeylonTokenTypes.COMPLEMENT_OPERATOR; }
<YYINITIAL> "@" { return CeylonTokenTypes.AMPERSAND_OPERATOR; }

<YYINITIAL> {FLOAT_LITERAL} { return CeylonTokenTypes.FLOAT_LITERAL; }
<YYINITIAL> {INTEGER_LITERAL} { return CeylonTokenTypes.INTEGER_LITERAL; }
<YYINITIAL> {CHARACTER_LITERAL} { return CeylonTokenTypes.CHARACTER_LITERAL; }
<YYINITIAL> {STRING_LITERAL} { return CeylonTokenTypes.STRING_LITERAL; }
<YYINITIAL> {QUOTED_LITERAL} { return CeylonTokenTypes.QUOTED_LITERAL; }

<YYINITIAL> {LOWERCASE_IDENTIFIER} { return CeylonTokenTypes.LOWERCASE_IDENTIFIER; }
<YYINITIAL> {UPPERCASE_IDENTIFIER} { return CeylonTokenTypes.UPPERCASE_IDENTIFIER; }

<YYINITIAL> . { return CeylonTokenTypes.BAD_CHARACTER; }

