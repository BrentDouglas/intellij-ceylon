package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.SPECIFICATION;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.SEMICOLON;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Specification {

    /*
     * Specification: MemberName Specifier ";"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!MemberName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        if (!Specifier.parse(builder)) {
            builder.error(CeylonBundle.message("parser.specifier.required"));
        }

        Util.require(builder, SEMICOLON, CeylonBundle.message("parser.semicolon.required"));

        marker.done(SPECIFICATION);
        return true;
    }
}
