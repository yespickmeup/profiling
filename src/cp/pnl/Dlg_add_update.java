/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.pnl;

import cp.tf_background.JXTextField;
import cp.tf_background.BuyBack;
import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import city_planning.basic_needs.Basic_needs;
import cp.Update.ext_consumption;
import cp.Update.ext_consumption.cons_extension;
import cp.Update.ext_employment.emp_extension;
import cp.Update.ext_expenditures.exp_extension;
import cp.assets.Assets;
import cp.assets.Assets.to_assets;
import cp.location.S1_household_member_educational_background.to_household_member_educational_background;
import cp.location.S1_barangays;
import cp.location.S1_bathrooms;
import cp.location.S1_buildings;
import cp.location.S1_communications;
import cp.location.S1_cookings;
import cp.location.S1_disposal_methods;
import cp.location.S1_floors;
import cp.location.S1_kitchens;
import cp.location.S1_roofs;
import cp.location.S1_toilets;
import cp.location.S1_transportations;
import cp.location.S1_transportations.to_transportation_types;
import cp.location.S1_walls;
import cp.location.S1_water_sources;
import cp.location.S1_year;
import city_planning.util.CheckBox;
import city_planning.util.Focus_Fire;
import city_planning.util.Placeholder;
import city_planning.util.TableCheckBoxRenderer;
import city_planning.util.TableRenderer;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_add_update extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_add_update
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;
    private to_transportation_types to_transportation_types;

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
    private Dlg_add_update(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_add_update(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_add_update() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_add_update myRef;

    private void setThisRef(Dlg_add_update myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_add_update> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_add_update create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_add_update create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_add_update dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_update((java.awt.Frame) parent, true);
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
            Dlg_add_update dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_add_update((java.awt.Dialog) parent, false);
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

        Dlg_add_update dialog = Dlg_add_update.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>S

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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jTextField89 = new javax.swing.JTextField();
        grp_employment_status = new javax.swing.ButtonGroup();
        status = new javax.swing.ButtonGroup();
        grp_drainage_system = new javax.swing.ButtonGroup();
        grp_street_maintenance = new javax.swing.ButtonGroup();
        grp_garbage_collection = new javax.swing.ButtonGroup();
        grp_fire_protection = new javax.swing.ButtonGroup();
        grp_police_protection = new javax.swing.ButtonGroup();
        grp_ambulance_service = new javax.swing.ButtonGroup();
        grp_livelihood_programs = new javax.swing.ButtonGroup();
        grp_adolescent_pregnancy = new javax.swing.ButtonGroup();
        grp_child_abuse_and_neglect = new javax.swing.ButtonGroup();
        grp_crime = new javax.swing.ButtonGroup();
        grp_domestic_violence = new javax.swing.ButtonGroup();
        grp_drug_abuse = new javax.swing.ButtonGroup();
        grp_environmental_contamination = new javax.swing.ButtonGroup();
        grp_health_disparities = new javax.swing.ButtonGroup();
        grp_hunger = new javax.swing.ButtonGroup();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        tabbed_panes = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new Button.Dangerous();
        jButton2 = new Button.Default();
        jPanel5 = new javax.swing.JPanel();
        l_house = new javax.swing.JLabel();
        tf_house_no = new Field.Input();
        l_purok = new javax.swing.JLabel();
        tf_purok = new Field.Input();
        l_barangay = new javax.swing.JLabel();
        l_street = new javax.swing.JLabel();
        tf_barangay = new JXTextField();
        tf_street = new Field.Input();
        jPanel6 = new javax.swing.JPanel();
        jXLabel72 = new org.jdesktop.swingx.JXLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        tf_no_rooms_for_sleeping = new Field.Input();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        l_buil_type = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        tf_building_type = new Field.Combo();
        tf_toilet_type = new Field.Combo();
        tf_bathroom_type = new Field.Combo();
        tf_disposal_method = new Field.Combo();
        tf_kitchen_type = new Field.Combo();
        tf_transportation_type = new Field.Combo();
        tf_roof_type = new Field.Combo();
        tf_wall_type = new Field.Combo();
        tf_floor_type = new Field.Combo();
        tf_communication_type = new Field.Combo();
        jPanel34 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        tf_lighting_type = new Field.Combo();
        tf_cooking_type = new Field.Combo();
        tf_source_of_water = new Field.Combo();
        tf_purok1 = new Field.Input();
        tf_purok2 = new Field.Input();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel48 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        tf_household_id = new Field.Input();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel122 = new javax.swing.JLabel();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        tf_tenure = new Field.Input();
        jLabel125 = new javax.swing.JLabel();
        tf_monthly_rental = new Field.Input();
        jLabel126 = new javax.swing.JLabel();
        jButton11 = new Button.Success();
        jPanel55 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton32 = new Button.Default();
        jButton33 = new Button.Primary();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_assets = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel26 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        tf_consumption_basicneeds = new Field.Combo();
        jLabel111 = new javax.swing.JLabel();
        b_add_consumption = new Button.Success();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_household_consumptions = new javax.swing.JTable();
        cb_consumption_month = new com.toedter.calendar.JMonthChooser();
        tf_consumption_amount = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        tf_hhe_fuel_expenses = new Field.Input();
        jLabel91 = new javax.swing.JLabel();
        tf_hhe_cable_services = new Field.Input();
        jLabel92 = new javax.swing.JLabel();
        tf_hhe_internet_services = new Field.Input();
        jLabel93 = new javax.swing.JLabel();
        tf_hhe_medical_expenses = new Field.Input();
        jLabel94 = new javax.swing.JLabel();
        tf_hhe_load_expenses = new Field.Input();
        jLabel95 = new javax.swing.JLabel();
        tf_hhe_electric_gas_oil = new Field.Input();
        jLabel96 = new javax.swing.JLabel();
        tf_hhe_water_bills = new Field.Input();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        tf_hhe_vacations_travel = new Field.Input();
        jLabel99 = new javax.swing.JLabel();
        tf_hhe_alcohol = new Field.Input();
        jLabel100 = new javax.swing.JLabel();
        tf_hhe_cigarettes_tobacco = new Field.Input();
        jLabel101 = new javax.swing.JLabel();
        tf__hhe_hobbies_clubs = new Field.Input();
        jLabel102 = new javax.swing.JLabel();
        tf_hhe_gambling = new Field.Input();
        jLabel103 = new javax.swing.JLabel();
        tf_hhe_personal_care = new Field.Input();
        jLabel104 = new javax.swing.JLabel();
        tf_hhe_misc = new Field.Input();
        jLabel110 = new javax.swing.JLabel();
        tf_hhe_parties_social = new Field.Input();
        b_add_expenditures = new Button.Success();
        tf_hhe_books_newspaper = new Field.Input();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_expenditures = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        l_total_expenditures = new javax.swing.JLabel();
        mc_expenditures_month = new com.toedter.calendar.JMonthChooser();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        cb_years = new javax.swing.JComboBox();
        jButton29 = new Button.Primary();
        jButton34 = new Button.Default
        ();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jButton35 = new Button.Primary();
        jButton44 = new Button.Default();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel30 = new javax.swing.JPanel();
        jButton14 = new Button.Primary();
        jButton15 = new Button.Default();
        jPanel29 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_additional_concerns = new javax.swing.JTextArea();
        jPanel39 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cb_ap_verylow = new javax.swing.JCheckBox();
        cb_can_verylow = new javax.swing.JCheckBox();
        cb_crime_verylow = new javax.swing.JCheckBox();
        cb_dv_verylow = new javax.swing.JCheckBox();
        cb_da_verylow = new javax.swing.JCheckBox();
        cb_ec_verylow = new javax.swing.JCheckBox();
        cb_hd_verylow = new javax.swing.JCheckBox();
        cb_hunger_verylow = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        cb_ap_low = new javax.swing.JCheckBox();
        cb_can_low = new javax.swing.JCheckBox();
        cb_crime_low = new javax.swing.JCheckBox();
        cb_dv_low = new javax.swing.JCheckBox();
        cb_da_low = new javax.swing.JCheckBox();
        cb_ec_low = new javax.swing.JCheckBox();
        cb_hd_low = new javax.swing.JCheckBox();
        cb_hunger_low = new javax.swing.JCheckBox();
        cb_ap_average = new javax.swing.JCheckBox();
        cb_can_average = new javax.swing.JCheckBox();
        cb_crime_average = new javax.swing.JCheckBox();
        cb_dv_average = new javax.swing.JCheckBox();
        cb_da_average = new javax.swing.JCheckBox();
        cb_ec_average = new javax.swing.JCheckBox();
        cb_hd_average = new javax.swing.JCheckBox();
        cb_hunger_average = new javax.swing.JCheckBox();
        cb_ap_above_average = new javax.swing.JCheckBox();
        cb_can_above_average = new javax.swing.JCheckBox();
        cb_crime_above_average = new javax.swing.JCheckBox();
        cb_dv_above_average = new javax.swing.JCheckBox();
        cb_da_above_average = new javax.swing.JCheckBox();
        cb_ec_above_average = new javax.swing.JCheckBox();
        cb_hd_above_average = new javax.swing.JCheckBox();
        cb_hunger_above_average = new javax.swing.JCheckBox();
        cb_ap_high = new javax.swing.JCheckBox();
        cb_can_high = new javax.swing.JCheckBox();
        cb_crime_high = new javax.swing.JCheckBox();
        cb_dv_high = new javax.swing.JCheckBox();
        cb_da_high = new javax.swing.JCheckBox();
        cb_ec_high = new javax.swing.JCheckBox();
        cb_hd_high = new javax.swing.JCheckBox();
        cb_hunger_high = new javax.swing.JCheckBox();
        cb_lp_excellent33 = new javax.swing.JCheckBox();
        cb_lp_excellent34 = new javax.swing.JCheckBox();
        cb_lp_excellent35 = new javax.swing.JCheckBox();
        cb_lp_excellent36 = new javax.swing.JCheckBox();
        cb_lp_excellent37 = new javax.swing.JCheckBox();
        cb_lp_excellent38 = new javax.swing.JCheckBox();
        cb_lp_excellent39 = new javax.swing.JCheckBox();
        cb_lp_excellent40 = new javax.swing.JCheckBox();
        jPanel36 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cb_ds_excellent = new javax.swing.JCheckBox();
        cb_ds_adequate = new javax.swing.JCheckBox();
        cb_ds_inadequate = new javax.swing.JCheckBox();
        cb_sm_excellent = new javax.swing.JCheckBox();
        cb_sm_adequate = new javax.swing.JCheckBox();
        cb_sm_inadequate = new javax.swing.JCheckBox();
        cb_gc_excellent = new javax.swing.JCheckBox();
        cb_gc_adequate = new javax.swing.JCheckBox();
        cb_gc_inadequate = new javax.swing.JCheckBox();
        cb_fp_excellent = new javax.swing.JCheckBox();
        cb_fp_adequate = new javax.swing.JCheckBox();
        cb_fp_inadequate = new javax.swing.JCheckBox();
        cb_pp_excellent = new javax.swing.JCheckBox();
        cb_pp_adequate = new javax.swing.JCheckBox();
        cb_pp_inadequate = new javax.swing.JCheckBox();
        cb_as_excellent = new javax.swing.JCheckBox();
        cb_as_adequate = new javax.swing.JCheckBox();
        cb_as_inadequate = new javax.swing.JCheckBox();
        cb_lp_excellent = new javax.swing.JCheckBox();
        cb_lp_adequate = new javax.swing.JCheckBox();
        cb_lp_inadequate = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jXLabel76 = new org.jdesktop.swingx.JXLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        tf_fm_firstname = new Field.Input();
        tf_fm_mi = new Field.Input();
        tf_fm_lastname = new Field.Input();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        tf_fm_citizenship = new Field.Input();
        jLabel36 = new javax.swing.JLabel();
        tf_fm_occupancy = new Field.Input();
        jLabel30 = new javax.swing.JLabel();
        tf_fm_birthplace = new Field.Input();
        jLabel29 = new javax.swing.JLabel();
        tf_fm_priorr_residence = new Field.Input();
        tf_fm_gender = new Field.Input();
        jLabel22 = new javax.swing.JLabel();
        dc_fm_birthdate = new com.toedter.calendar.JDateChooser();
        jLabel45 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tf_others = new Field.Input();
        jLabel49 = new javax.swing.JLabel();
        tf_fm_religion = new Field.Input();
        jLabel132 = new javax.swing.JLabel();
        tf_fm_maritalstatus1 = new Field.Input();
        jLabel133 = new javax.swing.JLabel();
        tf_fm_maritalstatus2 = new Field.Input();
        jLabel134 = new javax.swing.JLabel();
        tf_fm_religion1 = new Field.Input();
        jLabel135 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        tf_fm_priorr_residence1 = new Field.Input();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel136 = new javax.swing.JLabel();
        tf_fm_religion2 = new Field.Input();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jXLabel77 = new org.jdesktop.swingx.JXLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cb_yes = new javax.swing.JCheckBox();
        cb_no = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField22 = new Field.Input();
        jLabel42 = new javax.swing.JLabel();
        jTextField23 = new Field.Input();
        jTextField41 = new Field.Input();
        jLabel137 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton10 = new Button.Success();
        jRadioButton11 = new javax.swing.JRadioButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        jXLabel79 = new org.jdesktop.swingx.JXLabel();
        jButton3 = new Button.Primary();
        jButton4 = new Button.Default();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jTextField24 = new Field.Input();
        jLabel53 = new javax.swing.JLabel();
        jTextField25 = new Field.Input();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jButton36 = new Button.Success();
        jSeparator9 = new javax.swing.JSeparator();
        jButton8 = new Button.Primary();
        jPanel61 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new Field.Input();
        jButton12 = new Button.Success();
        jLabel23 = new javax.swing.JLabel();
        jTextField6 = new Field.Input();
        jLabel24 = new javax.swing.JLabel();
        jTextField10 = new Field.Input();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new Field.Input();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new Field.Input();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jTextField15 = new Field.Input();
        jLabel54 = new javax.swing.JLabel();
        jTextField17 = new Field.Input();
        jLabel138 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jTextField18 = new Field.Input();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jButton38 = new Button.Success();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel63 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        tf_fm_educational_status2 = new Field.Input();
        tf_fm_highest_grade_computed2 = new Field.Input();
        jLabel154 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        tf_fm_name_of_school2 = new Field.Input();
        tf_fm_achievements2 = new Field.Input();
        jButton37 = new Button.Success();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jTextField9 = new Field.Input();
        jPanel64 = new javax.swing.JPanel();
        jXLabel92 = new org.jdesktop.swingx.JXLabel();
        jPanel15 = new javax.swing.JPanel();
        jTextField8 = new Field.Input();
        jLabel143 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jButton45 = new Button.Success();
        jPanel69 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jXLabel89 = new org.jdesktop.swingx.JXLabel();
        jButton6 = new Button.Primary();
        jButton7 = new Button.Default();
        jPanel58 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jXLabel81 = new org.jdesktop.swingx.JXLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        tf_fm_educational_status3 = new Field.Input();
        jLabel151 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jButton40 = new Button.Success();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel68 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        tf_fm_educational_status1 = new Field.Input();
        tf_fm_name_of_school1 = new Field.Input();
        tf_fm_achievements1 = new Field.Input();
        jButton39 = new Button.Success();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jXLabel82 = new org.jdesktop.swingx.JXLabel();
        jButton43 = new Button.Primary();
        jButton42 = new Button.Default();
        jPanel17 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jCheckBox58 = new javax.swing.JCheckBox();
        jXLabel87 = new org.jdesktop.swingx.JXLabel();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jPanel49 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jXLabel84 = new org.jdesktop.swingx.JXLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jPanel59 = new javax.swing.JPanel();
        jCheckBox43 = new javax.swing.JCheckBox();
        jXLabel85 = new org.jdesktop.swingx.JXLabel();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jPanel65 = new javax.swing.JPanel();
        jCheckBox29 = new javax.swing.JCheckBox();
        jXLabel86 = new org.jdesktop.swingx.JXLabel();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new Field.Input();
        jButton41 = new Button.Success();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel56 = new javax.swing.JPanel();
        jXLabel80 = new org.jdesktop.swingx.JXLabel();
        jPanel57 = new javax.swing.JPanel();
        cb_status_unemployed = new javax.swing.JCheckBox();
        cb_status_employed = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tf_employment = new Field.Input();
        jLabel44 = new javax.swing.JLabel();
        tf_company_type = new Field.Input();
        jPanel67 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        tf_employment_name_of_business1 = new Field.Input();
        jLabel115 = new javax.swing.JLabel();
        jTextField49 = new Field.Input();
        jLabel140 = new javax.swing.JLabel();
        jTextField50 = new Field.Input();
        jLabel142 = new javax.swing.JLabel();
        jTextField82 = new Field.Input();
        jLabel145 = new javax.swing.JLabel();
        jTextField83 = new Field.Input();
        jLabel146 = new javax.swing.JLabel();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jLabel152 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jTextField16 = new Field.Input();
        jLabel162 = new javax.swing.JLabel();
        jTextField19 = new Field.Input();
        jLabel163 = new javax.swing.JLabel();
        jTextField91 = new Field.Input();
        jLabel164 = new javax.swing.JLabel();
        jTextField92 = new Field.Input();
        jButton21 = new Button.Success();
        jButton22 = new Button.Default();
        jButton23 = new Button.Dangerous();
        jScrollPane10 = new javax.swing.JScrollPane();
        tb_employment_status = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField7 = new Field.Input();
        cb_employment_worker = new javax.swing.JRadioButton();
        cb_employment_employee = new javax.swing.JRadioButton();
        cb_employment_self_employed = new javax.swing.JRadioButton();
        cb_employment_director = new javax.swing.JRadioButton();
        cb_employment_office_holder = new javax.swing.JRadioButton();
        cb_employment_ofw = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton5 = new Button.Primary();
        jButton16 = new Button.Default();
        jPanel27 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jButton9 = new Button.Default();
        jButton13 = new Button.Dangerous();
        jButton31 = new Button.Info();
        jButton30 = new Button.Warning();
        jSeparator2 = new javax.swing.JSeparator();

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable7);

        jTextField89.setText("jTextField89");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(380, 20, 0, 0));

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tabbed_panes.setBackground(new java.awt.Color(96, 149, 70));
        tabbed_panes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbed_panes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabbed_panes.setName(""); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Next");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        l_house.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_house.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_house.setText("House No:");

        tf_house_no.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_house_no.setText("DGTE-00000001");
        tf_house_no.setToolTipText("");
        tf_house_no.setFocusable(false);
        tf_house_no.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        tf_house_no.setMinimumSize(new java.awt.Dimension(6, 24));
        tf_house_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_house_noActionPerformed(evt);
            }
        });

        l_purok.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_purok.setText("Purok");

        tf_purok.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_purok.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_purok.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        tf_purok.setPreferredSize(new java.awt.Dimension(6, 24));
        tf_purok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purokActionPerformed(evt);
            }
        });

        l_barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_barangay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_barangay.setText("Barangay");

        l_street.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_street.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_street.setText("Street");

        tf_barangay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_barangay.setFocusable(false);
        tf_barangay.setMaximumSize(new java.awt.Dimension(2147483647, 24));
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

        tf_street.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_street.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        tf_street.setMinimumSize(new java.awt.Dimension(6, 24));
        tf_street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_streetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_house)
                            .addComponent(l_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_purok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_house_no, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(151, 151, 151)
                .addComponent(l_street, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_street, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tf_house_no, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(l_street, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_street, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(l_house, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(l_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel72.setText("1.)    House Basic Information");
        jXLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel72.setLineWrap(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jXLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel67.setText("2.)    House Condition  (A)");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addGap(110, 110, 110))
        );

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel60.setText("No. of rooms used for sleeping:");

        tf_no_rooms_for_sleeping.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel63.setText("Roof:");

        jLabel64.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel64.setText("[  Type of material used in construction:  ]");

        jLabel65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel65.setText("Wall:");

        jLabel77.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel77.setText("[  Facilities  ]");

        jLabel78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel78.setText("Toilet Type:");

        jLabel79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel79.setText("Bathroom Type:");

        jLabel80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel80.setText("Kitchen Type:");

        jLabel81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel81.setText("Common method of");

        jLabel82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel82.setText("Transportation Available:");

        jLabel83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel83.setText("Communication/s:");

        jLabel66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel66.setText("Floor:");

        l_buil_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        l_buil_type.setText("Building Type:");

        jLabel127.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel127.setText(" solid waste disposal:");

        tf_building_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_building_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_building_type.setNextFocusableComponent(tf_roof_type);
        tf_building_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_building_typeMouseClicked(evt);
            }
        });
        tf_building_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_building_typeActionPerformed(evt);
            }
        });

        tf_toilet_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_toilet_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_toilet_type.setNextFocusableComponent(tf_bathroom_type);
        tf_toilet_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_toilet_typeMouseClicked(evt);
            }
        });
        tf_toilet_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_toilet_typeActionPerformed(evt);
            }
        });

        tf_bathroom_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_bathroom_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_bathroom_type.setNextFocusableComponent(tf_disposal_method);
        tf_bathroom_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_bathroom_typeMouseClicked(evt);
            }
        });

        tf_disposal_method.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_disposal_method.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_disposal_method.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_disposal_methodMouseClicked(evt);
            }
        });
        tf_disposal_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disposal_methodActionPerformed(evt);
            }
        });

        tf_kitchen_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_kitchen_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_kitchen_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_kitchen_typeMouseClicked(evt);
            }
        });
        tf_kitchen_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kitchen_typeActionPerformed(evt);
            }
        });

        tf_transportation_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_transportation_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_transportation_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_transportation_typeMouseClicked(evt);
            }
        });
        tf_transportation_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_transportation_typeActionPerformed(evt);
            }
        });

        tf_roof_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_roof_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_roof_type.setNextFocusableComponent(tf_wall_type);
        tf_roof_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_roof_typeMouseClicked(evt);
            }
        });
        tf_roof_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_roof_typeActionPerformed(evt);
            }
        });

        tf_wall_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_wall_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_wall_type.setNextFocusableComponent(tf_floor_type);
        tf_wall_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_wall_typeMouseClicked(evt);
            }
        });
        tf_wall_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_wall_typeActionPerformed(evt);
            }
        });

        tf_floor_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_floor_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_floor_type.setNextFocusableComponent(tf_toilet_type);
        tf_floor_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_floor_typeMouseClicked(evt);
            }
        });
        tf_floor_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_floor_typeActionPerformed(evt);
            }
        });

        tf_communication_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_communication_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_communication_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_communication_typeMouseClicked(evt);
            }
        });
        tf_communication_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_communication_typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel127)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel79)
                                    .addComponent(l_buil_type)
                                    .addComponent(jLabel78))
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_building_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addComponent(tf_toilet_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addComponent(tf_bathroom_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addComponent(tf_disposal_method, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_kitchen_type, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(15, 15, 15)
                                .addComponent(tf_transportation_type, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel65)
                                            .addComponent(jLabel63)
                                            .addComponent(jLabel66))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_roof_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addComponent(tf_wall_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                            .addComponent(tf_floor_type, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(202, 202, 202))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_communication_type, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_no_rooms_for_sleeping, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(tf_no_rooms_for_sleeping, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(tf_roof_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(tf_wall_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_floor_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_buil_type)
                            .addComponent(tf_building_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_toilet_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_bathroom_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(tf_disposal_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(tf_kitchen_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel127)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel80)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel83)
                                .addComponent(tf_communication_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_transportation_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel82)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(204, 204, 204));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel59.setText("      House Condition  (B)");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addGap(52, 52, 52))
        );

        jPanel35.setBackground(new java.awt.Color(204, 204, 204));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel68.setText("Fuel mainly used for:");

        jLabel69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel69.setText("[   Lighting:");

        jLabel70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel70.setText("Cooking:");

        jLabel71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel71.setText("]");

        jLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel72.setText("Main source of water for drinking:");

        jLabel73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel73.setText("Distance in kms:");

        jLabel74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel74.setText("[   Drinking water source:");

        jLabel75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel75.setText("Nearest water source:");

        jLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel76.setText("]");

        tf_lighting_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_lighting_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_lighting_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lighting_typeMouseClicked(evt);
            }
        });
        tf_lighting_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lighting_typeActionPerformed(evt);
            }
        });

        tf_cooking_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_cooking_type.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_cooking_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cooking_typeMouseClicked(evt);
            }
        });
        tf_cooking_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cooking_typeActionPerformed(evt);
            }
        });

        tf_source_of_water.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_source_of_water.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf_source_of_water.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_source_of_waterMouseClicked(evt);
            }
        });
        tf_source_of_water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_source_of_waterActionPerformed(evt);
            }
        });

        tf_purok1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_purok1.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        tf_purok1.setPreferredSize(new java.awt.Dimension(6, 24));
        tf_purok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purok1ActionPerformed(evt);
            }
        });

        tf_purok2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_purok2.setMaximumSize(new java.awt.Dimension(2147483647, 24));
        tf_purok2.setPreferredSize(new java.awt.Dimension(6, 24));
        tf_purok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purok2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_purok2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(14, 14, 14)
                                .addComponent(tf_source_of_water))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_lighting_type)))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_cooking_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(tf_lighting_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cooking_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(tf_source_of_water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76)
                    .addComponent(tf_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_purok2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 281, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 941, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 317, Short.MAX_VALUE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 318, Short.MAX_VALUE)))
        );

        tabbed_panes.addTab("House", jPanel3);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel120.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel120.setText("1. Household Info");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel120)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel120)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel121.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel121.setText("Household ID:");

        tf_household_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_household_id.setText("DGTE-00000001-04");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Occupancy Type:");

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox1.setText("Owned");

        jCheckBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox2.setText("Rented");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("[ Do the occupant own the land? ");

        jCheckBox7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox7.setText("Yes");

        jCheckBox8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox8.setText("No");

        jLabel122.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel122.setText("Do the occupant own the Bldg.?");

        jCheckBox21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox21.setText("yes");

        jCheckBox22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox22.setText("no");

        jLabel123.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel123.setText("]");

        jLabel124.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel124.setText("[   Tenure");

        tf_tenure.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_tenure.setNextFocusableComponent(tf_monthly_rental);

        jLabel125.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel125.setText("Monthly Rental:");

        tf_monthly_rental.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel126.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel126.setText("]");

        jButton11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton11.setText("Add");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(350, 350, 350)
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tenure, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_monthly_rental, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel126))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(tf_household_id, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox7)
                        .addGap(5, 5, 5)
                        .addComponent(jCheckBox8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel123)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(tf_household_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel8)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jLabel122)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox22)
                    .addComponent(jLabel123))
                .addGap(3, 3, 3)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel124)
                    .addComponent(tf_tenure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125)
                    .addComponent(tf_monthly_rental, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addGap(15, 15, 15))
        );

        jPanel55.setBackground(new java.awt.Color(204, 204, 204));
        jPanel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("2. Assets");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(174, 174, 174))
        );

        jButton32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton32.setText("Next");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton33.setText("Previous");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        tbl_assets.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_assets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_assetsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_assets);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        tabbed_panes.addTab("Household", jPanel48);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jPanel41.setBackground(new java.awt.Color(204, 204, 204));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel87.setText("2.) Consumption");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel87)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(204, 204, 204));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel88.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel88.setText("Items");

        tf_consumption_basicneeds.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_consumption_basicneeds.setNextFocusableComponent(tf_consumption_amount);
        tf_consumption_basicneeds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_consumption_basicneedsMouseClicked(evt);
            }
        });
        tf_consumption_basicneeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_consumption_basicneedsActionPerformed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel111.setText("Month:");

        b_add_consumption.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b_add_consumption.setText("Add Consumption");
        b_add_consumption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_add_consumption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_add_consumptionActionPerformed(evt);
            }
        });

        tbl_household_consumptions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_household_consumptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Month", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_household_consumptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_household_consumptionsMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_household_consumptions);

        cb_consumption_month.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_consumption_month.setNextFocusableComponent(tf_consumption_basicneeds);

        tf_consumption_amount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_consumption_amount.setNextFocusableComponent(b_add_consumption);
        tf_consumption_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_consumption_amountActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Amount");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addContainerGap())
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_consumption_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_consumption_basicneeds, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(tf_consumption_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(b_add_consumption, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(tf_consumption_basicneeds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_consumption_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(b_add_consumption, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel111)
                        .addComponent(cb_consumption_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel89.setText("3.) Household Expenditures");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel90.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel90.setText("Fuel expenses:");

        tf_hhe_fuel_expenses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel91.setText("Cable Services:");

        tf_hhe_cable_services.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_cable_services.setNextFocusableComponent(tf_hhe_water_bills);

        jLabel92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel92.setText("Internet Services:");

        tf_hhe_internet_services.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_internet_services.setNextFocusableComponent(tf_hhe_medical_expenses);

        jLabel93.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel93.setText("Medical Expenses:");

        tf_hhe_medical_expenses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_medical_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hhe_medical_expensesActionPerformed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel94.setText("Load Expenses:");

        tf_hhe_load_expenses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_load_expenses.setName(""); // NOI18N
        tf_hhe_load_expenses.setNextFocusableComponent(tf_hhe_electric_gas_oil);
        tf_hhe_load_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hhe_load_expensesActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel95.setText("Electric/Gas/Oil/Propane:");

        tf_hhe_electric_gas_oil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel96.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel96.setText("Water Bill:");

        tf_hhe_water_bills.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_water_bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hhe_water_billsActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel97.setText("Books/Newspapers/Magazines:");

        jLabel98.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel98.setText("Vacations/Travel:");

        tf_hhe_vacations_travel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_vacations_travel.setNextFocusableComponent(tf_hhe_alcohol);

        jLabel99.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel99.setText("Alcohol:");

        tf_hhe_alcohol.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_alcohol.setNextFocusableComponent(tf_hhe_misc);

        jLabel100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel100.setText("Cigarettes/Tobacco:");

        tf_hhe_cigarettes_tobacco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_cigarettes_tobacco.setNextFocusableComponent(tf__hhe_hobbies_clubs);

        jLabel101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel101.setText("Hobbies/Clubs:");

        tf__hhe_hobbies_clubs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf__hhe_hobbies_clubs.setNextFocusableComponent(tf_hhe_parties_social);
        tf__hhe_hobbies_clubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf__hhe_hobbies_clubsActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel102.setText("Gambling:");

        tf_hhe_gambling.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_gambling.setNextFocusableComponent(tf_hhe_personal_care);

        jLabel103.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel103.setText("Personal Care:");

        tf_hhe_personal_care.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_personal_care.setNextFocusableComponent(tf_hhe_cable_services);

        jLabel104.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel104.setText("Misc.:");

        tf_hhe_misc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_misc.setNextFocusableComponent(b_add_expenditures);

        jLabel110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel110.setText("Parties/Social Obligations:");

        tf_hhe_parties_social.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_parties_social.setNextFocusableComponent(tf_hhe_load_expenses);

        b_add_expenditures.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        b_add_expenditures.setText("Add Expenditures");
        b_add_expenditures.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_add_expenditures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_add_expendituresActionPerformed(evt);
            }
        });

        tf_hhe_books_newspaper.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_hhe_books_newspaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hhe_books_newspaperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_hhe_parties_social, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_hhe_fuel_expenses)
                            .addComponent(tf_hhe_internet_services)
                            .addComponent(tf_hhe_medical_expenses, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(tf_hhe_cigarettes_tobacco)
                            .addComponent(tf__hhe_hobbies_clubs))))
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_hhe_load_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel103))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hhe_gambling, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hhe_books_newspaper, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hhe_personal_care, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_hhe_electric_gas_oil, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel104))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_hhe_alcohol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_hhe_misc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel91))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_hhe_cable_services, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(tf_hhe_water_bills)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_hhe_vacations_travel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_add_expenditures, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel90)
                            .addComponent(tf_hhe_fuel_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel92)
                            .addComponent(tf_hhe_internet_services, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(tf_hhe_medical_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_hhe_cigarettes_tobacco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(tf__hhe_hobbies_clubs, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(tf_hhe_load_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel95)
                            .addComponent(tf_hhe_electric_gas_oil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(tf_hhe_books_newspaper, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(tf_hhe_gambling, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(tf_hhe_personal_care, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(tf_hhe_cable_services, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(tf_hhe_water_bills, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel98)
                            .addComponent(tf_hhe_vacations_travel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(tf_hhe_alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(tf_hhe_misc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_hhe_parties_social, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_add_expenditures, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        jLabel113.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel113.setText("Month:");

        tbl_expenditures.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbl_expenditures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Total Expenditures"
            }
        ));
        tbl_expenditures.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_expendituresMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl_expenditures);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Grand Total:");

        l_total_expenditures.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_total_expenditures.setText("0.00");

        mc_expenditures_month.setNextFocusableComponent(tf_hhe_fuel_expenses);

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mc_expenditures_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(118, 118, 118)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_total_expenditures, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane9))
                        .addGap(10, 10, 10))))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel113)
                    .addComponent(mc_expenditures_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(l_total_expenditures))
                .addGap(5, 5, 5))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("1.) Select Year");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cb_years.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_years, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(cb_years)
                .addGap(6, 6, 6))
        );

        jButton29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton29.setText("Previous");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton34.setText("Next");
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed_panes.addTab("Expenses", jPanel26);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"DGTE-00000001-01", "5 members", "Update", "Delete", "Add New Member"},
                {"DGTE-00000001-02", "3 Members", "Update", "Delete", "Add New Member"},
                {"DGTE-00000001-03", "4 Members", "Update", "Delete", "Add New Member"}
            },
            new String [] {
                "Household #", "No.", "", "", ""
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jLabel52.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Members' L  i  s  t");

        jLabel119.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Households' L  i  s  t");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel119)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 266, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addGap(0, 266, Short.MAX_VALUE)))
        );

        jButton35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton35.setText("Previous");
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton44.setText("Next");
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed_panes.addTab("Household List", jPanel7);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jButton14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton14.setText("Previous");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton15.setText("Save");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(204, 204, 204));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel50.setText("1.) Services");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel85.setText("2.)Community Problems");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel85)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(90, 90, 90))
        );

        jPanel46.setBackground(new java.awt.Color(204, 204, 204));
        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel109.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel109.setText("3.)Additional Concerns:");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel109)
                .addGap(72, 72, 72))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel109)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(204, 204, 204));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        ta_additional_concerns.setColumns(20);
        ta_additional_concerns.setRows(5);
        jScrollPane1.setViewportView(ta_additional_concerns);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel86.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel86.setText("Rate the ff. problems present in your community:");

        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Adolescent Pregnancy");

        grp_adolescent_pregnancy.add(cb_ap_verylow);
        cb_ap_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_ap_verylow.setText("Very Low");

        grp_child_abuse_and_neglect.add(cb_can_verylow);
        cb_can_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_can_verylow.setText("Very Low");

        grp_crime.add(cb_crime_verylow);
        cb_crime_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_crime_verylow.setText("Very Low");
        cb_crime_verylow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_crime_verylowActionPerformed(evt);
            }
        });

        grp_domestic_violence.add(cb_dv_verylow);
        cb_dv_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_dv_verylow.setText("Very Low");

        grp_drug_abuse.add(cb_da_verylow);
        cb_da_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_da_verylow.setText("Very Low");

        grp_environmental_contamination.add(cb_ec_verylow);
        cb_ec_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_ec_verylow.setText("Very Low");

        grp_health_disparities.add(cb_hd_verylow);
        cb_hd_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_hd_verylow.setText("Very Low");

        grp_hunger.add(cb_hunger_verylow);
        cb_hunger_verylow.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_hunger_verylow.setText("Very Low");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Child Abuse and Neglect ");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Crime");

        jLabel112.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel112.setText("Domestic Violence");

        jLabel128.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel128.setText("Drug Abuse");

        jLabel129.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel129.setText("Environmental Contamination");

        jLabel130.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel130.setText("Health disparities");

        jLabel131.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel131.setText("Hunger");

        grp_adolescent_pregnancy.add(cb_ap_low);
        cb_ap_low.setText("Low");

        grp_child_abuse_and_neglect.add(cb_can_low);
        cb_can_low.setText("Low");

        grp_crime.add(cb_crime_low);
        cb_crime_low.setText("Low");

        grp_domestic_violence.add(cb_dv_low);
        cb_dv_low.setText("Low");

        grp_drug_abuse.add(cb_da_low);
        cb_da_low.setText("Low");

        grp_environmental_contamination.add(cb_ec_low);
        cb_ec_low.setText("Low");

        grp_health_disparities.add(cb_hd_low);
        cb_hd_low.setText("Low");

        grp_hunger.add(cb_hunger_low);
        cb_hunger_low.setText("Low");

        grp_adolescent_pregnancy.add(cb_ap_average);
        cb_ap_average.setText("Average");

        grp_child_abuse_and_neglect.add(cb_can_average);
        cb_can_average.setText("Average");

        grp_crime.add(cb_crime_average);
        cb_crime_average.setText("Average");

        grp_domestic_violence.add(cb_dv_average);
        cb_dv_average.setText("Average");

        grp_drug_abuse.add(cb_da_average);
        cb_da_average.setText("Average");

        grp_environmental_contamination.add(cb_ec_average);
        cb_ec_average.setText("Average");

        grp_health_disparities.add(cb_hd_average);
        cb_hd_average.setText("Average");

        grp_hunger.add(cb_hunger_average);
        cb_hunger_average.setText("Average");

        grp_adolescent_pregnancy.add(cb_ap_above_average);
        cb_ap_above_average.setText("Above Average");

        grp_child_abuse_and_neglect.add(cb_can_above_average);
        cb_can_above_average.setText("Above Average");

        grp_crime.add(cb_crime_above_average);
        cb_crime_above_average.setText("Above Average");

        grp_domestic_violence.add(cb_dv_above_average);
        cb_dv_above_average.setText("Above Average");

        grp_drug_abuse.add(cb_da_above_average);
        cb_da_above_average.setText("Above Average");

        grp_environmental_contamination.add(cb_ec_above_average);
        cb_ec_above_average.setText("Above Average");

        grp_health_disparities.add(cb_hd_above_average);
        cb_hd_above_average.setText("Above Average");

        grp_hunger.add(cb_hunger_above_average);
        cb_hunger_above_average.setText("Above Average");
        cb_hunger_above_average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_hunger_above_averageActionPerformed(evt);
            }
        });

        grp_adolescent_pregnancy.add(cb_ap_high);
        cb_ap_high.setText("High");

        grp_child_abuse_and_neglect.add(cb_can_high);
        cb_can_high.setText("High");
        cb_can_high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_can_highActionPerformed(evt);
            }
        });

        grp_crime.add(cb_crime_high);
        cb_crime_high.setText("High");

        grp_domestic_violence.add(cb_dv_high);
        cb_dv_high.setText("High");

        grp_drug_abuse.add(cb_da_high);
        cb_da_high.setText("High");

        grp_environmental_contamination.add(cb_ec_high);
        cb_ec_high.setText("High");

        grp_health_disparities.add(cb_hd_high);
        cb_hd_high.setText("High");

        grp_hunger.add(cb_hunger_high);
        cb_hunger_high.setText("High");

        grp_adolescent_pregnancy.add(cb_lp_excellent33);
        cb_lp_excellent33.setText("Excellent");

        grp_child_abuse_and_neglect.add(cb_lp_excellent34);
        cb_lp_excellent34.setText("Excellent");

        grp_crime.add(cb_lp_excellent35);
        cb_lp_excellent35.setText("Excellent");

        grp_domestic_violence.add(cb_lp_excellent36);
        cb_lp_excellent36.setText("Excellent");

        grp_drug_abuse.add(cb_lp_excellent37);
        cb_lp_excellent37.setText("Excellent");

        grp_environmental_contamination.add(cb_lp_excellent38);
        cb_lp_excellent38.setText("Excellent");

        grp_health_disparities.add(cb_lp_excellent39);
        cb_lp_excellent39.setText("Excellent");

        grp_hunger.add(cb_lp_excellent40);
        cb_lp_excellent40.setText("Excellent");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_hunger_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_hd_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ec_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_da_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dv_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crime_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_can_verylow, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ap_verylow, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_hunger_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_hd_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ec_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_da_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dv_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crime_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_can_low, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ap_low, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_hunger_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_hd_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ec_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_da_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dv_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crime_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_can_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ap_average, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_hunger_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_hd_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ec_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_da_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dv_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crime_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_can_above_average, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ap_above_average, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_hunger_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_hd_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ec_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_da_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_dv_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_crime_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_can_high, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_ap_high, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_lp_excellent40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent39, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent38, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent37, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent36, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent35, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent34, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_lp_excellent33, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(90, 90, 90))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addComponent(cb_ap_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_can_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_crime_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_dv_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_da_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_ec_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_hd_high)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_hunger_high))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(cb_ap_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_can_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_crime_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_dv_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_da_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_ec_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_hd_low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_hunger_low))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cb_ap_verylow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_can_verylow)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_crime_verylow)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_dv_verylow)
                            .addComponent(jLabel112))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_da_verylow)
                            .addComponent(jLabel128))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_ec_verylow)
                            .addComponent(jLabel129))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_hd_verylow)
                            .addComponent(jLabel130))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_hunger_verylow)
                            .addComponent(jLabel131))))
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addComponent(cb_ap_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_can_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_crime_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_dv_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_da_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_ec_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_hd_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_hunger_average))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                    .addComponent(cb_ap_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_can_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_crime_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_dv_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_da_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_ec_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_hd_above_average)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cb_hunger_above_average)))
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(cb_lp_excellent33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_lp_excellent40))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel36.setBackground(new java.awt.Color(204, 204, 204));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel51.setText("Rate the ff. services available in your community:");

        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Drainage System");

        grp_drainage_system.add(cb_ds_excellent);
        cb_ds_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_ds_excellent.setText("Excellent");

        grp_drainage_system.add(cb_ds_adequate);
        cb_ds_adequate.setText("Adequate");

        grp_drainage_system.add(cb_ds_inadequate);
        cb_ds_inadequate.setText("Inadequate");

        grp_street_maintenance.add(cb_sm_excellent);
        cb_sm_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_sm_excellent.setText("Excellent");

        grp_street_maintenance.add(cb_sm_adequate);
        cb_sm_adequate.setText("Adequate");

        grp_street_maintenance.add(cb_sm_inadequate);
        cb_sm_inadequate.setText("Inadequate");

        grp_garbage_collection.add(cb_gc_excellent);
        cb_gc_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_gc_excellent.setText("Excellent");

        grp_garbage_collection.add(cb_gc_adequate);
        cb_gc_adequate.setText("Adequate");

        grp_garbage_collection.add(cb_gc_inadequate);
        cb_gc_inadequate.setText("Inadequate");

        grp_fire_protection.add(cb_fp_excellent);
        cb_fp_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_fp_excellent.setText("Excellent");

        grp_fire_protection.add(cb_fp_adequate);
        cb_fp_adequate.setText("Adequate");

        grp_fire_protection.add(cb_fp_inadequate);
        cb_fp_inadequate.setText("Inadequate");

        grp_police_protection.add(cb_pp_excellent);
        cb_pp_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_pp_excellent.setText("Excellent");

        grp_police_protection.add(cb_pp_adequate);
        cb_pp_adequate.setText("Adequate");

        grp_police_protection.add(cb_pp_inadequate);
        cb_pp_inadequate.setText("Inadequate");

        grp_ambulance_service.add(cb_as_excellent);
        cb_as_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_as_excellent.setText("Excellent");

        grp_ambulance_service.add(cb_as_adequate);
        cb_as_adequate.setText("Adequate");

        grp_ambulance_service.add(cb_as_inadequate);
        cb_as_inadequate.setText("Inadequate");

        grp_livelihood_programs.add(cb_lp_excellent);
        cb_lp_excellent.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_lp_excellent.setText("Excellent");

        grp_livelihood_programs.add(cb_lp_adequate);
        cb_lp_adequate.setText("Adequate");

        grp_livelihood_programs.add(cb_lp_inadequate);
        cb_lp_inadequate.setText("Inadequate");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Street Maintenance");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Garbage Collection");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Fire Protection");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Police Protection");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Ambulance Service");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Livelihood Programs");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)))
                .addGap(45, 45, 45)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_sm_excellent)
                    .addComponent(cb_ds_excellent)
                    .addComponent(cb_gc_excellent)
                    .addComponent(cb_fp_excellent)
                    .addComponent(cb_pp_excellent)
                    .addComponent(cb_as_excellent)
                    .addComponent(cb_lp_excellent))
                .addGap(59, 59, 59)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cb_fp_adequate)
                        .addComponent(cb_gc_adequate)
                        .addComponent(cb_pp_adequate)
                        .addComponent(cb_as_adequate)
                        .addComponent(cb_lp_adequate))
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cb_sm_adequate)
                        .addComponent(cb_ds_adequate)))
                .addGap(56, 56, 56)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_fp_inadequate)
                            .addComponent(cb_pp_inadequate)
                            .addComponent(cb_as_inadequate)
                            .addComponent(cb_lp_inadequate))
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_sm_inadequate)
                            .addComponent(cb_ds_inadequate)))
                    .addComponent(cb_gc_inadequate))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_ds_excellent)
                        .addComponent(cb_ds_adequate)
                        .addComponent(cb_ds_inadequate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_sm_excellent)
                    .addComponent(cb_sm_adequate)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_sm_inadequate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_gc_excellent)
                    .addComponent(cb_gc_adequate)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_gc_inadequate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_fp_excellent)
                    .addComponent(cb_fp_adequate)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_fp_inadequate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_pp_excellent)
                    .addComponent(cb_pp_adequate)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_pp_inadequate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_as_excellent)
                    .addComponent(cb_as_adequate)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_as_inadequate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_lp_excellent)
                    .addComponent(cb_lp_adequate)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_lp_inadequate)))
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel51)
                .addGap(5, 5, 5)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(176, Short.MAX_VALUE)))
        );

        tabbed_panes.addTab("Comments/concerns", jPanel30);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel76.setText("1.) Basic Information: ");
        jXLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel76.setLineWrap(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jXLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setText("Name:");

        tf_fm_firstname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_firstnameActionPerformed(evt);
            }
        });

        tf_fm_mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_miActionPerformed(evt);
            }
        });

        tf_fm_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_lastnameActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("Relation to Household:");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Gender:");

        jLabel38.setText("Marital Status:");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Citizenship:");

        tf_fm_citizenship.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("Occupancy Year/s:");

        tf_fm_occupancy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setText("Birthplace:");

        tf_fm_birthplace.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_birthplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_birthplaceActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setText("Present Address");

        tf_fm_priorr_residence.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_priorr_residence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_priorr_residenceActionPerformed(evt);
            }
        });

        tf_fm_gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_gender.setText("Male");
        tf_fm_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_genderActionPerformed(evt);
            }
        });

        jLabel22.setText("Birth Date:");

        dc_fm_birthdate.setDate(new Date());

        jLabel45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel45.setText("Email address:");

        jLabel48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel48.setText("for others pls. specify:");

        tf_others.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_othersActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setText("Religion:");

        tf_fm_religion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_religionActionPerformed(evt);
            }
        });

        jLabel132.setText("Height");

        tf_fm_maritalstatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_maritalstatus1ActionPerformed(evt);
            }
        });

        jLabel133.setText("Weight:");

        jLabel134.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel134.setText("Contact No.:");

        tf_fm_religion1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel135.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel135.setText("Languages Spoken:");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tf_fm_priorr_residence1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_priorr_residence1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_priorr_residence1ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox4.setText("English");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox5.setText("Filipino");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox6.setText("Spanish");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox11.setText("Japanese");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox12.setText("Chinese");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox15.setText("French");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox16.setText("Arabic");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jLabel136.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel136.setText("Others Please Specify:");

        tf_fm_religion2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_religion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_religion2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox6)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox12)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox4)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox11)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox16)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox15))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel136)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_fm_religion2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_fm_priorr_residence, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addGap(38, 38, 38)
                                    .addComponent(tf_fm_birthplace, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel37))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_fm_firstname)
                                        .addComponent(tf_fm_gender, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                            .addComponent(jLabel38)
                                            .addGap(97, 97, 97))
                                        .addComponent(tf_fm_mi))
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel132)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tf_fm_maritalstatus1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(tf_fm_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addGap(10, 10, 10)
                                            .addComponent(tf_fm_occupancy, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dc_fm_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel133)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tf_fm_maritalstatus2)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(12, 12, 12)
                                .addComponent(tf_fm_priorr_residence1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel134)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_others)
                            .addComponent(tf_fm_religion)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_fm_religion1)
                            .addComponent(tf_fm_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_fm_lastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(tf_fm_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_fm_mi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(tf_fm_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(jLabel132)
                                .addComponent(tf_fm_maritalstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(tf_fm_occupancy, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dc_fm_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel133)
                                    .addComponent(tf_fm_maritalstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tf_fm_birthplace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(tf_fm_priorr_residence, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(tf_fm_priorr_residence1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_others, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fm_citizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(tf_fm_religion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fm_religion, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox11)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox15))
                .addGap(2, 2, 2)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_fm_religion2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jXLabel77.setText("2.) Health Status");
        jXLabel77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel77.setLineWrap(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jXLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel46.setText("Seeing a doctor?");

        cb_yes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_yes.setText("yes");

        cb_no.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_no.setText("no");
        cb_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_noActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("Name of Doctor:");

        jLabel47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel47.setText("Status:");

        jLabel41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel41.setText("Level of disability:");

        jTextField22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel42.setText("Cause:");

        jTextField23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTextField41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel137.setText("Disabilities:");

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton10.setText("Add");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jRadioButton11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton11.setText("Normal");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jTable8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Disabilities", "Name of Doctor", "Level of Disability", "Cause"
            }
        ));
        jScrollPane14.setViewportView(jTable8);

        jRadioButton12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton12.setText("PWD");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(cb_yes)
                                .addGap(6, 6, 6)
                                .addComponent(cb_no))
                            .addComponent(jRadioButton11)
                            .addComponent(jRadioButton12))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(cb_yes)
                            .addComponent(cb_no))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton12))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel79.setText("3.) Medication:");
        jXLabel79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel79.setLineWrap(true);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jXLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Previous");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("Next");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable3);

        jLabel43.setText("Prescription:");

        jLabel53.setText("Dose:");

        jLabel61.setText("Begin Date:");

        jLabel62.setText("End Date:");

        jDateChooser2.setDate(new Date());

        jDateChooser3.setDate(new Date());

        jButton36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton36.setText("Add");
        jButton36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel53))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jButton8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton8.setText("Previous");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbed_panes.addTab("Household Members(1)", jPanel4);

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));

        jPanel62.setBackground(new java.awt.Color(204, 204, 204));
        jPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Name of Training:");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton12.setText("Add");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Skills Acquired:");

        jTextField6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Period of Training:");

        jTextField10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setText("Certificate Received:");

        jTextField11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("Issuing School/Agency:");

        jTextField13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane16.setViewportView(jTable14);

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel62Layout.createSequentialGroup()
                        .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel62Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel62Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel62Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel26)
                                        .addGap(21, 21, 21)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel62Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179))))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel54.setText("Date Issued:");

        jTextField17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel138.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel138.setText("Rating:");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("Issued By:");

        jLabel139.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel139.setText("Certificate:");

        jTextField18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTable13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jTable13);

        jButton38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton38.setText("Add");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel139)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel139)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel138))
                            .addGap(5, 5, 5)
                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel54)))))
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel153.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel153.setText("Educational Status:");

        tf_fm_educational_status2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tf_fm_highest_grade_computed2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel154.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel154.setText("Highest Grade Computed:");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane17.setViewportView(jTable6);

        tf_fm_name_of_school2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_name_of_school2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_name_of_school2ActionPerformed(evt);
            }
        });

        tf_fm_achievements2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton37.setText("Add");
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel155.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel155.setText("Name of School:");

        jLabel156.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel156.setText("Achievements:");

        jLabel158.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel158.setText("Year Graduated:");

        jTextField9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel156))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(tf_fm_educational_status2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel154)
                                    .addComponent(jLabel158))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_fm_highest_grade_computed2)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_fm_name_of_school2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                    .addComponent(tf_fm_achievements2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel153)
                            .addComponent(tf_fm_educational_status2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel155)
                            .addComponent(tf_fm_name_of_school2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_fm_achievements2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel156)))
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel154)
                            .addComponent(tf_fm_highest_grade_computed2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel158)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel64.setBackground(new java.awt.Color(204, 204, 204));
        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel64.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jXLabel92.setText("5.)Vocational/Technical Training and Relevant Experience");
        jXLabel92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel92.setLineWrap(true);

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jXLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel143.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel143.setText("Preffered Occupation:");

        jTable15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane18.setViewportView(jTable15);

        jButton45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton45.setText("Add");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel143)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel69.setBackground(new java.awt.Color(204, 204, 204));
        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel144.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel144.setText("7.)Preferred Occupation");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel144)
                .addGap(41, 41, 41))
        );

        jXLabel89.setBackground(new java.awt.Color(204, 204, 204));
        jXLabel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jXLabel89.setText("    6.)Certificate of Competence");
        jXLabel89.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel89.setLineWrap(true);

        jButton6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton6.setText("Previous");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton7.setText("Next");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("4.) Educational Background");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel61Layout.createSequentialGroup()
                                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel63, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 146, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbed_panes.addTab("Household Members (2)", jPanel61);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel81.setText("8.)Work Experience");
        jXLabel81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel81.setLineWrap(true);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jPanel31.setBackground(new java.awt.Color(204, 204, 204));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("9.) License");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel148.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel148.setText("License Title:");

        tf_fm_educational_status3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel151.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel151.setText("Expiry Date");

        jButton40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton40.setText("Add");
        jButton40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_fm_educational_status3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel148)
                            .addComponent(tf_fm_educational_status3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel151))))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel147.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel147.setText("Name of the Company/Firm:");

        tf_fm_educational_status1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tf_fm_name_of_school1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_fm_name_of_school1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fm_name_of_school1ActionPerformed(evt);
            }
        });

        tf_fm_achievements1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton39.setText("Add");
        jButton39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jLabel149.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel149.setText("Address:");

        jLabel150.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel150.setText("Position Hold:");

        jLabel159.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel159.setText("INCLUSIVE DATE:");

        jLabel160.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel160.setText("From:");

        jLabel161.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel161.setText("To:");

        jTable4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel150))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addComponent(tf_fm_educational_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel159))
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_fm_name_of_school1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                    .addComponent(tf_fm_achievements1))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                                        .addComponent(jLabel161)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addComponent(jLabel160)
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel147)
                            .addComponent(tf_fm_educational_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel159))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel149)
                                .addComponent(tf_fm_name_of_school1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel160)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_fm_achievements1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel150)
                                .addComponent(jLabel161))
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel82.setText("10.) Skills");
        jXLabel82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel82.setLineWrap(true);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jXLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton43.setText("Previous");
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton42.setText("Next");
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox58.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox58.setText("Teaching");

        jXLabel87.setText("People Skill");
        jXLabel87.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel87.setLineWrap(true);

        jCheckBox59.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox59.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox59.setText("Negotiating");
        jCheckBox59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox59ActionPerformed(evt);
            }
        });

        jCheckBox60.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox60.setText("Diverting");
        jCheckBox60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox60ActionPerformed(evt);
            }
        });

        jCheckBox61.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox61.setText("Persuading");

        jCheckBox62.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox62.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox62.setText("Speaking");
        jCheckBox62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox62ActionPerformed(evt);
            }
        });

        jCheckBox63.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox63.setText("Serving");

        jCheckBox64.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox64.setText("Helping");

        jCheckBox65.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox65.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox65.setText("Encouraging");
        jCheckBox65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox65ActionPerformed(evt);
            }
        });

        jCheckBox66.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox66.setText("Motivating");

        jCheckBox67.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox67.setText("Leading");

        jCheckBox68.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox68.setText("Promoting");
        jCheckBox68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox68ActionPerformed(evt);
            }
        });

        jCheckBox69.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox69.setText("Selling");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox61)
                            .addComponent(jCheckBox62)
                            .addComponent(jCheckBox63)
                            .addComponent(jCheckBox64)
                            .addComponent(jCheckBox65)
                            .addComponent(jCheckBox66)
                            .addGroup(jPanel66Layout.createSequentialGroup()
                                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                                            .addComponent(jCheckBox58)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanel66Layout.createSequentialGroup()
                                            .addComponent(jCheckBox59)
                                            .addGap(6, 6, 6)))
                                    .addGroup(jPanel66Layout.createSequentialGroup()
                                        .addComponent(jCheckBox60)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox67)
                                    .addComponent(jCheckBox69)
                                    .addComponent(jCheckBox68)))))
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel66Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBox68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jXLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox58)))
                .addGap(0, 0, 0)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox59)
                    .addComponent(jCheckBox69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox60)
                    .addComponent(jCheckBox67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox66))
        );

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox9.setText("Coordinating");

        jXLabel84.setText("Data Skills");
        jXLabel84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel84.setLineWrap(true);

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox10.setText("Analyzing");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox17.setText("Compiling");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox18.setText("Computing");

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox19.setText("Tabulating");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox20.setText("Comparing");

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox23.setText("Planning");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox24.setText("Recording");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox25.setText("Posting");

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox26.setText("Testing");

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox27.setText("Checking");

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox28.setText("Researching");

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox41.setText("Comparing");

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox42.setText("Copying");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jCheckBox9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox27))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jCheckBox10)
                        .addGap(22, 22, 22)
                        .addComponent(jCheckBox28))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox17)
                            .addComponent(jCheckBox18)
                            .addComponent(jCheckBox19)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox23))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox25)
                            .addComponent(jCheckBox42)
                            .addComponent(jCheckBox26)
                            .addComponent(jCheckBox41)))
                    .addComponent(jXLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jXLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox27))))
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jCheckBox28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox23)
                    .addComponent(jCheckBox24))
                .addGap(23, 23, 23))
        );

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox43.setText("Machine Work");

        jXLabel85.setText("Thing Skills");
        jXLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel85.setLineWrap(true);

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox44.setText("Setting-up");
        jCheckBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox44ActionPerformed(evt);
            }
        });

        jCheckBox45.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox45.setText("Operating/Controlling");
        jCheckBox45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox45ActionPerformed(evt);
            }
        });

        jCheckBox46.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox46.setText("Driving/Steering");

        jCheckBox47.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox47.setText("Manipulating");
        jCheckBox47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox47ActionPerformed(evt);
            }
        });

        jCheckBox48.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox48.setText("Materials handling");

        jCheckBox49.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox49.setText("Inspecting");
        jCheckBox49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox49ActionPerformed(evt);
            }
        });

        jCheckBox50.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox50.setText("Producing");
        jCheckBox50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox50ActionPerformed(evt);
            }
        });

        jCheckBox51.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox51.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox51.setText("Warehousing");

        jCheckBox52.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox52.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox52.setText("Restoring");

        jCheckBox53.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox53.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox53.setText("Building");

        jCheckBox54.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox54.setText("Precision Working");

        jCheckBox55.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox55.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox55.setText("Feeding/Loading");

        jCheckBox56.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox56.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox56.setText("Assembling");
        jCheckBox56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox56ActionPerformed(evt);
            }
        });

        jCheckBox57.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox57.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox57.setText("Repairing/Adusting");
        jCheckBox57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                            .addComponent(jCheckBox45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox52)
                                .addComponent(jCheckBox53)
                                .addComponent(jCheckBox54))
                            .addGap(12, 12, 12))
                        .addComponent(jCheckBox51)
                        .addComponent(jCheckBox44)
                        .addGroup(jPanel59Layout.createSequentialGroup()
                            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox46)
                                .addComponent(jCheckBox48)
                                .addComponent(jCheckBox47)
                                .addComponent(jCheckBox49))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox50)
                                .addComponent(jCheckBox55)
                                .addComponent(jCheckBox56)
                                .addComponent(jCheckBox57))))
                    .addComponent(jCheckBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jXLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox43)
                            .addComponent(jCheckBox53))))
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox44)
                    .addComponent(jCheckBox54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox45)
                    .addComponent(jCheckBox52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox46)
                    .addComponent(jCheckBox55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox47)
                    .addComponent(jCheckBox56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox48)
                    .addComponent(jCheckBox57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox49)
                    .addComponent(jCheckBox50))
                .addGap(0, 0, 0)
                .addComponent(jCheckBox51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setText("Implementing");

        jXLabel86.setText("Idea Skills");
        jXLabel86.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel86.setLineWrap(true);

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setText("Synthesizing");
        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setText("Creating/Inventing");
        jCheckBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox31ActionPerformed(evt);
            }
        });

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setText("Discovering");

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setText("Interpreting");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setText("Expressing");

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("Instruction");

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setText("Organizing");
        jCheckBox36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox36ActionPerformed(evt);
            }
        });

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setText("Theorizing");

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setText("Anticipating");

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setText("Speculation");

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setText("Predicting");

        jCheckBox70.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox70.setText("Innovating");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox38)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel65Layout.createSequentialGroup()
                                    .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox31)
                                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox29, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel65Layout.createSequentialGroup()
                                                .addComponent(jCheckBox30)
                                                .addGap(6, 6, 6))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                                    .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox32)
                                        .addComponent(jCheckBox33))
                                    .addGap(34, 34, 34)))
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addComponent(jCheckBox35)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox36)
                            .addComponent(jCheckBox70)
                            .addComponent(jCheckBox40)
                            .addComponent(jCheckBox39)
                            .addComponent(jCheckBox37)
                            .addComponent(jCheckBox34))))
                .addGap(8, 8, 8))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel65Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jXLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCheckBox29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jCheckBox30))
                    .addGroup(jPanel65Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jCheckBox39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox31)
                    .addComponent(jCheckBox37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox32)
                    .addComponent(jCheckBox70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox33)
                    .addComponent(jCheckBox34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox35)
                    .addComponent(jCheckBox36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Others please specify:");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton41.setText("Add");
        jButton41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton41, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jSeparator11)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel68, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(13, 13, 13))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        tabbed_panes.addTab("Household Members (3)", jPanel16);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jPanel56.setBackground(new java.awt.Color(204, 204, 204));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jXLabel80.setText("11.) Employment Status");
        jXLabel80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jXLabel80.setLineWrap(true);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jXLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jPanel57.setBackground(new java.awt.Color(204, 204, 204));
        jPanel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cb_status_unemployed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_status_unemployed.setText("Unemployed");
        cb_status_unemployed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployedActionPerformed(evt);
            }
        });

        cb_status_employed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_status_employed.setText("Employed");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Status:");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setText("Company:");

        tf_employment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_employment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_employmentActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel44.setText("Type:");

        tf_company_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_company_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_company_typeActionPerformed(evt);
            }
        });

        jPanel67.setBackground(new java.awt.Color(204, 204, 204));
        jPanel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel114.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel114.setText("Name of Business:");

        tf_employment_name_of_business1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel115.setText("Type of Business:");

        jTextField49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jLabel140.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel140.setText("Net Income Estimation:");

        jTextField50.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel142.setText("Business Address:");

        jTextField82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField82ActionPerformed(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel145.setText("Mailing Address:");

        jTextField83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel146.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel146.setText("Homebased Business? [");

        jCheckBox71.setText("yes");

        jCheckBox72.setText("no");
        jCheckBox72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox72ActionPerformed(evt);
            }
        });

        jLabel152.setText("]");

        jLabel157.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel157.setText("Country:");

        jTextField16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel162.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel162.setText("Profession/Job:");

        jTextField19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel163.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel163.setText("Reason for Migration:");

        jTextField91.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel164.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel164.setText("Finacial Assistance amount:");

        jTextField92.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel115)
                                .addGap(15, 15, 15)
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel67Layout.createSequentialGroup()
                                        .addComponent(jLabel164)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField92, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                                    .addGroup(jPanel67Layout.createSequentialGroup()
                                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel162)
                                            .addComponent(jLabel157))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addComponent(jTextField16))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel67Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel140))
                                    .addComponent(jLabel146))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel67Layout.createSequentialGroup()
                                        .addComponent(jCheckBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox72))
                                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel152))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jLabel163)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addComponent(jLabel114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_employment_name_of_business1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel67Layout.createSequentialGroup()
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel142)
                                    .addGroup(jPanel67Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel145)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField83)
                                    .addComponent(jTextField82))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel67Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(tf_employment_name_of_business1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel142)
                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145))
                .addGap(2, 2, 2)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel157)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel146)
                            .addComponent(jCheckBox71)
                            .addComponent(jCheckBox72)
                            .addComponent(jLabel152))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel67Layout.createSequentialGroup()
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel162)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel164)
                            .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel140)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jButton21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton21.setText("ADD");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton22.setText("UPDATE");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton23.setText("DELETE");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tb_employment_status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Self Employed and Contractor", "asdfghjkasdfgfhjjjjjjk"},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employment Status", "Company"
            }
        ));
        jScrollPane10.setViewportView(tb_employment_status);

        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton1.setText("Finsihed Contract");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton2.setText("Resigned");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton3.setText("Terminated/Laid Off,local");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cb_employment_worker.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_worker.setText("Worker");
        cb_employment_worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_workerActionPerformed(evt);
            }
        });

        cb_employment_employee.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_employee.setText("Employee");
        cb_employment_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_employeeActionPerformed(evt);
            }
        });

        cb_employment_self_employed.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_self_employed.setText("Self Employed");
        cb_employment_self_employed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_self_employedActionPerformed(evt);
            }
        });

        cb_employment_director.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_director.setText("Director");
        cb_employment_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_directorActionPerformed(evt);
            }
        });

        cb_employment_office_holder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_office_holder.setText("Office Holder");
        cb_employment_office_holder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_office_holderActionPerformed(evt);
            }
        });

        cb_employment_ofw.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_ofw.setText("OFW");
        cb_employment_ofw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_ofwActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton4.setText("Terminated/Laid off, abroad Specify  the contry where you worked and got terminated:");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox3.setText("Are you  actively looking for work?");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_employment_worker)
                            .addComponent(cb_employment_employee)
                            .addComponent(cb_employment_self_employed)
                            .addComponent(cb_employment_director)
                            .addComponent(cb_employment_ofw)
                            .addComponent(cb_employment_office_holder))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton4)
                                    .addGroup(jPanel57Layout.createSequentialGroup()
                                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton3)
                                            .addComponent(jRadioButton1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_company_type, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel57Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel57Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel57Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(15, 15, 15)
                                    .addComponent(cb_status_employed)
                                    .addGap(121, 121, 121)
                                    .addComponent(cb_status_unemployed))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_employment, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_company_type, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_status_employed)
                            .addComponent(cb_status_unemployed))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_employment_worker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1))
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_employment_employee))
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(cb_employment_self_employed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(cb_employment_director))))
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(cb_employment_office_holder)
                        .addGap(0, 0, 0)
                        .addComponent(cb_employment_ofw, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton5.setText("Previous");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton16.setText("Next");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbed_panes.addTab("Household Members (4)", jPanel24);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(204, 204, 204));

        jTable12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ronald Pascua", "Director", "16", "Married", "Filipino", "Roman Catholic", "Ron@gg.com"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Position", "Age", "Status", "Citizenship", "Religion", "Email Address"
            }
        ));
        jScrollPane12.setViewportView(jTable12);

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("  Household Members' L  i  s  t");

        jButton9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton9.setText("Update Member");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton13.setText("Delete Member");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGap(0, 413, Short.MAX_VALUE)
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(431, 431, 431))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                        .addComponent(jScrollPane12)
                        .addContainerGap())))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton31.setText("Add New Household");
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton30.setText("Add New Member");
        jButton30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbed_panes.addTab("Houshold Member's List", jPanel27);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tabbed_panes, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tabbed_panes, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        tabbed_panes.getAccessibleContext().setAccessibleDescription("sadfgh");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
