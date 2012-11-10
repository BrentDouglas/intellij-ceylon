package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAttribute;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAttributeImpl extends CeylonElementImpl implements CeylonAttribute {
    public CeylonAttributeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
