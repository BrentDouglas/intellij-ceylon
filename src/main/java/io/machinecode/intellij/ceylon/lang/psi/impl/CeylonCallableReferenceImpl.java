package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCallableReference;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCallableReferenceImpl extends CeylonElementImpl implements CeylonCallableReference {
    public CeylonCallableReferenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
