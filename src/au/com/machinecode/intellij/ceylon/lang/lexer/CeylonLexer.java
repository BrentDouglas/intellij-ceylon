package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.LookAheadLexer;
import com.intellij.lexer.MergingLexerAdapter;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLexer extends LookAheadLexer {
    public CeylonLexer() {
        super(new MergingLexerAdapter(new CeylonFlexAdapter(), CeylonTokenSets.TOKEN_SEPARATOR_TOKENS));
    }
}
