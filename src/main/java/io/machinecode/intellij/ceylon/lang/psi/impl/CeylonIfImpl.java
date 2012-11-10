package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIf;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIfImpl extends CeylonElementImpl implements CeylonIf {
    public CeylonIfImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
