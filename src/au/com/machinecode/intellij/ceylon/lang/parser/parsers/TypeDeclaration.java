package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TypeDeclaration {

    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();
        if (Class.parse(builder)) {
            marker.done(CLASS);
        } else if (Object.parse(builder)) {
            marker.done(OBJECT);
        } else if (Interface.parse(builder)) {
            marker.done(INTERFACE);
        } else {
            marker.error(CeylonBundle.message("parser.typedeclaration.required"));
            return false;
        }
        return true;
    }
}
