package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.lexer.LookAheadLexer;
import com.intellij.lexer.MergingLexerAdapter;

import java.io.Reader;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLexer extends LookAheadLexer {

    public CeylonLexer(final FlexLexer lexer) {
        super(new MergingLexerAdapter(new CeylonFlexAdapter(lexer), CeylonTokenSets.TOKEN_SEPARATOR_TOKENS));
    }
}
