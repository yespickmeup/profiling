/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.dropdowns;

import cp.location.S1_transportations;

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
public class Transportations {
    static List<S1_transportations.to_transportation_types> wall_list = new ArrayList();
    
    public static void transportation(final JTextField selected) {
        
        selected.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                //   System.out.println("mouseevent");
                String where = " where transportation_type like '" + selected.getText() + "%'  order by transportation_type asc";
                wall_list.clear();
                wall_list = S1_transportations.ret_data(where);
                Object[][] obj = new Object[wall_list.size()][1];
                int i = 0;
                for (S1_transportations.to_transportation_types to : wall_list) {
                    obj[i][0] = " " + to.transportation_type;
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
                        S1_transportations.to_transportation_types to = (S1_transportations.to_transportation_types) wall_list.get(data.selected_row);
                        selected.setText(to.transportation_type);
                        
                    }
                });
            }
            
        });
        
        selected.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent ke) {

                // System.out.println("mouseevent");
                String where = " where transportation_type like '" + selected.getText() + "%'  order by transportation_type asc";
                wall_list.clear();
                wall_list = S1_transportations.ret_data(where);
                Object[][] obj = new Object[wall_list.size()][1];
                int i = 0;
                for (S1_transportations.to_transportation_types to : wall_list) {
                    obj[i][0] = " " + to.transportation_type;
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
                        S1_transportations.to_transportation_types to = (S1_transportations.to_transportation_types) wall_list.get(data.selected_row);
                        selected.setText(to.transportation_type);
                        
                    }
                });
            }
        });
        
    }
}
