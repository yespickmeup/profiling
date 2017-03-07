/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Mar 3, 2017
 */

alter table houses add is_uploaded int default 0;
alter table household_member_past_surgical_history add transient_no varchar(255);
drop table if exists mental_problems;
create table mental_problems (
id int auto_increment primary key
,mental_problem varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int default 0
);

insert into mental_problems(mental_problem)
values
('Depression')
,('Psychosis')
,('Behavioral D/O')
,('Alcohol Abuse')
,('Self Harm/Suicide')
,('Epilepsy / Seizure / Patol')
,('Developmental Disorder')
,('Dementia')
,('Drug Use D/O')
;

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
,transient_no varchar(255)
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
,transient_no varchar(255)

);


drop table if exists household_member_other_details;
create table household_member_other_details(
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
,transient_no varchar(255)
,experienced_displacement int
,experienced_displacement_reasons varchar(255)
,has_received_programs int
,received_programs text
,received_programs_id_numbers text
,is_indigenous_people int
,indigenous_people_group varchar(255)
,is_pregnant int
,solo_parent int
,relation_to_nuclear_family varchar(255)
,has_disability int
,has_seeing_problem int
,has_hearing_problem int
,has_walking_problem int
,has_remembering_problem int
,has_self_caring_problem int
,has_communicating_problem int
,hs_present_medical_diseases varchar(255)
,hs_past_medical_history varchar(255)
,hs_family_history_diseases varchar(255)
,hs_smoking_history_status int
,hs_smoking_history_no_of_packs int
,hs_alcohol_history_status int
,hs_alcohol_history_no_of_bottles int
,hs_ellicit_drugs int
,hs_medical_problems varchar(255)
,hs_pwd varchar(255)
,hs_immunization_children_bcg date
,hs_immunization_children_opv1 date
,hs_immunization_children_opv2 date
,hs_immunization_children_opv3 date
,hs_immunization_children_hepa_within_24_hours date
,hs_immunization_children_hepa_greater_24_hours date
,hs_immunization_children_penta1 date
,hs_immunization_children_penta2 date
,hs_immunization_children_penta3 date
,hs_immunization_children_mcv1 date
,hs_immunization_children_mcv2 date
,hs_immunization_children_fic date
,hs_immunization_children_protected_at_birth date
,hs_immunization_children_exclusive_breastfeeding date
,hs_immunization_young_women_hpv date
,hs_immunization_young_women_mmr date
,hs_immunization_young_women_td date
,hs_immunization_pregnant_tt1 date
,hs_immunization_pregnant_tt2 date
,hs_immunization_pregnant_tt3 date
,hs_immunization_pregnant_tt4 date
,hs_immunization_pregnant_tt5 date
,hs_immunization_elderly_pneumococcal_vaccine date
,hs_immunization_elderly_flu_vaccine date
,hs_pregnant_lmp date
,hs_pregnant_edc date
,hs_pregnant_gp date
,hs_pregnant_tpal date
,hs_post_partum_date_of_delivery date
,hs_post_partum_place_of_delivery varchar(255)
,hs_post_partum_type_of_delivery varchar(255)
,hs_post_partum_attended_by varchar(255)
,hs_post_partum_outcome varchar(255)
,hs_post_partum_initiated_breasfeeding date
,hs_post_partum_given_vitamic_a date
,hs_family_planning varchar(255)
,hs_tb_program_checklist varchar(255)
,hs_tb_program_treatment varchar(255)
,hs_tb_program_treatment_outcome varchar(255)
,hs_natality_birthweight varchar(255)
,hs_natality_attended_by varchar(255)
,hs_natality_place_of_delivery varchar(255)
);
