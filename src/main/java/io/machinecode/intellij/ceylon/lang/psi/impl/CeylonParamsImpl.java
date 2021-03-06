package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonParams;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParamsImpl extends CeylonElementImpl implements CeylonParams {
    public CeylonParamsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
