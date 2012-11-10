package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonStatement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonStatementImpl extends CeylonElementImpl implements CeylonStatement {
    public CeylonStatementImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
