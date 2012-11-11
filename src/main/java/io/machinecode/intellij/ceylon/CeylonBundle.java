package io.machinecode.intellij.ceylon;

import com.intellij.CommonBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonBundle {
    @NonNls
    private static final String BUNDLE = "io.machinecode.intellij.ceylon.CeylonBundle";

    private static final Reference<ResourceBundle> bundle = new SoftReference<ResourceBundle>(ResourceBundle.getBundle(BUNDLE));

    public static String message(@PropertyKey(resourceBundle = BUNDLE) final String key, final Object... params) {
        return CommonBundle.message(getBundle(), key, params);
    }

    private static ResourceBundle getBundle() {
        return CeylonBundle.bundle.get();
    }

}
