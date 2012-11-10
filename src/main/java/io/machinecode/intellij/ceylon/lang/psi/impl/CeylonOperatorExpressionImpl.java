package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonOperatorExpression;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonOperatorExpressionImpl extends CeylonElementImpl implements CeylonOperatorExpression {
    public CeylonOperatorExpressionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
