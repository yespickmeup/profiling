/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.users;

import city_planning.users.User_default_previleges.to_user_default_previleges;
import city_planning.users.User_previleges.to_user_previleges;
import city_planning.util.Alert;
import city_planning.util.Dlg_confirm_action;
import city_planning.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Dlg_user_previleges extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_user_previleges
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
    private Dlg_user_previleges(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_user_previleges(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_user_previleges() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_user_previleges myRef;

    private void setThisRef(Dlg_user_previleges myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_user_previleges> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_user_previleges create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_user_previleges create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_user_previleges dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_user_previleges((java.awt.Frame) parent, false);
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
            Dlg_user_previleges dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_user_previleges((java.awt.Dialog) parent, false);
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

        Dlg_user_previleges dialog = Dlg_user_previleges.create(new javax.swing.JFrame(), true);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user_default_previleges = new javax.swing.JTable();
        jTextField1 = new Field.Combo();
        jButton3 = new Button.Default();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_user_previleges = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Default Previleges", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setText("0");

        jLabel1.setText("Total no. of rows:");

        tbl_user_default_previleges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_default_previleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_default_previlegesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_user_default_previleges);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("All");
        jTextField1.setFocusable(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Add All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Previleges", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel3.setText("0");

        jLabel6.setText("Total no. of rows:");

        tbl_user_previleges.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_user_previleges.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_user_previlegesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_user_previleges);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        init_previlege_types();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_previlege_types();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_multi_user_previleges();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl_user_default_previlegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_default_previlegesMouseClicked
        select_default_user_privelege();
    }//GEN-LAST:event_tbl_user_default_previlegesMouseClicked

    private void tbl_user_previlegesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_user_previlegesMouseClicked
        delete_user_privelege();
    }//GEN-LAST:event_tbl_user_previlegesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_user_default_previleges;
    private javax.swing.JTable tbl_user_previleges;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_user_default_previleges(tbl_user_default_previleges);
        ret_data_default_previleges();
        init_tbl_user_previleges(tbl_user_previleges);

    }
    Users.to_users user = null;

    public void do_pass(Users.to_users to) {
        user = to;
        ret_data_user_previleges();
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
    private void init_previlege_types() {
        final Field.Combo tf = (Field.Combo) jTextField1;

        final List<String> types = new ArrayList();
        types.add("All");
        types.add("Transactions");
        types.add("Maintenance");
        types.add("Reports");
        Object[][] obj = new Object[types.size()][1];
        int i = 0;
        for (String to : types) {
            obj[i][0] = " " + to;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                String to = types.get(data.selected_row);
                tf.setText(to);
                ret_data_default_previleges();
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" user_default_previleges "> 
    public static ArrayListModel tbl_user_default_previleges_ALM;
    public static Tbluser_default_previlegesModel tbl_user_default_previleges_M;

    public static void init_tbl_user_default_previleges(JTable tbl_user_default_previleges) {
        tbl_user_default_previleges_ALM = new ArrayListModel();
        tbl_user_default_previleges_M = new Tbluser_default_previlegesModel(tbl_user_default_previleges_ALM);
        tbl_user_default_previleges.setModel(tbl_user_default_previleges_M);
        tbl_user_default_previleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_user_default_previleges.setRowHeight(25);
        int[] tbl_widths_user_default_previleges = {100, 40, 0};
        for (int i = 0, n = tbl_widths_user_default_previleges.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_user_default_previleges, i, tbl_widths_user_default_previleges[i]);
        }
        Dimension d = tbl_user_default_previleges.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_user_default_previleges.getTableHeader().setPreferredSize(d);
        tbl_user_default_previleges.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_user_default_previleges.setRowHeight(25);
        tbl_user_default_previleges.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_user_default_previleges(List<to_user_default_previleges> acc) {
        tbl_user_default_previleges_ALM.clear();
        tbl_user_default_previleges_ALM.addAll(acc);
    }

    public static class Tbluser_default_previlegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "", "name"
        };

        public Tbluser_default_previlegesModel(ListModel listmodel) {
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
            to_user_default_previleges tt = (to_user_default_previleges) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.name;
                case 1:
                    return " Add";
                default:
                    return tt.name;
            }
        }
    }

    private void ret_data_default_previleges() {
        String where = "";
        String type = jTextField1.getText();
        if (!type.equals("All")) {
            where = " where account like '" + type + "' order by name asc ";
        }
        List<to_user_default_previleges> datas = User_default_previleges.ret_data(where);
        loadData_user_default_previleges(datas);
        jLabel2.setText("" + datas.size());
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" user_previleges "> 
    public static ArrayListModel tbl_user_previleges_ALM;
    public static Tbluser_previlegesModel tbl_user_previleges_M;

    public static void init_tbl_user_previleges(JTable tbl_user_previleges) {
        tbl_user_previleges_ALM = new ArrayListModel();
        tbl_user_previleges_M = new Tbluser_previlegesModel(tbl_user_previleges_ALM);
        tbl_user_previleges.setModel(tbl_user_previleges_M);
        tbl_user_previleges.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_user_previleges.setRowHeight(25);
        int[] tbl_widths_user_previleges = {60, 60, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_user_previleges.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_user_previleges, i, tbl_widths_user_previleges[i]);
        }
        Dimension d = tbl_user_previleges.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_user_previleges.getTableHeader().setPreferredSize(d);
        tbl_user_previleges.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_user_previleges.setRowHeight(25);
        tbl_user_previleges.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_user_previleges(List<to_user_previleges> acc) {
        tbl_user_previleges_ALM.clear();
        tbl_user_previleges_ALM.addAll(acc);
    }

    public static class Tbluser_previlegesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "", "updated_at", "created_by", "updated_by", "status", "user_id", "user_name", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "account", "previlege"
        };

        public Tbluser_previlegesModel(ListModel listmodel) {
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
            to_user_previleges tt = (to_user_previleges) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.previlege;
                case 1:
                    return " Remove";
                case 2:
                    return tt.updated_at;
                case 3:
                    return tt.created_by;
                case 4:
                    return tt.updated_by;
                case 5:
                    return tt.status;
                case 6:
                    return tt.user_id;
                case 7:
                    return tt.user_name;
                case 8:
                    return tt.region;
                case 9:
                    return tt.region_id;
                case 10:
                    return tt.province;
                case 11:
                    return tt.province_id;
                case 12:
                    return tt.city;
                case 13:
                    return tt.city_id;
                case 14:
                    return tt.barangay;
                case 15:
                    return tt.barangay_id;
                case 16:
                    return tt.account;
                default:
                    return tt.previlege;
            }
        }
    }

    private void ret_data_user_previleges() {
        String where = " where user_id='" + user.id + "' ";
        List<to_user_previleges> datas = User_previleges.ret_data(where);
        loadData_user_previleges(datas);
        jLabel3.setText("" + datas.size());
    }

    private void add_multi_user_previleges() {

        int id = 0;
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 1;
        String user_id = "" + user.id;
        String user_name = user.user_name;
        String region = MyUser.getRegion();
        String region_id = MyUser.getRegion_id();
        String province = MyUser.getProvince();
        String province_id = MyUser.getProvince_id();
        String city = MyUser.getCity();
        String city_id = MyUser.getCity_id();
        String barangay = MyUser.getBarangay();
        String barangay_id = MyUser.getBarangay_id();
        List<to_user_default_previleges> datas = tbl_user_default_previleges_ALM;
        List<to_user_previleges> added = tbl_user_previleges_ALM;

        List<to_user_previleges> to_add = new ArrayList();
        for (to_user_default_previleges prev : datas) {
            int exists = 0;
            for (to_user_previleges p : added) {
                if (prev.account.equalsIgnoreCase(p.account) && prev.name.equalsIgnoreCase(p.previlege)) {
                    exists = 1;
                    break;

                }
            }
            if (exists == 0) {
                String account = prev.account;
                String previlege = prev.name;
                to_user_previleges to = new to_user_previleges(id, created_at, updated_at, created_by, updated_by, status, user_id, user_name, region, region_id, province, province_id, city, city_id, barangay, barangay_id, account, previlege);
                to_add.add(to);
            }
        }
        if (!to_add.isEmpty()) {
            User_previleges.add_data(to_add);
            Alert.set(1, "");
            ret_data_user_previleges();
        } else {
            Alert.set(0, "Nothing to Add!");
        }

    }

    private void select_default_user_privelege() {
        int row = tbl_user_default_previleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_user_default_previleges privelege = (to_user_default_previleges) tbl_user_default_previleges_ALM.get(row);

        int id = 0;
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 1;
        String user_id = "" + user.id;
        String user_name = user.user_name;
        String region = MyUser.getRegion();
        String region_id = MyUser.getRegion_id();
        String province = MyUser.getProvince();
        String province_id = MyUser.getProvince_id();
        String city = MyUser.getCity();
        String city_id = MyUser.getCity_id();
        String barangay = MyUser.getBarangay();
        String barangay_id = MyUser.getBarangay_id();

        List<to_user_previleges> prevs = tbl_user_previleges_ALM;

        List<to_user_previleges> added = new ArrayList();

        String account = privelege.account;
        String previlege = privelege.name;
        to_user_previleges to = new to_user_previleges(id, created_at, updated_at, created_by, updated_by, status, user_id, user_name, region, region_id, province, province_id, city, city_id, barangay, barangay_id, account, previlege);
        int exists = 0;
        for (to_user_previleges p : prevs) {
            if (privelege.account.equalsIgnoreCase(p.account) && privelege.name.equalsIgnoreCase(p.previlege)) {
                exists = 1;
                break;
            }
        }
        if (exists == 0) {
            added.add(to);
            User_previleges.add_data(added);
            Alert.set(1, "");
            ret_data_user_previleges();
        } else {
            Alert.set(0, "Already Added");
        }

    }

    private void delete_user_privelege() {
        int row = tbl_user_previleges.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_user_previleges to = (to_user_previleges) tbl_user_previleges_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                User_previleges.delete_data(to);
                Alert.set(3, "");
                ret_data_user_previleges();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
//</editor-fold> 
}
