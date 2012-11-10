package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonClassHeader;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonClassHeaderImpl extends CeylonElementImpl implements CeylonClassHeader {
    public CeylonClassHeaderImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
