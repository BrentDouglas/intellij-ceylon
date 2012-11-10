package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonObject;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonObjectImpl extends CeylonElementImpl implements CeylonObject {
    public CeylonObjectImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
