package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.MEMBER_OP;
import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.FULL_PACKAGE_NAME;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class FullPackageName {

    /*
     * FullPackageName: PackageName ("." PackageName)*
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!PackageName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        while (Util.find(builder, MEMBER_OP)) {
            if (!PackageName.parse(builder)) {
                builder.error(CeylonBundle.message("parser.packagename.required"));
            }
        }
        marker.done(FULL_PACKAGE_NAME);
        return true;
    }
}
