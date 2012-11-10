package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonValueReference;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonValueReferenceImpl extends CeylonElementImpl implements CeylonValueReference {
    public CeylonValueReferenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
