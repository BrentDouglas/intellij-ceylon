package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import au.com.machinecode.intellij.ceylon.CeylonBundle;
import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ENTRY_VARIABLE_PAIR;
import static au.com.machinecode.intellij.ceylon.lang.CeylonTokenTypes.ENTRY_OP;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class EntryVariablePair {

    /*
     * EntryVariablePair: Variable "->" Variable
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (!Variable.parse(builder)) {
            marker.rollbackTo();
            return false;
        }

        Util.require(builder, ENTRY_OP, CeylonBundle.message("parser.entryoperator.required"));


        if (!Variable.parse(builder)) {
            builder.error(CeylonBundle.message("parser.variable.required"));
        }

        marker.done(ENTRY_VARIABLE_PAIR);
        return true;
    }
}
