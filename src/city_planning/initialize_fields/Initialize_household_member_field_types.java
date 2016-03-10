/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.initialize_fields;

import city_planning.blood_types.Blood_types;
import city_planning.disabilities.Disabilities;
import city_planning.genders.Genders;
import city_planning.household_relations.Household_relations;
import static city_planning.initialize_fields.Initialize_household_member_field_types.blood_types;
import city_planning.marital_statuses.Marital_statuses;
import city_planning.religions.Religions;
import city_planning.util.TableRenderer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Initialize_household_member_field_types {

    static List<Disabilities.to_disabilities> disabilities = new ArrayList();
    static List<Genders.to_genders> genders = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> marital_statuses = new ArrayList();
    static List<Blood_types.to_blood_types> blood_types = new ArrayList();
    static List<Household_relations.to_household_relations> household_relations = new ArrayList();
    static List<Religions.to_religions> religions = new ArrayList();
    

    public static void ret_data() {

        disabilities = Disabilities.ret_data(" order by disability asc ");
        religions = Religions.ret_data("order by religion asc");
        

        Genders.to_genders g1 = new Genders.to_genders(0, "Male");
        Genders.to_genders g2 = new Genders.to_genders(0, "Female");
        genders.add(g1);
        genders.add(g2);


        Marital_statuses.to_marital_statuses ms1 = new Marital_statuses.to_marital_statuses(0, "Single");
        Marital_statuses.to_marital_statuses ms2 = new Marital_statuses.to_marital_statuses(0, "Married");
        Marital_statuses.to_marital_statuses ms3 = new Marital_statuses.to_marital_statuses(0, "Annulled");
        marital_statuses.add(ms1);
        marital_statuses.add(ms2);
        marital_statuses.add(ms3);

        Blood_types.to_blood_types tbt1 = new Blood_types.to_blood_types(0, "O+");
        Blood_types.to_blood_types tbt2 = new Blood_types.to_blood_types(0, "O-");
        Blood_types.to_blood_types tbt3 = new Blood_types.to_blood_types(0, "A+");
        Blood_types.to_blood_types tbt4 = new Blood_types.to_blood_types(0, "A-");
        Blood_types.to_blood_types tbt5 = new Blood_types.to_blood_types(0, "B+");
        Blood_types.to_blood_types tbt6 = new Blood_types.to_blood_types(0, "B-");
        Blood_types.to_blood_types tbt7 = new Blood_types.to_blood_types(0, "AB+");
        Blood_types.to_blood_types tbt8 = new Blood_types.to_blood_types(0, "AB-");
        blood_types.add(tbt1);
        blood_types.add(tbt2);
        blood_types.add(tbt3);
        blood_types.add(tbt4);
        blood_types.add(tbt5);
        blood_types.add(tbt6);
        blood_types.add(tbt7);
        blood_types.add(tbt8);

        Household_relations.to_household_relations thr1 = new Household_relations.to_household_relations(0, "Father");
        Household_relations.to_household_relations thr2 = new Household_relations.to_household_relations(0, "Mother");
        Household_relations.to_household_relations thr3 = new Household_relations.to_household_relations(0, "Son");
        Household_relations.to_household_relations thr4 = new Household_relations.to_household_relations(0, "Daughter");
        Household_relations.to_household_relations thr5 = new Household_relations.to_household_relations(0, "GrandFather");
        Household_relations.to_household_relations thr6 = new Household_relations.to_household_relations(0, "GrandMother");
        Household_relations.to_household_relations thr7 = new Household_relations.to_household_relations(0, "Nephew");
        Household_relations.to_household_relations thr8 = new Household_relations.to_household_relations(0, "Niece");

        household_relations.add(thr1);
        household_relations.add(thr2);
        household_relations.add(thr3);
        household_relations.add(thr4);
        household_relations.add(thr5);
        household_relations.add(thr6);
        household_relations.add(thr7);
        household_relations.add(thr8);

    }

    //<editor-fold defaultstate="collapsed" desc=" Disabilities "> 
    public static void init_disabilities(final JTextField tf) {

        Object[][] obj = new Object[disabilities.size()][1];
        int i = 0;
        for (Disabilities.to_disabilities to : disabilities) {
            obj[i][0] = " " + to.disability;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Disabilities.to_disabilities to = disabilities.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.disability);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Genders "> 

    public static void init_genders(final JTextField tf) {

        Object[][] obj = new Object[genders.size()][1];
        int i = 0;
        for (Genders.to_genders to : genders) {
            obj[i][0] = " " + to.gender;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Genders.to_genders to = genders.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.gender);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Marital_statuses "> 

    public static void init_marital_statuses(final JTextField tf) {

        Object[][] obj = new Object[marital_statuses.size()][1];
        int i = 0;
        for (Marital_statuses.to_marital_statuses to : marital_statuses) {
            obj[i][0] = " " + to.marital_status;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Marital_statuses.to_marital_statuses to = marital_statuses.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Blood_types "> 

    public static void init_blood_types(final JTextField tf) {

        Object[][] obj = new Object[blood_types.size()][1];
        int i = 0;
        for (Blood_types.to_blood_types to : blood_types) {
            obj[i][0] = " " + to.blood_type;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Blood_types.to_blood_types to = blood_types.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.blood_type);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Household_relations "> 

    public static void init_household_relations(final JTextField tf) {

        Object[][] obj = new Object[household_relations.size()][1];
        int i = 0;
        for (Household_relations.to_household_relations to : household_relations) {
            obj[i][0] = " " + to.household_relation;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Household_relations.to_household_relations to = household_relations.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.household_relation);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Religions "> 

    public static void init_religions(final JTextField tf) {

        Object[][] obj = new Object[religions.size()][1];
        int i = 0;
        for (Religions.to_religions to : religions) {
            obj[i][0] = " " + to.religion;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Religions.to_religions to = religions.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.religion);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    }