///action performed
//<editor-fold defaultstate="collapsed" desc=" callback ">

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void cb_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_noActionPerformed

    private void tf_fm_religion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_religion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_religion2ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void tf_fm_priorr_residence1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_priorr_residence1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_priorr_residence1ActionPerformed

    private void tf_fm_maritalstatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_maritalstatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_maritalstatus1ActionPerformed

    private void tf_fm_religionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_religionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_religionActionPerformed

    private void tf_othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_othersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_othersActionPerformed

    private void tf_fm_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_genderActionPerformed

    private void tf_fm_priorr_residenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_priorr_residenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_priorr_residenceActionPerformed

    private void tf_fm_birthplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_birthplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_birthplaceActionPerformed

    private void tf_fm_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_lastnameActionPerformed

    private void tf_fm_miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_miActionPerformed

    private void tf_fm_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_firstnameActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        tabbed_panes.setSelectedIndex(2);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void cb_can_highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_can_highActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_can_highActionPerformed

    private void cb_hunger_above_averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_hunger_above_averageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_hunger_above_averageActionPerformed

    private void cb_crime_verylowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_crime_verylowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_crime_verylowActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        tabbed_panes.setSelectedIndex(0);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        tabbed_panes.setSelectedIndex(3);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        tabbed_panes.setSelectedIndex(3);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        tabbed_panes.setSelectedIndex(1);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void tbl_expendituresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_expendituresMouseClicked
        expenditures_select();
    }//GEN-LAST:event_tbl_expendituresMouseClicked

    private void b_add_expendituresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_add_expendituresActionPerformed
        add_expenditures();
    }//GEN-LAST:event_b_add_expendituresActionPerformed

    private void tf__hhe_hobbies_clubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf__hhe_hobbies_clubsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf__hhe_hobbies_clubsActionPerformed

    private void tf_hhe_water_billsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hhe_water_billsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hhe_water_billsActionPerformed

    private void tf_hhe_load_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hhe_load_expensesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hhe_load_expensesActionPerformed

    private void tf_hhe_medical_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hhe_medical_expensesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hhe_medical_expensesActionPerformed

    private void tf_consumption_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_consumption_amountActionPerformed
        add_record_consumption();
    }//GEN-LAST:event_tf_consumption_amountActionPerformed

    private void tbl_household_consumptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_household_consumptionsMouseClicked
        select_consumption();
    }//GEN-LAST:event_tbl_household_consumptionsMouseClicked

    private void b_add_consumptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_add_consumptionActionPerformed
        add_record_consumption();
    }//GEN-LAST:event_b_add_consumptionActionPerformed

    private void tf_consumption_basicneedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_consumption_basicneedsActionPerformed
        init_basicneeds();
    }//GEN-LAST:event_tf_consumption_basicneedsActionPerformed

    private void tf_consumption_basicneedsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_consumption_basicneedsMouseClicked
        init_basicneeds();
    }//GEN-LAST:event_tf_consumption_basicneedsMouseClicked

    private void tbl_assetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_assetsMouseClicked
        select_asset();
    }//GEN-LAST:event_tbl_assetsMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void tf_purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //add_houses();
        tabbed_panes.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        disposed();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    private void jCheckBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox31ActionPerformed

    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox33ActionPerformed

    private void jCheckBox36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox36ActionPerformed

    private void jCheckBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox44ActionPerformed

    private void jCheckBox45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox45ActionPerformed

    private void jCheckBox47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox47ActionPerformed

    private void jCheckBox49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox49ActionPerformed

    private void jCheckBox50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox50ActionPerformed

    private void jCheckBox56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox56ActionPerformed

    private void jCheckBox57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox57ActionPerformed

    private void jCheckBox59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox59ActionPerformed

    private void jCheckBox60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox60ActionPerformed

    private void jCheckBox62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox62ActionPerformed

    private void jCheckBox65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox65ActionPerformed

    private void jCheckBox68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox68ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        tabbed_panes.setSelectedIndex(8);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        tabbed_panes.setSelectedIndex(6);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void cb_status_unemployedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployedActionPerformed

    private void tf_employmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_employmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_employmentActionPerformed

    private void tf_company_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_company_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_company_typeActionPerformed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jTextField82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField82ActionPerformed

    private void jCheckBox72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox72ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void cb_employment_workerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_workerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_workerActionPerformed

    private void cb_employment_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_employeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_employeeActionPerformed

    private void cb_employment_self_employedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_self_employedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_self_employedActionPerformed

    private void cb_employment_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_directorActionPerformed

    private void cb_employment_office_holderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_office_holderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_office_holderActionPerformed

    private void cb_employment_ofwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_ofwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_ofwActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tabbed_panes.setSelectedIndex(6);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        tabbed_panes.setSelectedIndex(5);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        tabbed_panes.setSelectedIndex(1);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        tabbed_panes.setSelectedIndex(4);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        tabbed_panes.setSelectedIndex(7);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tf_hhe_books_newspaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hhe_books_newspaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hhe_books_newspaperActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void tf_floor_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_floor_typeActionPerformed
        init_floors();
    }//GEN-LAST:event_tf_floor_typeActionPerformed

    private void tf_communication_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_communication_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_communication_typeActionPerformed

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        init_barangays();
    }//GEN-LAST:event_tf_barangayMouseClicked

    private void tf_kitchen_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kitchen_typeActionPerformed
        init_kitchens();
    }//GEN-LAST:event_tf_kitchen_typeActionPerformed

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        init_barangays();
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_bathroom_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_bathroom_typeMouseClicked
        init_bathrooms();
    }//GEN-LAST:event_tf_bathroom_typeMouseClicked

    private void tf_building_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_building_typeActionPerformed
        init_buildings();
    }//GEN-LAST:event_tf_building_typeActionPerformed

    private void tf_building_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_building_typeMouseClicked
        init_buildings();
    }//GEN-LAST:event_tf_building_typeMouseClicked

    private void tf_toilet_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_toilet_typeActionPerformed
        init_toilets();
    }//GEN-LAST:event_tf_toilet_typeActionPerformed

    private void tf_toilet_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_toilet_typeMouseClicked
        init_toilets();
    }//GEN-LAST:event_tf_toilet_typeMouseClicked

    private void tf_disposal_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disposal_methodActionPerformed
        init_disposal_methods();
    }//GEN-LAST:event_tf_disposal_methodActionPerformed

    private void tf_disposal_methodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disposal_methodMouseClicked
        init_disposal_methods();
    }//GEN-LAST:event_tf_disposal_methodMouseClicked

    private void tf_kitchen_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_kitchen_typeMouseClicked
        init_kitchens();
    }//GEN-LAST:event_tf_kitchen_typeMouseClicked

    private void tf_transportation_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_transportation_typeMouseClicked
        init_transportations();
    }//GEN-LAST:event_tf_transportation_typeMouseClicked

    private void tf_roof_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_roof_typeMouseClicked
        init_roofs();
    }//GEN-LAST:event_tf_roof_typeMouseClicked

    private void tf_wall_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_wall_typeMouseClicked
        init_walls();
    }//GEN-LAST:event_tf_wall_typeMouseClicked

    private void tf_floor_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_floor_typeMouseClicked
      init_floors();
    }//GEN-LAST:event_tf_floor_typeMouseClicked

    private void tf_communication_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_communication_typeMouseClicked
       init_communications();
    }//GEN-LAST:event_tf_communication_typeMouseClicked

    private void tf_lighting_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lighting_typeMouseClicked
       init_cooking_method_tf_lighting();
    }//GEN-LAST:event_tf_lighting_typeMouseClicked

    private void tf_cooking_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cooking_typeMouseClicked
       init_cooking_method_tf_cooking();
    }//GEN-LAST:event_tf_cooking_typeMouseClicked

    private void tf_purok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purok1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purok1ActionPerformed

    private void tf_purok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purok2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_purok2ActionPerformed

    private void tf_source_of_waterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_source_of_waterMouseClicked
       init_water_sources();
    }//GEN-LAST:event_tf_source_of_waterMouseClicked

    private void tf_transportation_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_transportation_typeActionPerformed
        init_transportations();
    }//GEN-LAST:event_tf_transportation_typeActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        tabbed_panes.setSelectedIndex(2);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        tabbed_panes.setSelectedIndex(0);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tabbed_panes.setSelectedIndex(7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        tabbed_panes.setSelectedIndex(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tf_fm_name_of_school2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_name_of_school2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_name_of_school2ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void tf_fm_name_of_school1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fm_name_of_school1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fm_name_of_school1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        tabbed_panes.setSelectedIndex(9);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tf_house_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_house_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_house_noActionPerformed

    private void tf_streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_streetActionPerformed

    private void tf_roof_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_roof_typeActionPerformed
        init_roofs();
    }//GEN-LAST:event_tf_roof_typeActionPerformed

    private void tf_wall_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_wall_typeActionPerformed
        init_walls();
    }//GEN-LAST:event_tf_wall_typeActionPerformed

    private void tf_lighting_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lighting_typeActionPerformed
        init_cooking_method_tf_lighting();
    }//GEN-LAST:event_tf_lighting_typeActionPerformed

    private void tf_cooking_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cooking_typeActionPerformed
        init_cooking_method_tf_cooking();
    }//GEN-LAST:event_tf_cooking_typeActionPerformed

    private void tf_source_of_waterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_source_of_waterActionPerformed
        init_water_sources();
    }//GEN-LAST:event_tf_source_of_waterActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed
