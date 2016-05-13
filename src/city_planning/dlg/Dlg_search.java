/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.barangays.Barangays;
import city_planning.barangays.Dlg_barangays;
import city_planning.cities.Dlg_cities;
import city_planning.household_assets.Household_assets;
import city_planning.household_consumptions.Household_consumptions;
import city_planning.household_expenditures.Household_expenditures;
import city_planning.household_member_competence_certificates.Household_member_competence_certificates;
import city_planning.household_member_educational_backgrounds.Household_member_educational_backgrounds;
import city_planning.household_member_employment_status.Household_member_employment_status;
import city_planning.household_member_health_statuses.Household_member_health_statuses;
import city_planning.household_member_licences.Household_member_licences;
import city_planning.household_member_medications.Household_member_medications;
import city_planning.household_member_prefered_works.Household_member_prefered_works;
import city_planning.household_member_skills.Household_member_skills;
import city_planning.household_member_vocational_experiences.Household_member_vocational_experiences;
import city_planning.household_member_work_experiences.Household_member_work_experiences;
import city_planning.household_members.Household_members;
import city_planning.households.Households;
import city_planning.households.Households.to_households;
import city_planning.houses.Houses;
import city_planning.houses.Houses.to_houses;
import city_planning.initialize_fields.Initialize_house_field_types;
import city_planning.initialize_fields.Initialize_household_field_types;
import city_planning.initialize_fields.Initialize_household_member_field_types;
import city_planning.initialize_fields.Initialize_search_record_field_types;
import city_planning.provinces.Dlg_provinces;
import city_planning.puroks.Dlg_puroks;
import city_planning.regions.Dlg_regions;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.Dlg_confirm_action;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
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
public class Dlg_search extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_search
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
    private Dlg_search(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_search(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_search() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_search myRef;

    private void setThisRef(Dlg_search myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_search> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_search create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_search create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_search dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search((java.awt.Frame) parent, false);
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
            Dlg_search dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_search((java.awt.Dialog) parent, false);
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

        Dlg_search dialog = Dlg_search.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_barangay1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lbl_barangay3 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        tf_region = new Field.Combo();
        tf_city = new Field.Combo();
        lbl_barangay2 = new javax.swing.JLabel();
        lbl_barangay4 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        tf_province = new Field.Combo();
        tf_barangay = new Field.Combo();
        tf_purok = new Field.Combo();
        jCheckBox5 = new javax.swing.JCheckBox();
        lbl_barangay6 = new javax.swing.JLabel();
        jButton3 = new Button.Primary();
        lbl_barangay5 = new javax.swing.JLabel();
        jTextField1 = new Field.Input();
        jButton2 = new Button.Default();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_household_members = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_barangay7 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        lbl_barangay8 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        tf_region1 = new Field.Combo();
        tf_city1 = new Field.Combo();
        lbl_barangay9 = new javax.swing.JLabel();
        lbl_barangay10 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        tf_province1 = new Field.Combo();
        tf_barangay1 = new Field.Combo();
        tf_purok1 = new Field.Combo();
        jCheckBox10 = new javax.swing.JCheckBox();
        lbl_barangay11 = new javax.swing.JLabel();
        jButton4 = new Button.Primary();
        lbl_barangay12 = new javax.swing.JLabel();
        jTextField2 = new Field.Input();
        jButton5 = new Button.Default();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_houses = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_barangay13 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        lbl_barangay14 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        tf_region2 = new Field.Combo();
        tf_city2 = new Field.Combo();
        lbl_barangay15 = new javax.swing.JLabel();
        lbl_barangay16 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        tf_province2 = new Field.Combo();
        tf_barangay2 = new Field.Combo();
        tf_purok2 = new Field.Combo();
        jCheckBox15 = new javax.swing.JCheckBox();
        lbl_barangay17 = new javax.swing.JLabel();
        jButton6 = new Button.Primary();
        lbl_barangay18 = new javax.swing.JLabel();
        jTextField3 = new Field.Input();
        jButton7 = new Button.Default();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_households = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbl_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay1.setText("Region:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");

        lbl_barangay3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay3.setText("City/Municipality:");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setText("All");

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

        lbl_barangay2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay2.setText("Province:");

        lbl_barangay4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay4.setText("Barangay:");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("All");

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("All");

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

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setText("All");

        lbl_barangay6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay6.setText("Purok:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        jButton3.setText("New [F1]");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl_barangay5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay5.setText("Search:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/tool.png"))); // NOI18N
        jButton2.setText("Go");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_barangay6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_region, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay2)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_city)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay4)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_barangay, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_province))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_purok))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_barangay5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(lbl_barangay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox4)
                        .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_barangay5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel3.setText("Status:");

        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOUSEHOLD MEMBERS", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbl_barangay7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay7.setText("Region:");

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("All");

        lbl_barangay8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay8.setText("City/Municipality:");

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox7.setText("All");

        tf_region1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_region1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_region1MouseClicked(evt);
            }
        });
        tf_region1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_region1ActionPerformed(evt);
            }
        });

        tf_city1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_city1MouseClicked(evt);
            }
        });
        tf_city1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_city1ActionPerformed(evt);
            }
        });

        lbl_barangay9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay9.setText("Province:");

        lbl_barangay10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay10.setText("Barangay:");

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox8.setText("All");

        jCheckBox9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox9.setText("All");

        tf_province1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_province1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_province1MouseClicked(evt);
            }
        });
        tf_province1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_province1ActionPerformed(evt);
            }
        });

        tf_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_barangay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangay1MouseClicked(evt);
            }
        });
        tf_barangay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_barangay1ActionPerformed(evt);
            }
        });

        tf_purok1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_purok1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_purok1MouseClicked(evt);
            }
        });
        tf_purok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purok1ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox10.setText("All");

        lbl_barangay11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay11.setText("Purok:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        jButton4.setText("New [F1]");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbl_barangay12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay12.setText("Search:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/tool.png"))); // NOI18N
        jButton5.setText("Go");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_barangay11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_region1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay9)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_city1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay10)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_barangay1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_province1))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_purok1))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbl_barangay12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6)
                    .addComponent(lbl_barangay9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_province1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_city1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox7))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox9)
                        .addComponent(tf_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_barangay12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tbl_houses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_houses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_housesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_houses);

        jLabel4.setText("No. of rows:");

        jLabel5.setText("0");

        jLabel6.setText("Status:");

        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOUSES", jPanel2);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lbl_barangay13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay13.setText("Region:");

        jCheckBox11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox11.setText("All");

        lbl_barangay14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay14.setText("City/Municipality:");

        jCheckBox12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox12.setText("All");

        tf_region2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_region2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_region2MouseClicked(evt);
            }
        });
        tf_region2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_region2ActionPerformed(evt);
            }
        });

        tf_city2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_city2MouseClicked(evt);
            }
        });
        tf_city2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_city2ActionPerformed(evt);
            }
        });

        lbl_barangay15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay15.setText("Province:");

        lbl_barangay16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay16.setText("Barangay:");

        jCheckBox13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox13.setText("All");

        jCheckBox14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox14.setText("All");

        tf_province2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_province2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_province2MouseClicked(evt);
            }
        });
        tf_province2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_province2ActionPerformed(evt);
            }
        });

        tf_barangay2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_barangay2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangay2MouseClicked(evt);
            }
        });
        tf_barangay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_barangay2ActionPerformed(evt);
            }
        });

        tf_purok2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_purok2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_purok2MouseClicked(evt);
            }
        });
        tf_purok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purok2ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox15.setText("All");

        lbl_barangay17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay17.setText("Purok:");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        jButton6.setText("New [F1]");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lbl_barangay18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay18.setText("Search:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/tool.png"))); // NOI18N
        jButton7.setText("Go");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_barangay17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_region2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay15)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_city2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_barangay16)))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_barangay2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jCheckBox13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_province2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_purok2))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbl_barangay18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11)
                    .addComponent(lbl_barangay15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_province2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_city2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox12))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barangay16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox14)
                        .addComponent(tf_barangay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_barangay18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        tbl_households.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_households.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_householdsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_households);

        jLabel7.setText("No. of rows:");

        jLabel8.setText("0");

        jLabel9.setText("Status:");

        jProgressBar3.setString("");
        jProgressBar3.setStringPainted(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOUSEHOLDS", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
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

    private void tf_regionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_regionMouseClicked
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionMouseClicked

    private void tf_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regionActionPerformed
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_provinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_provinceMouseClicked
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceMouseClicked

    private void tf_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_provinceActionPerformed
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceActionPerformed

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayMouseClicked

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_purokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purokMouseClicked
        Initialize_search_record_field_types.init_puroks(tf_purok, tf_region, tf_province, tf_city, tf_barangay);
    }//GEN-LAST:event_tf_purokMouseClicked

    private void tf_purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purokActionPerformed
        Initialize_search_record_field_types.init_puroks(tf_purok, tf_region, tf_province, tf_city, tf_barangay);
    }//GEN-LAST:event_tf_purokActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_new_household_member();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_household_members();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ret_household_members();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_household_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_membersMouseClicked
        select_household_member();
    }//GEN-LAST:event_tbl_household_membersMouseClicked

    private void tf_region1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_region1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_region1MouseClicked

    private void tf_region1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_region1ActionPerformed
        Initialize_search_record_field_types.init_regions(tf_region1);
    }//GEN-LAST:event_tf_region1ActionPerformed

    private void tf_city1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_city1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_city1MouseClicked

    private void tf_city1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_city1ActionPerformed
        Initialize_search_record_field_types.init_cities(tf_city1, tf_region1, tf_province1);
    }//GEN-LAST:event_tf_city1ActionPerformed

    private void tf_province1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_province1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_province1MouseClicked

    private void tf_province1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_province1ActionPerformed
        Initialize_search_record_field_types.init_provinces(tf_province1, tf_region1);
    }//GEN-LAST:event_tf_province1ActionPerformed

    private void tf_barangay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangay1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_barangay1MouseClicked

    private void tf_barangay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangay1ActionPerformed
        Initialize_search_record_field_types.init_barangays(tf_barangay1, tf_region1, tf_province1, tf_city1);
    }//GEN-LAST:event_tf_barangay1ActionPerformed

    private void tf_purok1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purok1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purok1MouseClicked

    private void tf_purok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purok1ActionPerformed
        Initialize_search_record_field_types.init_puroks(tf_purok1, tf_region1, tf_province1, tf_city1, tf_barangay1);
    }//GEN-LAST:event_tf_purok1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new_house();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        ret_houses();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbl_housesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_housesMouseClicked
        select_house();
    }//GEN-LAST:event_tbl_housesMouseClicked

    private void tf_region2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_region2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_region2MouseClicked

    private void tf_region2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_region2ActionPerformed
        Initialize_search_record_field_types.init_regions(tf_region2);
    }//GEN-LAST:event_tf_region2ActionPerformed

    private void tf_city2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_city2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_city2MouseClicked

    private void tf_city2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_city2ActionPerformed
        Initialize_search_record_field_types.init_cities(tf_city2, tf_region2, tf_province2);
    }//GEN-LAST:event_tf_city2ActionPerformed

    private void tf_province2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_province2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_province2MouseClicked

    private void tf_province2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_province2ActionPerformed
        Initialize_search_record_field_types.init_provinces(tf_province2, tf_region2);
    }//GEN-LAST:event_tf_province2ActionPerformed

    private void tf_barangay2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangay2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_barangay2MouseClicked

    private void tf_barangay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangay2ActionPerformed
        Initialize_search_record_field_types.init_barangays(tf_barangay2, tf_region2, tf_province2, tf_city2);
    }//GEN-LAST:event_tf_barangay2ActionPerformed

    private void tf_purok2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purok2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purok2MouseClicked

    private void tf_purok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purok2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purok2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new_household();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        ret_households();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ret_households();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tbl_householdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_householdsMouseClicked
        select_household();
    }//GEN-LAST:event_tbl_householdsMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ret_houses();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbl_barangay1;
    private javax.swing.JLabel lbl_barangay10;
    private javax.swing.JLabel lbl_barangay11;
    private javax.swing.JLabel lbl_barangay12;
    private javax.swing.JLabel lbl_barangay13;
    private javax.swing.JLabel lbl_barangay14;
    private javax.swing.JLabel lbl_barangay15;
    private javax.swing.JLabel lbl_barangay16;
    private javax.swing.JLabel lbl_barangay17;
    private javax.swing.JLabel lbl_barangay18;
    private javax.swing.JLabel lbl_barangay2;
    private javax.swing.JLabel lbl_barangay3;
    private javax.swing.JLabel lbl_barangay4;
    private javax.swing.JLabel lbl_barangay5;
    private javax.swing.JLabel lbl_barangay6;
    private javax.swing.JLabel lbl_barangay7;
    private javax.swing.JLabel lbl_barangay8;
    private javax.swing.JLabel lbl_barangay9;
    private javax.swing.JTable tbl_household_members;
    private javax.swing.JTable tbl_households;
    private javax.swing.JTable tbl_houses;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_barangay1;
    private javax.swing.JTextField tf_barangay2;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_city1;
    private javax.swing.JTextField tf_city2;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_province1;
    private javax.swing.JTextField tf_province2;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_purok1;
    private javax.swing.JTextField tf_purok2;
    private javax.swing.JTextField tf_region;
    private javax.swing.JTextField tf_region1;
    private javax.swing.JTextField tf_region2;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        ret_default_location();
        init_tbl_houses(tbl_houses);
        init_tbl_households(tbl_households);
        init_tbl_household_members(tbl_household_members);
        Initialize_house_field_types.ret_data();
        Initialize_household_field_types.ret_data();
        Initialize_search_record_field_types.ret_data();
        Initialize_household_member_field_types.ret_data();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jTextField1.grabFocus();
            }
        });
    }

    private void ret_default_location() {
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;

        Field.Combo reg2 = (Field.Combo) tf_region1;
        Field.Combo prov2 = (Field.Combo) tf_province1;
        Field.Combo cit2 = (Field.Combo) tf_city1;
        Field.Combo bar2 = (Field.Combo) tf_barangay1;

        Field.Combo reg3 = (Field.Combo) tf_region2;
        Field.Combo prov3 = (Field.Combo) tf_province2;
        Field.Combo cit3 = (Field.Combo) tf_city2;
        Field.Combo bar3 = (Field.Combo) tf_barangay2;

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

        reg2.setId("" + location.region_id);
        reg2.setText(location.region);
        prov2.setId("" + location.province_id);
        prov2.setText(location.province);
        cit2.setId("" + location.city_id);
        cit2.setText(location.city);
        bar2.setId("" + location.id);
        bar2.setText(location.barangay);

        reg3.setId("" + location.region_id);
        reg3.setText(location.region);
        prov3.setId("" + location.province_id);
        prov3.setText(location.province);
        cit3.setId("" + location.city_id);
        cit3.setText(location.city);
        bar3.setId("" + location.id);
        bar3.setText(location.barangay);
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
        JTextField[] tf_r = {tf_region, tf_region1, tf_region2};
        for (JTextField tf : tf_r) {
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_F1) {
                        regions();
                    }
                }
            });
        }

        JTextField[] tf_p = {tf_province, tf_province1, tf_province2};
        for (JTextField tf : tf_p) {
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_F1) {
                        provinces();
                    }
                }
            });
        }
        JTextField[] tf_c = {tf_city, tf_city1, tf_city2};
        for (JTextField tf : tf_c) {
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_F1) {
                        cities();
                    }
                }
            });
        }
        JTextField[] tf_b = {tf_barangay, tf_barangay1, tf_barangay2};
        for (JTextField tf : tf_b) {
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_F1) {
                        barangays();
                    }
                }
            });
        }
        JTextField[] tf_p1 = {tf_purok, tf_purok1, tf_purok2};
        for (JTextField tf : tf_p1) {
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_F1) {
                        puroks();
                    }
                }
            });
        }

    }

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" prompts ">
    private void regions() {
        Window p = (Window) this;
        Dlg_regions nd = Dlg_regions.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_regions.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_regions.OutputData data) {
                    Initialize_search_record_field_types.ret_data_regions();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void provinces() {
        Window p = (Window) this;
        Dlg_provinces nd = Dlg_provinces.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_provinces.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_provinces.OutputData data) {
                Initialize_search_record_field_types.ret_data_provinces();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void cities() {
        Window p = (Window) this;
        Dlg_cities nd = Dlg_cities.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_cities.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cities.OutputData data) {
                closeDialog.ok();
                Initialize_search_record_field_types.ret_data_cities();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void barangays() {
        Window p = (Window) this;
        Dlg_barangays nd = Dlg_barangays.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_barangays.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_barangays.OutputData data) {
                closeDialog.ok();
                Initialize_search_record_field_types.ret_data_barangays();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void puroks() {
        Window p = (Window) this;
        Dlg_puroks nd = Dlg_puroks.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_puroks.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_puroks.OutputData data) {
                closeDialog.ok();
                Initialize_search_record_field_types.ret_data_puroks();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" household_members ">
    public static ArrayListModel tbl_household_members_ALM;
    public static Tblhousehold_membersModel tbl_household_members_M;

    public static void init_tbl_household_members(JTable tbl_household_members) {
        tbl_household_members_ALM = new ArrayListModel();
        tbl_household_members_M = new Tblhousehold_membersModel(tbl_household_members_ALM);
        tbl_household_members.setModel(tbl_household_members_M);
        tbl_household_members.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_members.setRowHeight(25);
        int[] tbl_widths_household_members = {150, 100, 150, 150, 100, 100, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    public static void loadData_household_members(List<Household_members.to_household_members> acc) {
        tbl_household_members_ALM.clear();
        tbl_household_members_ALM.addAll(acc);
    }

    public static class Tblhousehold_membersModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Member No", "Name", "Barangay", "City", "House No", "Household No", "", "", "", "", "", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "household_member_no", "fname", "mname", "lname", "sname", "gender", "marital_status", "bday", "occupancy_years", "height", "weight", "birth_place", "present_address", "relation_to_household", "religion", "citizenship", "email_address", "blood_type", "languages_spoken", "is_registered_voter", "voters_id_no"
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
            Household_members.to_household_members tt = (Household_members.to_household_members) getRow(row);
            switch (col) {
                case 0:
                    if (tt.household_member_no.isEmpty()) {
                        return " " + tt.transient_no;
                    } else {
                        return " " + tt.household_member_no;
                    }

                case 1:
                    return " " + tt.lname + " " + tt.sname + ", " + tt.fname + " " + tt.mname;
                case 2:
                    return " " + tt.barangay;
                case 3:
                    return " " + tt.city;
                case 4:
                    return " " + tt.house_no;
                case 5:
                    return " " + tt.household_no;
                case 6:
                    return " Edit";
                case 7:
                    return " Delete";
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
        where = where + " and concat(lname,space(1),fname) like '%" + jTextField1.getText() + "%' ";
        where = where + " order by lname,fname asc ";
        System.out.println(where);
        List<Household_members.to_household_members> household_members = Household_members.ret_data(where);
        loadData_household_members(household_members);
        jLabel2.setText("" + household_members.size());
    }

    private void add_new_household_member() {
        Field.Combo re = (Field.Combo) tf_region;
        Field.Combo pr = (Field.Combo) tf_province;
        Field.Combo ci = (Field.Combo) tf_city;
        Field.Combo ba = (Field.Combo) tf_barangay;
        Field.Combo pu = (Field.Combo) tf_purok;
        Household_members.to_household_members household_member = new Household_members.to_household_members(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, "", "");

        String region = re.getText();
        String region_id = re.getId();
        String province = pr.getText();
        String province_id = pr.getId();
        String city = ci.getText();
        String city_id = ci.getId();
        String barangay = ba.getText();
        String barangay_id = ba.getId();
        String purok = pu.getText();
        String purok_id = pu.getId();
        Window p = (Window) this;
        Dlg_household_members nd = Dlg_household_members.create(p, true);
        nd.setTitle("");
        nd.do_pass_new(region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, household_member);
        nd.setCallback(new Dlg_household_members.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_household_members.OutputData data) {
                closeDialog.ok();
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
                int status = 1;
                String house_no = data.house_no;
                String household_no = data.household_no;

                String fname = data.fname;
                String mname = data.mname;
                String lname = data.lname;
                String sname = data.sname;
                String gender = data.gender;
                String marital_status = data.marital_status;
                String bday = data.bday;
                double occupancy_years = data.occupancy_years;
                String height = data.height;
                String weight = data.weight;
                String birth_place = data.birth_place;
                String present_address = data.present_address;
                String relation_to_household = data.relation_to_household;
                String religion = data.religion;
                String citizenship = data.citizenship;
                String email_address = data.email_address;
                String blood_type = data.blood_type;
                String languages_spoken = data.languages_spoken;
                int is_registered_voter = data.is_registered_voter;
                String voters_id_no = data.voters_id_no;
                List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = data.health_statuses;
                List<Household_member_medications.to_household_member_medications> health_medications = data.health_medications;
                List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = data.educational_backgrounds;
                List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = data.vocational_experiences;
                List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = data.competence_certificates;
                List<Household_member_licences.to_household_member_licenses> licenses = data.licenses;
                List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences = data.work_experience;
                List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = data.prefered_works;
                Household_member_employment_status.to_household_member_employment_status employment_status = data.employment_status;
                Household_member_skills.to_household_member_skills skills = data.skills;
                String image = data.image;

                String household_member_no = data.household_member_no;
                String transient_no = Household_members.increment_id();
                String where = " where transient_no='" + transient_no + "'";
                List<Household_members.to_household_members> datas = Household_members.ret_data(where);
                if (!datas.isEmpty()) {
                    Alert.set(0, "Duplicate TR Entry, Try Again!");
                    return;
                }
                Household_members.to_household_members household_member = new Household_members.to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experiences, prefered_works, employment_status, skills, image, transient_no);
                Household_members.add_data(household_member);

                Initialize_table_household_members.tbl_household_member_work_experiences_ALM.clear();
                Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.clear();
                Initialize_table_household_members.tbl_household_member_prefered_works_ALM.clear();
                Initialize_table_household_members.tbl_household_member_medications_ALM.clear();
                Initialize_table_household_members.tbl_household_member_licenses_ALM.clear();
                Initialize_table_household_members.tbl_household_member_health_statuses_ALM.clear();
                Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.clear();
                Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.clear();
                Alert.set(1, "");
                ret_household_members();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_household_member() {
        int row = tbl_household_members.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_members.to_household_members household_member = (Household_members.to_household_members) tbl_household_members_ALM.get(row);
        String where = " where transient_no='" + household_member.transient_no + "' ";
        List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = Household_member_health_statuses.ret_data(where);
        List<Household_member_medications.to_household_member_medications> health_medications = Household_member_medications.ret_data(where);
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = Household_member_educational_backgrounds.ret_data(where);
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = Household_member_vocational_experiences.ret_data(where);
        List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = Household_member_competence_certificates.ret_data(where);
        List<Household_member_licences.to_household_member_licenses> licenses = Household_member_licences.ret_data(where);
        List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences = Household_member_work_experiences.ret_data(where);
        List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = Household_member_prefered_works.ret_data(where);
        Household_member_employment_status.to_household_member_employment_status employment_status = null;
        Household_member_skills.to_household_member_skills skills = null;
        List<Household_member_employment_status.to_household_member_employment_status> l_es = Household_member_employment_status.ret_data(where);
        if (!l_es.isEmpty()) {
            employment_status = l_es.get(0);
        }
        List<Household_member_skills.to_household_member_skills> l_s = Household_member_skills.ret_data(where);
        if (!l_s.isEmpty()) {
            skills = l_s.get(0);
        }
        household_member.setHealth_statuses(health_statuses);
        household_member.setHealth_medications(health_medications);
        household_member.setEducational_backgrounds(educational_backgrounds);
        household_member.setVocational_experiences(vocational_experiences);
        household_member.setCompetence_certificates(competence_certificates);
        household_member.setLicenses(licenses);
        household_member.setWork_experiences(work_experiences);
        household_member.setPrefered_works(prefered_works);
        household_member.setEmployment_status(employment_status);
        household_member.setSkills(skills);

        int col = tbl_household_members.getSelectedColumn();
        if (col == 6) {
            //edit
            Window p = (Window) this;
            Dlg_household_members nd = Dlg_household_members.create(p, true);
            nd.setTitle("");
            nd.do_pass(household_member);
            nd.setCallback(new Dlg_household_members.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_household_members.OutputData data) {
                    closeDialog.ok();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 7) {
            //delete
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Household_members.delete_household_member(household_member);
                    Alert.set(3, "");
                    ret_household_members();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" houses ">
    public static ArrayListModel tbl_houses_ALM;
    public static TblhousesModel tbl_houses_M;

    public static void init_tbl_houses(JTable tbl_houses) {
        tbl_houses_ALM = new ArrayListModel();
        tbl_houses_M = new TblhousesModel(tbl_houses_ALM);
        tbl_houses.setModel(tbl_houses_M);
        tbl_houses.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_houses.setRowHeight(25);
        int[] tbl_widths_houses = {120, 100, 100, 80, 80, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_houses.length; i < n; i++) {
            if (i == 1 || i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_houses, i, tbl_widths_houses[i]);
        }
        Dimension d = tbl_houses.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_houses.getTableHeader().setPreferredSize(d);
        tbl_houses.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_houses.setRowHeight(25);
        tbl_houses.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_houses(List<to_houses> acc) {
        tbl_houses_ALM.clear();
        tbl_houses_ALM.addAll(acc);
    }

    public static class TblhousesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "House No", "Barangay", "City", "Households", "Members", "", "", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "no_of_rooms", "bldg_types", "bldg_permit", "toilet_types", "compartments", "bathroom_types", "waste_disposal_methods", "kitchen_types", "trans_types", "construction_roof_types", "construction_wall_types", "construction_floor_types", "construction_communication_types", "lighting_fuels", "cooking_fuels", "water_sources", "drinking_water_source_distance", "nearest_water_source_distance", "latitude", "longtitude"
        };

        public TblhousesModel(ListModel listmodel) {
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
            to_houses tt = (to_houses) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.house_no;
                case 1:
                    return " " + tt.barangay;
                case 2:
                    return " " + tt.city;
                case 3:
                    return " " + tt.no_of_households;
                case 4:
                    return " " + tt.no_of_household_members;
                case 5:
                    return " Edit";
                case 6:
                    return " Delete";
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
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
                    return tt.no_of_rooms;
                case 18:
                    return tt.bldg_types;
                case 19:
                    return tt.bldg_permit;
                case 20:
                    return tt.toilet_types;
                case 21:
                    return tt.compartments;
                case 22:
                    return tt.bathroom_types;
                case 23:
                    return tt.waste_disposal_methods;
                case 24:
                    return tt.kitchen_types;
                case 25:
                    return tt.trans_types;
                case 26:
                    return tt.construction_roof_types;
                case 27:
                    return tt.construction_wall_types;
                case 28:
                    return tt.construction_floor_types;
                case 29:
                    return tt.construction_communication_types;
                case 30:
                    return tt.lighting_fuels;
                case 31:
                    return tt.cooking_fuels;
                case 32:
                    return tt.water_sources;
                case 33:
                    return tt.drinking_water_source_distance;
                case 34:
                    return tt.nearest_water_source_distance;
                case 35:
                    return tt.latitude;
                default:
                    return tt.longtitude;
            }
        }
    }

    private void ret_houses() {
        Field.Combo reg = (Field.Combo) tf_region1;
        Field.Combo prov = (Field.Combo) tf_province1;
        Field.Combo cit = (Field.Combo) tf_city1;
        Field.Combo bar = (Field.Combo) tf_barangay1;
        Field.Combo pur = (Field.Combo) tf_purok1;

        String where = " where bldg_types like '%" + "" + "%' ";
        if (!jCheckBox6.isSelected()) {
            where = where + " and region like '%" + reg.getText() + "%' ";
        }

        if (!jCheckBox8.isSelected()) {
            where = where + " and province like '%" + prov.getText() + "%' ";
        }

        if (!jCheckBox7.isSelected()) {
            where = where + " and city like '%" + cit.getText() + "%' ";
        }

        if (!jCheckBox9.isSelected()) {
            where = where + " and barangay like '%" + bar.getText() + "%' ";
        }

        if (!jCheckBox10.isSelected()) {
            where = where + " and purok like '%" + pur.getText() + "%' ";
        }
        where = where + " and house_no like '%" + jTextField2.getText() + "%' ";
        where = where + " order by house_no asc ";
        System.out.println(where);
        List<to_houses> houses = Houses.ret_data(where);
        loadData_houses(houses);
        jLabel5.setText("" + houses.size());
    }

    private void new_house() {
        Field.Combo re = (Field.Combo) tf_region;
        Field.Combo pr = (Field.Combo) tf_province;
        Field.Combo ci = (Field.Combo) tf_city;
        Field.Combo ba = (Field.Combo) tf_barangay;
        Field.Combo pu = (Field.Combo) tf_purok;

        Houses.to_houses house = new Houses.to_houses(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, 0, new ArrayList(), "", "", 0, 0);

        String region = re.getText();
        String region_id = re.getId();
        String province = pr.getText();
        String province_id = pr.getId();
        String city = ci.getText();
        String city_id = ci.getId();
        String barangay = ba.getText();
        String barangay_id = ba.getId();
        String purok = pu.getText();
        String purok_id = pu.getId();

        Window p = (Window) this;
        Dlg_house nd = Dlg_house.create(p, true);
        nd.setTitle("");
        nd.do_pass_new(region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, house);
        nd.setCallback(new Dlg_house.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_house.OutputData data) {
                closeDialog.ok();
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
                String where = " where house_no='" + house_no + "' ";
                List<Houses.to_houses> datas = Houses.ret_data(where);
                if (!datas.isEmpty()) {
                    Alert.set(0, "Duplicate House No, Retry!");
                    return;
                }
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
                String latitude = data.latitude;
                String longtitude = data.longtitude;
                int no_of_households = 0;
                int no_of_household_members = 0;
                final Houses.to_houses house = new Houses.to_houses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance, households, latitude, longtitude, no_of_households, no_of_household_members);
                jProgressBar2.setString("Loading...Please wait...");
                jProgressBar2.setIndeterminate(true);
                jButton4.setEnabled(false);
                Houses.add_data(house);
                Alert.set(1, "");
                ret_houses();
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
                jButton4.setEnabled(true);

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_house() {
        int row = tbl_houses.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_houses house = (to_houses) tbl_houses_ALM.get(row);
        int col = tbl_houses.getSelectedColumn();
        if (col == 5) {
            //edit
            Window p = (Window) this;
            Dlg_house nd = Dlg_house.create(p, true);
            nd.setTitle("");
            nd.do_pass(house);
            nd.setCallback(new Dlg_house.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_house.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {
            //delete
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    jProgressBar2.setString("Loading...Please wait...");
                    jProgressBar2.setIndeterminate(true);
                    jButton4.setEnabled(false);
                    Houses.delete_data(house);
                    Alert.set(3, "");
                    ret_houses();
                    jProgressBar2.setString("Finished...");
                    jProgressBar2.setIndeterminate(false);
                    jButton4.setEnabled(true);
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" households "> 
    public static ArrayListModel tbl_households_ALM;
    public static TblhouseholdsModel tbl_households_M;

    public static void init_tbl_households(JTable tbl_households) {
        tbl_households_ALM = new ArrayListModel();
        tbl_households_M = new TblhouseholdsModel(tbl_households_ALM);
        tbl_households.setModel(tbl_households_M);
        tbl_households.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_households.setRowHeight(25);
        int[] tbl_widths_households = {120, 100, 100, 80, 0, 50, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_households.length; i < n; i++) {
            if (i == 1 || i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_households, i, tbl_widths_households[i]);
        }
        Dimension d = tbl_households.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_households.getTableHeader().setPreferredSize(d);
        tbl_households.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_households.setRowHeight(25);
        tbl_households.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_households(List<to_households> acc) {
        tbl_households_ALM.clear();
        tbl_households_ALM.addAll(acc);
    }

    public static class TblhouseholdsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "House No", "Barangay", "City", "Members", "", "", "", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "house_no", "household_no", "occupancy_types", "tenure", "is_occupant_owns_the_land", "is_occupant_owns_the_bldg", "monthly_rental", "drainage_system_concern", "street_maintenance_concern", "garbage_collection_concern", "fire_protection_concern", "police_protection_concern", "ambulance_service_concern", "livelihood_programs_concern", "adolescent_pregnancy_rate", "child_abuse_rating", "crime_rating", "domestic_violence_rating", "drug_abuse_rating", "hunger_rating", "environmental_contamination_rating", "health_disparities_rating"
        };

        public TblhouseholdsModel(ListModel listmodel) {
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
            to_households tt = (to_households) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.household_no;
                case 1:
                    return " " + tt.barangay;
                case 2:
                    return " " + tt.city;
                case 3:
                    return " " + tt.no_of_household_members;
                case 4:
                    return " Edit";
                case 5:
                    return " Edit";
                case 6:
                    return " Delete";
                case 7:
                    return tt.province;
                case 8:
                    return tt.province_id;
                case 9:
                    return tt.city;
                case 10:
                    return tt.city_id;
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
                    return tt.occupancy_types;
                case 19:
                    return tt.tenure;
                case 20:
                    return tt.is_occupant_owns_the_land;
                case 21:
                    return tt.is_occupant_owns_the_bldg;
                case 22:
                    return tt.monthly_rental;
                case 23:
                    return tt.drainage_system_concern;
                case 24:
                    return tt.street_maintenance_concern;
                case 25:
                    return tt.garbage_collection_concern;
                case 26:
                    return tt.fire_protection_concern;
                case 27:
                    return tt.police_protection_concern;
                case 28:
                    return tt.ambulance_service_concern;
                case 29:
                    return tt.livelihood_programs_concern;
                case 30:
                    return tt.adolescent_pregnancy_rate;
                case 31:
                    return tt.child_abuse_rating;
                case 32:
                    return tt.crime_rating;
                case 33:
                    return tt.domestic_violence_rating;
                case 34:
                    return tt.drug_abuse_rating;
                case 35:
                    return tt.hunger_rating;
                case 36:
                    return tt.environmental_contamination_rating;
                default:
                    return tt.health_disparities_rating;
            }
        }
    }

    private void ret_households() {
        Field.Combo reg = (Field.Combo) tf_region2;
        Field.Combo prov = (Field.Combo) tf_province2;
        Field.Combo cit = (Field.Combo) tf_city2;
        Field.Combo bar = (Field.Combo) tf_barangay2;
        Field.Combo pur = (Field.Combo) tf_purok2;

        String where = " where tenure like '%" + "" + "%' ";
        if (!jCheckBox11.isSelected()) {
            where = where + " and region like '%" + reg.getText() + "%' ";
        }

        if (!jCheckBox13.isSelected()) {
            where = where + " and province like '%" + prov.getText() + "%' ";
        }

        if (!jCheckBox12.isSelected()) {
            where = where + " and city like '%" + cit.getText() + "%' ";
        }

        if (!jCheckBox14.isSelected()) {
            where = where + " and barangay like '%" + bar.getText() + "%' ";
        }

        if (!jCheckBox15.isSelected()) {
            where = where + " and purok like '%" + pur.getText() + "%' ";
        }
        where = where + " and household_no like '%" + jTextField3.getText() + "%' ";
        where = where + " order by household_no asc ";
        System.out.println(where);
        List<Households.to_households> houses = Households.ret_data(where);
        loadData_households(houses);
        jLabel8.setText("" + houses.size());
    }

    private void new_household() {
        Window p = (Window) this;
        Dlg_households nd = Dlg_households.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_households.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_households.OutputData data) {
                closeDialog.ok();
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
                String household_no = data.household_no;
                String where = " where household_no='" + household_no + "' limit 1";
                List<Households.to_households> datas = Households.ret_data(where);
                if (!datas.isEmpty()) {
                    Alert.set(0, "Duplicate Household No, Retry!");
                    return;
                }
                String occupancy_types = data.occupancy_types;
                String tenure = data.tenure;
                int is_occupant_owns_the_land = data.is_occupant_owns_the_land;
                int is_occupant_owns_the_bldg = data.is_occupant_owns_the_bldg;
                double monthly_rental = data.monthly_rental;
                String drainage_system_concern = data.drainage_system_concern;
                String street_maintenance_concern = data.street_maintenance_concern;
                String garbage_collection_concern = data.garbage_collection_concern;
                String fire_protection_concern = data.fire_protection_concern;
                String police_protection_concern = data.police_protection_concern;
                String ambulance_service_concern = data.ambulance_service_concern;
                String livelihood_programs_concern = data.livelihood_programs_concern;
                String adolescent_pregnancy_rate = data.adolescent_pregnancy_rate;
                String child_abuse_rating = data.child_abuse_rating;
                String crime_rating = data.crime_rating;
                String domestic_violence_rating = data.domestic_violence_rating;
                String drug_abuse_rating = data.drug_abuse_rating;
                String hunger_rating = data.hunger_rating;
                String environmental_contamination_rating = data.environmental_contamination_rating;
                String health_disparities_rating = data.health_disparities_rating;
                List<Household_assets.to_household_assets> assets = data.assets;
                List<Household_expenditures.to_household_expenditures> household_expenditures = data.household_expenditures;
                List<Household_consumptions.to_household_consumptions> household_consumptions = data.household_consumptions;
                List<Household_members.to_household_members> household_members = data.household_members;
                int no_of_household_members = 0;
                Households.to_households household = new to_households(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, occupancy_types, tenure, is_occupant_owns_the_land, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating, assets, household_expenditures, household_consumptions, household_members, no_of_household_members);
                jProgressBar3.setString("Loading...Please wait...");
                jProgressBar3.setIndeterminate(true);
                jButton6.setEnabled(false);
                Households.add_data(household);
                Alert.set(1, "");
                ret_households();
                jProgressBar3.setString("Finished...");
                jProgressBar3.setIndeterminate(false);
                jButton6.setEnabled(true);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_household() {
        int row = tbl_households.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Households.to_households household = (Households.to_households) tbl_households_ALM.get(row);
        int col = tbl_households.getSelectedColumn();
        if (col == 5) {
            //edit
            Window p = (Window) this;
            Dlg_households nd = Dlg_households.create(p, true);
            nd.setTitle("");
            nd.do_pass(household);
            nd.setCallback(new Dlg_households.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_households.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {
            //delete
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    jProgressBar3.setString("Loading...Please wait...");
                    jProgressBar3.setIndeterminate(true);
                    jButton6.setEnabled(false);
                    Households.delete_data(household);
                    Alert.set(3, "");
                    ret_households();
                    jProgressBar3.setString("Finished...");
                    jProgressBar3.setIndeterminate(false);
                    jButton6.setEnabled(true);
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 

}
