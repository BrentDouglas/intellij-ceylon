package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.RESOURCE_VARIABLE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ResourceVariable {

    /*
     * ResourceVariable: Variable Specifier
     */

    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Variable.parse(builder)) {
        } else if (!Specifier.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(RESOURCE_VARIABLE);
        return true;
    }
}
