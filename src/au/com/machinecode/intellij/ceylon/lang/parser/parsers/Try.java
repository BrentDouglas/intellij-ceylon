package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.TRY;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.TRY_CLAUSE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Try {

    /*
     * Try: "try" (ResourceDeclaration)? Block
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, TRY_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        ResourceDeclaration.parse(builder);

        if (!Block.parse(builder)) {
            builder.error(CeylonBundle.message("parser.block.required"));
        }

        marker.done(TRY);
        return true;
    }
}
