package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.RESOURCE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Resource {

    /*
     * Resource: MemberName | ResourceInitializer | ResourceVariable
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();


        if (!MemberName.parse(builder)) {
        } else if (!ResourceInitializer.parse(builder)) {
        } else if (!ResourceVariable.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(RESOURCE);
        return true;
    }
}
