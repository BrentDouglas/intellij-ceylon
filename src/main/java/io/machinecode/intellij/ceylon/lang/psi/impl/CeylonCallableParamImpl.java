package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCallableParam;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCallableParamImpl extends CeylonElementImpl implements CeylonCallableParam {
    public CeylonCallableParamImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
