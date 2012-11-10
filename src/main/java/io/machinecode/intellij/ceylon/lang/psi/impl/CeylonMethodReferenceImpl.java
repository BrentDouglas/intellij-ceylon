package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonMethodReference;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonMethodReferenceImpl extends CeylonElementImpl implements CeylonMethodReference {
    public CeylonMethodReferenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
