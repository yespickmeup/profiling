/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edirelationr.
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
public class Relations {

    public static List<S1_mylist.relations> relation_list = new ArrayList();

    public static void relations(final JTextField textfield) {
        textfield.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {

                relation_list.clear();
                relation_list = S1_mylist.ret_relations();
                Object[][] obj = new Object[relation_list.size()][1];
                int i = 0;
                for (S1_mylist.relations to : relation_list) {
                    obj[i][0] = " " + to.relation;
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
                        S1_mylist.relations to = (S1_mylist.relations) relation_list.get(data.selected_row);
                        textfield.setText(to.relation);
                    }
                });
            }

        });
    }
}
