package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TypeDeclaration {

    /*
     * TypeDeclaration: Class | Object | Interface
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (Class.parse(builder)) {
            marker.done(CLASS);
        } else if (Object.parse(builder)) {
            marker.done(OBJECT);
        } else if (Interface.parse(builder)) {
            marker.done(INTERFACE);
        } else {
            marker.rollbackTo();
            return false;
        }
        return true;
    }
}
