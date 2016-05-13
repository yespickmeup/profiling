/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.solid_waste_disposal_methods;

import city_planning.solid_waste_disposal_methods.Solid_waste_disposal_methods.to_solid_waste_disposal_methods;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;

/**
 *
 * @author Guinness
 */
public class Dlg_solid_waste_disposal_methods extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_simple_crud
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_solid_waste_disposal_methods(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_solid_waste_disposal_methods(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_solid_waste_disposal_methods() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_solid_waste_disposal_methods myRef;

    private void setThisRef(Dlg_solid_waste_disposal_methods myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_solid_waste_disposal_methods> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_solid_waste_disposal_methods create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_solid_waste_disposal_methods create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_solid_waste_disposal_methods dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_solid_waste_disposal_methods((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_solid_waste_disposal_methods dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_solid_waste_disposal_methods((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_solid_waste_disposal_methods dialog = Dlg_solid_waste_disposal_methods.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_solid_waste_disposal_methods = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_disposal_method = new Field.Input();
        jTextField2 = new Field.Search();
        jButton1 = new Button.Warning();
        jButton2 = new Button.Info();
        jButton3 = new Button.Primary();
        jButton4 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setFocusable(false);

        tbl_solid_waste_disposal_methods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_solid_waste_disposal_methods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_solid_waste_disposal_methodsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_solid_waste_disposal_methods);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Solid Waste Disposal Method:");

        tf_disposal_method.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_disposal_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disposal_methodActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_disposal_method))
                    .addComponent(jTextField2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_disposal_method, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_solid_waste_disposal_methods();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        update_solid_waste_disposal_methods();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_solid_waste_disposal_methodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_solid_waste_disposal_methodsMouseClicked
        select_solid_waste_disposal_methods();
    }//GEN-LAST:event_tbl_solid_waste_disposal_methodsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_solid_waste_disposal_methods();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_disposal_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disposal_methodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_disposal_methodActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_solid_waste_disposal_methods;
    private javax.swing.JTextField tf_disposal_method;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_solid_waste_disposal_methods(tbl_solid_waste_disposal_methods);
        ret_data();
    }
    int is_callback_triggered = 0;

    public void do_pass() {
        is_callback_triggered = 1;
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" solid_waste_disposal_methods "> 
    public static ArrayListModel tbl_solid_waste_disposal_methods_ALM;
    public static Tblsolid_waste_disposal_methodsModel tbl_solid_waste_disposal_methods_M;

    public static void init_tbl_solid_waste_disposal_methods(JTable tbl_solid_waste_disposal_methods) {
        tbl_solid_waste_disposal_methods_ALM = new ArrayListModel();
        tbl_solid_waste_disposal_methods_M = new Tblsolid_waste_disposal_methodsModel(tbl_solid_waste_disposal_methods_ALM);
        tbl_solid_waste_disposal_methods.setModel(tbl_solid_waste_disposal_methods_M);
        tbl_solid_waste_disposal_methods.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_solid_waste_disposal_methods.setRowHeight(25);
        int[] tbl_widths_solid_waste_disposal_methods = {100, 0};
        for (int i = 0, n = tbl_widths_solid_waste_disposal_methods.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_solid_waste_disposal_methods, i, tbl_widths_solid_waste_disposal_methods[i]);
        }
        Dimension d = tbl_solid_waste_disposal_methods.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_solid_waste_disposal_methods.getTableHeader().setPreferredSize(d);
        tbl_solid_waste_disposal_methods.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_solid_waste_disposal_methods.setRowHeight(25);
        tbl_solid_waste_disposal_methods.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_solid_waste_disposal_methods(List<to_solid_waste_disposal_methods> acc) {
        tbl_solid_waste_disposal_methods_ALM.clear();
        tbl_solid_waste_disposal_methods_ALM.addAll(acc);
    }

    public static class Tblsolid_waste_disposal_methodsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Method", "disposal_method"
        };

        public Tblsolid_waste_disposal_methodsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_solid_waste_disposal_methods tt = (to_solid_waste_disposal_methods) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.disposal_method;
                default:
                    return tt.disposal_method;
            }
        }
    }
//</editor-fold> 

    private void ret_data() {
        String where = "order by disposal_method asc ";
        List<to_solid_waste_disposal_methods> datas = Solid_waste_disposal_methods.ret_data(where);
        loadData_solid_waste_disposal_methods(datas);
    }

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }

    private void add_solid_waste_disposal_methods() {

        int id = 0;
        String disposal_method = tf_disposal_method.getText();

        to_solid_waste_disposal_methods to = new to_solid_waste_disposal_methods(id, disposal_method);
        Solid_waste_disposal_methods.add_data(to);
        tf_disposal_method.setText("");

        ret_data();
        System.out.println("Successfully Added!");
        if (is_callback_triggered == 1) {
            ok1();
        }
    }

    private void select_solid_waste_disposal_methods() {

        int row = tbl_solid_waste_disposal_methods.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_solid_waste_disposal_methods to = (to_solid_waste_disposal_methods) tbl_solid_waste_disposal_methods_ALM.get(row);
        tf_disposal_method.setText(to.disposal_method);

    }

    private void update_solid_waste_disposal_methods() {

        int row = tbl_solid_waste_disposal_methods.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_solid_waste_disposal_methods to = (to_solid_waste_disposal_methods) tbl_solid_waste_disposal_methods_ALM.get(row);
        int id = to.id;
        String disposal_method = tf_disposal_method.getText();

        to_solid_waste_disposal_methods to1 = new to_solid_waste_disposal_methods(id, disposal_method);
        Solid_waste_disposal_methods.update_data(to1);
        tf_disposal_method.setText("");

        ret_data();
        System.out.println("Successfully Updated!");
        if (is_callback_triggered == 1) {
            ok1();
        }
    }

    private void delete_solid_waste_disposal_methods() {

        int row = tbl_solid_waste_disposal_methods.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_solid_waste_disposal_methods to = (to_solid_waste_disposal_methods) tbl_solid_waste_disposal_methods_ALM.get(row);
        Solid_waste_disposal_methods.delete_data(to);
        tf_disposal_method.setText("");

        ret_data();
        System.out.println("Successfully Deleted!");
        if (is_callback_triggered == 1) {
            ok1();
        }

    }

}
