package au.com.machinecode.intellij.ceylon.lang;

import au.com.machinecode.intellij.ceylon.CeylonLanguage;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTokenType extends IElementType implements TokenType {

    public CeylonTokenType(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NonNls final String debugName) {
        super(debugName, CeylonLanguage.CEYLON_LANGUAGE);
    }

    public static CeylonTokenType fromOp(final int index) {
        switch (index) {
            case -1: return EOF;
            case 4: return ABSTRACTED_TYPE;
            case 5: return ADAPTED_TYPES;
            case 6: return ADD_ASSIGN_OP;
            case 7: return AND_ASSIGN_OP;
            case 8: return AND_OP;
            case 9: return APPLY_OP;
            case 10: return ARRAY;
            case 11: return ASSIGN;
            case 12: return ASSIGN_OP;
            case 13: return BREAK;
            case 14: return CASE_CLAUSE;
            case 15: return CASE_TYPES;
            case 16: return CATCH_CLAUSE;
            case 17: return CHAR_LITERAL;
            case 18: return CLASS_DEFINITION;
            case 19: return COMMA;
            case 20: return COMPARE_OP;
            case 21: return COMPILER_ANNOTATION;
            case 22: return COMPLEMENT_ASSIGN_OP;
            case 23: return COMPLEMENT_OP;
            case 24: return CONTINUE;
            case 25: return DECREMENT_OP;
            case 26: return DEFAULT_OP;
            case 27: return DIFFERENCE_OP;
            case 28: return DIVIDE_ASSIGN_OP;
            case 29: return DIGIT;
            case 30: return DIGITS;
            case 31: return ELLIPSIS;
            case 32: return ELSE_CLAUSE;
            case 33: return ENTRY_OP;
            case 34: return EQUAL_OP;
            case 35: return EXISTS;
            case 36: return EXTENDS;
            case 37: return ESCAPE_SEQUENCE;
            case 38: return EXPONENT;
            case 39: return FINALLY_CLAUSE;
            case 40: return FLOAT_LITERAL;
            case 41: return FOR_CLAUSE;
            case 42: return FUNCTION_MODIFIER;
            case 43: return FRACTIONAL_MAGNITUDE;
            case 44: return IDENTICAL_OP;
            case 45: return IF_CLAUSE;
            case 46: return IMPORT;
            case 47: return INCREMENT_OP;
            case 48: return INDEX_OP;
            case 49: return INTERFACE_DEFINITION;
            case 50: return INTERSECTION_OP;
            case 51: return INTERSECT_ASSIGN_OP;
            case 52: return IN_OP;
            case 53: return IS_OP;
            case 54: return IDENTIFIER_PART;
            case 55: return IDENTIFIER_START;
            case 56: return LARGER_OP;
            case 57: return LARGE_AS_OP;
            case 58: return LBRACE;
            case 59: return LBRACKET;
            case 60: return LIDENTIFIER;
            case 61: return LINE_COMMENT;
            case 62: return LPAREN;
            case 63: return LETTER;
            case 64: return MEMBER_OP;
            case 65: return MULTIPLY_ASSIGN_OP;
            case 66: return MULTI_COMMENT;
            case 67: return MAGNITUDE;
            case 68: return NATURAL_LITERAL;
            case 69: return NONEMPTY;
            case 70: return NOT_EQUAL_OP;
            case 71: return NOT_OP;
            case 72: return NON_CHARACTER_CHARS;
            case 73: return NON_STRING_CHARS;
            case 74: return OBJECT_DEFINITION;
            case 75: return OR_ASSIGN_OP;
            case 76: return OR_OP;
            case 77: return OUT;
            case 78: return OUTER;
            case 79: return POWER_OP;
            case 80: return PRODUCT_OP;
            case 81: return QMARK;
            case 82: return QUOTED_LITERAL;
            case 83: return QUOTIENT_OP;
            case 84: return QUOTED_LITERAL_PART;
            case 85: return RANGE_OP;
            case 86: return RBRACE;
            case 87: return RBRACKET;
            case 88: return REMAINDER_ASSIGN_OP;
            case 89: return REMAINDER_OP;
            case 90: return RETURN;
            case 91: return RPAREN;
            case 92: return SAFE_INDEX_OP;
            case 93: return SAFE_MEMBER_OP;
            case 94: return SATISFIES;
            case 95: return SEMICOLON;
            case 96: return SMALLER_OP;
            case 97: return SMALL_AS_OP;
            case 98: return SPECIFY;
            case 99: return SPREAD_OP;
            case 100: return STRING_LITERAL;
            case 101: return SUBTRACT_ASSIGN_OP;
            case 102: return SUM_OP;
            case 103: return SUPER;
            case 104: return SWITCH_CLAUSE;
            case 105: return STRING_PART;
            case 106: return THEN_CLAUSE;
            case 107: return THIS;
            case 108: return THROW;
            case 109: return TRY_CLAUSE;
            case 110: return TYPE_CONSTRAINT;
            case 111: return UIDENTIFIER;
            case 112: return UNION_ASSIGN_OP;
            case 113: return UNION_OP;
            case 114: return VALUE_MODIFIER;
            case 115: return VOID_MODIFIER;
            case 116: return WHILE_CLAUSE;
            case 117: return WS;
            case 118: return XOR_ASSIGN_OP;
            case 119: return XOR_OP;
        }
        return null;
    }
}
