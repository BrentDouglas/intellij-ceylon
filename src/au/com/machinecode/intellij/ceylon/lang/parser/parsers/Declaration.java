package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ATTRIBUTE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_DECLARATION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Declaration {

    /*
     * Declaration: Method | Attribute | TypeDeclaration
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (Method.parse(builder)) {
            marker.done(METHOD);
        } else if (Attribute.parse(builder)) {
            marker.done(ATTRIBUTE);
        } else if (TypeDeclaration.parse(builder)) {
            marker.done(TYPE_DECLARATION);
        } else {
            marker.rollbackTo();
            return false;
        }
        return true;
    }
}
