/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.dropdowns;

import cp.location.S1_barangays;
import city_planning.util.TableRenderer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Barangays {

    static List<S1_barangays.to_barangays> barangay_list = new ArrayList();

   public static void barangay(final JTextField selected) {
   
        selected.addMouseListener(new MouseAdapter() {
    
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("mouseevent");
                String where = " where barangay like '" + selected.getText() + "%' AND city_id='108' order by barangay asc";
                barangay_list.clear();
                barangay_list = S1_barangays.ret_data(where);
                Object[][] obj = new Object[barangay_list.size()][1];
                int i = 0;
                for (S1_barangays.to_barangays to : barangay_list) {
                    obj[i][0] = " " + to.barangay;
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
                        S1_barangays.to_barangays to = (S1_barangays.to_barangays) barangay_list.get(data.selected_row);
                        selected.setText(to.barangay);

                    }
                });
            }
       

        });
        
        
        selected.addKeyListener(new KeyAdapter() {
        
          @Override
          public void keyTyped(KeyEvent ke)
          {
              
            System.out.println("mouseevent");
                String where = " where barangay like '" + selected.getText() + "%' AND city_id='108' order by barangay asc";
                barangay_list.clear();
                barangay_list = S1_barangays.ret_data(where);
                Object[][] obj = new Object[barangay_list.size()][1];
                int i = 0;
                for (S1_barangays.to_barangays to : barangay_list) {
                    obj[i][0] = " " + to.barangay;
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
                        S1_barangays.to_barangays to = (S1_barangays.to_barangays) barangay_list.get(data.selected_row);
                        selected.setText(to.barangay);

                    }
                });
            }
        });
        

    }
}
