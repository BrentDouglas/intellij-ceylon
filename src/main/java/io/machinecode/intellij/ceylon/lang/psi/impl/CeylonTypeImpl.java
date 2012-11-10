package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeImpl extends CeylonElementImpl implements CeylonType {
    public CeylonTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
