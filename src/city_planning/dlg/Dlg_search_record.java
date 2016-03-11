/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.barangays.Barangays;
import city_planning.household_members.Household_members;
import city_planning.household_members.Household_members.to_household_members;
import city_planning.households.Households;
import city_planning.houses.Houses;
import city_planning.initialize_fields.Initialize_search_record_field_types;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
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
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Dlg_search_record extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_search_houses
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
    private Dlg_search_record(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_search_record(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_search_record() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_search_record myRef;

    private void setThisRef(Dlg_search_record myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_search_record> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_search_record create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_search_record create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_search_record dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search_record((java.awt.Frame) parent, false);
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
            Dlg_search_record dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search_record((java.awt.Dialog) parent, false);
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

        Dlg_search_record dialog = Dlg_search_record.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_household_members = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new Field.Input();
        lbl_barangay1 = new javax.swing.JLabel();
        tf_region = new Field.Combo();
        jCheckBox1 = new javax.swing.JCheckBox();
        lbl_barangay2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        tf_province = new Field.Combo();
        lbl_barangay3 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        tf_city = new Field.Combo();
        lbl_barangay4 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        tf_barangay = new Field.Combo();
        lbl_barangay5 = new javax.swing.JLabel();
        lbl_barangay6 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        tf_purok = new Field.Combo();
        lbl_barangay7 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton2 = new Button.Default();
        jButton3 = new Button.Primary();
        jCheckBox9 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_household_members.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_household_members.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_membersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_household_members);

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel3.setText("Status:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        lbl_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay1.setText("Region:");

        tf_region.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_regionMouseClicked(evt);
            }
        });
        tf_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_regionActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");

        lbl_barangay2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay2.setText("Province:");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("All");

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

        lbl_barangay3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay3.setText("City/Municipality:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("All");

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

        lbl_barangay4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay4.setText("Barangay:");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("All");

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

        lbl_barangay5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay5.setText("Search:");

        lbl_barangay6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay6.setText("Purok:");

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("All");

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_purok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_purokMouseClicked(evt);
            }
        });
        tf_purok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purokActionPerformed(evt);
            }
        });

        lbl_barangay7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay7.setText("Search by:");

        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Name");

        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("House Number");

        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("Household Number");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/Search file.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        jButton3.setText("New Record [F1]");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("Household Member Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_barangay7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_region)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_barangay2)
                                                .addGap(5, 5, 5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_city)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_barangay4)))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_barangay))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tf_province))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_purok))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox9)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_barangay5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(lbl_barangay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox4)
                        .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_barangay5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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

    private void tf_regionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_regionMouseClicked
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionMouseClicked

    private void tf_provinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_provinceMouseClicked
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceMouseClicked

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayMouseClicked

    private void tf_purokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purokMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purokMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ret_household_members();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_new_record();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_provinceActionPerformed
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceActionPerformed

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regionActionPerformed
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionActionPerformed

    private void tf_purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purokActionPerformed
        Initialize_search_record_field_types.init_puroks(tf_purok);
    }//GEN-LAST:event_tf_purokActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_household_members();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_household_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_membersMouseClicked
        select_record();
    }//GEN-LAST:event_tbl_household_membersMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_barangay1;
    private javax.swing.JLabel lbl_barangay2;
    private javax.swing.JLabel lbl_barangay3;
    private javax.swing.JLabel lbl_barangay4;
    private javax.swing.JLabel lbl_barangay5;
    private javax.swing.JLabel lbl_barangay6;
    private javax.swing.JLabel lbl_barangay7;
    private javax.swing.JTable tbl_household_members;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_region;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        ret_default_location();
        Initialize_search_record_field_types.ret_data();
        init_tbl_household_members(tbl_household_members);
        jTextField1.grabFocus();
    }

    public void do_pass() {

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
        jTextField1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!tbl_household_members_ALM.isEmpty()) {
                        tbl_household_members.setRowSelectionInterval(0, 0);
                        tbl_household_members.grabFocus();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    add_new_record();
                }

            }
        });
        tbl_household_members.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    jTextField1.grabFocus();
                }
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    add_new_record();
                }
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tbl_household_members.setColumnSelectionInterval(8, 8);
                    select_record();

                    e.consume();
                }

            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" household_members "> 
    public static ArrayListModel tbl_household_members_ALM;
    public static Tblhousehold_membersModel tbl_household_members_M;

    public static void init_tbl_household_members(JTable tbl_household_members) {
        tbl_household_members_ALM = new ArrayListModel();
        tbl_household_members_M = new Tblhousehold_membersModel(tbl_household_members_ALM);
        tbl_household_members.setModel(tbl_household_members_M);
        tbl_household_members.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_members.setRowHeight(25);
        int[] tbl_widths_household_members = {100, 100, 60, 80, 180, 150, 150, 150, 50, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_household_members.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_members, i, tbl_widths_household_members[i]);
        }
        Dimension d = tbl_household_members.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_members.getTableHeader().setPreferredSize(d);
        tbl_household_members.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_household_members.setRowHeight(25);
        tbl_household_members.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_household_members(List<to_household_members> acc) {
        tbl_household_members_ALM.clear();
        tbl_household_members_ALM.addAll(acc);
    }

    public static class Tblhousehold_membersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "HM Number", "Name", "Gender", "Birth Date", "Region", "Province", "City", "Barangay", "", "", "", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "gender", "marital_status", "bday", "occupancy_years", "height", "weight", "birth_place", "present_address", "relation_to_household", "religion", "citizenship", "email_address", "blood_type", "languages_spoken", "is_registered_voter", "voters_id_no"
        };

        public Tblhousehold_membersModel(ListModel listmodel) {
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
            to_household_members tt = (to_household_members) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.household_member_no;
                case 1:
                    return " " + tt.lname + " " + tt.sname + ", " + tt.fname + " " + tt.mname;
                case 2:
                    return " " + tt.gender;
                case 3:
                    return " " + DateType.convert_slash_datetime2(tt.bday);
                case 4:
                    return " " + tt.region;
                case 5:
                    return " " + tt.province;
                case 6:
                    return " " + tt.city;
                case 7:
                    return " " + tt.barangay;
                case 8:
                    return " Edit";
                case 9:
                    return " Delete";
                case 10:
                    return " Print";
                case 11:
                    return tt.barangay;
                case 12:
                    return tt.barangay_id;
                case 13:
                    return tt.purok;
                case 14:
                    return tt.purok_id;
                case 15:
                    return tt.status;
                case 16:
                    return tt.house_no;
                case 17:
                    return tt.household_no;
                case 18:
                    return tt.household_member_no;
                case 19:
                    return tt.fname;
                case 20:
                    return tt.mname;
                case 21:
                    return tt.lname;
                case 22:
                    return tt.sname;
                case 23:
                    return tt.gender;
                case 24:
                    return tt.marital_status;
                case 25:
                    return tt.bday;
                case 26:
                    return tt.occupancy_years;
                case 27:
                    return tt.height;
                case 28:
                    return tt.weight;
                case 29:
                    return tt.birth_place;
                case 30:
                    return tt.present_address;
                case 31:
                    return tt.relation_to_household;
                case 32:
                    return tt.religion;
                case 33:
                    return tt.citizenship;
                case 34:
                    return tt.email_address;
                case 35:
                    return tt.blood_type;
                case 36:
                    return tt.languages_spoken;
                case 37:
                    return tt.is_registered_voter;
                default:
                    return tt.voters_id_no;
            }
        }
    }

    private void ret_household_members() {

        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;

        String where = " where voters_id_no like '%" + "" + "%' ";
        if (!jCheckBox1.isSelected()) {
            where = where + " and region like '%" + reg.getText() + "%' ";
        }

        if (!jCheckBox2.isSelected()) {
            where = where + " and province like '%" + prov.getText() + "%' ";
        }

        if (!jCheckBox3.isSelected()) {
            where = where + " and city like '%" + cit.getText() + "%' ";
        }

        if (!jCheckBox4.isSelected()) {
            where = where + " and barangay like '%" + bar.getText() + "%' ";
        }

        if (!jCheckBox5.isSelected()) {
            where = where + " and purok like '%" + pur.getText() + "%' ";
        }

        if (jCheckBox6.isSelected()) {
            where = where + " and concat(lname,space(1),fname) like '%" + jTextField1.getText() + "%' ";
        } else if (jCheckBox7.isSelected()) {
            where = where + " and house_no like '%" + jTextField1.getText() + "%' ";
        } else if (jCheckBox8.isSelected()) {
            where = where + " and household_no like '%" + jTextField1.getText() + "%' ";
        } else {
            where = where + " and household_member_no like '%" + jTextField1.getText() + "%' ";
        }
        where = where + " order by lname,fname asc ";
        System.out.println(where);
        List<Household_members.to_household_members> household_members = Household_members.ret_data(where);
        loadData_household_members(household_members);
        jLabel2.setText("" + household_members.size());
    }
