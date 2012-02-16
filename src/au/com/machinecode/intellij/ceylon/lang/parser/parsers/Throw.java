package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.THROW;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Throw {

    /*
     * Throw: "throw" Expression?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CeylonTokenTypes.THROW)) {
            return false;
        }

        Expression.parse(builder);

        marker.done(THROW);
        return true;
    }
}
