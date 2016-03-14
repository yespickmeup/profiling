


alter table houses add latitude varchar(255);
alter table houses add longtitude varchar(255);

alter table household_members add image varchar(255);

drop table if exists compartments;
create table compartments(
id int auto_increment primary key
,compartment varchar(255)
);

