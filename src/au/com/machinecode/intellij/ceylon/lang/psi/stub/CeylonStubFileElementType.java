package au.com.machinecode.intellij.ceylon.lang.psi.stub;

import au.com.machinecode.intellij.ceylon.CeylonLanguage;
import com.intellij.psi.tree.IStubFileElementType;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonStubFileElementType extends IStubFileElementType<CeylonFileStub> {

  public CeylonStubFileElementType() {
    super(CeylonLanguage.CEYLON_LANGUAGE);
  }

  public String getExternalId() {
    return "ceylon.FILE";
  }

}
