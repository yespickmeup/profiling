/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import cp.dropdowns.Barangays;
import cp.dropdowns.Bathrooms;
import cp.dropdowns.Buildings;
import cp.dropdowns.Communications;
import cp.dropdowns.Disabilities;
import cp.dropdowns.Disposal_methods;
import cp.dropdowns.Floors;
import cp.dropdowns.Genders;
import cp.dropdowns.Items;
import cp.dropdowns.Kitchens;
import cp.dropdowns.Lightings;
import cp.dropdowns.Maritals;
import cp.dropdowns.Roofs;
import cp.dropdowns.Months;
import cp.dropdowns.Relations;
import cp.dropdowns.Religions;
import cp.dropdowns.Toilets;
import cp.dropdowns.Transportations;
import cp.dropdowns.Walls;
import cp.dropdowns.Water_sources;
import cp.dropdowns.Years;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import javax.swing.JButton;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.fields.Label;
import synsoftech.util.Center;

/**
 *
 * @author Guinness
 */
public class Dlg_city_planning extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_city_planning
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
    private Dlg_city_planning(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_city_planning(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_city_planning() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_city_planning myRef;

    private void setThisRef(Dlg_city_planning myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_city_planning> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_city_planning create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_city_planning create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_city_planning dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_city_planning((java.awt.Frame) parent, false);
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
            Dlg_city_planning dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_city_planning((java.awt.Dialog) parent, false);
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

        Dlg_city_planning dialog = Dlg_city_planning.create(new javax.swing.JFrame(), true);
        Center.setCenter(dialog);
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
        pnl_holder = new javax.swing.JPanel();
        pnl_one = new javax.swing.JPanel();
        pnl_Basicnfo1 = new javax.swing.JPanel();
        jLabel24 = new Label.Separator2();
        lbl_basic_Information1 = new javax.swing.JLabel();
        lbl_house_number1 = new javax.swing.JLabel();
        lbl_barangay1 = new javax.swing.JLabel();
        lbl_purok1 = new javax.swing.JLabel();
        tf_house_number1 = new Field.Input();
        tf_barangays = new Field.Combo();
        tf_purk1 = new Field.Input();
        jLabel23 = new javax.swing.JLabel();
        tf_street1 = new Field.Input();
        lbl_house_condition2 = new javax.swing.JLabel();
        lbl_no_rooms1 = new javax.swing.JLabel();
        tf_no_rooms1 = new Field.Input();
        lbl_facilities2 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        tf_buildings = new Field.Combo();
        jLabel152 = new javax.swing.JLabel();
        tf_toilets = new Field.Combo();
        jLabel194 = new javax.swing.JLabel();
        tf_compartments = new Field.Combo();
        jLabel195 = new javax.swing.JLabel();
        tf_bathrooms = new Field.Combo();
        lbl_facilities3 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        tf_roofs = new Field.Combo();
        jLabel197 = new javax.swing.JLabel();
        tf_walls = new Field.Combo();
        jLabel198 = new javax.swing.JLabel();
        tf_floors = new Field.Combo();
        jLabel199 = new javax.swing.JLabel();
        jTextField110 = new Field.Combo();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        tf_disposals = new Field.Combo();
        jLabel202 = new javax.swing.JLabel();
        tf_kitchens = new Field.Combo();
        jLabel205 = new javax.swing.JLabel();
        tf_communications = new Field.Combo();
        pnl_twoA1 = new javax.swing.JPanel();
        jButton23 = new Button.Primary();
        jButton44 = new Button.Default();
        jLabel213 = new Label.Separator2();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        tf_transportations = new Field.Combo();
        jLabel216 = new javax.swing.JLabel();
        tf_compartments1 = new Field.Input();
        pnl_Basicinfo2 = new javax.swing.JPanel();
        lbl_house_condition3 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        tf_lighting = new Field.Combo();
        jLabel208 = new javax.swing.JLabel();
        tf_water_sources = new Field.Combo();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jTextField117 = new Field.Input();
        jLabel211 = new javax.swing.JLabel();
        tf_cookings = new Field.Combo();
        jLabel212 = new javax.swing.JLabel();
        jTextField119 = new Field.Input();
        pnl_twoA2 = new javax.swing.JPanel();
        jButton31 = new Button.Primary();
        jButton45 = new Button.Default();
        jLabel217 = new Label.Separator2();
        pnl_two = new javax.swing.JPanel();
        pnl_twoA = new javax.swing.JPanel();
        jButton9 = new Button.Primary();
        jButton10 = new Button.Default();
        jLabel7 = new Label.Separator2();
        jLabel44 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField16 = new Field.Input();
        jButton8 = new Button.Success();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel47 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jTextField17 = new Field.Input();
        jLabel49 = new javax.swing.JLabel();
        jTextField18 = new Field.Input();
        jLabel50 = new Label.Separator2();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_three = new javax.swing.JPanel();
        pnl_consumption2 = new javax.swing.JPanel();
        pnl_twoA3 = new javax.swing.JPanel();
        jLabel215 = new Label.Separator2();
        jButton57 = new Button.Default();
        jButton32 = new Button.Primary();
        jLabel5 = new javax.swing.JLabel();
        tf_years = new Field.Combo();
        jLabel54 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        tf_months = new Field.Combo();
        jLabel150 = new javax.swing.JLabel();
        tf_items = new Field.Combo();
        jLabel214 = new javax.swing.JLabel();
        jTextField122 = new Field.Input();
        jButton56 = new Button.Success();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        pnl_consumption1 = new javax.swing.JPanel();
        pnl_twoA5 = new javax.swing.JPanel();
        jButton34 = new Button.Primary();
        jButton59 = new Button.Default();
        jLabel219 = new Label.Separator2();
        jLabel59 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        tf_months1 = new Field.Combo();
        jLabel60 = new javax.swing.JLabel();
        jTextField24 = new Field.Input();
        jLabel61 = new javax.swing.JLabel();
        jTextField25 = new Field.Input();
        jLabel62 = new javax.swing.JLabel();
        jTextField26 = new Field.Input();
        jLabel63 = new javax.swing.JLabel();
        jTextField27 = new Field.Input();
        jLabel64 = new javax.swing.JLabel();
        jTextField28 = new Field.Input();
        jLabel76 = new javax.swing.JLabel();
        jTextField29 = new Field.Input();
        jLabel66 = new javax.swing.JLabel();
        jTextField30 = new Field.Input();
        jLabel67 = new javax.swing.JLabel();
        jTextField31 = new Field.Input();
        jLabel68 = new javax.swing.JLabel();
        jTextField32 = new Field.Input();
        jLabel69 = new javax.swing.JLabel();
        jTextField33 = new Field.Input();
        jLabel70 = new javax.swing.JLabel();
        jTextField34 = new Field.Input();
        jLabel71 = new javax.swing.JLabel();
        jTextField35 = new Field.Input();
        jLabel72 = new javax.swing.JLabel();
        jTextField36 = new Field.Input();
        jLabel73 = new javax.swing.JLabel();
        jTextField37 = new Field.Input();
        jLabel74 = new javax.swing.JLabel();
        jTextField38 = new Field.Input();
        jLabel75 = new javax.swing.JLabel();
        jTextField39 = new Field.Input();
        jButton36 = new Button.Success();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jLabel218 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new Label.Separator2();
        pnl_four = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton13 = new Button.Primary();
        jButton14 = new Button.Default();
        jLabel9 = new Label.Separator2();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        pnl_five = new javax.swing.JPanel();
        pnl_services1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton19 = new Button.Primary();
        jButton20 = new Button.Default();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jCheckBox144 = new javax.swing.JCheckBox();
        jCheckBox145 = new javax.swing.JCheckBox();
        jCheckBox146 = new javax.swing.JCheckBox();
        jCheckBox147 = new javax.swing.JCheckBox();
        jCheckBox148 = new javax.swing.JCheckBox();
        jCheckBox149 = new javax.swing.JCheckBox();
        jCheckBox150 = new javax.swing.JCheckBox();
        jCheckBox151 = new javax.swing.JCheckBox();
        jCheckBox152 = new javax.swing.JCheckBox();
        jCheckBox153 = new javax.swing.JCheckBox();
        jCheckBox154 = new javax.swing.JCheckBox();
        jCheckBox155 = new javax.swing.JCheckBox();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jCheckBox156 = new javax.swing.JCheckBox();
        jCheckBox157 = new javax.swing.JCheckBox();
        jCheckBox158 = new javax.swing.JCheckBox();
        jCheckBox159 = new javax.swing.JCheckBox();
        jCheckBox160 = new javax.swing.JCheckBox();
        jCheckBox161 = new javax.swing.JCheckBox();
        jCheckBox162 = new javax.swing.JCheckBox();
        jCheckBox163 = new javax.swing.JCheckBox();
        jCheckBox164 = new javax.swing.JCheckBox();
        jCheckBox165 = new javax.swing.JCheckBox();
        jCheckBox166 = new javax.swing.JCheckBox();
        jCheckBox167 = new javax.swing.JCheckBox();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jCheckBox168 = new javax.swing.JCheckBox();
        jCheckBox169 = new javax.swing.JCheckBox();
        jCheckBox170 = new javax.swing.JCheckBox();
        jCheckBox171 = new javax.swing.JCheckBox();
        jCheckBox172 = new javax.swing.JCheckBox();
        jCheckBox173 = new javax.swing.JCheckBox();
        jCheckBox174 = new javax.swing.JCheckBox();
        jCheckBox175 = new javax.swing.JCheckBox();
        jCheckBox176 = new javax.swing.JCheckBox();
        jCheckBox177 = new javax.swing.JCheckBox();
        jCheckBox178 = new javax.swing.JCheckBox();
        jCheckBox179 = new javax.swing.JCheckBox();
        jCheckBox180 = new javax.swing.JCheckBox();
        jCheckBox181 = new javax.swing.JCheckBox();
        jCheckBox182 = new javax.swing.JCheckBox();
        jCheckBox183 = new javax.swing.JCheckBox();
        jCheckBox184 = new javax.swing.JCheckBox();
        jCheckBox185 = new javax.swing.JCheckBox();
        jCheckBox186 = new javax.swing.JCheckBox();
        jCheckBox187 = new javax.swing.JCheckBox();
        jCheckBox188 = new javax.swing.JCheckBox();
        jCheckBox189 = new javax.swing.JCheckBox();
        jCheckBox190 = new javax.swing.JCheckBox();
        jCheckBox191 = new javax.swing.JCheckBox();
        jLabel11 = new Label.Separator2();
        pnl_services2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton33 = new Button.Primary();
        jButton35 = new Button.Default();
        jLabel22 = new Label.Separator2();
        jLabel232 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton58 = new Button.Info();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnl_six = new javax.swing.JPanel();
        pnl_housemember1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton21 = new Button.Primary();
        jButton22 = new Button.Default();
        jLabel13 = new Label.Separator2();
        jLabel99 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField40 = new Field.Input();
        jLabel100 = new javax.swing.JLabel();
        tf_genders = new Field.Combo();
        jLabel103 = new javax.swing.JLabel();
        jTextField46 = new Field.Input();
        jLabel106 = new javax.swing.JLabel();
        jTextField49 = new Field.Input();
        jLabel109 = new javax.swing.JLabel();
        jTextField52 = new Field.Input();
        jLabel111 = new javax.swing.JLabel();
        jTextField54 = new Field.Input();
        jLabel112 = new javax.swing.JLabel();
        tf_religions = new Field.Combo();
        jTextField41 = new Field.Input();
        jLabel101 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        tf_maritals = new Field.Combo();
        jLabel107 = new javax.swing.JLabel();
        tf_relations = new Field.Combo();
        jTextField42 = new Field.Input();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jTextField45 = new Field.Input();
        jTextField48 = new Field.Input();
        jTextField51 = new Field.Input();
        jTextField53 = new Field.Input();
        jTextField57 = new Field.Input();
        jLabel115 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jTextField123 = new Field.Input();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jLabel119 = new javax.swing.JLabel();
        jCheckBox85 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        jLabel121 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        tf_disabilities = new Field.Combo();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jTextField60 = new Field.Input();
        jTextField61 = new Field.Input();
        jButton37 = new Button.Success();
        jTextField59 = new Field.Input();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel26 = new Label.Separator2();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel113 = new javax.swing.JLabel();
        tf_religions1 = new Field.Combo();
        jCheckBox28 = new javax.swing.JCheckBox();
        jLabel116 = new javax.swing.JLabel();
        jTextField55 = new Field.Input();
        pnl_housemember2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton60 = new Button.Primary();
        jButton61 = new Button.Default();
        jLabel25 = new Label.Separator2();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextField62 = new Field.Input();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jTextField65 = new Field.Input();
        jLabel129 = new javax.swing.JLabel();
        jButton38 = new Button.Success();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        pnl_housemember3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton62 = new Button.Primary();
        jButton63 = new Button.Default();
        jLabel27 = new Label.Separator2();
        jLabel28 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jTextField124 = new Field.Input();
        jLabel234 = new javax.swing.JLabel();
        jTextField125 = new Field.Input();
        jLabel235 = new javax.swing.JLabel();
        jTextField126 = new Field.Input();
        jLabel236 = new javax.swing.JLabel();
        jTextField127 = new Field.Input();
        tf_year_graduated = new Field.Input();
        jLabel237 = new javax.swing.JLabel();
        jButton64 = new Button.Success();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jTextField71 = new Field.Input();
        jLabel141 = new javax.swing.JLabel();
        jTextField74 = new Field.Input();
        jTextField75 = new Field.Input();
        jButton42 = new Button.Success();
        jLabel142 = new javax.swing.JLabel();
        jTextField72 = new Field.Input();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jTextField73 = new Field.Input();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        pnl_housemember4 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jButton75 = new Button.Primary();
        jButton76 = new Button.Default();
        jLabel34 = new Label.Separator2();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jTextField76 = new Field.Input();
        jLabel146 = new javax.swing.JLabel();
        jTextField77 = new Field.Input();
        jLabel147 = new javax.swing.JLabel();
        jTextField78 = new Field.Input();
        jLabel148 = new javax.swing.JLabel();
        jButton43 = new Button.Success();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable18 = new javax.swing.JTable();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        pnl_housemember5 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton77 = new Button.Primary();
        jButton78 = new Button.Default();
        jLabel35 = new Label.Separator2();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jTextField86 = new Field.Input();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel164 = new javax.swing.JLabel();
        jButton24 = new Button.Success();
        jLabel192 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jTextField101 = new Field.Input();
        jLabel247 = new javax.swing.JLabel();
        jTextField135 = new Field.Input();
        jLabel248 = new javax.swing.JLabel();
        jTextField136 = new Field.Input();
        jLabel249 = new javax.swing.JLabel();
        jTextField137 = new Field.Input();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jButton25 = new Button.Success();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable19 = new javax.swing.JTable();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        pnl_housemember6 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jButton79 = new Button.Primary();
        jButton82 = new Button.Default();
        jLabel37 = new Label.Separator2();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jTextField129 = new Field.Input();
        jButton65 = new Button.Success();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        pnl_housemember7 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton80 = new Button.Primary();
        jButton81 = new Button.Default();
        jLabel36 = new Label.Separator2();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jCheckBox192 = new javax.swing.JCheckBox();
        jCheckBox193 = new javax.swing.JCheckBox();
        jCheckBox194 = new javax.swing.JCheckBox();
        jCheckBox195 = new javax.swing.JCheckBox();
        jCheckBox196 = new javax.swing.JCheckBox();
        jCheckBox197 = new javax.swing.JCheckBox();
        jCheckBox198 = new javax.swing.JCheckBox();
        jCheckBox199 = new javax.swing.JCheckBox();
        jCheckBox200 = new javax.swing.JCheckBox();
        jCheckBox201 = new javax.swing.JCheckBox();
        jCheckBox202 = new javax.swing.JCheckBox();
        jCheckBox203 = new javax.swing.JCheckBox();
        jLabel255 = new javax.swing.JLabel();
        jCheckBox204 = new javax.swing.JCheckBox();
        jCheckBox205 = new javax.swing.JCheckBox();
        jCheckBox206 = new javax.swing.JCheckBox();
        jCheckBox207 = new javax.swing.JCheckBox();
        jCheckBox208 = new javax.swing.JCheckBox();
        jCheckBox209 = new javax.swing.JCheckBox();
        jCheckBox210 = new javax.swing.JCheckBox();
        jCheckBox211 = new javax.swing.JCheckBox();
        jCheckBox212 = new javax.swing.JCheckBox();
        jCheckBox213 = new javax.swing.JCheckBox();
        jCheckBox214 = new javax.swing.JCheckBox();
        jCheckBox215 = new javax.swing.JCheckBox();
        jCheckBox216 = new javax.swing.JCheckBox();
        jCheckBox217 = new javax.swing.JCheckBox();
        jLabel256 = new javax.swing.JLabel();
        jCheckBox218 = new javax.swing.JCheckBox();
        jCheckBox219 = new javax.swing.JCheckBox();
        jCheckBox220 = new javax.swing.JCheckBox();
        jCheckBox221 = new javax.swing.JCheckBox();
        jCheckBox222 = new javax.swing.JCheckBox();
        jCheckBox223 = new javax.swing.JCheckBox();
        jCheckBox224 = new javax.swing.JCheckBox();
        jCheckBox225 = new javax.swing.JCheckBox();
        jCheckBox226 = new javax.swing.JCheckBox();
        jCheckBox227 = new javax.swing.JCheckBox();
        jCheckBox228 = new javax.swing.JCheckBox();
        jCheckBox229 = new javax.swing.JCheckBox();
        jCheckBox230 = new javax.swing.JCheckBox();
        jCheckBox231 = new javax.swing.JCheckBox();
        jCheckBox232 = new javax.swing.JCheckBox();
        jLabel257 = new javax.swing.JLabel();
        jCheckBox233 = new javax.swing.JCheckBox();
        jCheckBox234 = new javax.swing.JCheckBox();
        jCheckBox235 = new javax.swing.JCheckBox();
        jCheckBox236 = new javax.swing.JCheckBox();
        jCheckBox237 = new javax.swing.JCheckBox();
        jCheckBox238 = new javax.swing.JCheckBox();
        jCheckBox239 = new javax.swing.JCheckBox();
        jCheckBox240 = new javax.swing.JCheckBox();
        jCheckBox241 = new javax.swing.JCheckBox();
        jCheckBox242 = new javax.swing.JCheckBox();
        jCheckBox243 = new javax.swing.JCheckBox();
        jCheckBox244 = new javax.swing.JCheckBox();
        jCheckBox245 = new javax.swing.JCheckBox();
        pnl_housemember8 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jButton83 = new Button.Primary();
        jButton84 = new Button.Default();
        jLabel38 = new Label.Separator2();
        jLabel1 = new javax.swing.JLabel();
        jTextField130 = new Field.Input();
        jButton66 = new Button.Success();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        pnl_housemember9 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jButton85 = new Button.Primary();
        jButton86 = new Button.Default();
        jLabel39 = new Label.Separator2();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        cb_status_employed1 = new javax.swing.JCheckBox();
        cb_employment_worker1 = new javax.swing.JRadioButton();
        cb_employment_employee1 = new javax.swing.JRadioButton();
        cb_employment_self_employed1 = new javax.swing.JRadioButton();
        cb_employment_director1 = new javax.swing.JRadioButton();
        cb_employment_office_holder1 = new javax.swing.JRadioButton();
        cb_employment_ofw1 = new javax.swing.JRadioButton();
        cb_status_unemployed1 = new javax.swing.JCheckBox();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jTextField100 = new Field.Input();
        jCheckBox246 = new javax.swing.JCheckBox();
        jTextField131 = new Field.Input();
        jTextField132 = new Field.Input();
        jLabel242 = new javax.swing.JLabel();
        jTextField133 = new Field.Input();
        jButton55 = new Button.Default();
        jButton67 = new Button.Warning();
        jButton68 = new Button.Info();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        pnl_housemember10 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton87 = new Button.Primary();
        jButton88 = new Button.Default();
        jLabel40 = new Label.Separator2();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jTextField134 = new Field.Input();
        jTextField140 = new Field.Input();
        jTextField141 = new Field.Input();
        jTextField142 = new Field.Input();
        jTextField143 = new Field.Input();
        jTextField144 = new Field.Input();
        jTextField145 = new Field.Input();
        jLabel262 = new javax.swing.JLabel();
        jCheckBox247 = new javax.swing.JCheckBox();
        jCheckBox248 = new javax.swing.JCheckBox();
        jLabel263 = new javax.swing.JLabel();
        jTextField146 = new Field.Input();
        jLabel41 = new Label.Separator2();
        pnl_housemember11 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jButton89 = new Button.Success();
        jButton90 = new Button.Default();
        jLabel42 = new Label.Separator2();
        jLabel29 = new javax.swing.JLabel();
        jButton69 = new Button.Default();
        jButton70 = new Button.Info();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        pnl_holder.setBackground(new java.awt.Color(255, 255, 255));
        pnl_holder.setLayout(new java.awt.CardLayout());

        pnl_one.setBackground(new java.awt.Color(255, 255, 255));
        pnl_one.setLayout(new java.awt.CardLayout());

        pnl_Basicnfo1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_basic_Information1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_basic_Information1.setText("HOUSE BASIC INFORMATION");

        lbl_house_number1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_house_number1.setText("House Number:");

        lbl_barangay1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_barangay1.setText("Barangay:");

        lbl_purok1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_purok1.setText("Purok:");

        tf_house_number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_house_number1ActionPerformed(evt);
            }
        });

        tf_barangays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangaysMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("Street:");

        lbl_house_condition2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_house_condition2.setText("HOUSE CONDITION (A)");

        lbl_no_rooms1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_no_rooms1.setText("No. of rooms  used for sleeping:");

        lbl_facilities2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_facilities2.setText("[FACILITIES]");

        jLabel151.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel151.setText("Bulding Type:");

        tf_buildings.setNextFocusableComponent(tf_roofs);
        tf_buildings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_buildingsMouseClicked(evt);
            }
        });
        tf_buildings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buildingsActionPerformed(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel152.setText("Toilet Type:");

        tf_toilets.setNextFocusableComponent(tf_compartments);
        tf_toilets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_toiletsMouseClicked(evt);
            }
        });

        jLabel194.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel194.setText("Bldg. Permit:");

        tf_compartments.setNextFocusableComponent(tf_bathrooms);

        jLabel195.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel195.setText("Bathroom Type:");

        tf_bathrooms.setNextFocusableComponent(tf_disposals);
        tf_bathrooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_bathroomsMouseClicked(evt);
            }
        });

        lbl_facilities3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_facilities3.setText("[TYPE OF MATERIAL USED IN CONSTRUCTION]");

        jLabel196.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel196.setText("Roof:");

        tf_roofs.setNextFocusableComponent(tf_walls);
        tf_roofs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_roofsMouseClicked(evt);
            }
        });

        jLabel197.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel197.setText("Wall:");

        tf_walls.setNextFocusableComponent(tf_floors);
        tf_walls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_wallsMouseClicked(evt);
            }
        });

        jLabel198.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel198.setText("Floor:");

        tf_floors.setNextFocusableComponent(tf_toilets);
        tf_floors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_floorsMouseClicked(evt);
            }
        });

        jLabel199.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel199.setText("Bathroom Type:");

        jLabel200.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel200.setText("Common Method");

        jLabel201.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel201.setText("of Waste Disposal:");

        tf_disposals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_disposalsMouseClicked(evt);
            }
        });

        jLabel202.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel202.setText("Kitchen Type:");

        tf_kitchens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_kitchensMouseClicked(evt);
            }
        });

        jLabel205.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel205.setText("Communication/s:");

        tf_communications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_communicationsMouseClicked(evt);
            }
        });

        pnl_twoA1.setBackground(new java.awt.Color(255, 255, 255));

        jButton23.setText("Next");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton44.setText("Back");
        jButton44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_twoA1Layout = new javax.swing.GroupLayout(pnl_twoA1);
        pnl_twoA1.setLayout(pnl_twoA1Layout);
        pnl_twoA1Layout.setHorizontalGroup(
            pnl_twoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoA1Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(pnl_twoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA1Layout.createSequentialGroup()
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA1Layout.createSequentialGroup()
                        .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnl_twoA1Layout.setVerticalGroup(
            pnl_twoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnl_twoA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel203.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel203.setText("Transportation");

        jLabel204.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel204.setText("Available:");

        tf_transportations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_transportationsMouseClicked(evt);
            }
        });

        jLabel216.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel216.setText("Compartments");

        tf_compartments1.setNextFocusableComponent(tf_bathrooms);

        javax.swing.GroupLayout pnl_Basicnfo1Layout = new javax.swing.GroupLayout(pnl_Basicnfo1);
        pnl_Basicnfo1.setLayout(pnl_Basicnfo1Layout);
        pnl_Basicnfo1Layout.setHorizontalGroup(
            pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_twoA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_house_condition2)
                            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                .addGap(385, 385, 385)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_basic_Information1))
                        .addContainerGap(266, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addComponent(jLabel202)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel203)
                                                    .addComponent(jLabel204))
                                                .addGap(5, 5, 5)))
                                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_transportations, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_kitchens, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jLabel195))
                                                    .addComponent(jLabel199, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel200)
                                                        .addComponent(jLabel201)))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_disposals, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tf_bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                    .addGap(88, 88, 88)
                                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                                            .addComponent(jLabel151)
                                                            .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                                            .addComponent(jLabel152)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(tf_toilets, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(10, 10, 10)
                                                            .addComponent(jLabel216)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tf_compartments, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_no_rooms1)
                                                        .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                                            .addGap(43, 43, 43)
                                                            .addComponent(lbl_facilities2)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                            .addComponent(tf_buildings)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(tf_compartments1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(tf_no_rooms1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(0, 120, Short.MAX_VALUE)))
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(lbl_facilities3))
                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                            .addComponent(jLabel196)
                                            .addGap(18, 18, 18)
                                            .addComponent(tf_roofs, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addComponent(jLabel198)
                                                .addGap(16, 16, 16)
                                                .addComponent(tf_floors, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addComponent(jLabel205)
                                                .addGap(18, 18, 18)
                                                .addComponent(tf_communications, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                                .addComponent(jLabel197)
                                                .addGap(20, 20, 20)
                                                .addComponent(tf_walls, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addComponent(lbl_house_number1)
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_house_number1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addComponent(lbl_purok1)
                                        .addGap(71, 71, 71)
                                        .addComponent(tf_purk1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addComponent(lbl_barangay1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_barangays, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(186, 186, 186)
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_street1)
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(47, 47, 47))))
        );
        pnl_Basicnfo1Layout.setVerticalGroup(
            pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbl_basic_Information1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_house_number1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_house_number1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_barangay1)
                            .addComponent(tf_barangays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_street1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_purok1)
                    .addComponent(tf_purk1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_house_condition2)
                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicnfo1Layout.createSequentialGroup()
                                .addComponent(lbl_no_rooms1)
                                .addGap(14, 14, 14)
                                .addComponent(lbl_facilities2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tf_buildings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel194)
                                        .addComponent(tf_compartments1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel151)))
                            .addComponent(tf_no_rooms1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_compartments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel216)
                                .addComponent(tf_toilets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel152))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel195)
                            .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel199)
                                    .addComponent(tf_bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                                        .addComponent(jLabel200)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel201))
                                    .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tf_disposals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_communications, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel205)))
                                .addGap(5, 5, 5)
                                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_kitchens, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel202)))))
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_facilities3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel196)
                            .addComponent(tf_roofs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel197)
                            .addComponent(tf_walls, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel198)
                            .addComponent(tf_floors, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(pnl_Basicnfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Basicnfo1Layout.createSequentialGroup()
                        .addComponent(jLabel203)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel204))
                    .addComponent(tf_transportations, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(pnl_twoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_one.add(pnl_Basicnfo1, "card3");

        pnl_Basicinfo2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Basicinfo2.setPreferredSize(new java.awt.Dimension(1073, 664));

        lbl_house_condition3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_house_condition3.setText("HOUSE CONDITION (B)");

        jLabel206.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel206.setText("Fuel Mainly used for:");

        jLabel207.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel207.setText("Lighting:");

        tf_lighting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lightingMouseClicked(evt);
            }
        });

        jLabel208.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel208.setText("Main Source of Water for Drinking:");

        tf_water_sources.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_water_sourcesMouseClicked(evt);
            }
        });

        jLabel209.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel209.setText("Distance in Kilometers:");

        jLabel210.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel210.setText("Drinking Water Src:");

        jLabel211.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel211.setText("Cooking:");

        tf_cookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cookingsMouseClicked(evt);
            }
        });

        jLabel212.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel212.setText("Nearest Water Src:");

        pnl_twoA2.setBackground(new java.awt.Color(255, 255, 255));

        jButton31.setText("Next");
        jButton31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton45.setText("Back");
        jButton45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_twoA2Layout = new javax.swing.GroupLayout(pnl_twoA2);
        pnl_twoA2.setLayout(pnl_twoA2Layout);
        pnl_twoA2Layout.setHorizontalGroup(
            pnl_twoA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoA2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_twoA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA2Layout.createSequentialGroup()
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA2Layout.createSequentialGroup()
                        .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnl_twoA2Layout.setVerticalGroup(
            pnl_twoA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnl_twoA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_Basicinfo2Layout = new javax.swing.GroupLayout(pnl_Basicinfo2);
        pnl_Basicinfo2.setLayout(pnl_Basicinfo2Layout);
        pnl_Basicinfo2Layout.setHorizontalGroup(
            pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_house_condition3)
                    .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                        .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                                .addComponent(jLabel210)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                                    .addGap(159, 159, 159)
                                    .addComponent(tf_water_sources, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicinfo2Layout.createSequentialGroup()
                                            .addComponent(jLabel207, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(21, 21, 21)
                                            .addComponent(tf_lighting, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel206)
                                        .addComponent(jLabel208)
                                        .addComponent(jLabel209)))))
                        .addGap(33, 33, 33)
                        .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Basicinfo2Layout.createSequentialGroup()
                                .addComponent(jLabel211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cookings, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                                .addComponent(jLabel212)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(297, Short.MAX_VALUE))
            .addComponent(pnl_twoA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_Basicinfo2Layout.setVerticalGroup(
            pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Basicinfo2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lbl_house_condition3)
                .addGap(17, 17, 17)
                .addComponent(jLabel206)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel207)
                    .addComponent(tf_lighting, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel211)
                    .addComponent(tf_cookings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel208)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_water_sources, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel209)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_Basicinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel210)
                    .addComponent(jLabel212)
                    .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(338, 338, 338)
                .addComponent(pnl_twoA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_one.add(pnl_Basicinfo2, "card3");

        pnl_holder.add(pnl_one, "card2");

        pnl_two.setBackground(new java.awt.Color(255, 255, 255));

        pnl_twoA.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setText("Next");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Back");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_twoALayout = new javax.swing.GroupLayout(pnl_twoA);
        pnl_twoA.setLayout(pnl_twoALayout);
        pnl_twoALayout.setHorizontalGroup(
            pnl_twoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_twoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoALayout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoALayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnl_twoALayout.setVerticalGroup(
            pnl_twoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(pnl_twoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel44.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel44.setText("HOUSEHOLD INFORMATION");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Household ID:");

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("ADD");

        jLabel45.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel45.setText("Occupancy Type:");

        jCheckBox1.setText("Owned");

        jCheckBox2.setText("Rented");

        jLabel46.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel46.setText("Do the occupant own the land?");

        jCheckBox3.setText("Yes");

        jCheckBox4.setText("No");

        jLabel47.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel47.setText("Do the occupant own the Bldg.?");

        jCheckBox5.setText("Yes");

        jCheckBox6.setText("No");

        jLabel48.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel48.setText("Tenure:");

        jLabel49.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel49.setText("Monthly Rental:");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel51.setText("ASSETS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Car", ""},
                {"2", "Automobile", null},
                {"3", "Jewelry", null},
                {null, null, null}
            },
            new String [] {
                "ID", "Items", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnl_twoLayout = new javax.swing.GroupLayout(pnl_two);
        pnl_two.setLayout(pnl_twoLayout);
        pnl_twoLayout.setHorizontalGroup(
            pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_twoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_twoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_twoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44)
                    .addComponent(jLabel51)
                    .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_twoLayout.createSequentialGroup()
                            .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_twoLayout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_twoLayout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addGap(15, 15, 15)
                                    .addComponent(jCheckBox1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBox2)))
                            .addGap(370, 370, 370)
                            .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_twoLayout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnl_twoLayout.createSequentialGroup()
                                            .addComponent(jLabel46)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox4))
                                        .addGroup(pnl_twoLayout.createSequentialGroup()
                                            .addComponent(jLabel47)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jCheckBox6))))
                                .addGroup(pnl_twoLayout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        pnl_twoLayout.setVerticalGroup(
            pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(23, 23, 23)
                .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_twoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jLabel45)
                            .addComponent(jCheckBox1))
                        .addGap(27, 27, 27)))
                .addGroup(pnl_twoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_twoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_holder.add(pnl_two, "card3");

        pnl_three.setBackground(new java.awt.Color(255, 255, 255));
        pnl_three.setPreferredSize(new java.awt.Dimension(1073, 664));
        pnl_three.setLayout(new java.awt.CardLayout());

        pnl_consumption2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_consumption2.setPreferredSize(new java.awt.Dimension(1073, 664));

        pnl_twoA3.setBackground(new java.awt.Color(255, 255, 255));

        jButton57.setText("Back");
        jButton57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton32.setText("Next");
        jButton32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_twoA3Layout = new javax.swing.GroupLayout(pnl_twoA3);
        pnl_twoA3.setLayout(pnl_twoA3Layout);
        pnl_twoA3Layout.setHorizontalGroup(
            pnl_twoA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoA3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_twoA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA3Layout.createSequentialGroup()
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA3Layout.createSequentialGroup()
                        .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );
        pnl_twoA3Layout.setVerticalGroup(
            pnl_twoA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_twoA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Select Year:");

        tf_years.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_yearsMouseClicked(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel54.setText("CONSUMPTION");

        jLabel149.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel149.setText("Month:");

        tf_months.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_monthsMouseClicked(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel150.setText("Items:");

        tf_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_itemsMouseClicked(evt);
            }
        });

        jLabel214.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel214.setText("Amount:");

        jButton56.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton56.setText("ADD");

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "January", "Rice,oil,vegetables", "1000"},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Consumption Month", "Items", "Amount"
            }
        ));
        jScrollPane10.setViewportView(jTable9);

        javax.swing.GroupLayout pnl_consumption2Layout = new javax.swing.GroupLayout(pnl_consumption2);
        pnl_consumption2.setLayout(pnl_consumption2Layout);
        pnl_consumption2Layout.setHorizontalGroup(
            pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_consumption2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel54)
                .addGap(122, 1011, Short.MAX_VALUE))
            .addGroup(pnl_consumption2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(pnl_consumption2Layout.createSequentialGroup()
                        .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_months)
                            .addComponent(tf_years, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_consumption2Layout.createSequentialGroup()
                                .addComponent(jLabel214)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_consumption2Layout.createSequentialGroup()
                                .addComponent(jLabel150)
                                .addGap(18, 18, 18)
                                .addComponent(tf_items, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
            .addComponent(pnl_twoA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_consumption2Layout.setVerticalGroup(
            pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_consumption2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_years, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(tf_items, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_consumption2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(tf_months, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel214)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_twoA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_three.add(pnl_consumption2, "card3");

        pnl_consumption1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_consumption1.setPreferredSize(new java.awt.Dimension(1073, 664));

        pnl_twoA5.setBackground(new java.awt.Color(255, 255, 255));

        jButton34.setText("Next");
        jButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton59.setText("Back");
        jButton59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_twoA5Layout = new javax.swing.GroupLayout(pnl_twoA5);
        pnl_twoA5.setLayout(pnl_twoA5Layout);
        pnl_twoA5Layout.setHorizontalGroup(
            pnl_twoA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnl_twoA5Layout.setVerticalGroup(
            pnl_twoA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_twoA5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_twoA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA5Layout.createSequentialGroup()
                        .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_twoA5Layout.createSequentialGroup()
                        .addGroup(pnl_twoA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        jLabel59.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel59.setText("HOUSEHOLD EXPENDITURES");

        jLabel58.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel58.setText("Month:");

        tf_months1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_months1MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel60.setText("Fuel Expenses:");

        jLabel61.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel61.setText("Internet Services:");

        jLabel62.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel62.setText("Medical Expenses:");

        jLabel63.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel63.setText("Cigarretes/Tobacco:");

        jLabel64.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel64.setText("Hobbies/Clubs:");

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel76.setText("Parties/Social Obligations:");

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel66.setText("Load Expenses:");

        jLabel67.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel67.setText("Electric/Gas/Oil/Propane:");

        jLabel68.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel68.setText("Book/Newspaper/Magazine:");

        jLabel69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel69.setText("Gambling:");

        jLabel70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel70.setText("Personal Care:");

        jLabel71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel71.setText("Cable Services:");

        jLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel72.setText("Water Bill:");

        jLabel73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel73.setText("Vacation/Travel:");

        jLabel74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel74.setText("Alcohol:");

        jLabel75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel75.setText("Misc:");

        jButton36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton36.setText("ADD");

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
        jScrollPane16.setViewportView(jTable15);

        jLabel218.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel218.setText("Grand Total:");

        jLabel220.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel220.setText("0.00");

        javax.swing.GroupLayout pnl_consumption1Layout = new javax.swing.GroupLayout(pnl_consumption1);
        pnl_consumption1.setLayout(pnl_consumption1Layout);
        pnl_consumption1Layout.setHorizontalGroup(
            pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_twoA5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_consumption1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_months1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_consumption1Layout.createSequentialGroup()
                .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_consumption1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel59))
                    .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_consumption1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel62)
                                .addComponent(jLabel61)
                                .addComponent(jLabel63)
                                .addComponent(jLabel64)
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_consumption1Layout.createSequentialGroup()
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnl_consumption1Layout.createSequentialGroup()
                                            .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel70)
                                                .addComponent(jLabel69)
                                                .addComponent(jLabel68)
                                                .addComponent(jLabel67))
                                            .addGap(18, 18, 18)
                                            .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnl_consumption1Layout.createSequentialGroup()
                                            .addComponent(jLabel66)
                                            .addGap(20, 20, 20)
                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(71, 71, 71)
                                    .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel72)
                                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel73)
                                            .addComponent(jLabel71)
                                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGap(25, 25, 25)
                                    .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl_consumption1Layout.createSequentialGroup()
                                    .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 747, Short.MAX_VALUE)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_consumption1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_consumption1Layout.createSequentialGroup()
                                    .addComponent(jLabel218)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel220))
                                .addComponent(jScrollPane16)))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_consumption1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        pnl_consumption1Layout.setVerticalGroup(
            pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_consumption1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel59)
                .addGap(19, 19, 19)
                .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_consumption1Layout.createSequentialGroup()
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(tf_months1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel71)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(jLabel73)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(jLabel74)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64)
                            .addComponent(jLabel75)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_consumption1Layout.createSequentialGroup()
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_consumption1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel218)
                    .addComponent(jLabel220))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_twoA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_three.add(pnl_consumption1, "card4");

        pnl_holder.add(pnl_three, "card3");

        pnl_four.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton13.setText("Next");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Back");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jLabel78.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel78.setText("HOUSEHOLD'S LIST");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1212", "1", "4 members"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "House No.", "Household No.", "No. of Members"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout pnl_fourLayout = new javax.swing.GroupLayout(pnl_four);
        pnl_four.setLayout(pnl_fourLayout);
        pnl_fourLayout.setHorizontalGroup(
            pnl_fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fourLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jScrollPane4))
                .addGap(28, 28, 28))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_fourLayout.setVerticalGroup(
            pnl_fourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fourLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel78)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_holder.add(pnl_four, "card3");

        pnl_five.setBackground(new java.awt.Color(255, 255, 255));
        pnl_five.setLayout(new java.awt.CardLayout());

        pnl_services1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_services1.setPreferredSize(new java.awt.Dimension(1073, 664));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton19.setText("Next");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Back");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("SERVICES");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Rate the following services available in your community:");

        jLabel79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel79.setText("Drainage System");

        jLabel80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel80.setText("Street Maintenance");

        jLabel81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel81.setText("Garbage Collection");

        jLabel82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel82.setText("Fire Protection");

        jLabel83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel83.setText("Police Protection");

        jLabel84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel84.setText("Ambulance Service");

        jLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel85.setText("Livelihood Programs");

        jCheckBox7.setText("Excellent");

        jCheckBox10.setText("Excellent");

        jCheckBox13.setText("Excellent");

        jCheckBox16.setText("Excellent");

        jCheckBox19.setText("Excellent");

        jCheckBox22.setText("Excellent");

        jCheckBox25.setText("Excellent");

        jCheckBox8.setText("Adequate");

        jCheckBox11.setText("Adequate");

        jCheckBox14.setText("Adequate");

        jCheckBox17.setText("Adequate");

        jCheckBox20.setText("Adequate");

        jCheckBox23.setText("Adequate");

        jCheckBox26.setText("Adequate");

        jCheckBox9.setText("Inadequate");

        jCheckBox12.setText("Inadequate");

        jCheckBox15.setText("Inadequate");

        jCheckBox18.setText("Inadequate");

        jCheckBox21.setText("Inadequate");

        jCheckBox24.setText("Inadequate");

        jCheckBox27.setText("Inadequate");

        jLabel222.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel222.setText("COMMUNITY PROBLEMS");

        jLabel223.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel223.setText("Rate the following problems present in your community:");

        jLabel224.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel224.setText("Adolescent Pregnancy");

        jCheckBox144.setText("Very Low");

        jCheckBox145.setText(" Low");

        jCheckBox146.setText("Average");

        jCheckBox147.setText("Above Average");

        jCheckBox148.setText("High");

        jCheckBox149.setText("Excellent");

        jCheckBox150.setText("Excellent");

        jCheckBox151.setText("High");

        jCheckBox152.setText("Above Average");

        jCheckBox153.setText("Average");

        jCheckBox154.setText(" Low");

        jCheckBox155.setText("Very Low");

        jLabel225.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel225.setText("Child abuse and neglect");

        jLabel226.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel226.setText("Crime");

        jCheckBox156.setText("Very Low");

        jCheckBox157.setText(" Low");

        jCheckBox158.setText("Average");

        jCheckBox159.setText("Above Average");

        jCheckBox160.setText("High");

        jCheckBox161.setText("Excellent");

        jCheckBox162.setText("Excellent");

        jCheckBox163.setText("High");

        jCheckBox164.setText("Above Average");

        jCheckBox165.setText("Average");

        jCheckBox166.setText(" Low");

        jCheckBox167.setText("Very Low");

        jLabel227.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel227.setText("Domestic Violence");

        jLabel228.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel228.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel228.setText("Drug Abuse");

        jLabel229.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel229.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel229.setText("Environmental Contamination");

        jLabel230.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel230.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel230.setText("Health Disparities");

        jLabel231.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel231.setText("Hunger");

        jCheckBox168.setText("Very Low");

        jCheckBox169.setText("Very Low");

        jCheckBox170.setText("Very Low");

        jCheckBox171.setText("Very Low");

        jCheckBox172.setText(" Low");

        jCheckBox173.setText(" Low");

        jCheckBox174.setText(" Low");

        jCheckBox175.setText(" Low");

        jCheckBox176.setText("Average");

        jCheckBox177.setText("Average");

        jCheckBox178.setText("Average");

        jCheckBox179.setText("Average");

        jCheckBox180.setText("Above Average");

        jCheckBox181.setText("Above Average");

        jCheckBox182.setText("Above Average");

        jCheckBox183.setText("Above Average");

        jCheckBox184.setText("High");

        jCheckBox185.setText("High");

        jCheckBox186.setText("High");

        jCheckBox187.setText("High");

        jCheckBox188.setText("Excellent");

        jCheckBox189.setText("Excellent");

        jCheckBox190.setText("Excellent");
        jCheckBox190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox190ActionPerformed(evt);
            }
        });

        jCheckBox191.setText("Excellent");
        jCheckBox191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox191ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_services1Layout = new javax.swing.GroupLayout(pnl_services1);
        pnl_services1.setLayout(pnl_services1Layout);
        pnl_services1Layout.setHorizontalGroup(
            pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_services1Layout.createSequentialGroup()
                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnl_services1Layout.createSequentialGroup()
                                        .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addGroup(pnl_services1Layout.createSequentialGroup()
                                        .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox10)
                                    .addComponent(jCheckBox16)
                                    .addComponent(jCheckBox13)
                                    .addComponent(jCheckBox19)
                                    .addComponent(jCheckBox22)
                                    .addComponent(jCheckBox25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox14)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox11)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jCheckBox20)
                                    .addComponent(jCheckBox23)
                                    .addComponent(jCheckBox26, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox15)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox27, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox156, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox155, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox167, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox171, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCheckBox168)
                                        .addComponent(jCheckBox169)
                                        .addComponent(jCheckBox170))
                                    .addGroup(pnl_services1Layout.createSequentialGroup()
                                        .addComponent(jLabel224, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox144)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox165)
                                    .addComponent(jCheckBox158)
                                    .addComponent(jCheckBox176)
                                    .addComponent(jCheckBox146)
                                    .addComponent(jCheckBox153)
                                    .addComponent(jCheckBox177)
                                    .addComponent(jCheckBox178)
                                    .addComponent(jCheckBox179))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox145)
                                    .addComponent(jCheckBox154)
                                    .addComponent(jCheckBox157)
                                    .addComponent(jCheckBox166)
                                    .addComponent(jCheckBox172)
                                    .addComponent(jCheckBox173)
                                    .addComponent(jCheckBox174)
                                    .addComponent(jCheckBox175))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox152)
                                    .addComponent(jCheckBox147)
                                    .addComponent(jCheckBox159)
                                    .addComponent(jCheckBox164)
                                    .addComponent(jCheckBox180)
                                    .addComponent(jCheckBox181)
                                    .addComponent(jCheckBox182)
                                    .addComponent(jCheckBox183))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox151)
                                    .addComponent(jCheckBox148)
                                    .addComponent(jCheckBox160)
                                    .addComponent(jCheckBox163)
                                    .addComponent(jCheckBox184)
                                    .addComponent(jCheckBox185)
                                    .addComponent(jCheckBox186)
                                    .addComponent(jCheckBox187))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox149)
                                    .addComponent(jCheckBox150)
                                    .addComponent(jCheckBox161)
                                    .addComponent(jCheckBox162)
                                    .addComponent(jCheckBox188)
                                    .addComponent(jCheckBox189)
                                    .addComponent(jCheckBox190)
                                    .addComponent(jCheckBox191)))
                            .addComponent(jLabel223)
                            .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel231, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel229, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel228, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel227, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel226, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel225, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel222, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(140, 354, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_services1Layout.setVerticalGroup(
            pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_services1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel80)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel81)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel82)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel83)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel84)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel85))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox10)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox13)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox16)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox19)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox22)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox25))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox8)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox11)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox14)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox17)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox20)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox23)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox26))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox9)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox12)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox15)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox18)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox21)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox24)
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox27)))
                .addGap(54, 54, 54)
                .addComponent(jLabel222)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel223)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox165)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox179))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel224)
                            .addComponent(jCheckBox149))
                        .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addComponent(jCheckBox150)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox188)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox189)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox190)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox191))
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel225)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel226)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel227)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel228)
                                .addGap(71, 71, 71))))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox166)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox172))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox147)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox164)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox180)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox181)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox182)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox183))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox148)
                        .addGap(0, 0, 0)
                        .addComponent(jCheckBox151)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox163)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox187))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addComponent(jCheckBox144)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox156)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox167)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox171))
                    .addGroup(pnl_services1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(pnl_services1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addComponent(jLabel229)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel230)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel231))
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addComponent(jCheckBox173)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox174)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox175))
                            .addGroup(pnl_services1Layout.createSequentialGroup()
                                .addComponent(jCheckBox170)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox169)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox168)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_five.add(pnl_services1, "card2");

        pnl_services2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_services2.setPreferredSize(new java.awt.Dimension(1073, 664));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jButton33.setText("Next");
        jButton33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton35.setText("Back");
        jButton35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel232.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel232.setText("ADDITIONAL CONCERNS");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane17.setViewportView(jTextArea2);

        jButton58.setText("ADD");
        jButton58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout pnl_services2Layout = new javax.swing.GroupLayout(pnl_services2);
        pnl_services2.setLayout(pnl_services2Layout);
        pnl_services2Layout.setHorizontalGroup(
            pnl_services2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_services2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_services2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_services2Layout.createSequentialGroup()
                        .addComponent(jLabel232)
                        .addGap(829, 829, 829))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_services2Layout.createSequentialGroup()
                        .addGroup(pnl_services2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27))))
        );
        pnl_services2Layout.setVerticalGroup(
            pnl_services2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_services2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel232)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_five.add(pnl_services2, "card3");

        pnl_holder.add(pnl_five, "card6");

        pnl_six.setBackground(new java.awt.Color(255, 255, 255));
        pnl_six.setPreferredSize(new java.awt.Dimension(965, 500));
        pnl_six.setLayout(new java.awt.CardLayout());

        pnl_housemember1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember1.setPreferredSize(new java.awt.Dimension(965, 664));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton21.setText("Next");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("Back");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel99.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel99.setText("BASIC INFORMATION");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Name:");

        jLabel100.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel100.setText("Gender:");

        tf_genders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_gendersMouseClicked(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel103.setText("Occupancy Year/s:");

        jLabel106.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel106.setText("Birthplace:");

        jLabel109.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel109.setText("Present address:");

        jLabel111.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel111.setText("Email address:");

        jLabel112.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel112.setText("Religion:");

        tf_religions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_religionsMouseClicked(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel101.setText("Marital Status:");

        jLabel105.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel105.setText("Birthdate:");

        tf_maritals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_maritalsMouseClicked(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel107.setText("Relation to Household:");

        tf_relations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_relationsMouseClicked(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel102.setText("Height:");

        jLabel104.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel104.setText("Weight:");

        jLabel108.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel108.setText("others specify:");

        jLabel110.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel110.setText("Citzenship:");

        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jLabel115.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel115.setText("others specify:");

        jLabel114.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel114.setText("Languages Spoken:");

        jLabel117.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel117.setText("HEALTH STATUS");

        jLabel118.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel118.setText("Seeing a Doctor?");

        jCheckBox83.setText("Yes");

        jCheckBox84.setText("No");

        jLabel119.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel119.setText("Status:");

        jCheckBox85.setText("Normal");

        jCheckBox86.setText("PWD");

        jLabel121.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel121.setText("Name of Doctor:");

        jLabel120.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel120.setText("Disabilities:");

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

        jLabel122.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel122.setText("Level of Disabilty:");

        jLabel123.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel123.setText("Cause:");

        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });

        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });

        jButton37.setText("ADD");
        jButton37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"yes", "Dr. Ronald Pascua", "Deslyxia", "lock of attention"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Is seeing a doctor", "Doctor name", "Disabilities", "Cause"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel113.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel113.setText("Blood Type:");

        tf_religions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_religions1MouseClicked(evt);
            }
        });

        jCheckBox28.setText("Registered Voter");

        jLabel116.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel116.setText("Voters ID No.");

        javax.swing.GroupLayout pnl_housemember1Layout = new javax.swing.GroupLayout(pnl_housemember1);
        pnl_housemember1.setLayout(pnl_housemember1Layout);
        pnl_housemember1Layout.setHorizontalGroup(
            pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createSequentialGroup()
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel118)
                                    .addComponent(jLabel119)
                                    .addComponent(jLabel121))
                                .addGap(15, 15, 15)
                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox85)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox86)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(114, 114, 114)
                                                .addComponent(jTextField61))
                                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel123))
                                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                        .addComponent(jCheckBox83)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jCheckBox84)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel120)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tf_disabilities, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                .addComponent(jLabel122)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jLabel112)
                                        .addGap(56, 56, 56)
                                        .addComponent(tf_religions))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_genders))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel103)
                                            .addComponent(jLabel106))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField49)
                                            .addComponent(jTextField46)))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addComponent(jLabel113)
                                        .addGap(41, 41, 41)
                                        .addComponent(tf_religions1)))
                                .addGap(40, 40, 40)
                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember1Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel101)
                                                    .addComponent(jLabel105))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tf_maritals)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createSequentialGroup()
                                                .addComponent(jLabel102)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                    .addComponent(jLabel108)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField51))
                                                .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                    .addComponent(jLabel104)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel107)
                                                    .addComponent(jLabel110))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tf_relations, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                                    .addComponent(jTextField53))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel111))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember1Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jCheckBox28)
                                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                                        .addComponent(jLabel114)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel115)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jTextField57)))
                                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel116)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane3))
                        .addGap(26, 26, 26))
                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel99))
                        .addGap(50, 50, 50))))
        );
        pnl_housemember1Layout.setVerticalGroup(
            pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_genders, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(tf_maritals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember1Layout.createSequentialGroup()
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107)
                            .addComponent(tf_relations, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108)
                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel110)
                            .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel111))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel112)
                            .addComponent(tf_religions, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114)
                            .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115)
                            .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_religions1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel113)
                        .addComponent(jLabel116)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jCheckBox83)
                    .addComponent(jCheckBox84)
                    .addComponent(jLabel120)
                    .addComponent(tf_disabilities, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel122)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox85)
                    .addComponent(jLabel119)
                    .addComponent(jCheckBox86))
                .addGap(3, 3, 3)
                .addGroup(pnl_housemember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember1, "card2");

        pnl_housemember2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember2.setPreferredSize(new java.awt.Dimension(1130, 664));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jButton60.setText("Next");
        jButton60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setText("Back");
        jButton61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel125.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel125.setText("MEDICATION");

        jLabel126.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel126.setText("Prescription:");

        jLabel127.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel127.setText("Begin Date:");

        jLabel128.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel128.setText("End Date:");

        jLabel129.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel129.setText("Dose:");

        jButton38.setText("ADD");
        jButton38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dr. Ronald Pascua", "paracetamol", "3x  a day"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor name", "Prescription", "Dose"
            }
        ));
        jScrollPane18.setViewportView(jTable16);

        javax.swing.GroupLayout pnl_housemember2Layout = new javax.swing.GroupLayout(pnl_housemember2);
        pnl_housemember2.setLayout(pnl_housemember2Layout);
        pnl_housemember2Layout.setHorizontalGroup(
            pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_housemember2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel126)
                            .addComponent(jLabel127))
                        .addGap(10, 10, 10)
                        .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember2Layout.createSequentialGroup()
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(684, 684, 684)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_housemember2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel129)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(503, 503, 503)))
                        .addGap(25, 25, 25))
                    .addGroup(pnl_housemember2Layout.createSequentialGroup()
                        .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel125)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_housemember2Layout.setVerticalGroup(
            pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel125)
                .addGap(15, 15, 15)
                .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_housemember2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel127)
                        .addComponent(jLabel128))
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember2, "card3");

        pnl_housemember3.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember3.setPreferredSize(new java.awt.Dimension(1130, 664));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jButton62.setText("Next");
        jButton62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setText("Back");
        jButton63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setText("EDUCATIONAL BACKGROUND");

        jLabel233.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel233.setText("Educatonal Status:");

        jLabel234.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel234.setText("Name of School:");

        jLabel235.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel235.setText("Achievements:");

        jLabel236.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel236.setText("Highest Grade Completed:");

        tf_year_graduated.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_year_graduatedMouseClicked(evt);
            }
        });

        jLabel237.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel237.setText("Year Graduated:");

        jButton64.setText("ADD");
        jButton64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "Nurso", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Education status", "Name of School", "Achievements", "Highest grade Completed"
            }
        ));
        jScrollPane19.setViewportView(jTable17);

        jLabel137.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel137.setText(" VOCATIONAL/TECHNICAL & RELEVANT EXPERIENCE");

        jLabel138.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel138.setText("Name of Training:");

        jLabel141.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel141.setText("Certificate Received:");

        jButton42.setText("ADD");
        jButton42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel142.setText("Issuing School/Agency:");

        jLabel139.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel139.setText("Skills Acquired:");

        jLabel140.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel140.setText("Period of Training:");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name of Training", "Skills Acquired", "Period of Training", "Certificate Received", "issuing School/Agency"
            }
        ));
        jScrollPane8.setViewportView(jTable7);

        javax.swing.GroupLayout pnl_housemember3Layout = new javax.swing.GroupLayout(pnl_housemember3);
        pnl_housemember3.setLayout(pnl_housemember3Layout);
        pnl_housemember3Layout.setHorizontalGroup(
            pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_housemember3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember3Layout.createSequentialGroup()
                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel140, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel138)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel142)
                                            .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel141)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addGap(309, 309, 309)
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addComponent(jLabel235)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addComponent(jLabel234)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                                        .addComponent(jLabel233)
                                        .addGap(10, 10, 10)
                                        .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember3Layout.createSequentialGroup()
                                        .addComponent(jLabel236)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember3Layout.createSequentialGroup()
                                        .addComponent(jLabel237)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_year_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        pnl_housemember3Layout.setVerticalGroup(
            pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel233)
                    .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel236)
                    .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel234)
                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel237)
                    .addComponent(tf_year_graduated, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel235)
                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel137)
                .addGap(21, 21, 21)
                .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel139))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel140)))
                    .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel138)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember3Layout.createSequentialGroup()
                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel141)
                            .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel142)
                            .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember3, "card4");

        pnl_housemember4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jButton75.setText("Next");
        jButton75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setText("Back");
        jButton76.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel144.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel144.setText("CERTIFICATE OF COMPETENCE");

        jLabel145.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel145.setText("Certificate:");

        jLabel146.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel146.setText("Issued by:");

        jLabel147.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel147.setText("Rating:");

        jLabel148.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel148.setText("Date Issued:");

        jButton43.setText("ADD");
        jButton43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jTable18.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Certificate", "Issued by", "Rating", "Date Issued"
            }
        ));
        jScrollPane6.setViewportView(jTable18);

        javax.swing.GroupLayout pnl_housemember4Layout = new javax.swing.GroupLayout(pnl_housemember4);
        pnl_housemember4.setLayout(pnl_housemember4Layout);
        pnl_housemember4Layout.setHorizontalGroup(
            pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember4Layout.createSequentialGroup()
                .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_housemember4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember4Layout.createSequentialGroup()
                        .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember4Layout.createSequentialGroup()
                                .addComponent(jLabel146)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_housemember4Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel144))
                                .addGroup(pnl_housemember4Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel145)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember4Layout.createSequentialGroup()
                                .addComponent(jLabel147)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember4Layout.createSequentialGroup()
                                .addComponent(jLabel148)
                                .addGap(14, 14, 14)))
                        .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane6)))
                .addGap(26, 26, 26))
        );
        pnl_housemember4Layout.setVerticalGroup(
            pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel146)
                        .addComponent(jLabel148))
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember4, "card5");

        pnl_housemember5.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember5.setPreferredSize(new java.awt.Dimension(1220, 664));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jButton77.setText("Next");
        jButton77.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setText("Back");
        jButton78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel162.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel162.setText("LICENSE");

        jLabel163.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel163.setText("License Title:");

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "License Title", "Expiry Date"
            }
        ));
        jScrollPane12.setViewportView(jTable11);

        jLabel164.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel164.setText("Expiry Date:");

        jButton24.setText("ADD");

        jLabel192.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel192.setText("WORK EXPERIENCE");

        jLabel246.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel246.setText("Name of the Company/Firm:");

        jLabel247.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel247.setText("Address:");

        jLabel248.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel248.setText("Position Hold:");

        jLabel249.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel249.setText("Job Description:");

        jLabel250.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel250.setText("Inclusive Date");

        jLabel251.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel251.setText("From:");

        jLabel252.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel252.setText("To:");

        jButton25.setText("ADD");

        jTable19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Company/Firm Name", "Address", "Position Hold", "Job Description", "From", "To"
            }
        ));
        jScrollPane20.setViewportView(jTable19);

        javax.swing.GroupLayout pnl_housemember5Layout = new javax.swing.GroupLayout(pnl_housemember5);
        pnl_housemember5.setLayout(pnl_housemember5Layout);
        pnl_housemember5Layout.setHorizontalGroup(
            pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_housemember5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel192)
                    .addComponent(jLabel162))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_housemember5Layout.createSequentialGroup()
                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel251)
                                                    .addComponent(jLabel252, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel250))
                                        .addGap(280, 280, 280))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember5Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember5Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember5Layout.createSequentialGroup()
                                                        .addComponent(jLabel249)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                                        .addComponent(jLabel248)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                                        .addComponent(jLabel247)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                                                        .addComponent(jLabel246)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember5Layout.createSequentialGroup()
                                                .addComponent(jLabel163)
                                                .addGap(32, 32, 32)
                                                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel164)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_housemember5Layout.setVerticalGroup(
            pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel162)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel163)
                        .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel164)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel192)
                .addGap(18, 18, 18)
                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                        .addComponent(jLabel250)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel251)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel252)))
                    .addGroup(pnl_housemember5Layout.createSequentialGroup()
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel246)
                            .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel247))
                        .addGap(5, 5, 5)
                        .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel248))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_housemember5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel249)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember5, "card6");

        pnl_housemember6.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember6.setPreferredSize(new java.awt.Dimension(100, 664));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jButton79.setText("Next");
        jButton79.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton82.setText("Back");
        jButton82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton82, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel238.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel238.setText("PREFERRED OCCUPATION");

        jLabel239.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel239.setText("Preferred Occupation:");

        jTextField129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField129ActionPerformed(evt);
            }
        });

        jButton65.setText("ADD");

        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Preferred Occupation"
            }
        ));
        jScrollPane21.setViewportView(jTable20);

        javax.swing.GroupLayout pnl_housemember6Layout = new javax.swing.GroupLayout(pnl_housemember6);
        pnl_housemember6.setLayout(pnl_housemember6Layout);
        pnl_housemember6Layout.setHorizontalGroup(
            pnl_housemember6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_housemember6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember6Layout.createSequentialGroup()
                        .addComponent(jLabel239)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 504, Short.MAX_VALUE)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember6Layout.createSequentialGroup()
                        .addComponent(jLabel238)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane21))
                .addGap(26, 26, 26))
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_housemember6Layout.setVerticalGroup(
            pnl_housemember6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel238)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_housemember6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel239)
                    .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember6, "card8");

        pnl_housemember7.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember7.setPreferredSize(new java.awt.Dimension(1076, 664));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jButton80.setText("Next");
        jButton80.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.setText("Back");
        jButton81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton81, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel253.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel253.setText("SKILLS");

        jLabel254.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel254.setText("People Skills");

        jCheckBox192.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox192.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox192.setText("Teaching");

        jCheckBox193.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox193.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox193.setText("Negotiating");
        jCheckBox193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox193ActionPerformed(evt);
            }
        });

        jCheckBox194.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox194.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox194.setText("Diverting");
        jCheckBox194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox194ActionPerformed(evt);
            }
        });

        jCheckBox195.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox195.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox195.setText("Persuading");

        jCheckBox196.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox196.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox196.setText("Promoting");
        jCheckBox196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox196ActionPerformed(evt);
            }
        });

        jCheckBox197.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox197.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox197.setText("Selling");
        jCheckBox197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox197ActionPerformed(evt);
            }
        });

        jCheckBox198.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox198.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox198.setText("Leading");

        jCheckBox199.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox199.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox199.setText("Speaking");
        jCheckBox199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox199ActionPerformed(evt);
            }
        });

        jCheckBox200.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox200.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox200.setText("Serving");

        jCheckBox201.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox201.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox201.setText("Helping");

        jCheckBox202.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox202.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox202.setText("Encouraging");
        jCheckBox202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox202ActionPerformed(evt);
            }
        });

        jCheckBox203.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox203.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox203.setText("Motivating");

        jLabel255.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel255.setText("Data Skills");

        jCheckBox204.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox204.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox204.setText("Coordinating");

        jCheckBox205.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox205.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox205.setText("Analyzing");
        jCheckBox205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox205ActionPerformed(evt);
            }
        });

        jCheckBox206.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox206.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox206.setText("Planning");
        jCheckBox206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox206ActionPerformed(evt);
            }
        });

        jCheckBox207.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox207.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox207.setText("Compiling");
        jCheckBox207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox207ActionPerformed(evt);
            }
        });

        jCheckBox208.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox208.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox208.setText("Computing");

        jCheckBox209.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox209.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox209.setText("Recording");
        jCheckBox209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox209ActionPerformed(evt);
            }
        });

        jCheckBox210.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox210.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox210.setText("Checking");

        jCheckBox211.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox211.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox211.setText("Researching");

        jCheckBox212.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox212.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox212.setText("Testing");

        jCheckBox213.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox213.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox213.setText("Comparing");

        jCheckBox214.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox214.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox214.setText("Tabulating");
        jCheckBox214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox214ActionPerformed(evt);
            }
        });

        jCheckBox215.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox215.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox215.setText("Posting");
        jCheckBox215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox215ActionPerformed(evt);
            }
        });

        jCheckBox216.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox216.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox216.setText("Copying");

        jCheckBox217.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox217.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox217.setText("Posting");

        jLabel256.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel256.setText("Thing Skills");

        jCheckBox218.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox218.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox218.setText("Machine Work");

        jCheckBox219.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox219.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox219.setText("Setting-up");
        jCheckBox219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox219ActionPerformed(evt);
            }
        });

        jCheckBox220.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox220.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox220.setText("Assembling");
        jCheckBox220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox220ActionPerformed(evt);
            }
        });

        jCheckBox221.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox221.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox221.setText("Operating/Controlling");
        jCheckBox221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox221ActionPerformed(evt);
            }
        });

        jCheckBox222.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox222.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox222.setText("Driving/Steering");

        jCheckBox223.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox223.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox223.setText("Repairing/Adusting");
        jCheckBox223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox223ActionPerformed(evt);
            }
        });

        jCheckBox224.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox224.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox224.setText("Manipulating");
        jCheckBox224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox224ActionPerformed(evt);
            }
        });

        jCheckBox225.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox225.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox225.setText("Materials handling");

        jCheckBox226.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox226.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox226.setText("Producing");
        jCheckBox226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox226ActionPerformed(evt);
            }
        });

        jCheckBox227.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox227.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox227.setText("Inspecting");
        jCheckBox227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox227ActionPerformed(evt);
            }
        });

        jCheckBox228.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox228.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox228.setText("Warehousing");

        jCheckBox229.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox229.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox229.setText("Building");

        jCheckBox230.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox230.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox230.setText("Precision Working");

        jCheckBox231.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox231.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox231.setText("Restoring");

        jCheckBox232.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox232.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox232.setText("Feeding/Loading");

        jLabel257.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel257.setText("Idea Skills");

        jCheckBox233.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox233.setText("Implementing");

        jCheckBox234.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox234.setText("Synthesizing");
        jCheckBox234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox234ActionPerformed(evt);
            }
        });

        jCheckBox235.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox235.setText("Organizing");
        jCheckBox235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox235ActionPerformed(evt);
            }
        });

        jCheckBox236.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox236.setText("Creating/Inventing");
        jCheckBox236.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox236ActionPerformed(evt);
            }
        });

        jCheckBox237.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox237.setText("Discovering");

        jCheckBox238.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox238.setText("Interpreting");
        jCheckBox238.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox238ActionPerformed(evt);
            }
        });

        jCheckBox239.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox239.setText("Instruction");

        jCheckBox240.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox240.setText("Speculation");

        jCheckBox241.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox241.setText("Anticipating");

        jCheckBox242.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox242.setText("Predicting");

        jCheckBox243.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox243.setText("Theorizing");

        jCheckBox244.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox244.setText("Innovating");

        jCheckBox245.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox245.setText("Expressing");

        javax.swing.GroupLayout pnl_housemember7Layout = new javax.swing.GroupLayout(pnl_housemember7);
        pnl_housemember7.setLayout(pnl_housemember7Layout);
        pnl_housemember7Layout.setHorizontalGroup(
            pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel253))
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel254)
                            .addComponent(jLabel255)
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox204)
                                                .addComponent(jCheckBox205)
                                                .addComponent(jCheckBox206)
                                                .addComponent(jLabel256))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox207)
                                                .addComponent(jCheckBox208)
                                                .addComponent(jCheckBox209)))
                                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox193)
                                                .addComponent(jCheckBox192))
                                            .addGap(80, 80, 80)
                                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox195)
                                                .addComponent(jCheckBox194))))
                                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCheckBox218, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox219)
                                                    .addComponent(jCheckBox220)
                                                    .addComponent(jLabel257)
                                                    .addComponent(jCheckBox234)
                                                    .addComponent(jCheckBox233)
                                                    .addComponent(jCheckBox235))
                                                .addGap(12, 12, 12)))
                                        .addGap(68, 68, 68)
                                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox221, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                                    .addComponent(jCheckBox222)
                                                    .addGap(16, 16, 16)))
                                            .addComponent(jCheckBox223)))
                                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox238)
                                            .addComponent(jCheckBox239))))
                                .addGap(44, 44, 44)
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox197)
                                    .addComponent(jCheckBox196)
                                    .addComponent(jCheckBox210)
                                    .addComponent(jCheckBox211)
                                    .addComponent(jCheckBox226)
                                    .addComponent(jCheckBox225)
                                    .addComponent(jCheckBox224)
                                    .addComponent(jCheckBox241)
                                    .addComponent(jCheckBox240))
                                .addGap(56, 56, 56)
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox199)
                                    .addComponent(jCheckBox198)
                                    .addComponent(jCheckBox212)
                                    .addComponent(jCheckBox213)
                                    .addComponent(jCheckBox228)
                                    .addComponent(jCheckBox227)
                                    .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox236)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember7Layout.createSequentialGroup()
                                            .addComponent(jCheckBox237)
                                            .addGap(34, 34, 34))))
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox200)
                                            .addComponent(jCheckBox201)
                                            .addComponent(jCheckBox214)
                                            .addComponent(jCheckBox215)
                                            .addComponent(jCheckBox242)
                                            .addComponent(jCheckBox243))
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox229)
                                            .addComponent(jCheckBox230))
                                        .addGap(18, 18, 18)))
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox244)
                                    .addComponent(jCheckBox245)
                                    .addComponent(jCheckBox217)
                                    .addComponent(jCheckBox216)
                                    .addComponent(jCheckBox202)
                                    .addComponent(jCheckBox203)
                                    .addComponent(jCheckBox231)
                                    .addComponent(jCheckBox232))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_housemember7Layout.setVerticalGroup(
            pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel253)
                .addGap(30, 30, 30)
                .addComponent(jLabel254)
                .addGap(18, 18, 18)
                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember7Layout.createSequentialGroup()
                            .addComponent(jCheckBox196)
                            .addGap(0, 0, 0)
                            .addComponent(jCheckBox197)
                            .addGap(3, 3, 3))
                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                            .addComponent(jCheckBox192)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox193))
                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                            .addComponent(jCheckBox200)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox201))
                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                            .addComponent(jCheckBox202)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox203)))
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox194)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox195))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox198)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox199)))
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel255)
                .addGap(18, 18, 18)
                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox204)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox205))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox210)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox211))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox212)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox213))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox216)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox217))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox214)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox215)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox206))
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addComponent(jCheckBox207)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox208)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox209)))
                .addGap(18, 18, 18)
                .addComponent(jLabel256)
                .addGap(18, 18, 18)
                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                    .addComponent(jCheckBox218)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox219))
                                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox232)
                                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                        .addComponent(jCheckBox231)
                                        .addGap(23, 23, 23)))
                                .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                    .addComponent(jCheckBox229)
                                    .addGap(0, 0, 0)
                                    .addComponent(jCheckBox230)))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox227)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBox228)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox220))
                    .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_housemember7Layout.createSequentialGroup()
                            .addComponent(jCheckBox221)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox222)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox223))
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jCheckBox226))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox224)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox225)))))
                .addGap(15, 15, 15)
                .addComponent(jLabel257)
                .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_housemember7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox236)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox237))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox238)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox239))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox240)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox241))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox244)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox245))
                            .addGroup(pnl_housemember7Layout.createSequentialGroup()
                                .addComponent(jCheckBox242)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox243))))
                    .addGroup(pnl_housemember7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox233)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox234)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox235)))
                .addGap(83, 83, 83)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember7, "card7");

        pnl_housemember8.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember8.setPreferredSize(new java.awt.Dimension(1108, 664));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jButton83.setText("Next");
        jButton83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton84.setText("Back");
        jButton84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Others Please Specify:");

        jTextField130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField130ActionPerformed(evt);
            }
        });

        jButton66.setText("ADD");

        jTable21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane22.setViewportView(jTable21);

        javax.swing.GroupLayout pnl_housemember8Layout = new javax.swing.GroupLayout(pnl_housemember8);
        pnl_housemember8.setLayout(pnl_housemember8Layout);
        pnl_housemember8Layout.setHorizontalGroup(
            pnl_housemember8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_housemember8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnl_housemember8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane22)
                    .addGroup(pnl_housemember8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        pnl_housemember8Layout.setVerticalGroup(
            pnl_housemember8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_housemember8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember8, "card9");

        pnl_housemember9.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember9.setPreferredSize(new java.awt.Dimension(1184, 664));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jButton85.setText("Next");
        jButton85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setText("Back");
        jButton86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel190.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel190.setText("Employment Status");

        jLabel191.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel191.setText("Status:");

        cb_status_employed1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_status_employed1.setText("Employed");

        cb_employment_worker1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_worker1.setText("Worker");
        cb_employment_worker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_worker1ActionPerformed(evt);
            }
        });

        cb_employment_employee1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_employee1.setText("Employee");
        cb_employment_employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_employee1ActionPerformed(evt);
            }
        });

        cb_employment_self_employed1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_self_employed1.setText("Self Employed");
        cb_employment_self_employed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_self_employed1ActionPerformed(evt);
            }
        });

        cb_employment_director1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_director1.setText("Director");
        cb_employment_director1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_director1ActionPerformed(evt);
            }
        });

        cb_employment_office_holder1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_office_holder1.setText("Office Holder");
        cb_employment_office_holder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_office_holder1ActionPerformed(evt);
            }
        });

        cb_employment_ofw1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_employment_ofw1.setText("OFW");
        cb_employment_ofw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employment_ofw1ActionPerformed(evt);
            }
        });

        cb_status_unemployed1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_status_unemployed1.setText("Unemployed");
        cb_status_unemployed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_status_unemployed1ActionPerformed(evt);
            }
        });

        jRadioButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton5.setText("Finsihed Contract");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton6.setText("Terminated/Laid Off,local");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton7.setText("Resigned");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jRadioButton8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton8.setText("Terminated/Laid off, abroad Specify  the country where you worked and got terminated:");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jLabel240.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel240.setText("Company:");

        jLabel241.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel241.setText("Type:");

        jCheckBox246.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox246.setText("Are you  actively looking for work?");
        jCheckBox246.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox246ActionPerformed(evt);
            }
        });

        jLabel242.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel242.setText("Job Descripton:");

        jButton55.setText("ADD");
        jButton55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton67.setText("UPDATE");
        jButton67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setText("DELETE");
        jButton68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Is Employed?", "Status", "Job Description", "Company name", "Type"
            }
        ));
        jScrollPane15.setViewportView(jTable14);

        javax.swing.GroupLayout pnl_housemember9Layout = new javax.swing.GroupLayout(pnl_housemember9);
        pnl_housemember9.setLayout(pnl_housemember9Layout);
        pnl_housemember9Layout.setHorizontalGroup(
            pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                .addComponent(jCheckBox246)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel191)
                                            .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cb_employment_worker1)
                                                .addComponent(cb_status_employed1))
                                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cb_employment_self_employed1)
                                                    .addComponent(cb_employment_director1)
                                                    .addComponent(cb_employment_ofw1)
                                                    .addComponent(cb_employment_office_holder1)
                                                    .addComponent(cb_employment_employee1))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_status_unemployed1)
                                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING))
                                                        .addGap(190, 190, 190)
                                                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember9Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel241)
                                                                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                                                        .addGap(33, 33, 33)
                                                                        .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_housemember9Layout.createSequentialGroup()
                                                                .addComponent(jLabel240)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addComponent(jRadioButton8)
                                                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                                        .addComponent(jLabel242)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 283, Short.MAX_VALUE))))
                    .addComponent(jScrollPane15))
                .addGap(22, 22, 22))
        );
        pnl_housemember9Layout.setVerticalGroup(
            pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel191)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                .addComponent(cb_status_unemployed1)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton5)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnl_housemember9Layout.createSequentialGroup()
                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel240)
                                    .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel241))
                                .addGap(21, 21, 21)))
                        .addComponent(jRadioButton8)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel242)))
                    .addGroup(pnl_housemember9Layout.createSequentialGroup()
                        .addComponent(cb_status_employed1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_employment_worker1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_employment_employee1)
                        .addGap(0, 0, 0)
                        .addComponent(cb_employment_self_employed1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_employment_director1)
                        .addGap(0, 0, 0)
                        .addComponent(cb_employment_office_holder1)
                        .addGap(0, 0, 0)
                        .addComponent(cb_employment_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(pnl_housemember9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox246))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember9, "card10");

        pnl_housemember10.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember10.setPreferredSize(new java.awt.Dimension(1116, 664));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jButton87.setText("Next");
        jButton87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        jButton88.setText("Back");
        jButton88.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton88, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel243.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel243.setText("Name of Business:");

        jLabel244.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel244.setText("Business Address:");

        jLabel245.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel245.setText("Mailing Address:");

        jLabel258.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel258.setText("Type of Business:");

        jLabel259.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel259.setText("Country:");

        jLabel260.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel260.setText("Profession/Job:");

        jLabel261.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel261.setText("Reason for Migration:");

        jTextField134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField134ActionPerformed(evt);
            }
        });

        jTextField140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField140ActionPerformed(evt);
            }
        });

        jTextField141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField141ActionPerformed(evt);
            }
        });

        jTextField142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField142ActionPerformed(evt);
            }
        });

        jLabel262.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel262.setText("Homebased Business? [");

        jCheckBox247.setText("yes");

        jCheckBox248.setText("no");
        jCheckBox248.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox248ActionPerformed(evt);
            }
        });

        jLabel263.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel263.setText("Financial Assistant Amount:");

        jTextField146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField146ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_housemember10Layout = new javax.swing.GroupLayout(pnl_housemember10);
        pnl_housemember10.setLayout(pnl_housemember10Layout);
        pnl_housemember10Layout.setHorizontalGroup(
            pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_housemember10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel243)
                    .addComponent(jLabel245)
                    .addComponent(jLabel244)
                    .addComponent(jLabel258))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField144, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jTextField145, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField143)
                    .addComponent(jTextField142))
                .addGap(180, 180, 180)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel263)
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addComponent(jLabel262)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox247, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox248))
                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_housemember10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addComponent(jLabel261)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addComponent(jLabel260)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addComponent(jLabel259)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_housemember10Layout.setVerticalGroup(
            pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel243)
                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel262)
                    .addComponent(jCheckBox247)
                    .addComponent(jCheckBox248))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel244)
                    .addComponent(jLabel263))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel245)
                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel258))
                .addGap(47, 47, 47)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel259)
                    .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel260))
                .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_housemember10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel261)))
                    .addGroup(pnl_housemember10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember10, "card11");

        pnl_housemember11.setBackground(new java.awt.Color(255, 255, 255));
        pnl_housemember11.setPreferredSize(new java.awt.Dimension(1047, 664));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jButton89.setText("Save");
        jButton89.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setText("Back");
        jButton90.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(535, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton90, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setText("HOUSEHOLD MEMBER'S LIST");

        jButton69.setText("UPDATE MEMBER");
        jButton69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setText("DELETE MEMBER");
        jButton70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Household No.", "Member Id", "First name", "Last name", "Middle Initial", "Age", "Gender", "position"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout pnl_housemember11Layout = new javax.swing.GroupLayout(pnl_housemember11);
        pnl_housemember11.setLayout(pnl_housemember11Layout);
        pnl_housemember11Layout.setHorizontalGroup(
            pnl_housemember11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnl_housemember11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_housemember11Layout.createSequentialGroup()
                            .addComponent(jScrollPane5)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember11Layout.createSequentialGroup()
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnl_housemember11Layout.setVerticalGroup(
            pnl_housemember11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_housemember11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addGap(56, 56, 56)
                .addGroup(pnl_housemember11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_six.add(pnl_housemember11, "card12");

        pnl_holder.add(pnl_six, "card7");

        jPanel2.setBackground(new java.awt.Color(244, 244, 244));

        jButton3.setBackground(new java.awt.Color(244, 244, 244));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/housefinal.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setOpaque(true);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(244, 244, 244));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/household.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setOpaque(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(244, 244, 244));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/expenses.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(244, 244, 244));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/fourthrow.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(244, 244, 244));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/remove11.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(244, 244, 244));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/comments.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(244, 244, 244));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/persona.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_holder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_holder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(pnl_holder, "1");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cardLayout.show(pnl_holder, "2");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cardLayout.show(pnl_holder, "3");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cardLayout.show(pnl_holder, "4");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        cardLayout.previous(pnl_holder);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cardLayout.next(pnl_holder);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        cardLayout.next(pnl_holder);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        cardLayout.previous(pnl_holder);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardLayout.show(pnl_holder, "5");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(pnl_holder, "6");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        cardLayout1.next(pnl_one);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        cardLayout.next(pnl_holder);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        cardLayout1.previous(pnl_one);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        cardLayout4.next(pnl_three);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        cardLayout.previous(pnl_holder);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        cardLayout.next(pnl_holder);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        cardLayout4.previous(pnl_three);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        cardLayout5.next(pnl_five);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        cardLayout.previous(pnl_holder);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jCheckBox190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox190ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox190ActionPerformed

    private void jCheckBox191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox191ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox191ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        cardLayout.next(pnl_holder);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        cardLayout5.previous(pnl_five);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        cardLayout.previous(pnl_holder);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jCheckBox193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox193ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox193ActionPerformed

    private void jCheckBox194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox194ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox194ActionPerformed

    private void jCheckBox196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox196ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox196ActionPerformed

    private void jCheckBox197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox197ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox197ActionPerformed

    private void jCheckBox199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox199ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox199ActionPerformed

    private void jCheckBox202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox202ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox202ActionPerformed

    private void jCheckBox205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox205ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox205ActionPerformed

    private void jCheckBox206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox206ActionPerformed

    private void jCheckBox207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox207ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox207ActionPerformed

    private void jCheckBox209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox209ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox209ActionPerformed

    private void jCheckBox214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox214ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox214ActionPerformed

    private void jCheckBox215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox215ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox215ActionPerformed

    private void jCheckBox219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox219ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox219ActionPerformed

    private void jCheckBox220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox220ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox220ActionPerformed

    private void jCheckBox221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox221ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox221ActionPerformed

    private void jCheckBox223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox223ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox223ActionPerformed

    private void jCheckBox224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox224ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox224ActionPerformed

    private void jCheckBox226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox226ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox226ActionPerformed

    private void jCheckBox227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox227ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox227ActionPerformed

    private void jCheckBox234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox234ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox234ActionPerformed

    private void jCheckBox235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox235ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox235ActionPerformed

    private void jCheckBox236ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox236ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox236ActionPerformed

    private void jCheckBox238ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox238ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox238ActionPerformed

    private void jTextField129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField129ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField129ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jTextField130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField130ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton86ActionPerformed

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

    private void cb_employment_office_holder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_office_holder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_office_holder1ActionPerformed

    private void cb_employment_ofw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employment_ofw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employment_ofw1ActionPerformed

    private void cb_status_unemployed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_status_unemployed1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_status_unemployed1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jCheckBox246ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox246ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox246ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        cardLayout6.next(pnl_six);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jTextField134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField134ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField134ActionPerformed

    private void jTextField140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField140ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField140ActionPerformed

    private void jTextField141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField141ActionPerformed

    private void jTextField142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField142ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField142ActionPerformed

    private void jCheckBox248ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox248ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox248ActionPerformed

    private void jTextField146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField146ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField146ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        cardLayout6.previous(pnl_six);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void tf_cookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cookingsMouseClicked
        Lightings.cooking(tf_cookings);
    }//GEN-LAST:event_tf_cookingsMouseClicked

    private void tf_water_sourcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_water_sourcesMouseClicked
        Water_sources.wall(tf_water_sources);
    }//GEN-LAST:event_tf_water_sourcesMouseClicked

    private void tf_lightingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lightingMouseClicked
        Lightings.cooking(tf_lighting);
    }//GEN-LAST:event_tf_lightingMouseClicked

    private void tf_barangaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangaysMouseClicked
        Barangays.barangay(tf_barangays);
    }//GEN-LAST:event_tf_barangaysMouseClicked

    private void tf_buildingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_buildingsMouseClicked
        Buildings.building(tf_buildings);
    }//GEN-LAST:event_tf_buildingsMouseClicked

    private void tf_toiletsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_toiletsMouseClicked
        Toilets.toilet(tf_toilets);
    }//GEN-LAST:event_tf_toiletsMouseClicked

    private void tf_bathroomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_bathroomsMouseClicked
        Bathrooms.bathroom(tf_bathrooms);
    }//GEN-LAST:event_tf_bathroomsMouseClicked

    private void tf_disposalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disposalsMouseClicked
        Disposal_methods.disposal(tf_disposals);
    }//GEN-LAST:event_tf_disposalsMouseClicked

    private void tf_kitchensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_kitchensMouseClicked
        Kitchens.kitchen(tf_kitchens);
    }//GEN-LAST:event_tf_kitchensMouseClicked

    private void tf_transportationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_transportationsMouseClicked
        Transportations.transportation(tf_transportations);
    }//GEN-LAST:event_tf_transportationsMouseClicked

    private void tf_roofsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_roofsMouseClicked
        Roofs.roof(tf_roofs);
    }//GEN-LAST:event_tf_roofsMouseClicked

    private void tf_wallsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_wallsMouseClicked
        Walls.wall(tf_walls);
    }//GEN-LAST:event_tf_wallsMouseClicked

    private void tf_floorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_floorsMouseClicked
        Floors.floor(tf_floors);
    }//GEN-LAST:event_tf_floorsMouseClicked

    private void tf_communicationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_communicationsMouseClicked
        Communications.communication(tf_communications);
    }//GEN-LAST:event_tf_communicationsMouseClicked

    private void tf_monthsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_monthsMouseClicked
     Months.months(tf_months);
    }//GEN-LAST:event_tf_monthsMouseClicked

    private void tf_yearsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_yearsMouseClicked
    Years.Years(tf_years);
    }//GEN-LAST:event_tf_yearsMouseClicked

    private void tf_gendersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_gendersMouseClicked
     Genders.Years(tf_genders);
    }//GEN-LAST:event_tf_gendersMouseClicked

    private void tf_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_itemsMouseClicked
     Items.basic_needs(tf_items);
    }//GEN-LAST:event_tf_itemsMouseClicked

    private void tf_months1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_months1MouseClicked
       Months.months(tf_months1);
    }//GEN-LAST:event_tf_months1MouseClicked

    private void tf_religionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_religionsMouseClicked
      Religions.religions(tf_religions);
    }//GEN-LAST:event_tf_religionsMouseClicked

    private void tf_maritalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_maritalsMouseClicked
       Maritals.maritals(tf_maritals);
    }//GEN-LAST:event_tf_maritalsMouseClicked

    private void tf_relationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_relationsMouseClicked
     Relations.relations(tf_relations);
    }//GEN-LAST:event_tf_relationsMouseClicked

    private void tf_disabilitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disabilitiesActionPerformed
     Disabilities.disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesActionPerformed

    private void tf_disabilitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disabilitiesMouseClicked
      Disabilities.disabilities(tf_disabilities);
    }//GEN-LAST:event_tf_disabilitiesMouseClicked

    private void tf_year_graduatedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_year_graduatedMouseClicked
     Years.Years(tf_year_graduated);
    }//GEN-LAST:event_tf_year_graduatedMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tf_religions1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_religions1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_religions1MouseClicked

    private void tf_house_number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_house_number1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_house_number1ActionPerformed

    private void tf_buildingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buildingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buildingsActionPerformed

    /**
     * @param args the command line arguments
     */
