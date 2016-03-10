/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.dropdowns;

import cp.location.S1_basic_needs;
import city_planning.util.TableRenderer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class Items {

    static List<S1_basic_needs.to_basic_needs> item_list = new ArrayList();

    public static void basic_needs(final JTextField selected) {

        selected.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("mouseevent");
                String where = " where basic_needs like '%'  order by basic_needs asc";
                item_list.clear();
                item_list = S1_basic_needs.ret_data(where);
                Object[][] obj = new Object[item_list.size()][1];
                int i = 0;
                for (S1_basic_needs.to_basic_needs to : item_list) {
                    obj[i][0] = " " + to.basic_needs;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {selected.getWidth()};
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(selected, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_basic_needs.to_basic_needs to = (S1_basic_needs.to_basic_needs) item_list.get(data.selected_row);
                        if (selected.getText().isEmpty()) {
                            selected.setText(to.basic_needs);
                        } else {
                              selected.setText(selected.getText()+", "+to.basic_needs);
                        }
                    }

                });
            }

        });

        selected.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent ke) {

                System.out.println("mouseevent");
                String where = " where basic_needs like '" + selected.getText() + "%' AND city_id='108' order by basic_needs asc";
                item_list.clear();
                item_list = S1_basic_needs.ret_data(where);
                Object[][] obj = new Object[item_list.size()][1];
                int i = 0;
                for (S1_basic_needs.to_basic_needs to : item_list) {
                    obj[i][0] = " " + to.basic_needs;
                    i++;
                }
                JLabel[] labels = {};
                int[] tbl_widths_customers = {selected.getWidth()};
                String[] col_names = {""};
                TableRenderer tr = new TableRenderer();
                TableRenderer.setPopup(selected, obj, labels, tbl_widths_customers, col_names);
                tr.setCallback(new TableRenderer.Callback() {
                    @Override
                    public void ok(TableRenderer.OutputData data) {
                        S1_basic_needs.to_basic_needs to = (S1_basic_needs.to_basic_needs) item_list.get(data.selected_row);
                        if (selected.getText().isEmpty()) {
                            selected.setText(to.basic_needs);
                        } else {
                              selected.setText(selected.getText()+", "+to.basic_needs);
                        }

                    }
                });
            }
        });

    }
}
