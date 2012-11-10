package io.machinecode.intellij.ceylon.lang;

import io.machinecode.intellij.ceylon.CeylonLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonElementType extends IElementType {

    public CeylonElementType(@NotNull @NonNls final String debugName) {
        super(debugName, CeylonLanguage.CEYLON_LANGUAGE);
    }
}
