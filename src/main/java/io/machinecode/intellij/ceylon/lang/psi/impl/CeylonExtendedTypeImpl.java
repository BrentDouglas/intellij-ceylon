package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonExtendedType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonExtendedTypeImpl extends CeylonElementImpl implements CeylonExtendedType {
    public CeylonExtendedTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
