package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonPackageName;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonPackageNameImpl extends CeylonElementImpl implements CeylonPackageName {
    public CeylonPackageNameImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
