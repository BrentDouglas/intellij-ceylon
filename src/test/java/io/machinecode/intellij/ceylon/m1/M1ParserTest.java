package io.machinecode.intellij.ceylon.m1;

import com.intellij.psi.impl.DebugUtil;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import io.machinecode.intellij.ceylon.lang.CeylonElementTypes;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M1ParserTest extends CeylonTestCase {

    @Override
    public String getResourceDirectory() {
        return "parser/m1";
    }

  public void parse(String fileName) {
    System.out.println(DebugUtil.psiToString(getPsiFileFromFile(fileName), false));
  }

    @Test
    public void testUnionType() {
        getPsiElementFromFile("uniontype.ceylon", CeylonElementTypes.TYPE);
        //parse("uniontype.ceylon");
    }
}
