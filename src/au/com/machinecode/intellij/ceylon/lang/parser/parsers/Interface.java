package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Interface {

    /*
     * Interface: Annotation* InterfaceHeader (InterfaceBody | TypeSpecifier ";")
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        while (Annotation.parse(builder));

        if (!InterfaceHeader.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (InterfaceBody.parse(builder)) {

        } else if (TypeSpecifier.parse(builder)) {
            Util.require(builder, SEMICOLON, CeylonBundle.message("parser.semicolon.required"));
        } else {
            builder.error(CeylonBundle.message("parser.interfacebodyortypespecifier.required"));
        }

        marker.done(INTERFACE);
        return true;
    }
}
