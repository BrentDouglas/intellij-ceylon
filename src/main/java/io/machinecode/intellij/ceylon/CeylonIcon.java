package io.machinecode.intellij.ceylon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.Icon;
import java.awt.Component;
import java.awt.Graphics;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public enum CeylonIcon implements Icon {
    CEYLON_ICON_16x16("/icons/ceylon-icon-16x16.png");

    private final Icon icon;

    private CeylonIcon(final String resource) {
        icon = IconLoader.findIcon(resource);
    }
    public void paintIcon(final Component component, final Graphics graphics, final int x, final int y) {
        icon.paintIcon(component, graphics, x, y);
    }

    public int getIconWidth() {
        return  icon.getIconWidth();
    }

    public int getIconHeight() {
        return icon.getIconHeight();
    }
}
