package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAttributeSetter;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAttributeSetterImpl extends CeylonElementImpl implements CeylonAttributeSetter {
    public CeylonAttributeSetterImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
