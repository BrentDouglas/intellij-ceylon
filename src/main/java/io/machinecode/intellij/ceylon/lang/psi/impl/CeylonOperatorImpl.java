package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonOperator;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonOperatorImpl extends CeylonElementImpl implements CeylonOperator {
    public CeylonOperatorImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
