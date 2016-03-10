/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.dropdowns;

import cp.location.S1_disabilities;
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
public class Disabilities {
       
    static List<S1_disabilities.to_disabilities> disability_list = new ArrayList();
    
    public static void disabilities(final JTextField selected) {
        
        selected.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                //   System.out.println("mouseevent");
                String where = " where disability like '" + selected.getText() + "%'  order by disability asc";
                disability_list.clear();
                disability_list = S1_disabilities.ret_data(where);
                Object[][] obj = new Object[disability_list.size()][1];
                int i = 0;
                for (S1_disabilities.to_disabilities to : disability_list) {
                    obj[i][0] = " " + to.disability;
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
                        S1_disabilities.to_disabilities to = (S1_disabilities.to_disabilities) disability_list.get(data.selected_row);
                        selected.setText(to.disability);
                        
                    }
                });
            }
            
        });
        
        selected.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyTyped(KeyEvent ke) {

                // System.out.println("mouseevent");
                String where = " where disability like '" + selected.getText() + "%'  order by disability asc";
                disability_list.clear();
                disability_list = S1_disabilities.ret_data(where);
                Object[][] obj = new Object[disability_list.size()][1];
                int i = 0;
                for (S1_disabilities.to_disabilities to : disability_list) {
                    obj[i][0] = " " + to.disability;
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
                        S1_disabilities.to_disabilities to = (S1_disabilities.to_disabilities) disability_list.get(data.selected_row);
                        selected.setText(to.disability);
                        
                    }
                });
            }
        });
    }
}
