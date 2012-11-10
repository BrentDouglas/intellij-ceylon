package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAtom;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAtomImpl extends CeylonElementImpl implements CeylonAtom {
    public CeylonAtomImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
