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