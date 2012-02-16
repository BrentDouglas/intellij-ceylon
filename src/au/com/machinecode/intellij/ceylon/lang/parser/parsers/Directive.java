package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.DIRECTIVE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Directive {

    /*
     * Directive: Return | Throw | Break | Continue
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (Return.parse(builder)) {
        } else if (Throw.parse(builder)) {
        } else if (Break.parse(builder)) {
        } else  if (Continue.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(DIRECTIVE);
        return true;
    }
}
