/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangay_payments;

import city_planning.initialize_fields.Initialize_household_member_field_types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author User
 */
public class Dlg_barangay_clearance_payment extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_barangay_clearance_payment
     */
    public Dlg_barangay_clearance_payment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_blood_type = new Field.Combo();
        jLabel113 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_facilities8 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        tf_medication_date_started = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_household_member_medications = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_assets2 = new Button.Default();
        tf_assets3 = new Button.Primary();
        tf_dosage1 = new Field.Input();
        jLabel130 = new javax.swing.JLabel();
        tf_blood_type1 = new Field.Combo();
        jLabel114 = new javax.swing.JLabel();
        tf_blood_type2 = new Field.Combo();
        jLabel115 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        tf_is_seeing_a_doctor_yes = new javax.swing.JCheckBox();
        tf_blood_type3 = new Field.Combo();
        jLabel116 = new javax.swing.JLabel();
        tf_dosage2 = new Field.Input();
        jLabel131 = new javax.swing.JLabel();

        tf_blood_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_blood_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_blood_typeMouseClicked(evt);
            }
        });
        tf_blood_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_blood_typeActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Blood Type:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities8.setText("Barangay Clearance Payment");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel127.setText("Payment Date:");

        tf_medication_date_started.setDate(new Date());
        tf_medication_date_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_medications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_household_member_medications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_medicationsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_household_member_medications);

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        tf_assets2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets2.setText("New");
        tf_assets2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets2ActionPerformed(evt);
            }
        });

        tf_assets3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets3.setText("Save");
        tf_assets3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets3ActionPerformed(evt);
            }
        });

        tf_dosage1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setText("Amount:");

        tf_blood_type1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_blood_type1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_blood_type1MouseClicked(evt);
            }
        });
        tf_blood_type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_blood_type1ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Clearance Type:");

        tf_blood_type2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_blood_type2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_blood_type2MouseClicked(evt);
            }
        });
        tf_blood_type2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_blood_type2ActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("Purpose:");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setText("Payment Type");

        tf_is_seeing_a_doctor_yes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_is_seeing_a_doctor_yes.setSelected(true);
        tf_is_seeing_a_doctor_yes.setText("Fixed");
        tf_is_seeing_a_doctor_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_seeing_a_doctor_yesActionPerformed(evt);
            }
        });

        tf_blood_type3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_blood_type3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_blood_type3MouseClicked(evt);
            }
        });
        tf_blood_type3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_blood_type3ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Purpose Detail:");

        tf_dosage2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_dosage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dosage2ActionPerformed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel131.setText("Change:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_dosage2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_facilities8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_blood_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel114)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_blood_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_blood_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_is_seeing_a_doctor_yes)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_dosage1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_facilities8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_blood_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_is_seeing_a_doctor_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_blood_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_blood_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dosage1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_dosage2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_household_member_medicationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_medicationsMouseClicked

    }//GEN-LAST:event_tbl_household_member_medicationsMouseClicked

    private void tf_assets2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets2ActionPerformed

    }//GEN-LAST:event_tf_assets2ActionPerformed

    private void tf_assets3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets3ActionPerformed

    }//GEN-LAST:event_tf_assets3ActionPerformed

    private void tf_blood_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_typeMouseClicked
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeMouseClicked

    private void tf_blood_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_typeActionPerformed
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeActionPerformed

    private void tf_blood_type1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_type1MouseClicked
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_type1MouseClicked

    private void tf_blood_type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_type1ActionPerformed
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_type1ActionPerformed

    private void tf_blood_type2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_type2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_blood_type2MouseClicked

    private void tf_blood_type2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_type2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_blood_type2ActionPerformed

    private void tf_is_seeing_a_doctor_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_seeing_a_doctor_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_seeing_a_doctor_yesActionPerformed

    private void tf_blood_type3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_type3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_blood_type3MouseClicked

    private void tf_blood_type3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_type3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_blood_type3ActionPerformed

    private void tf_dosage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dosage2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dosage2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dlg_barangay_clearance_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dlg_barangay_clearance_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dlg_barangay_clearance_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dlg_barangay_clearance_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dlg_barangay_clearance_payment dialog = new Dlg_barangay_clearance_payment(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_facilities8;
    private javax.swing.JTable tbl_household_member_medications;
    private javax.swing.JButton tf_assets2;
    private javax.swing.JButton tf_assets3;
    private javax.swing.JTextField tf_blood_type;
    private javax.swing.JTextField tf_blood_type1;
    private javax.swing.JTextField tf_blood_type2;
    private javax.swing.JTextField tf_blood_type3;
    private javax.swing.JTextField tf_dosage1;
    private javax.swing.JTextField tf_dosage2;
    private javax.swing.JCheckBox tf_is_seeing_a_doctor_yes;
    private com.toedter.calendar.JDateChooser tf_medication_date_started;
    // End of variables declaration//GEN-END:variables
    static List<Clearance> clerance_type = new ArrayList();

    public static void ret_data() {
//        Clearance.to_clearance c1 = new Clearance.to_clearance(0, "Barangay Clearance");
//        Clearancet.o_clearance c2 = new Clearance.to_clearance(0, "Business Permit");
//        clerance_type.add(c1);
//        clerance_type.add(c2);
    }
}