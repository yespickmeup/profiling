/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  synsoftech
 * Created: 11 25, 16
 */

households
household_assets
household_consumptions
household_expenditures
household_members
household_member_competence_certificates
household_member_educational_backgrounds
household_member_employment_status
household_member_health_statuses
household_member_licenses
household_member_medications
household_member_prefered_works
household_member_skills
household_member_vocational_experiences
household_member_work_experiences
household_positions
houses




delete from households;
delete from household_assets;
delete from household_consumptions;
delete from househhousehold_expendituresolds;
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
delete from household_positions;
delete from houses;




alter table households add is_uploaded int DEFAULT 0 after status ;
alter table household_assets add is_uploaded int DEFAULT 0 after status ;
alter table household_consumptions add is_uploaded int DEFAULT 0 after status ;
alter table household_expenditures add is_uploaded int DEFAULT 0 after status ;
alter table household_members add is_uploaded int DEFAULT 0 after status ;
alter table household_member_competence_certificates add is_uploaded int DEFAULT 0 after status ;
alter table household_member_educational_backgrounds add is_uploaded int DEFAULT 0 after status ;
alter table household_member_employment_status add is_uploaded int DEFAULT 0 after status ;
alter table household_member_health_statuses add is_uploaded int DEFAULT 0 after status ;
alter table household_member_licenses add is_uploaded int DEFAULT 0 after status ;
alter table household_member_medications add is_uploaded int DEFAULT 0 after status ;
alter table household_member_prefered_works add is_uploaded int DEFAULT 0 after status ;
alter table household_member_skills add is_uploaded int DEFAULT 0 after status ;
alter table household_member_vocational_experiences add is_uploaded int DEFAULT 0 after status ;
alter table household_member_work_experiences add is_uploaded int DEFAULT 0 after status ;


-- alter table household_positions add is_uploaded int DEFAULT 0 after status ;













