package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE_GETTER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SIMPLE_ATTRIBUTE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_DECLARATION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TopLevelDeclaration {

    /*
     * ToplevelDeclaration: TypeDeclaration | Method | SimpleAttribute | AttributeGetter
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (TypeDeclaration.parse(builder)) {
            marker.done(TYPE_DECLARATION);
        } else if (Method.parse(builder)) {
            marker.done(METHOD);
        } else if (SimpleAttribute.parse(builder)) {
            marker.done(SIMPLE_ATTRIBUTE);
        } else if (AttributeGetter.parse(builder)) {
            marker.done(ATTRIBUTE_GETTER);
        } else {
            marker.rollbackTo();
            return false;
        }
        return true;
    }
}
