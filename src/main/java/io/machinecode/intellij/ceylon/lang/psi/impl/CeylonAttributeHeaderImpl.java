package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAttributeHeader;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAttributeHeaderImpl extends CeylonElementImpl implements CeylonAttributeHeader {
    public CeylonAttributeHeaderImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
