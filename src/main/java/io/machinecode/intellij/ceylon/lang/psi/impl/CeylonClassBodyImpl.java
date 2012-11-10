package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonClassBody;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonClassBodyImpl extends CeylonElementImpl implements CeylonClassBody {
    public CeylonClassBodyImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
