package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Util {

    public static boolean find(final PsiBuilder builder, final IElementType type) {
        if (type == builder.getTokenType()) {
            builder.advanceLexer();
            return true;
        }
        return false;
    }

    public static boolean require(final PsiBuilder builder, final IElementType type, final String message) {
        if (type == builder.getTokenType()) {
            builder.advanceLexer();
            return true;
        } else {
            builder.error(message);
            return false;
        }
    }

    public static void error(final PsiBuilder.Marker marker, final String message) {
        marker.error(message);
        marker.rollbackTo();
    }
}
