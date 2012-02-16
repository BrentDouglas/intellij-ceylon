package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.FOR_ITERATOR;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.IN_OP;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class ForIterator {

    /*
     * ForIterator: IteratorVariable "in" Expression
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!IteratorVariable.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, IN_OP, CeylonBundle.message("parser.in.required"));

        if (!Expression.parse(builder)) {
            builder.error(CeylonBundle.message("parser.expression.required"));
        }

        marker.done(FOR_ITERATOR);
        return true;
    }
}
