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
import city_planning.medical_diseases.Medical_diseases;
import city_planning.mental_problems.Mental_problems;
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
    static List<Tenure.to_tenure> tenure_years = new ArrayList();
    static List<Tenure.to_tenure> tenure_months = new ArrayList();
    static List<Medical_diseases.to_medical_diseases> medical_diseases = new ArrayList();
    static List<Mental_problems.to_mental_problems> mental_problems = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> displacements = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> programs = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> indigenous = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> family_planning = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> tb_program = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> tb_program_treatment = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> natality_attended_by = new ArrayList();
    static List<Marital_statuses.to_marital_statuses> natality_place_of_delivery = new ArrayList();

    public static void ret_data_disabilities() {
        disabilities = Disabilities.ret_data(" order by disability asc ");
    }

    public static void ret_data() {

        disabilities = Disabilities.ret_data(" order by disability asc ");
        religions = Religions.ret_data("order by religion asc");
        medical_diseases = Medical_diseases.ret_data("order by medical_disease asc");
        mental_problems = Mental_problems.ret_data("order by mental_problem asc");
        //<editor-fold defaultstate="collapsed" desc=" genders ">
        Genders.to_genders g1 = new Genders.to_genders(0, "Male");
        Genders.to_genders g2 = new Genders.to_genders(0, "Female");
        genders.add(g1);
        genders.add(g2);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" suffixes ">
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
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" marital status ">
        Marital_statuses.to_marital_statuses ms1 = new Marital_statuses.to_marital_statuses(0, "Single");
        Marital_statuses.to_marital_statuses ms2 = new Marital_statuses.to_marital_statuses(0, "Married");
        Marital_statuses.to_marital_statuses ms3 = new Marital_statuses.to_marital_statuses(0, "Annulled");
        marital_statuses.add(ms1);
        marital_statuses.add(ms2);
        marital_statuses.add(ms3);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" tenure ">
        for (int i = 1; i <= 100; i++) {
            Tenure.to_tenure ten = new Tenure.to_tenure(0, "" + i);
            tenure_years.add(ten);
        }
        for (int i = 1; i <= 12; i++) {
            Tenure.to_tenure ten = new Tenure.to_tenure(0, "" + i);
            tenure_months.add(ten);
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" blood types ">
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
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" household relations ">
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
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" languages spoken ">
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
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" displacements ">
        Marital_statuses.to_marital_statuses d1 = new Marital_statuses.to_marital_statuses(0, "Natural/Manmade Disaster");
        Marital_statuses.to_marital_statuses d2 = new Marital_statuses.to_marital_statuses(0, "Armed Conflict");
        Marital_statuses.to_marital_statuses d3 = new Marital_statuses.to_marital_statuses(0, "Infrastructure Development Project");
        Marital_statuses.to_marital_statuses d4 = new Marital_statuses.to_marital_statuses(0, "Other");
        displacements.add(d1);
        displacements.add(d2);
        displacements.add(d3);
        displacements.add(d4);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" programs and services ">
        Marital_statuses.to_marital_statuses ps1 = new Marital_statuses.to_marital_statuses(0, "Scholarship");
        Marital_statuses.to_marital_statuses ps2 = new Marital_statuses.to_marital_statuses(0, "Day Care Service/ECCD");
        Marital_statuses.to_marital_statuses ps3 = new Marital_statuses.to_marital_statuses(0, "Supplemental Feeding");
        Marital_statuses.to_marital_statuses ps4 = new Marital_statuses.to_marital_statuses(0, "Subsidized Rice");
        Marital_statuses.to_marital_statuses ps5 = new Marital_statuses.to_marital_statuses(0, "Philhealth");
        Marital_statuses.to_marital_statuses ps6 = new Marital_statuses.to_marital_statuses(0, "Skills/Livelihood Training");
        Marital_statuses.to_marital_statuses ps7 = new Marital_statuses.to_marital_statuses(0, "Housing");
        Marital_statuses.to_marital_statuses ps8 = new Marital_statuses.to_marital_statuses(0, "Microcredit");
        Marital_statuses.to_marital_statuses ps9 = new Marital_statuses.to_marital_statuses(0, "Self-Employment Assistance");
        Marital_statuses.to_marital_statuses ps10 = new Marital_statuses.to_marital_statuses(0, "Pantawid Pamilya");
        programs.add(ps1);
        programs.add(ps2);
        programs.add(ps3);
        programs.add(ps4);
        programs.add(ps5);
        programs.add(ps6);
        programs.add(ps7);
        programs.add(ps8);
        programs.add(ps9);
        programs.add(ps10);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" indigenous ">
        Marital_statuses.to_marital_statuses ind1 = new Marital_statuses.to_marital_statuses(0, "Aeta");
        Marital_statuses.to_marital_statuses ind2 = new Marital_statuses.to_marital_statuses(0, "Agta Casiguran");
        Marital_statuses.to_marital_statuses ind3 = new Marital_statuses.to_marital_statuses(0, "Agta Cayagan");
        Marital_statuses.to_marital_statuses ind4 = new Marital_statuses.to_marital_statuses(0, "Alangan");
        Marital_statuses.to_marital_statuses ind5 = new Marital_statuses.to_marital_statuses(0, "Apayao Isnag");
        Marital_statuses.to_marital_statuses ind6 = new Marital_statuses.to_marital_statuses(0, "Ata du sud");
        Marital_statuses.to_marital_statuses ind7 = new Marital_statuses.to_marital_statuses(0, "Ata Manobo");
        Marital_statuses.to_marital_statuses ind8 = new Marital_statuses.to_marital_statuses(0, "Bagobo");
        Marital_statuses.to_marital_statuses ind9 = new Marital_statuses.to_marital_statuses(0, "Batak");
        Marital_statuses.to_marital_statuses ind10 = new Marital_statuses.to_marital_statuses(0, "Blaan");
        Marital_statuses.to_marital_statuses ind11 = new Marital_statuses.to_marital_statuses(0, "Blit (Manobo Cotabato group)");
        Marital_statuses.to_marital_statuses ind12 = new Marital_statuses.to_marital_statuses(0, "Bontok");
        Marital_statuses.to_marital_statuses ind13 = new Marital_statuses.to_marital_statuses(0, "Buhid");
        Marital_statuses.to_marital_statuses ind14 = new Marital_statuses.to_marital_statuses(0, "Bukidnon");
        Marital_statuses.to_marital_statuses ind15 = new Marital_statuses.to_marital_statuses(0, "Gaddang");
        Marital_statuses.to_marital_statuses ind16 = new Marital_statuses.to_marital_statuses(0, "Hanunòòo");
        Marital_statuses.to_marital_statuses ind17 = new Marital_statuses.to_marital_statuses(0, "Ibanag");
        Marital_statuses.to_marital_statuses ind18 = new Marital_statuses.to_marital_statuses(0, "Ifugao");
        Marital_statuses.to_marital_statuses ind19 = new Marital_statuses.to_marital_statuses(0, "Igorot");
        Marital_statuses.to_marital_statuses ind20 = new Marital_statuses.to_marital_statuses(0, "Ilanon Manobo");
        Marital_statuses.to_marital_statuses ind21 = new Marital_statuses.to_marital_statuses(0, "Ilianen");
        Marital_statuses.to_marital_statuses ind22 = new Marital_statuses.to_marital_statuses(0, "Ilongot");

        Marital_statuses.to_marital_statuses ind23 = new Marital_statuses.to_marital_statuses(0, "Iraya");
        Marital_statuses.to_marital_statuses ind24 = new Marital_statuses.to_marital_statuses(0, "Isneg");
        Marital_statuses.to_marital_statuses ind25 = new Marital_statuses.to_marital_statuses(0, "Itneg");
        Marital_statuses.to_marital_statuses ind26 = new Marital_statuses.to_marital_statuses(0, "Itneg (Tingian)");
        Marital_statuses.to_marital_statuses ind27 = new Marital_statuses.to_marital_statuses(0, "Kalinga");
        Marital_statuses.to_marital_statuses ind28 = new Marital_statuses.to_marital_statuses(0, "Kankanay");
        Marital_statuses.to_marital_statuses ind29 = new Marital_statuses.to_marital_statuses(0, "Magahat Bukidnon");
        Marital_statuses.to_marital_statuses ind30 = new Marital_statuses.to_marital_statuses(0, "Magindanao");
        Marital_statuses.to_marital_statuses ind31 = new Marital_statuses.to_marital_statuses(0, "Malaweg");
        Marital_statuses.to_marital_statuses ind32 = new Marital_statuses.to_marital_statuses(0, "Mamanwa");

        Marital_statuses.to_marital_statuses ind33 = new Marital_statuses.to_marital_statuses(0, "Mandaya Cataelano");
        Marital_statuses.to_marital_statuses ind34 = new Marital_statuses.to_marital_statuses(0, "Mandaya Sangab");
        Marital_statuses.to_marital_statuses ind35 = new Marital_statuses.to_marital_statuses(0, "Mangwanga");
        Marital_statuses.to_marital_statuses ind36 = new Marital_statuses.to_marital_statuses(0, "Manobo");
        Marital_statuses.to_marital_statuses ind37 = new Marital_statuses.to_marital_statuses(0, "Manobo Ata");
        Marital_statuses.to_marital_statuses ind38 = new Marital_statuses.to_marital_statuses(0, "Manobo-Cotabato");
        Marital_statuses.to_marital_statuses ind39 = new Marital_statuses.to_marital_statuses(0, "Mansaka");
        Marital_statuses.to_marital_statuses ind40 = new Marital_statuses.to_marital_statuses(0, "Negritos");
        Marital_statuses.to_marital_statuses ind41 = new Marital_statuses.to_marital_statuses(0, "Pakkak Gadang");
        Marital_statuses.to_marital_statuses ind42 = new Marital_statuses.to_marital_statuses(0, "Palawan");
        Marital_statuses.to_marital_statuses ind43 = new Marital_statuses.to_marital_statuses(0, "Paranan");
        Marital_statuses.to_marital_statuses ind44 = new Marital_statuses.to_marital_statuses(0, "Pugot N. Apayao");
        Marital_statuses.to_marital_statuses ind45 = new Marital_statuses.to_marital_statuses(0, "Ratagnon Loktanon");
        Marital_statuses.to_marital_statuses ind46 = new Marital_statuses.to_marital_statuses(0, "Subanon");
        Marital_statuses.to_marital_statuses ind47 = new Marital_statuses.to_marital_statuses(0, "Subanon Tuboy Salog");
        Marital_statuses.to_marital_statuses ind48 = new Marital_statuses.to_marital_statuses(0, "Tadyawan");
        Marital_statuses.to_marital_statuses ind49 = new Marital_statuses.to_marital_statuses(0, "Tagabawa");
        Marital_statuses.to_marital_statuses ind50 = new Marital_statuses.to_marital_statuses(0, "Tagbanwa");
        Marital_statuses.to_marital_statuses ind51 = new Marital_statuses.to_marital_statuses(0, "Tasaday (Manobo Cotabato)");
        Marital_statuses.to_marital_statuses ind52 = new Marital_statuses.to_marital_statuses(0, "Taubuid (Batangan)");
        Marital_statuses.to_marital_statuses ind53 = new Marital_statuses.to_marital_statuses(0, "Taut batu");
        Marital_statuses.to_marital_statuses ind54 = new Marital_statuses.to_marital_statuses(0, "Tboli");
        Marital_statuses.to_marital_statuses ind55 = new Marital_statuses.to_marital_statuses(0, "Tigwa");
        Marital_statuses.to_marital_statuses ind56 = new Marital_statuses.to_marital_statuses(0, "Tinggian (Itneg)");
        Marital_statuses.to_marital_statuses ind57 = new Marital_statuses.to_marital_statuses(0, "Tiruray");
        Marital_statuses.to_marital_statuses ind58 = new Marital_statuses.to_marital_statuses(0, "Ubo Manobo");

        indigenous.add(ind1);
        indigenous.add(ind2);
        indigenous.add(ind3);
        indigenous.add(ind4);
        indigenous.add(ind5);
        indigenous.add(ind6);
        indigenous.add(ind7);
        indigenous.add(ind8);
        indigenous.add(ind9);
        indigenous.add(ind10);

        indigenous.add(ind11);
        indigenous.add(ind12);
        indigenous.add(ind13);
        indigenous.add(ind14);
        indigenous.add(ind15);
        indigenous.add(ind16);
        indigenous.add(ind17);
        indigenous.add(ind18);
        indigenous.add(ind19);
        indigenous.add(ind20);

        indigenous.add(ind21);
        indigenous.add(ind22);
        indigenous.add(ind23);
        indigenous.add(ind24);
        indigenous.add(ind25);
        indigenous.add(ind26);
        indigenous.add(ind27);
        indigenous.add(ind28);
        indigenous.add(ind29);
        indigenous.add(ind30);

        indigenous.add(ind31);
        indigenous.add(ind32);
        indigenous.add(ind33);
        indigenous.add(ind34);
        indigenous.add(ind35);
        indigenous.add(ind36);
        indigenous.add(ind37);
        indigenous.add(ind38);
        indigenous.add(ind39);
        indigenous.add(ind40);

        indigenous.add(ind41);
        indigenous.add(ind42);
        indigenous.add(ind43);
        indigenous.add(ind44);
        indigenous.add(ind45);
        indigenous.add(ind46);
        indigenous.add(ind47);
        indigenous.add(ind48);
        indigenous.add(ind49);
        indigenous.add(ind50);

        indigenous.add(ind51);
        indigenous.add(ind52);
        indigenous.add(ind53);
        indigenous.add(ind54);
        indigenous.add(ind55);
        indigenous.add(ind56);
        indigenous.add(ind57);
        indigenous.add(ind58);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" family planning ">
        Marital_statuses.to_marital_statuses fp1 = new Marital_statuses.to_marital_statuses(0, "Pills");
        Marital_statuses.to_marital_statuses fp2 = new Marital_statuses.to_marital_statuses(0, "IUD");
        Marital_statuses.to_marital_statuses fp3 = new Marital_statuses.to_marital_statuses(0, "DMPA");
        Marital_statuses.to_marital_statuses fp4 = new Marital_statuses.to_marital_statuses(0, "LAM");
        Marital_statuses.to_marital_statuses fp5 = new Marital_statuses.to_marital_statuses(0, "BTL");
        Marital_statuses.to_marital_statuses fp6 = new Marital_statuses.to_marital_statuses(0, "VAS");
        Marital_statuses.to_marital_statuses fp7 = new Marital_statuses.to_marital_statuses(0, "Condom");
        Marital_statuses.to_marital_statuses fp8 = new Marital_statuses.to_marital_statuses(0, "Natural");
        family_planning.add(fp1);
        family_planning.add(fp2);
        family_planning.add(fp2);
        family_planning.add(fp4);
        family_planning.add(fp5);
        family_planning.add(fp6);
        family_planning.add(fp7);
        family_planning.add(fp8);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" TB Program ">
        Marital_statuses.to_marital_statuses tbpt1 = new Marital_statuses.to_marital_statuses(0, "SCC Government");
        Marital_statuses.to_marital_statuses tbpt2 = new Marital_statuses.to_marital_statuses(0, "SCC Private");

        tb_program_treatment.add(tbpt1);
        tb_program_treatment.add(tbpt1);

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" TB Program Treatment">
        Marital_statuses.to_marital_statuses tbp1 = new Marital_statuses.to_marital_statuses(0, "Underwent DSSM");
        Marital_statuses.to_marital_statuses tbp2 = new Marital_statuses.to_marital_statuses(0, "Smear Positive");
        Marital_statuses.to_marital_statuses tbp3 = new Marital_statuses.to_marital_statuses(0, "Smear Negative");
        Marital_statuses.to_marital_statuses tbp4 = new Marital_statuses.to_marital_statuses(0, "X-ray Result");
        tb_program.add(tbp1);
        tb_program.add(tbp2);
        tb_program.add(tbp3);
        tb_program.add(tbp4);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Natality Treatment">
        Marital_statuses.to_marital_statuses nab1 = new Marital_statuses.to_marital_statuses(0, "M.D.");
        Marital_statuses.to_marital_statuses nab2 = new Marital_statuses.to_marital_statuses(0, "Nurse");
        Marital_statuses.to_marital_statuses nab3 = new Marital_statuses.to_marital_statuses(0, "Midwife");
        Marital_statuses.to_marital_statuses nab4 = new Marital_statuses.to_marital_statuses(0, "Trained Hilots");
        Marital_statuses.to_marital_statuses nab5 = new Marital_statuses.to_marital_statuses(0, "Unknown");
        natality_attended_by.add(nab1);
        natality_attended_by.add(nab2);
        natality_attended_by.add(nab3);
        natality_attended_by.add(nab4);
        natality_attended_by.add(nab5);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" Natality Place">
        Marital_statuses.to_marital_statuses np1 = new Marital_statuses.to_marital_statuses(0, "House");
        Marital_statuses.to_marital_statuses np2 = new Marital_statuses.to_marital_statuses(0, "Lying-In");
        Marital_statuses.to_marital_statuses np3 = new Marital_statuses.to_marital_statuses(0, "Hospital");
        Marital_statuses.to_marital_statuses np4 = new Marital_statuses.to_marital_statuses(0, "Others");

        natality_place_of_delivery.add(np1);
        natality_place_of_delivery.add(np2);
        natality_place_of_delivery.add(np3);
        natality_place_of_delivery.add(np4);

        //</editor-fold>
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

    public static void init_tenure_years(final JTextField tf) {

        Object[][] obj = new Object[tenure_years.size()][1];
        int i = 0;
        for (Tenure.to_tenure to : tenure_years) {
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
                Tenure.to_tenure to = tenure_years.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.tenure);
                field.setId("" + to.id);
            }
        });
    }

    public static void init_tenure_months(final JTextField tf) {

        Object[][] obj = new Object[tenure_months.size()][1];
        int i = 0;
        for (Tenure.to_tenure to : tenure_months) {
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
                Tenure.to_tenure to = tenure_months.get(data.selected_row);
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
    //<editor-fold defaultstate="collapsed" desc=" Medical Diseases ">
    public static void init_medical_diseases(final JTextField tf) {

        Object[][] obj = new Object[medical_diseases.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Medical_diseases.to_medical_diseases to : medical_diseases) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.medical_disease)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.medical_disease;
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
                Medical_diseases.to_medical_diseases to = medical_diseases.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.medical_disease);
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
    //<editor-fold defaultstate="collapsed" desc=" Mental Problems ">
    public static void init_mental_problems(final JTextField tf) {

        Object[][] obj = new Object[mental_problems.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Mental_problems.to_mental_problems to : mental_problems) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.mental_problem)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.mental_problem;
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
                Mental_problems.to_mental_problems to = mental_problems.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.mental_problem);
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
    //<editor-fold defaultstate="collapsed" desc=" Mental Problems ">
    public static void init_displacements(final JTextField tf) {

        Object[][] obj = new Object[displacements.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : displacements) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = displacements.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" Programs ">
    public static void init_programs(final JTextField tf) {

        Object[][] obj = new Object[programs.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : programs) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = programs.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" indigenous ">
    public static void init_indigenous(final JTextField tf) {

        Object[][] obj = new Object[indigenous.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : indigenous) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = indigenous.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" family planning ">
    public static void init_family_planning(final JTextField tf) {

        Object[][] obj = new Object[family_planning.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : family_planning) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = family_planning.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" TB Program">
    public static void init_tb_program(final JTextField tf) {

        Object[][] obj = new Object[tb_program.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : tb_program) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = tb_program.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" TB Program Treatment">
    public static void init_tb_program_treatment(final JTextField tf) {

        Object[][] obj = new Object[tb_program_treatment.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : tb_program_treatment) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = tb_program_treatment.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" Natality Attended by">
    public static void init_natality_attended_by(final JTextField tf) {

        Object[][] obj = new Object[natality_attended_by.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : natality_attended_by) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = natality_attended_by.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
    //<editor-fold defaultstate="collapsed" desc=" Natality Place">
    public static void init_natality_place_of_delivery(final JTextField tf) {

        Object[][] obj = new Object[natality_place_of_delivery.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Marital_statuses.to_marital_statuses to : natality_place_of_delivery) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.marital_status)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.marital_status;
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
                Marital_statuses.to_marital_statuses to = natality_place_of_delivery.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.marital_status);
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
