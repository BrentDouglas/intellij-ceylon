package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CLASS_HEADER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.CLASS_DEFINITION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ClassHeader {

    /*
     * ClassHeader: "class" TypeName TypeParams? Params ClassInheritance TypeConstraints?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CLASS_DEFINITION)) {
            return false;
        }

        if (!TypeName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.typename.required"));
        }

        TypeParams.parse(builder);

        if (!Params.parse(builder)) {
            builder.error(CeylonBundle.message("parser.params.required"));
        }

        if (!ClassInheritance.parse(builder)) {
            builder.error(CeylonBundle.message("parser.classinheritance.required"));
        }

        TypeConstraints.parse(builder);

        marker.done(CLASS_HEADER);

        return true;
    }
}
