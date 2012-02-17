package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

//import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.*;
//import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class StringLiteral {

    /*
     *
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();


        if (!Util.find(builder, FOR_CLAUSE)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, LPAREN, CeylonBundle.message("parser.lparen.required"));

        if (!ForIterator.parse(builder)) {
            builder.error(CeylonBundle.message("parser.iteratorvariable.required"));
        }


        marker.done();
        return true;
    }
}
