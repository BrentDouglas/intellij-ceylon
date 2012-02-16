package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TRY_CATCH_FINALLY;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class TryCatchFinally {

    /*
     * TryCatchFinally: Try Catch* Finally?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Try.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        while (!Catch.parse(builder));

        if (!Finally.parse(builder));

        marker.done(TRY_CATCH_FINALLY);
        return true;
    }
}
