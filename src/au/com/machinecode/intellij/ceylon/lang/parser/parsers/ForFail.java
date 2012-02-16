package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.FOR_FAIL;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ForFail {

    /*
     * ForFail: For Fail?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!For.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Fail.parse(builder);

        marker.done(FOR_FAIL);
        return true;
    }
}
