package io.machinecode.intellij.ceylon.lang.psi.impl;

import io.machinecode.intellij.ceylon.lang.psi.api.CeylonExistsOrIsNonemptyCondition;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonExistsOrIsNonemptyConditionImpl extends CeylonElementImpl implements CeylonExistsOrIsNonemptyCondition {
    public CeylonExistsOrIsNonemptyConditionImpl(@NotNull ASTNode astNode) {
        super(astNode);
    }
}
