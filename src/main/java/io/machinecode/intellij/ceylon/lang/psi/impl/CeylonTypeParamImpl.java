package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeParam;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeParamImpl extends CeylonElementImpl implements CeylonTypeParam {
    public CeylonTypeParamImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
