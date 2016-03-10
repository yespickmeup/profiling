/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.dropdowns;

import cp.location.S1_cookings;
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
public class Lightings {
    static List<S1_cookings.to_cooking_lighting_types> cooking_list = new ArrayList();
    
    public static void cooking(final JTextField selected) {
        
        selected.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                //   System.out.println("mouseevent");
                String where = " where cooking_lighting_type like '" + selected.getText() + "%'  order by cooking_lighting_type asc";
                cooking_list.clear();
                cooking_list = S1_cookings.ret_data(where);
                Object[][] obj = new Object[cooking_list.size()][1];
                int i = 0;
                for (S1_cookings.to_cooking_lighting_types to : cooking_list) {
                    obj[i][0] = " " + to.cooking_lighting_type;
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
                        S1_cookings.to_cooking_lighting_types to = (S1_cookings.to_cooking_lighting_types) cooking_list.get(data.selected_row);
                        selected.setText(to.cooking_lighting_type);
                        
                    }
                });
            }
            
        });
        
        selected.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent ke) {

                // System.out.println("mouseevent");
                String where = " where cooking_lighting_type like '" + selected.getText() + "%'  order by cooking_lighting_type asc";
                cooking_list.clear();
                cooking_list = S1_cookings.ret_data(where);
                Object[][] obj = new Object[cooking_list.size()][1];
                int i = 0;
                for (S1_cookings.to_cooking_lighting_types to : cooking_list) {
                    obj[i][0] = " " + to.cooking_lighting_type;
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
                        S1_cookings.to_cooking_lighting_types to = (S1_cookings.to_cooking_lighting_types) cooking_list.get(data.selected_row);
                        selected.setText(to.cooking_lighting_type);
                        
                    }
                });
            }
        });
        
    }
}
