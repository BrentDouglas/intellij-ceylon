package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.BREAK;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Break {

    /*
     * Break: "break"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CeylonTokenTypes.BREAK)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(BREAK);
        return true;
    }
}
