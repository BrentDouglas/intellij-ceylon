package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IS_CASE;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.IS_OP;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class IsCase {

    /*
     * IsCase: "is" UnionType
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, IS_OP)) {
            marker.rollbackTo();
            return false;
        }

        if (!UnionType.parse(builder)) {
            builder.error(CeylonBundle.message("parser.uniontype.required"));
        }

        marker.done(IS_CASE);
        return true;
    }
}
