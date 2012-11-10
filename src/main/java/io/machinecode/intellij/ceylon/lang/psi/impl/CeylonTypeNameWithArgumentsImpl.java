package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonTypeNameWithArguments;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonTypeNameWithArgumentsImpl extends CeylonElementImpl implements CeylonTypeNameWithArguments {
    public CeylonTypeNameWithArgumentsImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
