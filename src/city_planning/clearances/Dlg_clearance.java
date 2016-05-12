/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.clearances;

import city_planning.barangay_clearances.Barangay_clearances;
import city_planning.barangay_clearances.Barangay_clearances.to_barangay_clearances;
import city_planning.barangay_clearances.Dlg_report_barangay_clearance;
import city_planning.barangays.Barangays;
import city_planning.business_clearances.Business_clearance_applicants;
import city_planning.business_clearances.Business_clearance_locations;
import city_planning.business_clearances.Business_clearances;
import city_planning.business_clearances.Business_clearances.to_business_clearances;
import city_planning.business_clearances.Dlg_report_business_clearance;
import city_planning.household_members.Household_members;
import city_planning.users.MyUser;
import city_planning.util.Alert;
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
public class Dlg_clearance extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_clearance
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
    private Dlg_clearance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_clearance(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_clearance() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_clearance myRef;

    private void setThisRef(Dlg_clearance myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_clearance> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_clearance create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_clearance create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_clearance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_clearance((java.awt.Frame) parent, false);
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
            Dlg_clearance dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_clearance((java.awt.Dialog) parent, false);
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

        Dlg_clearance dialog = Dlg_clearance.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new Field.Search();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new Field.Search();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new Button.Print();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new Field.Search();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new Field.Search();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new Field.Search();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton4 = new Button.Print();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barangay_clearances = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new Field.Search();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_business_clearances = new javax.swing.JTable();
        jTextField15 = new Field.Search();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Purpose:");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Due:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.setText("0.00");
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cash:");

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

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField8.setText("0.00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Change:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Release");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Fixed?");
        jCheckBox3.setEnabled(false);
        jCheckBox3.setFocusable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/edit.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 287, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBox3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Barangay Clearance", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Transaction No:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setFocusable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Applicant:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Business Name:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Location:");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Valid On:");

        jDateChooser1.setDate(new Date());
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Due:");

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField12.setText("0.00");
        jTextField12.setFocusable(false);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Fixed?");
        jCheckBox4.setEnabled(false);
        jCheckBox4.setFocusable(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/edit.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Cash:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Change:");

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField14.setText("0.00");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Release");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14))))
                .addGap(100, 100, 100))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        jTabbedPane1.addTab("Business Clearance", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_barangay_clearances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_barangay_clearances.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangay_clearancesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_barangay_clearances);

        jLabel2.setText("No. of rows:");

        jLabel6.setText("0");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Barangay Clearance", jPanel6);

        tbl_business_clearances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_business_clearances.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_business_clearancesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_business_clearances);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel17.setText("No. of rows:");

        jLabel18.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField15))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Business Clearance", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reports", jPanel4);

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

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        init_household_members();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        init_clearance_purposes();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_clearance_purposes();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        add_barangay_clearance();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        compute_barangay_clearance();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_barangay_clearance();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        ret_barangay_clearances();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbl_barangay_clearancesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangay_clearancesMouseClicked
        print_preview_barangay_clearance();
    }//GEN-LAST:event_tbl_barangay_clearancesMouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        init_business_clearance_applicants();
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        init_business_clearance_locations();
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        add_business_clearance();
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        compute_business_clearance();
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        add_business_clearance();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearance_type();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearance_type();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_business_clearancesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_business_clearancesMouseClicked
        print_preview_business_clearance();
    }//GEN-LAST:event_tbl_business_clearancesMouseClicked

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        ret_business_clearances();
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        init_business_clearance_locations();
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        init_business_clearance_applicants();
    }//GEN-LAST:event_jTextField6MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tbl_barangay_clearances;
    private javax.swing.JTable tbl_business_clearances;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_collection_types();
        init_barangay_clearance_no();
        init_business_clearance_no();

        ret_default_location();

        init_tbl_barangay_clearances(tbl_barangay_clearances);
        init_tbl_business_clearances(tbl_business_clearances);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jTextField1.grabFocus();
            }
        });
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

    //<editor-fold defaultstate="collapsed" desc=" Barangay Clearance ">
    private void init_collection_types() {
        List<Clearance_types.to_collection_types> collection_types = Clearance_types.ret_data("");
        for (Clearance_types.to_collection_types to : collection_types) {
            if (to.clearance_type.equalsIgnoreCase("Barangay Clearance")) {
                jTextField4.setText(FitIn.fmt_wc_0(to.amount_due));
                if (to.is_fixed == 1) {
                    jCheckBox3.setSelected(true);
                } else {
                    jCheckBox3.setSelected(false);
                }
            }
            if (to.clearance_type.equalsIgnoreCase("Business Clearance")) {
                jTextField12.setText(FitIn.fmt_wc_0(to.amount_due));
                if (to.is_fixed == 1) {
                    jCheckBox4.setSelected(true);
                } else {
                    jCheckBox4.setSelected(false);
                }
            }
        }
    }

    private void clearance_type() {
        Window p = (Window) this;
        Dlg_clearance_types nd = Dlg_clearance_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_clearance_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_clearance_types.OutputData data) {
                init_collection_types();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    Household_members.to_household_members household_member = null;

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
                household_member = to;
                tf.setText(to.lname + ", " + to.fname + " " + to.mname);
                tf.setId(to.transient_no);
                jTextField3.grabFocus();

            }
        });
    }

    private void init_clearance_purposes() {
        final Field.Combo tf = (Field.Combo) jTextField3;
        String where = "";
        final List<Clearance_purposes.to_collection_purposes> collection_purposes = Clearance_purposes.ret_data(where);
        Object[][] obj = new Object[collection_purposes.size()][1];
        int i = 0;
        for (Clearance_purposes.to_collection_purposes to : collection_purposes) {
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
                Clearance_purposes.to_collection_purposes to = collection_purposes.get(data.selected_row);
                tf.setText(to.purpose);
                jTextField5.grabFocus();
            }
        });
    }

    private void compute_barangay_clearance() {
        double amount_due = FitIn.toDouble(jTextField4.getText());
        double tendered = FitIn.toDouble(jTextField5.getText());
        double change = tendered - amount_due;
        jTextField8.setText(FitIn.fmt_wc_0(change));
    }

    private void clear_barangay_clearance_fields() {
        Field.Search citiz = (Field.Search) jTextField1;
        citiz.setText("");
        citiz.setId(null);

        jTextField3.setText("");
        jTextField5.setText("");
        jTextField8.setText("0.00");
        jTextField1.grabFocus();
    }

    private void init_barangay_clearance_no() {
        String barangay_clearance_no = Barangay_clearances.increment_id();
        jTextField9.setText(barangay_clearance_no);
    }

    private void add_barangay_clearance() {

        int id = 0;
        String barangay_clearance_no = Barangay_clearances.increment_id();
        String where = " where barangay_clearance_no='" + barangay_clearance_no + "' ";
        List<Barangay_clearances.to_barangay_clearances> datas = Barangay_clearances.ret_data(where);
        if (!datas.isEmpty()) {
            Alert.set(0, "Duplicate Trans#,Re-try!");
            return;
        }

        if (household_member == null || jTextField1.getText().isEmpty()) {
            Alert.set(0, "Input Name");
            return;
        }
        double amount_due = FitIn.toDouble(jTextField4.getText());
        double tendered = FitIn.toDouble(jTextField5.getText());
        double change = tendered - amount_due;
        if (change < 0 && jCheckBox3.isSelected()) {
            Alert.set(0, "Insufficient Amount!");
            jTextField5.grabFocus();
            return;
        }
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
        String citizen = household_member.lname + ", " + household_member.fname + " " + household_member.mname;
        String citizen_id = "" + household_member.id;
        String house_no = household_member.house_no;
        String household_no = household_member.household_no;
        String household_member_no = household_member.household_member_no;
        String transient_no = household_member.transient_no;
        String purpose = jTextField3.getText();
        int is_fixed = 0;
        if (jCheckBox3.isSelected()) {
            is_fixed = 1;
        }
        String pb = System.getProperty("punong_barangay", "JOSE O. DE GUZMAN");
        double amount_tendered = FitIn.toDouble(jTextField5.getText());
        String punong_barangay = pb;
        String citizen_bday = household_member.bday;
        String citizen_civil_status = household_member.marital_status;
        final Barangay_clearances.to_barangay_clearances barangay_clearance = new Barangay_clearances.to_barangay_clearances(id, barangay_clearance_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, citizen, citizen_id, house_no, household_no, household_member_no, transient_no, purpose, is_fixed, amount_due, amount_tendered, punong_barangay, citizen_bday, citizen_civil_status);
        Barangay_clearances.add_data(barangay_clearance);
        clear_barangay_clearance_fields();
        household_member = null;
        init_barangay_clearance_no();
        Alert.set(1, "");
        ret_barangay_clearances();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                preview_barangay_clearance(barangay_clearance);
            }
        });

    }

    private void preview_barangay_clearance(Barangay_clearances.to_barangay_clearances barangay_clearance) {
        Window p = (Window) this;
        Dlg_report_barangay_clearance nd = Dlg_report_barangay_clearance.create(p, true);
        nd.setTitle("");
        nd.do_pass(barangay_clearance);
        nd.setCallback(new Dlg_report_barangay_clearance.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_barangay_clearance.OutputData data) {
                closeDialog.ok();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //<editor-fold defaultstate="collapsed" desc=" barangay_clearances "> 
    public static ArrayListModel tbl_barangay_clearances_ALM;
    public static Tblbarangay_clearancesModel tbl_barangay_clearances_M;

    public static void init_tbl_barangay_clearances(JTable tbl_barangay_clearances) {
        tbl_barangay_clearances_ALM = new ArrayListModel();
        tbl_barangay_clearances_M = new Tblbarangay_clearancesModel(tbl_barangay_clearances_ALM);
        tbl_barangay_clearances.setModel(tbl_barangay_clearances_M);
        tbl_barangay_clearances.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_barangay_clearances.setRowHeight(25);
        int[] tbl_widths_barangay_clearances = {130, 80, 100, 80, 60, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_barangay_clearances.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_barangay_clearances, i, tbl_widths_barangay_clearances[i]);
        }
        Dimension d = tbl_barangay_clearances.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_barangay_clearances.getTableHeader().setPreferredSize(d);
        tbl_barangay_clearances.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_barangay_clearances.setRowHeight(25);
        tbl_barangay_clearances.setFont(new java.awt.Font("Arial", 0, 12));
        TableWidthUtilities.setColumnRightRenderer(tbl_barangay_clearances, 3);
    }

    public static void loadData_barangay_clearances(List<to_barangay_clearances> acc) {
        tbl_barangay_clearances_ALM.clear();
        tbl_barangay_clearances_ALM.addAll(acc);
    }

    public static class Tblbarangay_clearancesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Clearance No", "Date", "Name", "Amount", "Status", "", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "citizen", "citizen_id", "house_no", "household_no", "household_member_no", "transient_no", "purpose", "is_fixed", "amount_due", "amount_tendered"
        };

        public Tblbarangay_clearancesModel(ListModel listmodel) {
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
            to_barangay_clearances tt = (to_barangay_clearances) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.barangay_clearance_no;
                case 1:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 2:
                    return " " + tt.citizen;
                case 3:
                    return FitIn.fmt_wc_0(tt.amount_due) + " ";
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
                    return tt.purpose;
                case 24:
                    return tt.is_fixed;
                case 25:
                    return tt.amount_due;
                default:
                    return tt.amount_tendered;
            }
        }
    }
