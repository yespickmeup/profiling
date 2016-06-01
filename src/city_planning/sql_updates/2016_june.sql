/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jun 1, 2016
 */

alter table household_members add contact_no varchar(255);
update household_members set contact_no='';

drop table if exists settings;
create table settings(
id int auto_increment primary key
,city_label varchar(255)
,punong_barangay varchar(255)
);

insert into settings(city_label,punong_barangay)values
('Municipality','Reynaldo A. Caballes');


drop table if exists barangay_officials;
create table barangay_officials(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int 
,region varchar(255)
,region_id varchar(255)
,province varchar(255)
,province_id varchar(255)
,city varchar(255)
,city_id varchar(255)
,barangay varchar(255)
,barangay_id varchar(255)
,fname varchar(255)
,mi  varchar(255)
,lname varchar(255)
,sname varchar(255)
,bday date
,address varchar(255)
,contact_no varchar(255)
,term_started date
,term_ended date
,designation varchar(255)
,is_captain int
);