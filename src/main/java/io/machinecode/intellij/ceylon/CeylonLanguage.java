package io.machinecode.intellij.ceylon;

import com.intellij.lang.Language;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLanguage extends Language {

    public static final CeylonLanguage CEYLON_LANGUAGE = new CeylonLanguage();

    private CeylonLanguage() {
        super("Ceylon");
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
