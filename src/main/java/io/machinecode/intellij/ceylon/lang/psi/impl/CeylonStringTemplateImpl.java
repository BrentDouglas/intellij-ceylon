package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonStringTemplate;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonStringTemplateImpl extends CeylonElementImpl implements CeylonStringTemplate {
    public CeylonStringTemplateImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
