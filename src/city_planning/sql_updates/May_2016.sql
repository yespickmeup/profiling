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


/* May 10, 2016 - transfer collection -> barangay_clearance & business_permit*/
drop table if exists collections;
drop table if exists collection_types;
drop table if exists collection_purposes;

drop table if exists clearance_purposes;
create table clearance_purposes(
id int auto_increment primary key
,purpose varchar(255)
);

drop table if exists clearance_types;
create table clearance_types(
id int auto_increment primary key
,clearance_type varchar(255)
,is_fixed int
,amount_due double
);



drop table if exists barangay_clearances;
create table barangay_clearances(
id int auto_increment primary key
,barangay_clearance_no varchar(255)
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
,purpose varchar(255)
,is_fixed int
,amount_due double
,amount_tendered double
,punong_barangay varchar(255)
,citizen_bday date
,citizen_civil_status varchar(255)
);

drop table if exists business_clearance_applicants;
create table business_clearance_applicants(
id int auto_increment primary key
,applicant varchar(255)
,address varchar(255)
,email_address varchar(255)
,contact_no varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
);

drop table if exists business_clearances;
create table business_clearances(
id int auto_increment primary key
,business_clearance_no varchar(255)
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
,applicant varchar(255)
,applicant_id varchar(255)
,business_name varchar(255)
,business_location varchar(255)
,valid_on date
,issued_on datetime
,punong_barangay varchar(255)
,is_fixed int
,amount_due double
,amount_tendered double
);

drop table if exists business_clearance_locations;
create table business_clearance_locations(
id int auto_increment primary key
,location varchar(255)
);

/* May 11, 2016*/

drop table if exists settings;
create table settings(
id int auto_increment primary key
,company_name varchar(255)
,company_address varchar(255)
,company_operated_by varchar(255)
,company_slogan varchar(255)
,company_contact_no varchar(255)
,company_fax_no varchar(255)
,company_email_address varchar(255)
,bir_serial_no varchar(255)
,bir_permit_no varchar(255)
,bir_accreditation_no varchar(255)
,bir_tin varchar(255)
,bir_machine_no varchar(255)
,bir_min_no varchar(255)
,bir_business_type varchar(255)
,bir_vat_percent varchar(255)
,bir_receipt_footer varchar(255)
,bir_invoice_footer varchar(255)
,receipt_printing_enabled  int
,receipt_printer_show_dialog int
,kitchen_printing_enable int
,allow_negative_inventory int
,is_server int
,location varchar(255)
,receipt_printing_enabled2  int
,drawer varchar(255)
,developer varchar(255)
,developer_address varchar(255)
,developer_tin_no varchar(255)
,developer_accreditation_no varchar(255)
,developer_accreditation_date varchar(255)
,developer_contact_no varchar(255)
,module_software_type varchar(255)
,module_accounts_payable int
,module_accounts_receivable int
,module_services int
,module_prepayments int
,module_requisition_slip int
,module_charge_in_advance int
);

insert into settings(company_name,company_address,company_operated_by,company_slogan,company_contact_no,company_fax_no,company_email_address
,bir_serial_no,bir_permit_no,bir_accreditation_no,bir_tin,bir_machine_no,bir_min_no,bir_business_type,bir_vat_percent,bir_receipt_footer
,bir_invoice_footer,receipt_printing_enabled,receipt_printer_show_dialog,kitchen_printing_enable,allow_negative_inventory,is_server,location
,receipt_printing_enabled2,drawer,developer,developer_address,developer_tin_no,developer_accreditation_no,developer_accreditation_date,developer_contact_no
,module_software_type,module_accounts_payable,module_accounts_receivable,module_services,module_prepayments,module_requisition_slip,module_charge_in_advance)
values(
'','','','','','',''
,'','','','','','','','',''
,'',0,0,0,0,0,'',0,'','','','','','','',0,0,0,0,0,0,0);
/* 

*/
drop table if exists user_logs;
create table user_logs(
id int auto_increment primary key
,user_id varchar(255)
,user_screen_name varchar(255)
,ip_address varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
);
