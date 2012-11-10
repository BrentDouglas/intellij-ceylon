package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonInterfaceBody;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonInterfaceBodyImpl extends CeylonElementImpl implements CeylonInterfaceBody {
    public CeylonInterfaceBodyImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
