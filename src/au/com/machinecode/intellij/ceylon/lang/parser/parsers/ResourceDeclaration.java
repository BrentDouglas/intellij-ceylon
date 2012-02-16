package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.LPAREN;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.RPAREN;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.RESOURCE_DECLARATION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ResourceDeclaration {

    /*
     * ResourceDeclaration: "(" Resource ")"
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Util.find(builder, LPAREN)) {
            marker.rollbackTo();
            return false;
        }

        if (!Resource.parse(builder)) {
            builder.error(CeylonBundle.message("parser.resource.required"));
        }

        Util.require(builder, RPAREN, CeylonBundle.message("parser.rparen.required"));

        marker.done(RESOURCE_DECLARATION);
        return true;
    }
}
