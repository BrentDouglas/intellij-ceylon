package io.machinecode.intellij.ceylon.m1;

import com.intellij.psi.impl.DebugUtil;
import io.machinecode.intellij.ceylon.CeylonTestCase;
import org.junit.Test;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class M1ParserTest extends CeylonTestCase {

    @Override
    public String getResourceDirectory() {
        return "parser";
    }

  public void parse(String fileName) {
    System.out.println(DebugUtil.psiToString(getPsiFileFromFile(getProject(), fileName), false));
  }

    @Test
    public void testUnionType() {
        parse("uniontype.ceylon");
    }
}
