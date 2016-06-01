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