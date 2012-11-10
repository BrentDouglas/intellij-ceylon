package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonExpressionStatement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonExpressionStatementImpl extends CeylonElementImpl implements CeylonExpressionStatement {
    public CeylonExpressionStatementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
