package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCaseType;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCaseTypeImpl extends CeylonElementImpl implements CeylonCaseType {
    public CeylonCaseTypeImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
