/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Guinness
 * Created: Jan 18, 2017
 */


drop table if exists medical_diseases;
create table medical_diseases (
id int auto_increment primary key
,medical_disease varchar(255)
,created_at datetime
,updated_at datetime
,created_by varchar(255)
,updated_by varchar(255)
,status int
,is_uploaded int default 0
);

insert into medical_diseases(medical_disease)values
('Thyroid ds.')
,('TB')
,('UTI')
,('Allergy')
,('Asthma')
,('Cancer')
,('CUD')
,('CHF')
,('Diabetes')
,('Emphysema')
,('COPD')
,('Epilepsy')
,('Hepatitis')
,('HPN')
,('Pneumonia')
,('Others')
;



