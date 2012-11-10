package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonPrimary;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonPrimaryImpl extends CeylonElementImpl implements CeylonPrimary {
    public CeylonPrimaryImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
