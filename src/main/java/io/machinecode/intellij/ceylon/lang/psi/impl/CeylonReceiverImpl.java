package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonReceiver;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonReceiverImpl extends CeylonElementImpl implements CeylonReceiver {
    public CeylonReceiverImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
