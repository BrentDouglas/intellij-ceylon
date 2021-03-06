package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonLiteral;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonLiteralImpl extends CeylonElementImpl implements CeylonLiteral {
    public CeylonLiteralImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
