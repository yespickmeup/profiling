/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

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
import city_planning.initialize_fields.Initialize_household_member_field_types;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.DateType;
import city_planning.util.Dlg_confirm_action;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_household_members extends javax.swing.JDialog {

    /**
     * Creates new form dig_household_members
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

        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        public final String gender;
        public final String marital_status;
        public final String bday;
        public final double occupancy_years;
        public final String height;
        public final String weight;
        public final String birth_place;
        public final String present_address;
        public final String relation_to_household;
        public final String religion;
        public final String citizenship;
        public final String email_address;
        public final String blood_type;
        public final String languages_spoken;
        public final int is_registered_voter;
        public final String voters_id_no;
        public final List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses;
        public final List<Household_member_medications.to_household_member_medications> health_medications;
        public final List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds;
        public final List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences;
        public final List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates;
        public final List<Household_member_licences.to_household_member_licenses> licenses;
        public final List<Household_member_work_experiences.to_household_member_work_experiences> work_experience;
        public final List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works;
        public final Household_member_employment_status.to_household_member_employment_status employment_status;
        public final Household_member_skills.to_household_member_skills skills;
        public final String image;

        public OutputData(String fname, String mname, String lname, String sname, String gender, String marital_status, String bday, double occupancy_years, String height, String weight, String birth_place, String present_address, String relation_to_household, String religion, String citizenship, String email_address, String blood_type, String languages_spoken, int is_registered_voter, String voters_id_no, List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses, List<Household_member_medications.to_household_member_medications> health_medications, List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds, List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences, List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates, List<Household_member_licences.to_household_member_licenses> licenses, List<Household_member_work_experiences.to_household_member_work_experiences> work_experience, List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works, Household_member_employment_status.to_household_member_employment_status employment_status, Household_member_skills.to_household_member_skills skills, String image) {
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.gender = gender;
            this.marital_status = marital_status;
            this.bday = bday;
            this.occupancy_years = occupancy_years;
            this.height = height;
            this.weight = weight;
            this.birth_place = birth_place;
            this.present_address = present_address;
            this.relation_to_household = relation_to_household;
            this.religion = religion;
            this.citizenship = citizenship;
            this.email_address = email_address;
            this.blood_type = blood_type;
            this.languages_spoken = languages_spoken;
            this.is_registered_voter = is_registered_voter;
            this.voters_id_no = voters_id_no;
            this.health_statuses = health_statuses;
            this.health_medications = health_medications;
            this.educational_backgrounds = educational_backgrounds;
            this.vocational_experiences = vocational_experiences;
            this.competence_certificates = competence_certificates;
            this.licenses = licenses;
            this.work_experience = work_experience;
            this.prefered_works = prefered_works;
            this.employment_status = employment_status;
            this.skills = skills;
            this.image = image;
        }

    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">

    private Dlg_household_members(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_household_members(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_household_members() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_household_members myRef;

    private void setThisRef(Dlg_household_members myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_household_members> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_household_members create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_household_members create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_household_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_household_members((java.awt.Frame) parent, false);
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
            Dlg_household_members dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_household_members((java.awt.Dialog) parent, false);
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

        Dlg_household_members dialog = Dlg_household_members.create(new javax.swing.JFrame(), true);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tf_height = new Field.Input();
        jTextField48 = new Field.Input();
        jLabel108 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        tf_lname = new Field.Input();
        tf_others_relations = new Field.Input();
        tf_citizenship = new Field.Input();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        tf_languages_spoken = new Field.Combo();
        jLabel109 = new javax.swing.JLabel();
        tf_birth_place = new Field.Input();
        jLabel106 = new javax.swing.JLabel();
        tf_occupancy_years = new Field.Input();
        tf_present_address = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        tf_genders = new Field.Combo();
        jLabel100 = new javax.swing.JLabel();
        tf_bday = new com.toedter.calendar.JDateChooser();
        tf_maritals = new Field.Combo();
        jLabel113 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        tf_blood_type = new Field.Combo();
        tf_relation = new Field.Combo();
        cb_is_registered_voter = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        tf_is_registered_voter = new Field.Input();
        tf_email_address = new Field.Input();
        jLabel111 = new javax.swing.JLabel();
        tf_religions = new Field.Combo();
        jLabel112 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        tf_mname = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_sname = new Field.Combo();
        lbl_facilities6 = new javax.swing.JLabel();
        tf_others_language = new Field.Input();
        tf_fname = new Field.Input();
        jButton13 = new Button.Info();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        tf_genders1 = new Field.Input();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbl_facilities9 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        tf_educational_status = new Field.Input();
        jLabel234 = new javax.swing.JLabel();
        tf_name_of_school = new Field.Input();
        jLabel235 = new javax.swing.JLabel();
        tf_achievements = new Field.Input();
        jLabel236 = new javax.swing.JLabel();
        tf_highest_grade = new Field.Input();
        jLabel237 = new javax.swing.JLabel();
        tf_year_graduated = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_household_member_educational_backgrounds = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_assets4 = new Button.Default();
        tf_assets5 = new Button.Primary();
        jPanel7 = new javax.swing.JPanel();
        lbl_facilities10 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        tf_name_of_training = new Field.Input();
        tf_certificate_received = new Field.Input();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        tf_skills_required = new Field.Input();
        jLabel241 = new javax.swing.JLabel();
        tf_name_of_school_or_agency = new Field.Input();
        jLabel242 = new javax.swing.JLabel();
        tf_period_of_training = new Field.Input();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_household_member_vocational_experiences = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_assets6 = new Button.Primary();
        tf_assets7 = new Button.Default();
        jPanel3 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        tf_is_seeing_a_doctor_yes = new javax.swing.JCheckBox();
        tf_is_seeing_a_doctor_no = new javax.swing.JCheckBox();
        jLabel119 = new javax.swing.JLabel();
        tf_status_normal = new javax.swing.JCheckBox();
        tf_status_pwd = new javax.swing.JCheckBox();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        tf_disabilities = new Field.Combo();
        tf_name_of_doctor = new Field.Input();
        tf_cause_of_disability = new Field.Input();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_household_member_health_statuses = new javax.swing.JTable();
        tf_level_of_disability = new Field.Input();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_facilities7 = new javax.swing.JLabel();
        tf_assets1 = new Button.Default();
        tf_assets = new Button.Primary();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lbl_facilities13 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        tf_company = new Field.Input();
        jLabel249 = new javax.swing.JLabel();
        tf_company_address = new Field.Input();
        jLabel251 = new javax.swing.JLabel();
        tf_work_position = new Field.Input();
        jLabel252 = new javax.swing.JLabel();
        tf_work_started = new com.toedter.calendar.JDateChooser();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_household_member_work_experiences = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        tf_work_description = new Field.Input();
        tf_work_ended = new com.toedter.calendar.JDateChooser();
        jLabel254 = new javax.swing.JLabel();
        tf_assets12 = new Button.Default();
        tf_assets13 = new Button.Primary();
        jPanel13 = new javax.swing.JPanel();
        lbl_facilities14 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        tf_work = new Field.Input();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_household_member_prefered_works = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_assets14 = new Button.Default();
        tf_assets15 = new Button.Primary();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_facilities11 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        tf_certificate = new Field.Input();
        jLabel244 = new javax.swing.JLabel();
        tf_rating = new Field.Input();
        jLabel245 = new javax.swing.JLabel();
        tf_issued_by = new Field.Input();
        jLabel247 = new javax.swing.JLabel();
        tf_date_issued = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_household_member_competence_certificates = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_assets8 = new Button.Default();
        tf_assets9 = new Button.Primary();
        jPanel10 = new javax.swing.JPanel();
        lbl_facilities12 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        tf_title = new Field.Input();
        jLabel250 = new javax.swing.JLabel();
        tf_expiry = new com.toedter.calendar.JDateChooser();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_household_member_licenses = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_assets10 = new Button.Default();
        tf_assets11 = new Button.Primary();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lbl_facilities15 = new javax.swing.JLabel();
        cb_employment_ofw1 = new javax.swing.JRadioButton();
        cb_employment_office_holder1 = new javax.swing.JRadioButton();
        jLabel256 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        cb_status_unemployed1 = new javax.swing.JCheckBox();
        cb_status_employed1 = new javax.swing.JCheckBox();
        cb_employment_worker1 = new javax.swing.JRadioButton();
        cb_employment_employee1 = new javax.swing.JRadioButton();
        cb_employment_self_employed1 = new javax.swing.JRadioButton();
        cb_employment_director1 = new javax.swing.JRadioButton();
        jLabel257 = new javax.swing.JLabel();
        tf_position = new Field.Input();
        jLabel258 = new javax.swing.JLabel();
        jTextField145 = new Field.Input();
        cb_status_unemployed2 = new javax.swing.JCheckBox();
        tf_comapany = new Field.Input();
        lbl_facilities16 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        tf_ofw_business_name = new Field.Input();
        jLabel260 = new javax.swing.JLabel();
        tf_ofw_business_address = new Field.Input();
        jLabel261 = new javax.swing.JLabel();
        tf_ofw_mailing_address = new Field.Input();
        jLabel262 = new javax.swing.JLabel();
        tf_ofw_type_of_business = new Field.Input();
        jLabel264 = new javax.swing.JLabel();
        tf_ofw_financial_assistance_amount = new Field.Input();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        tf_ofw_country = new Field.Input();
        tf_ofw_job = new Field.Input();
        tf_ofw_reason_for_migration = new Field.Input();
        jButton14 = new Button.Info();
        jPanel17 = new javax.swing.JPanel();
        cb_ts_assembling = new javax.swing.JCheckBox();
        cb_ts_setting_up = new javax.swing.JCheckBox();
        cb_ts_machine_work = new javax.swing.JCheckBox();
        jLabel268 = new javax.swing.JLabel();
        cb_ts_driving = new javax.swing.JCheckBox();
        cb_ts_operating = new javax.swing.JCheckBox();
        cb_ds_copying = new javax.swing.JCheckBox();
        cb_ds_tabulating = new javax.swing.JCheckBox();
        cb_ds_posting = new javax.swing.JCheckBox();
        cb_is_discovering = new javax.swing.JCheckBox();
        cb_is_interpreting = new javax.swing.JCheckBox();
        organizing = new javax.swing.JCheckBox();
        cb_is_creating = new javax.swing.JCheckBox();
        cb_is_anticipating = new javax.swing.JCheckBox();
        cb_is_instruction = new javax.swing.JCheckBox();
        cb_is_speculation = new javax.swing.JCheckBox();
        cb_ds_computing = new javax.swing.JCheckBox();
        cb_ds_compiling = new javax.swing.JCheckBox();
        cb_ds_checking = new javax.swing.JCheckBox();
        cb_ds_recording = new javax.swing.JCheckBox();
        cb_ds_testing = new javax.swing.JCheckBox();
        cb_is_implementing = new javax.swing.JCheckBox();
        cb_is_synthesizing = new javax.swing.JCheckBox();
        cb_ds_researching = new javax.swing.JCheckBox();
        cb_ds_comparing = new javax.swing.JCheckBox();
        jLabel269 = new javax.swing.JLabel();
        cb_ds_coordinating = new javax.swing.JCheckBox();
        cb_ds_analyzing = new javax.swing.JCheckBox();
        cb_ds_planning = new javax.swing.JCheckBox();
        cb_is_expressing = new javax.swing.JCheckBox();
        cb_is_innovating = new javax.swing.JCheckBox();
        cb_is_theorizing = new javax.swing.JCheckBox();
        cb_is_predicting = new javax.swing.JCheckBox();
        cb_ps_teaching = new javax.swing.JCheckBox();
        cb_ps_negotiating = new javax.swing.JCheckBox();
        jLabel270 = new javax.swing.JLabel();
        cb_ps_diverting = new javax.swing.JCheckBox();
        cb_ts_feeding = new javax.swing.JCheckBox();
        cb_ts_building = new javax.swing.JCheckBox();
        cb_ts_warehousing = new javax.swing.JCheckBox();
        cb_ps_promoting = new javax.swing.JCheckBox();
        cb_ts_restoring = new javax.swing.JCheckBox();
        cb_ps_persuading = new javax.swing.JCheckBox();
        cb_ts_precision = new javax.swing.JCheckBox();
        cb_ps_selling = new javax.swing.JCheckBox();
        cb_ts_manipulating = new javax.swing.JCheckBox();
        cb_ps_leading = new javax.swing.JCheckBox();
        cb_ts_materials_handling = new javax.swing.JCheckBox();
        cb_ps_speaking = new javax.swing.JCheckBox();
        cb_ts_producing = new javax.swing.JCheckBox();
        cb_ps_serving = new javax.swing.JCheckBox();
        cb_ts_inspecting = new javax.swing.JCheckBox();
        cb_ps_helping = new javax.swing.JCheckBox();
        cb_ps_encouraging = new javax.swing.JCheckBox();
        cb_ps_motivating = new javax.swing.JCheckBox();
        jLabel271 = new javax.swing.JLabel();
        cb_ts_repairing = new javax.swing.JCheckBox();
        lbl_facilities17 = new javax.swing.JLabel();
        jButton16 = new Button.Info();
        jPanel4 = new javax.swing.JPanel();
        lbl_facilities8 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        tf_medication_date_started = new com.toedter.calendar.JDateChooser();
        tf_prescription = new Field.Input();
        jLabel128 = new javax.swing.JLabel();
        tf_medication_date_ended = new com.toedter.calendar.JDateChooser();
        tf_dosage = new Field.Input();
        jLabel129 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_household_member_medications = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_assets2 = new Button.Default();
        tf_assets3 = new Button.Primary();
        jButton10 = new Button.Default();
        jButton12 = new Button.Primary();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tf_height.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("Others specify:");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setText("Height:");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("Weight:");

        tf_lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_others_relations.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_others_relations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_others_relationsActionPerformed(evt);
            }
        });

        tf_citizenship.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_citizenship.setText("Filipino");
        tf_citizenship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_citizenshipActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("Others specify:");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("Languages Spoken:");

        tf_languages_spoken.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_languages_spoken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_languages_spokenMouseClicked(evt);
            }
        });
        tf_languages_spoken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_languages_spokenActionPerformed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Present address:");

        tf_birth_place.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Birthplace:");

        tf_occupancy_years.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_present_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("First Name:");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Occupancy Year/s:");

        tf_genders.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_genders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_gendersMouseClicked(evt);
            }
        });
        tf_genders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_gendersActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("Gender:");

        tf_bday.setDate(new Date());
        tf_bday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_maritals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_maritals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_maritalsMouseClicked(evt);
            }
        });
        tf_maritals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_maritalsActionPerformed(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("Blood Type:");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Birthdate:");

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

        tf_relation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_relation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_relationMouseClicked(evt);
            }
        });
        tf_relation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_relationActionPerformed(evt);
            }
        });

        cb_is_registered_voter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_registered_voter.setSelected(true);
        cb_is_registered_voter.setText("Registered Voter");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("Relation to Household:");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("Voters ID No.");

        tf_is_registered_voter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_email_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_email_address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_email_addressMouseClicked(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setText("Email address:");

        tf_religions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_religions.setText("Roman Catholic");
        tf_religions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_religionsMouseClicked(evt);
            }
        });
        tf_religions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_religionsActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setText("Religion:");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("Marital Status:");

        tf_mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Middle Name:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Suffix Name:");

        tf_sname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_sname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_snameMouseClicked(evt);
            }
        });
        tf_sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_snameActionPerformed(evt);
            }
        });

        lbl_facilities6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities6.setText("[BASIC INFORMATION]");

        tf_others_language.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_others_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_others_languageActionPerformed(evt);
            }
        });

        tf_fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fnameActionPerformed(evt);
            }
        });

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("Image:");

        tf_genders1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_genders1.setFocusable(false);
        tf_genders1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_genders1MouseClicked(evt);
            }
        });
        tf_genders1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_genders1ActionPerformed(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel124.setText("cm");

        jLabel125.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel125.setText("kg");

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setText("Citizenship:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_facilities6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(413, 413, 413))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tf_religions, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel110)
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel130)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel107)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_relation, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_others_relations, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel109)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_present_address))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel113)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_blood_type, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cb_is_registered_voter)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel116)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_is_registered_voter))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel114)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_languages_spoken, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel115)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_others_language))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_birth_place)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addComponent(tf_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addGap(4, 4, 4)))
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addGap(0, 0, Short.MAX_VALUE)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(tf_genders1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(tf_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(tf_sname, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(tf_occupancy_years, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_genders, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_maritals, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                            .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_facilities6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_sname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_genders1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_genders, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_maritals, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_occupancy_years, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_height, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_birth_place, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_present_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_relation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_others_relations, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_religions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_blood_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_languages_spoken, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_others_language, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_registered_voter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_is_registered_voter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BASIC INFORMATION", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities9.setText("[EDUCATIONAL BACKGROUND]");

        jLabel233.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel233.setText("Educatonal Status:");

        tf_educational_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_educational_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_educational_statusActionPerformed(evt);
            }
        });

        jLabel234.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel234.setText("Name of School:");

        tf_name_of_school.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_school.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_schoolActionPerformed(evt);
            }
        });

        jLabel235.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel235.setText("Achievements:");

        tf_achievements.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_achievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_achievementsActionPerformed(evt);
            }
        });

        jLabel236.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel236.setText("Highest Grade Completed:");

        tf_highest_grade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel237.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel237.setText("Date Graduated:");

        tf_year_graduated.setDate(new Date());
        tf_year_graduated.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_educational_backgrounds.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_educational_backgrounds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_educational_backgroundsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_household_member_educational_backgrounds);

        jLabel5.setText("No. of rows:");

        jLabel6.setText("0");

        tf_assets4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets4.setText("New");
        tf_assets4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets4ActionPerformed(evt);
            }
        });

        tf_assets5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets5.setText("Save");
        tf_assets5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tf_assets4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel236)
                        .addGap(18, 18, 18)
                        .addComponent(tf_highest_grade))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel235, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel234, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel233, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_educational_status)
                            .addComponent(tf_name_of_school)
                            .addComponent(tf_achievements)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_year_graduated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_educational_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel234, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_school, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_highest_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel237, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_year_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities10.setText("[VOCATIONAL/TECHNICAL & RELEVANT EXPERIENCE]");

        jLabel238.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel238.setText("Name of Training:");

        tf_name_of_training.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_certificate_received.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel239.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel239.setText("Certificate Received:");

        jLabel240.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel240.setText("Skills Required:");

        tf_skills_required.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_skills_required.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_skills_requiredActionPerformed(evt);
            }
        });

        jLabel241.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel241.setText("School/Agency:");

        tf_name_of_school_or_agency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_school_or_agency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_school_or_agencyActionPerformed(evt);
            }
        });

        jLabel242.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel242.setText("Period of Training:");

        tf_period_of_training.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_period_of_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_period_of_trainingActionPerformed(evt);
            }
        });

        tbl_household_member_vocational_experiences.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_vocational_experiences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_vocational_experiencesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_household_member_vocational_experiences);

        jLabel7.setText("No. of rows:");

        jLabel8.setText("0");

        tf_assets6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets6.setText("Save");
        tf_assets6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets6ActionPerformed(evt);
            }
        });

        tf_assets7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets7.setText("New");
        tf_assets7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addComponent(lbl_facilities10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel240, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel239, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel238, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_name_of_training)
                            .addComponent(tf_certificate_received)
                            .addComponent(tf_skills_required)
                            .addComponent(tf_name_of_school_or_agency)
                            .addComponent(tf_period_of_training)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel238, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_training, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel239, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_certificate_received, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel240, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_skills_required, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_school_or_agency, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_period_of_training, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("EDUCATION BACKGROUND", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("Seeing a Doctor?");

        buttonGroup1.add(tf_is_seeing_a_doctor_yes);
        tf_is_seeing_a_doctor_yes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_is_seeing_a_doctor_yes.setSelected(true);
        tf_is_seeing_a_doctor_yes.setText("Yes");
        tf_is_seeing_a_doctor_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_seeing_a_doctor_yesActionPerformed(evt);
            }
        });

        buttonGroup1.add(tf_is_seeing_a_doctor_no);
        tf_is_seeing_a_doctor_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_is_seeing_a_doctor_no.setText("No");
        tf_is_seeing_a_doctor_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_is_seeing_a_doctor_noActionPerformed(evt);
            }
        });

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("Status:");

        buttonGroup2.add(tf_status_normal);
        tf_status_normal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_status_normal.setSelected(true);
        tf_status_normal.setText("Normal");
        tf_status_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_status_normalActionPerformed(evt);
            }
        });

        buttonGroup2.add(tf_status_pwd);
        tf_status_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_status_pwd.setText("PWD");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setText("Name of Doctor:");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setText("Level of Disabilty:");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setText("Cause:");

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("Disabilities:");

        tf_disabilities.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_disabilities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_disabilitiesMouseClicked(evt);
            }
        });
        tf_disabilities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disabilitiesActionPerformed(evt);
            }
        });

        tf_name_of_doctor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_name_of_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_name_of_doctorActionPerformed(evt);
            }
        });

        tf_cause_of_disability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_cause_of_disability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cause_of_disabilityActionPerformed(evt);
            }
        });

        tbl_household_member_health_statuses.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_health_statuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_health_statusesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_household_member_health_statuses);

        tf_level_of_disability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_level_of_disability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_level_of_disabilityActionPerformed(evt);
            }
        });

        jLabel1.setText("No. of rows:");

        jLabel2.setText("0");

        lbl_facilities7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities7.setText("[HEALTH STATUS]");

        tf_assets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets1.setText("New");
        tf_assets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets1ActionPerformed(evt);
            }
        });

        tf_assets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets.setText("Save");
        tf_assets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_level_of_disability)
                                    .addComponent(tf_disabilities)
                                    .addComponent(tf_name_of_doctor)
                                    .addComponent(tf_cause_of_disability)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_is_seeing_a_doctor_yes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_is_seeing_a_doctor_no)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_status_normal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_status_pwd))
                            .addComponent(lbl_facilities7, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_facilities7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_seeing_a_doctor_yes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_is_seeing_a_doctor_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_status_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_status_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_name_of_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_disabilities, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_level_of_disability, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cause_of_disability, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("HEALTH STATUS", jPanel3);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities13.setText("[WORK EXPERIENCE]");

        jLabel248.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel248.setText("Company:");

        tf_company.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel249.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel249.setText("Address:");

        tf_company_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel251.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel251.setText("Position:");

        tf_work_position.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_work_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_work_positionActionPerformed(evt);
            }
        });

        jLabel252.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel252.setText("Date From:");

        tf_work_started.setDate(new Date());
        tf_work_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_work_experiences.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_work_experiences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_work_experiencesMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_household_member_work_experiences);

        jLabel17.setText("No. of rows:");

        jLabel18.setText("0");

        jLabel253.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel253.setText("Description:");

        tf_work_description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_work_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_work_descriptionActionPerformed(evt);
            }
        });

        tf_work_ended.setDate(new Date());
        tf_work_ended.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel254.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel254.setText("To:");

        tf_assets12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets12.setText("New");
        tf_assets12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets12ActionPerformed(evt);
            }
        });

        tf_assets13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets13.setText("Save");
        tf_assets13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(tf_assets12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lbl_facilities13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel253, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(jLabel248, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel251, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_work_position)
                                .addComponent(tf_company_address)
                                .addComponent(tf_company)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                    .addComponent(tf_work_started, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel254)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_work_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_work_description)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_company, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel249, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_company_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel251, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_position, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_started, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel254, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities14.setText("[PREFERED WORK]");

        jLabel255.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel255.setText("Work:");

        tf_work.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_prefered_works.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_prefered_works.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_prefered_worksMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_household_member_prefered_works);

        jLabel19.setText("No. of rows:");

        jLabel20.setText("0");

        tf_assets14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets14.setText("New");
        tf_assets14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets14ActionPerformed(evt);
            }
        });

        tf_assets15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets15.setText("Save");
        tf_assets15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_work))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel255, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_work, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("WORK EXPERIENCE", jPanel11);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities11.setText("[CERTIFICATE OF COMPETENCE]");

        jLabel243.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel243.setText("Certificate:");

        tf_certificate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel244.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel244.setText("Rating:");

        tf_rating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel245.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel245.setText("Issued by:");

        tf_issued_by.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_issued_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_issued_byActionPerformed(evt);
            }
        });

        jLabel247.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel247.setText("Date Issued:");

        tf_date_issued.setDate(new Date());
        tf_date_issued.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_competence_certificates.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_competence_certificates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_competence_certificatesMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbl_household_member_competence_certificates);

        jLabel9.setText("No. of rows:");

        jLabel10.setText("0");

        tf_assets8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets8.setText("New");
        tf_assets8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets8ActionPerformed(evt);
            }
        });

        tf_assets9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets9.setText("Save");
        tf_assets9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(tf_assets8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel243, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel244, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel245, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel247, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_date_issued, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_issued_by)
                            .addComponent(tf_rating)
                            .addComponent(tf_certificate))))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_certificate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel244, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_issued_by, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel247, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_date_issued, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities12.setText("[LICENSE]");

        jLabel246.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel246.setText("Title:");

        tf_title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel250.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel250.setText("Expiry:");

        tf_expiry.setDate(new Date());
        tf_expiry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbl_household_member_licenses.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_household_member_licenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_member_licensesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_household_member_licenses);

        jLabel11.setText("No. of rows:");

        jLabel16.setText("0");

        tf_assets10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets10.setText("New");
        tf_assets10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets10ActionPerformed(evt);
            }
        });

        tf_assets11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets11.setText("Save");
        tf_assets11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(tf_assets10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_facilities12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel246, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel250, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_expiry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_title))))
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("LICENSE AND CERTIFICATES", jPanel8);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities15.setText("[EMPLOYMENT STATUS]");

        buttonGroup5.add(cb_employment_ofw1);
        cb_employment_ofw1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_ofw1.setText("OFW");
        cb_employment_ofw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_ofw1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(cb_employment_office_holder1);
        cb_employment_office_holder1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_office_holder1.setText("Office Holder");
        cb_employment_office_holder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_office_holder1ActionPerformed(evt);
            }
        });

        jLabel256.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel256.setText("Company:");

        buttonGroup6.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton8.setText("Terminated/Laid off, abroad");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton7.setText("Resigned");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton6.setText("Terminated/Laid Off,local");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("Finsihed Contract");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup4.add(cb_status_unemployed1);
        cb_status_unemployed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_unemployed1.setText("Unemployed");
        cb_status_unemployed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployed1ActionPerformed(evt);
            }
        });

        buttonGroup4.add(cb_status_employed1);
        cb_status_employed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_employed1.setSelected(true);
        cb_status_employed1.setText("Employed");

        buttonGroup5.add(cb_employment_worker1);
        cb_employment_worker1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_worker1.setText("Worker");
        cb_employment_worker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_worker1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(cb_employment_employee1);
        cb_employment_employee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_employee1.setSelected(true);
        cb_employment_employee1.setText("Employee");
        cb_employment_employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_employee1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(cb_employment_self_employed1);
        cb_employment_self_employed1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_self_employed1.setText("Self Employed");
        cb_employment_self_employed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_self_employed1ActionPerformed(evt);
            }
        });

        buttonGroup5.add(cb_employment_director1);
        cb_employment_director1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_employment_director1.setText("Director");
        cb_employment_director1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_director1ActionPerformed(evt);
            }
        });

        jLabel257.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel257.setText("Position:");

        tf_position.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_positionActionPerformed(evt);
            }
        });

        jLabel258.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel258.setText("Description:");

        jTextField145.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField145ActionPerformed(evt);
            }
        });

        cb_status_unemployed2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_status_unemployed2.setSelected(true);
        cb_status_unemployed2.setText("Are you currently looking for work?");
        cb_status_unemployed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployed2ActionPerformed(evt);
            }
        });

        tf_comapany.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_comapany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_comapanyActionPerformed(evt);
            }
        });

        lbl_facilities16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities16.setText("[OFW]");

        jLabel259.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel259.setText("Name of Business:");

        tf_ofw_business_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_business_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel260.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel260.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel260.setText("Business Address:");

        tf_ofw_business_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_business_address.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel261.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel261.setText("Mailing Address:");

        tf_ofw_mailing_address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_mailing_address.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel262.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel262.setText("Type of Business:");

        tf_ofw_type_of_business.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_type_of_business.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_ofw_type_of_business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ofw_type_of_businessActionPerformed(evt);
            }
        });

        jLabel264.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel264.setText("Financial Assistant Amount:");

        tf_ofw_financial_assistance_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_financial_assistance_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ofw_financial_assistance_amountActionPerformed(evt);
            }
        });

        jLabel265.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel265.setText("Country:");

        jLabel266.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel266.setText("Profession/Job:");

        jLabel267.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel267.setText("Reason for Migration:");

        tf_ofw_country.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ofw_countryActionPerformed(evt);
            }
        });

        tf_ofw_job.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ofw_jobActionPerformed(evt);
            }
        });

        tf_ofw_reason_for_migration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ofw_reason_for_migration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ofw_reason_for_migrationActionPerformed(evt);
            }
        });

        jButton14.setText("Update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel259, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel260, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel261, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ofw_business_address)
                            .addComponent(tf_ofw_mailing_address, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_ofw_type_of_business, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_ofw_business_name)))
                    .addComponent(lbl_facilities16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_facilities15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel257, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel256, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                            .addComponent(jLabel258))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField145)
                            .addComponent(tf_position)
                            .addComponent(tf_comapany)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(cb_status_unemployed2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(cb_status_unemployed1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(cb_status_employed1)
                                .addGap(18, 18, 18)
                                .addComponent(cb_employment_worker1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_employment_employee1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_employment_self_employed1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_employment_director1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_employment_office_holder1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_employment_ofw1))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jRadioButton8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ofw_financial_assistance_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel267, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel265, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_ofw_job)
                                .addComponent(tf_ofw_reason_for_migration)
                                .addComponent(tf_ofw_country, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))))
                .addGap(64, 64, 64))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status_employed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_worker1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_employee1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_self_employed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_director1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_office_holder1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_employment_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_status_unemployed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel256, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_comapany, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_position, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel257, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status_unemployed2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lbl_facilities16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel259, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ofw_business_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel264, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ofw_financial_assistance_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ofw_business_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel260, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ofw_mailing_address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ofw_type_of_business, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel262, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel265, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ofw_country, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ofw_job, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel266, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ofw_reason_for_migration, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel267, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EMPLOYMENT STATUS", jPanel14);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        cb_ts_assembling.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_assembling.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_assembling.setText("Assembling");
        cb_ts_assembling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_assemblingActionPerformed(evt);
            }
        });

        cb_ts_setting_up.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_setting_up.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_setting_up.setText("Setting-up");
        cb_ts_setting_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_setting_upActionPerformed(evt);
            }
        });

        cb_ts_machine_work.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_machine_work.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_machine_work.setText("Machine Work");

        jLabel268.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel268.setText("Thing Skills");

        cb_ts_driving.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_driving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_driving.setText("Driving/Steering");

        cb_ts_operating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_operating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_operating.setText("Operating/Controlling");
        cb_ts_operating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_operatingActionPerformed(evt);
            }
        });

        cb_ds_copying.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_copying.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_copying.setText("Copying");
        cb_ds_copying.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_ds_tabulating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_tabulating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_tabulating.setText("Tabulating");
        cb_ds_tabulating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_tabulatingActionPerformed(evt);
            }
        });

        cb_ds_posting.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_posting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_posting.setText("Posting");
        cb_ds_posting.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cb_ds_posting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_postingActionPerformed(evt);
            }
        });

        cb_is_discovering.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_discovering.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_discovering.setText("Discovering");

        cb_is_interpreting.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_interpreting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_interpreting.setText("Interpreting");
        cb_is_interpreting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_is_interpretingActionPerformed(evt);
            }
        });

        organizing.setBackground(new java.awt.Color(255, 255, 255));
        organizing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizing.setText("Organizing");
        organizing.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        organizing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizingActionPerformed(evt);
            }
        });

        cb_is_creating.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_creating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_creating.setText("Creating/Inventing");
        cb_is_creating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_is_creatingActionPerformed(evt);
            }
        });

        cb_is_anticipating.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_anticipating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_anticipating.setText("Anticipating");

        cb_is_instruction.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_instruction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_instruction.setText("Instruction");

        cb_is_speculation.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_speculation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_speculation.setText("Speculation");

        cb_ds_computing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_computing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_computing.setText("Computing");

        cb_ds_compiling.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_compiling.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_compiling.setText("Compiling");
        cb_ds_compiling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_compilingActionPerformed(evt);
            }
        });

        cb_ds_checking.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_checking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_checking.setText("Checking");

        cb_ds_recording.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_recording.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_recording.setText("Recording");
        cb_ds_recording.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_recordingActionPerformed(evt);
            }
        });

        cb_ds_testing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_testing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_testing.setText("Testing");

        cb_is_implementing.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_implementing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_implementing.setText("Implementing");

        cb_is_synthesizing.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_synthesizing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_synthesizing.setText("Synthesizing");
        cb_is_synthesizing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_is_synthesizingActionPerformed(evt);
            }
        });

        cb_ds_researching.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_researching.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_researching.setText("Researching");

        cb_ds_comparing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_comparing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_comparing.setText("Comparing");

        jLabel269.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel269.setText("Idea Skills");

        cb_ds_coordinating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_coordinating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_coordinating.setText("Coordinating");

        cb_ds_analyzing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_analyzing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_analyzing.setText("Analyzing");
        cb_ds_analyzing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_analyzingActionPerformed(evt);
            }
        });

        cb_ds_planning.setBackground(new java.awt.Color(255, 255, 255));
        cb_ds_planning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ds_planning.setText("Planning");
        cb_ds_planning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ds_planningActionPerformed(evt);
            }
        });

        cb_is_expressing.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_expressing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_expressing.setText("Expressing");
        cb_is_expressing.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_is_innovating.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_innovating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_innovating.setText("Innovating");

        cb_is_theorizing.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_theorizing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_theorizing.setText("Theorizing");

        cb_is_predicting.setBackground(new java.awt.Color(255, 255, 255));
        cb_is_predicting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_is_predicting.setText("Predicting");

        cb_ps_teaching.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_teaching.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_teaching.setText("Teaching");

        cb_ps_negotiating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_negotiating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_negotiating.setText("Negotiating");
        cb_ps_negotiating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_negotiatingActionPerformed(evt);
            }
        });

        jLabel270.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel270.setText("People Skills");

        cb_ps_diverting.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_diverting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_diverting.setText("Diverting");
        cb_ps_diverting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_divertingActionPerformed(evt);
            }
        });

        cb_ts_feeding.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_feeding.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_feeding.setText("Feeding/Loading");
        cb_ts_feeding.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_ts_building.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_building.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_building.setText("Building");

        cb_ts_warehousing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_warehousing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_warehousing.setText("Warehousing");

        cb_ps_promoting.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_promoting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_promoting.setText("Promoting");
        cb_ps_promoting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_promotingActionPerformed(evt);
            }
        });

        cb_ts_restoring.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_restoring.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_restoring.setText("Restoring");
        cb_ts_restoring.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_ps_persuading.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_persuading.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_persuading.setText("Persuading");

        cb_ts_precision.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_precision.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_precision.setText("Precision Working");
        cb_ts_precision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_ps_selling.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_selling.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_selling.setText("Selling");
        cb_ps_selling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_sellingActionPerformed(evt);
            }
        });

        cb_ts_manipulating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_manipulating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_manipulating.setText("Manipulating");
        cb_ts_manipulating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_manipulatingActionPerformed(evt);
            }
        });

        cb_ps_leading.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_leading.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_leading.setText("Leading");

        cb_ts_materials_handling.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_materials_handling.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_materials_handling.setText("Materials handling");

        cb_ps_speaking.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_speaking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_speaking.setText("Speaking");
        cb_ps_speaking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_speakingActionPerformed(evt);
            }
        });

        cb_ts_producing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_producing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_producing.setText("Producing");
        cb_ts_producing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_producingActionPerformed(evt);
            }
        });

        cb_ps_serving.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_serving.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_serving.setText("Serving");

        cb_ts_inspecting.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_inspecting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_inspecting.setText("Inspecting");
        cb_ts_inspecting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_inspectingActionPerformed(evt);
            }
        });

        cb_ps_helping.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_helping.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_helping.setText("Helping");
        cb_ps_helping.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cb_ps_encouraging.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_encouraging.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_encouraging.setText("Encouraging");
        cb_ps_encouraging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ps_encouragingActionPerformed(evt);
            }
        });

        cb_ps_motivating.setBackground(new java.awt.Color(255, 255, 255));
        cb_ps_motivating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ps_motivating.setText("Motivating");
        cb_ps_motivating.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel271.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel271.setText("Data Skills");

        cb_ts_repairing.setBackground(new java.awt.Color(255, 255, 255));
        cb_ts_repairing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_ts_repairing.setText("Repairing/Adusting");
        cb_ts_repairing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ts_repairingActionPerformed(evt);
            }
        });

        lbl_facilities17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities17.setText("[SKILLS]");

        jButton16.setText("Update");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel270)
                    .addComponent(jLabel271)
                    .addComponent(jLabel269)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_ts_machine_work)
                            .addComponent(cb_ts_setting_up)
                            .addComponent(cb_ts_assembling))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_ts_operating, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(cb_ts_driving)
                                    .addGap(16, 16, 16)))
                            .addComponent(cb_ts_repairing)))
                    .addComponent(jLabel268)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ps_negotiating)
                                    .addComponent(cb_ps_teaching)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_ps_persuading)
                                            .addComponent(cb_ps_diverting))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_ps_selling)
                                            .addComponent(cb_ps_promoting))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ps_speaking)
                                    .addComponent(cb_ps_leading))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(cb_ps_serving)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_ps_encouraging)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_ps_motivating))
                                    .addComponent(cb_ps_helping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ds_coordinating)
                                    .addComponent(cb_ds_analyzing)
                                    .addComponent(cb_ds_planning))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ds_recording)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_ds_compiling)
                                            .addComponent(cb_ds_computing))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_ds_checking)
                                            .addComponent(cb_ds_researching))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ds_testing)
                                    .addComponent(cb_ds_comparing))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(cb_ds_tabulating)
                                        .addGap(95, 95, 95)
                                        .addComponent(cb_ds_copying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cb_ds_posting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ts_producing)
                                    .addComponent(cb_ts_materials_handling)
                                    .addComponent(cb_ts_manipulating))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ts_warehousing)
                                    .addComponent(cb_ts_inspecting)
                                    .addComponent(cb_ts_building))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ts_precision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_ts_restoring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_ts_feeding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lbl_facilities17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_is_synthesizing)
                                .addComponent(cb_is_implementing))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_is_interpreting)
                                .addComponent(cb_is_instruction))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_is_anticipating)
                                .addComponent(cb_is_speculation))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_is_creating)
                                .addComponent(cb_is_discovering, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_is_predicting)
                                .addComponent(cb_is_theorizing))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel17Layout.createSequentialGroup()
                                    .addComponent(cb_is_innovating)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(organizing, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cb_is_expressing, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbl_facilities17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ps_diverting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ps_persuading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ps_teaching, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_ps_negotiating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ps_leading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ps_speaking, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ps_promoting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cb_ps_selling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_ps_serving, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cb_ps_encouraging, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cb_ps_motivating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_ps_helping, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel271, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_ds_coordinating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cb_ds_analyzing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ds_planning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ds_compiling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ds_computing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ds_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cb_ds_researching, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ds_testing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ds_comparing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_ds_tabulating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_ds_copying, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_ds_posting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ds_recording, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(cb_ts_machine_work, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(cb_ts_setting_up, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_ts_inspecting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_ts_precision, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_ts_warehousing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_ts_restoring, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_ts_assembling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_ts_building, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_ts_feeding, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_ts_operating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ts_driving, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ts_repairing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(cb_ts_producing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_ts_manipulating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ts_materials_handling, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel269, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_is_implementing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_is_synthesizing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_is_interpreting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_is_instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(cb_is_creating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_is_discovering, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(cb_is_speculation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_is_anticipating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cb_is_predicting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_is_theorizing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_is_innovating, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_is_expressing, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SKILLS", jPanel17);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities8.setText("[MEDICATION]");

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setText("Prescription:");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel127.setText("Begin Date:");

        tf_medication_date_started.setDate(new Date());
        tf_medication_date_started.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_prescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setText("End Date:");

        tf_medication_date_ended.setDate(new Date());
        tf_medication_date_ended.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_dosage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setText("Dose:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbl_facilities8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(175, 175, 175))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel126, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel129, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_dosage)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel128)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_medication_date_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tf_prescription))))))
                .addGap(177, 177, 177))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_facilities8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_prescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_dosage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_medication_date_started, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_medication_date_ended, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(77, 77, 77))
        );

        jTabbedPane1.addTab("MEDICATION", jPanel4);

        jButton10.setText("Cancel");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setText("Ok");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void tf_disabilitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disabilitiesMouseClicked
        Initialize_household_member_field_types.init_disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesMouseClicked

    private void tf_disabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disabilitiesActionPerformed
        Initialize_household_member_field_types.init_disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesActionPerformed

    private void tf_name_of_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_name_of_doctorActionPerformed

    private void tf_cause_of_disabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cause_of_disabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cause_of_disabilityActionPerformed

    private void tf_level_of_disabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_level_of_disabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_level_of_disabilityActionPerformed

    private void tf_achievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_achievementsActionPerformed
        /**/
    }//GEN-LAST:event_tf_achievementsActionPerformed

    private void tf_skills_requiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_skills_requiredActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_skills_requiredActionPerformed

    private void tf_name_of_school_or_agencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_school_or_agencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_name_of_school_or_agencyActionPerformed

    private void tf_period_of_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_period_of_trainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_period_of_trainingActionPerformed

    private void tf_issued_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_issued_byActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_issued_byActionPerformed

    private void tf_work_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_work_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_work_positionActionPerformed

    private void tf_work_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_work_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_work_descriptionActionPerformed

    private void cb_employment_ofw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_ofw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_ofw1ActionPerformed

    private void cb_employment_office_holder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_office_holder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_office_holder1ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void cb_status_unemployed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployed1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployed1ActionPerformed

    private void cb_employment_worker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_worker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_worker1ActionPerformed

    private void cb_employment_employee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_employee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_employee1ActionPerformed

    private void cb_employment_self_employed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_self_employed1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_self_employed1ActionPerformed

    private void cb_employment_director1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_director1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_director1ActionPerformed

    private void jTextField145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField145ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField145ActionPerformed

    private void cb_status_unemployed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployed2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployed2ActionPerformed

    private void tf_ofw_type_of_businessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ofw_type_of_businessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ofw_type_of_businessActionPerformed

    private void tf_ofw_financial_assistance_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ofw_financial_assistance_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ofw_financial_assistance_amountActionPerformed

    private void tf_ofw_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ofw_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ofw_countryActionPerformed

    private void tf_ofw_jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ofw_jobActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf_ofw_jobActionPerformed

    private void tf_ofw_reason_for_migrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ofw_reason_for_migrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ofw_reason_for_migrationActionPerformed

    private void cb_ts_assemblingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_assemblingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_assemblingActionPerformed

    private void cb_ts_setting_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_setting_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_setting_upActionPerformed

    private void cb_ts_operatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_operatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_operatingActionPerformed

    private void cb_ds_tabulatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_tabulatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_tabulatingActionPerformed

    private void cb_ds_postingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_postingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_postingActionPerformed

    private void cb_is_interpretingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_is_interpretingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_is_interpretingActionPerformed

    private void organizingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizingActionPerformed

    private void cb_is_creatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_is_creatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_is_creatingActionPerformed

    private void cb_ds_compilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_compilingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_compilingActionPerformed

    private void cb_ds_recordingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_recordingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_recordingActionPerformed

    private void cb_is_synthesizingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_is_synthesizingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_is_synthesizingActionPerformed

    private void cb_ds_analyzingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_analyzingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_analyzingActionPerformed

    private void cb_ds_planningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ds_planningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ds_planningActionPerformed

    private void cb_ps_negotiatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_negotiatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_negotiatingActionPerformed

    private void cb_ps_divertingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_divertingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_divertingActionPerformed

    private void cb_ps_promotingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_promotingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_promotingActionPerformed

    private void cb_ps_sellingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_sellingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_sellingActionPerformed

    private void cb_ts_manipulatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_manipulatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_manipulatingActionPerformed

    private void cb_ps_speakingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_speakingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_speakingActionPerformed

    private void cb_ts_producingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_producingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_producingActionPerformed

    private void cb_ts_inspectingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_inspectingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_inspectingActionPerformed

    private void cb_ps_encouragingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ps_encouragingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ps_encouragingActionPerformed

    private void cb_ts_repairingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ts_repairingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ts_repairingActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ok();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tf_name_of_schoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_name_of_schoolActionPerformed

    }//GEN-LAST:event_tf_name_of_schoolActionPerformed

    private void tf_educational_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_educational_statusActionPerformed

    }//GEN-LAST:event_tf_educational_statusActionPerformed

    private void tf_is_seeing_a_doctor_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_seeing_a_doctor_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_seeing_a_doctor_yesActionPerformed

    private void tf_is_seeing_a_doctor_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_is_seeing_a_doctor_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_is_seeing_a_doctor_noActionPerformed

    private void tf_status_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_status_normalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_status_normalActionPerformed

    private void tf_assets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets1ActionPerformed
        clear_household_member_health_status();
    }//GEN-LAST:event_tf_assets1ActionPerformed

    private void tf_assetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assetsActionPerformed
        save_household_member_health_status();
    }//GEN-LAST:event_tf_assetsActionPerformed

    private void tbl_household_member_health_statusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_health_statusesMouseClicked
        select_household_member_health_status();
    }//GEN-LAST:event_tbl_household_member_health_statusesMouseClicked

    private void tf_assets2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets2ActionPerformed
        clear_household_member_medications();
    }//GEN-LAST:event_tf_assets2ActionPerformed

    private void tf_assets3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets3ActionPerformed
        save_household_member_medications();
    }//GEN-LAST:event_tf_assets3ActionPerformed

    private void tbl_household_member_medicationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_medicationsMouseClicked
        select_household_member_medications();
    }//GEN-LAST:event_tbl_household_member_medicationsMouseClicked

    private void tf_assets4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets4ActionPerformed
        clear_household_member_educational_background();
    }//GEN-LAST:event_tf_assets4ActionPerformed

    private void tf_assets5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets5ActionPerformed
        save_household_member_educational_background();
    }//GEN-LAST:event_tf_assets5ActionPerformed

    private void tbl_household_member_educational_backgroundsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_educational_backgroundsMouseClicked
        select_household_educational_background();
    }//GEN-LAST:event_tbl_household_member_educational_backgroundsMouseClicked

    private void tf_assets6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets6ActionPerformed
        save_household_member_vocational_experience();
    }//GEN-LAST:event_tf_assets6ActionPerformed

    private void tf_assets7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets7ActionPerformed
        clear_household_member_vocational_experience();
    }//GEN-LAST:event_tf_assets7ActionPerformed

    private void tbl_household_member_vocational_experiencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_vocational_experiencesMouseClicked
        select_household_vocational_experience();
    }//GEN-LAST:event_tbl_household_member_vocational_experiencesMouseClicked

    private void tf_assets8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets8ActionPerformed
        clear_household_member_competence_certificate();
    }//GEN-LAST:event_tf_assets8ActionPerformed

    private void tf_assets9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets9ActionPerformed
        save_household_member_competence_certificate();
    }//GEN-LAST:event_tf_assets9ActionPerformed

    private void tbl_household_member_competence_certificatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_competence_certificatesMouseClicked
        select_household_competence_certificate();
    }//GEN-LAST:event_tbl_household_member_competence_certificatesMouseClicked

    private void tf_assets10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets10ActionPerformed
        clear_household_member_licenses();
    }//GEN-LAST:event_tf_assets10ActionPerformed

    private void tf_assets11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets11ActionPerformed
        save_household_member_licenses();
    }//GEN-LAST:event_tf_assets11ActionPerformed

    private void tbl_household_member_licensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_licensesMouseClicked
        select_household_licenses();
    }//GEN-LAST:event_tbl_household_member_licensesMouseClicked

    private void tf_assets12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets12ActionPerformed
        clear_household_member_work_experience();
    }//GEN-LAST:event_tf_assets12ActionPerformed

    private void tf_assets13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets13ActionPerformed
        save_household_work_experiences();
    }//GEN-LAST:event_tf_assets13ActionPerformed

    private void tf_assets14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets14ActionPerformed
        clear_household_member_prefered_works();
    }//GEN-LAST:event_tf_assets14ActionPerformed

    private void tf_assets15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets15ActionPerformed
        save_household_member_prefered_work();
    }//GEN-LAST:event_tf_assets15ActionPerformed

    private void tbl_household_member_work_experiencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_work_experiencesMouseClicked
        select_household_work_experience();
    }//GEN-LAST:event_tbl_household_member_work_experiencesMouseClicked

    private void tbl_household_member_prefered_worksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_member_prefered_worksMouseClicked
        select_household_prefered_works();
    }//GEN-LAST:event_tbl_household_member_prefered_worksMouseClicked

    private void tf_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_positionActionPerformed

    private void tf_comapanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_comapanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_comapanyActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        update_household_member_employment_status();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        update_household_member_skills();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tf_genders1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_genders1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_genders1ActionPerformed

    private void tf_genders1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_genders1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_genders1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        init_camera();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        update_household_member_basic_infomation();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fnameActionPerformed

    private void tf_others_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_others_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_others_languageActionPerformed

    private void tf_snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_snameActionPerformed
        Initialize_household_member_field_types.init_suffixes(tf_sname);
    }//GEN-LAST:event_tf_snameActionPerformed

    private void tf_snameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_snameMouseClicked
        Initialize_household_member_field_types.init_suffixes(tf_sname);
    }//GEN-LAST:event_tf_snameMouseClicked

    private void tf_religionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_religionsActionPerformed
        Initialize_household_member_field_types.init_religions(tf_religions);
    }//GEN-LAST:event_tf_religionsActionPerformed

    private void tf_religionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_religionsMouseClicked
        Initialize_household_member_field_types.init_religions(tf_religions);
    }//GEN-LAST:event_tf_religionsMouseClicked

    private void tf_relationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_relationActionPerformed
        Initialize_household_member_field_types.init_household_relations(tf_relation);
    }//GEN-LAST:event_tf_relationActionPerformed

    private void tf_relationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_relationMouseClicked
        Initialize_household_member_field_types.init_household_relations(tf_relation);
    }//GEN-LAST:event_tf_relationMouseClicked

    private void tf_blood_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_blood_typeActionPerformed
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeActionPerformed

    private void tf_blood_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_blood_typeMouseClicked
        Initialize_household_member_field_types.init_blood_types(tf_blood_type);
    }//GEN-LAST:event_tf_blood_typeMouseClicked

    private void tf_maritalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maritalsActionPerformed
        Initialize_household_member_field_types.init_marital_statuses(tf_maritals);
    }//GEN-LAST:event_tf_maritalsActionPerformed

    private void tf_maritalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_maritalsMouseClicked
        Initialize_household_member_field_types.init_marital_statuses(tf_maritals);
    }//GEN-LAST:event_tf_maritalsMouseClicked

    private void tf_gendersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_gendersActionPerformed
        Initialize_household_member_field_types.init_genders(tf_genders);
    }//GEN-LAST:event_tf_gendersActionPerformed

    private void tf_gendersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_gendersMouseClicked
        Initialize_household_member_field_types.init_genders(tf_genders);
    }//GEN-LAST:event_tf_gendersMouseClicked

    private void tf_languages_spokenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_languages_spokenMouseClicked

    }//GEN-LAST:event_tf_languages_spokenMouseClicked

    private void tf_citizenshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_citizenshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_citizenshipActionPerformed

    private void tf_others_relationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_others_relationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_others_relationsActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void tf_languages_spokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_languages_spokenActionPerformed
        Initialize_household_member_field_types.init_languages(tf_languages_spoken);
    }//GEN-LAST:event_tf_languages_spokenActionPerformed

    private void tf_email_addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_email_addressMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_email_addressMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JCheckBox cb_ds_analyzing;
    private javax.swing.JCheckBox cb_ds_checking;
    private javax.swing.JCheckBox cb_ds_comparing;
    private javax.swing.JCheckBox cb_ds_compiling;
    private javax.swing.JCheckBox cb_ds_computing;
    private javax.swing.JCheckBox cb_ds_coordinating;
    private javax.swing.JCheckBox cb_ds_copying;
    private javax.swing.JCheckBox cb_ds_planning;
    private javax.swing.JCheckBox cb_ds_posting;
    private javax.swing.JCheckBox cb_ds_recording;
    private javax.swing.JCheckBox cb_ds_researching;
    private javax.swing.JCheckBox cb_ds_tabulating;
    private javax.swing.JCheckBox cb_ds_testing;
    private javax.swing.JRadioButton cb_employment_director1;
    private javax.swing.JRadioButton cb_employment_employee1;
    private javax.swing.JRadioButton cb_employment_office_holder1;
    private javax.swing.JRadioButton cb_employment_ofw1;
    private javax.swing.JRadioButton cb_employment_self_employed1;
    private javax.swing.JRadioButton cb_employment_worker1;
    private javax.swing.JCheckBox cb_is_anticipating;
    private javax.swing.JCheckBox cb_is_creating;
    private javax.swing.JCheckBox cb_is_discovering;
    private javax.swing.JCheckBox cb_is_expressing;
    private javax.swing.JCheckBox cb_is_implementing;
    private javax.swing.JCheckBox cb_is_innovating;
    private javax.swing.JCheckBox cb_is_instruction;
    private javax.swing.JCheckBox cb_is_interpreting;
    private javax.swing.JCheckBox cb_is_predicting;
    private javax.swing.JCheckBox cb_is_registered_voter;
    private javax.swing.JCheckBox cb_is_speculation;
    private javax.swing.JCheckBox cb_is_synthesizing;
    private javax.swing.JCheckBox cb_is_theorizing;
    private javax.swing.JCheckBox cb_ps_diverting;
    private javax.swing.JCheckBox cb_ps_encouraging;
    private javax.swing.JCheckBox cb_ps_helping;
    private javax.swing.JCheckBox cb_ps_leading;
    private javax.swing.JCheckBox cb_ps_motivating;
    private javax.swing.JCheckBox cb_ps_negotiating;
    private javax.swing.JCheckBox cb_ps_persuading;
    private javax.swing.JCheckBox cb_ps_promoting;
    private javax.swing.JCheckBox cb_ps_selling;
    private javax.swing.JCheckBox cb_ps_serving;
    private javax.swing.JCheckBox cb_ps_speaking;
    private javax.swing.JCheckBox cb_ps_teaching;
    private javax.swing.JCheckBox cb_status_employed1;
    private javax.swing.JCheckBox cb_status_unemployed1;
    private javax.swing.JCheckBox cb_status_unemployed2;
    private javax.swing.JCheckBox cb_ts_assembling;
    private javax.swing.JCheckBox cb_ts_building;
    private javax.swing.JCheckBox cb_ts_driving;
    private javax.swing.JCheckBox cb_ts_feeding;
    private javax.swing.JCheckBox cb_ts_inspecting;
    private javax.swing.JCheckBox cb_ts_machine_work;
    private javax.swing.JCheckBox cb_ts_manipulating;
    private javax.swing.JCheckBox cb_ts_materials_handling;
    private javax.swing.JCheckBox cb_ts_operating;
    private javax.swing.JCheckBox cb_ts_precision;
    private javax.swing.JCheckBox cb_ts_producing;
    private javax.swing.JCheckBox cb_ts_repairing;
    private javax.swing.JCheckBox cb_ts_restoring;
    private javax.swing.JCheckBox cb_ts_setting_up;
    private javax.swing.JCheckBox cb_ts_warehousing;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JLabel lbl_facilities10;
    private javax.swing.JLabel lbl_facilities11;
    private javax.swing.JLabel lbl_facilities12;
    private javax.swing.JLabel lbl_facilities13;
    private javax.swing.JLabel lbl_facilities14;
    private javax.swing.JLabel lbl_facilities15;
    private javax.swing.JLabel lbl_facilities16;
    private javax.swing.JLabel lbl_facilities17;
    private javax.swing.JLabel lbl_facilities6;
    private javax.swing.JLabel lbl_facilities7;
    private javax.swing.JLabel lbl_facilities8;
    private javax.swing.JLabel lbl_facilities9;
    private javax.swing.JCheckBox organizing;
    private javax.swing.JTable tbl_household_member_competence_certificates;
    private javax.swing.JTable tbl_household_member_educational_backgrounds;
    private javax.swing.JTable tbl_household_member_health_statuses;
    private javax.swing.JTable tbl_household_member_licenses;
    private javax.swing.JTable tbl_household_member_medications;
    private javax.swing.JTable tbl_household_member_prefered_works;
    private javax.swing.JTable tbl_household_member_vocational_experiences;
    private javax.swing.JTable tbl_household_member_work_experiences;
    private javax.swing.JTextField tf_achievements;
    private javax.swing.JButton tf_assets;
    private javax.swing.JButton tf_assets1;
    private javax.swing.JButton tf_assets10;
    private javax.swing.JButton tf_assets11;
    private javax.swing.JButton tf_assets12;
    private javax.swing.JButton tf_assets13;
    private javax.swing.JButton tf_assets14;
    private javax.swing.JButton tf_assets15;
    private javax.swing.JButton tf_assets2;
    private javax.swing.JButton tf_assets3;
    private javax.swing.JButton tf_assets4;
    private javax.swing.JButton tf_assets5;
    private javax.swing.JButton tf_assets6;
    private javax.swing.JButton tf_assets7;
    private javax.swing.JButton tf_assets8;
    private javax.swing.JButton tf_assets9;
    private com.toedter.calendar.JDateChooser tf_bday;
    private javax.swing.JTextField tf_birth_place;
    private javax.swing.JTextField tf_blood_type;
    private javax.swing.JTextField tf_cause_of_disability;
    private javax.swing.JTextField tf_certificate;
    private javax.swing.JTextField tf_certificate_received;
    private javax.swing.JTextField tf_citizenship;
    private javax.swing.JTextField tf_comapany;
    private javax.swing.JTextField tf_company;
    private javax.swing.JTextField tf_company_address;
    private com.toedter.calendar.JDateChooser tf_date_issued;
    private javax.swing.JTextField tf_disabilities;
    private javax.swing.JTextField tf_dosage;
    private javax.swing.JTextField tf_educational_status;
    private javax.swing.JTextField tf_email_address;
    private com.toedter.calendar.JDateChooser tf_expiry;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_genders;
    private javax.swing.JTextField tf_genders1;
    private javax.swing.JTextField tf_height;
    private javax.swing.JTextField tf_highest_grade;
    private javax.swing.JTextField tf_is_registered_voter;
    private javax.swing.JCheckBox tf_is_seeing_a_doctor_no;
    private javax.swing.JCheckBox tf_is_seeing_a_doctor_yes;
    private javax.swing.JTextField tf_issued_by;
    private javax.swing.JTextField tf_languages_spoken;
    private javax.swing.JTextField tf_level_of_disability;
    private javax.swing.JTextField tf_lname;
    private javax.swing.JTextField tf_maritals;
    private com.toedter.calendar.JDateChooser tf_medication_date_ended;
    private com.toedter.calendar.JDateChooser tf_medication_date_started;
    private javax.swing.JTextField tf_mname;
    private javax.swing.JTextField tf_name_of_doctor;
    private javax.swing.JTextField tf_name_of_school;
    private javax.swing.JTextField tf_name_of_school_or_agency;
    private javax.swing.JTextField tf_name_of_training;
    private javax.swing.JTextField tf_occupancy_years;
    private javax.swing.JTextField tf_ofw_business_address;
    private javax.swing.JTextField tf_ofw_business_name;
    private javax.swing.JTextField tf_ofw_country;
    private javax.swing.JTextField tf_ofw_financial_assistance_amount;
    private javax.swing.JTextField tf_ofw_job;
    private javax.swing.JTextField tf_ofw_mailing_address;
    private javax.swing.JTextField tf_ofw_reason_for_migration;
    private javax.swing.JTextField tf_ofw_type_of_business;
    private javax.swing.JTextField tf_others_language;
    private javax.swing.JTextField tf_others_relations;
    private javax.swing.JTextField tf_period_of_training;
    private javax.swing.JTextField tf_position;
    private javax.swing.JTextField tf_prescription;
    private javax.swing.JTextField tf_present_address;
    private javax.swing.JTextField tf_rating;
    private javax.swing.JTextField tf_relation;
    private javax.swing.JTextField tf_religions;
    private javax.swing.JTextField tf_skills_required;
    private javax.swing.JTextField tf_sname;
    private javax.swing.JCheckBox tf_status_normal;
    private javax.swing.JCheckBox tf_status_pwd;
    private javax.swing.JTextField tf_title;
    private javax.swing.JTextField tf_work;
    private javax.swing.JTextField tf_work_description;
    private com.toedter.calendar.JDateChooser tf_work_ended;
    private javax.swing.JTextField tf_work_position;
    private com.toedter.calendar.JDateChooser tf_work_started;
    private com.toedter.calendar.JDateChooser tf_year_graduated;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

