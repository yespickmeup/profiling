/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.assets.Dlg_assets;
import city_planning.basic_needs.Dlg_basic_needs;
import city_planning.household_assets.Household_assets;
import city_planning.household_concerns.Household_concerns;
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
import city_planning.houses.Houses;
import city_planning.initialize_fields.Initialize_house_field_types;
import city_planning.initialize_fields.Initialize_household_field_types;
import city_planning.initialize_fields.Initialize_household_member_field_types;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.DateType;
import city_planning.util.Dlg_confirm_action;
import city_planning.util.TableRenderer;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_households extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_households
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

        public final String household_no;
        public final String occupancy_types;
        public final String tenure;
        public final int is_occupant_owns_the_land;
        public final int is_occupant_owns_the_bldg;
        public final double monthly_rental;
        public final String drainage_system_concern;
        public final String street_maintenance_concern;
        public final String garbage_collection_concern;
        public final String fire_protection_concern;
        public final String police_protection_concern;
        public final String ambulance_service_concern;
        public final String livelihood_programs_concern;
        public final String adolescent_pregnancy_rate;
        public final String child_abuse_rating;
        public final String crime_rating;
        public final String domestic_violence_rating;
        public final String drug_abuse_rating;
        public final String hunger_rating;
        public final String environmental_contamination_rating;
        public final String health_disparities_rating;
        public final List<Household_assets.to_household_assets> assets;
        public final List<Household_expenditures.to_household_expenditures> household_expenditures;
        public final List<Household_consumptions.to_household_consumptions> household_consumptions;
        public final List<Household_members.to_household_members> household_members;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final String house_no;

        public OutputData(String household_no, String occupancy_types, String tenure, int is_occupant_owns_the_land, int is_occupant_owns_the_bldg, double monthly_rental, String drainage_system_concern, String street_maintenance_concern, String garbage_collection_concern, String fire_protection_concern, String police_protection_concern, String ambulance_service_concern, String livelihood_programs_concern, String adolescent_pregnancy_rate, String child_abuse_rating, String crime_rating, String domestic_violence_rating, String drug_abuse_rating, String hunger_rating, String environmental_contamination_rating, String health_disparities_rating, List<Household_assets.to_household_assets> assets, List<Household_expenditures.to_household_expenditures> household_expenditures, List<Household_consumptions.to_household_consumptions> household_consumptions, List<Household_members.to_household_members> household_members, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, String house_no) {
            this.household_no = household_no;
            this.occupancy_types = occupancy_types;
            this.tenure = tenure;
            this.is_occupant_owns_the_land = is_occupant_owns_the_land;
            this.is_occupant_owns_the_bldg = is_occupant_owns_the_bldg;
            this.monthly_rental = monthly_rental;
            this.drainage_system_concern = drainage_system_concern;
            this.street_maintenance_concern = street_maintenance_concern;
            this.garbage_collection_concern = garbage_collection_concern;
            this.fire_protection_concern = fire_protection_concern;
            this.police_protection_concern = police_protection_concern;
            this.ambulance_service_concern = ambulance_service_concern;
            this.livelihood_programs_concern = livelihood_programs_concern;
            this.adolescent_pregnancy_rate = adolescent_pregnancy_rate;
            this.child_abuse_rating = child_abuse_rating;
            this.crime_rating = crime_rating;
            this.domestic_violence_rating = domestic_violence_rating;
            this.drug_abuse_rating = drug_abuse_rating;
            this.hunger_rating = hunger_rating;
            this.environmental_contamination_rating = environmental_contamination_rating;
            this.health_disparities_rating = health_disparities_rating;
            this.assets = assets;
            this.household_expenditures = household_expenditures;
            this.household_consumptions = household_consumptions;
            this.household_members = household_members;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.house_no = house_no;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_households(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_households(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_households() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_households myRef;

    private void setThisRef(Dlg_households myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_households> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_households create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_households create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_households dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_households((java.awt.Frame) parent, false);
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
            Dlg_households dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_households((java.awt.Dialog) parent, false);
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

        Dlg_households dialog = Dlg_households.create(new javax.swing.JFrame(), true);
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_household_no = new Field.Input();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        tf_tenure = new Field.Combo();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        tf_monthly_rental = new Field.Input();
        jLabel49 = new javax.swing.JLabel();
        jButton16 = new Button.Info();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_house_no = new Field.Search();
        jLabel13 = new javax.swing.JLabel();
        tf_tenure1 = new Field.Combo();
        lbl_purok1 = new javax.swing.JLabel();
        tf_purok = new Field.Combo();
        tf_barangay = new Field.Combo();
        lbl_barangay1 = new javax.swing.JLabel();
        lbl_barangay4 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        tf_province = new Field.Combo();
        lbl_barangay2 = new javax.swing.JLabel();
        lbl_barangay3 = new javax.swing.JLabel();
        tf_region = new Field.Combo();
        jPanel3 = new javax.swing.JPanel();
        lbl_facilities2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_household_assets = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        tf_qty = new Field.Input();
        jLabel51 = new javax.swing.JLabel();
        tf_Asset = new Field.Combo();
        tf_assets = new Button.Primary();
        tf_assets1 = new Button.Default();
        jPanel5 = new javax.swing.JPanel();
        lbl_facilities4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_household_expenditures = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jMonthChooser2 = new com.toedter.calendar.JMonthChooser();
        jLabel60 = new javax.swing.JLabel();
        jTextField25 = new Field.Input();
        jLabel61 = new javax.swing.JLabel();
        jTextField26 = new Field.Input();
        jLabel62 = new javax.swing.JLabel();
        jTextField27 = new Field.Input();
        jLabel63 = new javax.swing.JLabel();
        jTextField28 = new Field.Input();
        jLabel64 = new javax.swing.JLabel();
        jTextField29 = new Field.Input();
        jTextField30 = new Field.Input();
        jLabel76 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jTextField31 = new Field.Input();
        jTextField32 = new Field.Input();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField33 = new Field.Input();
        jTextField34 = new Field.Input();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jTextField35 = new Field.Input();
        jLabel71 = new javax.swing.JLabel();
        jTextField36 = new Field.Input();
        jTextField37 = new Field.Input();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField38 = new Field.Input();
        jTextField39 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField40 = new Field.Input();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        jLabel57 = new javax.swing.JLabel();
        tf_assets2 = new Button.Default();
        tf_assets3 = new Button.Primary();
        jPanel4 = new javax.swing.JPanel();
        lbl_facilities3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_household_consumptions = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        tf_Items = new Field.Combo();
        jTextField24 = new Field.Input();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        tf_assets4 = new Button.Default();
        tf_assets5 = new Button.Primary();
        jPanel6 = new javax.swing.JPanel();
        lbl_facilities5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        tf_drainage = new Field.Combo();
        tf_garbage_collection = new Field.Combo();
        tf_street_maintenance = new Field.Combo();
        tf_fire_protection = new Field.Combo();
        tf_police_protection = new Field.Combo();
        tf_ambulance_service = new Field.Combo();
        tf_livelihood_programs = new Field.Combo();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        tf_adolescent_pregnancy = new Field.Combo();
        tf_child_abuse_and_neglect = new Field.Combo();
        tf_crime = new Field.Combo();
        tf_domestic_violence = new Field.Combo();
        tf_drug_abuse = new Field.Combo();
        tf_hunger = new Field.Combo();
        tf_enviromental_contamination = new Field.Combo();
        tf_health_disparities = new Field.Combo();
        jButton17 = new Button.Info();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_household_members = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_facilities6 = new javax.swing.JLabel();
        tf_assets6 = new Button.Default();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_facilities7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_household_consumptions1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        tf_Items1 = new Field.Combo();
        jTextField41 = new Field.Input();
        jLabel65 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jYearChooser3 = new com.toedter.calendar.JYearChooser();
        jMonthChooser3 = new com.toedter.calendar.JMonthChooser();
        tf_assets7 = new Button.Default();
        tf_assets8 = new Button.Primary();
        jButton4 = new Button.Default();
        jButton5 = new Button.Success();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Household Number:");

        tf_household_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_household_no.setFocusable(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Occupancy Type:");

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Owned");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("Rented");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Tenure:");

        tf_tenure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_tenure.setText("0");
        tf_tenure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_tenureMouseClicked(evt);
            }
        });
        tf_tenure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        tf_tenure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_tenureMouseClicked(evt);
            }
        });
        tf_tenure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tenureActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Do the occupant own the land?");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Do the occupant own the Bldg.?");

        buttonGroup4.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Yes");

        buttonGroup5.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setSelected(true);
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Yes");

        buttonGroup4.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("No");

        buttonGroup5.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("No");

        tf_monthly_rental.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_monthly_rental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_monthly_rentalActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Monthly Rental:");

        jButton16.setText("Update");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("yr/s");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("House Number:");

        tf_house_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_house_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_house_noActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("month/s");

        tf_tenure1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_tenure1.setText("0");
        tf_tenure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_tenureMouseClicked(evt);
            }
        });
        tf_tenure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        tf_tenure1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_tenure1MouseClicked(evt);
            }
        });
        tf_tenure1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tenure1ActionPerformed(evt);
            }
        });

        lbl_purok1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_purok1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_purok1.setText("Purok:");

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_purok.setFocusable(false);
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

        lbl_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay1.setText("Barangay:");

        lbl_barangay4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay4.setText("City/Municipality:");

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

        lbl_barangay2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay2.setText("Province:");

        lbl_barangay3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay3.setText("Region:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_monthly_rental, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_household_no))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_house_no))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tf_tenure, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_tenure1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_barangay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_barangay4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_barangay2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_barangay3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_barangay, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_city, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_province, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_region)
                                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(313, 313, 313))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_house_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_barangay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_household_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tenure, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tenure1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_monthly_rental, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BASIC INFORMATION", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities2.setText("[ASSETS]");

        tbl_household_assets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
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
        tbl_household_assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_assetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_household_assets);

        jLabel1.setText("No. of rows:");

        jLabel3.setText("0");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Quantity:");

        tf_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_qtyActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Asset:");

        tf_Asset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_Asset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_AssetMouseClicked(evt);
            }
        });
        tf_Asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_AssetActionPerformed(evt);
            }
        });

        tf_assets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets.setText("Save");
        tf_assets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assetsActionPerformed(evt);
            }
        });

        tf_assets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets1.setText("New");
        tf_assets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                    .addComponent(lbl_facilities2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Asset)
                            .addComponent(tf_qty))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Asset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ASSETS", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities4.setText("[EXPENDITURES]");

        tbl_household_expenditures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
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
        tbl_household_expenditures.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_expendituresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_household_expenditures);

        jLabel6.setText("No. of rows:");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Month:");

        jMonthChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("Fuel Expenses:");

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("Internet Services:");

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("Medical Expenses:");

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("Cigarretes/Tobacco:");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel64.setText("Hobbies/Clubs:");

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setText("Parties/Social Obligations:");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel66.setText("Load Expenses:");

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Electric/Gas/Oil/Propane:");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel68.setText("Book/Newspaper/Magazine:");

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel69.setText("Gambling:");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel70.setText("Personal Care:");

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel71.setText("Cable Services:");

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel72.setText("Water Bill:");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel73.setText("Vacation/Travel:");

        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel74.setText("Alcohol:");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel75.setText("Misc:");

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Year:");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(lbl_facilities4)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMonthChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField25)
                            .addComponent(jTextField26)
                            .addComponent(jTextField27)
                            .addComponent(jTextField28)
                            .addComponent(jTextField29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jYearChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField38, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField37, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(jTextField36))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel76)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField30)))
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3))
                        .addGap(26, 26, 26))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lbl_facilities4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jYearChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMonthChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("EXPENDITURES", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities3.setText("[CONSUMPTION]");

        tbl_household_consumptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_household_consumptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_consumptionsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_household_consumptions);

        jLabel4.setText("No. of rows:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Year:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Month:");

        tf_Items.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_Items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ItemsMouseClicked(evt);
            }
        });
        tf_Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ItemsActionPerformed(evt);
            }
        });

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Amount:");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Items:");

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                    .addComponent(lbl_facilities3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24)
                            .addComponent(tf_Items)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Items, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CONSUMPTION", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities5.setText("[CONCERNS]");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rate the following services available in your community:");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Drainage System:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Street Maintenance:");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("Garbage Collection:");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("Fire Protection:");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("Police Protection:");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("Ambulance Service:");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Livelihood Programs:");

        tf_drainage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_drainage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_drainageMouseClicked(evt);
            }
        });
        tf_drainage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_drainageActionPerformed(evt);
            }
        });

        tf_garbage_collection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_garbage_collection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_garbage_collectionMouseClicked(evt);
            }
        });
        tf_garbage_collection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_garbage_collectionActionPerformed(evt);
            }
        });

        tf_street_maintenance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_street_maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_street_maintenanceMouseClicked(evt);
            }
        });
        tf_street_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_street_maintenanceActionPerformed(evt);
            }
        });

        tf_fire_protection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_fire_protection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_fire_protectionMouseClicked(evt);
            }
        });
        tf_fire_protection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fire_protectionActionPerformed(evt);
            }
        });

        tf_police_protection.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_police_protection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_police_protectionMouseClicked(evt);
            }
        });
        tf_police_protection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_police_protectionActionPerformed(evt);
            }
        });

        tf_ambulance_service.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_ambulance_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ambulance_serviceMouseClicked(evt);
            }
        });
        tf_ambulance_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ambulance_serviceActionPerformed(evt);
            }
        });

        tf_livelihood_programs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_livelihood_programs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_livelihood_programsMouseClicked(evt);
            }
        });
        tf_livelihood_programs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_livelihood_programsActionPerformed(evt);
            }
        });

        jLabel224.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel224.setText("Adolescent Pregnancy:");

        jLabel225.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel225.setText("Child abuse and neglect:");

        jLabel226.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel226.setText("Crime");

        jLabel227.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel227.setText("Domestic Violence;");

        jLabel228.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel228.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel228.setText("Drug Abuse:");

        jLabel229.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel229.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel229.setText("Environmental Contamination:");

        jLabel230.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel230.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel230.setText("Health Disparities:");

        jLabel231.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel231.setText("Hunger:");

        jLabel223.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel223.setText("Rate the following problems present in your community:");

        tf_adolescent_pregnancy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_adolescent_pregnancy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_adolescent_pregnancyMouseClicked(evt);
            }
        });
        tf_adolescent_pregnancy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_adolescent_pregnancyActionPerformed(evt);
            }
        });

        tf_child_abuse_and_neglect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_child_abuse_and_neglect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_child_abuse_and_neglectMouseClicked(evt);
            }
        });
        tf_child_abuse_and_neglect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_child_abuse_and_neglectActionPerformed(evt);
            }
        });

        tf_crime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_crime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_crimeMouseClicked(evt);
            }
        });
        tf_crime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_crimeActionPerformed(evt);
            }
        });

        tf_domestic_violence.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_domestic_violence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_domestic_violenceMouseClicked(evt);
            }
        });
        tf_domestic_violence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_domestic_violenceActionPerformed(evt);
            }
        });

        tf_drug_abuse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_drug_abuse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_drug_abuseMouseClicked(evt);
            }
        });
        tf_drug_abuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_drug_abuseActionPerformed(evt);
            }
        });

        tf_hunger.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_hunger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_hungerMouseClicked(evt);
            }
        });
        tf_hunger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hungerActionPerformed(evt);
            }
        });

        tf_enviromental_contamination.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_enviromental_contamination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_enviromental_contaminationMouseClicked(evt);
            }
        });
        tf_enviromental_contamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_enviromental_contaminationActionPerformed(evt);
            }
        });

        tf_health_disparities.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_health_disparities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_health_disparitiesMouseClicked(evt);
            }
        });
        tf_health_disparities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_health_disparitiesActionPerformed(evt);
            }
        });

        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel223)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_facilities5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_garbage_collection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_street_maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_drainage, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addGap(130, 130, 130)
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(tf_ambulance_service, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(tf_domestic_violence, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(tf_police_protection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(tf_fire_protection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel83))
                                                        .addGap(94, 94, 94)
                                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_livelihood_programs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_enviromental_contamination, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_drug_abuse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel226, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel225, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel224, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(tf_crime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tf_adolescent_pregnancy, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tf_child_abuse_and_neglect, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tf_health_disparities, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tf_hunger, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGap(0, 72, Short.MAX_VALUE))))
                .addGap(65, 65, 65))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbl_facilities5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_fire_protection, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_livelihood_programs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tf_drainage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_street_maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_police_protection, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_garbage_collection, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ambulance_service, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel224, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_adolescent_pregnancy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_domestic_violence, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel229, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_enviromental_contamination, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_child_abuse_and_neglect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_hunger, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel228, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_drug_abuse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_crime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel230, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_health_disparities, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONCERNS", jPanel6);

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
        jScrollPane4.setViewportView(tbl_household_members);

        jLabel8.setText("No. of rows:");

        jLabel9.setText("0");

        lbl_facilities6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities6.setText("[HOUSEHOLD MEMBERS]");

        tf_assets6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets6.setText("New");
        tf_assets6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_facilities6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_assets6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jTabbedPane1.addTab("MEMBERS", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        lbl_facilities7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities7.setText("[INCOME]");

        tbl_household_consumptions1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_household_consumptions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_consumptions1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_household_consumptions1);

        jLabel14.setText("No. of rows:");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("Year:");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Month:");

        tf_Items1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_Items1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_Items1MouseClicked(evt);
            }
        });
        tf_Items1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_Items1ActionPerformed(evt);
            }
        });

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Amount:");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("Source:");

        jMonthChooser3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_assets7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets7.setText("New");
        tf_assets7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets7ActionPerformed(evt);
            }
        });

        tf_assets8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/download-arrow.png"))); // NOI18N
        tf_assets8.setText("Save");
        tf_assets8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
                    .addComponent(lbl_facilities7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField41)
                            .addComponent(tf_Items1)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonthChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_assets7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_assets8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_facilities7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jYearChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMonthChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Items1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_assets8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("INCOME", jPanel8);

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Ok");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tf_monthly_rentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_monthly_rentalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_monthly_rentalActionPerformed

    private void tf_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_qtyActionPerformed

    private void tf_AssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_AssetActionPerformed
        Initialize_household_field_types.init_assets(tf_Asset);
    }//GEN-LAST:event_tf_AssetActionPerformed

    private void tf_ItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ItemsActionPerformed
        Initialize_household_field_types.init_assets(tf_Items);
    }//GEN-LAST:event_tf_ItemsActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ok();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_drainageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_drainageActionPerformed
        Initialize_household_field_types.init_concerns(tf_drainage);
    }//GEN-LAST:event_tf_drainageActionPerformed

    private void tf_assetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assetsActionPerformed
        save_household_asset();
    }//GEN-LAST:event_tf_assetsActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void tbl_household_assetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_assetsMouseClicked
        select_household_asset();
    }//GEN-LAST:event_tbl_household_assetsMouseClicked

    private void tf_assets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets1ActionPerformed
        clear_household_asset();
    }//GEN-LAST:event_tf_assets1ActionPerformed

    private void tf_assets2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets2ActionPerformed
        clear_household_expenditure();
    }//GEN-LAST:event_tf_assets2ActionPerformed

    private void tf_assets3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets3ActionPerformed
        save_hoousehold_expenditure();
    }//GEN-LAST:event_tf_assets3ActionPerformed

    private void tbl_household_expendituresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_expendituresMouseClicked
        select_household_expenditure();
    }//GEN-LAST:event_tbl_household_expendituresMouseClicked

    private void tf_assets4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets4ActionPerformed
        clear_household_consumption();
    }//GEN-LAST:event_tf_assets4ActionPerformed

    private void tf_assets5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets5ActionPerformed
        save_household_consumption();
    }//GEN-LAST:event_tf_assets5ActionPerformed

    private void tbl_household_consumptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_consumptionsMouseClicked
        select_household_consumption();
    }//GEN-LAST:event_tbl_household_consumptionsMouseClicked

    private void tf_assets6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets6ActionPerformed
        new_household_member();
    }//GEN-LAST:event_tf_assets6ActionPerformed

    private void tf_street_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_street_maintenanceActionPerformed
        Initialize_household_field_types.init_concerns(tf_street_maintenance);
    }//GEN-LAST:event_tf_street_maintenanceActionPerformed

    private void tf_health_disparitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_health_disparitiesActionPerformed
        Initialize_household_field_types.init_problems(tf_health_disparities);
    }//GEN-LAST:event_tf_health_disparitiesActionPerformed

    private void tf_drainageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_drainageMouseClicked
        Initialize_household_field_types.init_concerns(tf_drainage);
    }//GEN-LAST:event_tf_drainageMouseClicked

    private void tf_garbage_collectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_garbage_collectionActionPerformed
        Initialize_household_field_types.init_concerns(tf_garbage_collection);
    }//GEN-LAST:event_tf_garbage_collectionActionPerformed

    private void tf_fire_protectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fire_protectionActionPerformed
        Initialize_household_field_types.init_concerns(tf_fire_protection);
    }//GEN-LAST:event_tf_fire_protectionActionPerformed

    private void tf_police_protectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_police_protectionActionPerformed
        Initialize_household_field_types.init_concerns(tf_police_protection);
    }//GEN-LAST:event_tf_police_protectionActionPerformed

    private void tf_ambulance_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ambulance_serviceActionPerformed
        Initialize_household_field_types.init_concerns(tf_ambulance_service);
    }//GEN-LAST:event_tf_ambulance_serviceActionPerformed

    private void tf_livelihood_programsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_livelihood_programsActionPerformed
        Initialize_household_field_types.init_concerns(tf_livelihood_programs);
    }//GEN-LAST:event_tf_livelihood_programsActionPerformed

    private void tf_street_maintenanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_street_maintenanceMouseClicked
        Initialize_household_field_types.init_concerns(tf_street_maintenance);
    }//GEN-LAST:event_tf_street_maintenanceMouseClicked

    private void tf_garbage_collectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_garbage_collectionMouseClicked
        Initialize_household_field_types.init_concerns(tf_garbage_collection);
    }//GEN-LAST:event_tf_garbage_collectionMouseClicked

    private void tf_fire_protectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_fire_protectionMouseClicked
        Initialize_household_field_types.init_concerns(tf_fire_protection);
    }//GEN-LAST:event_tf_fire_protectionMouseClicked

    private void tf_police_protectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_police_protectionMouseClicked
        Initialize_household_field_types.init_concerns(tf_police_protection);
    }//GEN-LAST:event_tf_police_protectionMouseClicked

    private void tf_ambulance_serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ambulance_serviceMouseClicked
        Initialize_household_field_types.init_concerns(tf_ambulance_service);
    }//GEN-LAST:event_tf_ambulance_serviceMouseClicked

    private void tf_livelihood_programsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_livelihood_programsMouseClicked
        Initialize_household_field_types.init_concerns(tf_livelihood_programs);
    }//GEN-LAST:event_tf_livelihood_programsMouseClicked

    private void tf_adolescent_pregnancyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_adolescent_pregnancyActionPerformed
        Initialize_household_field_types.init_problems(tf_adolescent_pregnancy);
    }//GEN-LAST:event_tf_adolescent_pregnancyActionPerformed

    private void tf_child_abuse_and_neglectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_child_abuse_and_neglectActionPerformed
        Initialize_household_field_types.init_problems(tf_child_abuse_and_neglect);
    }//GEN-LAST:event_tf_child_abuse_and_neglectActionPerformed

    private void tf_crimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_crimeActionPerformed
        Initialize_household_field_types.init_problems(tf_crime);
    }//GEN-LAST:event_tf_crimeActionPerformed

    private void tf_domestic_violenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_domestic_violenceActionPerformed
        Initialize_household_field_types.init_problems(tf_domestic_violence);
    }//GEN-LAST:event_tf_domestic_violenceActionPerformed

    private void tf_drug_abuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_drug_abuseActionPerformed
        Initialize_household_field_types.init_problems(tf_drug_abuse);
    }//GEN-LAST:event_tf_drug_abuseActionPerformed

    private void tf_hungerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hungerActionPerformed
        Initialize_household_field_types.init_problems(tf_hunger);
    }//GEN-LAST:event_tf_hungerActionPerformed

    private void tf_enviromental_contaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_enviromental_contaminationActionPerformed
        Initialize_household_field_types.init_problems(tf_enviromental_contamination);
    }//GEN-LAST:event_tf_enviromental_contaminationActionPerformed

    private void tf_adolescent_pregnancyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_adolescent_pregnancyMouseClicked
        Initialize_household_field_types.init_problems(tf_adolescent_pregnancy);
    }//GEN-LAST:event_tf_adolescent_pregnancyMouseClicked

    private void tf_child_abuse_and_neglectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_child_abuse_and_neglectMouseClicked
        Initialize_household_field_types.init_problems(tf_child_abuse_and_neglect);
    }//GEN-LAST:event_tf_child_abuse_and_neglectMouseClicked

    private void tf_crimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_crimeMouseClicked
        Initialize_household_field_types.init_problems(tf_crime);
    }//GEN-LAST:event_tf_crimeMouseClicked

    private void tf_domestic_violenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_domestic_violenceMouseClicked
        Initialize_household_field_types.init_problems(tf_domestic_violence);
    }//GEN-LAST:event_tf_domestic_violenceMouseClicked

    private void tf_drug_abuseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_drug_abuseMouseClicked
        Initialize_household_field_types.init_problems(tf_drug_abuse);
    }//GEN-LAST:event_tf_drug_abuseMouseClicked

    private void tf_hungerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_hungerMouseClicked
        Initialize_household_field_types.init_problems(tf_hunger);
    }//GEN-LAST:event_tf_hungerMouseClicked

    private void tf_enviromental_contaminationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_enviromental_contaminationMouseClicked
        Initialize_household_field_types.init_problems(tf_enviromental_contamination);
    }//GEN-LAST:event_tf_enviromental_contaminationMouseClicked

    private void tf_health_disparitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_health_disparitiesMouseClicked
        Initialize_household_field_types.init_problems(tf_health_disparities);
    }//GEN-LAST:event_tf_health_disparitiesMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void tbl_household_membersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_membersMouseClicked
        select_household_member();
    }//GEN-LAST:event_tbl_household_membersMouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        update_household_basic_information();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        update_household_basic_information();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tf_tenureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tenureActionPerformed
        Initialize_household_member_field_types.init_tenure_years(tf_tenure);
    }//GEN-LAST:event_tf_tenureActionPerformed

    private void tf_tenureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_tenureMouseClicked
        Initialize_household_member_field_types.init_tenure_years(tf_tenure);
    }//GEN-LAST:event_tf_tenureMouseClicked

    private void tf_tenure1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_tenure1MouseClicked
        Initialize_household_member_field_types.init_tenure_months(tf_tenure1);
    }//GEN-LAST:event_tf_tenure1MouseClicked

    private void tf_tenure1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tenure1ActionPerformed
        Initialize_household_member_field_types.init_tenure_months(tf_tenure1);
    }//GEN-LAST:event_tf_tenure1ActionPerformed

    private void tf_house_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_house_noActionPerformed
        search_house_no();
    }//GEN-LAST:event_tf_house_noActionPerformed

    private void tf_purokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purokMouseClicked

    }//GEN-LAST:event_tf_purokMouseClicked

    private void tf_purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purokActionPerformed

    }//GEN-LAST:event_tf_purokActionPerformed

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked

    }//GEN-LAST:event_tf_barangayMouseClicked

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed

    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked

    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed

    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_provinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_provinceMouseClicked

    }//GEN-LAST:event_tf_provinceMouseClicked

    private void tf_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_provinceActionPerformed

    }//GEN-LAST:event_tf_provinceActionPerformed

    private void tf_regionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_regionMouseClicked

    }//GEN-LAST:event_tf_regionMouseClicked

    private void tf_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regionActionPerformed

    }//GEN-LAST:event_tf_regionActionPerformed

    private void tf_AssetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_AssetMouseClicked
        Initialize_household_field_types.init_assets(tf_Asset);
    }//GEN-LAST:event_tf_AssetMouseClicked

    private void tf_ItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ItemsMouseClicked
        Initialize_household_field_types.init_assets(tf_Items);
    }//GEN-LAST:event_tf_ItemsMouseClicked

    private void tbl_household_consumptions1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_consumptions1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_household_consumptions1MouseClicked

    private void tf_Items1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_Items1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Items1MouseClicked

    private void tf_Items1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_Items1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Items1ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void tf_assets7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_assets7ActionPerformed

    private void tf_assets8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_assets8ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser2;
    private com.toedter.calendar.JMonthChooser jMonthChooser3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    private com.toedter.calendar.JYearChooser jYearChooser3;
    private javax.swing.JLabel lbl_barangay1;
    private javax.swing.JLabel lbl_barangay2;
    private javax.swing.JLabel lbl_barangay3;
    private javax.swing.JLabel lbl_barangay4;
    private javax.swing.JLabel lbl_facilities2;
    private javax.swing.JLabel lbl_facilities3;
    private javax.swing.JLabel lbl_facilities4;
    private javax.swing.JLabel lbl_facilities5;
    private javax.swing.JLabel lbl_facilities6;
    private javax.swing.JLabel lbl_facilities7;
    private javax.swing.JLabel lbl_purok1;
    private javax.swing.JTable tbl_household_assets;
    private javax.swing.JTable tbl_household_consumptions;
    private javax.swing.JTable tbl_household_consumptions1;
    private javax.swing.JTable tbl_household_expenditures;
    private javax.swing.JTable tbl_household_members;
    private javax.swing.JTextField tf_Asset;
    private javax.swing.JTextField tf_Items;
    private javax.swing.JTextField tf_Items1;
    private javax.swing.JTextField tf_adolescent_pregnancy;
    private javax.swing.JTextField tf_ambulance_service;
    private javax.swing.JButton tf_assets;
    private javax.swing.JButton tf_assets1;
    private javax.swing.JButton tf_assets2;
    private javax.swing.JButton tf_assets3;
    private javax.swing.JButton tf_assets4;
    private javax.swing.JButton tf_assets5;
    private javax.swing.JButton tf_assets6;
    private javax.swing.JButton tf_assets7;
    private javax.swing.JButton tf_assets8;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_child_abuse_and_neglect;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_crime;
    private javax.swing.JTextField tf_domestic_violence;
    private javax.swing.JTextField tf_drainage;
    private javax.swing.JTextField tf_drug_abuse;
    private javax.swing.JTextField tf_enviromental_contamination;
    private javax.swing.JTextField tf_fire_protection;
    private javax.swing.JTextField tf_garbage_collection;
    private javax.swing.JTextField tf_health_disparities;
    private javax.swing.JTextField tf_house_no;
    private javax.swing.JTextField tf_household_no;
    private javax.swing.JTextField tf_hunger;
    private javax.swing.JTextField tf_livelihood_programs;
    private javax.swing.JTextField tf_monthly_rental;
    private javax.swing.JTextField tf_police_protection;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_qty;
    private javax.swing.JTextField tf_region;
    private javax.swing.JTextField tf_street_maintenance;
    private javax.swing.JTextField tf_tenure;
    private javax.swing.JTextField tf_tenure1;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();

        Initialize_table_households.init_tbl_household_assets(tbl_household_assets);
        Initialize_table_households.init_tbl_household_expenditures(tbl_household_expenditures);
        Initialize_table_households.init_tbl_household_consumptions(tbl_household_consumptions);
        Initialize_table_households.init_tbl_household_members(tbl_household_members);

        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jTabbedPane1.remove(5);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                tf_house_no.grabFocus();
            }
        });
    }

    Households.to_households household = new Households.to_households(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "", 0, 0, 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), 0);
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
    String my_house_no = "";

    public void do_pass_new(String household_no, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id) {
        tf_household_no.setText(household_no + "");
        my_region = region;
        my_region_id = region_id;
        my_province = province;
        my_province_id = province_id;
        my_city = city;
        my_city_id = city_id;
        my_barangay = barangay;
        my_barangay_id = barangay;
        my_purok = purok;
        my_purok_id = purok_id;

    }

    public void do_pass(Households.to_households household1) {

        String where = " where household_no='" + household1.household_no + "' ";
        List<Household_assets.to_household_assets> assets = Household_assets.ret_data(where);
        List<Household_expenditures.to_household_expenditures> household_expenditures = Household_expenditures.ret_data(where);
        List<Household_consumptions.to_household_consumptions> household_consumptions = Household_consumptions.ret_data(where);
        List<Household_members.to_household_members> household_members = Household_members.ret_data(where);
        household1.setAssets(assets);
        household1.setHousehold_expenditures(household_expenditures);
        household1.setHousehold_consumptions(household_consumptions);
        household1.setHousehold_members(household_members);
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;

        household = household1;
        tf_house_no.setFocusable(false);
        tf_household_no.setFocusable(false);
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        my_region = household1.region;
        my_region_id = household1.region_id;
        my_province = household1.province;
        my_province_id = household1.province_id;
        my_city = household1.city;
        my_city_id = household1.city_id;
        my_barangay = household1.barangay;
        my_barangay_id = household1.barangay;
        my_house_no = household1.house_no;
        //<editor-fold defaultstate="collapsed" desc=" Basic Information ">

        tf_house_no.setText(household1.house_no);
        tf_household_no.setText(household1.household_no);
        reg.setText(household1.region);
        reg.setId(household1.region_id);
        prov.setText(household1.province);
        prov.setId(household1.province_id);
        cit.setText(household1.city);
        cit.setId(household1.city_id);
        bar.setText(household1.barangay);
        bar.setId(household1.barangay_id);
        pur.setText(household1.purok);
        pur.setId(household1.purok_id);
        String[] tenure = household1.tenure.split(",");
        tf_tenure.setText(tenure[0]);
        tf_tenure1.setText(tenure[1]);

        tf_monthly_rental.setText(FitIn.fmt_wc_0(household1.monthly_rental));
        if (household1.occupancy_types.equalsIgnoreCase("Owned")) {
            jCheckBox1.setSelected(true);
        } else {
            jCheckBox2.setSelected(true);
        }
        if (household1.is_occupant_owns_the_land == 1) {
            jCheckBox3.setSelected(true);
        } else {
            jCheckBox4.setSelected(true);
        }
        if (household1.is_occupant_owns_the_bldg == 1) {
            jCheckBox5.setSelected(true);
        } else {
            jCheckBox6.setSelected(true);
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Concerns/Problems ">
        tf_drainage.setText(household1.drainage_system_concern);
        tf_street_maintenance.setText(household1.street_maintenance_concern);
        tf_garbage_collection.setText(household1.garbage_collection_concern);
        tf_fire_protection.setText(household1.fire_protection_concern);
        tf_police_protection.setText(household1.police_protection_concern);
        tf_ambulance_service.setText(household1.ambulance_service_concern);
        tf_livelihood_programs.setText(household1.livelihood_programs_concern);

        tf_adolescent_pregnancy.setText(household1.adolescent_pregnancy_rate);
        tf_child_abuse_and_neglect.setText(household1.child_abuse_rating);
        tf_crime.setText(household1.crime_rating);
        tf_domestic_violence.setText(household1.domestic_violence_rating);
        tf_drug_abuse.setText(household1.drug_abuse_rating);
        tf_hunger.setText(household1.hunger_rating);
        tf_enviromental_contamination.setText(household1.environmental_contamination_rating);
        tf_health_disparities.setText(household1.health_disparities_rating);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Load Table Records ">
        Initialize_table_households.loadData_household_assets(household1.assets);
        Initialize_table_households.loadData_household_expenditures(household1.household_expenditures);
        Initialize_table_households.loadData_household_consumptions(household1.household_consumptions);

        jLabel3.setText("" + Initialize_table_households.tbl_household_assets_ALM.size());
        jLabel7.setText("" + Initialize_table_households.tbl_household_expenditures_ALM.size());
        jLabel5.setText("" + Initialize_table_households.tbl_household_consumptions_ALM.size());

        //</editor-fold>
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

        tf_Asset.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    assets();
                }

            }
        });
        tf_Items.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    consumptions();
                }

            }
        });

    }

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Prompts ">
    private void assets() {
        Window p = (Window) this;
        Dlg_assets nd = Dlg_assets.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_assets.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_assets.OutputData data) {
                Initialize_household_field_types.ret_data_assets();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void consumptions() {
        Window p = (Window) this;
        Dlg_basic_needs nd = Dlg_basic_needs.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_basic_needs.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_basic_needs.OutputData data) {
                closeDialog.ok();
                Initialize_household_field_types.ret_data_consumptions();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Household Assets ">
    private void save_household_asset() {
        int row = tbl_household_assets.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household.region;
            String region_id = household.region_id;
            String province = household.province;
            String province_id = household.province_id;
            String city = household.city;
            String city_id = household.city_id;
            String barangay = household.barangay;
            String barangay_id = household.barangay_id;
            String purok = household.purok;
            String purok_id = household.purok_id;
            int status = 0;
            String house_no = household.house_no;
            String household_no = tf_household_no.getText();
            double qty = FitIn.toDouble(tf_qty.getText());
            String assets = tf_Asset.getText();

            Household_assets.to_household_assets asset = new Household_assets.to_household_assets(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, qty, assets);
            if (household.id == 0) {
                Initialize_table_households.tbl_household_assets_ALM.add(asset);
                jLabel3.setText("" + Initialize_table_households.tbl_household_assets_ALM.size());

            } else {
                Household_assets.add_data(asset);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_assets(where);
                jLabel3.setText("" + Initialize_table_households.tbl_household_assets_ALM.size());

            }
            Alert.set(1, "");
        } else {
            Household_assets.to_household_assets asset = (Household_assets.to_household_assets) Initialize_table_households.tbl_household_assets_ALM.get(row);
            int id = asset.id;
            String created_at = asset.created_at;
            String updated_at = asset.updated_at;
            String created_by = asset.created_by;
            String updated_by = asset.updated_by;
            String region = asset.region;
            String region_id = asset.region_id;
            String province = asset.province;
            String province_id = asset.province_id;
            String city = asset.city;
            String city_id = asset.city_id;
            String barangay = asset.barangay;
            String barangay_id = asset.barangay_id;
            String purok = asset.purok;
            String purok_id = asset.purok_id;
            int status = asset.status;
            String house_no = asset.house_no;
            String household_no = asset.household_no;
            double qty = FitIn.toDouble(tf_qty.getText());
            String assets = tf_Asset.getText();

            asset.setAssets(assets);
            asset.setQty(qty);
            if (household.id == 0) {
                Initialize_table_households.tbl_household_assets_M.fireTableDataChanged();

            } else {
                Household_assets.update_data(asset);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_assets(where);

            }
            Alert.set(2, "");
        }

        clear_household_asset();
    }

    private void select_household_asset() {
        final int row = tbl_household_assets.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_assets.to_household_assets asset = (Household_assets.to_household_assets) Initialize_table_households.tbl_household_assets_ALM.get(row);
        int col = tbl_household_assets.getSelectedColumn();
        if (col == 2) {

            tf_qty.setText(FitIn.fmt_woc(asset.qty));
            tf_Asset.setText(asset.assets);
        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household.id == 0) {
                        Initialize_table_households.tbl_household_assets_ALM.remove(row);
                        Initialize_table_households.tbl_household_assets_M.fireTableDataChanged();

                    } else {
                        Household_assets.delete_data(asset);
                        String where = " where household_no='" + tf_household_no.getText() + "'";
                        Initialize_table_households.ret_household_assets(where);

                    }
                    Alert.set(3, "");
                    jLabel3.setText("" + Initialize_table_households.tbl_household_assets_ALM.size());
                    clear_household_asset();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }

    }

    private void clear_household_asset() {
        tf_qty.setText("");
        tf_Asset.setText("");
        tbl_household_assets.getSelectionModel().clearSelection();
        tf_qty.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Expenditures ">
    private void save_hoousehold_expenditure() {
        int row = tbl_household_expenditures.getSelectedRow();
        if (row < 0) {

            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household.region;
            String region_id = household.region_id;
            String province = household.province;
            String province_id = household.province_id;
            String city = household.city;
            String city_id = household.city_id;
            String barangay = household.barangay;
            String barangay_id = household.barangay_id;
            String purok = household.purok;
            String purok_id = household.purok_id;
            int status = 0;
            String house_no = household.house_no;
            String household_no = tf_household_no.getText();
            String month = "" + (jMonthChooser2.getMonth() + 1);
            if (month.length() == 1) {
                month = "0" + month;
            }
            String expenditure_date = "" + jYearChooser2.getYear() + "-" + month + "-01";

            double fuel_expenses = FitIn.toDouble(jTextField25.getText());
            double internet_services = FitIn.toDouble(jTextField26.getText());
            double medical_expenses = FitIn.toDouble(jTextField27.getText());
            double cigarretes = FitIn.toDouble(jTextField28.getText());
            double hobbies_clubs = FitIn.toDouble(jTextField29.getText());
            double load_expenses = FitIn.toDouble(jTextField31.getText());
            double electric_gas_expenses = FitIn.toDouble(jTextField32.getText());
            double books_newspapers_expenses = FitIn.toDouble(jTextField33.getText());
            double gambling = FitIn.toDouble(jTextField34.getText());
            double personal_care = FitIn.toDouble(jTextField35.getText());
            double misc = FitIn.toDouble(jTextField40.getText());
            double alcohol = FitIn.toDouble(jTextField39.getText());
            double vacation = FitIn.toDouble(jTextField38.getText());
            double water_bill = FitIn.toDouble(jTextField37.getText());
            double cable_services = FitIn.toDouble(jTextField36.getText());
            double social_obligations = FitIn.toDouble(jTextField30.getText());
            Household_expenditures.to_household_expenditures household_exp = new Household_expenditures.to_household_expenditures(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, expenditure_date, fuel_expenses, internet_services, medical_expenses, cigarretes, hobbies_clubs, load_expenses, electric_gas_expenses, books_newspapers_expenses, gambling, personal_care, misc, alcohol, vacation, water_bill, cable_services, social_obligations);
            if (household.id == 0) {
                Initialize_table_households.tbl_household_expenditures_ALM.add(household_exp);
                jLabel7.setText("" + Initialize_table_households.tbl_household_expenditures_ALM.size());

            } else {

                Household_expenditures.add_data(household_exp);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_expenditures(where);
                jLabel7.setText("" + Initialize_table_households.tbl_household_expenditures_ALM.size());

            }
            Alert.set(1, "");
        } else {

            Household_expenditures.to_household_expenditures household_exp = (Household_expenditures.to_household_expenditures) Initialize_table_households.tbl_household_expenditures_ALM.get(row);
            int id = household_exp.id;
            String created_at = household_exp.created_at;
            String updated_at = household_exp.updated_at;
            String created_by = household_exp.created_by;
            String updated_by = household_exp.updated_by;
            String region = household_exp.region;
            String region_id = household_exp.region_id;
            String province = household_exp.province;
            String province_id = household_exp.province_id;
            String city = household_exp.city;
            String city_id = household_exp.city_id;
            String barangay = household_exp.barangay;
            String barangay_id = household_exp.barangay_id;
            String purok = household_exp.purok;
            String purok_id = household_exp.purok_id;
            int status = household_exp.status;
            String house_no = household_exp.house_no;
            String household_no = tf_household_no.getText();
            String month = "" + (jMonthChooser2.getMonth() + 1);
            if (month.length() == 1) {
                month = "0" + month;
            }
            String expenditure_date = "" + jYearChooser2.getYear() + "-" + month + "-01";
            double fuel_expenses = FitIn.toDouble(jTextField25.getText());
            double internet_services = FitIn.toDouble(jTextField26.getText());
            double medical_expenses = FitIn.toDouble(jTextField27.getText());
            double cigarretes = FitIn.toDouble(jTextField28.getText());
            double hobbies_clubs = FitIn.toDouble(jTextField29.getText());
            double load_expenses = FitIn.toDouble(jTextField31.getText());
            double electric_gas_expenses = FitIn.toDouble(jTextField32.getText());
            double books_newspapers_expenses = FitIn.toDouble(jTextField33.getText());
            double gambling = FitIn.toDouble(jTextField34.getText());
            double personal_care = FitIn.toDouble(jTextField35.getText());
            double misc = FitIn.toDouble(jTextField40.getText());
            double alcohol = FitIn.toDouble(jTextField39.getText());
            double vacation = FitIn.toDouble(jTextField38.getText());
            double water_bill = FitIn.toDouble(jTextField37.getText());
            double cable_services = FitIn.toDouble(jTextField36.getText());
            double social_obligations = FitIn.toDouble(jTextField30.getText());
            household_exp.setFuel_expenses(fuel_expenses);
            household_exp.setInternet_services(internet_services);
            household_exp.setMedical_expenses(medical_expenses);
            household_exp.setCigarretes(cigarretes);
            household_exp.setHobbies_clubs(hobbies_clubs);
            household_exp.setLoad_expenses(load_expenses);
            household_exp.setElectric_gas_expenses(electric_gas_expenses);
            household_exp.setBooks_newspapers_expenses(books_newspapers_expenses);
            household_exp.setGambling(gambling);
            household_exp.setPersonal_care(personal_care);
            household_exp.setMisc(misc);
            household_exp.setAlcohol(alcohol);
            household_exp.setVacation(vacation);
            household_exp.setWater_bill(water_bill);
            household_exp.setCable_services(cable_services);
            household_exp.setSocial_obligations(social_obligations);
            household_exp.setExpenditure_date(expenditure_date);
            if (household.id == 0) {
                Initialize_table_households.tbl_household_expenditures_M.fireTableDataChanged();

            } else {
                Household_expenditures.update_data(household_exp);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_expenditures(where);

            }
            Alert.set(2, "");
        }
        clear_household_expenditure();
    }

    private void select_household_expenditure() {
        final int row = tbl_household_expenditures.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_expenditures.to_household_expenditures household_exp = (Household_expenditures.to_household_expenditures) Initialize_table_households.tbl_household_expenditures_ALM.get(row);
        int col = tbl_household_expenditures.getSelectedColumn();
        if (col == 2) {
            try {
                Date exp_date = DateType.sf.parse(household_exp.expenditure_date);

                int year = FitIn.toInt(DateType.y.format(exp_date));
                jYearChooser2.setYear(year);
                int month = FitIn.toInt(DateType.m1.format(exp_date)) - 1;
                jMonthChooser2.setMonth(month);

            } catch (ParseException ex) {
                Logger.getLogger(Dlg_households.class.getName()).log(Level.SEVERE, null, ex);
            }

            jTextField25.setText(FitIn.fmt_wc_0(household_exp.fuel_expenses));
            jTextField26.setText(FitIn.fmt_wc_0(household_exp.internet_services));
            jTextField27.setText(FitIn.fmt_wc_0(household_exp.medical_expenses));
            jTextField28.setText(FitIn.fmt_wc_0(household_exp.cigarretes));
            jTextField29.setText(FitIn.fmt_wc_0(household_exp.hobbies_clubs));

            jTextField31.setText(FitIn.fmt_wc_0(household_exp.load_expenses));
            jTextField32.setText(FitIn.fmt_wc_0(household_exp.electric_gas_expenses));
            jTextField33.setText(FitIn.fmt_wc_0(household_exp.books_newspapers_expenses));
            jTextField34.setText(FitIn.fmt_wc_0(household_exp.gambling));
            jTextField35.setText(FitIn.fmt_wc_0(household_exp.personal_care));

            jTextField40.setText(FitIn.fmt_wc_0(household_exp.misc));
            jTextField39.setText(FitIn.fmt_wc_0(household_exp.alcohol));
            jTextField38.setText(FitIn.fmt_wc_0(household_exp.vacation));
            jTextField37.setText(FitIn.fmt_wc_0(household_exp.water_bill));
            jTextField36.setText(FitIn.fmt_wc_0(household_exp.cable_services));

            jTextField30.setText(FitIn.fmt_wc_0(household_exp.social_obligations));

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household.id == 0) {
                        Initialize_table_households.tbl_household_expenditures_ALM.remove(row);
                        Initialize_table_households.tbl_household_expenditures_M.fireTableDataChanged();

                    } else {
                        Household_expenditures.delete_data(household_exp);
                        String where = " where household_no='" + tf_household_no.getText() + "'";
                        Initialize_table_households.ret_household_expenditures(where);

                    }
                    Alert.set(3, "");
                    jLabel7.setText("" + Initialize_table_households.tbl_household_expenditures_ALM.size());
                    clear_household_expenditure();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void clear_household_expenditure() {
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField40.setText("");
        jTextField39.setText("");
        jTextField38.setText("");
        jTextField37.setText("");
        jTextField36.setText("");
        jTextField30.setText("");

        tbl_household_expenditures.getSelectionModel().clearSelection();
        jTextField25.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Consumptions ">
    private void save_household_consumption() {
        int row = tbl_household_consumptions.getSelectedRow();
        if (row < 0) {

            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            String region = household.region;
            String region_id = household.region_id;
            String province = household.province;
            String province_id = household.province_id;
            String city = household.city;
            String city_id = household.city_id;
            String barangay = household.barangay;
            String barangay_id = household.barangay_id;
            String purok = household.purok;
            String purok_id = household.purok_id;
            int status = 0;
            String house_no = household.house_no;
            String household_no = tf_household_no.getText();
            String month = "" + (jMonthChooser1.getMonth() + 1);
            if (month.length() == 1) {
                month = "0" + month;
            }
            String consumption_date = "" + jYearChooser1.getYear() + "-" + month + "-01";
            String items = tf_Items.getText();
            double amount = FitIn.toDouble(jTextField24.getText());

            Household_consumptions.to_household_consumptions household_cons = new Household_consumptions.to_household_consumptions(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, consumption_date, items, amount);

            if (household.id == 0) {
                Initialize_table_households.tbl_household_consumptions_ALM.add(household_cons);
                jLabel5.setText("" + Initialize_table_households.tbl_household_consumptions_ALM.size());

            } else {

                Household_consumptions.add_data(household_cons);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_consumptions(where);
                jLabel5.setText("" + Initialize_table_households.tbl_household_assets_ALM.size());

            }
            Alert.set(1, "");
        } else {

            Household_consumptions.to_household_consumptions household_cons = (Household_consumptions.to_household_consumptions) Initialize_table_households.tbl_household_consumptions_ALM.get(row);
            int id = household_cons.id;
            String created_at = household_cons.created_at;
            String updated_at = household_cons.updated_at;
            String created_by = household_cons.created_by;
            String updated_by = household_cons.updated_by;
            String region = household_cons.region;
            String region_id = household_cons.region_id;
            String province = household_cons.province;
            String province_id = household_cons.province_id;
            String city = household_cons.city;
            String city_id = household_cons.city_id;
            String barangay = household_cons.barangay;
            String barangay_id = household_cons.barangay_id;
            String purok = household_cons.purok;
            String purok_id = household_cons.purok_id;
            int status = household_cons.status;
            String house_no = household_cons.house_no;
            String household_no = tf_household_no.getText();
            String month = "" + (jMonthChooser1.getMonth() + 1);
            if (month.length() == 1) {
                month = "0" + month;
            }
            String consumption_date = "" + jYearChooser1.getYear() + "-" + month + "-01";
            String items = tf_Items.getText();
            double amount = FitIn.toDouble(jTextField24.getText());
            household_cons.setConsumption_date(consumption_date);
            household_cons.setItems(items);
            household_cons.setAmount(amount);
            if (household.id == 0) {

                Initialize_table_households.tbl_household_consumptions_M.fireTableDataChanged();

            } else {
                Household_consumptions.update_data(household_cons);
                String where = " where household_no='" + tf_household_no.getText() + "'";
                Initialize_table_households.ret_household_consumptions(where);

            }
            Alert.set(2, "");
        }
        clear_household_consumption();
    }

    private void select_household_consumption() {
        final int row = tbl_household_consumptions.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_consumptions.to_household_consumptions household_cons = (Household_consumptions.to_household_consumptions) Initialize_table_households.tbl_household_consumptions_ALM.get(row);
        int col = tbl_household_consumptions.getSelectedColumn();
        if (col == 2) {
            try {
                Date exp_date = DateType.sf.parse(household_cons.consumption_date);

                int year = FitIn.toInt(DateType.y.format(exp_date));
                jYearChooser1.setYear(year);
                int month = FitIn.toInt(DateType.m1.format(exp_date)) - 1;
                jMonthChooser1.setMonth(month);

            } catch (ParseException ex) {
                Logger.getLogger(Dlg_households.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField24.setText(FitIn.fmt_wc_0(household_cons.amount));
            tf_Items.setText(household_cons.items);

        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (household.id == 0) {
                        Initialize_table_households.tbl_household_consumptions_ALM.remove(row);
                        Initialize_table_households.tbl_household_consumptions_M.fireTableDataChanged();

                    } else {
                        Household_consumptions.delete_data(household_cons);
                        String where = " where household_no='" + tf_household_no.getText() + "'";
                        Initialize_table_households.ret_household_consumptions(where);

                    }
                    Alert.set(3, "");
                    jLabel5.setText("" + Initialize_table_households.tbl_household_consumptions_ALM.size());
                    clear_household_consumption();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);

        }
    }

    private void clear_household_consumption() {
        tf_Items.setText("");
        jTextField24.setText("");

        tbl_household_consumptions.getSelectionModel().clearSelection();
        jTextField24.grabFocus();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Household Members ">
    private void new_household_member() {

        List<Household_members.to_household_members> household_members = Initialize_table_households.tbl_household_members_ALM;
        String member_no = "";
        String hh_no = "";
        String hhm_no = "";
        if (!household_members.isEmpty()) {

            for (Household_members.to_household_members hm : household_members) {
                member_no = hm.household_member_no;
                hh_no = hm.household_no;
                hhm_no = member_no;

            }

            String[] stmt = member_no.split("-");
            for (String s : stmt) {
                hhm_no = s;
            }

            if (household.id == 0) {
                hh_no = tf_household_no.getText();
                hhm_no = hh_no + "-" + ReceiptIncrementor.increment(hhm_no);
            } else {
                hhm_no = ReceiptIncrementor.increment(hhm_no);
            }
            member_no = hhm_no;
        } else {
            member_no = tf_household_no.getText() + "-00";
            member_no = ReceiptIncrementor.increment(member_no);
            hh_no = tf_household_no.getText();
            hhm_no = member_no;
        }
        final String mn = member_no;
        Window p = (Window) this;
        Dlg_household_members nd = Dlg_household_members.create(p, true);
        nd.setTitle("");
        nd.do_pass_new(my_region, my_region_id, my_province, my_province_id, my_city, my_city_id, my_barangay, my_barangay_id, my_purok, my_purok_id, null);
        nd.setCallback(new Dlg_household_members.Callback() {
            @Override
            public void update(CloseDialog closeDialog) {
                  closeDialog.ok();
            }
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_household_members.OutputData data) {
                closeDialog.ok();
                int id = 0;
                String created_at = DateType.now();
                String updated_at = DateType.now();
                String created_by = MyUser.getUser_id();
                String updated_by = MyUser.getUser_id();
                String region = household.region;
                String region_id = household.region_id;
                String province = household.province;
                String province_id = household.province_id;
                String city = household.city;
                String city_id = household.city_id;
                String barangay = household.barangay;
                String barangay_id = household.barangay_id;
                String purok = household.purok;
                String purok_id = household.purok_id;
                int status = household.status;
                String house_no = household.house_no;
                String household_no = household.household_no;

                String household_member_no = mn;
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
                String transient_no = "";
                String contact_no=data.contact_no;    
                Household_members.to_household_members household_members = new Household_members.to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experiences, prefered_works, employment_status, skills, image, transient_no,contact_no);

                Initialize_table_households.tbl_household_members_ALM.add(household_members);
                Initialize_table_households.tbl_household_members_M.fireTableDataChanged();
                jLabel9.setText("" + Initialize_table_households.tbl_household_members_ALM.size());
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void select_household_member() {
        final int row = tbl_household_members.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Household_members.to_household_members household_member = (Household_members.to_household_members) Initialize_table_households.tbl_household_members_ALM.get(row);
        int col = tbl_household_members.getSelectedColumn();
        String household_no = tf_household_no.getText();
        if (col == 2) {
            Window p = (Window) this;
            Dlg_household_members nd = Dlg_household_members.create(p, true);
            nd.setTitle("");
            nd.do_pass(household_member);
            nd.setCallback(new Dlg_household_members.Callback() {
                @Override
                public void update(CloseDialog closeDialog) {
                     closeDialog.ok();
                }
                
                @Override
                public void ok(CloseDialog closeDialog, Dlg_household_members.OutputData data) {
                    closeDialog.ok();

                    household_member.setFname(data.fname);
                    household_member.setMname(data.mname);
                    household_member.setLname(data.lname);
                    household_member.setSname(data.sname);
                    household_member.setGender(data.gender);
                    household_member.setMarital_status(data.marital_status);
                    household_member.setBday(data.bday);
                    household_member.setOccupancy_years(data.occupancy_years);
                    household_member.setHeight(data.height);
                    household_member.setWeight(data.weight);
                    household_member.setBirth_place(data.birth_place);
                    household_member.setPresent_address(data.present_address);
                    household_member.setRelation_to_household(data.relation_to_household);
                    household_member.setReligion(data.religion);
                    household_member.setCitizenship(data.citizenship);
                    household_member.setEmail_address(data.email_address);
                    household_member.setBlood_type(data.blood_type);
                    household_member.setLanguages_spoken(data.languages_spoken);
                    household_member.setIs_registered_voter(data.is_registered_voter);
                    household_member.setVoters_id_no(data.voters_id_no);
                    household_member.setHealth_statuses(data.health_statuses);
                    household_member.setHealth_medications(data.health_medications);
                    household_member.setEducational_backgrounds(data.educational_backgrounds);
                    household_member.setVocational_experiences(data.vocational_experiences);
                    household_member.setCompetence_certificates(data.competence_certificates);
                    household_member.setLicenses(data.licenses);
                    household_member.setWork_experiences(data.work_experience);
                    household_member.setPrefered_works(data.prefered_works);
                    household_member.setEmployment_status(data.employment_status);
                    household_member.setSkills(data.skills);

                    Initialize_table_households.tbl_household_members_M.fireTableDataChanged();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
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
                        Initialize_table_households.tbl_household_members_ALM.remove(row);
                        Initialize_table_households.tbl_household_members_M.fireTableDataChanged();
                        jLabel9.setText("" + Initialize_table_households.tbl_household_members_ALM);
                    } else {
                        Household_members.delete_data2(household_member);

                        String where = " where household_no='" + tf_household_no.getText() + "'";
                        Initialize_table_households.ret_household_members(where);

                    }
                    Alert.set(3, "");
                    jLabel9.setText("" + Initialize_table_households.tbl_household_members_ALM.size());
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
    //</editor-fold>

    private void ok() {

        //<editor-fold defaultstate="collapsed" desc=" callback ">
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;
        String household_no = tf_household_no.getText();
        String occupancy_types = "Rented";
        if (jCheckBox1.isSelected()) {
            occupancy_types = "Owned";
        }
        String tenure = "" + FitIn.toInt(tf_tenure.getText()) + "," + FitIn.toInt(tf_tenure1.getText());
        int is_occupant_owns_the_lan = 0;
        if (jCheckBox3.isSelected()) {
            is_occupant_owns_the_lan = 1;
        }
        int is_occupant_owns_the_bldg = 0;
        if (jCheckBox5.isSelected()) {
            is_occupant_owns_the_bldg = 1;
        }
        double monthly_rental = FitIn.toDouble(tf_monthly_rental.getText());
        String drainage_system_concern = tf_drainage.getText();
        String street_maintenance_concern = tf_street_maintenance.getText();
        String garbage_collection_concern = tf_garbage_collection.getText();
        String fire_protection_concern = tf_fire_protection.getText();
        String police_protection_concern = tf_police_protection.getText();
        String ambulance_service_concern = tf_ambulance_service.getText();
        String livelihood_programs_concern = tf_livelihood_programs.getText();
        String adolescent_pregnancy_rate = tf_adolescent_pregnancy.getText();
        String child_abuse_rating = tf_child_abuse_and_neglect.getText();
        String crime_rating = tf_crime.getText();
        String domestic_violence_rating = tf_domestic_violence.getText();
        String drug_abuse_rating = tf_drug_abuse.getText();
        String hunger_rating = tf_hunger.getText();
        String environmental_contamination_rating = tf_enviromental_contamination.getText();
        String health_disparities_rating = tf_health_disparities.getText();
        List<Household_assets.to_household_assets> assets = Initialize_table_households.tbl_household_assets_ALM;
        List<Household_expenditures.to_household_expenditures> household_expenditures = Initialize_table_households.tbl_household_expenditures_ALM;
        List<Household_consumptions.to_household_consumptions> household_consumptions = Initialize_table_households.tbl_household_consumptions_ALM;
        List<Household_concerns.to_household_member_concerns> household_concerns = Initialize_table_households.tbl_household_member_concerns_ALM;
        List<Household_members.to_household_members> household_members = Initialize_table_households.tbl_household_members_ALM;
        String region = reg.getText();
        String region_id = reg.getId();
        String province = prov.getText();
        String province_id = prov.getId();
        String city = cit.getText();
        String city_id = cit.getId();
        String barangay = bar.getText();
        String barangay_id = bar.getId();
        String purok = pur.getText();
        String purok_id = pur.getId();
        String house_no = tf_house_no.getText();
        if (house_no.isEmpty()) {
            Alert.set(0, "Choose House Number!");
            return;
        }
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(household_no, occupancy_types, tenure, is_occupant_owns_the_lan, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating, assets, household_expenditures, household_consumptions, household_members, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, house_no));
        }
        //</editor-fold>

    }

    private void update_household_basic_information() {

        //<editor-fold defaultstate="collapsed" desc=" Basic Information/Concerns ">
        int id = household.id;
        String created_at = household.created_at;
        String updated_at = household.updated_at;
        String created_by = household.created_by;
        String updated_by = household.updated_by;
        String region = household.region;
        String region_id = household.region_id;
        String province = household.province;
        String province_id = household.province_id;
        String city = household.city;
        String city_id = household.city_id;
        String barangay = household.barangay;
        String barangay_id = household.barangay_id;
        String purok = household.purok;
        String purok_id = household.purok_id;
        int status = household.status;
        String house_no = household.house_no;
        String household_no = household.household_no;
        String occupancy_types = "Rented";
        if (jCheckBox1.isSelected()) {
            occupancy_types = "Owned";
        }
        String tenure = "" + FitIn.toInt(tf_tenure.getText()) + "," + FitIn.toInt(tf_tenure1.getText());
        int is_occupant_owns_the_lan = 0;
        if (jCheckBox3.isSelected()) {
            is_occupant_owns_the_lan = 1;
        }
        int is_occupant_owns_the_bldg = 0;
        if (jCheckBox5.isSelected()) {
            is_occupant_owns_the_bldg = 1;
        }
        double monthly_rental = FitIn.toDouble(tf_monthly_rental.getText());
        String drainage_system_concern = tf_drainage.getText();
        String street_maintenance_concern = tf_street_maintenance.getText();
        String garbage_collection_concern = tf_garbage_collection.getText();
        String fire_protection_concern = tf_fire_protection.getText();
        String police_protection_concern = tf_police_protection.getText();
        String ambulance_service_concern = tf_ambulance_service.getText();
        String livelihood_programs_concern = tf_livelihood_programs.getText();
        String adolescent_pregnancy_rate = tf_adolescent_pregnancy.getText();
        String child_abuse_rating = tf_child_abuse_and_neglect.getText();
        String crime_rating = tf_crime.getText();
        String domestic_violence_rating = tf_domestic_violence.getText();
        String drug_abuse_rating = tf_drug_abuse.getText();
        String hunger_rating = tf_hunger.getText();
        String environmental_contamination_rating = tf_enviromental_contamination.getText();
        String health_disparities_rating = tf_health_disparities.getText();
        List<Household_assets.to_household_assets> assets = new ArrayList();
        List<Household_expenditures.to_household_expenditures> household_expenditures = new ArrayList();
        List<Household_consumptions.to_household_consumptions> household_consumptions = new ArrayList();
        List<Household_members.to_household_members> household_members = new ArrayList();
        int no_of_household_members = 0;
        Households.to_households househol = new Households.to_households(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, occupancy_types, tenure, is_occupant_owns_the_lan, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating, assets, household_expenditures, household_consumptions, household_members, no_of_household_members);
        Households.update_data(househol);
        Alert.set(2, "");

        //</editor-fold>
    }

    List<Houses.to_houses> houses = new ArrayList();

    private void search_house_no() {
        String where = " where house_no like '%" + tf_house_no.getText() + "%' ";
        houses = Houses.ret_data(where);
        Object[][] obj = new Object[houses.size()][1];
        int i = 0;
        for (Houses.to_houses to : houses) {
            obj[i][0] = " " + to.house_no;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf_house_no.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_house_no, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo reg = (Field.Combo) tf_region;
                Field.Combo prov = (Field.Combo) tf_province;
                Field.Combo cit = (Field.Combo) tf_city;
                Field.Combo bar = (Field.Combo) tf_barangay;
                Field.Combo pur = (Field.Combo) tf_purok;
                Houses.to_houses to = houses.get(data.selected_row);
                Field.Search field = (Field.Search) tf_house_no;
                field.setText(to.house_no);
                String where2 = " where house_no='" + to.house_no + "' ";
                List<Households.to_households> households = Households.ret_data(where2);
                tf_house_no.setText(to.house_no);
                tf_household_no.setText(to.house_no + "-" + (households.size() + 1));
                reg.setText(to.region);
                reg.setId(to.region_id);
                prov.setText(to.province);
                prov.setId(to.province_id);
                cit.setText(to.city);
                cit.setId(to.city_id);
                bar.setText(to.barangay);
                bar.setId(to.barangay_id);
                pur.setText(to.purok);
                pur.setId(to.purok_id);
                tf_tenure.grabFocus();
            }
        });
    }
}
