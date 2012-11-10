package io.machinecode.intellij.ceylon.highlighter;

import io.machinecode.intellij.ceylon.lang.lexer.CeylonHighlightingLexer;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonTokenSets;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    @NonNls
    public static final String LINE_COMMENT_ID = "Line comment";

    @NonNls
    public static final String BLOCK_COMMENT_ID = "Block comment";

    @NonNls
    public static final String DOC_COMMENT_ID = "Doc comment";

    @NonNls
    public static final String KEYWORD_ID = "Keyword";

    @NonNls
    public static final String NUMBER_ID = "Number";

    @NonNls
    public static final String STRING_ID = "String";

    @NonNls
    public static final String OPERATION_SIGN_ID = "Operation";

    @NonNls
    public static final String PARENTHESES_ID = "Parentheses";

    @NonNls
    public static final String BRACKETS_ID = "Brackets";

    @NonNls
    public static final String BRACES_ID = "Braces";

    @NonNls
    public static final String COMMA_ID = "Commas";

    @NonNls
    public static final String DOT_ID = "Member operator";

    @NonNls
    public static final String SEMICOLON_ID = "Semicolon";

    @NonNls
    public static final String DOC_COMMENT_TAG_ID = "Doc comment tag";

    @NonNls
    public static final String DOC_COMMENT_MARKUP_ID = "Doc comment markup";

    @NonNls
    public static final String VALID_STRING_ESCAPE_ID = "String escape";

    @NonNls
    public static final String INVALID_STRING_ESCAPE_ID = "Invalid string escape";

    public static final TextAttributesKey LINE_COMMENT = getDefault(LINE_COMMENT_ID, SyntaxHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT = getDefault(BLOCK_COMMENT_ID, SyntaxHighlighterColors.JAVA_BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT = getDefault(DOC_COMMENT_ID, SyntaxHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey KEYWORD = getDefault(KEYWORD_ID, SyntaxHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER = getDefault(NUMBER_ID, SyntaxHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING = getDefault(STRING_ID, SyntaxHighlighterColors.STRING);
    public static final TextAttributesKey OPERATION_SIGN = getDefault(OPERATION_SIGN_ID, SyntaxHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHESES = getDefault(PARENTHESES_ID, SyntaxHighlighterColors.PARENTHS);
    public static final TextAttributesKey BRACKETS = getDefault(BRACKETS_ID, SyntaxHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES = getDefault(BRACES_ID, SyntaxHighlighterColors.BRACES);
    public static final TextAttributesKey COMMA = getDefault(COMMA_ID, SyntaxHighlighterColors.COMMA);
    public static final TextAttributesKey DOT = getDefault(DOT_ID, SyntaxHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON = getDefault(SEMICOLON_ID, SyntaxHighlighterColors.JAVA_SEMICOLON);
    public static final TextAttributesKey DOC_COMMENT_TAG = getDefault(DOC_COMMENT_TAG_ID, SyntaxHighlighterColors.DOC_COMMENT_TAG);
    public static final TextAttributesKey DOC_COMMENT_MARKUP = getDefault(DOC_COMMENT_MARKUP_ID, SyntaxHighlighterColors.DOC_COMMENT_MARKUP);
    public static final TextAttributesKey VALID_STRING_ESCAPE = getDefault(VALID_STRING_ESCAPE_ID, SyntaxHighlighterColors.VALID_STRING_ESCAPE);
    public static final TextAttributesKey INVALID_STRING_ESCAPE = getDefault(INVALID_STRING_ESCAPE_ID, SyntaxHighlighterColors.INVALID_STRING_ESCAPE);

    static {
        SyntaxHighlighterBase.fillMap(ATTRIBUTES, CeylonTokenSets.LINE_COMMENT_TOKENS, LINE_COMMENT);
        fillMap(ATTRIBUTES, CeylonTokenSets.BLOCK_COMMENT_TOKENS, BLOCK_COMMENT);
        fillMap(ATTRIBUTES, CeylonTokenSets.KEYWORD_TOKENS, KEYWORD);
        fillMap(ATTRIBUTES, CeylonTokenSets.STRING_LITERAL_TOKENS, STRING);
        //fillMap(ATTRIBUTES, CeylonTokenSets.ALL_OPERATOR_TOKENS, OPERATION_SIGN);
        fillMap(ATTRIBUTES, CeylonTokenSets.DELIMETER_TOKENS, SEMICOLON);
        fillMap(ATTRIBUTES, CeylonTokenSets.SEPERATOR_TOKENS, COMMA);
    }

    @NotNull
    public Lexer getHighlightingLexer() {
        return new CeylonHighlightingLexer();
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(final IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }

    private static TextAttributesKey getDefault(final String id, final TextAttributesKey key) {
        return TextAttributesKey.createTextAttributesKey(id, key.getDefaultAttributes());
    }
}
