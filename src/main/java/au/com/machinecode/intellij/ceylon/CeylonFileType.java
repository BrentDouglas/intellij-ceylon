package au.com.machinecode.intellij.ceylon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonFileType extends LanguageFileType {

    public static final CeylonFileType CEYLON_FILE_TYPE = new CeylonFileType();

    private CeylonFileType() {
        super(CeylonLanguage.CEYLON_LANGUAGE);
    }

    @NotNull
    public String getName() {
        return "Ceylon";
    }

    @NotNull
    public String getDescription() {
        return "Ceylon File";
    }

    @NotNull
    public String getDefaultExtension() {
        return "ceylon";
    }

    public Icon getIcon() {
        return CeylonIcon.CEYLON_ICON_16x16;
    }

    public boolean isJVMDebuggingSupported() {
        return true;
    }
}
