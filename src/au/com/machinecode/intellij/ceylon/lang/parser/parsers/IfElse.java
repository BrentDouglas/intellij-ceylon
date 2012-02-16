package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.IF_ELSE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class IfElse {

    /*
     * IfElse: If Else?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!If.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Else.parse(builder);

        marker.done(IF_ELSE);
        return true;
    }
}
