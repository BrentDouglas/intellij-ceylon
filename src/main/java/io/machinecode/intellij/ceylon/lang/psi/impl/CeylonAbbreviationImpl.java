package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonAbbreviation;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonAbbreviationImpl extends CeylonElementImpl implements CeylonAbbreviation {

    public CeylonAbbreviationImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
