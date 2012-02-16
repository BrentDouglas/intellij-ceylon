package au.com.machinecode.intellij.ceylon.lang.parser.parsers;

import com.intellij.lang.PsiBuilder;

import static au.com.machinecode.intellij.ceylon.lang.CeylonElementTypes.CONDITION;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class Condition {

    /*
     * Condition: BooleanCondition | IsCondition | ExistsOrNonemptyCondition | SatisfiesCondition
     */
    public static boolean parse(final PsiBuilder builder) {
        final PsiBuilder.Marker marker = builder.mark();

        if (BooleanCondition.parse(builder)) {
        } else if (IsCondition.parse(builder)) {
        } else if (ExistsOrIsNonEmptyCondition.parse(builder)) {
        } else if (SatisfiesCondition.parse(builder)) {
        } else {
            marker.rollbackTo();
            return false;
        }

        marker.done(CONDITION);
        return true;
    }
}
