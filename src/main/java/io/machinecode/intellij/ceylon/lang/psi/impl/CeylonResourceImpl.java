package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonResource;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonResourceImpl extends CeylonElementImpl implements CeylonResource {
    public CeylonResourceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
