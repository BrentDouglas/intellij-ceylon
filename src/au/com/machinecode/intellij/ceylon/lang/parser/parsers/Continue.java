package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONTINUE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Continue {

    /*
     * Continue: "continue"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, CeylonTokenTypes.CONTINUE)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(CONTINUE);
        return true;
    }
}
