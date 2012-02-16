package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SATISFIES_CONDITION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SATISFIES;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class SatisfiesCondition {

    /*
     * SatisfiesCondition: "satisfies" Type Type
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, SATISFIES)) {
            marker.rollbackTo();
            return false;
        }

        if (!Type.parse(builder)) {
            builder.error(CeylonBundle.message("parser.type.required"));
        }

        if (!Type.parse(builder)) {
            builder.error(CeylonBundle.message("parser.type.required"));
        }

        marker.done(SATISFIES_CONDITION);
        return true;
    }
}
