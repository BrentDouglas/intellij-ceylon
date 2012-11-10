package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeName;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeNameImpl extends CeylonElementImpl implements CeylonTypeName {
    public CeylonTypeNameImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
