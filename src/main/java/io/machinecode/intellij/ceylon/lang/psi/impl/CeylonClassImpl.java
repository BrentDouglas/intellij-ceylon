package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonClass;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonClassImpl extends CeylonElementImpl implements CeylonClass {
    public CeylonClassImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
