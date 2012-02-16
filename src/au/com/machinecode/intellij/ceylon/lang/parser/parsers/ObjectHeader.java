package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.OBJECT_HEADER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.OBJECT_DEFINITION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ObjectHeader {

    /*
     * ObjectHeader: "object" MemberName ObjectInheritance
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, OBJECT_DEFINITION)) {
            return false;
        }

        if (!MemberName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.membername.required"));
        }

        if (!ObjectInheritance.parse(builder)) {
            builder.error(CeylonBundle.message("parser.objectinheritance.required"));
        }

        marker.done(OBJECT_HEADER);
        return true;
    }
}