//</editor-fold> 

    private void ret_default_location() {
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;

        String where = " where is_default=1";
        List<Barangays.to_barangays> datas = Barangays.ret_data(where);
        Barangays.to_barangays location = datas.get(0);

        reg.setId("" + location.region_id);
        reg.setText(location.region);
        prov.setId("" + location.province_id);
        prov.setText(location.province);
        cit.setId("" + location.city_id);
        cit.setText(location.city);
        bar.setId("" + location.id);
        bar.setText(location.barangay);
        pur.setId("");
    }

    private void add_new_record() {
        Window p = (Window) this;
        Dlg_house nd = Dlg_house.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_house.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_house.OutputData data) {
                closeDialog.ok();
                //insert record to database
                int id = 0;
                String created_at = DateType.now();
                String updated_at = DateType.now();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String region = data.region;
                String region_id = data.region_id;
                String province = data.province;
                String province_id = data.province_id;
                String city = data.city;
                String city_id = data.city_id;
                String barangay = data.barangay;
                String barangay_id = data.barangay_id;
                String purok = data.purok;
                String purok_id = data.purok_id;
                int status = 0;
                String house_no = data.house_no;
                int no_of_rooms = data.no_of_rooms;
                String bldg_types = data.bldg_types;
                String bldg_permit = data.bldg_permit;
                String toilet_types = data.toilet_types;
                String compartments = data.compartments;
                String bathroom_types = data.bathroom_types;
                String waste_disposal_methods = data.waste_disposal_methods;
                String kitchen_types = data.kitchen_types;
                String trans_types = data.trans_types;
                String construction_roof_types = data.construction_roof_types;
                String construction_wall_types = data.construction_wall_types;
                String construction_floor_types = data.construction_floor_types;
                String construction_communication_types = data.construction_communication_types;
                String lighting_fuels = data.lighting_fuels;
                String cooking_fuels = data.cooking_fuels;
                String water_sources = data.water_sources;
                double drinking_water_source_distance = data.drinking_water_source_distance;
                double nearest_water_source_distance = data.nearest_water_source_distance;
                List<Households.to_households> households = data.households;
                final Houses.to_houses house = new Houses.to_houses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance, households);
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                jButton2.setEnabled(false);
                jTextField1.setEnabled(false);
                jButton3.setEnabled(false);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        Houses.add_data(house);
                        Alert.set(1, "");
                        ret_household_members();

                        Initialize_table_households.tbl_households_ALM.clear();
                        Initialize_table_households.tbl_household_members_ALM.clear();
                        Initialize_table_households.tbl_household_expenditures_ALM.clear();
                        Initialize_table_households.tbl_household_consumptions_ALM.clear();
                        Initialize_table_households.tbl_household_assets_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_work_experiences_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_prefered_works_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_medications_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_licenses_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_health_statuses_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.clear();
                        Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.clear();

                        jButton2.setEnabled(true);
                        jTextField1.setEnabled(true);
                        jButton3.setEnabled(true);
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();

            }
        }
        );
        nd.setLocationRelativeTo(
                this);
        nd.setVisible(
                true);
    }

    private void select_record() {
        int row = tbl_household_members.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_household_members member = (to_household_members) tbl_household_members_ALM.get(row);
        int col = tbl_household_members.getSelectedColumn();
        if (col == 8) {
            String where = " where house_no='" + member.house_no + "' ";
            List<Houses.to_houses> houses = Houses.ret_data(where);
            List<Households.to_households> households = Households.ret_data(where);
            houses.get(0).setHouseholds(households);

            Window p = (Window) this;
            Dlg_house nd = Dlg_house.create(p, true);
            nd.setTitle("");
            nd.do_pass(houses.get(0), member);
            nd.setCallback(new Dlg_house.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_house.OutputData data) {
                    closeDialog.ok();

                    Initialize_table_households.tbl_houses_ALM.clear();
                    Initialize_table_households.tbl_households_ALM.clear();
                    Initialize_table_households.tbl_household_members_ALM.clear();
                    Initialize_table_households.tbl_household_member_concerns_ALM.clear();
                    Initialize_table_households.tbl_household_expenditures_ALM.clear();
                    Initialize_table_households.tbl_household_consumptions_ALM.clear();
                    Initialize_table_households.tbl_household_assets_ALM.clear();

                    Initialize_table_household_members.tbl_household_member_work_experiences_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_prefered_works_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_medications_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_licenses_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_health_statuses_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_employment_status_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.clear();
                    Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.clear();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 9) {

        }
        if (col == 10) {

        }

    }

}
