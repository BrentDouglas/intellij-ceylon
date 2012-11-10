package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInterface;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInterfaceImpl extends CeylonElementImpl implements CeylonInterface {
    public CeylonInterfaceImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
