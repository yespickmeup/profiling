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
import static city_planning.initialize_fields.Initialize_house_field_types.roofs;
import static city_planning.initialize_fields.Initialize_household_member_field_types.blood_types;
import city_planning.marital_statuses.Marital_statuses;
import city_planning.religions.Religions;
import city_planning.roof_types.Roof_types;
import city_planning.tenure.Tenure;
import city_planning.util.CheckBox;
import city_planning.util.TableCheckBoxRenderer;
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
    static List<Genders.to_genders> suffixes = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> marital_statuses = new ArrayList();
    static List<Blood_types.to_blood_types> blood_types = new ArrayList();
    static List<Household_relations.to_household_relations> household_relations = new ArrayList();
    static List<Religions.to_religions> religions = new ArrayList();
    static List<Roof_types.to_roof_types> languages_spoken = new ArrayList();
    static List<Tenure.to_tenure> tenures = new ArrayList();
    public static void ret_data() {

        disabilities = Disabilities.ret_data(" order by disability asc ");
        religions = Religions.ret_data("order by religion asc");

        Genders.to_genders g1 = new Genders.to_genders(0, "Male");
        Genders.to_genders g2 = new Genders.to_genders(0, "Female");
        genders.add(g1);
        genders.add(g2);
        Genders.to_genders s1 = new Genders.to_genders(0, "Jr.");
        Genders.to_genders s2 = new Genders.to_genders(0, "Sr.");
        Genders.to_genders s3 = new Genders.to_genders(0, "I.");
        Genders.to_genders s4 = new Genders.to_genders(0, "II.");
        Genders.to_genders s5 = new Genders.to_genders(0, "III.");
        Genders.to_genders s6 = new Genders.to_genders(0, "IV.");
        Genders.to_genders s7 = new Genders.to_genders(0, "X.");
        Genders.to_genders s8 = new Genders.to_genders(0, "IX.");
        suffixes.add(s1);
        suffixes.add(s2);
        suffixes.add(s3);
        suffixes.add(s4);
        suffixes.add(s5);
        suffixes.add(s6);
        suffixes.add(s7);
        suffixes.add(s8);

        Marital_statuses.to_marital_statuses ms1 = new Marital_statuses.to_marital_statuses(0, "Single");
        Marital_statuses.to_marital_statuses ms2 = new Marital_statuses.to_marital_statuses(0, "Married");
        Marital_statuses.to_marital_statuses ms3 = new Marital_statuses.to_marital_statuses(0, "Annulled");
        marital_statuses.add(ms1);
        marital_statuses.add(ms2);
        marital_statuses.add(ms3);
        
        
        Tenure.to_tenure ten1 = new Tenure.to_tenure(0, "0");
        Tenure.to_tenure ten2 = new Tenure.to_tenure(0, "1");
        Tenure.to_tenure ten3 = new Tenure.to_tenure(0, "2");
        Tenure.to_tenure ten4 = new Tenure.to_tenure(0, "3");
        Tenure.to_tenure ten5 = new Tenure.to_tenure(0, "4");
        Tenure.to_tenure ten6 = new Tenure.to_tenure(0, "5");
        Tenure.to_tenure ten7 = new Tenure.to_tenure(0, "6");
        Tenure.to_tenure ten8 = new Tenure.to_tenure(0, "7");
        Tenure.to_tenure ten9 = new Tenure.to_tenure(0, "8");
        Tenure.to_tenure ten10 = new Tenure.to_tenure(0, "9");
        Tenure.to_tenure ten11 = new Tenure.to_tenure(0, "10");
        Tenure.to_tenure ten12 = new Tenure.to_tenure(0, "11");
        Tenure.to_tenure ten13 = new Tenure.to_tenure(0, "12");
        Tenure.to_tenure ten14 = new Tenure.to_tenure(0, "13");
        Tenure.to_tenure ten15 = new Tenure.to_tenure(0, "14");
        Tenure.to_tenure ten16 = new Tenure.to_tenure(0, "15");
        Tenure.to_tenure ten17 = new Tenure.to_tenure(0, "16");
        Tenure.to_tenure ten18 = new Tenure.to_tenure(0, "17");
        Tenure.to_tenure ten19 = new Tenure.to_tenure(0, "18");
        Tenure.to_tenure ten20 = new Tenure.to_tenure(0, "19");
        Tenure.to_tenure ten21 = new Tenure.to_tenure(0, "20");
        Tenure.to_tenure ten22 = new Tenure.to_tenure(0, "21");
        Tenure.to_tenure ten23 = new Tenure.to_tenure(0, "22");
        Tenure.to_tenure ten24 = new Tenure.to_tenure(0, "23");
        Tenure.to_tenure ten25 = new Tenure.to_tenure(0, "24");
        Tenure.to_tenure ten26 = new Tenure.to_tenure(0, "25");
        Tenure.to_tenure ten27 = new Tenure.to_tenure(0, "26");
        Tenure.to_tenure ten28 = new Tenure.to_tenure(0, "27");
        Tenure.to_tenure ten29 = new Tenure.to_tenure(0, "28");
        Tenure.to_tenure ten30 = new Tenure.to_tenure(0, "29");
        Tenure.to_tenure ten31 = new Tenure.to_tenure(0, "30");
        Tenure.to_tenure ten32 = new Tenure.to_tenure(0, "31");
        Tenure.to_tenure ten33 = new Tenure.to_tenure(0, "32");
        Tenure.to_tenure ten34 = new Tenure.to_tenure(0, "33");
        Tenure.to_tenure ten35 = new Tenure.to_tenure(0, "34");
        Tenure.to_tenure ten36 = new Tenure.to_tenure(0, "35");
        Tenure.to_tenure ten37 = new Tenure.to_tenure(0, "36");
        Tenure.to_tenure ten38 = new Tenure.to_tenure(0, "37");
        Tenure.to_tenure ten39 = new Tenure.to_tenure(0, "38");
        Tenure.to_tenure ten40 = new Tenure.to_tenure(0, "39");
        Tenure.to_tenure ten41 = new Tenure.to_tenure(0, "40");
        Tenure.to_tenure ten42 = new Tenure.to_tenure(0, "41");
        Tenure.to_tenure ten43 = new Tenure.to_tenure(0, "42");
        Tenure.to_tenure ten44 = new Tenure.to_tenure(0, "43");
        Tenure.to_tenure ten45 = new Tenure.to_tenure(0, "44");
        Tenure.to_tenure ten46 = new Tenure.to_tenure(0, "45");
        Tenure.to_tenure ten47 = new Tenure.to_tenure(0, "46");
        Tenure.to_tenure ten48 = new Tenure.to_tenure(0, "47");
        Tenure.to_tenure ten49 = new Tenure.to_tenure(0, "48");
        Tenure.to_tenure ten50 = new Tenure.to_tenure(0, "49");
        Tenure.to_tenure ten51 = new Tenure.to_tenure(0, "50");
        Tenure.to_tenure ten52 = new Tenure.to_tenure(0, "51");
        Tenure.to_tenure ten53 = new Tenure.to_tenure(0, "52");
        Tenure.to_tenure ten54 = new Tenure.to_tenure(0, "53");
        Tenure.to_tenure ten55 = new Tenure.to_tenure(0, "54");
        Tenure.to_tenure ten56 = new Tenure.to_tenure(0, "55");
        Tenure.to_tenure ten57 = new Tenure.to_tenure(0, "56");
        Tenure.to_tenure ten58 = new Tenure.to_tenure(0, "57");
        Tenure.to_tenure ten59 = new Tenure.to_tenure(0, "58");
        Tenure.to_tenure ten60 = new Tenure.to_tenure(0, "59");
        Tenure.to_tenure ten61 = new Tenure.to_tenure(0, "60");
        Tenure.to_tenure ten62 = new Tenure.to_tenure(0, "61");
        Tenure.to_tenure ten63 = new Tenure.to_tenure(0, "62");
        Tenure.to_tenure ten64 = new Tenure.to_tenure(0, "63");
        Tenure.to_tenure ten65 = new Tenure.to_tenure(0, "64");
        Tenure.to_tenure ten66 = new Tenure.to_tenure(0, "65");
        Tenure.to_tenure ten67 = new Tenure.to_tenure(0, "66");
        Tenure.to_tenure ten68 = new Tenure.to_tenure(0, "67");
        Tenure.to_tenure ten69 = new Tenure.to_tenure(0, "68");
        Tenure.to_tenure ten70 = new Tenure.to_tenure(0, "69");
        Tenure.to_tenure ten71 = new Tenure.to_tenure(0, "70");
        Tenure.to_tenure ten72 = new Tenure.to_tenure(0, "71");
        Tenure.to_tenure ten73 = new Tenure.to_tenure(0, "72");
        Tenure.to_tenure ten74 = new Tenure.to_tenure(0, "73");
        Tenure.to_tenure ten75 = new Tenure.to_tenure(0, "74");
        Tenure.to_tenure ten76 = new Tenure.to_tenure(0, "75");
        Tenure.to_tenure ten77 = new Tenure.to_tenure(0, "76");
        Tenure.to_tenure ten78 = new Tenure.to_tenure(0, "77");
        Tenure.to_tenure ten79 = new Tenure.to_tenure(0, "78");
        Tenure.to_tenure ten80 = new Tenure.to_tenure(0, "79");
        Tenure.to_tenure ten81 = new Tenure.to_tenure(0, "80");
        Tenure.to_tenure ten82 = new Tenure.to_tenure(0, "81");
        Tenure.to_tenure ten83 = new Tenure.to_tenure(0, "82");
        Tenure.to_tenure ten84 = new Tenure.to_tenure(0, "83");
        Tenure.to_tenure ten85 = new Tenure.to_tenure(0, "84");
        Tenure.to_tenure ten86 = new Tenure.to_tenure(0, "85");
        Tenure.to_tenure ten87 = new Tenure.to_tenure(0, "86");
        Tenure.to_tenure ten88 = new Tenure.to_tenure(0, "87");
        Tenure.to_tenure ten89 = new Tenure.to_tenure(0, "88");
        Tenure.to_tenure ten90 = new Tenure.to_tenure(0, "89");
        Tenure.to_tenure ten91 = new Tenure.to_tenure(0, "90");
        Tenure.to_tenure ten92 = new Tenure.to_tenure(0, "91");
        Tenure.to_tenure ten93 = new Tenure.to_tenure(0, "92");
        Tenure.to_tenure ten94 = new Tenure.to_tenure(0, "93");
        Tenure.to_tenure ten95 = new Tenure.to_tenure(0, "94");
        Tenure.to_tenure ten96 = new Tenure.to_tenure(0, "95");
        Tenure.to_tenure ten97 = new Tenure.to_tenure(0, "96");
        Tenure.to_tenure ten98 = new Tenure.to_tenure(0, "97");
        Tenure.to_tenure ten99 = new Tenure.to_tenure(0, "98");
        Tenure.to_tenure ten100 = new Tenure.to_tenure(0, "99");
        Tenure.to_tenure ten101 = new Tenure.to_tenure(0, "100");
        
        tenures.add(ten1);
        tenures.add(ten2);
        tenures.add(ten3);
        tenures.add(ten4);
        tenures.add(ten5);
        tenures.add(ten6);
        tenures.add(ten7);
        tenures.add(ten8);
        tenures.add(ten9);
        tenures.add(ten10);
        tenures.add(ten11);
        tenures.add(ten12);
        tenures.add(ten13);
        tenures.add(ten14);
        tenures.add(ten15);
        tenures.add(ten16);
        tenures.add(ten17);
        tenures.add(ten18);
        tenures.add(ten19);
        tenures.add(ten20);
        tenures.add(ten21);
        tenures.add(ten22);
        tenures.add(ten23);
        tenures.add(ten24);
        tenures.add(ten25);
        tenures.add(ten26);
        tenures.add(ten27);
        tenures.add(ten28);
        tenures.add(ten29);
        tenures.add(ten30);
        tenures.add(ten31);
        tenures.add(ten32);
        tenures.add(ten33);
        tenures.add(ten34);
        tenures.add(ten35);
        tenures.add(ten36);
        tenures.add(ten37);
        tenures.add(ten38);
        tenures.add(ten39);
        tenures.add(ten40);
        tenures.add(ten41);
        tenures.add(ten42);
        tenures.add(ten43);
        tenures.add(ten44);
        tenures.add(ten45);
        tenures.add(ten46);
        tenures.add(ten47);
        tenures.add(ten48);
        tenures.add(ten49);
        tenures.add(ten50);
        tenures.add(ten51);
        tenures.add(ten52);
        tenures.add(ten53);
        tenures.add(ten54);
        tenures.add(ten55);
        tenures.add(ten56);
        tenures.add(ten57);
        tenures.add(ten58);
        tenures.add(ten59);
        tenures.add(ten60);
        tenures.add(ten61);
        tenures.add(ten62);
        tenures.add(ten63);
        tenures.add(ten64);
        tenures.add(ten65);
        tenures.add(ten66);
        tenures.add(ten67);
        tenures.add(ten68);
        tenures.add(ten69);
        tenures.add(ten70);
        tenures.add(ten71);
        tenures.add(ten72);
        tenures.add(ten73);
        tenures.add(ten74);
        tenures.add(ten75);
        tenures.add(ten76);
        tenures.add(ten77);
        tenures.add(ten78);
        tenures.add(ten79);
        tenures.add(ten80);
        tenures.add(ten81);
        tenures.add(ten82);
        tenures.add(ten83);
        tenures.add(ten84);
        tenures.add(ten85);
        tenures.add(ten86);
        tenures.add(ten87);
        tenures.add(ten88);
        tenures.add(ten89);
        tenures.add(ten90);
        tenures.add(ten91);
        tenures.add(ten92);
        tenures.add(ten93);
        tenures.add(ten94);
        tenures.add(ten95);
        tenures.add(ten96);
        tenures.add(ten97);
        tenures.add(ten98);
        tenures.add(ten99);
        tenures.add(ten100);
        tenures.add(ten101);
      
        
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
        Household_relations.to_household_relations thr9 = new Household_relations.to_household_relations(0, "Aunt");
        Household_relations.to_household_relations thr10 = new Household_relations.to_household_relations(0, "Uncle");

        household_relations.add(thr1);
        household_relations.add(thr2);
        household_relations.add(thr3);
        household_relations.add(thr4);
        household_relations.add(thr5);
        household_relations.add(thr6);
        household_relations.add(thr7);
        household_relations.add(thr8);
        household_relations.add(thr9);
        household_relations.add(thr10);

        Roof_types.to_roof_types ls = new Roof_types.to_roof_types(0, "English", false);
        Roof_types.to_roof_types ls1 = new Roof_types.to_roof_types(0, "Cebuano", false);
        Roof_types.to_roof_types ls2 = new Roof_types.to_roof_types(0, "Tagalog", false);
        Roof_types.to_roof_types ls3 = new Roof_types.to_roof_types(0, "Ilokano", false);
        Roof_types.to_roof_types ls4 = new Roof_types.to_roof_types(0, "Hiligaynon", false);
        Roof_types.to_roof_types ls5 = new Roof_types.to_roof_types(0, "Waray-Waray", false);

        Roof_types.to_roof_types ls6 = new Roof_types.to_roof_types(0, "Kapampangan", false);
        Roof_types.to_roof_types ls7 = new Roof_types.to_roof_types(0, "Bikol", false);
        Roof_types.to_roof_types ls8 = new Roof_types.to_roof_types(0, "Albay bikol", false);
        Roof_types.to_roof_types ls9 = new Roof_types.to_roof_types(0, "Pangasinan", false);
        Roof_types.to_roof_types ls10 = new Roof_types.to_roof_types(0, "Maranao", false);

        Roof_types.to_roof_types ls11 = new Roof_types.to_roof_types(0, "Maguindanao", false);
        Roof_types.to_roof_types ls12 = new Roof_types.to_roof_types(0, "Kinaray-a", false);
        Roof_types.to_roof_types ls13 = new Roof_types.to_roof_types(0, "Tausug", false);

        languages_spoken.add(ls);
        languages_spoken.add(ls1);
        languages_spoken.add(ls2);
        languages_spoken.add(ls3);
        languages_spoken.add(ls4);
        languages_spoken.add(ls5);

        languages_spoken.add(ls6);
        languages_spoken.add(ls7);
        languages_spoken.add(ls8);
        languages_spoken.add(ls9);
        languages_spoken.add(ls10);

        languages_spoken.add(ls11);
        languages_spoken.add(ls12);
        languages_spoken.add(ls13);

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

    public static void init_suffixes(final JTextField tf) {

        Object[][] obj = new Object[suffixes.size()][1];
        int i = 0;
        for (Genders.to_genders to : suffixes) {
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
                Genders.to_genders to = suffixes.get(data.selected_row);
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
    //<editor-fold defaultstate="collapsed" desc=" Tenure "> 
     public static void init_tenure(final JTextField tf) {

      
        Object[][] obj = new Object[tenures.size()][1];
        int i = 0;
        for (Tenure.to_tenure to : tenures) {
            obj[i][0] = " " + to.tenure;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Year"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Tenure.to_tenure to = tenures.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.tenure);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Languages spoken ">
    public static void init_languages(final JTextField tf) {

        Object[][] obj = new Object[languages_spoken.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Roof_types.to_roof_types to : languages_spoken) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.roof_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.roof_type;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Roof_types.to_roof_types to = languages_spoken.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.roof_type);
                field.setId("" + to.id);
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
                tf.setText(values);

            }
        });
    }

    //</editor-fold> 
}
