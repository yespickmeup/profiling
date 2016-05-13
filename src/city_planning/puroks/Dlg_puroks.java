/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.puroks;

import city_planning.barangays.Barangays;
import city_planning.cities.Cities;
import city_planning.provinces.Provinces;
import city_planning.puroks.Puroks.to_puroks;
import city_planning.streets.Streets;
import city_planning.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
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
import mijzcx.synapse.desk.utils.FitIn;
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
public class Dlg_puroks extends javax.swing.JDialog {

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
    private Dlg_puroks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_puroks(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_puroks() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_puroks myRef;

    public void setThisRef(Dlg_puroks myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_puroks> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_puroks create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_puroks create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_puroks dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_puroks((java.awt.Frame) parent, false);
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
            Dlg_puroks dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_puroks((java.awt.Dialog) parent, false);
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

        Dlg_puroks dialog = Dlg_puroks.create(new javax.swing.JFrame(), true);
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

        jLabel5 = new Label.Separator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_puroks = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new Field.Search();
        jButton1 = new Button.Warning();
        jButton2 = new Button.Info();
        jButton3 = new Button.Primary();
        jButton4 = new Button.Default();
        tf_province = new Field.Combo();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_barangay = new Field.Combo();
        tf_purok = new Field.Combo();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setFocusable(false);

        tbl_puroks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_puroks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_puroksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_puroks);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

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

        tf_province.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_province.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_provinceMouseClicked(evt);
            }
        });
        tf_province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_provinceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Province:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("City:");

        tf_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cityMouseClicked(evt);
            }
        });
        tf_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cityActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Barangay:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Purok:");

        tf_barangay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_barangay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangayMouseClicked(evt);
            }
        });
        tf_barangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_barangayActionPerformed(evt);
            }
        });

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_purok, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_barangay))
                            .addComponent(tf_province)
                            .addComponent(tf_city))
                        .addGap(4, 4, 4)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbl_puroksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_puroksMouseClicked
        select_puroks();
    }//GEN-LAST:event_tbl_puroksMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_puroks();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        update_puroks();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_puroks();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_provinceActionPerformed
        init_provinces();
    }//GEN-LAST:event_tf_provinceActionPerformed

    private void tf_provinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_provinceMouseClicked
        init_provinces();
    }//GEN-LAST:event_tf_provinceMouseClicked

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        init_cities();
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        init_cities();
    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        init_barangays();
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        init_barangays();
    }//GEN-LAST:event_tf_barangayMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_puroks;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_purok;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_puroks(tbl_puroks);

        provinces = Provinces.ret_data(" order by province asc ");
        cities = Cities.ret_data("order by city asc");
        barangays = Barangays.ret_data("order by barangay asc ");
        street = Streets.ret_data("order by street asc");
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

    //<editor-fold defaultstate="collapsed" desc=" puroks "> 
    public static ArrayListModel tbl_puroks_ALM;
    public static TblpuroksModel tbl_puroks_M;

    public static void init_tbl_puroks(JTable tbl_puroks) {
        tbl_puroks_ALM = new ArrayListModel();
        tbl_puroks_M = new TblpuroksModel(tbl_puroks_ALM);
        tbl_puroks.setModel(tbl_puroks_M);
        tbl_puroks.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_puroks.setRowHeight(25);
        int[] tbl_widths_puroks = {0, 100, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0, n = tbl_widths_puroks.length; i < n; i++) {
            if (i == 100) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_puroks, i, tbl_widths_puroks[i]);
        }
        Dimension d = tbl_puroks.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_puroks.getTableHeader().setPreferredSize(d);
        tbl_puroks.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_puroks.setRowHeight(25);
        tbl_puroks.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_puroks(List<to_puroks> acc) {
        tbl_puroks_ALM.clear();
        tbl_puroks_ALM.addAll(acc);
    }

    public static class TblpuroksModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "id", "province_id", "province", "city_id", "city", "barangay_id", "barangay", "purok", "street"
        };

        public TblpuroksModel(ListModel listmodel) {
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
            to_puroks tt = (to_puroks) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.province_id;
                case 2:
                    return tt.province;
                case 3:
                    return tt.city_id;
                case 4:
                    return tt.city;
                case 5:
                    return tt.barangay_id;
                case 6:
                    return tt.barangay;
                case 7:
                    return tt.purok;
                default:
                    return tt.street;
            }
        }
    }
