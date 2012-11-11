package io.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;

import java.io.Reader;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFlexAdapter extends FlexAdapter {
    public CeylonFlexAdapter(final FlexLexer lexer) {
        super(lexer);
    }
}
