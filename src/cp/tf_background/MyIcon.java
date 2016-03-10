/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.tf_background;

import javax.swing.JLabel;

/**
 *
 * @author Guinness
 */
public class MyIcon {

    public static JLabel arrow_down() {
        JLabel lbl = new JLabel();
        lbl.setIcon(new javax.swing.ImageIcon(MyIcon.class.getResource("/cp/tf_background/arrow_down.png")));
        return lbl;
    }
}
