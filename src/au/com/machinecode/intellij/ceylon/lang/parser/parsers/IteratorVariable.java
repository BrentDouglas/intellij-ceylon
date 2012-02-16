package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.ITERATOR_VARIABLE;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class IteratorVariable {

    /*
     * IteratorVariable: Variable | CallableVariable | EntryVariablePair
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (Variable.parse(builder)) {
        } else if (CallableVariable.parse(builder)) {
        } else if (EntryVariablePair.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(ITERATOR_VARIABLE);
        return true;
    }
}
