package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSelfReference;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSelfReferenceImpl extends CeylonElementImpl implements CeylonSelfReference {
    public CeylonSelfReferenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
