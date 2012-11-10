package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonFunctionalBody;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFunctionalBodyImpl extends CeylonElementImpl implements CeylonFunctionalBody {
    public CeylonFunctionalBodyImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
