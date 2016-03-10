/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.util;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ronald
 */
public class MyFrame {

    public static void set(JPanel pnl, JDesktopPane pane, String title) {

        Dimension d = pane.getSize();
        int width = d.width;
        int height = d.height;
        final JInternalFrame p22 = new JInternalFrame(title, true, true, true, true);
        p22.add(pnl);
        p22.setSize(width, height);
        p22.setFrameIcon(new ImageIcon(pane.getClass().getResource("/city_planning/img_menu/hot16.png")));
        try {
            if (p22.isVisible()) {
                pane.remove(p22);
                pane.add(p22);
                p22.
                        setLocation(pane.getWidth() / 2 - p22.getWidth() / 2, pane.
                                getHeight() / 2 - p22.getHeight() / 2);
                p22.moveToFront();
                p22.setSelected(true);
                p22.show();
                pane.repaint();
            } else {
                pane.add(p22);
                p22.setLocation(pane.getWidth() / 2 - p22.getWidth() / 2, pane.getHeight() / 2 - p22.getHeight() / 2);
                p22.show();
            }

            p22.setResizable(true);
            p22.setSelected(true);
            p22.setMaximum(true);
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
    }

    public static void set2(JPanel pnl, JDesktopPane pane, String title, int width, int height) {

        Dimension d = pane.getSize();

        final JInternalFrame p22 = new JInternalFrame(title, true, true, true, true);
        p22.add(pnl);
        p22.setSize(width, height);
        p22.setFrameIcon(new ImageIcon(pane.getClass().getResource("/city_planning/img_menu/hot16.png")));
        try {
            if (p22.isVisible()) {
                pane.remove(p22);
                pane.add(p22);
                p22.
                        setLocation(pane.getWidth() / 2 - p22.getWidth() / 2, pane.
                                getHeight() / 2 - p22.getHeight() / 2);
                p22.moveToFront();
                p22.setSelected(true);
                p22.show();
                pane.repaint();
            } else {
                pane.add(p22);
                p22.setLocation(pane.getWidth() / 2 - p22.getWidth() / 2, pane.getHeight() / 2 - p22.getHeight() / 2);
                p22.show();
            }

            p22.setResizable(true);
            p22.setSelected(true);
//            p22.setMaximum(true);
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }
    }
}
