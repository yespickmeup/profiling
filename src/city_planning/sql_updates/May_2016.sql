/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: May 4, 2016
 */

delete from houses;
delete from households;
delete from household_assets;
delete from household_consumptions;
delete from household_expenditures;
delete from household_members;
delete from household_member_competence_certificates;
delete from household_member_educational_backgrounds;
delete from household_member_employment_status;
delete from household_member_health_statuses;
delete from household_member_licenses;
delete from household_member_medications;
delete from household_member_prefered_works;
delete from household_member_skills;
delete from household_member_vocational_experiences;
delete from household_member_work_experiences;

alter table houses add no_of_households int;
alter table houses add no_of_household_members int;
alter table households add no_of_household_members int ;
alter table household_members add transient_no varchar(255) ;

alter table household_member_competence_certificates add transient_no varchar(255) ;
alter table household_member_educational_backgrounds add transient_no varchar(255) ;
alter table household_member_employment_status add transient_no varchar(255) ;
alter table household_member_health_statuses add transient_no varchar(255) ;
alter table household_member_licenses add transient_no varchar(255) ;
alter table household_member_medications add transient_no varchar(255) ;
alter table household_member_prefered_works add transient_no varchar(255) ;
alter table household_member_skills add transient_no varchar(255) ;
alter table household_member_vocational_experiences add transient_no varchar(255) ;
alter table household_member_work_experiences add transient_no varchar(255) ;

update houses set no_of_households=0;
update houses set no_of_household_members=0;
update households set no_of_household_members=0;


drop table if exists collections;
create table collections(
id int auto_increment primary key
,collection_no varchar(255)
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
,citizen varchar(255)
,citizen_id varchar(255)
,house_no varchar(255)
,household_no varchar(255)
,household_member_no varchar(255)
,transient_no varchar(255)
,issuance_type varchar(255)
,issuance_type_id varchar(255)
,purpose varchar(255)
,is_fixed int
,amount_due double
,amount_tendered double
);

drop table if exists collection_types;
create table collection_types(
id int auto_increment primary key
,collection_type varchar(255)
,is_fixed int
,amount_due double
);

drop table if exists collection_purposes;
create table collection_purposes(
id int auto_increment primary key
,purpose varchar(255)
);