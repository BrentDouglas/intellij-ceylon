package io.machinecode.intellij.ceylon.m4;

import com.intellij.ide.util.PropertiesComponent;
import io.machinecode.intellij.ceylon.CeylonLanguageLevel;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M4ParserTest extends CeylonTestCase {

    @Override
    public String getResourceDirectory() {
        return "parser/m4";
    }

    @Override
    protected void setUp() {
        super.setUp();
        PropertiesComponent.getInstance(myProject).setValue(
                CeylonLanguageLevel.PERSISTENT_STORE_NAME, CeylonLanguageLevel.M4.name()
        );
    }

    @Test
    public void testUnionType() {
        parseFile("uniontype.ceylon", CeylonElementTypes.UNION_TYPE, CeylonElementTypes.ATTRIBUTE_HEADER);
    }
}
