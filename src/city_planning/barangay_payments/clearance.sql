/* barangay_clearance_payment */
drop table if exists barangay_clearance_payment;
create table barangay_clearance_payment(
id int auto_increment primary key
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,clearance_type varchar(255)
,purpose varchar(255)
,amount int
,change varchar(225)
,purpose_detail varchar(255)
,payment_date date
);