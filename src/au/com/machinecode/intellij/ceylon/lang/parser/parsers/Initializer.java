package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.INITIALIZER;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.ASSIGN_OP;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Initializer {

    /*
     * Initializer: ":=" Expression
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, ASSIGN_OP)) {
            return false;
        }

        if (!Expression.parse(builder)) {
            builder.error(CeylonBundle.message("parser.expression.required"));
        }

        marker.done(INITIALIZER);
        return true;
    }
}
