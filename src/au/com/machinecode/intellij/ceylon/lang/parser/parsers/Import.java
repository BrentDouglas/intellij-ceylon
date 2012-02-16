package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.IMPORT;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LBRACE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RBRACE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Import {

    /*
     * Import: "import" FullPackageName "{" ImportElements? "}"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, IMPORT)) {
            return false;
        }

        if (!FullPackageName.parse(builder)) {
            marker.error(CeylonBundle.message("parser.packagename.required"));
        }

        Util.require(builder, LBRACE, CeylonBundle.message("parser.lbrace.required"));

        while (ImportElements.parse(builder));

        Util.require(builder, RBRACE, CeylonBundle.message("parser.rbrace.required"));

        marker.done(CeylonElementTypes.IMPORT);
        return true;
    }
}
