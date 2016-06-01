


alter table barangays add is_default int;
update barangays set is_default=0;

alter table cities add region_id varchar(255);
alter table cities add region varchar(255);



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



alter table houses add latitude varchar(255);
alter table houses add longtitude varchar(255);

alter table household_members add image varchar(255);

drop table if exists compartments;
create table compartments(
id int auto_increment primary key
,compartment varchar(255)
);

