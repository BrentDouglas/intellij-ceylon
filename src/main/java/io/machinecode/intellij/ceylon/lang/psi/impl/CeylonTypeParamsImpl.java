package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeParams;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeParamsImpl extends CeylonElementImpl implements CeylonTypeParams {
    public CeylonTypeParamsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
