package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInitializer;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInitializerImpl extends CeylonElementImpl implements CeylonInitializer {
    public CeylonInitializerImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
