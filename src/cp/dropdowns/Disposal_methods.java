/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.dropdowns;

import cp.location.S1_disposal_methods;

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
public class Disposal_methods {
    static List<S1_disposal_methods.to_disposal_methods> disposal_list = new ArrayList();
    
    public static void disposal(final JTextField selected) {
        
        selected.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                //   System.out.println("mouseevent");
                String where = " where disposal_method like '" + selected.getText() + "%'  order by disposal_method asc";
                disposal_list.clear();
                disposal_list = S1_disposal_methods.ret_data(where);
                Object[][] obj = new Object[disposal_list.size()][1];
                int i = 0;
                for (S1_disposal_methods.to_disposal_methods to : disposal_list) {
                    obj[i][0] = " " + to.disposal_method;
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
                        S1_disposal_methods.to_disposal_methods to = (S1_disposal_methods.to_disposal_methods) disposal_list.get(data.selected_row);
                        selected.setText(to.disposal_method);
                        
                    }
                });
            }
            
        });
        
        selected.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent ke) {

                // System.out.println("mouseevent");
                String where = " where disposal_method like '" + selected.getText() + "%'  order by disposal_method asc";
                disposal_list.clear();
                disposal_list = S1_disposal_methods.ret_data(where);
                Object[][] obj = new Object[disposal_list.size()][1];
                int i = 0;
                for (S1_disposal_methods.to_disposal_methods to : disposal_list) {
                    obj[i][0] = " " + to.disposal_method;
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
                        S1_disposal_methods.to_disposal_methods to = (S1_disposal_methods.to_disposal_methods) disposal_list.get(data.selected_row);
                        selected.setText(to.disposal_method);
                        
                    }
                });
            }
        });
        
    }
}
