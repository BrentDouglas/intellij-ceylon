package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonReturn;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonReturnImpl extends CeylonElementImpl implements CeylonReturn {
    public CeylonReturnImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
