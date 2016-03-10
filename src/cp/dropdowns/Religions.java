/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edireligionr.
 */
package cp.dropdowns;

import cp.location.S1_mylist;
import city_planning.util.TableRenderer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author nadruoj
 */
public class Religions {

    public static List<S1_mylist.religions> religion_list = new ArrayList();

    public static void religions(final JTextField textfield) {
        textfield.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {

                religion_list.clear();
                religion_list = S1_mylist.ret_religions();
                Object[][] obj = new Object[religion_list.size()][1];
                int i = 0;
                for (S1_mylist.religions to : religion_list) {
                    obj[i][0] = " " + to.religion;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {textfield.getWidth()};
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(textfield, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_mylist.religions to = (S1_mylist.religions) religion_list.get(data.selected_row);
                        textfield.setText(to.religion);
                    }
                });
            }

        });
    }
}
