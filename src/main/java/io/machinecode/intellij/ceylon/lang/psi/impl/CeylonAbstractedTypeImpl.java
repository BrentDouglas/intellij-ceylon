package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAbstractedType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAbstractedTypeImpl extends CeylonElementImpl implements CeylonAbstractedType {

    public CeylonAbstractedTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }

}
