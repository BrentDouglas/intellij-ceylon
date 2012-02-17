package au.com.machinecode.intellij.ceylon.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFlexAdapter extends FlexAdapter {
    public CeylonFlexAdapter() {
        super(new _CeylonLexer((Reader) null));
    }
}
