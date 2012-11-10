package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSimpleParam;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSimpleParamImpl extends CeylonElementImpl implements CeylonSimpleParam {
    public CeylonSimpleParamImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
