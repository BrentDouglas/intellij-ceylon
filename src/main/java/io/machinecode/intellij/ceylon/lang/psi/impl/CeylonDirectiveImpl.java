package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonDirective;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonDirectiveImpl extends CeylonElementImpl implements CeylonDirective {
    public CeylonDirectiveImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
