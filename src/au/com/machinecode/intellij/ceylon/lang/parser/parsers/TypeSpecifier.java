package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_SPECIFIER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SPECIFY;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TypeSpecifier {

    /*
     * TypeSpecifier: "=" Type
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, SPECIFY)) {
            return false;
        }

        if (!Type.parse(builder)) {
            builder.error(CeylonBundle.message("parser.type.required"));
        }

        marker.done(TYPE_SPECIFIER);
        return true;
    }
}
