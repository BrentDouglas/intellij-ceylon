package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInitializerReference;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInitializerReferenceImpl extends CeylonElementImpl implements CeylonInitializerReference {
    public CeylonInitializerReferenceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
