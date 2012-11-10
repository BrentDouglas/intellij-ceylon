package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSimpleAttribute;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSimpleAttributeImpl extends CeylonElementImpl implements CeylonSimpleAttribute {
    public CeylonSimpleAttributeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
