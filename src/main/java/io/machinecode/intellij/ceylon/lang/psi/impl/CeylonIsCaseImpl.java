package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonIsCase;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonIsCaseImpl extends CeylonElementImpl implements CeylonIsCase {
    public CeylonIsCaseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
