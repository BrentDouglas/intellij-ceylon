package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonSpecifier;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonSpecifierImpl extends CeylonElementImpl implements CeylonSpecifier {
    public CeylonSpecifierImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
