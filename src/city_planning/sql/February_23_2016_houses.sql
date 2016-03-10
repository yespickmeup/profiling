/*concerns*/
Create table household_member_concerns
(
id int PRIMARY KEY AUTO_INCREMENT,
concerns varchar(255));

insert into household_member_concerns(id,concerns)
VALUES (1,'Excellent');


insert into household_member_concerns(id,concerns)
VALUES (2,'Adequate');



insert into household_member_concerns(id,concerns)
VALUES (3,'Inadequate');



/*problems*/




Create table household_member_problems
(
id int PRIMARY KEY AUTO_INCREMENT,
problems varchar(255));

insert into household_member_problems(id,problems)
VALUES (1,'Very Low');


insert into household_member_problems(id,problems)
VALUES (2,'Average');



insert into household_member_problems(id,problems)
VALUES (3,'Low');


insert into household_member_problems(id,problems)
VALUES (4,'Above Average');


insert into household_member_problems(id,problems)
VALUES (5,'High');


insert into household_member_problems(id,problems)
VALUES (6,'Excellent');


/* houses */
drop table if exists houses;
create table houses(
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
,house_no varchar(255)
,no_of_rooms int
,bldg_types varchar(255)
,bldg_permit varchar(255)
,toilet_types varchar(255)
,compartments varchar(255)
,bathroom_types varchar(255)
,waste_disposal_methods varchar(255)
,kitchen_types varchar(255)
,trans_types varchar(255)
,construction_roof_types varchar(255)
,construction_wall_types varchar(255)
,construction_floor_types varchar(255)
,construction_communication_types varchar(255)
,lighting_fuels varchar(255)
,cooking_fuels varchar(255)
,water_sources varchar(255)
,drinking_water_source_distance double
,nearest_water_source_distance double
);


/* households*/
drop table if exists households;
create table households(
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
,house_no varchar(255)
,household_no varchar(255)
,occupancy_types varchar(255)
,tenure varchar(255)
,is_occupant_owns_the_land int
,is_occupant_owns_the_bldg int
,monthly_rental double
,drainage_system_concern varchar(255)
,street_maintenance_concern varchar(255)
,garbage_collection_concern varchar(255)
,fire_protection_concern varchar(255)
,police_protection_concern varchar(255)
,ambulance_service_concern varchar(255)
,livelihood_programs_concern varchar(255)
,adolescent_pregnancy_rate varchar(255)
,child_abuse_rating varchar(255)
,crime_rating varchar(255)
,domestic_violence_rating varchar(255)
,drug_abuse_rating varchar(255)
,hunger_rating varchar(255)
,environmental_contamination_rating varchar(255)
,health_disparities_rating varchar(255)
);


/* household_assets */
drop table if exists household_assets;
create table household_assets(
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
,house_no varchar(255)
,household_no varchar(255)
,qty double
,assets text
);


/* household_consumptions */
drop table if exists household_consumptions;
create table household_consumptions(
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
,house_no varchar(255)
,household_no varchar(255)
,consumption_date date
,items text
,amount double
);


/* household_expenditures */
drop table if exists household_expenditures;
create table household_expenditures(
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
,house_no varchar(255)
,household_no varchar(255)
,expenditure_date date
,fuel_expenses double
,internet_services double
,medical_expenses double
,cigarretes double
,hobbies_clubs double
,load_expenses double
,electric_gas_expenses double
,books_newspapers_expenses double
,gambling double
,personal_care double
,misc double
,alcohol double
,vacation double
,water_bill double
,cable_services double
,social_obligations double
);

/* household_members */
drop table if exists household_members;
create table household_members(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,gender varchar(255)
,marital_status varchar(255)
,bday date
,occupancy_years double
,height varchar(255)
,weight varchar(255)
,birth_place varchar(255)
,present_address varchar(255)
,relation_to_household varchar(255)
,religion varchar(255)
,citizenship varchar(255)
,email_address varchar(255)
,blood_type varchar(255)
,languages_spoken varchar(255)
,is_registered_voter int
,voters_id_no varchar(255)
);

