package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TopLevelDeclaration {

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
            marker.error(CeylonBundle.message("parser.topleveldeclaration.required"));
            return false;
        }
        return true;
    }
}
