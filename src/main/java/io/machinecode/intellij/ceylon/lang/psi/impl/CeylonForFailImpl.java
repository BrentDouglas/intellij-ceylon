package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonForFail;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonForFailImpl extends CeylonElementImpl implements CeylonForFail {
    public CeylonForFailImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
