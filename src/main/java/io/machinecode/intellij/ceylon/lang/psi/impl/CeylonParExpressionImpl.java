package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonParExpression;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonParExpressionImpl extends CeylonElementImpl implements CeylonParExpression {
    public CeylonParExpressionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
