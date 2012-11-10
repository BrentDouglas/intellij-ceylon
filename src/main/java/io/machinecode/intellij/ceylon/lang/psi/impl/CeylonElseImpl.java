package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonElse;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonElseImpl extends CeylonElementImpl implements CeylonElse {
    public CeylonElseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
