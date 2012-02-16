package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CASES;
//import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Cases {

    /*
     * Cases: CaseItem+ DefaultCaseItem?
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!CaseItem.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        while (CaseItem.parse(builder));

        DefaultCaseItem.parse(builder);

        marker.done(CASES);
        return true;
    }
}
