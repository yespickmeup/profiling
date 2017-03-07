/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_other_details;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Household_member_other_details {

    public static class to_household_member_other_details {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
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
        public final int status;
        public final int is_uploaded;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        public final String transient_no;
        public final int experienced_displacement;
        public final String experienced_displacement_reasons;
        public final int has_received_programs;
        public final String received_programs;
        public final String received_programs_id_numbers;
        public final int is_indigenous_people;
        public final String indigenous_people_group;
        public final int is_pregnant;
        public final int solo_parent;
        public final String relation_to_nuclear_family;
        public final int has_disability;
        public final int has_seeing_problem;
        public final int has_hearing_problem;
        public final int has_walking_problem;
        public final int has_remembering_problem;
        public final int has_self_caring_problem;
        public final int has_communicating_problem;
        public final String hs_present_medical_diseases;
        public final String hs_past_medical_history;
        public final String hs_family_history_diseases;
        public final int hs_smoking_history_status;
        public final int hs_smoking_history_no_of_packs;
        public final int hs_alcohol_history_status;
        public final int hs_alcohol_history_no_of_bottles;
        public final int hs_ellicit_drugs;
        public final String hs_medical_problems;
        public final String hs_pwd;
        public final String hs_immunization_children_bcg;
        public final String hs_immunization_children_opv1;
        public final String hs_immunization_children_opv2;
        public final String hs_immunization_children_opv3;
        public final String hs_immunization_children_hepa_within_24_hours;
        public final String hs_immunization_children_hepa_greater_24_hours;
        public final String hs_immunization_children_penta1;
        public final String hs_immunization_children_penta2;
        public final String hs_immunization_children_penta3;
        public final String hs_immunization_children_mcv1;
        public final String hs_immunization_children_mcv2;
        public final String hs_immunization_children_fic;
        public final String hs_immunization_children_protected_at_birth;
        public final String hs_immunization_children_exclusive_breastfeeding;
        public final String hs_immunization_young_women_hpv;
        public final String hs_immunization_young_women_mmr;
        public final String hs_immunization_young_women_td;
        public final String hs_immunization_pregnant_tt1;
        public final String hs_immunization_pregnant_tt2;
        public final String hs_immunization_pregnant_tt3;
        public final String hs_immunization_pregnant_tt4;
        public final String hs_immunization_pregnant_tt5;
        public final String hs_immunization_elderly_pneumococcal_vaccine;
        public final String hs_immunization_elderly_flu_vaccine;
        public final String hs_pregnant_lmp;
        public final String hs_pregnant_edc;
        public final String hs_pregnant_gp;
        public final String hs_pregnant_tpal;
        public final String hs_post_partum_date_of_delivery;
        public final String hs_post_partum_place_of_delivery;
        public final String hs_post_partum_type_of_delivery;
        public final String hs_post_partum_attended_by;
        public final String hs_post_partum_outcome;
        public final String hs_post_partum_initiated_breasfeeding;
        public final String hs_post_partum_given_vitamic_a;
        public final String hs_family_planning;
        public final String hs_tb_program_checklist;
        public final String hs_tb_program_treatment;
        public final String hs_tb_program_treatment_outcome;
        public final String hs_natality_birthweight;
        public final String hs_natality_attended_by;
        public final String hs_natality_place_of_delivery;

        public to_household_member_other_details(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, int is_uploaded, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String transient_no, int experienced_displacement, String experienced_displacement_reasons, int has_received_programs, String received_programs, String received_programs_id_numbers, int is_indigenous_people, String indigenous_people_group, int is_pregnant, int solo_parent, String relation_to_nuclear_family, int has_disability, int has_seeing_problem, int has_hearing_problem, int has_walking_problem, int has_remembering_problem, int has_self_caring_problem, int has_communicating_problem, String hs_present_medical_diseases, String hs_past_medical_history, String hs_family_history_diseases, int hs_smoking_history_status, int hs_smoking_history_no_of_packs, int hs_alcohol_history_status, int hs_alcohol_history_no_of_bottles, int hs_ellicit_drugs, String hs_medical_problems, String hs_pwd, String hs_immunization_children_bcg, String hs_immunization_children_opv1, String hs_immunization_children_opv2, String hs_immunization_children_opv3, String hs_immunization_children_hepa_within_24_hours, String hs_immunization_children_hepa_greater_24_hours, String hs_immunization_children_penta1, String hs_immunization_children_penta2, String hs_immunization_children_penta3, String hs_immunization_children_mcv1, String hs_immunization_children_mcv2, String hs_immunization_children_fic, String hs_immunization_children_protected_at_birth, String hs_immunization_children_exclusive_breastfeeding, String hs_immunization_young_women_hpv, String hs_immunization_young_women_mmr, String hs_immunization_young_women_td, String hs_immunization_pregnant_tt1, String hs_immunization_pregnant_tt2, String hs_immunization_pregnant_tt3, String hs_immunization_pregnant_tt4, String hs_immunization_pregnant_tt5, String hs_immunization_elderly_pneumococcal_vaccine, String hs_immunization_elderly_flu_vaccine, String hs_pregnant_lmp, String hs_pregnant_edc, String hs_pregnant_gp, String hs_pregnant_tpal, String hs_post_partum_date_of_delivery, String hs_post_partum_place_of_delivery, String hs_post_partum_type_of_delivery, String hs_post_partum_attended_by, String hs_post_partum_outcome, String hs_post_partum_initiated_breasfeeding, String hs_post_partum_given_vitamic_a, String hs_family_planning, String hs_tb_program_checklist, String hs_tb_program_treatment, String hs_tb_program_treatment_outcome, String hs_natality_birthweight, String hs_natality_attended_by, String hs_natality_place_of_delivery) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
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
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.transient_no = transient_no;
            this.experienced_displacement = experienced_displacement;
            this.experienced_displacement_reasons = experienced_displacement_reasons;
            this.has_received_programs = has_received_programs;
            this.received_programs = received_programs;
            this.received_programs_id_numbers = received_programs_id_numbers;
            this.is_indigenous_people = is_indigenous_people;
            this.indigenous_people_group = indigenous_people_group;
            this.is_pregnant = is_pregnant;
            this.solo_parent = solo_parent;
            this.relation_to_nuclear_family = relation_to_nuclear_family;
            this.has_disability = has_disability;
            this.has_seeing_problem = has_seeing_problem;
            this.has_hearing_problem = has_hearing_problem;
            this.has_walking_problem = has_walking_problem;
            this.has_remembering_problem = has_remembering_problem;
            this.has_self_caring_problem = has_self_caring_problem;
            this.has_communicating_problem = has_communicating_problem;
            this.hs_present_medical_diseases = hs_present_medical_diseases;
            this.hs_past_medical_history = hs_past_medical_history;
            this.hs_family_history_diseases = hs_family_history_diseases;
            this.hs_smoking_history_status = hs_smoking_history_status;
            this.hs_smoking_history_no_of_packs = hs_smoking_history_no_of_packs;
            this.hs_alcohol_history_status = hs_alcohol_history_status;
            this.hs_alcohol_history_no_of_bottles = hs_alcohol_history_no_of_bottles;
            this.hs_ellicit_drugs = hs_ellicit_drugs;
            this.hs_medical_problems = hs_medical_problems;
            this.hs_pwd = hs_pwd;
            this.hs_immunization_children_bcg = hs_immunization_children_bcg;
            this.hs_immunization_children_opv1 = hs_immunization_children_opv1;
            this.hs_immunization_children_opv2 = hs_immunization_children_opv2;
            this.hs_immunization_children_opv3 = hs_immunization_children_opv3;
            this.hs_immunization_children_hepa_within_24_hours = hs_immunization_children_hepa_within_24_hours;
            this.hs_immunization_children_hepa_greater_24_hours = hs_immunization_children_hepa_greater_24_hours;
            this.hs_immunization_children_penta1 = hs_immunization_children_penta1;
            this.hs_immunization_children_penta2 = hs_immunization_children_penta2;
            this.hs_immunization_children_penta3 = hs_immunization_children_penta3;
            this.hs_immunization_children_mcv1 = hs_immunization_children_mcv1;
            this.hs_immunization_children_mcv2 = hs_immunization_children_mcv2;
            this.hs_immunization_children_fic = hs_immunization_children_fic;
            this.hs_immunization_children_protected_at_birth = hs_immunization_children_protected_at_birth;
            this.hs_immunization_children_exclusive_breastfeeding = hs_immunization_children_exclusive_breastfeeding;
            this.hs_immunization_young_women_hpv = hs_immunization_young_women_hpv;
            this.hs_immunization_young_women_mmr = hs_immunization_young_women_mmr;
            this.hs_immunization_young_women_td = hs_immunization_young_women_td;
            this.hs_immunization_pregnant_tt1 = hs_immunization_pregnant_tt1;
            this.hs_immunization_pregnant_tt2 = hs_immunization_pregnant_tt2;
            this.hs_immunization_pregnant_tt3 = hs_immunization_pregnant_tt3;
            this.hs_immunization_pregnant_tt4 = hs_immunization_pregnant_tt4;
            this.hs_immunization_pregnant_tt5 = hs_immunization_pregnant_tt5;
            this.hs_immunization_elderly_pneumococcal_vaccine = hs_immunization_elderly_pneumococcal_vaccine;
            this.hs_immunization_elderly_flu_vaccine = hs_immunization_elderly_flu_vaccine;
            this.hs_pregnant_lmp = hs_pregnant_lmp;
            this.hs_pregnant_edc = hs_pregnant_edc;
            this.hs_pregnant_gp = hs_pregnant_gp;
            this.hs_pregnant_tpal = hs_pregnant_tpal;
            this.hs_post_partum_date_of_delivery = hs_post_partum_date_of_delivery;
            this.hs_post_partum_place_of_delivery = hs_post_partum_place_of_delivery;
            this.hs_post_partum_type_of_delivery = hs_post_partum_type_of_delivery;
            this.hs_post_partum_attended_by = hs_post_partum_attended_by;
            this.hs_post_partum_outcome = hs_post_partum_outcome;
            this.hs_post_partum_initiated_breasfeeding = hs_post_partum_initiated_breasfeeding;
            this.hs_post_partum_given_vitamic_a = hs_post_partum_given_vitamic_a;
            this.hs_family_planning = hs_family_planning;
            this.hs_tb_program_checklist = hs_tb_program_checklist;
            this.hs_tb_program_treatment = hs_tb_program_treatment;
            this.hs_tb_program_treatment_outcome = hs_tb_program_treatment_outcome;
            this.hs_natality_birthweight = hs_natality_birthweight;
            this.hs_natality_attended_by = hs_natality_attended_by;
            this.hs_natality_place_of_delivery = hs_natality_place_of_delivery;
        }
    }

    public static void add_data(to_household_member_other_details to_household_member_other_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_other_details("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",is_uploaded"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",transient_no"
                    + ",experienced_displacement"
                    + ",experienced_displacement_reasons"
                    + ",has_received_programs"
                    + ",received_programs"
                    + ",received_programs_id_numbers"
                    + ",is_indigenous_people"
                    + ",indigenous_people_group"
                    + ",is_pregnant"
                    + ",solo_parent"
                    + ",relation_to_nuclear_family"
                    + ",has_disability"
                    + ",has_seeing_problem"
                    + ",has_hearing_problem"
                    + ",has_walking_problem"
                    + ",has_remembering_problem"
                    + ",has_self_caring_problem"
                    + ",has_communicating_problem"
                    + ",hs_present_medical_diseases"
                    + ",hs_past_medical_history"
                    + ",hs_family_history_diseases"
                    + ",hs_smoking_history_status"
                    + ",hs_smoking_history_no_of_packs"
                    + ",hs_alcohol_history_status"
                    + ",hs_alcohol_history_no_of_bottles"
                    + ",hs_ellicit_drugs"
                    + ",hs_medical_problems"
                    + ",hs_pwd"
                    + ",hs_immunization_children_bcg"
                    + ",hs_immunization_children_opv1"
                    + ",hs_immunization_children_opv2"
                    + ",hs_immunization_children_opv3"
                    + ",hs_immunization_children_hepa_within_24_hours"
                    + ",hs_immunization_children_hepa_greater_24_hours"
                    + ",hs_immunization_children_penta1"
                    + ",hs_immunization_children_penta2"
                    + ",hs_immunization_children_penta3"
                    + ",hs_immunization_children_mcv1"
                    + ",hs_immunization_children_mcv2"
                    + ",hs_immunization_children_fic"
                    + ",hs_immunization_children_protected_at_birth"
                    + ",hs_immunization_children_exclusive_breastfeeding"
                    + ",hs_immunization_young_women_hpv"
                    + ",hs_immunization_young_women_mmr"
                    + ",hs_immunization_young_women_td"
                    + ",hs_immunization_pregnant_tt1"
                    + ",hs_immunization_pregnant_tt2"
                    + ",hs_immunization_pregnant_tt3"
                    + ",hs_immunization_pregnant_tt4"
                    + ",hs_immunization_pregnant_tt5"
                    + ",hs_immunization_elderly_pneumococcal_vaccine"
                    + ",hs_immunization_elderly_flu_vaccine"
                    + ",hs_pregnant_lmp"
                    + ",hs_pregnant_edc"
                    + ",hs_pregnant_gp"
                    + ",hs_pregnant_tpal"
                    + ",hs_post_partum_date_of_delivery"
                    + ",hs_post_partum_place_of_delivery"
                    + ",hs_post_partum_type_of_delivery"
                    + ",hs_post_partum_attended_by"
                    + ",hs_post_partum_outcome"
                    + ",hs_post_partum_initiated_breasfeeding"
                    + ",hs_post_partum_given_vitamic_a"
                    + ",hs_family_planning"
                    + ",hs_tb_program_checklist"
                    + ",hs_tb_program_treatment"
                    + ",hs_tb_program_treatment_outcome"
                    + ",hs_natality_birthweight"
                    + ",hs_natality_attended_by"
                    + ",hs_natality_place_of_delivery"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:status"
                    + ",:is_uploaded"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:household_member_no"
                    + ",:fname"
                    + ",:mname"
                    + ",:lname"
                    + ",:sname"
                    + ",:transient_no"
                    + ",:experienced_displacement"
                    + ",:experienced_displacement_reasons"
                    + ",:has_received_programs"
                    + ",:received_programs"
                    + ",:received_programs_id_numbers"
                    + ",:is_indigenous_people"
                    + ",:indigenous_people_group"
                    + ",:is_pregnant"
                    + ",:solo_parent"
                    + ",:relation_to_nuclear_family"
                    + ",:has_disability"
                    + ",:has_seeing_problem"
                    + ",:has_hearing_problem"
                    + ",:has_walking_problem"
                    + ",:has_remembering_problem"
                    + ",:has_self_caring_problem"
                    + ",:has_communicating_problem"
                    + ",:hs_present_medical_diseases"
                    + ",:hs_past_medical_history"
                    + ",:hs_family_history_diseases"
                    + ",:hs_smoking_history_status"
                    + ",:hs_smoking_history_no_of_packs"
                    + ",:hs_alcohol_history_status"
                    + ",:hs_alcohol_history_no_of_bottles"
                    + ",:hs_ellicit_drugs"
                    + ",:hs_medical_problems"
                    + ",:hs_pwd"
                    + ",:hs_immunization_children_bcg"
                    + ",:hs_immunization_children_opv1"
                    + ",:hs_immunization_children_opv2"
                    + ",:hs_immunization_children_opv3"
                    + ",:hs_immunization_children_hepa_within_24_hours"
                    + ",:hs_immunization_children_hepa_greater_24_hours"
                    + ",:hs_immunization_children_penta1"
                    + ",:hs_immunization_children_penta2"
                    + ",:hs_immunization_children_penta3"
                    + ",:hs_immunization_children_mcv1"
                    + ",:hs_immunization_children_mcv2"
                    + ",:hs_immunization_children_fic"
                    + ",:hs_immunization_children_protected_at_birth"
                    + ",:hs_immunization_children_exclusive_breastfeeding"
                    + ",:hs_immunization_young_women_hpv"
                    + ",:hs_immunization_young_women_mmr"
                    + ",:hs_immunization_young_women_td"
                    + ",:hs_immunization_pregnant_tt1"
                    + ",:hs_immunization_pregnant_tt2"
                    + ",:hs_immunization_pregnant_tt3"
                    + ",:hs_immunization_pregnant_tt4"
                    + ",:hs_immunization_pregnant_tt5"
                    + ",:hs_immunization_elderly_pneumococcal_vaccine"
                    + ",:hs_immunization_elderly_flu_vaccine"
                    + ",:hs_pregnant_lmp"
                    + ",:hs_pregnant_edc"
                    + ",:hs_pregnant_gp"
                    + ",:hs_pregnant_tpal"
                    + ",:hs_post_partum_date_of_delivery"
                    + ",:hs_post_partum_place_of_delivery"
                    + ",:hs_post_partum_type_of_delivery"
                    + ",:hs_post_partum_attended_by"
                    + ",:hs_post_partum_outcome"
                    + ",:hs_post_partum_initiated_breasfeeding"
                    + ",:hs_post_partum_given_vitamic_a"
                    + ",:hs_family_planning"
                    + ",:hs_tb_program_checklist"
                    + ",:hs_tb_program_treatment"
                    + ",:hs_tb_program_treatment_outcome"
                    + ",:hs_natality_birthweight"
                    + ",:hs_natality_attended_by"
                    + ",:hs_natality_place_of_delivery"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_other_details.created_at)
                    .setString("updated_at", to_household_member_other_details.updated_at)
                    .setString("created_by", to_household_member_other_details.created_by)
                    .setString("updated_by", to_household_member_other_details.updated_by)
                    .setString("region", to_household_member_other_details.region)
                    .setString("region_id", to_household_member_other_details.region_id)
                    .setString("province", to_household_member_other_details.province)
                    .setString("province_id", to_household_member_other_details.province_id)
                    .setString("city", to_household_member_other_details.city)
                    .setString("city_id", to_household_member_other_details.city_id)
                    .setString("barangay", to_household_member_other_details.barangay)
                    .setString("barangay_id", to_household_member_other_details.barangay_id)
                    .setString("purok", to_household_member_other_details.purok)
                    .setString("purok_id", to_household_member_other_details.purok_id)
                    .setNumber("status", to_household_member_other_details.status)
                    .setNumber("is_uploaded", to_household_member_other_details.is_uploaded)
                    .setString("house_no", to_household_member_other_details.house_no)
                    .setString("household_no", to_household_member_other_details.household_no)
                    .setString("household_member_no", to_household_member_other_details.household_member_no)
                    .setString("fname", to_household_member_other_details.fname)
                    .setString("mname", to_household_member_other_details.mname)
                    .setString("lname", to_household_member_other_details.lname)
                    .setString("sname", to_household_member_other_details.sname)
                    .setString("transient_no", to_household_member_other_details.transient_no)
                    .setNumber("experienced_displacement", to_household_member_other_details.experienced_displacement)
                    .setString("experienced_displacement_reasons", to_household_member_other_details.experienced_displacement_reasons)
                    .setNumber("has_received_programs", to_household_member_other_details.has_received_programs)
                    .setString("received_programs", to_household_member_other_details.received_programs)
                    .setString("received_programs_id_numbers", to_household_member_other_details.received_programs_id_numbers)
                    .setNumber("is_indigenous_people", to_household_member_other_details.is_indigenous_people)
                    .setString("indigenous_people_group", to_household_member_other_details.indigenous_people_group)
                    .setNumber("is_pregnant", to_household_member_other_details.is_pregnant)
                    .setNumber("solo_parent", to_household_member_other_details.solo_parent)
                    .setString("relation_to_nuclear_family", to_household_member_other_details.relation_to_nuclear_family)
                    .setNumber("has_disability", to_household_member_other_details.has_disability)
                    .setNumber("has_seeing_problem", to_household_member_other_details.has_seeing_problem)
                    .setNumber("has_hearing_problem", to_household_member_other_details.has_hearing_problem)
                    .setNumber("has_walking_problem", to_household_member_other_details.has_walking_problem)
                    .setNumber("has_remembering_problem", to_household_member_other_details.has_remembering_problem)
                    .setNumber("has_self_caring_problem", to_household_member_other_details.has_self_caring_problem)
                    .setNumber("has_communicating_problem", to_household_member_other_details.has_communicating_problem)
                    .setString("hs_present_medical_diseases", to_household_member_other_details.hs_present_medical_diseases)
                    .setString("hs_past_medical_history", to_household_member_other_details.hs_past_medical_history)
                    .setString("hs_family_history_diseases", to_household_member_other_details.hs_family_history_diseases)
                    .setNumber("hs_smoking_history_status", to_household_member_other_details.hs_smoking_history_status)
                    .setNumber("hs_smoking_history_no_of_packs", to_household_member_other_details.hs_smoking_history_no_of_packs)
                    .setNumber("hs_alcohol_history_status", to_household_member_other_details.hs_alcohol_history_status)
                    .setNumber("hs_alcohol_history_no_of_bottles", to_household_member_other_details.hs_alcohol_history_no_of_bottles)
                    .setNumber("hs_ellicit_drugs", to_household_member_other_details.hs_ellicit_drugs)
                    .setString("hs_medical_problems", to_household_member_other_details.hs_medical_problems)
                    .setString("hs_pwd", to_household_member_other_details.hs_pwd)
                    .setString("hs_immunization_children_bcg", to_household_member_other_details.hs_immunization_children_bcg)
                    .setString("hs_immunization_children_opv1", to_household_member_other_details.hs_immunization_children_opv1)
                    .setString("hs_immunization_children_opv2", to_household_member_other_details.hs_immunization_children_opv2)
                    .setString("hs_immunization_children_opv3", to_household_member_other_details.hs_immunization_children_opv3)
                    .setString("hs_immunization_children_hepa_within_24_hours", to_household_member_other_details.hs_immunization_children_hepa_within_24_hours)
                    .setString("hs_immunization_children_hepa_greater_24_hours", to_household_member_other_details.hs_immunization_children_hepa_greater_24_hours)
                    .setString("hs_immunization_children_penta1", to_household_member_other_details.hs_immunization_children_penta1)
                    .setString("hs_immunization_children_penta2", to_household_member_other_details.hs_immunization_children_penta2)
                    .setString("hs_immunization_children_penta3", to_household_member_other_details.hs_immunization_children_penta3)
                    .setString("hs_immunization_children_mcv1", to_household_member_other_details.hs_immunization_children_mcv1)
                    .setString("hs_immunization_children_mcv2", to_household_member_other_details.hs_immunization_children_mcv2)
                    .setString("hs_immunization_children_fic", to_household_member_other_details.hs_immunization_children_fic)
                    .setString("hs_immunization_children_protected_at_birth", to_household_member_other_details.hs_immunization_children_protected_at_birth)
                    .setString("hs_immunization_children_exclusive_breastfeeding", to_household_member_other_details.hs_immunization_children_exclusive_breastfeeding)
                    .setString("hs_immunization_young_women_hpv", to_household_member_other_details.hs_immunization_young_women_hpv)
                    .setString("hs_immunization_young_women_mmr", to_household_member_other_details.hs_immunization_young_women_mmr)
                    .setString("hs_immunization_young_women_td", to_household_member_other_details.hs_immunization_young_women_td)
                    .setString("hs_immunization_pregnant_tt1", to_household_member_other_details.hs_immunization_pregnant_tt1)
                    .setString("hs_immunization_pregnant_tt2", to_household_member_other_details.hs_immunization_pregnant_tt2)
                    .setString("hs_immunization_pregnant_tt3", to_household_member_other_details.hs_immunization_pregnant_tt3)
                    .setString("hs_immunization_pregnant_tt4", to_household_member_other_details.hs_immunization_pregnant_tt4)
                    .setString("hs_immunization_pregnant_tt5", to_household_member_other_details.hs_immunization_pregnant_tt5)
                    .setString("hs_immunization_elderly_pneumococcal_vaccine", to_household_member_other_details.hs_immunization_elderly_pneumococcal_vaccine)
                    .setString("hs_immunization_elderly_flu_vaccine", to_household_member_other_details.hs_immunization_elderly_flu_vaccine)
                    .setString("hs_pregnant_lmp", to_household_member_other_details.hs_pregnant_lmp)
                    .setString("hs_pregnant_edc", to_household_member_other_details.hs_pregnant_edc)
                    .setString("hs_pregnant_gp", to_household_member_other_details.hs_pregnant_gp)
                    .setString("hs_pregnant_tpal", to_household_member_other_details.hs_pregnant_tpal)
                    .setString("hs_post_partum_date_of_delivery", to_household_member_other_details.hs_post_partum_date_of_delivery)
                    .setString("hs_post_partum_place_of_delivery", to_household_member_other_details.hs_post_partum_place_of_delivery)
                    .setString("hs_post_partum_type_of_delivery", to_household_member_other_details.hs_post_partum_type_of_delivery)
                    .setString("hs_post_partum_attended_by", to_household_member_other_details.hs_post_partum_attended_by)
                    .setString("hs_post_partum_outcome", to_household_member_other_details.hs_post_partum_outcome)
                    .setString("hs_post_partum_initiated_breasfeeding", to_household_member_other_details.hs_post_partum_initiated_breasfeeding)
                    .setString("hs_post_partum_given_vitamic_a", to_household_member_other_details.hs_post_partum_given_vitamic_a)
                    .setString("hs_family_planning", to_household_member_other_details.hs_family_planning)
                    .setString("hs_tb_program_checklist", to_household_member_other_details.hs_tb_program_checklist)
                    .setString("hs_tb_program_treatment", to_household_member_other_details.hs_tb_program_treatment)
                    .setString("hs_tb_program_treatment_outcome", to_household_member_other_details.hs_tb_program_treatment_outcome)
                    .setString("hs_natality_birthweight", to_household_member_other_details.hs_natality_birthweight)
                    .setString("hs_natality_attended_by", to_household_member_other_details.hs_natality_attended_by)
                    .setString("hs_natality_place_of_delivery", to_household_member_other_details.hs_natality_place_of_delivery)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_other_details.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_other_details to_household_member_other_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_other_details set "
                    + "hs_present_medical_diseases= :hs_present_medical_diseases "
                    + ",hs_past_medical_history= :hs_past_medical_history "
                    + ",hs_family_history_diseases= :hs_family_history_diseases "
                    + ",hs_smoking_history_status= :hs_smoking_history_status "
                    + ",hs_smoking_history_no_of_packs= :hs_smoking_history_no_of_packs "
                    + ",hs_alcohol_history_status= :hs_alcohol_history_status "
                    + ",hs_alcohol_history_no_of_bottles= :hs_alcohol_history_no_of_bottles "
                    + ",hs_ellicit_drugs= :hs_ellicit_drugs "
                    + ",hs_medical_problems= :hs_medical_problems "
                    + ",hs_pwd= :hs_pwd "
                    + ",hs_immunization_children_bcg= :hs_immunization_children_bcg "
                    + ",hs_immunization_children_opv1= :hs_immunization_children_opv1 "
                    + ",hs_immunization_children_opv2= :hs_immunization_children_opv2 "
                    + ",hs_immunization_children_opv3= :hs_immunization_children_opv3 "
                    + ",hs_immunization_children_hepa_within_24_hours= :hs_immunization_children_hepa_within_24_hours "
                    + ",hs_immunization_children_hepa_greater_24_hours= :hs_immunization_children_hepa_greater_24_hours "
                    + ",hs_immunization_children_penta1= :hs_immunization_children_penta1 "
                    + ",hs_immunization_children_penta2= :hs_immunization_children_penta2 "
                    + ",hs_immunization_children_penta3= :hs_immunization_children_penta3 "
                    + ",hs_immunization_children_mcv1= :hs_immunization_children_mcv1 "
                    + ",hs_immunization_children_mcv2= :hs_immunization_children_mcv2 "
                    + ",hs_immunization_children_fic= :hs_immunization_children_fic "
                    + ",hs_immunization_children_protected_at_birth= :hs_immunization_children_protected_at_birth "
                    + ",hs_immunization_children_exclusive_breastfeeding= :hs_immunization_children_exclusive_breastfeeding "
                    + ",hs_immunization_young_women_hpv= :hs_immunization_young_women_hpv "
                    + ",hs_immunization_young_women_mmr= :hs_immunization_young_women_mmr "
                    + ",hs_immunization_young_women_td= :hs_immunization_young_women_td "
                    + ",hs_immunization_pregnant_tt1= :hs_immunization_pregnant_tt1 "
                    + ",hs_immunization_pregnant_tt2= :hs_immunization_pregnant_tt2 "
                    + ",hs_immunization_pregnant_tt3= :hs_immunization_pregnant_tt3 "
                    + ",hs_immunization_pregnant_tt4= :hs_immunization_pregnant_tt4 "
                    + ",hs_immunization_pregnant_tt5= :hs_immunization_pregnant_tt5 "
                    + ",hs_immunization_elderly_pneumococcal_vaccine= :hs_immunization_elderly_pneumococcal_vaccine "
                    + ",hs_immunization_elderly_flu_vaccine= :hs_immunization_elderly_flu_vaccine "
                    + ",hs_pregnant_lmp= :hs_pregnant_lmp "
                    + ",hs_pregnant_edc= :hs_pregnant_edc "
                    + ",hs_pregnant_gp= :hs_pregnant_gp "
                    + ",hs_pregnant_tpal= :hs_pregnant_tpal "
                    + ",hs_post_partum_date_of_delivery= :hs_post_partum_date_of_delivery "
                    + ",hs_post_partum_place_of_delivery= :hs_post_partum_place_of_delivery "
                    + ",hs_post_partum_type_of_delivery= :hs_post_partum_type_of_delivery "
                    + ",hs_post_partum_attended_by= :hs_post_partum_attended_by "
                    + ",hs_post_partum_outcome= :hs_post_partum_outcome "
                    + ",hs_post_partum_initiated_breasfeeding= :hs_post_partum_initiated_breasfeeding "
                    + ",hs_post_partum_given_vitamic_a= :hs_post_partum_given_vitamic_a "
                    + ",hs_family_planning= :hs_family_planning "
                    + ",hs_tb_program_checklist= :hs_tb_program_checklist "
                    + ",hs_tb_program_treatment= :hs_tb_program_treatment "
                    + ",hs_tb_program_treatment_outcome= :hs_tb_program_treatment_outcome "
                    + ",hs_natality_birthweight= :hs_natality_birthweight "
                    + ",hs_natality_attended_by= :hs_natality_attended_by "
                    + ",hs_natality_place_of_delivery= :hs_natality_place_of_delivery "
                    + " where transient_no='" + to_household_member_other_details.transient_no + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("hs_present_medical_diseases", to_household_member_other_details.hs_present_medical_diseases)
                    .setString("hs_past_medical_history", to_household_member_other_details.hs_past_medical_history)
                    .setString("hs_family_history_diseases", to_household_member_other_details.hs_family_history_diseases)
                    .setNumber("hs_smoking_history_status", to_household_member_other_details.hs_smoking_history_status)
                    .setNumber("hs_smoking_history_no_of_packs", to_household_member_other_details.hs_smoking_history_no_of_packs)
                    .setNumber("hs_alcohol_history_status", to_household_member_other_details.hs_alcohol_history_status)
                    .setNumber("hs_alcohol_history_no_of_bottles", to_household_member_other_details.hs_alcohol_history_no_of_bottles)
                    .setNumber("hs_ellicit_drugs", to_household_member_other_details.hs_ellicit_drugs)
                    .setString("hs_medical_problems", to_household_member_other_details.hs_medical_problems)
                    .setString("hs_pwd", to_household_member_other_details.hs_pwd)
                    .setString("hs_immunization_children_bcg", to_household_member_other_details.hs_immunization_children_bcg)
                    .setString("hs_immunization_children_opv1", to_household_member_other_details.hs_immunization_children_opv1)
                    .setString("hs_immunization_children_opv2", to_household_member_other_details.hs_immunization_children_opv2)
                    .setString("hs_immunization_children_opv3", to_household_member_other_details.hs_immunization_children_opv3)
                    .setString("hs_immunization_children_hepa_within_24_hours", to_household_member_other_details.hs_immunization_children_hepa_within_24_hours)
                    .setString("hs_immunization_children_hepa_greater_24_hours", to_household_member_other_details.hs_immunization_children_hepa_greater_24_hours)
                    .setString("hs_immunization_children_penta1", to_household_member_other_details.hs_immunization_children_penta1)
                    .setString("hs_immunization_children_penta2", to_household_member_other_details.hs_immunization_children_penta2)
                    .setString("hs_immunization_children_penta3", to_household_member_other_details.hs_immunization_children_penta3)
                    .setString("hs_immunization_children_mcv1", to_household_member_other_details.hs_immunization_children_mcv1)
                    .setString("hs_immunization_children_mcv2", to_household_member_other_details.hs_immunization_children_mcv2)
                    .setString("hs_immunization_children_fic", to_household_member_other_details.hs_immunization_children_fic)
                    .setString("hs_immunization_children_protected_at_birth", to_household_member_other_details.hs_immunization_children_protected_at_birth)
                    .setString("hs_immunization_children_exclusive_breastfeeding", to_household_member_other_details.hs_immunization_children_exclusive_breastfeeding)
                    .setString("hs_immunization_young_women_hpv", to_household_member_other_details.hs_immunization_young_women_hpv)
                    .setString("hs_immunization_young_women_mmr", to_household_member_other_details.hs_immunization_young_women_mmr)
                    .setString("hs_immunization_young_women_td", to_household_member_other_details.hs_immunization_young_women_td)
                    .setString("hs_immunization_pregnant_tt1", to_household_member_other_details.hs_immunization_pregnant_tt1)
                    .setString("hs_immunization_pregnant_tt2", to_household_member_other_details.hs_immunization_pregnant_tt2)
                    .setString("hs_immunization_pregnant_tt3", to_household_member_other_details.hs_immunization_pregnant_tt3)
                    .setString("hs_immunization_pregnant_tt4", to_household_member_other_details.hs_immunization_pregnant_tt4)
                    .setString("hs_immunization_pregnant_tt5", to_household_member_other_details.hs_immunization_pregnant_tt5)
                    .setString("hs_immunization_elderly_pneumococcal_vaccine", to_household_member_other_details.hs_immunization_elderly_pneumococcal_vaccine)
                    .setString("hs_immunization_elderly_flu_vaccine", to_household_member_other_details.hs_immunization_elderly_flu_vaccine)
                    .setString("hs_pregnant_lmp", to_household_member_other_details.hs_pregnant_lmp)
                    .setString("hs_pregnant_edc", to_household_member_other_details.hs_pregnant_edc)
                    .setString("hs_pregnant_gp", to_household_member_other_details.hs_pregnant_gp)
                    .setString("hs_pregnant_tpal", to_household_member_other_details.hs_pregnant_tpal)
                    .setString("hs_post_partum_date_of_delivery", to_household_member_other_details.hs_post_partum_date_of_delivery)
                    .setString("hs_post_partum_place_of_delivery", to_household_member_other_details.hs_post_partum_place_of_delivery)
                    .setString("hs_post_partum_type_of_delivery", to_household_member_other_details.hs_post_partum_type_of_delivery)
                    .setString("hs_post_partum_attended_by", to_household_member_other_details.hs_post_partum_attended_by)
                    .setString("hs_post_partum_outcome", to_household_member_other_details.hs_post_partum_outcome)
                    .setString("hs_post_partum_initiated_breasfeeding", to_household_member_other_details.hs_post_partum_initiated_breasfeeding)
                    .setString("hs_post_partum_given_vitamic_a", to_household_member_other_details.hs_post_partum_given_vitamic_a)
                    .setString("hs_family_planning", to_household_member_other_details.hs_family_planning)
                    .setString("hs_tb_program_checklist", to_household_member_other_details.hs_tb_program_checklist)
                    .setString("hs_tb_program_treatment", to_household_member_other_details.hs_tb_program_treatment)
                    .setString("hs_tb_program_treatment_outcome", to_household_member_other_details.hs_tb_program_treatment_outcome)
                    .setString("hs_natality_birthweight", to_household_member_other_details.hs_natality_birthweight)
                    .setString("hs_natality_attended_by", to_household_member_other_details.hs_natality_attended_by)
                    .setString("hs_natality_place_of_delivery", to_household_member_other_details.hs_natality_place_of_delivery)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_other_details.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_other_details to_household_member_other_details) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_other_details  "
                    + " where id='" + to_household_member_other_details.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_other_details.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_other_details> ret_data(String where) {
        List<to_household_member_other_details> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",is_uploaded"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",transient_no"
                    + ",experienced_displacement"
                    + ",experienced_displacement_reasons"
                    + ",has_received_programs"
                    + ",received_programs"
                    + ",received_programs_id_numbers"
                    + ",is_indigenous_people"
                    + ",indigenous_people_group"
                    + ",is_pregnant"
                    + ",solo_parent"
                    + ",relation_to_nuclear_family"
                    + ",has_disability"
                    + ",has_seeing_problem"
                    + ",has_hearing_problem"
                    + ",has_walking_problem"
                    + ",has_remembering_problem"
                    + ",has_self_caring_problem"
                    + ",has_communicating_problem"
                    + ",hs_present_medical_diseases"
                    + ",hs_past_medical_history"
                    + ",hs_family_history_diseases"
                    + ",hs_smoking_history_status"
                    + ",hs_smoking_history_no_of_packs"
                    + ",hs_alcohol_history_status"
                    + ",hs_alcohol_history_no_of_bottles"
                    + ",hs_ellicit_drugs"
                    + ",hs_medical_problems"
                    + ",hs_pwd"
                    + ",hs_immunization_children_bcg"
                    + ",hs_immunization_children_opv1"
                    + ",hs_immunization_children_opv2"
                    + ",hs_immunization_children_opv3"
                    + ",hs_immunization_children_hepa_within_24_hours"
                    + ",hs_immunization_children_hepa_greater_24_hours"
                    + ",hs_immunization_children_penta1"
                    + ",hs_immunization_children_penta2"
                    + ",hs_immunization_children_penta3"
                    + ",hs_immunization_children_mcv1"
                    + ",hs_immunization_children_mcv2"
                    + ",hs_immunization_children_fic"
                    + ",hs_immunization_children_protected_at_birth"
                    + ",hs_immunization_children_exclusive_breastfeeding"
                    + ",hs_immunization_young_women_hpv"
                    + ",hs_immunization_young_women_mmr"
                    + ",hs_immunization_young_women_td"
                    + ",hs_immunization_pregnant_tt1"
                    + ",hs_immunization_pregnant_tt2"
                    + ",hs_immunization_pregnant_tt3"
                    + ",hs_immunization_pregnant_tt4"
                    + ",hs_immunization_pregnant_tt5"
                    + ",hs_immunization_elderly_pneumococcal_vaccine"
                    + ",hs_immunization_elderly_flu_vaccine"
                    + ",hs_pregnant_lmp"
                    + ",hs_pregnant_edc"
                    + ",hs_pregnant_gp"
                    + ",hs_pregnant_tpal"
                    + ",hs_post_partum_date_of_delivery"
                    + ",hs_post_partum_place_of_delivery"
                    + ",hs_post_partum_type_of_delivery"
                    + ",hs_post_partum_attended_by"
                    + ",hs_post_partum_outcome"
                    + ",hs_post_partum_initiated_breasfeeding"
                    + ",hs_post_partum_given_vitamic_a"
                    + ",hs_family_planning"
                    + ",hs_tb_program_checklist"
                    + ",hs_tb_program_treatment"
                    + ",hs_tb_program_treatment_outcome"
                    + ",hs_natality_birthweight"
                    + ",hs_natality_attended_by"
                    + ",hs_natality_place_of_delivery"
                    + " from household_member_other_details"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                String region = rs.getString(6);
                String region_id = rs.getString(7);
                String province = rs.getString(8);
                String province_id = rs.getString(9);
                String city = rs.getString(10);
                String city_id = rs.getString(11);
                String barangay = rs.getString(12);
                String barangay_id = rs.getString(13);
                String purok = rs.getString(14);
                String purok_id = rs.getString(15);
                int status = rs.getInt(16);
                int is_uploaded = rs.getInt(17);
                String house_no = rs.getString(18);
                String household_no = rs.getString(19);
                String household_member_no = rs.getString(20);
                String fname = rs.getString(21);
                String mname = rs.getString(22);
                String lname = rs.getString(23);
                String sname = rs.getString(24);
                String transient_no = rs.getString(25);
                int experienced_displacement = rs.getInt(26);
                String experienced_displacement_reasons = rs.getString(27);
                int has_received_programs = rs.getInt(28);
                String received_programs = rs.getString(29);
                String received_programs_id_numbers = rs.getString(30);
                int is_indigenous_people = rs.getInt(31);
                String indigenous_people_group = rs.getString(32);
                int is_pregnant = rs.getInt(33);
                int solo_parent = rs.getInt(34);
                String relation_to_nuclear_family = rs.getString(35);
                int has_disability = rs.getInt(36);
                int has_seeing_problem = rs.getInt(37);
                int has_hearing_problem = rs.getInt(38);
                int has_walking_problem = rs.getInt(39);
                int has_remembering_problem = rs.getInt(40);
                int has_self_caring_problem = rs.getInt(41);
                int has_communicating_problem = rs.getInt(42);
                String hs_present_medical_diseases = rs.getString(43);
                String hs_past_medical_history = rs.getString(44);
                String hs_family_history_diseases = rs.getString(45);
                int hs_smoking_history_status = rs.getInt(46);
                int hs_smoking_history_no_of_packs = rs.getInt(47);
                int hs_alcohol_history_status = rs.getInt(48);
                int hs_alcohol_history_no_of_bottles = rs.getInt(49);
                int hs_ellicit_drugs = rs.getInt(50);
                String hs_medical_problems = rs.getString(51);
                String hs_pwd = rs.getString(52);
                String hs_immunization_children_bcg = rs.getString(53);
                String hs_immunization_children_opv1 = rs.getString(54);
                String hs_immunization_children_opv2 = rs.getString(55);
                String hs_immunization_children_opv3 = rs.getString(56);
                String hs_immunization_children_hepa_within_24_hours = rs.getString(57);
                String hs_immunization_children_hepa_greater_24_hours = rs.getString(58);
                String hs_immunization_children_penta1 = rs.getString(59);
                String hs_immunization_children_penta2 = rs.getString(60);
                String hs_immunization_children_penta3 = rs.getString(61);
                String hs_immunization_children_mcv1 = rs.getString(62);
                String hs_immunization_children_mcv2 = rs.getString(63);
                String hs_immunization_children_fic = rs.getString(64);
                String hs_immunization_children_protected_at_birth = rs.getString(65);
                String hs_immunization_children_exclusive_breastfeeding = rs.getString(66);
                String hs_immunization_young_women_hpv = rs.getString(67);
                String hs_immunization_young_women_mmr = rs.getString(68);
                String hs_immunization_young_women_td = rs.getString(69);
                String hs_immunization_pregnant_tt1 = rs.getString(70);
                String hs_immunization_pregnant_tt2 = rs.getString(71);
                String hs_immunization_pregnant_tt3 = rs.getString(72);
                String hs_immunization_pregnant_tt4 = rs.getString(73);
                String hs_immunization_pregnant_tt5 = rs.getString(74);
                String hs_immunization_elderly_pneumococcal_vaccine = rs.getString(75);
                String hs_immunization_elderly_flu_vaccine = rs.getString(76);
                String hs_pregnant_lmp = rs.getString(77);
                String hs_pregnant_edc = rs.getString(78);
                String hs_pregnant_gp = rs.getString(79);
                String hs_pregnant_tpal = rs.getString(80);
                String hs_post_partum_date_of_delivery = rs.getString(81);
                String hs_post_partum_place_of_delivery = rs.getString(82);
                String hs_post_partum_type_of_delivery = rs.getString(83);
                String hs_post_partum_attended_by = rs.getString(84);
                String hs_post_partum_outcome = rs.getString(85);
                String hs_post_partum_initiated_breasfeeding = rs.getString(86);
                String hs_post_partum_given_vitamic_a = rs.getString(87);
                String hs_family_planning = rs.getString(88);
                String hs_tb_program_checklist = rs.getString(89);
                String hs_tb_program_treatment = rs.getString(90);
                String hs_tb_program_treatment_outcome = rs.getString(91);
                String hs_natality_birthweight = rs.getString(92);
                String hs_natality_attended_by = rs.getString(93);
                String hs_natality_place_of_delivery = rs.getString(94);

                to_household_member_other_details to = new to_household_member_other_details(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, household_no, household_member_no, fname, mname, lname, sname, transient_no, experienced_displacement, experienced_displacement_reasons, has_received_programs, received_programs, received_programs_id_numbers, is_indigenous_people, indigenous_people_group, is_pregnant, solo_parent, relation_to_nuclear_family, has_disability, has_seeing_problem, has_hearing_problem, has_walking_problem, has_remembering_problem, has_self_caring_problem, has_communicating_problem, hs_present_medical_diseases, hs_past_medical_history, hs_family_history_diseases, hs_smoking_history_status, hs_smoking_history_no_of_packs, hs_alcohol_history_status, hs_alcohol_history_no_of_bottles, hs_ellicit_drugs, hs_medical_problems, hs_pwd, hs_immunization_children_bcg, hs_immunization_children_opv1, hs_immunization_children_opv2, hs_immunization_children_opv3, hs_immunization_children_hepa_within_24_hours, hs_immunization_children_hepa_greater_24_hours, hs_immunization_children_penta1, hs_immunization_children_penta2, hs_immunization_children_penta3, hs_immunization_children_mcv1, hs_immunization_children_mcv2, hs_immunization_children_fic, hs_immunization_children_protected_at_birth, hs_immunization_children_exclusive_breastfeeding, hs_immunization_young_women_hpv, hs_immunization_young_women_mmr, hs_immunization_young_women_td, hs_immunization_pregnant_tt1, hs_immunization_pregnant_tt2, hs_immunization_pregnant_tt3, hs_immunization_pregnant_tt4, hs_immunization_pregnant_tt5, hs_immunization_elderly_pneumococcal_vaccine, hs_immunization_elderly_flu_vaccine, hs_pregnant_lmp, hs_pregnant_edc, hs_pregnant_gp, hs_pregnant_tpal, hs_post_partum_date_of_delivery, hs_post_partum_place_of_delivery, hs_post_partum_type_of_delivery, hs_post_partum_attended_by, hs_post_partum_outcome, hs_post_partum_initiated_breasfeeding, hs_post_partum_given_vitamic_a, hs_family_planning, hs_tb_program_checklist, hs_tb_program_treatment, hs_tb_program_treatment_outcome, hs_natality_birthweight, hs_natality_attended_by, hs_natality_place_of_delivery);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
