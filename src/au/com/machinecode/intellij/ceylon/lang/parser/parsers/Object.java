package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Object {

    /*
     * Object: Annotation* ObjectHeader ClassBody
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        while (Annotation.parse(builder));

        if (!ObjectHeader.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (!ClassBody.parse(builder)) {
            builder.error(CeylonBundle.message("parser.classbody.required"));
        }

        marker.done(OBJECT);

        return true;
    }
}
