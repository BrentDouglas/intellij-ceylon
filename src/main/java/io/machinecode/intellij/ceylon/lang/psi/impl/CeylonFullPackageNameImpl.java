package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFullPackageName;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFullPackageNameImpl extends CeylonElementImpl implements CeylonFullPackageName {
    public CeylonFullPackageNameImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
