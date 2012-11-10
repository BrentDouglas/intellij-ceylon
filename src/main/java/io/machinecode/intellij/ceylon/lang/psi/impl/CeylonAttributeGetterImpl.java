package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAttributeGetter;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAttributeGetterImpl extends CeylonElementImpl implements CeylonAttributeGetter {
    public CeylonAttributeGetterImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
