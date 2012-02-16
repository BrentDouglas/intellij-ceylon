package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.VARIABLE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Variable {

    /*
     * Variable: UnionType? MemberName
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        UnionType.parse(builder);

        if (!MemberName.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        marker.done(VARIABLE);
        return true;
    }
}