//</editor-fold> 

    private void ok1() {
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData());
        }
    }

    private void ret_data() {
        String where = "";
        List<Puroks.to_puroks> datas = Puroks.ret_data(where);
        loadData_puroks(datas);
    }

    //<editor-fold defaultstate="collapsed" desc=" Provinces ">
    List<Provinces.to_provinces> provinces = new ArrayList();

    private void init_provinces() {

        Object[][] obj = new Object[provinces.size()][1];
        int i = 0;
        for (Provinces.to_provinces to : provinces) {
            obj[i][0] = " " + to.province;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_province.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf_province, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Provinces.to_provinces to = provinces.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf_province;
                field.setText(to.province);
                field.setId("" + to.id);

            }
        });
    }

    List<Cities.to_cities> cities = new ArrayList();

    private void init_cities() {

        Object[][] obj = new Object[cities.size()][1];
        int i = 0;
        for (Cities.to_cities to : cities) {
            obj[i][0] = " " + to.city;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_city.getWidth()};
        String[] col_names = {"Cities"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf_city, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Cities.to_cities to = cities.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf_city;
                field.setText(to.city);
                field.setId("" + to.id);

            }
        });
    }

    List<Barangays.to_barangays> barangays = new ArrayList();

    private void init_barangays() {

        Object[][] obj = new Object[barangays.size()][1];
        int i = 0;
        for (Barangays.to_barangays to : barangays) {
            obj[i][0] = " " + to.barangay;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_barangay.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf_barangay, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Barangays.to_barangays to = barangays.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf_barangay;
                field.setText(to.barangay);
                field.setId("" + to.id);

            }
        });
    }
    List<Streets.to_streets> street = new ArrayList();

    private void init_streets() {

//        Object[][] obj = new Object[street.size()][1];
//        int i = 0;
//        for (Streets.to_streets to : street) {
//            obj[i][0] = " " + to.province;
//            i++;
//        }
//        JLabel[] labels = {};
//        int[] tbl_widths_customers = {tf_street.getWidth()};
//        String[] col_names = {"Name"};
//        TableRenderer tr = new TableRenderer();
//        TableRenderer.
//                setPopup(tf_street, obj, labels, tbl_widths_customers, col_names);
//        tr.setCallback(new TableRenderer.Callback() {
//            @Override
//            public void ok(TableRenderer.OutputData data) {
//                Streets.to_streets to = street.get(data.selected_row);
//                Field.Combo field = (Field.Combo) tf_street;
//                field.setText(to.province);
//                field.setId("" + to.id);
//
//            }
//        });
    }

    //</editor-fold>
    private void add_puroks() {

        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo ci = (Field.Combo) tf_city;
        Field.Combo ba = (Field.Combo) tf_barangay;

        int id = 0;

        int province_id = Integer.parseInt(prov.getId());
        String province = tf_province.getText();
        int city_id = Integer.parseInt(ci.getId());
        String city = tf_city.getText();
        String barangay_id = ba.getId();
        String barangay = tf_barangay.getText();
        String purok = tf_purok.getText();
        String street = "";

        to_puroks to = new to_puroks(id, province_id, province, city_id, city, barangay_id, barangay, purok, street);
        Puroks.add_data(to);

        tf_province.setText("");

        tf_city.setText("");

        tf_barangay.setText("");
        tf_purok.setText("");

        ret_data();
        System.out.println("Successfully");
        if (is_callback_triggered == 1) {
            ok1();
        }
    }

    private void select_puroks() {

        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo ci = (Field.Combo) tf_city;
        Field.Combo ba = (Field.Combo) tf_barangay;
        int row = tbl_puroks.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_puroks to = (to_puroks) tbl_puroks_ALM.get(row);
        prov.setText(FitIn.fmt_woc(to.province_id));
        tf_province.setText(to.province);
        ci.setText(FitIn.fmt_woc(to.city_id));
        tf_city.setText(to.city);
        ba.setText(to.barangay_id);
        tf_barangay.setText(to.barangay);
        tf_purok.setText(to.purok);

    }

    private void update_puroks() {

        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo ci = (Field.Combo) tf_city;
        Field.Combo ba = (Field.Combo) tf_barangay;

        int row = tbl_puroks.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_puroks to = (to_puroks) tbl_puroks_ALM.get(row);
        int id = 0;
        int province_id = Integer.parseInt(prov.getId());
        String province = tf_province.getText();
        int city_id = Integer.parseInt(ci.getId());
        String city = tf_city.getText();
        String barangay_id = ba.getId();
        String barangay = tf_barangay.getText();
        String purok = tf_purok.getText();
        String street = "";

        to_puroks to1 = new to_puroks(id, province_id, province, city_id, city, barangay_id, barangay, purok, street);
        Puroks.update_data(to1);

        tf_province.setText("");

        tf_city.setText("");

        tf_barangay.setText("");
        tf_purok.setText("");

        ret_data();
        System.out.println("Successfully");
        if (is_callback_triggered == 1) {
            ok1();
        }
    }

    private void delete_puroks() {

        int row = tbl_puroks.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_puroks to = (to_puroks) tbl_puroks_ALM.get(row);
        Puroks.delete_data(to);

        tf_province.setText("");

        tf_city.setText("");

        tf_barangay.setText("");
        tf_purok.setText("");

        ret_data();
        System.out.println("Successfully Deleted");
        if (is_callback_triggered == 1) {
            ok1();
        }
    }

}
