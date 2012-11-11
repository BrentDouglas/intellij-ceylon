package io.machinecode.intellij.ceylon.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public abstract class CeylonParser {

    /**
     * Checks the lexer for the required token. If found advances the lexer to the next token.
     *
     * @return if the required token was found.
     */
    public static boolean find(final PsiBuilder builder, final IElementType type) {
        if (type == builder.getTokenType()) {
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
        if (type == builder.getTokenType()) {
            builder.advanceLexer();
            return true;
        } else {
            builder.error(message);
            return false;
        }
    }
}
