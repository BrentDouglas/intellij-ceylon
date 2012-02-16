package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.DEFAULT_CASE_ITEM;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.ELSE_CLAUSE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class DefaultCaseItem {

    /*
     * DefaultCaseItem: "else" Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, ELSE_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(DEFAULT_CASE_ITEM);
        return true;
    }
}
