package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSequence;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSequenceImpl extends CeylonElementImpl implements CeylonSequence {
    public CeylonSequenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