//<editor-fold defaultstate="collapsed" desc=" callback ">

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cb_employment_director1;
    private javax.swing.JRadioButton cb_employment_employee1;
    private javax.swing.JRadioButton cb_employment_office_holder1;
    private javax.swing.JRadioButton cb_employment_ofw1;
    private javax.swing.JRadioButton cb_employment_self_employed1;
    private javax.swing.JRadioButton cb_employment_worker1;
    private javax.swing.JCheckBox cb_status_employed1;
    private javax.swing.JCheckBox cb_status_unemployed1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox147;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox150;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox153;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox155;
    private javax.swing.JCheckBox jCheckBox156;
    private javax.swing.JCheckBox jCheckBox157;
    private javax.swing.JCheckBox jCheckBox158;
    private javax.swing.JCheckBox jCheckBox159;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox160;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox162;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox165;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox168;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox171;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox173;
    private javax.swing.JCheckBox jCheckBox174;
    private javax.swing.JCheckBox jCheckBox175;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox177;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox180;
    private javax.swing.JCheckBox jCheckBox181;
    private javax.swing.JCheckBox jCheckBox182;
    private javax.swing.JCheckBox jCheckBox183;
    private javax.swing.JCheckBox jCheckBox184;
    private javax.swing.JCheckBox jCheckBox185;
    private javax.swing.JCheckBox jCheckBox186;
    private javax.swing.JCheckBox jCheckBox187;
    private javax.swing.JCheckBox jCheckBox188;
    private javax.swing.JCheckBox jCheckBox189;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox190;
    private javax.swing.JCheckBox jCheckBox191;
    private javax.swing.JCheckBox jCheckBox192;
    private javax.swing.JCheckBox jCheckBox193;
    private javax.swing.JCheckBox jCheckBox194;
    private javax.swing.JCheckBox jCheckBox195;
    private javax.swing.JCheckBox jCheckBox196;
    private javax.swing.JCheckBox jCheckBox197;
    private javax.swing.JCheckBox jCheckBox198;
    private javax.swing.JCheckBox jCheckBox199;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox200;
    private javax.swing.JCheckBox jCheckBox201;
    private javax.swing.JCheckBox jCheckBox202;
    private javax.swing.JCheckBox jCheckBox203;
    private javax.swing.JCheckBox jCheckBox204;
    private javax.swing.JCheckBox jCheckBox205;
    private javax.swing.JCheckBox jCheckBox206;
    private javax.swing.JCheckBox jCheckBox207;
    private javax.swing.JCheckBox jCheckBox208;
    private javax.swing.JCheckBox jCheckBox209;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox210;
    private javax.swing.JCheckBox jCheckBox211;
    private javax.swing.JCheckBox jCheckBox212;
    private javax.swing.JCheckBox jCheckBox213;
    private javax.swing.JCheckBox jCheckBox214;
    private javax.swing.JCheckBox jCheckBox215;
    private javax.swing.JCheckBox jCheckBox216;
    private javax.swing.JCheckBox jCheckBox217;
    private javax.swing.JCheckBox jCheckBox218;
    private javax.swing.JCheckBox jCheckBox219;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox220;
    private javax.swing.JCheckBox jCheckBox221;
    private javax.swing.JCheckBox jCheckBox222;
    private javax.swing.JCheckBox jCheckBox223;
    private javax.swing.JCheckBox jCheckBox224;
    private javax.swing.JCheckBox jCheckBox225;
    private javax.swing.JCheckBox jCheckBox226;
    private javax.swing.JCheckBox jCheckBox227;
    private javax.swing.JCheckBox jCheckBox228;
    private javax.swing.JCheckBox jCheckBox229;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox230;
    private javax.swing.JCheckBox jCheckBox231;
    private javax.swing.JCheckBox jCheckBox232;
    private javax.swing.JCheckBox jCheckBox233;
    private javax.swing.JCheckBox jCheckBox234;
    private javax.swing.JCheckBox jCheckBox235;
    private javax.swing.JCheckBox jCheckBox236;
    private javax.swing.JCheckBox jCheckBox237;
    private javax.swing.JCheckBox jCheckBox238;
    private javax.swing.JCheckBox jCheckBox239;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox240;
    private javax.swing.JCheckBox jCheckBox241;
    private javax.swing.JCheckBox jCheckBox242;
    private javax.swing.JCheckBox jCheckBox243;
    private javax.swing.JCheckBox jCheckBox244;
    private javax.swing.JCheckBox jCheckBox245;
    private javax.swing.JCheckBox jCheckBox246;
    private javax.swing.JCheckBox jCheckBox247;
    private javax.swing.JCheckBox jCheckBox248;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
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
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
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
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable18;
    private javax.swing.JTable jTable19;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField134;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
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
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JLabel lbl_barangay1;
    private javax.swing.JLabel lbl_basic_Information1;
    private javax.swing.JLabel lbl_facilities2;
    private javax.swing.JLabel lbl_facilities3;
    private javax.swing.JLabel lbl_house_condition2;
    private javax.swing.JLabel lbl_house_condition3;
    private javax.swing.JLabel lbl_house_number1;
    private javax.swing.JLabel lbl_no_rooms1;
    private javax.swing.JLabel lbl_purok1;
    private javax.swing.JPanel pnl_Basicinfo2;
    private javax.swing.JPanel pnl_Basicnfo1;
    private javax.swing.JPanel pnl_consumption1;
    private javax.swing.JPanel pnl_consumption2;
    private javax.swing.JPanel pnl_five;
    private javax.swing.JPanel pnl_four;
    private javax.swing.JPanel pnl_holder;
    private javax.swing.JPanel pnl_housemember1;
    private javax.swing.JPanel pnl_housemember10;
    private javax.swing.JPanel pnl_housemember11;
    private javax.swing.JPanel pnl_housemember2;
    private javax.swing.JPanel pnl_housemember3;
    private javax.swing.JPanel pnl_housemember4;
    private javax.swing.JPanel pnl_housemember5;
    private javax.swing.JPanel pnl_housemember6;
    private javax.swing.JPanel pnl_housemember7;
    private javax.swing.JPanel pnl_housemember8;
    private javax.swing.JPanel pnl_housemember9;
    private javax.swing.JPanel pnl_one;
    private javax.swing.JPanel pnl_services1;
    private javax.swing.JPanel pnl_services2;
    private javax.swing.JPanel pnl_six;
    private javax.swing.JPanel pnl_three;
    private javax.swing.JPanel pnl_two;
    private javax.swing.JPanel pnl_twoA;
    private javax.swing.JPanel pnl_twoA1;
    private javax.swing.JPanel pnl_twoA2;
    private javax.swing.JPanel pnl_twoA3;
    private javax.swing.JPanel pnl_twoA5;
    private javax.swing.JTextField tf_barangays;
    private javax.swing.JTextField tf_bathrooms;
    private javax.swing.JTextField tf_buildings;
    private javax.swing.JTextField tf_communications;
    private javax.swing.JTextField tf_compartments;
    private javax.swing.JTextField tf_compartments1;
    private javax.swing.JTextField tf_cookings;
    private javax.swing.JTextField tf_disabilities;
    private javax.swing.JTextField tf_disposals;
    private javax.swing.JTextField tf_floors;
    private javax.swing.JTextField tf_genders;
    private javax.swing.JTextField tf_house_number1;
    private javax.swing.JTextField tf_items;
    private javax.swing.JTextField tf_kitchens;
    private javax.swing.JTextField tf_lighting;
    private javax.swing.JTextField tf_maritals;
    private javax.swing.JTextField tf_months;
    private javax.swing.JTextField tf_months1;
    private javax.swing.JTextField tf_no_rooms1;
    private javax.swing.JTextField tf_purk1;
    private javax.swing.JTextField tf_relations;
    private javax.swing.JTextField tf_religions;
    private javax.swing.JTextField tf_religions1;
    private javax.swing.JTextField tf_roofs;
    private javax.swing.JTextField tf_street1;
    private javax.swing.JTextField tf_toilets;
    private javax.swing.JTextField tf_transportations;
    private javax.swing.JTextField tf_walls;
    private javax.swing.JTextField tf_water_sources;
    private javax.swing.JTextField tf_year_graduated;
    private javax.swing.JTextField tf_years;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    private void myInit() {
        init_key();
        init_drag();
        hover();
        init_panel_layout();
        init_panel_layout1();
        init_panel_layout4();
        init_panel_layout5();
        init_panel_layout6();
    }

    CardLayout cardLayout = new CardLayout();
    CardLayout cardLayout1 = new CardLayout();
    CardLayout cardLayout2 = new CardLayout();
    CardLayout cardLayout3 = new CardLayout();
    CardLayout cardLayout4 = new CardLayout();
    CardLayout cardLayout5 = new CardLayout();
    CardLayout cardLayout6 = new CardLayout();

    private void init_panel_layout6() {
        cardLayout6 = (CardLayout) pnl_six.getLayout();
        cardLayout6.addLayoutComponent("22", pnl_housemember1);
        cardLayout6.addLayoutComponent("23", pnl_housemember2);
        cardLayout6.addLayoutComponent("24", pnl_housemember4);
        cardLayout6.addLayoutComponent("25", pnl_housemember5);
        cardLayout6.addLayoutComponent("26", pnl_housemember6);
        cardLayout6.addLayoutComponent("27", pnl_housemember7);
        cardLayout6.addLayoutComponent("28", pnl_housemember8);
        cardLayout6.addLayoutComponent("29", pnl_housemember9);
        cardLayout6.addLayoutComponent("30", pnl_housemember10);
        cardLayout6.addLayoutComponent("31", pnl_housemember11);
    }

    private void init_panel_layout5() {
        cardLayout5 = (CardLayout) pnl_five.getLayout();
        cardLayout5.addLayoutComponent("19", pnl_services1);
        cardLayout5.addLayoutComponent("20", pnl_services2);
    }

    private void init_panel_layout4() {
        cardLayout4 = (CardLayout) pnl_three.getLayout();
        cardLayout4.addLayoutComponent("17", pnl_consumption1);
        cardLayout4.addLayoutComponent("18", pnl_consumption2);
    }

    private void init_panel_layout1() {
        cardLayout1 = (CardLayout) pnl_one.getLayout();
        cardLayout1.addLayoutComponent("11", pnl_Basicnfo1);
        cardLayout1.addLayoutComponent("12", pnl_Basicinfo2);
    }

    private void init_panel_layout() {
        cardLayout = (CardLayout) pnl_holder.getLayout();
        cardLayout.addLayoutComponent("1", pnl_one);
        cardLayout.addLayoutComponent("2", pnl_two);
        cardLayout.addLayoutComponent("3", pnl_three);
        cardLayout.addLayoutComponent("4", pnl_four);
        cardLayout.addLayoutComponent("5", pnl_five);
        cardLayout.addLayoutComponent("6", pnl_six);

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
           System.exit(0);
            }
        });
    }
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" drag dialog ">
    int posX = 0, posY = 0;

    private void init_drag() {
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseDragged(MouseEvent evt) {
                setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
            }
        });
    }
//</editor-fold>

    private void hover() {
        JButton[] btns = {jButton3, jButton4, jButton5, jButton6, jButton7, jButton1, jButton2};
        for (final JButton btn : btns) {
            btn.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(4, 176, 217));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new java.awt.Color(244, 244, 244));
                }

            });
        }

    }

}
