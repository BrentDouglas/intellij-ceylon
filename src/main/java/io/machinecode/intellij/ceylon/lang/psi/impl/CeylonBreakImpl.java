package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonBreak;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonBreakImpl extends CeylonElementImpl implements CeylonBreak {
    public CeylonBreakImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
