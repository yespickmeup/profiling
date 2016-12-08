/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.api;

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
import city_planning.household_positions.Household_positions;
import city_planning.households.Households;
import city_planning.houses.Houses;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;

/**
 *
 * @author synsoftech
 */
public class Dlg_upload extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_upload2
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
    private Dlg_upload(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_upload(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_upload() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_upload myRef;

    private void setThisRef(Dlg_upload myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_upload> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_upload create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_upload create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_upload dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_upload((java.awt.Frame) parent, false);
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
            Dlg_upload dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_upload((java.awt.Dialog) parent, false);
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

        Dlg_upload dialog = Dlg_upload.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new Button.Success();
        jButton2 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Upload to Cloud Server");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_menu_maintenances/cloud-storage3.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Server Status:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Not Connected");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_menu_maintenances/lightbulb-idea.png"))); // NOI18N
        jLabel5.setToolTipText("Check Connection");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel18);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Status:");

        jProgressBar1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jButton1.setText("Upload");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                ret_data();
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void ret_data() {
        String where = " where is_uploaded=0";

        //<editor-fold defaultstate="collapsed" desc=" list ">
        List<Households.to_households> households = Households.ret_data(where);
        List<Households.to_households> households_0 = new ArrayList();
        List<Households.to_households> households_1 = new ArrayList();
        List<Household_assets.to_household_assets> household_assets = Household_assets.ret_data(where);
        List<Household_assets.to_household_assets> household_assets_0 = new ArrayList();
        List<Household_assets.to_household_assets> household_assets_1 = new ArrayList();
        List<Household_consumptions.to_household_consumptions> household_consumptions = Household_consumptions.ret_data(where);
        List<Household_consumptions.to_household_consumptions> household_consumptions_0 = new ArrayList();
        List<Household_consumptions.to_household_consumptions> household_consumptions_1 = new ArrayList();
        List<Household_expenditures.to_household_expenditures> household_expenditures = Household_expenditures.ret_data(where);
        List<Household_expenditures.to_household_expenditures> household_expenditures_0 = new ArrayList();
        List<Household_expenditures.to_household_expenditures> household_expenditures_1 = new ArrayList();
        List<Household_members.to_household_members> household_members = Household_members.ret_data(where);
        List<Household_members.to_household_members> household_members_0 = new ArrayList();
        List<Household_members.to_household_members> household_members_1 = new ArrayList();
        List<Household_member_competence_certificates.to_household_member_competence_certificates> household_member_competence_certificates = Household_member_competence_certificates.ret_data(where);
        List<Household_member_competence_certificates.to_household_member_competence_certificates> household_member_competence_certificates_0 = new ArrayList();
        List<Household_member_competence_certificates.to_household_member_competence_certificates> household_member_competence_certificates_1 = new ArrayList();
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> household_member_educational_backgrounds = Household_member_educational_backgrounds.ret_data(where);
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> household_member_educational_backgrounds_0 = new ArrayList();
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> household_member_educational_backgrounds_1 = new ArrayList();
        List<Household_member_employment_status.to_household_member_employment_status> household_member_employment_status = Household_member_employment_status.ret_data(where);
        List<Household_member_employment_status.to_household_member_employment_status> household_member_employment_status_0 = new ArrayList();
        List<Household_member_employment_status.to_household_member_employment_status> household_member_employment_status_1 = new ArrayList();
        List<Household_member_health_statuses.to_household_member_health_statuses> household_member_health_statuses = Household_member_health_statuses.ret_data(where);
        List<Household_member_health_statuses.to_household_member_health_statuses> household_member_health_statuses_0 = new ArrayList();
        List<Household_member_health_statuses.to_household_member_health_statuses> household_member_health_statuses_1 = new ArrayList();
        List<Household_member_licences.to_household_member_licenses> household_member_licenses = Household_member_licences.ret_data(where);
        List<Household_member_licences.to_household_member_licenses> household_member_licenses_0 = new ArrayList();
        List<Household_member_licences.to_household_member_licenses> household_member_licenses_1 = new ArrayList();
        List<Household_member_medications.to_household_member_medications> household_member_medications = Household_member_medications.ret_data(where);
        List<Household_member_medications.to_household_member_medications> household_member_medications_0 = new ArrayList();
        List<Household_member_medications.to_household_member_medications> household_member_medications_1 = new ArrayList();
        List<Household_member_prefered_works.to_household_member_prefered_works> household_member_prefered_works = Household_member_prefered_works.ret_data(where);
        List<Household_member_prefered_works.to_household_member_prefered_works> household_member_prefered_works_0 = new ArrayList();
        List<Household_member_prefered_works.to_household_member_prefered_works> household_member_prefered_works_1 = new ArrayList();
        List<Household_member_skills.to_household_member_skills> household_member_skills = Household_member_skills.ret_data(where);
        List<Household_member_skills.to_household_member_skills> household_member_skills_0 = new ArrayList();
        List<Household_member_skills.to_household_member_skills> household_member_skills_1 = new ArrayList();
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> household_member_vocational_experiences = Household_member_vocational_experiences.ret_data(where);
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> household_member_vocational_experiences_0 = new ArrayList();
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> household_member_vocational_experiences_1 = new ArrayList();
        List<Household_member_work_experiences.to_household_member_work_experiences> household_member_work_experiences = Household_member_work_experiences.ret_data(where);
        List<Household_member_work_experiences.to_household_member_work_experiences> household_member_work_experiences_0 = new ArrayList();
        List<Household_member_work_experiences.to_household_member_work_experiences> household_member_work_experiences_1 = new ArrayList();
        List<Household_positions.to_household_positions> household_positions = new ArrayList();
        List<Houses.to_houses> houses = Houses.ret_data(where);
        List<Houses.to_houses> houses_0 = new ArrayList();
        List<Houses.to_houses> houses_1 = new ArrayList();
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" fields ">

        int new_households = 0;
        int update_households = 0;
        int new_household_assets = 0;
        int update_household_assets = 0;
        int new_household_consumptions = 0;
        int update_household_consumptions = 0;
        int new_household_expenditures = 0;
        int update_household_expenditures = 0;
        int new_household_members = 0;
        int update_household_members = 0;
        int new_household_member_competence_certificates = 0;
        int update_household_member_competence_certificates = 0;
        int new_household_member_educational_backgrounds = 0;
        int update_household_member_educational_backgrounds = 0;
        int new_household_member_employment_status = 0;
        int update_household_member_employment_status = 0;
        int new_household_member_health_statuses = 0;
        int update_household_member_health_statuses = 0;
        int new_household_member_licenses = 0;
        int update_household_member_licenses = 0;
        int new_household_member_medications = 0;
        int update_household_member_medications = 0;
        int new_household_member_prefered_works = 0;
        int update_household_member_prefered_works = 0;
        int new_household_member_skills = 0;
        int update_household_member_skills = 0;
        int new_household_member_vocational_experiences = 0;
        int update_household_member_vocational_experiences = 0;
        int new_household_member_work_experiences = 0;
        int update_household_member_work_experiences = 0;
        int new_household_positions = 0;
        int update_household_positions = 0;
        int new_houses = 0;
        int update_houses = 0;
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" store ">
        int total_new = 0;
        int total_update = 0;
        for (Households.to_households household : households) {
            if (household.status == 0 || household.status == 2) {
                households_0.add(household);
                new_households++;
                total_new++;
            }
            if (household.status == 1) {
                households_1.add(household);
                update_households++;
                total_update++;
            }
        }
        for (Household_assets.to_household_assets household_asset : household_assets) {
            if (household_asset.status == 0 || household_asset.status == 2) {
                household_assets_0.add(household_asset);
                new_household_assets++;
                total_new++;
            }
            if (household_asset.status == 1) {
                household_assets_1.add(household_asset);
                update_household_assets++;
                total_update++;
            }
        }
        for (Household_consumptions.to_household_consumptions household_consumption : household_consumptions) {
            if (household_consumption.status == 0 || household_consumption.status == 2) {
                household_consumptions_0.add(household_consumption);
                new_household_consumptions++;
                total_new++;
            }
            if (household_consumption.status == 1) {
                household_consumptions_1.add(household_consumption);
                update_household_consumptions++;
                total_update++;
            }
        }
        for (Household_expenditures.to_household_expenditures household_expenditure : household_expenditures) {
            if (household_expenditure.status == 0 || household_expenditure.status == 2) {
                household_expenditures_0.add(household_expenditure);
                new_household_expenditures++;
                total_new++;
            }
            if (household_expenditure.status == 1) {
                household_expenditures_1.add(household_expenditure);
                update_household_expenditures++;
                total_update++;
            }
        }
        for (Household_members.to_household_members household_member : household_members) {
            if (household_member.status == 0 || household_member.status == 2) {
                household_members_0.add(household_member);
                new_household_members++;
                total_new++;
            }
            if (household_member.status == 1) {
                household_members_1.add(household_member);
                update_household_members++;
                total_update++;
            }
        }
        for (Household_member_competence_certificates.to_household_member_competence_certificates household_member_competence_certificate : household_member_competence_certificates) {
            if (household_member_competence_certificate.status == 0 || household_member_competence_certificate.status == 2) {
                household_member_competence_certificates_0.add(household_member_competence_certificate);
                new_household_member_competence_certificates++;
                total_new++;
            }
            if (household_member_competence_certificate.status == 1) {
                household_member_competence_certificates_1.add(household_member_competence_certificate);
                update_household_member_competence_certificates++;
                total_update++;
            }
        }
        for (Household_member_educational_backgrounds.to_household_member_educational_backgrounds household_member_educational_background : household_member_educational_backgrounds) {
            if (household_member_educational_background.status == 0 || household_member_educational_background.status == 2) {
                household_member_educational_backgrounds_0.add(household_member_educational_background);
                new_household_member_educational_backgrounds++;
                total_new++;
            }
            if (household_member_educational_background.status == 1) {
                household_member_educational_backgrounds_1.add(household_member_educational_background);
                update_household_member_educational_backgrounds++;
                total_update++;
            }
        }
        for (Household_member_employment_status.to_household_member_employment_status household_member_employment_statu : household_member_employment_status) {
            if (household_member_employment_statu.status == 0 || household_member_employment_statu.status == 2) {
                household_member_employment_status_0.add(household_member_employment_statu);
                new_household_member_employment_status++;
                total_new++;
            }
            if (household_member_employment_statu.status == 1) {
                household_member_employment_status_1.add(household_member_employment_statu);
                update_household_member_employment_status++;
                total_update++;
            }
        }
        for (Household_member_health_statuses.to_household_member_health_statuses household_member_health_status : household_member_health_statuses) {
            if (household_member_health_status.status == 0 || household_member_health_status.status == 2) {
                household_member_health_statuses_0.add(household_member_health_status);
                new_household_member_health_statuses++;
                total_new++;
            }
            if (household_member_health_status.status == 1) {
                household_member_health_statuses_1.add(household_member_health_status);
                update_household_member_health_statuses++;
                total_update++;
            }
        }
        for (Household_member_licences.to_household_member_licenses household_member_licence : household_member_licenses) {
            if (household_member_licence.status == 0 || household_member_licence.status == 2) {
                household_member_licenses_0.add(household_member_licence);
                new_household_member_licenses++;
                total_new++;
            }
            if (household_member_licence.status == 1) {
                household_member_licenses_1.add(household_member_licence);
                update_household_member_licenses++;
                total_update++;
            }
        }
        for (Household_member_medications.to_household_member_medications household_member_medication : household_member_medications) {
            if (household_member_medication.status == 0 || household_member_medication.status == 2) {
                household_member_medications_0.add(household_member_medication);
                new_household_member_medications++;
                total_new++;
            }
            if (household_member_medication.status == 1) {
                household_member_medications_1.add(household_member_medication);
                update_household_member_medications++;
                total_update++;
            }
        }
        for (Household_member_prefered_works.to_household_member_prefered_works household_member_prefered_work : household_member_prefered_works) {
            if (household_member_prefered_work.status == 0 || household_member_prefered_work.status == 2) {
                household_member_prefered_works_0.add(household_member_prefered_work);
                new_household_member_prefered_works++;
                total_new++;
            }
            if (household_member_prefered_work.status == 1) {
                household_member_prefered_works_1.add(household_member_prefered_work);
                update_household_member_prefered_works++;
                total_update++;
            }
        }
        for (Household_member_skills.to_household_member_skills household_member_skill : household_member_skills) {
            if (household_member_skill.status == 0 || household_member_skill.status == 2) {
                household_member_skills_0.add(household_member_skill);
                new_household_member_skills++;
                total_new++;
            }
            if (household_member_skill.status == 1) {
                household_member_skills_1.add(household_member_skill);
                update_household_member_skills++;
                total_update++;
            }
        }
        for (Household_member_vocational_experiences.to_household_member_vocational_experiences household_member_vocational_experience : household_member_vocational_experiences) {
            if (household_member_vocational_experience.status == 0 || household_member_vocational_experience.status == 2) {
                household_member_vocational_experiences_0.add(household_member_vocational_experience);
                new_household_member_vocational_experiences++;
                total_new++;
            }
            if (household_member_vocational_experience.status == 1) {
                household_member_vocational_experiences_1.add(household_member_vocational_experience);
                update_household_member_vocational_experiences++;
                total_update++;
            }
        }
        for (Household_member_work_experiences.to_household_member_work_experiences household_member_work_experience : household_member_work_experiences) {
            if (household_member_work_experience.status == 0 || household_member_work_experience.status == 2) {
                household_member_work_experiences_0.add(household_member_work_experience);
                new_household_member_work_experiences++;
                total_new++;
            }
            if (household_member_work_experience.status == 1) {
                household_member_work_experiences_1.add(household_member_work_experience);
                update_household_member_work_experiences++;
                total_update++;
            }
        }
        for (Household_positions.to_household_positions household_position : household_positions) {

        }
        for (Houses.to_houses house : houses) {
            if (house.status == 0 || house.status == 2) {
                houses_0.add(house);
                new_houses++;
                total_new++;
            }
            if (house.status == 1) {
                houses_1.add(house);
                update_houses++;
                total_update++;
            }
        }
        //</editor-fold>

        JTree tree;
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode new_record = new DefaultMutableTreeNode("New Record/s  -  " + total_new);
        new_record.add(new DefaultMutableTreeNode("Households  -  " + new_households));
        new_record.add(new DefaultMutableTreeNode("Household Assets  -  " + new_household_assets));
        new_record.add(new DefaultMutableTreeNode("Household Consumptions  -  " + new_household_consumptions));
        new_record.add(new DefaultMutableTreeNode("Household Expenditures  -  " + new_household_expenditures));
        new_record.add(new DefaultMutableTreeNode("Household Members  -  " + new_household_members));
        new_record.add(new DefaultMutableTreeNode("Household Member Competence Certificates  -  " + new_household_member_competence_certificates));
        new_record.add(new DefaultMutableTreeNode("Household Member Educational Backgrounds  -  " + new_household_member_educational_backgrounds));
        new_record.add(new DefaultMutableTreeNode("Household Member Employment Status  -  " + new_household_member_employment_status));
        new_record.add(new DefaultMutableTreeNode("Household Member Health Statuses  -  " + new_household_member_health_statuses));
        new_record.add(new DefaultMutableTreeNode("Household Member Licenses  -  " + new_household_member_licenses));
        new_record.add(new DefaultMutableTreeNode("Household Member Medications  -  " + new_household_member_medications));
        new_record.add(new DefaultMutableTreeNode("Household Member Prefered Works  -  " + new_household_member_prefered_works));
        new_record.add(new DefaultMutableTreeNode("Household Member Skills  -  " + new_household_member_skills));
        new_record.add(new DefaultMutableTreeNode("Household Member Vocational Experiences  -  " + new_household_member_vocational_experiences));
        new_record.add(new DefaultMutableTreeNode("Household Member Work Experiences  -  " + new_household_member_work_experiences));
        new_record.add(new DefaultMutableTreeNode("Houses  -  " + new_houses));

        DefaultMutableTreeNode new_updates = new DefaultMutableTreeNode("New Updates  -  " + total_update);
        new_updates.add(new DefaultMutableTreeNode("Households  -  " + update_households));
        new_updates.add(new DefaultMutableTreeNode("Household Assets  -  " + update_household_assets));
        new_updates.add(new DefaultMutableTreeNode("Household Consumptions  -  " + update_household_consumptions));
        new_updates.add(new DefaultMutableTreeNode("Household Expenditures  -  " + update_household_expenditures));
        new_updates.add(new DefaultMutableTreeNode("Household Members  -  " + update_household_members));
        new_updates.add(new DefaultMutableTreeNode("Household Member Competence Certificates  -  " + update_household_member_competence_certificates));
        new_updates.add(new DefaultMutableTreeNode("Household Member Educational Backgrounds  -  " + new_household_member_educational_backgrounds));
        new_updates.add(new DefaultMutableTreeNode("Household Member Employment Status  -  " + new_household_member_employment_status));
        new_updates.add(new DefaultMutableTreeNode("Household Member Health Statuses  -  " + new_household_member_health_statuses));
        new_updates.add(new DefaultMutableTreeNode("Household Member Licenses  -  " + update_household_member_licenses));
        new_updates.add(new DefaultMutableTreeNode("Household Member Medications  -  " + update_household_member_medications));
        new_updates.add(new DefaultMutableTreeNode("Household Member Prefered Works  -  " + update_household_member_prefered_works));
        new_updates.add(new DefaultMutableTreeNode("Household Member Skills  -  " + update_household_member_skills));
        new_updates.add(new DefaultMutableTreeNode("Household Member Vocational Experiences  -  " + update_household_member_vocational_experiences));
        new_updates.add(new DefaultMutableTreeNode("Household Member Work Experiences  -  " + update_household_member_work_experiences));
        new_updates.add(new DefaultMutableTreeNode("Houses  -  " + update_houses));

        DefaultMutableTreeNode maintenance = new DefaultMutableTreeNode("Maintenance  -  " + 0);
        root.add(new_record);
        root.add(maintenance);
        root.add(new_updates);
        tree = new JTree(root);

        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        tree.setCellRenderer(renderer);
        tree.setShowsRootHandles(true);
        tree.setRootVisible(false);

        jPanel18.setLayout(new BorderLayout());
        jPanel18.add(tree);
        jPanel18.updateUI();

        Gson gson = new GsonBuilder().create();

        String json_households_0 = gson.toJson(households_0);
        String json_household_assets_0 = gson.toJson(household_assets_0);
        String json_household_consumptions_0 = gson.toJson(household_consumptions_0);
        String json_household_expenditures_0 = gson.toJson(household_expenditures_0);
        String json_household_members_0 = gson.toJson(household_members_0);
        String json_household_member_competence_certificates_0 = gson.toJson(household_member_competence_certificates_0);
        String json_household_member_educational_backgrounds_0 = gson.toJson(household_member_educational_backgrounds_0);
        String json_household_member_employment_status_0 = gson.toJson(household_member_employment_status_0);
        String json_household_member_health_statuses_0 = gson.toJson(household_member_health_statuses_0);
        String json_household_member_licenses_0 = gson.toJson(household_member_licenses_0);
        String json_household_member_medications_0 = gson.toJson(household_member_medications_0);
        String json_household_member_prefered_works_0 = gson.toJson(household_member_prefered_works_0);
        String json_household_member_skills_0 = gson.toJson(household_member_skills_0);
        String json_household_member_vocational_experiences_0 = gson.toJson(household_member_vocational_experiences_0);
        String json_household_member_work_experiences_0 = gson.toJson(household_member_work_experiences_0);
        String json_houses_0 = gson.toJson(houses_0);

        String json_households_1 = gson.toJson(households_1);
        String json_household_assets_1 = gson.toJson(household_assets_1);
        String json_household_consumptions_1 = gson.toJson(household_consumptions_1);
        String json_household_expenditures_1 = gson.toJson(household_expenditures_1);
        String json_household_members_1 = gson.toJson(household_members_1);
        String json_household_member_competence_certificates_1 = gson.toJson(household_member_competence_certificates_1);
        String json_household_member_educational_backgrounds_1 = gson.toJson(household_member_educational_backgrounds_1);
        String json_household_member_employment_status_1 = gson.toJson(household_member_employment_status_1);
        String json_household_member_health_statuses_1 = gson.toJson(household_member_health_statuses_1);
        String json_household_member_licenses_1 = gson.toJson(household_member_licenses_1);
        String json_household_member_medications_1 = gson.toJson(household_member_medications_1);
        String json_household_member_prefered_works_1 = gson.toJson(household_member_prefered_works_1);
        String json_household_member_skills_1 = gson.toJson(household_member_skills_1);
        String json_household_member_vocational_experiences_1 = gson.toJson(household_member_vocational_experiences_1);
        String json_household_member_work_experiences_1 = gson.toJson(household_member_work_experiences_1);
        String json_houses_1 = gson.toJson(houses_1);

//        System.out.println("" + json_household_member_competence_certificates_0);
//        List<Households.to_households> house = gson.fromJson(json, List.class);
//        System.out.println("Size: " + house.size());
        String url = "http://localhost:8000/api/upload.new";
//        System.out.println("households 0 : " + json_households_0);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("households", json_households_0);
        jsonObject.addProperty("household_assets", json_household_assets_0);
        jsonObject.addProperty("household_consumptions", json_household_consumptions_0);
        jsonObject.addProperty("household_expenditures", json_household_expenditures_0);
        jsonObject.addProperty("household_members", json_household_members_0);
        jsonObject.addProperty("household_member_competence_certificates", json_household_member_competence_certificates_0);
        jsonObject.addProperty("household_member_educational_backgrounds", json_household_member_educational_backgrounds_0);
        jsonObject.addProperty("household_member_employment_status", json_household_member_employment_status_0);
        jsonObject.addProperty("household_member_health_statuses", json_household_member_health_statuses_0);
        jsonObject.addProperty("household_member_licenses", json_household_member_licenses_0);
        jsonObject.addProperty("household_member_medications", json_household_member_medications_0);
        jsonObject.addProperty("household_member_prefered_works", json_household_member_prefered_works_0);
        jsonObject.addProperty("household_member_skills", json_household_member_skills_0);
        jsonObject.addProperty("household_member_vocational_experiences", json_household_member_vocational_experiences_0);
        jsonObject.addProperty("household_member_work_experiences", json_household_member_work_experiences_0);
        jsonObject.addProperty("houses", json_houses_0);

        try {
            String urlParameters = "data=" + jsonObject;
//            System.out.println("" + urlParameters);
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
            writer.write(urlParameters);
            writer.flush();

            int responseCode = conn.getResponseCode();
            String message = conn.getResponseMessage();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);
            System.out.println("Response Message : " + message);

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = reader.readLine();
//            System.out.println("return: " + line);
            
            writer.close();
            reader.close();

            JsonParser parser = new JsonParser();
            JsonObject jObj = (JsonObject) parser.parse(line);
            
            String[] r_households = getIds(jObj, "households");
            String[] r_household_assets = getIds(jObj, "household_assets");
            String[] r_household_consumptions = getIds(jObj, "household_consumptions");
            String[] r_household_expenditures = getIds(jObj, "household_expenditures");
            String[] r_household_members = getIds(jObj, "household_members");
            String[] r_household_member_competence_certificates = getIds(jObj, "household_member_competence_certificates");
            String[] r_household_member_educational_backgrounds = getIds(jObj, "household_member_educational_backgrounds");
            String[] r_household_member_employment_status = getIds(jObj, "household_member_employment_status");
            String[] r_household_member_health_statuses = getIds(jObj, "household_member_health_statuses");
            String[] r_household_member_licenses = getIds(jObj, "household_member_licenses");
            String[] r_household_member_medications = getIds(jObj, "household_member_medications");
            String[] r_household_member_prefered_works = getIds(jObj, "household_member_prefered_works");
            String[] r_household_member_skills = getIds(jObj, "household_member_skills");
            String[] r_household_member_vocational_experiences = getIds(jObj, "household_member_vocational_experiences");
            String[] r_household_member_work_experiences = getIds(jObj, "household_member_work_experiences");
            String[] r_houses = getIds(jObj, "houses");

            int status = 0;
            int is_uploaded = 1;
            Households.update_upload_status(status, is_uploaded, r_households, r_household_assets, r_household_consumptions, r_household_expenditures, r_household_members, r_household_member_competence_certificates, r_household_member_educational_backgrounds, r_household_member_employment_status, r_household_member_health_statuses, r_household_member_licenses, r_household_member_medications, r_household_member_prefered_works, r_household_member_skills, r_household_member_vocational_experiences, r_household_member_work_experiences, r_houses);
            
        } catch (IOException ex) {
            Logger.getLogger(Dlg_upload.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String[] getIds(JsonObject jObj, String name) {

        JsonElement l = jObj.get(name);
        String element = l.toString();
        String[] a = {};
        if (!element.equals("[]")) {
            element = element.replace("[", "");
            element = element.replace("]", "");
            a = element.split(",");
        }
        return a;
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

}