//</editor-fold>  
    /**
     * @param args the com // TODO add your handling code here: } mand line
     * arguments
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_add_consumption;
    private javax.swing.JButton b_add_expenditures;
    private javax.swing.JCheckBox cb_ap_above_average;
    private javax.swing.JCheckBox cb_ap_average;
    private javax.swing.JCheckBox cb_ap_high;
    private javax.swing.JCheckBox cb_ap_low;
    private javax.swing.JCheckBox cb_ap_verylow;
    private javax.swing.JCheckBox cb_as_adequate;
    private javax.swing.JCheckBox cb_as_excellent;
    private javax.swing.JCheckBox cb_as_inadequate;
    private javax.swing.JCheckBox cb_can_above_average;
    private javax.swing.JCheckBox cb_can_average;
    private javax.swing.JCheckBox cb_can_high;
    private javax.swing.JCheckBox cb_can_low;
    private javax.swing.JCheckBox cb_can_verylow;
    private com.toedter.calendar.JMonthChooser cb_consumption_month;
    private javax.swing.JCheckBox cb_crime_above_average;
    private javax.swing.JCheckBox cb_crime_average;
    private javax.swing.JCheckBox cb_crime_high;
    private javax.swing.JCheckBox cb_crime_low;
    private javax.swing.JCheckBox cb_crime_verylow;
    private javax.swing.JCheckBox cb_da_above_average;
    private javax.swing.JCheckBox cb_da_average;
    private javax.swing.JCheckBox cb_da_high;
    private javax.swing.JCheckBox cb_da_low;
    private javax.swing.JCheckBox cb_da_verylow;
    private javax.swing.JCheckBox cb_ds_adequate;
    private javax.swing.JCheckBox cb_ds_excellent;
    private javax.swing.JCheckBox cb_ds_inadequate;
    private javax.swing.JCheckBox cb_dv_above_average;
    private javax.swing.JCheckBox cb_dv_average;
    private javax.swing.JCheckBox cb_dv_high;
    private javax.swing.JCheckBox cb_dv_low;
    private javax.swing.JCheckBox cb_dv_verylow;
    private javax.swing.JCheckBox cb_ec_above_average;
    private javax.swing.JCheckBox cb_ec_average;
    private javax.swing.JCheckBox cb_ec_high;
    private javax.swing.JCheckBox cb_ec_low;
    private javax.swing.JCheckBox cb_ec_verylow;
    private javax.swing.JRadioButton cb_employment_director;
    private javax.swing.JRadioButton cb_employment_employee;
    private javax.swing.JRadioButton cb_employment_office_holder;
    private javax.swing.JRadioButton cb_employment_ofw;
    private javax.swing.JRadioButton cb_employment_self_employed;
    private javax.swing.JRadioButton cb_employment_worker;
    private javax.swing.JCheckBox cb_fp_adequate;
    private javax.swing.JCheckBox cb_fp_excellent;
    private javax.swing.JCheckBox cb_fp_inadequate;
    private javax.swing.JCheckBox cb_gc_adequate;
    private javax.swing.JCheckBox cb_gc_excellent;
    private javax.swing.JCheckBox cb_gc_inadequate;
    private javax.swing.JCheckBox cb_hd_above_average;
    private javax.swing.JCheckBox cb_hd_average;
    private javax.swing.JCheckBox cb_hd_high;
    private javax.swing.JCheckBox cb_hd_low;
    private javax.swing.JCheckBox cb_hd_verylow;
    private javax.swing.JCheckBox cb_hunger_above_average;
    private javax.swing.JCheckBox cb_hunger_average;
    private javax.swing.JCheckBox cb_hunger_high;
    private javax.swing.JCheckBox cb_hunger_low;
    private javax.swing.JCheckBox cb_hunger_verylow;
    private javax.swing.JCheckBox cb_lp_adequate;
    private javax.swing.JCheckBox cb_lp_excellent;
    private javax.swing.JCheckBox cb_lp_excellent33;
    private javax.swing.JCheckBox cb_lp_excellent34;
    private javax.swing.JCheckBox cb_lp_excellent35;
    private javax.swing.JCheckBox cb_lp_excellent36;
    private javax.swing.JCheckBox cb_lp_excellent37;
    private javax.swing.JCheckBox cb_lp_excellent38;
    private javax.swing.JCheckBox cb_lp_excellent39;
    private javax.swing.JCheckBox cb_lp_excellent40;
    private javax.swing.JCheckBox cb_lp_inadequate;
    private javax.swing.JCheckBox cb_no;
    private javax.swing.JCheckBox cb_pp_adequate;
    private javax.swing.JCheckBox cb_pp_excellent;
    private javax.swing.JCheckBox cb_pp_inadequate;
    private javax.swing.JCheckBox cb_sm_adequate;
    private javax.swing.JCheckBox cb_sm_excellent;
    private javax.swing.JCheckBox cb_sm_inadequate;
    private javax.swing.JCheckBox cb_status_employed;
    private javax.swing.JCheckBox cb_status_unemployed;
    private javax.swing.JComboBox cb_years;
    private javax.swing.JCheckBox cb_yes;
    private com.toedter.calendar.JDateChooser dc_fm_birthdate;
    private javax.swing.ButtonGroup grp_adolescent_pregnancy;
    private javax.swing.ButtonGroup grp_ambulance_service;
    private javax.swing.ButtonGroup grp_child_abuse_and_neglect;
    private javax.swing.ButtonGroup grp_crime;
    private javax.swing.ButtonGroup grp_domestic_violence;
    private javax.swing.ButtonGroup grp_drainage_system;
    private javax.swing.ButtonGroup grp_drug_abuse;
    private javax.swing.ButtonGroup grp_employment_status;
    private javax.swing.ButtonGroup grp_environmental_contamination;
    private javax.swing.ButtonGroup grp_fire_protection;
    private javax.swing.ButtonGroup grp_garbage_collection;
    private javax.swing.ButtonGroup grp_health_disparities;
    private javax.swing.ButtonGroup grp_hunger;
    private javax.swing.ButtonGroup grp_livelihood_programs;
    private javax.swing.ButtonGroup grp_police_protection;
    private javax.swing.ButtonGroup grp_street_maintenance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
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
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
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
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private org.jdesktop.swingx.JXLabel jXLabel72;
    private org.jdesktop.swingx.JXLabel jXLabel76;
    private org.jdesktop.swingx.JXLabel jXLabel77;
    private org.jdesktop.swingx.JXLabel jXLabel79;
    private org.jdesktop.swingx.JXLabel jXLabel80;
    private org.jdesktop.swingx.JXLabel jXLabel81;
    private org.jdesktop.swingx.JXLabel jXLabel82;
    private org.jdesktop.swingx.JXLabel jXLabel84;
    private org.jdesktop.swingx.JXLabel jXLabel85;
    private org.jdesktop.swingx.JXLabel jXLabel86;
    private org.jdesktop.swingx.JXLabel jXLabel87;
    private org.jdesktop.swingx.JXLabel jXLabel89;
    private org.jdesktop.swingx.JXLabel jXLabel92;
    private javax.swing.JLabel l_barangay;
    private javax.swing.JLabel l_buil_type;
    private javax.swing.JLabel l_house;
    private javax.swing.JLabel l_purok;
    private javax.swing.JLabel l_street;
    private javax.swing.JLabel l_total_expenditures;
    private com.toedter.calendar.JMonthChooser mc_expenditures_month;
    private javax.swing.ButtonGroup status;
    private javax.swing.JTextArea ta_additional_concerns;
    private javax.swing.JTabbedPane tabbed_panes;
    private javax.swing.JTable tb_employment_status;
    private javax.swing.JTable tbl_assets;
    private javax.swing.JTable tbl_expenditures;
    private javax.swing.JTable tbl_household_consumptions;
    private javax.swing.JTextField tf__hhe_hobbies_clubs;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_bathroom_type;
    private javax.swing.JTextField tf_building_type;
    private javax.swing.JTextField tf_communication_type;
    private javax.swing.JTextField tf_company_type;
    private javax.swing.JTextField tf_consumption_amount;
    private javax.swing.JTextField tf_consumption_basicneeds;
    private javax.swing.JTextField tf_cooking_type;
    private javax.swing.JTextField tf_disposal_method;
    private javax.swing.JTextField tf_employment;
    private javax.swing.JTextField tf_employment_name_of_business1;
    private javax.swing.JTextField tf_floor_type;
    private javax.swing.JTextField tf_fm_achievements1;
    private javax.swing.JTextField tf_fm_achievements2;
    private javax.swing.JTextField tf_fm_birthplace;
    private javax.swing.JTextField tf_fm_citizenship;
    private javax.swing.JTextField tf_fm_educational_status1;
    private javax.swing.JTextField tf_fm_educational_status2;
    private javax.swing.JTextField tf_fm_educational_status3;
    private javax.swing.JTextField tf_fm_firstname;
    private javax.swing.JTextField tf_fm_gender;
    private javax.swing.JTextField tf_fm_highest_grade_computed2;
    private javax.swing.JTextField tf_fm_lastname;
    private javax.swing.JTextField tf_fm_maritalstatus1;
    private javax.swing.JTextField tf_fm_maritalstatus2;
    private javax.swing.JTextField tf_fm_mi;
    private javax.swing.JTextField tf_fm_name_of_school1;
    private javax.swing.JTextField tf_fm_name_of_school2;
    private javax.swing.JTextField tf_fm_occupancy;
    private javax.swing.JTextField tf_fm_priorr_residence;
    private javax.swing.JTextField tf_fm_priorr_residence1;
    private javax.swing.JTextField tf_fm_religion;
    private javax.swing.JTextField tf_fm_religion1;
    private javax.swing.JTextField tf_fm_religion2;
    private javax.swing.JTextField tf_hhe_alcohol;
    private javax.swing.JTextField tf_hhe_books_newspaper;
    private javax.swing.JTextField tf_hhe_cable_services;
    private javax.swing.JTextField tf_hhe_cigarettes_tobacco;
    private javax.swing.JTextField tf_hhe_electric_gas_oil;
    private javax.swing.JTextField tf_hhe_fuel_expenses;
    private javax.swing.JTextField tf_hhe_gambling;
    private javax.swing.JTextField tf_hhe_internet_services;
    private javax.swing.JTextField tf_hhe_load_expenses;
    private javax.swing.JTextField tf_hhe_medical_expenses;
    private javax.swing.JTextField tf_hhe_misc;
    private javax.swing.JTextField tf_hhe_parties_social;
    private javax.swing.JTextField tf_hhe_personal_care;
    private javax.swing.JTextField tf_hhe_vacations_travel;
    private javax.swing.JTextField tf_hhe_water_bills;
    private javax.swing.JTextField tf_house_no;
    private javax.swing.JTextField tf_household_id;
    private javax.swing.JTextField tf_kitchen_type;
    private javax.swing.JTextField tf_lighting_type;
    private javax.swing.JTextField tf_monthly_rental;
    private javax.swing.JTextField tf_no_rooms_for_sleeping;
    private javax.swing.JTextField tf_others;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_purok1;
    private javax.swing.JTextField tf_purok2;
    private javax.swing.JTextField tf_roof_type;
    private javax.swing.JTextField tf_source_of_water;
    private javax.swing.JTextField tf_street;
    private javax.swing.JTextField tf_tenure;
    private javax.swing.JTextField tf_toilet_type;
    private javax.swing.JTextField tf_transportation_type;
    private javax.swing.JTextField tf_wall_type;
    // End of variables declaration//GEN-END:variables

//</editor-fold>
    private void myInit() {
        init_key();
        get_fields();
        set_place_holder();
        init_tables();

        init_tf_icons();

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

    private void set_place_holder() {
        Placeholder.set(tf_fm_firstname, "First Name");
        Placeholder.set(tf_fm_mi, "Middle Name");
        Placeholder.set(tf_fm_lastname, "Last Name");

    }

    private void get_fields() {
        JTextField[] tf = {};
        JPanel[] pnl = {jPanel3, jPanel4, jPanel63};
        for (JPanel p : pnl) {
            for (Component c : p.getComponents()) {
                if (c instanceof JTextField) {
                    
                    Focus_Fire.select_all2(((JTextField) c));
                }
                if (c instanceof JPanel) {
                    for (Component c2 : ((JPanel) c).getComponents()) {
                        if (c2 instanceof JTextField) {
                            
                            Focus_Fire.select_all2(((JTextField) c2));
                        }

                        if (c2 instanceof JPanel) {

                            for (Component c3 : ((JPanel) c2).getComponents()) {
                                if (c3 instanceof JTextField) {
                                   
                                    Focus_Fire.select_all2(((JTextField) c3));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayListModel employment_table_ALM;
    private employment_tblModel tbl_employment_M;

    private void init_tbl_employment_status() {
        employment_table_ALM = new ArrayListModel();
        tbl_employment_M = new employment_tblModel(employment_table_ALM);
        tb_employment_status.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tb_employment_status.setModel(tbl_employment_M);
        tb_employment_status.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tb_employment_status.setRowHeight(25);
        int[] tbl_widths_students = {100, 600, 50, 50};
        for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tb_employment_status, i, tbl_widths_students[i]);
        }
        Dimension d = tb_employment_status.getTableHeader().getPreferredSize();
        d.height = 25;
        tb_employment_status.getTableHeader().setPreferredSize(d);
        tb_employment_status.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tb_employment_status.setRowHeight(25);
        tb_employment_status.setFont(new java.awt.Font("Arial", 0, 11));
    }

    public static class employment_tblModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Employment Status", "Company", "", ""
        };

        public employment_tblModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

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

            emp_extension tt = (emp_extension) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.employment_status;
                case 1:
                    return " " + tt.company;

                case 2:
                    return " Update";

                default:
                    return " Delete";
            }
        }
    }

    private void select_employment_status() {
        int row = tb_employment_status.getSelectedRow();
        if (row < 0) {
            return;
        }

        if (row == 2) {
            employment_table_ALM.remove(row);
            tbl_employment_M.fireTableDataChanged();
            System.out.println("delete");

        } else if (row == 3) {
            employment_table_ALM.remove(row);
            tbl_employment_M.fireTableDataChanged();
            System.out.println("delete");

        }
    }

    public void add_employment_status() {
        String status = "";
        String employment_status = "";
        if (cb_status_unemployed.isSelected()) {
            status = "Unemployed";
        } else if (cb_status_employed.isSelected()) {
            status = "Employed";
        }

        if (cb_employment_worker.isSelected()) {
            employment_status = "Worker";
        } else if (cb_employment_employee.isSelected()) {
            employment_status = "Employee";
        } else if (cb_employment_self_employed.isSelected()) {
            employment_status = "Self Employed and Contractor";
        } else if (cb_employment_director.isSelected()) {
            employment_status = "Director";
        } else if (cb_employment_office_holder.isSelected()) {
            employment_status = "Office Holder";
        } else if (cb_employment_ofw.isSelected()) {
            employment_status = "OFW";
        }
        String company = tf_employment.getText();
        employment_add_record(employment_status, company);
    }

    private void employment_add_record(String employment_status1, String company1) {
        String status = employment_status1;
        String company = company1;
        emp_extension to = new emp_extension(status, company);
        employment_table_ALM.add(to);
        tbl_employment_M.fireTableDataChanged();

    }

    private ArrayListModel consumption_table_ALM;
    private consumption_tblModel tbl_household_consumptions_M;

    private void init_tbl_household_consumptions() {
        consumption_table_ALM = new ArrayListModel();
        tbl_household_consumptions_M = new consumption_tblModel(consumption_table_ALM);
        tbl_household_consumptions.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_household_consumptions.setModel(tbl_household_consumptions_M);
        tbl_household_consumptions.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_household_consumptions.setRowHeight(25);
        int[] tbl_widths_students = {100, 200, 200, 50, 50};
        for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_household_consumptions, i, tbl_widths_students[i]);
        }
        Dimension d = tbl_household_consumptions.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_household_consumptions.getTableHeader().setPreferredSize(d);
        tbl_household_consumptions.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_household_consumptions.setRowHeight(25);
        tbl_household_consumptions.setFont(new java.awt.Font("Arial", 0, 11));
    }

    public static class consumption_tblModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Consumption", "Amount", "month", " ", ""
        };

        public consumption_tblModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

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
            cons_extension tt = (cons_extension) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.basic_needs;
                case 1:
                    return " " + tt.amount;
                case 2:
                    return " " + tt.consumption_month;

                case 3:
                    return " Update";
                default:
                    return " Delete";
            }
        }
    }
    ///dropsdowns

    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private void init_barangays() {

        final JXTextField tf = (JXTextField) tf_barangay;
        String where = " where barangay like '%" + tf_barangay.getText() + "%' order by barangay asc";
        final List<S1_barangays.to_barangays> barangay_list = S1_barangays.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.barangays(barangay_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_barangays.to_barangays to = (S1_barangays.to_barangays) barangay_list.get(data.selected_row);
                tf_barangay.setText(to.barangay);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_buildings() {

        final Field.Combo tf = (Field.Combo) tf_building_type;
        String where = " where building_type like '%" + tf_building_type.getText() + "%' order by building_type asc";
        final List<S1_buildings.to_building_types> building_list = S1_buildings.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.buildings(building_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_buildings.to_building_types to = (S1_buildings.to_building_types) building_list.get(data.selected_row);
                tf_building_type.setText(to.building_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_toilets() {

        final Field.Combo tf = (Field.Combo) tf_toilet_type;
        String where = " where toilet_type like '%" + tf_toilet_type.getText() + "%' order by toilet_type asc";
        final List<S1_toilets.to_toilet_types> toilet_list = S1_toilets.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.toilets(toilet_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_toilets.to_toilet_types to = (S1_toilets.to_toilet_types) toilet_list.get(data.selected_row);
                tf_toilet_type.setText(to.toilet_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_disposal_methods() {

        final Field.Combo tf = (Field.Combo) tf_disposal_method;
        String where = " where disposal_method like '%" + tf_disposal_method.getText() + "%' order by disposal_method asc";
        final List<S1_disposal_methods.to_disposal_methods> disposal_methods_list = S1_disposal_methods.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.disposal_methods(disposal_methods_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_disposal_methods.to_disposal_methods to = (S1_disposal_methods.to_disposal_methods) disposal_methods_list.get(data.selected_row);
                tf_disposal_method.setText(to.disposal_method);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_bathrooms() {

        final Field.Combo tf = (Field.Combo) tf_bathroom_type;
        String where = " where bathroom_type like '%" + tf_bathroom_type.getText() + "%' order by bathroom_type asc";
        final List<S1_bathrooms.to_bathroom_types> bathroom_list = S1_bathrooms.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.bathrooms(bathroom_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_bathrooms.to_bathroom_types to = (S1_bathrooms.to_bathroom_types) bathroom_list.get(data.selected_row);
                tf_bathroom_type.setText(to.bathroom_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_kitchens() {

        final Field.Combo tf = (Field.Combo) tf_kitchen_type;
        String where = " where kitchen_type like '%" + tf_kitchen_type.getText() + "%' order by kitchen_type asc";
        final List<S1_kitchens.to_kitchen_types> kitchen_list = S1_kitchens.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.kitchens(kitchen_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                S1_kitchens.to_kitchen_types to = (S1_kitchens.to_kitchen_types) kitchen_list.get(data.selected_row);
                tf_kitchen_type.setText(to.kitchen_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_transportations() {

        final Field.Combo tf = (Field.Combo) tf_transportation_type;
        String where = " where transportation_type like '%" + tf_transportation_type.getText() + "%' order by transportation_type asc";
        final List<S1_transportations.to_transportation_types> transportation_list = S1_transportations.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.transportations(transportation_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_transportations.to_transportation_types to = (S1_transportations.to_transportation_types) transportation_list.get(data.selected_row);
                tf_transportation_type.setText(to.transportation_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_roofs() {

        final Field.Combo tf = (Field.Combo) tf_roof_type;
        String where = " where roof_type like '%" + tf_roof_type.getText() + "%' order by roof_type asc";
        final List<S1_roofs.to_roof_types> roof_list = S1_roofs.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.roofs(roof_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_roofs.to_roof_types to = (S1_roofs.to_roof_types) roof_list.get(data.selected_row);
                tf_roof_type.setText(to.roof_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_walls() {

        final Field.Combo tf = (Field.Combo) tf_wall_type;
        String where = " where wall_type like '%" + tf_wall_type.getText() + "%' order by wall_type asc";
        final List<S1_walls.to_wall_types> wall_list = S1_walls.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.walls(wall_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_walls.to_wall_types to = (S1_walls.to_wall_types) wall_list.get(data.selected_row);
                tf_wall_type.setText(to.wall_type);
                tf.setId("" + to.id);
            }
        });
    }

    private void init_floors() {

        final Field.Combo tf = (Field.Combo) tf_floor_type;
        String where = " where floor_type like '%" + tf_floor_type.getText() + "%' order by floor_type asc";
        final List<S1_floors.to_floor_types> floor_list = S1_floors.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.floors(floor_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_floors.to_floor_types to = (S1_floors.to_floor_types) floor_list.get(data.selected_row);
                tf_floor_type.setText(to.floor_type);
                tf.setId("" + to.id);
            }
        });
    }
    
    private void init_water_sources() {

        final Field.Combo tf = (Field.Combo) tf_source_of_water;
        String where = " where water_source like '%" + tf_source_of_water.getText() + "%' order by water_source asc";
        final List<S1_water_sources.to_water_sources> water_source_list = S1_water_sources.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.water_sources(water_source_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_water_sources.to_water_sources to = (S1_water_sources.to_water_sources) water_source_list.get(data.selected_row);
                tf_source_of_water.setText(to.water_source);
                tf.setId("" + to.id);
            }
        });
    }

     
        private void init_cooking_method_tf_lighting() {

        final Field.Combo tf = (Field.Combo) tf_lighting_type;
        String where = " where cooking_lighting_type like '%" + tf_lighting_type.getText() + "%' order by cooking_lighting_type asc";
        final List<S1_cookings.to_cooking_lighting_types> cooking_method_list = S1_cookings.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.cooking_method(cooking_method_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_cookings.to_cooking_lighting_types to = (S1_cookings.to_cooking_lighting_types) cooking_method_list.get(data.selected_row);
                tf_lighting_type.setText(to.cooking_lighting_type);
                tf.setId("" + to.id);
            }
        });
    }
        
            private void init_cooking_method_tf_cooking() {

        final Field.Combo tf = (Field.Combo) tf_cooking_type;
        String where = " where cooking_lighting_type like '%" + tf_cooking_type.getText() + "%' order by cooking_lighting_type asc";
        final List<S1_cookings.to_cooking_lighting_types> cooking_method_list = S1_cookings.ret_data(where);
        TableRenderer tr = new TableRenderer();
        BuyBack.cooking_method(cooking_method_list, tf);
        tr.setCallback(new TableRenderer.Callback() {
            @Override

            public void ok(TableRenderer.OutputData data) {
                S1_cookings.to_cooking_lighting_types to = (S1_cookings.to_cooking_lighting_types) cooking_method_list.get(data.selected_row);
                tf_cooking_type.setText(to.cooking_lighting_type);
                tf.setId("" + to.id);
            }
        });
    }
     
     
     
    List<S1_communications.to_communication_types> list2 = new ArrayList();

    private void init_communications() {
        String where = " where communication_type like '%" + tf_communication_type.getText() + "%' order by communication_type asc";
        String[] val = tf_communication_type.getText().split(",");
        list2 = S1_communications.ret_data(where);
        Object[][] obj = new Object[list2.size()][2];
        int i = 0;
        for (S1_communications.to_communication_types to : list2) {
            int exist = 0;
            for (String s : val) {
                if (s.equalsIgnoreCase(to.communication_type)){
                    exist = 1;
                    break;
                }
            }
            obj[i][0] = exist != 0;
            obj[i][1] = " " + to.communication_type;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf_communication_type.getWidth()};
        String[] col_names = {"", ""};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf_communication_type, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {
                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }
                }
                tf_communication_type.setText(values);
            }
        });
    }
//</editor-fold>
    ///end dropdowns////
    ////ADD CONSUMPTION
    /////SELECT CONSUMPTION

    private void select_consumption() {
        int row = tbl_household_consumptions.getSelectedRow();
        if (row < 0) {
            return;
        }
        cons_extension to = (cons_extension) consumption_table_ALM.getElementAt(row);
        int col = tbl_household_consumptions.getSelectedColumn();

        //delete record
        if (col == 4) {
            consumption_table_ALM.remove(row);
            tbl_household_consumptions_M.fireTableDataChanged();

        }

    }

    private void loadData_students(List<ext_consumption.cons_extension> acc) {
        consumption_table_ALM.clear();
        consumption_table_ALM.addAll(acc);
    }

    public void clear_fields() {
        tf_consumption_amount.setText("");
        tf_consumption_basicneeds.setText("");
        tf_hhe_fuel_expenses.setText("");
        tf_hhe_internet_services.setText("");
        tf_hhe_medical_expenses.setText("");
        tf__hhe_hobbies_clubs.setText("");
        tf_hhe_parties_social.setText("");

    }

    private void focus() {
        JTextField[] tf = {tf_consumption_basicneeds, tf_consumption_amount};
        Focus_Fire.onFocus_lostFocus(tf);
        Focus_Fire.select_all(tf);
    }

    ////////      BASIC NEEDS LIST    ////////
    List<Basic_needs.to_basic_needs> basicneeds_list = new ArrayList();

    private void init_basicneeds() {

        String where = " where basic_needs like '%" + tf_consumption_basicneeds.getText() + "%' order by basic_needs asc";
        basicneeds_list.clear();
        basicneeds_list = Basic_needs.ret_data(where);
        Object[][] obj = new Object[basicneeds_list.size()][1];
        int i = 0;
        for (Basic_needs.to_basic_needs to : basicneeds_list) {
            obj[i][0] = " " + to.basic_needs;

            i++;

        }
        JLabel[] labels = {};

        int[] tbl_widths_customers = {tf_consumption_basicneeds.getWidth()};
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf_consumption_basicneeds, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Basic_needs.to_basic_needs to = (Basic_needs.to_basic_needs) basicneeds_list.get(data.selected_row);
                tf_consumption_basicneeds.setText(to.basic_needs);

            }
        });
    }

    private void init_tables() {
        init_tbl_employment_status();

        init_tbl_household_consumptions();
        init_tbl_household_member_educational_background();
        init_tbl_assets();
        data_cols();
        init_tbl_expenditures();

    }

    //houses-------------add edit delete ---------------------------
    /* private void delete_houses() {
     int row = tbl_houses.getSelectedRow();
     if (row < 0) {
     return;
     }
     to_houses to = (to_houses) tbl_houses_ALM.get(tbl_houses.convertRowIndexToModel(row));
     S1_houses.delete_houses(to);
     data_cols();
     clear_houses();
     }
     */
    //------------------------households--------------------------------------------------------------------------//
    // household member educatinal background
    private ArrayListModel tbl_household_member_educational_background_ALM;
    private Tblhousehold_member_educational_backgroundModel tbl_household_member_educational_background_M;

    private void init_tbl_household_member_educational_background() {
        tbl_household_member_educational_background_ALM = new ArrayListModel();
        tbl_household_member_educational_background_M = new Tblhousehold_member_educational_backgroundModel(tbl_household_member_educational_background_ALM);
        jTable6.getTableHeader().setPreferredSize(new Dimension(100, 40));
        jTable6.setModel(tbl_household_member_educational_background_M);
        jTable6.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable6.setRowHeight(25);
        int[] tbl_widths_household_member_educational_background = {100, 100, 100, 50, 50, 0, 0};
        for (int i = 0, n = tbl_widths_household_member_educational_background.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(jTable6, i, tbl_widths_household_member_educational_background[i]);
        }
        Dimension d = jTable6.getTableHeader().getPreferredSize();
        d.height = 30;
        jTable6.getTableHeader().setPreferredSize(d);
        jTable6.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        jTable6.setRowHeight(25);
        jTable6.setFont(new java.awt.Font("Arial", 0, 11));
    }

    private void loadData_household_member_educational_background(List<to_household_member_educational_background> acc) {
        tbl_household_member_educational_background_ALM.clear();
        tbl_household_member_educational_background_ALM.addAll(acc);
    }

    public static class Tblhousehold_member_educational_backgroundModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Achievement", "School", "Year", "", "", "year", "achievements"
        };

        public Tblhousehold_member_educational_backgroundModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

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
            to_household_member_educational_background tt = (to_household_member_educational_background) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.achievements;
                case 1:
                    return " " + tt.name_of_school;
                case 2:
                    return " " + tt.year;
                case 3:
                    return " Update";
                case 4:
                    return " Delete";
                case 5:
                    return tt.year;
                default:
                    return tt.achievements;
            }
        }
    }

    private void add_ed_background() {
        int id = 0;
        String educational_status = tf_fm_educational_status2.getText();
        int household_member_id = 1; //noted
        String name_of_school = tf_fm_name_of_school2.getText();
        String highest_grade_cotmputed = tf_fm_highest_grade_computed2.getText();
        String year = jTextField9.getText();
        String achievements = tf_fm_achievements2.getText();

        to_household_member_educational_background to = new to_household_member_educational_background(id, educational_status, household_member_id, name_of_school, highest_grade_cotmputed, year, achievements);
        tbl_household_member_educational_background_ALM.add(to);
        tbl_household_member_educational_background_M.fireTableDataChanged();
    }

    private void select_ed_background() {
        int row = jTable6.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = jTable6.getSelectedColumn();
        to_household_member_educational_background to = (to_household_member_educational_background) tbl_household_member_educational_background_ALM.get(row);
        if (col == 3) {
            String educational_status = tf_fm_educational_status2.getText();
            int household_member_id = 1; //noted
            String name_of_school = tf_fm_name_of_school2.getText();
            String highest_grade_cotmputed = tf_fm_highest_grade_computed2.getText();
            String year = jTextField9.getText();
            String achievements = tf_fm_achievements2.getText();
            to.setAchievements(achievements);
            to.setEducational_status(educational_status);
            to.setHighest_grade_computed(highest_grade_cotmputed);
            to.setHousehold_member_id(household_member_id);
            to.setName_of_school(name_of_school);
            to.setYear(year);
            tbl_household_member_educational_background_M.fireTableDataChanged();

        } else if (col == 4) {
            tbl_household_member_educational_background_ALM.remove(row);
            tbl_household_member_educational_background_M.fireTableDataChanged();
        } else {
            tf_fm_educational_status2.setText(to.educational_status);
            tf_fm_name_of_school2.setText(to.name_of_school);
            tf_fm_achievements2.setText(to.achievements);
            tf_fm_highest_grade_computed2.setText(to.highest_grade_computed);
            jTextField9.setText(to.year);

        }
    }
    List<S1_year.years> item_list = new ArrayList();

    private void init_years() {

        item_list.clear();
        item_list = S1_year.ret_items();
        Object[][] obj = new Object[item_list.size()][1];
        int i = 0;
        for (S1_year.years to : item_list) {
            obj[i][0] = " " + to.years_list;
            cb_years.addItem(to.years_list);
            i++;

        }

    }

    private void init_tf_icons() {
//        JXTextField tf_1 = (JXTextField) tf_barangay;
//        JXTextField tf_2 = (JXTextField) tf_building_type;
//        JXTextField tf_3 = (JXTextField) tf_toilet_type;
//        JXTextField tf_4 = (JXTextField) tf_bathroom_type;
//        JXTextField tf_5 = (JXTextField) tf_disposal_method;
//        JXTextField tf_6 = (JXTextField) tf_kitchen_type;
//        JXTextField tf_7 = (JXTextField) tf_transportation_type;
//        JXTextField tf_8 = (JXTextField) tf_roof_type;
//        JXTextField tf_9 = (JXTextField) tf_wall_type;
//        JXTextField tf_10 = (JXTextField) tf_floor_type;
//        JXTextField tf_11 = (JXTextField) tf_communication_type;
//        JXTextField tf_12 = (JXTextField) tf_lighting_type;
//        JXTextField tf_13 = (JXTextField) tf_cooking_type;
//        JXTextField tf_14 = (JXTextField) tf_source_of_water;
//
//        tf_1.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_2.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_3.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_4.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_5.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_6.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_7.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_8.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_9.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_10.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_11.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_12.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_13.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
//        tf_14.addBuddy(MyIcon.arrow_down(), BuddySupport.Position.RIGHT);
    }

    // table assets-----------
    private ArrayListModel tbl_assets_ALM;
    private TblassetsModel tbl_assets_M;

    private void init_tbl_assets() {
        tbl_assets_ALM = new ArrayListModel();
        tbl_assets_M = new TblassetsModel(tbl_assets_ALM);
        tbl_assets.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_assets.setModel(tbl_assets_M);
        tbl_assets.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_assets.setRowHeight(25);
        int[] tbl_widths_assets = {200, 40};
        for (int i = 0, n = tbl_widths_assets.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_assets, i, tbl_widths_assets[i]);
        }
        Dimension d = tbl_assets.getTableHeader().getPreferredSize();
        d.height = 30;
        tbl_assets.getTableHeader().setPreferredSize(d);
        tbl_assets.getTableHeader().setFont(new java.awt.Font("Arial", Font.BOLD, 12));
        tbl_assets.setRowHeight(35);
        tbl_assets.setFont(new java.awt.Font("Arial", 0, 12));
    }

    private void loadData_assets(List<to_assets> acc) {
        tbl_assets_ALM.clear();
        tbl_assets_ALM.addAll(acc);
    }

    public static class TblassetsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            " Select Assets", " "
        };

        public TblassetsModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            to_assets tt = (to_assets) getRow(row);
            switch (col) {
                case 0:
                    return tt.asset;
                default:
                    return tt.selected;
            }
        }
    }

    private void data_cols() {
        String where = "";
        loadData_assets(Assets.ret_data(where));
    }

    private void select_asset() {
        int row = tbl_assets.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_assets.getSelectedColumn();
        if (col == 1) {
            to_assets to = (to_assets) tbl_assets_ALM.get(row);
            if (to.selected == true) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_assets_M.fireTableDataChanged();
        }

    }

    private ArrayListModel expenditures_table_ALM;
    private expenditures_tblModel tbl_expenditures_M;

    private void init_tbl_expenditures() {
        expenditures_table_ALM = new ArrayListModel();
        tbl_expenditures_M = new expenditures_tblModel(expenditures_table_ALM);
        tbl_expenditures.getTableHeader().setPreferredSize(new Dimension(100, 40));
        tbl_expenditures.setModel(tbl_expenditures_M);
        tbl_expenditures.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_expenditures.setRowHeight(25);
        int[] tbl_widths_students = {100, 100, 50, 50};
        for (int i = 0, n = tbl_widths_students.length; i < n; i++) {
            if (i == 0) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_expenditures, i, tbl_widths_students[i]);
        }
        Dimension d = tbl_expenditures.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_expenditures.getTableHeader().setPreferredSize(d);
        tbl_expenditures.getTableHeader().setFont(new java.awt.Font("Arial", 0, 11));
        tbl_expenditures.setRowHeight(25);
        tbl_expenditures.setFont(new java.awt.Font("Arial", 0, 11));
    }

    public static class expenditures_tblModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Month", "Total", "Update ", "Delete "
        };

        public expenditures_tblModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {

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
            exp_extension tt = (exp_extension) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.month;
                case 1:
                    return " " + tt.total;
                case 2:
                    return " Update";
                default:
                    return " Delete";
            }
        }
    }

    private void compute_expenditures() {
        List<exp_extension> datas = expenditures_table_ALM;
        double total = 0;
        for (exp_extension to : datas) {
            total += to.total;
        }

        l_total_expenditures.setText(FitIn.fmt_wc(total));
    }

    public void add_expenditures() {
        //   int expenditures_year = yc_expenditures_year.getYear();

        int expenditures_month = mc_expenditures_month.getMonth() + 1;
        double fuel_expenses = FitIn.toDouble(tf_hhe_fuel_expenses.getText());
        double internet_services = FitIn.toDouble(tf_hhe_internet_services.getText());
        double medical_expenses = FitIn.toDouble(tf_hhe_medical_expenses.getText());
        double cigarettes_tobacco = FitIn.toDouble(tf_hhe_cigarettes_tobacco.getText());
        double hobbies_clubs = FitIn.toDouble(tf__hhe_hobbies_clubs.getText());
        double parties_social = FitIn.toDouble(tf_hhe_parties_social.getText());
        double load_expenses = FitIn.toDouble(tf_hhe_load_expenses.getText());
        double electric_gas_oil = FitIn.toDouble(tf_hhe_electric_gas_oil.getText());
        double gambling = FitIn.toDouble(tf_hhe_gambling.getText());
        double personal_care = FitIn.toDouble(tf_hhe_personal_care.getText());
        double cable_services = FitIn.toDouble(tf_hhe_cable_services.getText());
        double water_bills = FitIn.toDouble(tf_hhe_water_bills.getText());
        double vacations_travel = FitIn.toDouble(tf_hhe_vacations_travel.getText());
        double alcohol = FitIn.toDouble(tf_hhe_alcohol.getText());
        double misc = FitIn.toDouble(tf_hhe_misc.getText());
        double books_newspaper = FitIn.toDouble(tf_hhe_books_newspaper.getText());
        String household_id = "Ex1";
        String house_id = "Ex_houseno1";
        double total = fuel_expenses + internet_services + medical_expenses + cigarettes_tobacco + hobbies_clubs + parties_social + load_expenses
                + electric_gas_oil + gambling + personal_care + cable_services + water_bills + vacations_travel + alcohol + misc + books_newspaper;
        //to_expenditures_info to = new to_expenditures_info(household_id,house_id,books_newspaper,expenditures_year,expenditures_month,total,fuel_expenses,internet_services,medical_expenses,cigarettes_tobacco,hobbies_clubs,parties_social,load_expenses,electric_gas_oil,gambling,personal_care,cable_services,water_bills,vacations_travel,alcohol,misc);

        expenditures_add_record(total, expenditures_month);

    }

    private void expenditures_add_record(double total, int expenditures_month) {
        String month_string;
        if (expenditures_month == 1) {
            month_string = "January";
        } else if (expenditures_month == 2) {
            month_string = "February";
        } else if (expenditures_month == 3) {
            month_string = "March";
        } else if (expenditures_month == 4) {
            month_string = "April";
        } else if (expenditures_month == 5) {
            month_string = "May";
        } else if (expenditures_month == 6) {
            month_string = "June";
        } else if (expenditures_month == 7) {
            month_string = "July";
        } else if (expenditures_month == 8) {
            month_string = "August";
        } else if (expenditures_month == 9) {
            month_string = "September";
        } else if (expenditures_month == 10) {
            month_string = "October";
        } else if (expenditures_month == 11) {
            month_string = "November";
        } else {
            month_string = "December";
        }
        String month = month_string;
        double sum = total;

        exp_extension to = new exp_extension(sum, month);
        expenditures_table_ALM.add(to);
        tbl_expenditures_M.fireTableDataChanged();

        compute_expenditures();
        //    tf_expenditure_basicneeds.grabFocus();

    }

    /////SELECT CONSUMPTION
    private void expenditures_select() {
        int row = tbl_expenditures.getSelectedRow();
        if (row < 0) {
            return;
        }
        exp_extension to = (exp_extension) expenditures_table_ALM.getElementAt(row);
        int col = tbl_expenditures.getSelectedColumn();

         //update record
         /*if (col == 3) {

         int year_date = yc_year_consumption.getYear();
         String basic_need = tf_consumption_basicneeds.getText();
         double amount = FitIn.toDouble(tf_consumption_amount.getText());

         to.setYear_date(year_date);
         to.setBasic_need(basic_need);
         to.setAmount(amount);

         tbl_consumption_M.fireTableDataChanged();
         clear_fields();
          
         }*/
        //delete record
        if (col == 3) {
            expenditures_table_ALM.remove(row);
            tbl_expenditures_M.fireTableDataChanged();

        }

    }

    private void add_consumption(String basic_needs, double amount) {
        String month_string;
        int consumption_month = cb_consumption_month.getMonth() + 1;
        if (consumption_month == 1) {
            month_string = "January";
        } else if (consumption_month == 2) {
            month_string = "February";
        } else if (consumption_month == 3) {
            month_string = "March";
        } else if (consumption_month == 4) {
            month_string = "April";
        } else if (consumption_month == 5) {
            month_string = "May";
        } else if (consumption_month == 6) {
            month_string = "June";
        } else if (consumption_month == 7) {
            month_string = "July";
        } else if (consumption_month == 8) {
            month_string = "August";
        } else if (consumption_month == 9) {
            month_string = "September";
        } else if (consumption_month == 10) {
            month_string = "October";
        } else if (consumption_month == 11) {
            month_string = "November";
        } else {
            month_string = "December";
        }

        String basic_need = basic_needs;
        double consumption_amount = amount;

        cons_extension to = new cons_extension(month_string, basic_needs, amount);
        consumption_table_ALM.add(to);
        tbl_household_consumptions_M.fireTableDataChanged();
        clear_fields();
    }

    private void add_record_consumption() {

        String basic_need = tf_consumption_basicneeds.getText();
        double amount = FitIn.toDouble(tf_consumption_amount.getText());
        add_consumption(basic_need, amount);

    }

}
