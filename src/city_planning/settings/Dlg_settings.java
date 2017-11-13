/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.settings;

import city_planning.barangay_officials.Barangay_officials;
import city_planning.barangays.Barangays;
import city_planning.util.Alert;
import city_planning.util.TableRenderer;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_settings extends javax.swing.JDialog {

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
    private Dlg_settings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_settings(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_settings() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_settings myRef;

    private void setThisRef(Dlg_settings myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_settings> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_settings create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_settings create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_settings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_settings((java.awt.Frame) parent, false);
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
            Dlg_settings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_settings((java.awt.Dialog) parent, false);
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

        Dlg_settings dialog = Dlg_settings.create(new javax.swing.JFrame(), true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new Field.Combo();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField3 = new Field.Input();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new Button.Default();
        jButton2 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Default Barangay:");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Belongs to City:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Yes/No");

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Punong Barangay:");

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
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
        save();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
//        init_punong_barangay();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        init_barangays();
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        init_barangays();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        String where = "";
        List<Settings.to_settings> datas = Settings.ret_data(where);
        if (!datas.isEmpty()) {
            Field.Combo br = (Field.Combo) jTextField4;
            Settings.to_settings setting = datas.get(0);
            id = setting.id;
            br.setText(setting.default_barangay);
            br.setId(setting.default_barangay_id);
            if (setting.barangay_is_city == 0) {
                jCheckBox1.setSelected(false);
            } else {
                jCheckBox1.setSelected(true);
            }
            jTextField3.setText(setting.punong_barangay);
        }
    }
    int id = 0;

    private void save() {
        Field.Combo br = (Field.Combo) jTextField4;
        int barangay_is_city = 0;
        if (jCheckBox1.isSelected()) {
            barangay_is_city = 1;
        }

        String punong_barangay = jTextField3.getText();

        Settings.update_data2(br.getText(), br.getId(), barangay_is_city, punong_barangay);
        Alert.set(2, "");

        System.setProperty("default_barangay", br.getText());
        System.setProperty("default_barangay_id", br.getId());
        System.setProperty("barangay_is_city", "" + barangay_is_city);
        System.setProperty("punong_barangay", punong_barangay);

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
        jTextField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F5) {
                    dlg_settings();
                }
            }
        });
    }

    private void dlg_settings() {
        List<Settings.to_settings> setts = Settings.ret_data("");
        Settings.to_settings sett = setts.get(0);
        Window p = (Window) this;
        Dlg_settings_module nd = Dlg_settings_module.create(p, true);
        nd.setTitle("");
        nd.do_pass(sett);
        nd.setCallback(new Dlg_settings_module.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_settings_module.OutputData data) {
                closeDialog.ok();
                int id1 = id;
                String default_barangay = "";
                String default_barangay_id = "";
                int barangay_is_city = 0;
                String punong_barangay = "";
                int household_assets = data.household_assets;
                int household_expenditures = data.household_expenditures;
                int household_consumptions = data.household_consumptions;
                int household_concerns = data.household_concerns;
                int household_source_of_income = data.household_source_of_income;
                int household_member_educational_background = data.household_member_educational_background;
                int household_member_health_status = data.household_member_health_status;
                int household_member_medication = data.household_member_medication;
                int household_member_work_experience = data.household_member_work_experience;
                int household_member_license_and_certificates = data.household_member_license_and_certificates;
                int household_member_employment_status = data.household_member_employment_status;
                int household_member_skills = data.household_member_skills;
                Settings.to_settings setting = new Settings.to_settings(id1, default_barangay, default_barangay_id, barangay_is_city, punong_barangay, household_assets, household_expenditures, household_consumptions, household_concerns, household_source_of_income, household_member_educational_background, household_member_health_status, household_member_medication, household_member_work_experience, household_member_license_and_certificates, household_member_employment_status, household_member_skills);
                Settings.update_data3(setting);

                if (setting.household_assets == 0) {
                    System.setProperty("household_assets", "0");
                } else {
                    System.setProperty("household_assets", "1");
                }

                if (setting.household_expenditures == 0) {
                    System.setProperty("household_expenditures", "0");
                } else {
                    System.setProperty("household_expenditures", "1");
                }

                if (setting.household_consumptions == 0) {
                    System.setProperty("household_consumptions", "0");
                } else {
                    System.setProperty("household_consumptions", "1");
                }

                if (setting.household_concerns == 0) {
                    System.setProperty("household_concerns", "0");
                } else {
                    System.setProperty("household_concerns", "1");
                }
                if (setting.household_source_of_income == 0) {
                    System.setProperty("household_source_of_income", "0");
                } else {
                    System.setProperty("household_source_of_income", "1");
                }
                // household members
                if (setting.household_member_educational_background == 0) {
                    System.setProperty("household_member_educational_background", "0");
                } else {
                    System.setProperty("household_member_educational_background", "1");
                }

                if (setting.household_member_health_status == 0) {
                    System.setProperty("household_member_health_status", "0");
                } else {
                    System.setProperty("household_member_health_status", "1");
                }
                if (setting.household_member_medication == 0) {
                    System.setProperty("household_member_medication", "");
                } else {
                    System.setProperty("household_member_medication", "");
                }

                if (setting.household_member_work_experience == 0) {
                    System.setProperty("household_member_work_experience", "0");
                } else {
                    System.setProperty("household_member_work_experience", "1");
                }

                if (setting.household_member_license_and_certificates == 0) {
                    System.setProperty("household_member_license_and_certificates", "0");
                } else {
                    System.setProperty("household_member_license_and_certificates", "1");
                }

                if (setting.household_member_employment_status == 0) {
                    System.setProperty("household_member_employment_status", "0");
                } else {
                    System.setProperty("household_member_employment_status", "1");
                }

                if (setting.household_member_skills == 0) {
                    System.setProperty("household_member_skills", "0");
                } else {
                    System.setProperty("household_member_skills", "1");
                }

                Alert.set(2, punong_barangay);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    // </editor-fold>

    private void init_barangays() {
        Field.Combo tf = (Field.Combo) jTextField4;

        final List<Barangays.to_barangays> barangays = Barangays.ret_data(" order by barangay asc ");

        Object[][] obj = new Object[barangays.size()][2];
        int i = 0;
        for (Barangays.to_barangays bar : barangays) {
            obj[i][0] = " " + bar.barangay;
            obj[i][1] = " " + bar.city;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth() - 200, 200};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo tf1 = (Field.Combo) jTextField4;
                Barangays.to_barangays to = (Barangays.to_barangays) barangays.get(data.selected_row);
                tf1.setText(to.barangay);
                tf1.setId("" + to.id);

            }
        });
    }

    private void init_punong_barangay() {
        final Field.Combo tf = (Field.Combo) jTextField3;
        String where = " where status=1 order by lname asc ";
        final List<Barangay_officials.to_barangay_officials> location_type = Barangay_officials.ret_data(where);

        Object[][] obj = new Object[location_type.size()][1];
        int i = 0;
        for (Barangay_officials.to_barangay_officials tt : location_type) {
            obj[i][0] = " " + tt.lname + " " + tt.sname + " , " + tt.fname + " " + tt.mi;
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
                Barangay_officials.to_barangay_officials tt = location_type.get(data.selected_row);
                tf.setText(tt.lname + " " + tt.sname + " , " + tt.fname + " " + tt.mi);

            }
        });
    }

}
