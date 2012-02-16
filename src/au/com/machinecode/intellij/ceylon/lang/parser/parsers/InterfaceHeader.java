package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.INTERFACE_DEFINITION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.INTERFACE_HEADER;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class InterfaceHeader {

    /*
     * InterfaceHeader: "interface" TypeName TypeParams? InterfaceInheritance TypeConstraints?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, INTERFACE_DEFINITION)) {
            return false;
        }

        if (!TypeName.parse(builder)) {
            builder.error(CeylonBundle.message("parser.typename.required"));
        }

        TypeParams.parse(builder);

        if (!InterfaceInheritance.parse(builder)) {
            builder.error(CeylonBundle.message("parser.interfaceinheritance.required"));
        }

        TypeConstraints.parse(builder);

        marker.done(INTERFACE_HEADER);

        return true;
    }
}
