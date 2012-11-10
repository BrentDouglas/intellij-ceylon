package io.machinecode.intellij.ceylon.lang.lexer;

import io.machinecode.intellij.ceylon.CeylonLanguage;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTokenType extends IElementType implements TokenType {

    public CeylonTokenType(@org.jetbrains.annotations.NotNull @org.jetbrains.annotations.NonNls final String debugName) {
        super(debugName, CeylonLanguage.CEYLON_LANGUAGE);
    }
}