//</editor-fold> 

    private void ret_barangay_clearances() {
        String where = "";
        List<Barangay_clearances.to_barangay_clearances> datas = Barangay_clearances.ret_data(where);
        loadData_barangay_clearances(datas);
        jLabel6.setText("" + datas.size());
    }

    private void print_preview_barangay_clearance() {
        int row = tbl_barangay_clearances.getSelectedRow();
        if (row < 0) {
            return;
        }
        Barangay_clearances.to_barangay_clearances clearance = (Barangay_clearances.to_barangay_clearances) tbl_barangay_clearances_ALM.get(row);
        int col = tbl_barangay_clearances.getSelectedColumn();
        if (col == 4) {
            //void
        }
        if (col == 5) {
            //preview
            preview_barangay_clearance(clearance);
        }

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Business Clearance ">
    private void init_business_clearance_no() {
        String business_clearance_no = Business_clearances.increment_id();
        jTextField10.setText(business_clearance_no);
    }

    private void init_business_clearance_applicants() {
        final Field.Search tf = (Field.Search) jTextField6;

        String where = " ";
        final List<Business_clearance_applicants.to_business_clearance_applicants> applicants = Business_clearance_applicants.ret_data(where);

        Object[][] obj = new Object[applicants.size()][1];
        int i = 0;
        for (Business_clearance_applicants.to_business_clearance_applicants to : applicants) {
            obj[i][0] = " " + to.applicant;
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
                Business_clearance_applicants.to_business_clearance_applicants to = applicants.get(data.selected_row);
                tf.setText(to.applicant);
                tf.setId("" + to.id);
                jTextField7.grabFocus();
            }
        });
    }

    private void init_business_clearance_locations() {
        final Field.Search tf = (Field.Search) jTextField11;
        String where = " where location like '%" + tf.getText() + "%'";
        final List<Business_clearance_locations.to_business_clearance_locations> business_clearance_locations = Business_clearance_locations.ret_data(where);
        if (business_clearance_locations.isEmpty()) {
            if (!tf.getText().isEmpty()) {
                Business_clearance_locations.to_business_clearance_locations to = new Business_clearance_locations.to_business_clearance_locations(0, tf.getText());
                Business_clearance_locations.add_data(to);
                init_business_clearance_locations();
                return;
            }
        }

        Object[][] obj = new Object[business_clearance_locations.size()][1];
        int i = 0;
        for (Business_clearance_locations.to_business_clearance_locations to : business_clearance_locations) {
            obj[i][0] = " " + to.location;
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
                Business_clearance_locations.to_business_clearance_locations to = business_clearance_locations.get(data.selected_row);
                tf.setText(to.location);
                tf.setId("" + to.id);
                jTextField13.grabFocus();
            }
        });
    }

    private void compute_business_clearance() {
        double amount_due = FitIn.toDouble(jTextField12.getText());
        double tendered = FitIn.toDouble(jTextField13.getText());
        double change = tendered - amount_due;
        jTextField14.setText(FitIn.fmt_wc_0(change));
    }

    private void add_business_clearance() {
        Field.Search appl = (Field.Search) jTextField6;
        int id = 0;
        String business_clearance_no = Business_clearances.increment_id();
        String where = " where business_clearance_no='" + business_clearance_no + "' ";
        List<Business_clearances.to_business_clearances> datas = Business_clearances.ret_data(where);
        if (!datas.isEmpty()) {
            Alert.set(0, "Duplicate Trans#,Re-try!");
            return;
        }
        if (appl.getText().isEmpty()) {
            Alert.set(0, "Input Name");
            return;
        }
        double amount_due = FitIn.toDouble(jTextField12.getText());
        double tendered = FitIn.toDouble(jTextField13.getText());
        double change = tendered - amount_due;
        if (change < 0 && jCheckBox4.isSelected()) {
            Alert.set(0, "Insufficient Amount!");
            jTextField13.grabFocus();
            return;
        }
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
        String applicant = appl.getText();
        String applicant_id = appl.getId();
        String business_name = jTextField7.getText();
        String business_location = jTextField11.getText();
        String valid_on = DateType.sf.format(jDateChooser1.getDate());
        String issued_on = DateType.now();
        String punong_barangay = "";
        int is_fixed = 1;
        if (!jCheckBox4.isSelected()) {
            is_fixed = 0;
        }

        double amount_tendered = FitIn.toDouble(jTextField13.getText());
        final Business_clearances.to_business_clearances business_clearance = new Business_clearances.to_business_clearances(id, business_clearance_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, applicant, applicant_id, business_name, business_location, valid_on, issued_on, punong_barangay, is_fixed, amount_due, amount_tendered);
        Business_clearances.add_data(business_clearance);
        Alert.set(1, "");
        clear_business_clearance();
        init_business_clearance_no();
        ret_business_clearances();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                preview_business_clearance(business_clearance);

            }
        });
    }
    //<editor-fold defaultstate="collapsed" desc=" business_clearances "> 
    public static ArrayListModel tbl_business_clearances_ALM;
    public static Tblbusiness_clearancesModel tbl_business_clearances_M;

    public static void init_tbl_business_clearances(JTable tbl_business_clearances) {
        tbl_business_clearances_ALM = new ArrayListModel();
        tbl_business_clearances_M = new Tblbusiness_clearancesModel(tbl_business_clearances_ALM);
        tbl_business_clearances.setModel(tbl_business_clearances_M);
        tbl_business_clearances.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_business_clearances.setRowHeight(25);
        int[] tbl_widths_business_clearances = {120, 80, 100, 80, 60, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_business_clearances.length; i < n; i++) {
            if (i == 2 || i == 3) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_business_clearances, i, tbl_widths_business_clearances[i]);
        }
        Dimension d = tbl_business_clearances.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_business_clearances.getTableHeader().setPreferredSize(d);
        tbl_business_clearances.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_business_clearances.setRowHeight(25);
        tbl_business_clearances.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_business_clearances(List<to_business_clearances> acc) {
        tbl_business_clearances_ALM.clear();
        tbl_business_clearances_ALM.addAll(acc);
    }

    public static class Tblbusiness_clearancesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Clerance No", "Date", "Applicant", "Business", "Status", "", "region", "region_id", "province", "province_id", "city", "city_id", "barangay", "barangay_id", "purok", "purok_id", "status", "applicant", "applicant_id", "business_name", "business_location", "valid_on", "issued_on", "punong_barangay", "is_fixed", "amount_due", "amount_tendered"
        };

        public Tblbusiness_clearancesModel(ListModel listmodel) {
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
            to_business_clearances tt = (to_business_clearances) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.business_clearance_no;
                case 1:
                    return " " + DateType.convert_slash_datetime(tt.created_at);
                case 2:
                    return " " + tt.applicant;
                case 3:
                    return " " + tt.business_name;
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
                    return tt.applicant;
                case 18:
                    return tt.applicant_id;
                case 19:
                    return tt.business_name;
                case 20:
                    return tt.business_location;
                case 21:
                    return tt.valid_on;
                case 22:
                    return tt.issued_on;
                case 23:
                    return tt.punong_barangay;
                case 24:
                    return tt.is_fixed;
                case 25:
                    return tt.amount_due;
                default:
                    return tt.amount_tendered;
            }
        }
    }

    private void ret_business_clearances() {
        String where = "";
        List<to_business_clearances> datas = Business_clearances.ret_data(where);
        loadData_business_clearances(datas);
        jLabel18.setText("" + datas.size());
    }
//</editor-fold> 

    private void preview_business_clearance(Business_clearances.to_business_clearances business_clearance) {
        Window p = (Window) this;
        Dlg_report_business_clearance nd = Dlg_report_business_clearance.create(p, true);
        nd.setTitle("");
        nd.do_pass(business_clearance);
        nd.setCallback(new Dlg_report_business_clearance.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_report_business_clearance.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void clear_business_clearance() {
        Field.Search appl = (Field.Search) jTextField6;
        appl.setText("");
        appl.setId(null);
        jTextField3.setText("");
        jTextField13.setText("");
        jTextField14.setText("0.00");
    }

    private void print_preview_business_clearance() {
        int row = tbl_business_clearances.getSelectedRow();
        if (row < 0) {
            return;
        }
        Business_clearances.to_business_clearances business_clearance = (Business_clearances.to_business_clearances) tbl_business_clearances_ALM.get(row);
        int col = tbl_business_clearances.getSelectedColumn();
        if (col == 4) {
            //void
        }
        if (col == 5) {
            //preview
            preview_business_clearance(business_clearance);
        }

    }
    //</editor-fold>
}
