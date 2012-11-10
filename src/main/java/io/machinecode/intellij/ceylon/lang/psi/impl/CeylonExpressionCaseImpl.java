package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonExpressionCase;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonExpressionCaseImpl extends CeylonElementImpl implements CeylonExpressionCase {
    public CeylonExpressionCaseImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