/* household_member_health_statuses */
drop table if exists household_member_health_statuses;
create table household_member_health_statuses(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,is_seing_a_doctor int
,health_status int
,name_of_doctor varchar(255)
,disabilities varchar(255)
,level_of_disability varchar(255)
,cause_of_disability varchar(255)
);

/* household_member_medications */
drop table if exists household_member_medications;
create table household_member_medications(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,prescription varchar(255)
,dosage varchar(255)
,medication_date_started date
,medication_date_ended date
);

/* household_member_educational_backgrounds */
drop table if exists household_member_educational_backgrounds;
create table household_member_educational_backgrounds(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,educational_status varchar(255)
,name_of_school varchar(255)
,achievements varchar(255)
,highest_grade double
,year_graduated date
);

/* household_member_vocational_experiences */
drop table if exists household_member_vocational_experiences;
create table household_member_vocational_experiences(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,name_of_training varchar(255)
,certificate_received varchar(255)
,skills_required varchar(255)
,name_of_school varchar(255)
,period_of_training varchar(255)
);


/* household_member_competence_certificates */
drop table if exists household_member_competence_certificates;
create table household_member_competence_certificates(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,certificate varchar(255)
,rating varchar(255)
,issued_by varchar(255)
,date_issued date
);

/* household_member_licenses */
drop table if exists household_member_licenses;
create table household_member_licenses(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,title varchar(255)
,expiry date
);


/* household_member_work_experiences */
drop table if exists household_member_work_experiences;
create table household_member_work_experiences(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,company varchar(255)
,company_address varchar(255)
,work_position varchar(255)
,work_description varchar(255)
,work_started date
,work_ended date
);


/* household_member_prefered_works */
drop table if exists household_member_prefered_works;
create table household_member_prefered_works(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,work text
);


/* household_member_employment_status */
drop table if exists household_member_employment_status;
create table household_member_employment_status(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,employment_status int
,employment_type varchar(255)
,unemployment_type varchar(255)
,company varchar(255)
,work_position varchar(255)
,work_description varchar(255)
,is_looking_for_work int
,ofw_business_name varchar(255)
,ofw_business_address varchar(255)
,ofw_mailing_address varchar(255)
,ofw_type_of_business varchar(255)
,ofw_financial_assistance_amount double
,ofw_country varchar(255)
,ofw_job varchar(255)
,ofw_reason_for_migration varchar(255)
);


/* household_member_skills */
drop table if exists household_member_skills;
create table household_member_skills(
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
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,fname varchar(255)
,mname varchar(255)
,lname varchar(255)
,sname varchar(255)
,ps_teaching int
,ps_negotiating int
,ps_diverting int
,ps_persuading int
,ps_promoting int
,ps_selling int
,ps_leading int
,ps_speaking int
,ps_serving int
,ps_helping int
,ps_encouraging int
,ps_motivating int
,ds_coordinating int
,ds_analyzing int
,ds_planning int
,ds_compiling int
,ds_computing int
,ds_recording int
,ds_checking int
,ds_researching int
,ds_testing int
,ds_comparing int
,ds_tabulating int
,ds_posting int
,ds_copying int
,ts_machine_work int
,ts_setting_up int
,ts_assembling int
,ts_operating int
,ts_driving int
,ts_repairing int
,ts_manipulating int
,ts_materials_handling int
,ts_producing int
,ts_inspecting int
,ts_warehousing int
,ts_building int
,ts_precision_working int
,ts_restoring int
,ts_feeding int
,is_implementing int
,is_synthesizing int
,is_interpreting int
,is_instruction int
,is_speculating int
,is_anticipating int
,is_inventing int
,is_discovering int
,is_predicting int
,is_theorizing int
,is_innovating int
,is_expressing int
,is_organizing int
);
