package io.machinecode.intellij.ceylon.m1;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.psi.impl.DebugUtil;
import io.machinecode.intellij.ceylon.CeylonLanguageLevel;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M1ParserTest extends CeylonTestCase {

    @Override
    public String getResourceDirectory() {
        return "parser/m1";
    }

    @Override
    protected void setUp() {
        super.setUp();
        PropertiesComponent.getInstance(myProject).setValue(
                CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M1.name()
        );
    }

    @Test
    public void testUnionType() {
        parseFile("uniontype.ceylon", CeylonElementTypes.UNION_TYPE, CeylonElementTypes.ATTRIBUTE_HEADER);
    }
}
