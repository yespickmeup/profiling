/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.business_clearances;

import city_planning.business_clearances.Business_clearance_applicants.to_business_clearance_applicants;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.DateType;
import city_planning.util.Dlg_confirm_action;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
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

/**
 *
 * @author Guinness
 */
public class Dlg_business_clearance_applicants extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_business_clearance_applicants
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
    private Dlg_business_clearance_applicants(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_business_clearance_applicants(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_business_clearance_applicants() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_business_clearance_applicants myRef;

    private void setThisRef(Dlg_business_clearance_applicants myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_business_clearance_applicants> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_business_clearance_applicants create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_business_clearance_applicants create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_business_clearance_applicants dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_business_clearance_applicants((java.awt.Frame) parent, false);
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
            Dlg_business_clearance_applicants dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_business_clearance_applicants((java.awt.Dialog) parent, false);
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

        Dlg_business_clearance_applicants dialog = Dlg_business_clearance_applicants.create(new javax.swing.JFrame(), true);
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
        tbl_business_clearance_applicants = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_applicant = new Field.Input();
        jTextField2 = new Field.Search();
        jButton1 = new Button.Warning();
        jButton2 = new Button.Info();
        jButton3 = new Button.Primary();
        jButton4 = new Button.Default();
        jLabel6 = new javax.swing.JLabel();
        tf_address = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        tf_email_address = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        tf_contact_no = new Field.Input();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setFocusable(false);

        tbl_business_clearance_applicants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_business_clearance_applicants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_business_clearance_applicantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_business_clearance_applicants);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        tf_applicant.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address:");

        tf_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email Address:");

        tf_email_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact Number:");

        tf_contact_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_address)
                            .addComponent(tf_applicant)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_email_address)
                            .addComponent(tf_contact_no))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_applicant, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_contact_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     update_business_clearance_applicants();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_business_clearance_applicants();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        ret_business_clerances();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     delete_business_clearance_applicants();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_business_clearance_applicantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_business_clearance_applicantsMouseClicked
     select_business_clearance_applicants();
    }//GEN-LAST:event_tbl_business_clearance_applicantsMouseClicked

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_business_clearance_applicants;
    private javax.swing.JTextField tf_address;
    private javax.swing.JTextField tf_applicant;
    private javax.swing.JTextField tf_contact_no;
    private javax.swing.JTextField tf_email_address;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_business_clearance_applicants(tbl_business_clearance_applicants);
    }
    int is_callback_triggered=0;
    public void do_pass() {
        is_callback_triggered=1;
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

    //<editor-fold defaultstate="collapsed" desc=" business_clearance_applicants "> 
    public static ArrayListModel tbl_business_clearance_applicants_ALM;
    public static Tblbusiness_clearance_applicantsModel tbl_business_clearance_applicants_M;

    public static void init_tbl_business_clearance_applicants(JTable tbl_business_clearance_applicants) {
        tbl_business_clearance_applicants_ALM = new ArrayListModel();
        tbl_business_clearance_applicants_M = new Tblbusiness_clearance_applicantsModel(tbl_business_clearance_applicants_ALM);
        tbl_business_clearance_applicants.setModel(tbl_business_clearance_applicants_M);
        tbl_business_clearance_applicants.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_business_clearance_applicants.setRowHeight(25);
        int[] tbl_widths_business_clearance_applicants = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_business_clearance_applicants.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_business_clearance_applicants, i, tbl_widths_business_clearance_applicants[i]);
        }
        Dimension d = tbl_business_clearance_applicants.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_business_clearance_applicants.getTableHeader().setPreferredSize(d);
        tbl_business_clearance_applicants.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_business_clearance_applicants.setRowHeight(25);
        tbl_business_clearance_applicants.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_business_clearance_applicants(List<to_business_clearance_applicants> acc) {
        tbl_business_clearance_applicants_ALM.clear();
        tbl_business_clearance_applicants_ALM.addAll(acc);
    }

    public static class Tblbusiness_clearance_applicantsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Name", "applicant", "address", "email_address", "contact_no", "created_at", "updated_at", "created_by", "updated_by", "status"
        };

        public Tblbusiness_clearance_applicantsModel(ListModel listmodel) {
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
            to_business_clearance_applicants tt = (to_business_clearance_applicants) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.applicant;
                case 1:
                    return tt.applicant;
                case 2:
                    return tt.address;
                case 3:
                    return tt.email_address;
                case 4:
                    return tt.contact_no;
                case 5:
                    return tt.created_at;
                case 6:
                    return tt.updated_at;
                case 7:
                    return tt.created_by;
                case 8:
                    return tt.updated_by;
                default:
                    return tt.status;
            }
        }
    }
    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }
    private void ret_business_clerances() {
        String where = "";
        List<Business_clearance_applicants.to_business_clearance_applicants> datas = Business_clearance_applicants.ret_data(where);
        loadData_business_clearance_applicants(datas);
        jLabel2.setText("" + datas.size());
    }

    private void add_business_clearance_applicants() {

        int id = 0;
        String applicant = tf_applicant.getText();
        String address = tf_address.getText();
        String email_address = tf_email_address.getText();
        String contact_no = tf_contact_no.getText();
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 1;

        to_business_clearance_applicants to = new to_business_clearance_applicants(id, applicant, address, email_address, contact_no, created_at, updated_at, created_by, updated_by, status);
        Business_clearance_applicants.add_data(to);
        Alert.set(1, address);
        ret_business_clerances();
        tf_applicant.setText("");
        tf_address.setText("");
        tf_email_address.setText("");
        tf_contact_no.setText("");
        tf_applicant.grabFocus();
        if(is_callback_triggered==1){
            ok1();
        }
    }

    private void select_business_clearance_applicants() {

        int row = tbl_business_clearance_applicants.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_business_clearance_applicants to = (to_business_clearance_applicants) tbl_business_clearance_applicants_ALM.get(row);
        tf_applicant.setText(to.applicant);
        tf_address.setText(to.address);
        tf_email_address.setText(to.email_address);
        tf_contact_no.setText(to.contact_no);

    }

    private void update_business_clearance_applicants() {

        int row = tbl_business_clearance_applicants.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_business_clearance_applicants to = (to_business_clearance_applicants) tbl_business_clearance_applicants_ALM.get(row);
        int id = to.id;
        String applicant = tf_applicant.getText();
        String address = tf_address.getText();
        String email_address = tf_email_address.getText();
        String contact_no = tf_contact_no.getText();
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        int status = 1;

        to_business_clearance_applicants to1 = new to_business_clearance_applicants(id, applicant, address, email_address, contact_no, created_at, updated_at, created_by, updated_by, status);
        Business_clearance_applicants.update_data(to1);
        Alert.set(2, address);
        ret_business_clerances();
        tf_applicant.setText("");
        tf_address.setText("");
        tf_email_address.setText("");
        tf_contact_no.setText("");
        tf_applicant.grabFocus();
        if(is_callback_triggered==1){
            ok1();
        }
    }

    private void delete_business_clearance_applicants() {

        int row = tbl_business_clearance_applicants.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_business_clearance_applicants to = (to_business_clearance_applicants) tbl_business_clearance_applicants_ALM.get(row);
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                Business_clearance_applicants.delete_data(to);
                Alert.set(3, "");
                ret_business_clerances();
                tf_applicant.setText("");
                tf_address.setText("");
                tf_email_address.setText("");
                tf_contact_no.setText("");
                tf_applicant.grabFocus();
                if(is_callback_triggered==1){
                    ok1();
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

//</editor-fold> 
}
