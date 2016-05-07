/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.collections;

import city_planning.barangays.Barangays;
import city_planning.collections.Collections.to_collections;
import city_planning.household_members.Household_members;
import city_planning.reports.Dlg_report_barangay_clearance;
import city_planning.reports.Dlg_report_barangay_permit;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.Dlg_confirm_action_for_report;
import city_planning.util.TableRenderer;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
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
public class Dlg_collections extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_collection
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
    private Dlg_collections(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_collections(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_collections() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_collections myRef;

    private void setThisRef(Dlg_collections myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_collections> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_collections create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_collections create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_collections dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_collections((java.awt.Frame) parent, false);
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
            Dlg_collections dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_collections((java.awt.Dialog) parent, false);
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

        Dlg_collections dialog = Dlg_collections.create(new javax.swing.JFrame(), true);
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

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new Field.Search();
        jTextField2 = new Field.Combo();
        jTextField3 = new Field.Combo();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new Button.Print();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_collections = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton5 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Purpose:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Due:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cash:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("0.00");
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Release");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Change:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setText("0.00");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Fixed?");
        jCheckBox3.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Transaction No:");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setFocusable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 287, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3))
                    .addComponent(jTextField9))
                .addGap(91, 91, 91))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ISSUANCE", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date from:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("To:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Type:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Name:");

        tbl_collections.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_collections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_collectionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_collections);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("ALL");

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser3.setDate(new Date());

        jDateChooser4.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser4.setDate(new Date());

        jLabel11.setText("No. of rows:");

        jLabel12.setText("0");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("ALL");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/tool.png"))); // NOI18N
        jButton5.setText("Go");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6))
                            .addComponent(jTextField7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(15, 15, 15))
        );

        jTabbedPane2.addTab("REPORTS", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ret_collections();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        ret_collections();
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_collection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_household_members();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_collection_types();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        init_collection_types();
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_collection_purposes();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        init_collection_purposes();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        compute();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        add_collection();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void tbl_collectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_collectionsMouseClicked
        select_collection();
    }//GEN-LAST:event_tbl_collectionsMouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tbl_collections;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        ret_default_location();
        init_collection_no();
        init_tbl_collections(tbl_collections);

        String where = "";
        collection_types = Collection_types.ret_data(where);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jTextField1.grabFocus();
            }
        });
    }
    String my_region = "";
    String my_region_id = "";
    String my_province = "";
    String my_province_id = "";
    String my_city = "";
    String my_city_id = "";
    String my_barangay = "";
    String my_barangay_id = "";
    String my_purok = "";
    String my_purok_id = "";

    private void ret_default_location() {

        String where = " where is_default=1";
        List<Barangays.to_barangays> datas = Barangays.ret_data(where);
        Barangays.to_barangays location = datas.get(0);
        my_region = location.region;
        my_region_id = "" + location.region_id;
        my_province = location.province;
        my_province_id = "" + location.province_id;
        my_city = location.city;
        my_city_id = "" + location.city_id;
        my_barangay = location.barangay;
        my_barangay_id = "" + location.id;

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
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" collections "> 
    public static ArrayListModel tbl_collections_ALM;
    public static TblcollectionsModel tbl_collections_M;

    public static void init_tbl_collections(JTable tbl_collections) {
        tbl_collections_ALM = new ArrayListModel();
        tbl_collections_M = new TblcollectionsModel(tbl_collections_ALM);
        tbl_collections.setModel(tbl_collections_M);
        tbl_collections.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_collections.setRowHeight(25);
        int[] tbl_widths_collections = {100, 100, 100, 80, 80, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_collections.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_collections, i, tbl_widths_collections[i]);
        }
        Dimension d = tbl_collections.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_collections.getTableHeader().setPreferredSize(d);
        tbl_collections.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_collections.setRowHeight(25);
        tbl_collections.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_collections, 3);
    }

    public static void loadData_collections(List<to_collections> acc) {
        tbl_collections_ALM.clear();
        tbl_collections_ALM.addAll(acc);
    }

    public static class TblcollectionsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Transaction_no", "Date", "Name", "Amount", "Status", "", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "citizen", "citizen_id", "house_no", "household_no", "household_member_no", "transient_no", "issuance_type", "issuance_type_id", "purpose", "is_fixed", "amount_due", "amount_tendered"
        };

        public TblcollectionsModel(ListModel listmodel) {
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
            to_collections tt = (to_collections) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.collection_no;
                case 1:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 2:
                    return " " + tt.citizen;
                case 3:
                    return tt.amount_due + " ";
                case 4:
                    if (tt.status == 1) {
                        return " Counted";
                    } else {
                        return " Void";
                    }
                case 5:
                    return " Print";
                case 6:
                    return tt.region;
                case 7:
                    return tt.region_id;
                case 8:
                    return tt.province;
                case 9:
                    return tt.province_id;
                case 10:
                    return tt.city;
                case 11:
                    return tt.city_id;
                case 12:
                    return tt.barangay;
                case 13:
                    return tt.barangay_id;
                case 14:
                    return tt.purok;
                case 15:
                    return tt.purok_id;
                case 16:
                    return tt.status;
                case 17:
                    return tt.citizen;
                case 18:
                    return tt.citizen_id;
                case 19:
                    return tt.house_no;
                case 20:
                    return tt.household_no;
                case 21:
                    return tt.household_member_no;
                case 22:
                    return tt.transient_no;
                case 23:
                    return tt.issuance_type;
                case 24:
                    return tt.issuance_type_id;
                case 25:
                    return tt.purpose;
                case 26:
                    return tt.is_fixed;
                case 27:
                    return tt.amount_due;
                default:
                    return tt.amount_tendered;
            }
        }
    }

    private void ret_collections() {
        String where = "";
        List<to_collections> collections = Collections.ret_data(where);
        loadData_collections(collections);
        jLabel12.setText("" + collections.size());
    }

    private void init_collection_no() {
        String collection_no = Collections.increment_id();
        jTextField9.setText(collection_no);
    }

    private void add_collection() {
        Field.Combo iss = (Field.Combo) jTextField2;
        Field.Search citiz = (Field.Search) jTextField1;
        String issuance_type = iss.getText();
        String issuance_type_id = iss.getId();
        String citizen = citiz.getText();
        String citizen_id = citiz.getId();
        if (citizen_id == null) {
            Alert.set(0, "Choose Citizen!");
            return;
        }
        if (issuance_type.isEmpty() || issuance_type == null) {
            Alert.set(0, "Choose Type of Clearance!");
            jTextField2.grabFocus();
            return;
        }
        if (jTextField3.getText().isEmpty() && issuance_type_id.equalsIgnoreCase("1")) {
            Alert.set(0, "Input Purpose!");
            return;
        }
        if (issuance_type.contains(issuance_type)) {
            Alert.set(0, "Insufficient Amount!");
            jTextField5.grabFocus();
            return;
        }
        double amount_due = FitIn.toDouble(jTextField4.getText());
        double tendered = FitIn.toDouble(jTextField5.getText());
        double change = tendered - amount_due;
        if (change < 0) {
            if (issuance_type.equals("BARANGAY PERMIT") || (jCheckBox3.isSelected())) {
                Alert.set(0, "Insufficient Amount!");
                jTextField5.grabFocus();
                return;
            }
        }

        int id = 0;
        String collection_no = Collections.increment_id();
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();
        String region = my_region;
        String region_id = my_region_id;
        String province = my_province;
        String province_id = my_province_id;
        String city = my_city;
        String city_id = my_city_id;
        String barangay = my_barangay;
        String barangay_id = my_barangay_id;
        String purok = my_purok;
        String purok_id = my_purok_id;
        int status = 1;

        String house_no = "";
        String household_no = "";
        String household_member_no = "";
        String transient_no = "";

        String purpose = jTextField3.getText();
        int is_fixed = 0;
        if (jCheckBox3.isSelected()) {
            is_fixed = 1;
        }

        Collections.to_collections collection = new to_collections(id, collection_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, citizen, citizen_id, house_no, household_no, household_member_no, transient_no, issuance_type, issuance_type_id, purpose, is_fixed, amount_due, tendered);
        Collections.add_data(collection);
        clear_fields();
        Alert.set(1, "");
        ret_collections();
        init_collection_no();
        if (collection.issuance_type_id.equals("1")) {
            Window p = (Window) this;
            Dlg_report_barangay_clearance nd = Dlg_report_barangay_clearance.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_report_barangay_clearance.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_report_barangay_clearance.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (collection.issuance_type_id.equals("2")) {
            Window p = (Window) this;
            Dlg_report_barangay_permit nd = Dlg_report_barangay_permit.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_report_barangay_permit.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_report_barangay_permit.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
//</editor-fold> 

    private void init_household_members() {
        final Field.Search tf = (Field.Search) jTextField1;

        String where = " where concat(fname,space(1),lname) like '%" + tf.getText() + "%' "
                + " or concat(lname,space(1),fname) like '%" + tf.getText() + "%' "
                + " order by lname asc ";
        final List<Household_members.to_household_members> members = Household_members.ret_data(where);

        Object[][] obj = new Object[members.size()][1];
        int i = 0;
        for (Household_members.to_household_members to : members) {
            obj[i][0] = " " + to.lname + ", " + to.fname + " " + to.mname;
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
                Household_members.to_household_members to = members.get(data.selected_row);
                tf.setText(to.lname + ", " + to.fname + " " + to.mname);
                tf.setId(to.transient_no);
                jTextField2.grabFocus();

            }
        });
    }
    List<Collection_types.to_collection_types> collection_types = new ArrayList();

    private void init_collection_types() {
        final Field.Combo tf = (Field.Combo) jTextField2;

        Object[][] obj = new Object[collection_types.size()][1];
        int i = 0;
        for (Collection_types.to_collection_types to : collection_types) {
            obj[i][0] = " " + to.collection_type;
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
                Collection_types.to_collection_types to = collection_types.get(data.selected_row);
                tf.setText(to.collection_type);
                tf.setId("" + to.id);
                if (to.is_fixed == 0) {
                    jCheckBox3.setSelected(false);
                } else {
                    jCheckBox3.setSelected(true);
                }
                jTextField4.setText(FitIn.fmt_wc_0(to.amount_due));

                jTextField3.grabFocus();

            }
        });
    }

    private void init_collection_purposes() {
        final Field.Combo tf = (Field.Combo) jTextField3;
        String where = "";
        final List<Collection_purposes.to_collection_purposes> collection_purposes = Collection_purposes.ret_data(where);
        Object[][] obj = new Object[collection_purposes.size()][1];
        int i = 0;
        for (Collection_purposes.to_collection_purposes to : collection_purposes) {
            obj[i][0] = " " + to.purpose;
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
                Collection_purposes.to_collection_purposes to = collection_purposes.get(data.selected_row);
                tf.setText(to.purpose);
                jTextField5.grabFocus();
            }
        });
    }

    private void compute() {
        double amount_due = FitIn.toDouble(jTextField4.getText());
        double tendered = FitIn.toDouble(jTextField5.getText());
        double change = tendered - amount_due;
        jTextField8.setText(FitIn.fmt_wc_0(change));
    }

    private void clear_fields() {
        Field.Search citiz = (Field.Search) jTextField1;
        citiz.setText("");
        citiz.setId(null);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField3.setText("");
        jTextField4.setText("0.00");
        jTextField5.setText("");
        jTextField8.setText("0.00");
    }

    private void select_collection() {
        int row = tbl_collections.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_collections.getSelectedColumn();
        final Collections.to_collections collection = (Collections.to_collections) tbl_collections_ALM.get(row);
        if (collection.status == 0) {
            Alert.set(0, "Cannot proceed, transaction already cancelled!");
            return;
        }

        if (col == 4) {
            //void
            Window p = (Window) this;
            Dlg_confirm_action_for_report nd = Dlg_confirm_action_for_report.create(p, true);
            nd.setTitle("");
            nd.do_pass();
            nd.setCallback(new Dlg_confirm_action_for_report.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action_for_report.OutputData data) {
                    closeDialog.ok();
                    Collections.update_collection(collection);
                    ret_collections();
                    Alert.set(0, "Transaction Cancelled!");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 5) {
            //print
            if (collection.issuance_type_id.equals("1")) {
                Window p = (Window) this;
                Dlg_report_barangay_clearance nd = Dlg_report_barangay_clearance.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_report_barangay_clearance.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_report_barangay_clearance.OutputData data) {
                        closeDialog.ok();

                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
            if (collection.issuance_type_id.equals("2")) {
                Window p = (Window) this;
                Dlg_report_barangay_permit nd = Dlg_report_barangay_permit.create(p, true);
                nd.setTitle("");
                nd.do_pass();
                nd.setCallback(new Dlg_report_barangay_permit.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_report_barangay_permit.OutputData data) {
                        closeDialog.ok();

                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }
        }
    }
}
