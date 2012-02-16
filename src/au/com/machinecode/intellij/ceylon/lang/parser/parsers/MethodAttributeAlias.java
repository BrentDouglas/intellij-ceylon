package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.METHOD_ATTRIBUTE_ALIAS;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SPECIFY;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class MethodAttributeAlias {

    /*
     * MethodAttributeAlias: MemberName "="
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!MemberName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, SPECIFY, CeylonBundle.message("parser.specify.required"));

        marker.done(METHOD_ATTRIBUTE_ALIAS);
        return true;
    }
}
