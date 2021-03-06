package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInterfaceHeader;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInterfaceHeaderImpl extends CeylonElementImpl implements CeylonInterfaceHeader {
    public CeylonInterfaceHeaderImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
