/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Oct 9, 2017
 */


drop table if exists settings;
create table settings(
id int auto_increment primary key
,default_barangay varchar(255)
,default_barangay_id varchar(255)
,barangay_is_city int
,punong_barangay varchar(255)
,household_assets int
,household_expenditures int
,household_consumptions int
,household_concerns int
,household_source_of_income int
,household_member_educational_background int
,household_member_health_status int
,household_member_medication int
,household_member_work_experience int
,household_member_license_and_certificates int
,household_member_employment_status int
,household_member_skills int
);

insert into settings(
default_barangay
,default_barangay_id
,barangay_is_city
,punong_barangay
,household_assets
,household_expenditures
,household_consumptions
,household_concerns
,household_source_of_income
,household_member_educational_background
,household_member_health_status
,household_member_medication
,household_member_work_experience
,household_member_license_and_certificates
,household_member_employment_status
,household_member_skills
)
values
(
'Malang Suba'
,'1'
,'1'
,'Juan Dela Cruz'
,0
,0
,0
,0
,0
,0
,0
,0
,0
,0
,0
,0
);