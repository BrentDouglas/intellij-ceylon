package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeSpecifier;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeSpecifierImpl extends CeylonElementImpl implements CeylonTypeSpecifier {
    public CeylonTypeSpecifierImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
