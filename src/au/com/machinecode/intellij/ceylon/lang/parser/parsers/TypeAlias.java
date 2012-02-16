package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TYPE_ALIAS;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SPECIFY;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TypeAlias {

    /*
     * TypeAlias: TypeName "="
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!TypeName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, SPECIFY, CeylonBundle.message("parser.specify.required"));

        marker.done(TYPE_ALIAS);
        return true;
    }
}
