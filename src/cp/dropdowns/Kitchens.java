/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.dropdowns;

import cp.location.S1_kitchens;
import cp.location.S1_walls;
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
 * @author nadruoj19
 */
public class Kitchens {
    static List<S1_kitchens.to_kitchen_types> kitchen_list = new ArrayList();
    
    public static void kitchen(final JTextField selected) {
        
        selected.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                //   System.out.println("mouseevent");
                String where = " where kitchen_type like '" + selected.getText() + "%'  order by kitchen_type asc";
                kitchen_list.clear();
                kitchen_list = S1_kitchens.ret_data(where);
                Object[][] obj = new Object[kitchen_list.size()][1];
                int i = 0;
                for (S1_kitchens.to_kitchen_types to : kitchen_list) {
                    obj[i][0] = " " + to.kitchen_type;
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
                        S1_kitchens.to_kitchen_types to = (S1_kitchens.to_kitchen_types) kitchen_list.get(data.selected_row);
                        selected.setText(to.kitchen_type);
                        
                    }
                });
            }
            
        });
        
        selected.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent ke) {

                // System.out.println("mouseevent");
                String where = " where kitchen_type like '" + selected.getText() + "%'  order by kitchen_type asc";
                kitchen_list.clear();
                kitchen_list = S1_kitchens.ret_data(where);
                Object[][] obj = new Object[kitchen_list.size()][1];
                int i = 0;
                for (S1_kitchens.to_kitchen_types to : kitchen_list) {
                    obj[i][0] = " " + to.kitchen_type;
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
                        S1_kitchens.to_kitchen_types to = (S1_kitchens.to_kitchen_types) kitchen_list.get(data.selected_row);
                        selected.setText(to.kitchen_type);
                        
                    }
                });
            }
        });
        
    } 
}
