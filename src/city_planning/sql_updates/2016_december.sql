/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  synsoftech
 * Created: 12 8, 16
 */


alter table household_members add experienced_displacement int default 0;
alter table household_members add experienced_displacement_reasons varchar(255);
alter table household_members add has_received_programs int default 0;
alter table household_members add received_programs text;
alter table household_members add received_programs_id_numbers text;
alter table household_members add is_indigenous_people int default 0;
alter table household_members add indigenous_people_group varchar(255);
alter table household_members add is_pregnant int default 0;
alter table household_members add solo_parent int default 0;
alter table household_members add relation_to_nuclear_family varchar(255);
alter table household_members add has_disability int default 0;
alter table household_members add has_seeing_problem int default 0;
alter table household_members add has_hearing_problem int default 0;
alter table household_members add has_walking_problem int default 0;
alter table household_members add has_remembering_problem int default 0;
alter table household_members add has_self_caring_problem int default 0;
alter table household_members add has_communicating_problem int default 0;
alter table household_members add hs_present_medical_diseases varchar(255);
alter table household_members add hs_past_medical_history varchar(255);
alter table household_members add hs_family_history_diseases varchar(255);
alter table household_members add hs_smoking_history_status int default 0;
alter table household_members add hs_smoking_history_no_of_packs int default 0;
alter table household_members add hs_alcohol_history_status int default 0;
alter table household_members add hs_alcohol_history_no_of_bottles int default 0;
alter table household_members add hs_ellicit_drugs int default 0;
alter table household_members add hs_medical_problems varchar(255);
alter table household_members add hs_pwd varchar(255);
alter table household_members add hs_immunization_children_bcg date;
alter table household_members add hs_immunization_children_opv1 date;
alter table household_members add hs_immunization_children_opv2 date;
alter table household_members add hs_immunization_children_opv3 date;
alter table household_members add hs_immunization_children_hepa_within_24_hours date;
alter table household_members add hs_immunization_children_hepa_greater_24_hours date;
alter table household_members add hs_immunization_children_penta1 date;
alter table household_members add hs_immunization_children_penta2 date;
alter table household_members add hs_immunization_children_penta3 date;
alter table household_members add hs_immunization_children_mcv1 date;
alter table household_members add hs_immunization_children_mcv2 date;
alter table household_members add hs_immunization_children_fic date;
alter table household_members add hs_immunization_children_protected_at_birth date;
alter table household_members add hs_immunization_children_exclusive_breastfeeding date;
alter table household_members add hs_immunization_young_women_hpv date;
alter table household_members add hs_immunization_young_women_mmr date;
alter table household_members add hs_immunization_young_women_td date;
alter table household_members add hs_immunization_pregnant_tt1 date;
alter table household_members add hs_immunization_pregnant_tt2 date;
alter table household_members add hs_immunization_pregnant_tt3 date;
alter table household_members add hs_immunization_pregnant_tt4 date;
alter table household_members add hs_immunization_pregnant_tt5 date;
alter table household_members add hs_immunization_elderly_pneumococcal_vaccine date;
alter table household_members add hs_immunization_elderly_flu_vaccine date;
alter table household_members add hs_pregnant_lmp date;
alter table household_members add hs_pregnant_edc date;
alter table household_members add hs_pregnant_gp date;
alter table household_members add hs_pregnant_tpal date;
alter table household_members add hs_post_partum_date_of_delivery date;
alter table household_members add hs_post_partum_place_of_delivery varchar(255);
alter table household_members add hs_post_partum_type_of_delivery varchar(255);
alter table household_members add hs_post_partum_attended_by varchar(255);
alter table household_members add hs_post_partum_outcome varchar(255);
alter table household_members add hs_post_partum_initiated_breasfeeding date;
alter table household_members add hs_post_partum_given_vitamic_a date;
alter table household_members add hs_family_planning varchar(255);
alter table household_members add hs_tb_program_checklist varchar(255);
alter table household_members add hs_tb_program_treatment varchar(255);
alter table household_members add hs_tb_program_treatment_outcome varchar(255);
alter table household_members add hs_natality_birthweight varchar(255);
alter table household_members add hs_natality_attended_by varchar(255);
alter table household_members add hs_natality_place_of_delivery varchar(255);



drop table if exists household_member_received_programs;
create table household_member_received_programs(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,region varchar(255)
,region_id varchar(255)
,province varchar(255)
,province_id varchar(255)
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,purok varchar(255)
,purok_id varchar(255)
,status int
,is_uploaded int default 0
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,program varchar(255)
,program_id_no varchar(255)
);

drop table if exists household_member_past_surgical_history;
create table household_member_past_surgical_history(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,region varchar(255)
,region_id varchar(255)
,province varchar(255)
,province_id varchar(255)
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,purok varchar(255)
,purok_id varchar(255)
,status int
,is_uploaded int default 0
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,operation varchar(255)
,date_of_operation date
);