//        Initialize_household_member_field_types.ret_data();
        Initialize_table_household_members.init_tbl_household_member_health_statuses(tbl_household_member_health_statuses);
        Initialize_table_household_members.init_tbl_household_member_medications(tbl_household_member_medications);
        Initialize_table_household_members.init_tbl_household_member_educational_backgrounds(tbl_household_member_educational_backgrounds);
        Initialize_table_household_members.init_tbl_household_member_vocational_experiences(tbl_household_member_vocational_experiences);
        Initialize_table_household_members.init_tbl_household_member_competence_certificates(tbl_household_member_competence_certificates);
        Initialize_table_household_members.init_tbl_household_member_licenses(tbl_household_member_licenses);
        Initialize_table_household_members.init_tbl_household_member_work_experiences(tbl_household_member_work_experiences);
        Initialize_table_household_members.init_tbl_household_member_prefered_works(tbl_household_member_prefered_works);

        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton16.setVisible(false);

    }

    Household_members.to_household_members household_member = new Household_members.to_household_members(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", "", "", "", "", "", "", 0, "", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, "");
    String my_region = "";
    String my_region_id = "";
    String my_province = "";
    String my_province_id = "";
    String my_city = "";
    String my_city_id = "";
    String my_barangay = "";
    String my_barangay_id = "";
    String my_house_no = "";
    String my_household_no = "";
    String my_household_member_no = "";

    public void do_pass_new(String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String house_no, String household_no, String household_member_no) {
        my_region = region;
        my_region_id = region_id;
        my_province = province;
        my_province_id = province_id;
        my_city = city;
        my_city_id = city_id;
        my_barangay = barangay;
        my_barangay_id = barangay;
        my_house_no = house_no;
        my_household_no = household_no;
        my_household_member_no = household_member_no;
    }

    public void do_pass(Household_members.to_household_members household_member1, String house_no, String household_no) {
        household_member = household_member1;
        jButton13.setVisible(true);
        jButton14.setVisible(true);
        jButton16.setVisible(true);

        my_region = household_member1.region;
        my_region_id = household_member1.region_id;
        my_province = household_member1.province;
        my_province_id = household_member1.province_id;
        my_city = household_member1.city;
        my_city_id = household_member1.city_id;
        my_barangay = household_member1.barangay;
        my_barangay_id = household_member1.barangay;
        my_house_no = house_no;
        my_household_no = household_no;
        my_household_member_no = household_member1.household_member_no;

        //<editor-fold defaultstate="collapsed" desc=" Basic Information ">
        tf_fname.setText(household_member.fname);
        tf_mname.setText(household_member.mname);
        tf_lname.setText(household_member.lname);
        tf_sname.setText(household_member.sname);
        tf_genders.setText(household_member.gender);
        tf_maritals.setText(household_member.marital_status);
        tf_occupancy_years.setText(FitIn.fmt_wc_0(household_member.occupancy_years));
        tf_height.setText(household_member.height);
        jTextField48.setText(household_member.weight);
        tf_birth_place.setText(household_member.birth_place);
        tf_present_address.setText(household_member.present_address);
        tf_relation.setText(household_member.relation_to_household);
        tf_others_relations.setText("");
        tf_religions.setText(household_member.religion);
        tf_citizenship.setText(household_member.citizenship);
        tf_email_address.setText(household_member.email_address);
        tf_blood_type.setText(household_member.blood_type);
        tf_languages_spoken.setText(household_member.languages_spoken);
        tf_others_language.setText("");
        tf_is_registered_voter.setText(household_member.voters_id_no);
        tf_genders1.setText(household_member.image);

        my_house_no = house_no;
        my_household_no = household_no;
        my_household_member_no = household_member.household_member_no;
        String home = System.getProperty("user.home", "C:\\Users\\Guinness");
        System.out.println("House No: " + my_house_no);
        System.out.println("Household No: " + my_household_no);
        System.out.println("Household Member No: " + my_household_member_no);
        String path = home + "\\images\\" + my_region + "\\" + my_province + "\\" + my_city + "\\" + my_barangay + "\\" + my_house_no + "\\" + my_household_no;
        path = path + "\\" + household_member.image;
        jLabel21.setIcon(new ImageIcon(path));
        System.out.println(path);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Load Table Records ">
        Initialize_table_household_members.loadData_household_member_educational_backgrounds(household_member.educational_backgrounds);
        Initialize_table_household_members.loadData_household_member_vocational_experiences(household_member.vocational_experiences);
        Initialize_table_household_members.loadData_household_member_health_statuses(household_member.health_statuses);
        Initialize_table_household_members.loadData_household_member_medications(household_member.health_medications);
        Initialize_table_household_members.loadData_household_member_work_experiences(household_member.work_experiences);
        Initialize_table_household_members.loadData_household_member_prefered_works(household_member.prefered_works);
        Initialize_table_household_members.loadData_household_member_competence_certificates(household_member.competence_certificates);
        Initialize_table_household_members.loadData_household_member_licenses(household_member.licenses);

        jLabel6.setText("" + Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.size());
        jLabel8.setText("" + Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.size());
        jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());
        jLabel4.setText("" + Initialize_table_household_members.tbl_household_member_medications_ALM.size());
        jLabel18.setText("" + Initialize_table_household_members.tbl_household_member_work_experiences_ALM.size());
        jLabel20.setText("" + Initialize_table_household_members.tbl_household_member_prefered_works_ALM.size());
        jLabel10.setText("" + Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.size());
        jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_licenses_ALM.size());

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Employment Status ">
        Household_member_employment_status.to_household_member_employment_status employment_status = household_member.employment_status;
        if (employment_status.employment_status == 1) {
            cb_status_employed1.setSelected(true);
        } else {
            cb_status_unemployed1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("Worker")) {
            cb_employment_worker1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("Employee")) {
            cb_employment_employee1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("Self Employed")) {
            cb_employment_self_employed1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("Director")) {
            cb_employment_director1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("Office Holder")) {
            cb_employment_office_holder1.setSelected(true);
        }
        if (employment_status.employment_type.equalsIgnoreCase("OFW")) {
            cb_employment_ofw1.setSelected(true);
        }
        if (employment_status.unemployment_type.equalsIgnoreCase("Finsihed Contract")) {
            jRadioButton5.setSelected(true);
        }
        if (employment_status.unemployment_type.equalsIgnoreCase("Terminated/Laid Off,local")) {
            jRadioButton6.setSelected(true);
        }
        if (employment_status.unemployment_type.equalsIgnoreCase("Resigned")) {
            jRadioButton7.setSelected(true);
        }
        if (employment_status.unemployment_type.equalsIgnoreCase("Terminated/Laid off, abroad")) {
            jRadioButton8.setSelected(true);
        }
        tf_comapany.setText(employment_status.company);
        tf_position.setText(employment_status.work_position);
        jTextField145.setText(employment_status.work_description);
        if (employment_status.is_looking_for_work == 1) {
            cb_status_unemployed2.setSelected(true);
        } else {
            cb_status_unemployed2.setSelected(false);
        }

        tf_ofw_business_name.setText(employment_status.ofw_business_name);
        tf_ofw_business_address.setText(employment_status.ofw_business_address);
        tf_ofw_mailing_address.setText(employment_status.ofw_mailing_address);
        tf_ofw_type_of_business.setText(employment_status.ofw_type_of_business);
        tf_ofw_financial_assistance_amount.setText(FitIn.fmt_wc_0(employment_status.ofw_financial_assistance_amount));
        tf_ofw_country.setText(employment_status.ofw_country);
        tf_ofw_job.setText(employment_status.ofw_job);
        tf_ofw_reason_for_migration.setText(employment_status.ofw_reason_for_migration);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Skills ">
        Household_member_skills.to_household_member_skills people_skills = household_member.skills;

        int[] people_skill = {people_skills.ps_teaching, people_skills.ps_negotiating, people_skills.ps_diverting, people_skills.ps_persuading, people_skills.ps_promoting, people_skills.ps_selling, people_skills.ps_leading, people_skills.ps_speaking, people_skills.ps_serving, people_skills.ps_helping, people_skills.ps_encouraging, people_skills.ps_motivating};
        JCheckBox[] cb_people_skill = {cb_ps_teaching, cb_ps_negotiating, cb_ps_diverting, cb_ps_persuading, cb_ps_promoting, cb_ps_selling, cb_ps_leading, cb_ps_speaking, cb_ps_serving, cb_ps_helping, cb_ps_encouraging, cb_ps_motivating};
        cb_setter(people_skill, cb_people_skill);

        int[] data_skill = {people_skills.ds_coordinating, people_skills.ds_analyzing, people_skills.ds_planning, people_skills.ds_compiling, people_skills.ds_computing, people_skills.ds_recording, people_skills.ds_checking, people_skills.ds_researching, people_skills.ds_testing, people_skills.ds_comparing, people_skills.ds_tabulating, people_skills.ds_posting, people_skills.ds_copying};
        JCheckBox[] cb_data_skill = {cb_ds_coordinating, cb_ds_analyzing, cb_ds_planning, cb_ds_compiling, cb_ds_computing, cb_ds_recording, cb_ds_checking, cb_ds_researching, cb_ds_testing, cb_ds_comparing, cb_ds_tabulating, cb_ds_posting, cb_ds_copying};
        cb_setter(data_skill, cb_data_skill);

        int[] thing_skill = {people_skills.ts_machine_work, people_skills.ts_setting_up, people_skills.ts_assembling, people_skills.ts_operating, people_skills.ts_driving, people_skills.ts_repairing, people_skills.ts_manipulating, people_skills.ts_materials_handling, people_skills.ts_producing, people_skills.ts_inspecting, people_skills.ts_warehousing, people_skills.ts_building, people_skills.ts_precision_working, people_skills.ts_restoring, people_skills.ts_feeding};
        JCheckBox[] cb_thing_skill = {cb_ts_machine_work, cb_ts_setting_up, cb_ts_assembling, cb_ts_operating, cb_ts_driving, cb_ts_repairing, cb_ts_manipulating, cb_ts_materials_handling, cb_ts_producing, cb_ts_inspecting, cb_ts_warehousing, cb_ts_building, cb_ts_precision, cb_ts_restoring, cb_ts_feeding};
        cb_setter(thing_skill, cb_thing_skill);

        int[] idea_skill = {people_skills.is_implementing, people_skills.is_synthesizing, people_skills.is_interpreting, people_skills.is_instruction, people_skills.is_speculating, people_skills.is_anticipating, people_skills.is_inventing, people_skills.is_discovering, people_skills.is_predicting, people_skills.is_theorizing, people_skills.is_innovating, people_skills.is_expressing, people_skills.is_organizing
        };
        JCheckBox[] cb_idea_skill = {cb_is_implementing, cb_is_synthesizing, cb_is_interpreting, cb_is_instruction, cb_is_speculation, cb_is_anticipating, cb_is_creating, cb_is_discovering, cb_is_predicting, cb_is_theorizing, cb_is_innovating, cb_is_expressing, organizing};
        cb_setter(idea_skill, cb_idea_skill);

        //</editor-fold>
    }

    private void cb_setter(int[] status, JCheckBox[] cb) {
        for (int i = 0; i < status.length; i++) {
            if (status[i] == 1) {
                cb[i].setSelected(true);
            } else {
                cb[i].setSelected(false);
            }
        }
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
                for (WebcamPanel panel : panels) {
                    panel.stop();
                }
                disposed();
            }
        });
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Household Member Health Status ">
    private void save_household_member_health_status() {
        int row = tbl_household_member_health_statuses.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();
            int is_seing_a_doctor = 0;
            if (tf_is_seeing_a_doctor_yes.isSelected()) {
                is_seing_a_doctor = 1;
            }
            int health_status = 0;
            if (tf_status_normal.isSelected()) {
                health_status = 1;
            }
            String name_of_doctor = tf_name_of_doctor.getText();
            String disabilities = tf_disabilities.getText();
            String level_of_disability = tf_level_of_disability.getText();
            String cause_of_disability = tf_cause_of_disability.getText();

            Household_member_health_statuses.to_household_member_health_statuses health_status1 = new Household_member_health_statuses.to_household_member_health_statuses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, is_seing_a_doctor, status, name_of_doctor, disabilities, level_of_disability, cause_of_disability);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_health_statuses_ALM.add(health_status1);
                jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());

            } else {
                Household_member_health_statuses.add_data(health_status1);
                String where = " where household_member_no='" + health_status1.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_heath_status(where);
                jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_health_statuses.to_household_member_health_statuses health_statuses = (Household_member_health_statuses.to_household_member_health_statuses) Initialize_table_household_members.tbl_household_member_health_statuses_ALM.get(row);
            int id = health_statuses.id;
            String created_at = health_statuses.created_at;
            String updated_at = health_statuses.updated_at;
            String created_by = health_statuses.created_by;
            String updated_by = health_statuses.updated_by;
            String region = health_statuses.region;
            String region_id = health_statuses.region_id;
            String province = health_statuses.province;
            String province_id = health_statuses.province_id;
            String city = health_statuses.city;
            String city_id = health_statuses.city_id;
            String barangay = health_statuses.barangay;
            String barangay_id = health_statuses.barangay_id;
            String purok = health_statuses.purok;
            String purok_id = health_statuses.purok_id;
            int status = health_statuses.status;
            String house_no = health_statuses.house_no;
            String household_no = health_statuses.household_no;
            String household_member_no = health_statuses.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();
            int is_seing_a_doctor = 0;
            if (tf_is_seeing_a_doctor_yes.isSelected()) {
                is_seing_a_doctor = 1;
            }
            int health_status = 0;
            if (tf_status_normal.isSelected()) {
                health_status = 1;
            }
            String name_of_doctor = tf_name_of_doctor.getText();
            String disabilities = tf_disabilities.getText();
            String level_of_disability = tf_level_of_disability.getText();
            String cause_of_disability = tf_cause_of_disability.getText();

            health_statuses.setIs_seing_a_doctor(is_seing_a_doctor);
            health_statuses.setHealth_status(health_status);
            health_statuses.setName_of_doctor(name_of_doctor);
            health_statuses.setDisabilities(disabilities);
            health_statuses.setLevel_of_disability(level_of_disability);
            health_statuses.setCause_of_disability(cause_of_disability);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_health_statuses_M.fireTableDataChanged();

            } else {
                Household_member_health_statuses.update_data(health_statuses);
                String where = " where household_member_no='" + health_statuses.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_heath_status(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_health_status();
    }

    private void select_household_member_health_status() {
        final int row = tbl_household_member_health_statuses.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_health_statuses.to_household_member_health_statuses health_statuses = (Household_member_health_statuses.to_household_member_health_statuses) Initialize_table_household_members.tbl_household_member_health_statuses_ALM.get(row);
        int col = tbl_household_member_health_statuses.getSelectedColumn();
        if (col == 3) {
            if (health_statuses.is_seing_a_doctor == 1) {
                tf_is_seeing_a_doctor_yes.setSelected(true);
            } else {
                tf_is_seeing_a_doctor_no.setSelected(true);
            }
            if (health_statuses.health_status == 1) {
                tf_status_normal.setSelected(true);
            } else {
                tf_status_pwd.setSelected(true);
            }

            tf_name_of_doctor.setText(health_statuses.name_of_doctor);
            tf_disabilities.setText(health_statuses.disabilities);
            tf_level_of_disability.setText(health_statuses.level_of_disability);
            tf_cause_of_disability.setText(health_statuses.cause_of_disability);

        }
        if (col == 4) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_health_statuses_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_health_statuses_M.fireTableDataChanged();

                    } else {
                        Household_member_health_statuses.delete_data(health_statuses);
                        String where = " where household_member_no='" + health_statuses.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_heath_status(where);

                    }
                    Alert.set(3, "");
                    jLabel2.setText("" + Initialize_table_household_members.tbl_household_member_health_statuses_ALM.size());
                    clear_household_member_health_status();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_health_status() {
        tf_name_of_doctor.setText("");
        tf_disabilities.setText("");
        tf_level_of_disability.setText("");
        tf_cause_of_disability.setText("");
        tbl_household_member_health_statuses.getSelectionModel().clearSelection();
        tf_name_of_doctor.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Medications ">
    private void save_household_member_medications() {
        int row = tbl_household_member_medications.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();
            String prescription = tf_prescription.getText();
            String dosage = tf_dosage.getText();
            String medication_date_started = DateType.sf.format(tf_medication_date_started.getDate());
            String medication_date_ended = DateType.sf.format(tf_medication_date_ended.getDate());
            Household_member_medications.to_household_member_medications health_medication = new Household_member_medications.to_household_member_medications(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, prescription, dosage, medication_date_started, medication_date_ended);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_medications_ALM.add(health_medication);
                jLabel4.setText("" + Initialize_table_household_members.tbl_household_member_medications_ALM.size());

            } else {

                Household_member_medications.add_data(health_medication);
                String where = " where household_member_no='" + health_medication.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_medications(where);
                jLabel4.setText("" + Initialize_table_household_members.tbl_household_member_medications_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_medications.to_household_member_medications health_medications = (Household_member_medications.to_household_member_medications) Initialize_table_household_members.tbl_household_member_medications_ALM.get(row);

            int id = health_medications.id;
            String created_at = health_medications.created_at;
            String updated_at = health_medications.updated_at;
            String created_by = health_medications.created_by;
            String updated_by = health_medications.updated_by;
            String region = health_medications.region;
            String region_id = health_medications.region_id;
            String province = health_medications.province;
            String province_id = health_medications.province_id;
            String city = health_medications.city;
            String city_id = health_medications.city_id;
            String barangay = health_medications.barangay;
            String barangay_id = health_medications.barangay_id;
            String purok = health_medications.purok;
            String purok_id = health_medications.purok_id;
            int status = health_medications.status;
            String house_no = health_medications.house_no;
            String household_no = health_medications.household_no;
            String household_member_no = health_medications.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String prescription = tf_prescription.getText();
            String dosage = tf_dosage.getText();
            String medication_date_started = DateType.sf.format(tf_medication_date_started.getDate());
            String medication_date_ended = DateType.sf.format(tf_medication_date_ended.getDate());

            health_medications.setPrescription(prescription);
            health_medications.setDosage(dosage);
            health_medications.setMedication_date_started(medication_date_started);
            health_medications.setMedication_date_ended(medication_date_ended);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_medications_M.fireTableDataChanged();

            } else {
                Household_member_medications.update_data(health_medications);
                String where = " where household_member_no='" + health_medications.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_medications(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_medications();
    }

    private void select_household_member_medications() {
        final int row = tbl_household_member_medications.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_medications.to_household_member_medications health_medications = (Household_member_medications.to_household_member_medications) Initialize_table_household_members.tbl_household_member_medications_ALM.get(row);
        int col = tbl_household_member_medications.getSelectedColumn();
        if (col == 2) {

            tf_prescription.setText(health_medications.prescription);
            tf_dosage.setText(health_medications.dosage);
            try {
                tf_medication_date_started.setDate(DateType.sf.parse(health_medications.medication_date_started));
                tf_medication_date_ended.setDate(DateType.sf.parse(health_medications.medication_date_ended));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_household_members.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_medications_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_medications_M.fireTableDataChanged();

                    } else {
                        Household_member_medications.delete_data(health_medications);
                        String where = " where household_member_no='" + health_medications.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_medications(where);

                    }
                    Alert.set(3, "");
                    jLabel4.setText("" + Initialize_table_household_members.tbl_household_member_medications_ALM.size());
                    clear_household_member_medications();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_medications() {
        tf_prescription.setText("");
        tf_dosage.setText("");
        tbl_household_member_medications.getSelectionModel().clearSelection();
        tf_prescription.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Education Backgrounds ">
    private void save_household_member_educational_background() {
        int row = tbl_household_member_educational_backgrounds.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();
            String educational_status = tf_educational_status.getText();
            String name_of_school = tf_name_of_school.getText();
            String achievements = tf_achievements.getText();
            double highest_grade = FitIn.toDouble(tf_highest_grade.getText());
            String year_graduated = DateType.sf.format(tf_year_graduated.getDate());

            Household_member_educational_backgrounds.to_household_member_educational_backgrounds educational_back = new Household_member_educational_backgrounds.to_household_member_educational_backgrounds(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, educational_status, name_of_school, achievements, highest_grade, year_graduated);
            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.add(educational_back);
                jLabel6.setText("" + Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.size());

            } else {

                Household_member_educational_backgrounds.add_data(educational_back);
                String where = " where household_member_no='" + educational_back.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_educational_backgrounds(where);
                jLabel6.setText("" + Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_educational_backgrounds.to_household_member_educational_backgrounds educational_back = (Household_member_educational_backgrounds.to_household_member_educational_backgrounds) Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.get(row);

            int id = educational_back.id;
            String created_at = educational_back.created_at;
            String updated_at = educational_back.updated_at;
            String created_by = educational_back.created_by;
            String updated_by = educational_back.updated_by;
            String region = educational_back.region;
            String region_id = educational_back.region_id;
            String province = educational_back.province;
            String province_id = educational_back.province_id;
            String city = educational_back.city;
            String city_id = educational_back.city_id;
            String barangay = educational_back.barangay;
            String barangay_id = educational_back.barangay_id;
            String purok = educational_back.purok;
            String purok_id = educational_back.purok_id;
            int status = educational_back.status;
            String house_no = educational_back.house_no;
            String household_no = educational_back.household_no;
            String household_member_no = educational_back.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String educational_status = tf_educational_status.getText();
            String name_of_school = tf_name_of_school.getText();
            String achievements = tf_achievements.getText();
            double highest_grade = FitIn.toDouble(tf_highest_grade.getText());
            String year_graduated = DateType.sf.format(tf_year_graduated.getDate());

            educational_back.setEducational_status(educational_status);
            educational_back.setName_of_school(name_of_school);
            educational_back.setAchievements(achievements);
            educational_back.setHighest_grade(highest_grade);
            educational_back.setYear_graduated(year_graduated);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_educational_backgrounds_M.fireTableDataChanged();

            } else {

                Household_member_educational_backgrounds.update_data(educational_back);
                String where = " where household_member_no='" + educational_back.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_educational_backgrounds(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_educational_background();
    }

    private void select_household_educational_background() {
        final int row = tbl_household_member_educational_backgrounds.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_educational_backgrounds.to_household_member_educational_backgrounds educational_back = (Household_member_educational_backgrounds.to_household_member_educational_backgrounds) Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.get(row);
        int col = tbl_household_member_educational_backgrounds.getSelectedColumn();
        if (col == 2) {
            tf_educational_status.setText(educational_back.educational_status);
            tf_name_of_school.setText(educational_back.name_of_school);
            tf_achievements.setText(educational_back.achievements);
            tf_highest_grade.setText(FitIn.fmt_wc_0(educational_back.highest_grade));
            try {
                tf_year_graduated.setDate(DateType.sf.parse(educational_back.year_graduated));

            } catch (ParseException ex) {
                Logger.getLogger(Dlg_household_members.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_educational_backgrounds_M.fireTableDataChanged();

                    } else {
                        Household_member_educational_backgrounds.delete_data(educational_back);
                        String where = " where household_member_no='" + educational_back.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_educational_backgrounds(where);

                    }
                    Alert.set(3, "");
                    jLabel4.setText("" + Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM.size());
                    clear_household_member_educational_background();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_educational_background() {
        tf_educational_status.setText("");
        tf_name_of_school.setText("");
        tf_achievements.setText("");
        tf_highest_grade.setText("");

        tbl_household_member_educational_backgrounds.getSelectionModel().clearSelection();
        tf_educational_status.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Vocational Experiences ">
    private void save_household_member_vocational_experience() {
        int row = tbl_household_member_vocational_experiences.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String name_of_training = tf_name_of_training.getText();
            String certificate_received = tf_certificate_received.getText();
            String skills_required = tf_skills_required.getText();
            String name_of_school = tf_name_of_school_or_agency.getText();
            String period_of_training = tf_period_of_training.getText();

            Household_member_vocational_experiences.to_household_member_vocational_experiences vocational_experience = new Household_member_vocational_experiences.to_household_member_vocational_experiences(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, name_of_training, certificate_received, skills_required, name_of_school, period_of_training);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.add(vocational_experience);
                jLabel6.setText("" + Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.size());

            } else {

                Household_member_vocational_experiences.add_data(vocational_experience);
                String where = " where household_member_no='" + vocational_experience.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_vocational_experiences(where);
                jLabel8.setText("" + Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_vocational_experiences.to_household_member_vocational_experiences vocational_experience = (Household_member_vocational_experiences.to_household_member_vocational_experiences) Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.get(row);

            int id = vocational_experience.id;
            String created_at = vocational_experience.created_at;
            String updated_at = vocational_experience.updated_at;
            String created_by = vocational_experience.created_by;
            String updated_by = vocational_experience.updated_by;
            String region = vocational_experience.region;
            String region_id = vocational_experience.region_id;
            String province = vocational_experience.province;
            String province_id = vocational_experience.province_id;
            String city = vocational_experience.city;
            String city_id = vocational_experience.city_id;
            String barangay = vocational_experience.barangay;
            String barangay_id = vocational_experience.barangay_id;
            String purok = vocational_experience.purok;
            String purok_id = vocational_experience.purok_id;
            int status = vocational_experience.status;
            String house_no = vocational_experience.house_no;
            String household_no = vocational_experience.household_no;
            String household_member_no = vocational_experience.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String name_of_training = tf_name_of_training.getText();
            String certificate_received = tf_certificate_received.getText();
            String skills_required = tf_skills_required.getText();
            String name_of_school = tf_name_of_school_or_agency.getText();
            String period_of_training = tf_period_of_training.getText();

            vocational_experience.setName_of_training(name_of_training);
            vocational_experience.setName_of_school(name_of_school);
            vocational_experience.setCertificate_received(certificate_received);
            vocational_experience.setSkills_required(skills_required);
            vocational_experience.setName_of_school(name_of_school);
            vocational_experience.setPeriod_of_training(period_of_training);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_vocational_experiences_M.fireTableDataChanged();

            } else {
                Household_member_vocational_experiences.update_data(vocational_experience);
                String where = " where household_member_no='" + vocational_experience.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_vocational_experiences(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_vocational_experience();
    }

    private void select_household_vocational_experience() {
        final int row = tbl_household_member_vocational_experiences.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_vocational_experiences.to_household_member_vocational_experiences vocational_experience = (Household_member_vocational_experiences.to_household_member_vocational_experiences) Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.get(row);
        int col = tbl_household_member_vocational_experiences.getSelectedColumn();
        if (col == 2) {

            tf_name_of_training.setText(vocational_experience.name_of_training);
            tf_certificate_received.setText(vocational_experience.certificate_received);
            tf_skills_required.setText(vocational_experience.skills_required);
            tf_name_of_school_or_agency.setText(vocational_experience.name_of_school);
            tf_period_of_training.setText(vocational_experience.period_of_training);

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_vocational_experiences_M.fireTableDataChanged();

                    } else {
                        Household_member_vocational_experiences.delete_data(vocational_experience);
                        String where = " where household_member_no='" + vocational_experience.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_vocational_experiences(where);

                    }
                    Alert.set(3, "");
                    jLabel8.setText("" + Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM.size());
                    clear_household_member_vocational_experience();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_vocational_experience() {
        tf_name_of_training.setText("");
        tf_certificate_received.setText("");
        tf_skills_required.setText("");
        tf_name_of_school_or_agency.setText("");
        tf_period_of_training.setText("");
        tbl_household_member_vocational_experiences.getSelectionModel().clearSelection();
        tf_name_of_training.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Competence Certificates ">
    private void save_household_member_competence_certificate() {
        int row = tbl_household_member_competence_certificates.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String certificate = tf_certificate.getText();
            String rating = tf_rating.getText();
            String issued_by = tf_issued_by.getText();
            String date_issued = DateType.sf.format(tf_date_issued.getDate());

            Household_member_competence_certificates.to_household_member_competence_certificates competence_certificate = new Household_member_competence_certificates.to_household_member_competence_certificates(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, certificate, rating, issued_by, date_issued);
            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.add(competence_certificate);
                jLabel10.setText("" + Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.size());

            } else {

                Household_member_competence_certificates.add_data(competence_certificate);
                String where = " where household_member_no='" + competence_certificate.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_competence_certificates(where);
                jLabel10.setText("" + Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_competence_certificates.to_household_member_competence_certificates competence_certificate = (Household_member_competence_certificates.to_household_member_competence_certificates) Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.get(row);

            int id = competence_certificate.id;
            String created_at = competence_certificate.created_at;
            String updated_at = competence_certificate.updated_at;
            String created_by = competence_certificate.created_by;
            String updated_by = competence_certificate.updated_by;
            String region = competence_certificate.region;
            String region_id = competence_certificate.region_id;
            String province = competence_certificate.province;
            String province_id = competence_certificate.province_id;
            String city = competence_certificate.city;
            String city_id = competence_certificate.city_id;
            String barangay = competence_certificate.barangay;
            String barangay_id = competence_certificate.barangay_id;
            String purok = competence_certificate.purok;
            String purok_id = competence_certificate.purok_id;
            int status = competence_certificate.status;
            String house_no = competence_certificate.house_no;
            String household_no = competence_certificate.household_no;
            String household_member_no = competence_certificate.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String certificate = tf_certificate.getText();
            String rating = tf_rating.getText();
            String issued_by = tf_issued_by.getText();
            String date_issued = DateType.sf.format(tf_date_issued.getDate());

            competence_certificate.setCertificate(certificate);
            competence_certificate.setRating(rating);
            competence_certificate.setIssued_by(issued_by);
            competence_certificate.setDate_issued(date_issued);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_competence_certificates_M.fireTableDataChanged();

            } else {
                Household_member_competence_certificates.update_data(competence_certificate);
                String where = " where household_member_no='" + competence_certificate.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_competence_certificates(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_competence_certificate();
    }

    private void select_household_competence_certificate() {
        final int row = tbl_household_member_competence_certificates.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_competence_certificates.to_household_member_competence_certificates competence_certificate = (Household_member_competence_certificates.to_household_member_competence_certificates) Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.get(row);

        int col = tbl_household_member_competence_certificates.getSelectedColumn();
        if (col == 2) {

            tf_certificate.setText(competence_certificate.certificate);
            tf_rating.setText(competence_certificate.rating);
            tf_issued_by.setText(competence_certificate.issued_by);
            try {
                tf_date_issued.setDate(DateType.sf.parse(competence_certificate.date_issued));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_household_members.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_competence_certificates_M.fireTableDataChanged();

                    } else {
                        Household_member_competence_certificates.delete_data(competence_certificate);
                        String where = " where household_member_no='" + competence_certificate.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_competence_certificates(where);

                    }
                    Alert.set(3, "");
                    jLabel10.setText("" + Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.size());
                    clear_household_member_competence_certificate();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_competence_certificate() {
        tf_certificate.setText("");
        tf_rating.setText("");
        tf_issued_by.setText("");
        tbl_household_member_competence_certificates.getSelectionModel().clearSelection();
        tf_certificate.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Licenses ">
    private void save_household_member_licenses() {
        int row = tbl_household_member_licenses.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String title = tf_title.getText();
            String expiry = DateType.sf.format(tf_expiry.getDate());

            Household_member_licences.to_household_member_licenses license = new Household_member_licences.to_household_member_licenses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, title, expiry);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_licenses_ALM.add(license);
                jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_licenses_ALM.size());

            } else {

                Household_member_licences.add_data(license);
                String where = " where household_member_no='" + license.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_licences(where);
                jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_competence_certificates_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_member_licences.to_household_member_licenses license = (Household_member_licences.to_household_member_licenses) Initialize_table_household_members.tbl_household_member_licenses_ALM.get(row);

            int id = license.id;
            String created_at = license.created_at;
            String updated_at = license.updated_at;
            String created_by = license.created_by;
            String updated_by = license.updated_by;
            String region = license.region;
            String region_id = license.region_id;
            String province = license.province;
            String province_id = license.province_id;
            String city = license.city;
            String city_id = license.city_id;
            String barangay = license.barangay;
            String barangay_id = license.barangay_id;
            String purok = license.purok;
            String purok_id = license.purok_id;
            int status = license.status;
            String house_no = license.house_no;
            String household_no = license.household_no;
            String household_member_no = license.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String title = tf_title.getText();
            String expiry = DateType.sf.format(tf_expiry.getDate());

            license.setTitle(title);
            license.setExpiry(expiry);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_licenses_M.fireTableDataChanged();

            } else {
                Household_member_licences.update_data(license);
                String where = " where household_member_no='" + license.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_licences(where);

            }
            Alert.set(2, "");
        }
        clear_household_member_licenses();
    }

    private void select_household_licenses() {
        final int row = tbl_household_member_licenses.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_licences.to_household_member_licenses license = (Household_member_licences.to_household_member_licenses) Initialize_table_household_members.tbl_household_member_licenses_ALM.get(row);

        int col = tbl_household_member_licenses.getSelectedColumn();
        if (col == 2) {
            tf_title.setText(license.title);
            try {
                tf_expiry.setDate(DateType.sf.parse(license.expiry));
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_household_members.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_licenses_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_licenses_M.fireTableDataChanged();

                    } else {
                        Household_member_licences.delete_data(license);
                        String where = " where household_member_no='" + license.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_licences(where);

                    }
                    Alert.set(3, "");
                    jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_licenses_ALM.size());
                    clear_household_member_licenses();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_licenses() {
        tf_title.setText("");
        tbl_household_member_licenses.getSelectionModel().clearSelection();
        tf_title.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Work Experiences ">
    private void save_household_work_experiences() {
        int row = tbl_household_member_work_experiences.getSelectedRow();

        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String company = tf_company.getText();
            String company_address = tf_company_address.getText();
            String work_position = tf_work_position.getText();
            String work_description = tf_work_description.getText();
            String work_started = DateType.sf.format(tf_work_started.getDate());
            String work_ended = DateType.sf.format(tf_work_ended.getDate());

            Household_member_work_experiences.to_household_member_work_experiences work_experience = new Household_member_work_experiences.to_household_member_work_experiences(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, company, company_address, work_position, work_description, work_started, work_ended);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_work_experiences_ALM.add(work_experience);
                jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_work_experiences_ALM.size());
            } else {
                Household_member_work_experiences.add_data(work_experience);
                String where = " where household_member_no='" + work_experience.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_work_experiences(where);
                jLabel20.setText("" + Initialize_table_household_members.tbl_household_member_work_experiences_ALM.size());
            }
            Alert.set(1, "");
        } else {

            Household_member_work_experiences.to_household_member_work_experiences work_experience = (Household_member_work_experiences.to_household_member_work_experiences) Initialize_table_household_members.tbl_household_member_work_experiences_ALM.get(row);

            int id = work_experience.id;
            String created_at = work_experience.created_at;
            String updated_at = work_experience.updated_at;
            String created_by = work_experience.created_by;
            String updated_by = work_experience.updated_by;
            String region = work_experience.region;
            String region_id = work_experience.region_id;
            String province = work_experience.province;
            String province_id = work_experience.province_id;
            String city = work_experience.city;
            String city_id = work_experience.city_id;
            String barangay = work_experience.barangay;
            String barangay_id = work_experience.barangay_id;
            String purok = work_experience.purok;
            String purok_id = work_experience.purok_id;
            int status = work_experience.status;
            String house_no = work_experience.house_no;
            String household_no = work_experience.household_no;
            String household_member_no = work_experience.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String company = tf_company.getText();
            String company_address = tf_company_address.getText();
            String work_position = tf_work_position.getText();
            String work_description = tf_work_description.getText();
            String work_started = DateType.sf.format(tf_work_started.getDate());
            String work_ended = DateType.sf.format(tf_work_ended.getDate());

            Household_member_work_experiences.to_household_member_work_experiences work_experience1 = new Household_member_work_experiences.to_household_member_work_experiences(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, company, company_address, work_position, work_description, work_started, work_ended);
            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_work_experiences_M.fireTableDataChanged();
            } else {
                Household_member_work_experiences.update_data(work_experience1);
                String where = " where household_member_no='" + work_experience.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_work_experiences(where);
            }
            Alert.set(2, "");
        }
        clear_household_member_work_experience();
    }

    private void select_household_work_experience() {
        final int row = tbl_household_member_work_experiences.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_member_work_experiences.to_household_member_work_experiences work_experiences = (Household_member_work_experiences.to_household_member_work_experiences) Initialize_table_household_members.tbl_household_member_work_experiences_ALM.get(row);

        int col = tbl_household_member_work_experiences.getSelectedColumn();
        if (col == 2) {
            tf_company.setText(work_experiences.company);
            tf_company_address.setText(work_experiences.company_address);
            tf_work_position.setText(work_experiences.work_position);
            tf_work_description.setText(work_experiences.work_description);
            try {
                Date from = DateType.sf.parse(work_experiences.work_started);
                Date to = DateType.sf.parse(work_experiences.work_ended);

                tf_work_started.setDate(from);
                tf_work_ended.setDate(to);
            } catch (ParseException ex) {
                Logger.getLogger(Dlg_household_members.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_work_experiences_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_work_experiences_M.fireTableDataChanged();

                    } else {
                        Household_member_work_experiences.delete_data(work_experiences);
                        String where = " where household_member_no='" + work_experiences.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_work_experiences(where);
                    }
                    Alert.set(3, "");
                    jLabel18.setText("" + Initialize_table_household_members.tbl_household_member_work_experiences_ALM.size());
                    clear_household_member_work_experience();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_work_experience() {
        tf_company.setText("");
        tf_company_address.setText("");
        tf_work_position.setText("");
        tf_work_description.setText("");

        tbl_household_member_work_experiences.getSelectionModel().clearSelection();
        tf_company.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Member Prefered Work ">
    private void save_household_member_prefered_work() {
        int row = tbl_household_member_prefered_works.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household_member.region;
            String region_id = household_member.region_id;
            String province = household_member.province;
            String province_id = household_member.province_id;
            String city = household_member.city;
            String city_id = household_member.city_id;
            String barangay = household_member.barangay;
            String barangay_id = household_member.barangay_id;
            String purok = household_member.purok;
            String purok_id = household_member.purok_id;
            int status = 0;
            String house_no = household_member.house_no;
            String household_no = household_member.household_no;
            String household_member_no = household_member.household_member_no;

            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String work = tf_work.getText();

            Household_member_prefered_works.to_household_member_prefered_works prefered_work = new Household_member_prefered_works.to_household_member_prefered_works(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, work);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_prefered_works_ALM.add(prefered_work);
                jLabel16.setText("" + Initialize_table_household_members.tbl_household_member_prefered_works_ALM.size());
            } else {
                Household_member_prefered_works.add_data(prefered_work);
                String where = " where household_member_no='" + prefered_work.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_prefered_works(where);
                jLabel20.setText("" + Initialize_table_household_members.tbl_household_member_prefered_works_ALM.size());
            }
            Alert.set(1, "");
        } else {

            Household_member_prefered_works.to_household_member_prefered_works prefered_work = (Household_member_prefered_works.to_household_member_prefered_works) Initialize_table_household_members.tbl_household_member_prefered_works_ALM.get(row);

            int id = prefered_work.id;
            String created_at = prefered_work.created_at;
            String updated_at = prefered_work.updated_at;
            String created_by = prefered_work.created_by;
            String updated_by = prefered_work.updated_by;
            String region = prefered_work.region;
            String region_id = prefered_work.region_id;
            String province = prefered_work.province;
            String province_id = prefered_work.province_id;
            String city = prefered_work.city;
            String city_id = prefered_work.city_id;
            String barangay = prefered_work.barangay;
            String barangay_id = prefered_work.barangay_id;
            String purok = prefered_work.purok;
            String purok_id = prefered_work.purok_id;
            int status = prefered_work.status;
            String house_no = prefered_work.house_no;
            String household_no = prefered_work.household_no;
            String household_member_no = prefered_work.household_member_no;
            String fname = tf_fname.getText();
            String mname = tf_mname.getText();
            String lname = tf_lname.getText();
            String sname = tf_sname.getText();

            String work = tf_work.getText();
            prefered_work.setWork(work);

            if (household_member.id == 0) {
                Initialize_table_household_members.tbl_household_member_prefered_works_M.fireTableDataChanged();
            } else {
                Household_member_prefered_works.update_data(prefered_work);
                String where = " where household_member_no='" + prefered_work.household_member_no + "'";
                Initialize_table_household_members.ret_household_member_prefered_works(where);
            }
            Alert.set(2, "");
        }
        clear_household_member_prefered_works();
    }

    private void select_household_prefered_works() {
        final int row = tbl_household_member_prefered_works.getSelectedRow();
        if (row < 0) {
            return;
        }
        System.out.println("row: " + row);
        final Household_member_prefered_works.to_household_member_prefered_works prefered_work = (Household_member_prefered_works.to_household_member_prefered_works) Initialize_table_household_members.tbl_household_member_prefered_works_ALM.get(row);

        int col = tbl_household_member_prefered_works.getSelectedColumn();
        System.out.println("col: " + col);
        if (col == 1) {
            tf_work.setText(prefered_work.work);
        }
        if (col == 2) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household_member.id == 0) {
                        Initialize_table_household_members.tbl_household_member_prefered_works_ALM.remove(row);
                        Initialize_table_household_members.tbl_household_member_prefered_works_M.fireTableDataChanged();

                    } else {
                        Household_member_prefered_works.delete_data(prefered_work);
                        String where = " where household_member_no='" + prefered_work.household_member_no + "'";
                        Initialize_table_household_members.ret_household_member_prefered_works(where);
                    }
                    Alert.set(3, "");
                    jLabel18.setText("" + Initialize_table_household_members.tbl_household_member_prefered_works_ALM.size());
                    clear_household_member_prefered_works();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void clear_household_member_prefered_works() {
        tf_work.setText("");
        tbl_household_member_work_experiences.getSelectionModel().clearSelection();
        tf_work.grabFocus();
    }

    //</editor-fold>
    private void ok() {

        //<editor-fold defaultstate="collapsed" desc=" callback ">
        int id = 0;
        String created_at = "";
        String updated_at = "";
        String created_by = "";
        String updated_by = "";
        String region = "";
        String region_id = "";
        String province = "";
        String province_id = "";
        String city = "";
        String city_id = "";
        String barangay = "";
        String barangay_id = "";
        String purok = "";
        String purok_id = "";
        int status = 0;
        String house_no = "";
        String household_no = "";
        String household_member_no = "";

        String fname = tf_fname.getText();
        String mname = tf_mname.getText();
        String lname = tf_lname.getText();
        String sname = tf_sname.getText();
        String gender = tf_genders.getText();
        String marital_status = tf_maritals.getText();
        String bday = DateType.sf.format(tf_bday.getDate());
        double occupancy_years = FitIn.toDouble(tf_occupancy_years.getText());
        String height = tf_height.getText();
        String weight = tf_height.getText();
        String birth_place = tf_birth_place.getText();
        String present_address = tf_present_address.getText();
        String relation_to_household = tf_relation.getText();
        String religion = tf_religions.getText();
        String citizenship = tf_citizenship.getText();
        String email_address = tf_email_address.getText();
        String blood_type = tf_blood_type.getText();
        String languages_spoken = tf_others_language.getText();
        int is_registered_voter = FitIn.toInt(cb_is_registered_voter.getText().trim());
        String voters_id_no = tf_is_registered_voter.getText();
        List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = Initialize_table_household_members.tbl_household_member_health_statuses_ALM;
        List<Household_member_medications.to_household_member_medications> health_medications = Initialize_table_household_members.tbl_household_member_medications_ALM;
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = Initialize_table_household_members.tbl_household_member_educational_backgrounds_ALM;
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = Initialize_table_household_members.tbl_household_member_vocational_experiences_ALM;
        List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = Initialize_table_household_members.tbl_household_member_competence_certificates_ALM;
        List<Household_member_licences.to_household_member_licenses> licenses = Initialize_table_household_members.tbl_household_member_licenses_ALM;
        List<Household_member_work_experiences.to_household_member_work_experiences> work_experience = Initialize_table_household_members.tbl_household_member_work_experiences_ALM;
        List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = Initialize_table_household_members.tbl_household_member_prefered_works_ALM;
        String image = tf_genders1.getText();
        int employment_status = 0;
        if (cb_status_employed1.isSelected()) {
            employment_status = 1;
        }
        String employment_type = "";
        if (cb_employment_worker1.isSelected()) {
            employment_type = "Worker";
        } else if (cb_employment_employee1.isSelected()) {
            employment_type = "Employeer";
        } else if (cb_employment_self_employed1.isSelected()) {
            employment_type = " Self Employed";
        } else if (cb_employment_director1.isSelected()) {
            employment_type = "Director";
        } else if (cb_employment_office_holder1.isSelected()) {
            employment_type = "Office Holder";
        } else if (cb_employment_ofw1.isSelected()) {
            employment_type = "OFW";
        }
        String unemployment_type = "";
        if (jRadioButton5.isSelected()) {
            unemployment_type = "Finsihed Contract";
        } else if (jRadioButton6.isSelected()) {
            unemployment_type = "Terminated/Laid Off,local";
        } else if (jRadioButton7.isSelected()) {
            unemployment_type = "Resigned";
        } else if (jRadioButton8.isSelected()) {
            unemployment_type = "Terminated/Laid off, abroad";
        }

        int is_looking_for_work = 0;
        if (cb_status_unemployed2.isSelected()) {
            is_looking_for_work = 1;
        }

        String company = tf_comapany.getText();
        String work_position = tf_work.getText();
        String work_description = tf_work_description.getText();

        String ofw_business_name = tf_ofw_business_name.getText();
        String ofw_business_address = tf_ofw_business_address.getText();
        String ofw_mailing_address = tf_ofw_mailing_address.getText();
        String ofw_type_of_business = tf_ofw_type_of_business.getText();
        double ofw_financial_assistance_amount = FitIn.toDouble(tf_ofw_financial_assistance_amount.getText());
        String ofw_country = tf_ofw_country.getText();
        String ofw_job = tf_ofw_job.getText();
        String ofw_reason_for_migration = tf_ofw_reason_for_migration.getText();

        Household_member_employment_status.to_household_member_employment_status employment_status1 = new Household_member_employment_status.to_household_member_employment_status(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, employment_status, employment_type, unemployment_type, company, work_position, work_description, is_looking_for_work, ofw_business_name, ofw_business_address, ofw_mailing_address, ofw_type_of_business, ofw_financial_assistance_amount, ofw_country, ofw_job, ofw_reason_for_migration);

        int ps_teaching = get_status(cb_ps_teaching);
        int ps_negotiating = get_status(cb_ps_negotiating);
        int ps_diverting = get_status(cb_ps_diverting);
        int ps_persuading = get_status(cb_ps_persuading);
        int ps_promoting = get_status(cb_ps_promoting);
        int ps_selling = get_status(cb_ps_selling);
        int ps_leading = get_status(cb_ps_leading);
        int ps_speaking = get_status(cb_ps_speaking);
        int ps_serving = get_status(cb_ps_serving);
        int ps_helping = get_status(cb_ps_helping);
        int ps_encouraging = get_status(cb_ps_encouraging);
        int ps_motivating = get_status(cb_ps_motivating);
        int ds_coordinating = get_status(cb_ds_coordinating);
        int ds_analyzing = get_status(cb_ds_analyzing);
        int ds_planning = get_status(cb_ds_planning);
        int ds_compiling = get_status(cb_ds_compiling);
        int ds_computing = get_status(cb_ds_computing);
        int ds_recording = get_status(cb_ds_recording);
        int ds_checking = get_status(cb_ds_checking);
        int ds_researching = get_status(cb_ds_researching);
        int ds_testing = get_status(cb_ds_testing);
        int ds_comparing = get_status(cb_ds_comparing);
        int ds_tabulating = get_status(cb_ds_tabulating);
        int ds_posting = get_status(cb_ds_posting);
        int ds_copying = get_status(cb_ds_copying);
        int ts_machine_work = get_status(cb_ts_machine_work);
        int ts_setting_up = get_status(cb_ts_setting_up);
        int ts_assembling = get_status(cb_ts_assembling);
        int ts_operating = get_status(cb_ts_operating);
        int ts_driving = get_status(cb_ts_driving);
        int ts_repairing = get_status(cb_ts_repairing);
        int ts_manipulating = get_status(cb_ts_manipulating);
        int ts_materials_handling = get_status(cb_ts_materials_handling);
        int ts_producing = get_status(cb_ts_producing);
        int ts_inspecting = get_status(cb_ts_inspecting);
        int ts_warehousing = get_status(cb_ts_warehousing);
        int ts_building = get_status(cb_ts_building);
        int ts_precision_working = get_status(cb_ts_precision);
        int ts_restoring = get_status(cb_ts_restoring);
        int ts_feeding = get_status(cb_ts_feeding);
        int is_implementing = get_status(cb_is_implementing);
        int is_synthesizing = get_status(cb_is_synthesizing);
        int is_interpreting = get_status(cb_is_interpreting);
        int is_instruction = get_status(cb_is_instruction);
        int is_speculating = get_status(cb_is_speculation);
        int is_anticipating = get_status(cb_is_anticipating);
        int is_inventing = get_status(cb_is_creating);
        int is_discovering = get_status(cb_is_discovering);
        int is_predicting = get_status(cb_is_predicting);
        int is_theorizing = get_status(cb_is_theorizing);
        int is_innovating = get_status(cb_is_innovating);
        int is_expressing = get_status(cb_is_expressing);
        int is_organizing = get_status(organizing);

        Household_member_skills.to_household_member_skills skills = new Household_member_skills.to_household_member_skills(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, ps_teaching, ps_negotiating, ps_diverting, ps_persuading, ps_promoting, ps_selling, ps_leading, ps_speaking, ps_serving, ps_helping, ps_encouraging, ps_motivating, ds_coordinating, ds_analyzing, ds_planning, ds_compiling, ds_computing, ds_recording, ds_checking, ds_researching, ds_testing, ds_comparing, ds_tabulating, ds_posting, ds_copying, ts_machine_work, ts_setting_up, ts_assembling, ts_operating, ts_driving, ts_repairing, ts_manipulating, ts_materials_handling, ts_producing, ts_inspecting, ts_warehousing, ts_building, ts_precision_working, ts_restoring, ts_feeding, is_implementing, is_synthesizing, is_interpreting, is_instruction, is_speculating, is_anticipating, is_inventing, is_discovering, is_predicting, is_theorizing, is_innovating, is_expressing, is_organizing);
        for (WebcamPanel panel : panels) {
            panel.stop();
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experience, prefered_works, employment_status1, skills, image));
        }

        //</editor-fold>
    }

    private int get_status(JCheckBox box) {
        if (box.isSelected()) {
            return 1;
        } else {
            return 0;
        }
    }

    private void update_household_member_basic_infomation() {

        //<editor-fold defaultstate="collapsed" desc=" Basic Information ">
        int id = household_member.id;
        String created_at = household_member.created_at;
        String updated_at = household_member.updated_at;
        String created_by = household_member.created_by;
        String updated_by = household_member.updated_by;
        String region = household_member.region;
        String region_id = household_member.region_id;
        String province = household_member.province;
        String province_id = household_member.province_id;
        String city = household_member.city;
        String city_id = household_member.city_id;
        String barangay = household_member.barangay;
        String barangay_id = household_member.barangay_id;
        String purok = household_member.purok;
        String purok_id = household_member.purok_id;
        int status = household_member.status;
        String house_no = household_member.house_no;
        String household_no = household_member.house_no;
        String household_member_no = household_member.household_member_no;
        String fname = tf_fname.getText();
        String mname = tf_mname.getText();
        String lname = tf_lname.getText();
        String sname = tf_sname.getText();
        String gender = tf_genders.getText();
        String marital_status = tf_maritals.getText();
        String bday = DateType.sf.format(tf_bday.getDate());
        double occupancy_years = FitIn.toDouble(tf_occupancy_years.getText());
        String height = tf_height.getText();
        String weight = tf_height.getText();
        String birth_place = tf_birth_place.getText();
        String present_address = tf_present_address.getText();
        String relation_to_household = tf_relation.getText();
        String religion = tf_religions.getText();
        String citizenship = tf_citizenship.getText();
        String email_address = tf_email_address.getText();
        String blood_type = tf_blood_type.getText();
        String languages_spoken = tf_languages_spoken.getText();
        int is_registered_voter = FitIn.toInt(cb_is_registered_voter.getText().trim());
        String voters_id_no = tf_is_registered_voter.getText();
        List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = new ArrayList();
        List<Household_member_medications.to_household_member_medications> health_medications = new ArrayList();
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = new ArrayList();
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = new ArrayList();
        List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = new ArrayList();
        List<Household_member_licences.to_household_member_licenses> licenses = new ArrayList();
        List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences = new ArrayList();
        List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = new ArrayList();
        Household_member_employment_status.to_household_member_employment_status employment_status = null;
        Household_member_skills.to_household_member_skills skills = null;
        String image = tf_genders1.getText();
        Household_members.to_household_members household_mem = new Household_members.to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experiences, prefered_works, employment_status, skills, image);
        Household_members.update_data(household_mem);
        Alert.set(2, "");
        //</editor-fold>

    }

    private void update_household_member_employment_status() {

        //<editor-fold defaultstate="collapsed" desc=" Employment Status ">
        int id = household_member.id;
        String created_at = household_member.created_at;
        String updated_at = household_member.updated_at;
        String created_by = household_member.created_by;
        String updated_by = household_member.updated_by;
        String region = household_member.region;
        String region_id = household_member.region_id;
        String province = household_member.province;
        String province_id = household_member.province_id;
        String city = household_member.city;
        String city_id = household_member.city_id;
        String barangay = household_member.barangay;
        String barangay_id = household_member.barangay_id;
        String purok = household_member.purok;
        String purok_id = household_member.purok_id;
        int status = household_member.status;
        String house_no = household_member.house_no;
        String household_no = household_member.house_no;
        String household_member_no = household_member.household_member_no;
        String fname = tf_fname.getText();
        String mname = tf_mname.getText();
        String lname = tf_lname.getText();
        String sname = tf_sname.getText();
        int employment_status = 0;
        if (cb_status_employed1.isSelected()) {
            employment_status = 1;
        }
        String employment_type = "";
        if (cb_employment_worker1.isSelected()) {
            employment_type = "Worker";
        } else if (cb_employment_employee1.isSelected()) {
            employment_type = "Employeer";
        } else if (cb_employment_self_employed1.isSelected()) {
            employment_type = " Self Employed";
        } else if (cb_employment_director1.isSelected()) {
            employment_type = "Director";
        } else if (cb_employment_office_holder1.isSelected()) {
            employment_type = "Office Holder";
        } else if (cb_employment_ofw1.isSelected()) {
            employment_type = "OFW";
        }
        String unemployment_type = "";
        if (jRadioButton5.isSelected()) {
            unemployment_type = "Finsihed Contract";
        } else if (jRadioButton6.isSelected()) {
            unemployment_type = "Terminated/Laid Off,local";
        } else if (jRadioButton7.isSelected()) {
            unemployment_type = "Resigned";
        } else if (jRadioButton8.isSelected()) {
            unemployment_type = "Terminated/Laid off, abroad";
        }

        int is_looking_for_work = 0;
        if (cb_status_unemployed2.isSelected()) {
            is_looking_for_work = 1;
        }

        String company = tf_comapany.getText();
        String work_position = tf_work.getText();
        String work_description = tf_work_description.getText();

        String ofw_business_name = tf_ofw_business_name.getText();
        String ofw_business_address = tf_ofw_business_address.getText();
        String ofw_mailing_address = tf_ofw_mailing_address.getText();
        String ofw_type_of_business = tf_ofw_type_of_business.getText();
        double ofw_financial_assistance_amount = FitIn.toDouble(tf_ofw_financial_assistance_amount.getText());
        String ofw_country = tf_ofw_country.getText();
        String ofw_job = tf_ofw_job.getText();
        String ofw_reason_for_migration = tf_ofw_reason_for_migration.getText();
        Household_member_employment_status.to_household_member_employment_status employment_status1 = new Household_member_employment_status.to_household_member_employment_status(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, employment_status, employment_type, unemployment_type, company, work_position, work_description, is_looking_for_work, ofw_business_name, ofw_business_address, ofw_mailing_address, ofw_type_of_business, ofw_financial_assistance_amount, ofw_country, ofw_job, ofw_reason_for_migration);
        Household_member_employment_status.update_data(employment_status1);
        Alert.set(2, "");
        //</editor-fold>

    }

    private void update_household_member_skills() {

        //<editor-fold defaultstate="collapsed" desc=" Skills ">
        int id = household_member.id;
        String created_at = household_member.created_at;
        String updated_at = household_member.updated_at;
        String created_by = household_member.created_by;
        String updated_by = household_member.updated_by;
        String region = household_member.region;
        String region_id = household_member.region_id;
        String province = household_member.province;
        String province_id = household_member.province_id;
        String city = household_member.city;
        String city_id = household_member.city_id;
        String barangay = household_member.barangay;
        String barangay_id = household_member.barangay_id;
        String purok = household_member.purok;
        String purok_id = household_member.purok_id;
        int status = household_member.status;
        String house_no = household_member.house_no;
        String household_no = household_member.house_no;
        String household_member_no = household_member.household_member_no;
        String fname = tf_fname.getText();
        String mname = tf_mname.getText();
        String lname = tf_lname.getText();
        String sname = tf_sname.getText();
        int ps_teaching = get_status(cb_ps_teaching);
        int ps_negotiating = get_status(cb_ps_negotiating);
        int ps_diverting = get_status(cb_ps_diverting);
        int ps_persuading = get_status(cb_ps_persuading);
        int ps_promoting = get_status(cb_ps_promoting);
        int ps_selling = get_status(cb_ps_selling);
        int ps_leading = get_status(cb_ps_leading);
        int ps_speaking = get_status(cb_ps_speaking);
        int ps_serving = get_status(cb_ps_serving);
        int ps_helping = get_status(cb_ps_helping);
        int ps_encouraging = get_status(cb_ps_encouraging);
        int ps_motivating = get_status(cb_ps_motivating);
        int ds_coordinating = get_status(cb_ds_coordinating);
        int ds_analyzing = get_status(cb_ds_analyzing);
        int ds_planning = get_status(cb_ds_planning);
        int ds_compiling = get_status(cb_ds_compiling);
        int ds_computing = get_status(cb_ds_computing);
        int ds_recording = get_status(cb_ds_recording);
        int ds_checking = get_status(cb_ds_checking);
        int ds_researching = get_status(cb_ds_researching);
        int ds_testing = get_status(cb_ds_testing);
        int ds_comparing = get_status(cb_ds_comparing);
        int ds_tabulating = get_status(cb_ds_tabulating);
        int ds_posting = get_status(cb_ds_posting);
        int ds_copying = get_status(cb_ds_copying);
        int ts_machine_work = get_status(cb_ts_machine_work);
        int ts_setting_up = get_status(cb_ts_setting_up);
        int ts_assembling = get_status(cb_ts_assembling);
        int ts_operating = get_status(cb_ts_operating);
        int ts_driving = get_status(cb_ts_driving);
        int ts_repairing = get_status(cb_ts_repairing);
        int ts_manipulating = get_status(cb_ts_manipulating);
        int ts_materials_handling = get_status(cb_ts_materials_handling);
        int ts_producing = get_status(cb_ts_producing);
        int ts_inspecting = get_status(cb_ts_inspecting);
        int ts_warehousing = get_status(cb_ts_warehousing);
        int ts_building = get_status(cb_ts_building);
        int ts_precision_working = get_status(cb_ts_precision);
        int ts_restoring = get_status(cb_ts_restoring);
        int ts_feeding = get_status(cb_ts_feeding);
        int is_implementing = get_status(cb_is_implementing);
        int is_synthesizing = get_status(cb_is_synthesizing);
        int is_interpreting = get_status(cb_is_interpreting);
        int is_instruction = get_status(cb_is_instruction);
        int is_speculating = get_status(cb_is_speculation);
        int is_anticipating = get_status(cb_is_anticipating);
        int is_inventing = get_status(cb_is_creating);
        int is_discovering = get_status(cb_is_discovering);
        int is_predicting = get_status(cb_is_predicting);
        int is_theorizing = get_status(cb_is_theorizing);
        int is_innovating = get_status(cb_is_innovating);
        int is_expressing = get_status(cb_is_expressing);
        int is_organizing = get_status(organizing);
        Household_member_skills.to_household_member_skills skills = new Household_member_skills.to_household_member_skills(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, ps_teaching, ps_negotiating, ps_diverting, ps_persuading, ps_promoting, ps_selling, ps_leading, ps_speaking, ps_serving, ps_helping, ps_encouraging, ps_motivating, ds_coordinating, ds_analyzing, ds_planning, ds_compiling, ds_computing, ds_recording, ds_checking, ds_researching, ds_testing, ds_comparing, ds_tabulating, ds_posting, ds_copying, ts_machine_work, ts_setting_up, ts_assembling, ts_operating, ts_driving, ts_repairing, ts_manipulating, ts_materials_handling, ts_producing, ts_inspecting, ts_warehousing, ts_building, ts_precision_working, ts_restoring, ts_feeding, is_implementing, is_synthesizing, is_interpreting, is_instruction, is_speculating, is_anticipating, is_inventing, is_discovering, is_predicting, is_theorizing, is_innovating, is_expressing, is_organizing);
        Household_member_skills.update_data(skills);
        Alert.set(2, "");

        //</editor-fold>
    }
    private final Dimension size = WebcamResolution.QQVGA.getSize();
    private final List<Webcam> webcams = Webcam.getWebcams();
    private final List<WebcamPanel> panels = new ArrayList<>();

    private void init_camera() {

        //<editor-fold defaultstate="collapsed" desc=" camera ">
        if (jButton1.getText().equalsIgnoreCase("Capture")) {
            String home = System.getProperty("user.home", "C:\\Users\\Guinness");
//            String home = "C:\\Users\\Guinness\\Desktop";
            System.out.println("House No: " + my_house_no);
            System.out.println("Household No: " + my_household_no);
            System.out.println("Household Member No: " + my_household_member_no);
            String path = home + "\\images\\" + my_region + "\\" + my_province + "\\" + my_city + "\\" + my_barangay + "\\" + my_house_no + "\\" + my_household_no;
            File files = new File(path);
            if (files.exists()) {
                if (files.mkdirs()) {
                    System.out.println("Multiple directories are created!");
                } else {
                    System.out.println("Failed to create multiple directories!");
                }
            } else {
                if (files.mkdirs()) {
                    System.out.println("Directory is created!");
                } else {
                    System.out.println("Failed to create directory!");
                }
            }

            try {
                for (int i = 0; i < webcams.size(); i++) {
                    Webcam webcam = webcams.get(i);
                    File file = new File(path + "\\" + my_household_member_no + ".jpg");
                    ImageIO.write(webcam.getImage(), "JPG", file);
                }

                tf_genders1.setText(my_household_member_no + ".jpg");

            } catch (IOException e1) {

            }
        }
        if (jButton1.getText().equalsIgnoreCase("Start")) {
            jButton1.setText("Capture");
            for (Webcam webcam : webcams) {
                webcam.setViewSize(new Dimension(320, 240));
                WebcamPanel panel = new WebcamPanel(webcam, size, false);
                panel.setSize(new Dimension(jPanel2.getWidth(), jPanel2.getHeight()));
                panel.setFPSDisplayed(true);
                panel.setFillArea(true);
                panels.add(panel);
            }

            jPanel16.setLayout(new BorderLayout());
            for (WebcamPanel panel : panels) {
                jPanel16.add(panel);
            }

            jPanel16.updateUI();
            jPanel2.updateUI();

            for (WebcamPanel panel : panels) {
                panel.start();
            }
        }
        //</editor-fold>

    }
}
