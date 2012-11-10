package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonBlock;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonBlockImpl extends CeylonElementImpl implements CeylonBlock {
    public CeylonBlockImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
