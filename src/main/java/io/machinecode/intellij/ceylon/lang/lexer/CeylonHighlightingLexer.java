package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.LayeredLexer;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonHighlightingLexer extends LayeredLexer {
    public CeylonHighlightingLexer() {
        super(new CeylonAdaptedLexer());
    }
}
