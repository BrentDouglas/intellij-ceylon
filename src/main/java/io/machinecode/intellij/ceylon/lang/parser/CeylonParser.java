package io.machinecode.intellij.ceylon.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import io.machinecode.intellij.ceylon.lang.lexer.CeylonTokenTypes;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public abstract class CeylonParser implements PsiParser, CeylonTokenTypes, CeylonElementTypes {

    /**
     * Checks the lexer for the required token. If found advances the lexer to the next token.
     *
     * @return if the required token was found.
     */
    public static boolean find(final PsiBuilder builder, final IElementType type) {
        if (matches(builder, type)) {
            builder.advanceLexer();
            return true;
        }
        return false;
    }

    /**
     * Checks the lexer for the required token. If found advances the lexer to the next token. If not
     * add the provided error message to builder.
     *
     * @return if the required token was found.
     */
    public static boolean require(final PsiBuilder builder, final IElementType type, final String message) {
        if (matches(builder, type)) {
            builder.advanceLexer();
            return true;
        } else {
            builder.error(message);
            return false;
        }
    }

    public static boolean matches(final PsiBuilder builder, final IElementType type) {
        final IElementType current = builder.getTokenType();
        do {
            if (SHELL_COMMENT == current) {
                final PsiBuilder.Marker marker = builder.mark();
                builder.advanceLexer();
                marker.done(SHELL_COMMENT_ELEMENT);
                continue;
            }
            if (LINE_COMMENT == current) {
                final PsiBuilder.Marker marker = builder.mark();
                builder.advanceLexer();
                marker.done(LINE_COMMENT_ELEMENT);
                continue;
            }
            if (MULTI_LINE_COMMENT == current) {
                final PsiBuilder.Marker marker = builder.mark();
                builder.advanceLexer();
                marker.done(MULTI_LINE_COMMENT_ELEMENT);
                continue;
            }
        } while (false);

        return type == current;
    }
}
