package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonCases;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonCasesImpl extends CeylonElementImpl implements CeylonCases {
    public CeylonCasesImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
