/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_skills;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Household_member_skills {

    public static class to_household_member_skills {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public final int status;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        
        public final int ps_teaching;
        public final int ps_negotiating;
        public final int ps_diverting;
        public final int ps_persuading;
        public final int ps_promoting;
        public final int ps_selling;
        public final int ps_leading;
        public final int ps_speaking;
        public final int ps_serving;
        public final int ps_helping;
        public final int ps_encouraging;
        public final int ps_motivating;

        public final int ds_coordinating;
        public final int ds_analyzing;
        public final int ds_planning;
        public final int ds_compiling;
        public final int ds_computing;
        public final int ds_recording;
        public final int ds_checking;
        public final int ds_researching;
        public final int ds_testing;
        public final int ds_comparing;
        public final int ds_tabulating;
        public final int ds_posting;
        public final int ds_copying;

        public final int ts_machine_work;
        public final int ts_setting_up;
        public final int ts_assembling;
        public final int ts_operating;
        public final int ts_driving;
        public final int ts_repairing;
        public final int ts_manipulating;
        public final int ts_materials_handling;
        public final int ts_producing;
        public final int ts_inspecting;
        public final int ts_warehousing;
        public final int ts_building;
        public final int ts_precision_working;
        public final int ts_restoring;
        public final int ts_feeding;

        public final int is_implementing;
        public final int is_synthesizing;
        public final int is_interpreting;
        public final int is_instruction;
        public final int is_speculating;
        public final int is_anticipating;
        public final int is_inventing;
        public final int is_discovering;
        public final int is_predicting;
        public final int is_theorizing;
        public final int is_innovating;
        public final int is_expressing;
        public final int is_organizing;
        public final String transient_no;

        public to_household_member_skills(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, int ps_teaching, int ps_negotiating, int ps_diverting, int ps_persuading, int ps_promoting, int ps_selling, int ps_leading, int ps_speaking, int ps_serving, int ps_helping, int ps_encouraging, int ps_motivating, int ds_coordinating, int ds_analyzing, int ds_planning, int ds_compiling, int ds_computing, int ds_recording, int ds_checking, int ds_researching, int ds_testing, int ds_comparing, int ds_tabulating, int ds_posting, int ds_copying, int ts_machine_work, int ts_setting_up, int ts_assembling, int ts_operating, int ts_driving, int ts_repairing, int ts_manipulating, int ts_materials_handling, int ts_producing, int ts_inspecting, int ts_warehousing, int ts_building, int ts_precision_working, int ts_restoring, int ts_feeding, int is_implementing, int is_synthesizing, int is_interpreting, int is_instruction, int is_speculating, int is_anticipating, int is_inventing, int is_discovering, int is_predicting, int is_theorizing, int is_innovating, int is_expressing, int is_organizing, String transient_no) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.status = status;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.ps_teaching = ps_teaching;
            this.ps_negotiating = ps_negotiating;
            this.ps_diverting = ps_diverting;
            this.ps_persuading = ps_persuading;
            this.ps_promoting = ps_promoting;
            this.ps_selling = ps_selling;
            this.ps_leading = ps_leading;
            this.ps_speaking = ps_speaking;
            this.ps_serving = ps_serving;
            this.ps_helping = ps_helping;
            this.ps_encouraging = ps_encouraging;
            this.ps_motivating = ps_motivating;
            this.ds_coordinating = ds_coordinating;
            this.ds_analyzing = ds_analyzing;
            this.ds_planning = ds_planning;
            this.ds_compiling = ds_compiling;
            this.ds_computing = ds_computing;
            this.ds_recording = ds_recording;
            this.ds_checking = ds_checking;
            this.ds_researching = ds_researching;
            this.ds_testing = ds_testing;
            this.ds_comparing = ds_comparing;
            this.ds_tabulating = ds_tabulating;
            this.ds_posting = ds_posting;
            this.ds_copying = ds_copying;
            this.ts_machine_work = ts_machine_work;
            this.ts_setting_up = ts_setting_up;
            this.ts_assembling = ts_assembling;
            this.ts_operating = ts_operating;
            this.ts_driving = ts_driving;
            this.ts_repairing = ts_repairing;
            this.ts_manipulating = ts_manipulating;
            this.ts_materials_handling = ts_materials_handling;
            this.ts_producing = ts_producing;
            this.ts_inspecting = ts_inspecting;
            this.ts_warehousing = ts_warehousing;
            this.ts_building = ts_building;
            this.ts_precision_working = ts_precision_working;
            this.ts_restoring = ts_restoring;
            this.ts_feeding = ts_feeding;
            this.is_implementing = is_implementing;
            this.is_synthesizing = is_synthesizing;
            this.is_interpreting = is_interpreting;
            this.is_instruction = is_instruction;
            this.is_speculating = is_speculating;
            this.is_anticipating = is_anticipating;
            this.is_inventing = is_inventing;
            this.is_discovering = is_discovering;
            this.is_predicting = is_predicting;
            this.is_theorizing = is_theorizing;
            this.is_innovating = is_innovating;
            this.is_expressing = is_expressing;
            this.is_organizing = is_organizing;
            this.transient_no = transient_no;
        }
    }

    public static void add_data(to_household_member_skills to_household_member_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_skills("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",ps_teaching"
                    + ",ps_negotiating"
                    + ",ps_diverting"
                    + ",ps_persuading"
                    + ",ps_promoting"
                    + ",ps_selling"
                    + ",ps_leading"
                    + ",ps_speaking"
                    + ",ps_serving"
                    + ",ps_helping"
                    + ",ps_encouraging"
                    + ",ps_motivating"
                    + ",ds_coordinating"
                    + ",ds_analyzing"
                    + ",ds_planning"
                    + ",ds_compiling"
                    + ",ds_computing"
                    + ",ds_recording"
                    + ",ds_checking"
                    + ",ds_researching"
                    + ",ds_testing"
                    + ",ds_comparing"
                    + ",ds_tabulating"
                    + ",ds_posting"
                    + ",ds_copying"
                    + ",ts_machine_work"
                    + ",ts_setting_up"
                    + ",ts_assembling"
                    + ",ts_operating"
                    + ",ts_driving"
                    + ",ts_repairing"
                    + ",ts_manipulating"
                    + ",ts_materials_handling"
                    + ",ts_producing"
                    + ",ts_inspecting"
                    + ",ts_warehousing"
                    + ",ts_building"
                    + ",ts_precision_working"
                    + ",ts_restoring"
                    + ",ts_feeding"
                    + ",is_implementing"
                    + ",is_synthesizing"
                    + ",is_interpreting"
                    + ",is_instruction"
                    + ",is_speculating"
                    + ",is_anticipating"
                    + ",is_inventing"
                    + ",is_discovering"
                    + ",is_predicting"
                    + ",is_theorizing"
                    + ",is_innovating"
                    + ",is_expressing"
                    + ",is_organizing"
                    + ",transient_no"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:status"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:household_member_no"
                    + ",:fname"
                    + ",:mname"
                    + ",:lname"
                    + ",:sname"
                    + ",:ps_teaching"
                    + ",:ps_negotiating"
                    + ",:ps_diverting"
                    + ",:ps_persuading"
                    + ",:ps_promoting"
                    + ",:ps_selling"
                    + ",:ps_leading"
                    + ",:ps_speaking"
                    + ",:ps_serving"
                    + ",:ps_helping"
                    + ",:ps_encouraging"
                    + ",:ps_motivating"
                    + ",:ds_coordinating"
                    + ",:ds_analyzing"
                    + ",:ds_planning"
                    + ",:ds_compiling"
                    + ",:ds_computing"
                    + ",:ds_recording"
                    + ",:ds_checking"
                    + ",:ds_researching"
                    + ",:ds_testing"
                    + ",:ds_comparing"
                    + ",:ds_tabulating"
                    + ",:ds_posting"
                    + ",:ds_copying"
                    + ",:ts_machine_work"
                    + ",:ts_setting_up"
                    + ",:ts_assembling"
                    + ",:ts_operating"
                    + ",:ts_driving"
                    + ",:ts_repairing"
                    + ",:ts_manipulating"
                    + ",:ts_materials_handling"
                    + ",:ts_producing"
                    + ",:ts_inspecting"
                    + ",:ts_warehousing"
                    + ",:ts_building"
                    + ",:ts_precision_working"
                    + ",:ts_restoring"
                    + ",:ts_feeding"
                    + ",:is_implementing"
                    + ",:is_synthesizing"
                    + ",:is_interpreting"
                    + ",:is_instruction"
                    + ",:is_speculating"
                    + ",:is_anticipating"
                    + ",:is_inventing"
                    + ",:is_discovering"
                    + ",:is_predicting"
                    + ",:is_theorizing"
                    + ",:is_innovating"
                    + ",:is_expressing"
                    + ",:is_organizing"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_skills.created_at)
                    .setString("updated_at", to_household_member_skills.updated_at)
                    .setString("created_by", to_household_member_skills.created_by)
                    .setString("updated_by", to_household_member_skills.updated_by)
                    .setString("region", to_household_member_skills.region)
                    .setString("region_id", to_household_member_skills.region_id)
                    .setString("province", to_household_member_skills.province)
                    .setString("province_id", to_household_member_skills.province_id)
                    .setString("city", to_household_member_skills.city)
                    .setString("city_id", to_household_member_skills.city_id)
                    .setString("barangay", to_household_member_skills.barangay)
                    .setString("barangay_id", to_household_member_skills.barangay_id)
                    .setString("purok", to_household_member_skills.purok)
                    .setString("purok_id", to_household_member_skills.purok_id)
                    .setNumber("status", to_household_member_skills.status)
                    .setString("house_no", to_household_member_skills.house_no)
                    .setString("household_no", to_household_member_skills.household_no)
                    .setString("household_member_no", to_household_member_skills.household_member_no)
                    .setString("fname", to_household_member_skills.fname)
                    .setString("mname", to_household_member_skills.mname)
                    .setString("lname", to_household_member_skills.lname)
                    .setString("sname", to_household_member_skills.sname)
                    .setNumber("ps_teaching", to_household_member_skills.ps_teaching)
                    .setNumber("ps_negotiating", to_household_member_skills.ps_negotiating)
                    .setNumber("ps_diverting", to_household_member_skills.ps_diverting)
                    .setNumber("ps_persuading", to_household_member_skills.ps_persuading)
                    .setNumber("ps_promoting", to_household_member_skills.ps_promoting)
                    .setNumber("ps_selling", to_household_member_skills.ps_selling)
                    .setNumber("ps_leading", to_household_member_skills.ps_leading)
                    .setNumber("ps_speaking", to_household_member_skills.ps_speaking)
                    .setNumber("ps_serving", to_household_member_skills.ps_serving)
                    .setNumber("ps_helping", to_household_member_skills.ps_helping)
                    .setNumber("ps_encouraging", to_household_member_skills.ps_encouraging)
                    .setNumber("ps_motivating", to_household_member_skills.ps_motivating)
                    .setNumber("ds_coordinating", to_household_member_skills.ds_coordinating)
                    .setNumber("ds_analyzing", to_household_member_skills.ds_analyzing)
                    .setNumber("ds_planning", to_household_member_skills.ds_planning)
                    .setNumber("ds_compiling", to_household_member_skills.ds_compiling)
                    .setNumber("ds_computing", to_household_member_skills.ds_computing)
                    .setNumber("ds_recording", to_household_member_skills.ds_recording)
                    .setNumber("ds_checking", to_household_member_skills.ds_checking)
                    .setNumber("ds_researching", to_household_member_skills.ds_researching)
                    .setNumber("ds_testing", to_household_member_skills.ds_testing)
                    .setNumber("ds_comparing", to_household_member_skills.ds_comparing)
                    .setNumber("ds_tabulating", to_household_member_skills.ds_tabulating)
                    .setNumber("ds_posting", to_household_member_skills.ds_posting)
                    .setNumber("ds_copying", to_household_member_skills.ds_copying)
                    .setNumber("ts_machine_work", to_household_member_skills.ts_machine_work)
                    .setNumber("ts_setting_up", to_household_member_skills.ts_setting_up)
                    .setNumber("ts_assembling", to_household_member_skills.ts_assembling)
                    .setNumber("ts_operating", to_household_member_skills.ts_operating)
                    .setNumber("ts_driving", to_household_member_skills.ts_driving)
                    .setNumber("ts_repairing", to_household_member_skills.ts_repairing)
                    .setNumber("ts_manipulating", to_household_member_skills.ts_manipulating)
                    .setNumber("ts_materials_handling", to_household_member_skills.ts_materials_handling)
                    .setNumber("ts_producing", to_household_member_skills.ts_producing)
                    .setNumber("ts_inspecting", to_household_member_skills.ts_inspecting)
                    .setNumber("ts_warehousing", to_household_member_skills.ts_warehousing)
                    .setNumber("ts_building", to_household_member_skills.ts_building)
                    .setNumber("ts_precision_working", to_household_member_skills.ts_precision_working)
                    .setNumber("ts_restoring", to_household_member_skills.ts_restoring)
                    .setNumber("ts_feeding", to_household_member_skills.ts_feeding)
                    .setNumber("is_implementing", to_household_member_skills.is_implementing)
                    .setNumber("is_synthesizing", to_household_member_skills.is_synthesizing)
                    .setNumber("is_interpreting", to_household_member_skills.is_interpreting)
                    .setNumber("is_instruction", to_household_member_skills.is_instruction)
                    .setNumber("is_speculating", to_household_member_skills.is_speculating)
                    .setNumber("is_anticipating", to_household_member_skills.is_anticipating)
                    .setNumber("is_inventing", to_household_member_skills.is_inventing)
                    .setNumber("is_discovering", to_household_member_skills.is_discovering)
                    .setNumber("is_predicting", to_household_member_skills.is_predicting)
                    .setNumber("is_theorizing", to_household_member_skills.is_theorizing)
                    .setNumber("is_innovating", to_household_member_skills.is_innovating)
                    .setNumber("is_expressing", to_household_member_skills.is_expressing)
                    .setNumber("is_organizing", to_household_member_skills.is_organizing)
                    .setString("transient_no", to_household_member_skills.transient_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_skills.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_skills to_household_member_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_skills set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",status= :status "
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + ",fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",ps_teaching= :ps_teaching "
                    + ",ps_negotiating= :ps_negotiating "
                    + ",ps_diverting= :ps_diverting "
                    + ",ps_persuading= :ps_persuading "
                    + ",ps_promoting= :ps_promoting "
                    + ",ps_selling= :ps_selling "
                    + ",ps_leading= :ps_leading "
                    + ",ps_speaking= :ps_speaking "
                    + ",ps_serving= :ps_serving "
                    + ",ps_helping= :ps_helping "
                    + ",ps_encouraging= :ps_encouraging "
                    + ",ps_motivating= :ps_motivating "
                    + ",ds_coordinating= :ds_coordinating "
                    + ",ds_analyzing= :ds_analyzing "
                    + ",ds_planning= :ds_planning "
                    + ",ds_compiling= :ds_compiling "
                    + ",ds_computing= :ds_computing "
                    + ",ds_recording= :ds_recording "
                    + ",ds_checking= :ds_checking "
                    + ",ds_researching= :ds_researching "
                    + ",ds_testing= :ds_testing "
                    + ",ds_comparing= :ds_comparing "
                    + ",ds_tabulating= :ds_tabulating "
                    + ",ds_posting= :ds_posting "
                    + ",ds_copying= :ds_copying "
                    + ",ts_machine_work= :ts_machine_work "
                    + ",ts_setting_up= :ts_setting_up "
                    + ",ts_assembling= :ts_assembling "
                    + ",ts_operating= :ts_operating "
                    + ",ts_driving= :ts_driving "
                    + ",ts_repairing= :ts_repairing "
                    + ",ts_manipulating= :ts_manipulating "
                    + ",ts_materials_handling= :ts_materials_handling "
                    + ",ts_producing= :ts_producing "
                    + ",ts_inspecting= :ts_inspecting "
                    + ",ts_warehousing= :ts_warehousing "
                    + ",ts_building= :ts_building "
                    + ",ts_precision_working= :ts_precision_working "
                    + ",ts_restoring= :ts_restoring "
                    + ",ts_feeding= :ts_feeding "
                    + ",is_implementing= :is_implementing "
                    + ",is_synthesizing= :is_synthesizing "
                    + ",is_interpreting= :is_interpreting "
                    + ",is_instruction= :is_instruction "
                    + ",is_speculating= :is_speculating "
                    + ",is_anticipating= :is_anticipating "
                    + ",is_inventing= :is_inventing "
                    + ",is_discovering= :is_discovering "
                    + ",is_predicting= :is_predicting "
                    + ",is_theorizing= :is_theorizing "
                    + ",is_innovating= :is_innovating "
                    + ",is_expressing= :is_expressing "
                    + ",is_organizing= :is_organizing "
                    + " where household_member_no='" + to_household_member_skills.household_member_no + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_skills.created_at)
                    .setString("updated_at", to_household_member_skills.updated_at)
                    .setString("created_by", to_household_member_skills.created_by)
                    .setString("updated_by", to_household_member_skills.updated_by)
                    .setString("region", to_household_member_skills.region)
                    .setString("region_id", to_household_member_skills.region_id)
                    .setString("province", to_household_member_skills.province)
                    .setString("province_id", to_household_member_skills.province_id)
                    .setString("city", to_household_member_skills.city)
                    .setString("city_id", to_household_member_skills.city_id)
                    .setString("barangay", to_household_member_skills.barangay)
                    .setString("barangay_id", to_household_member_skills.barangay_id)
                    .setString("purok", to_household_member_skills.purok)
                    .setString("purok_id", to_household_member_skills.purok_id)
                    .setNumber("status", to_household_member_skills.status)
                    .setString("house_no", to_household_member_skills.house_no)
                    .setString("household_no", to_household_member_skills.household_no)
                    .setString("household_member_no", to_household_member_skills.household_member_no)
                    .setString("fname", to_household_member_skills.fname)
                    .setString("mname", to_household_member_skills.mname)
                    .setString("lname", to_household_member_skills.lname)
                    .setString("sname", to_household_member_skills.sname)
                    .setNumber("ps_teaching", to_household_member_skills.ps_teaching)
                    .setNumber("ps_negotiating", to_household_member_skills.ps_negotiating)
                    .setNumber("ps_diverting", to_household_member_skills.ps_diverting)
                    .setNumber("ps_persuading", to_household_member_skills.ps_persuading)
                    .setNumber("ps_promoting", to_household_member_skills.ps_promoting)
                    .setNumber("ps_selling", to_household_member_skills.ps_selling)
                    .setNumber("ps_leading", to_household_member_skills.ps_leading)
                    .setNumber("ps_speaking", to_household_member_skills.ps_speaking)
                    .setNumber("ps_serving", to_household_member_skills.ps_serving)
                    .setNumber("ps_helping", to_household_member_skills.ps_helping)
                    .setNumber("ps_encouraging", to_household_member_skills.ps_encouraging)
                    .setNumber("ps_motivating", to_household_member_skills.ps_motivating)
                    .setNumber("ds_coordinating", to_household_member_skills.ds_coordinating)
                    .setNumber("ds_analyzing", to_household_member_skills.ds_analyzing)
                    .setNumber("ds_planning", to_household_member_skills.ds_planning)
                    .setNumber("ds_compiling", to_household_member_skills.ds_compiling)
                    .setNumber("ds_computing", to_household_member_skills.ds_computing)
                    .setNumber("ds_recording", to_household_member_skills.ds_recording)
                    .setNumber("ds_checking", to_household_member_skills.ds_checking)
                    .setNumber("ds_researching", to_household_member_skills.ds_researching)
                    .setNumber("ds_testing", to_household_member_skills.ds_testing)
                    .setNumber("ds_comparing", to_household_member_skills.ds_comparing)
                    .setNumber("ds_tabulating", to_household_member_skills.ds_tabulating)
                    .setNumber("ds_posting", to_household_member_skills.ds_posting)
                    .setNumber("ds_copying", to_household_member_skills.ds_copying)
                    .setNumber("ts_machine_work", to_household_member_skills.ts_machine_work)
                    .setNumber("ts_setting_up", to_household_member_skills.ts_setting_up)
                    .setNumber("ts_assembling", to_household_member_skills.ts_assembling)
                    .setNumber("ts_operating", to_household_member_skills.ts_operating)
                    .setNumber("ts_driving", to_household_member_skills.ts_driving)
                    .setNumber("ts_repairing", to_household_member_skills.ts_repairing)
                    .setNumber("ts_manipulating", to_household_member_skills.ts_manipulating)
                    .setNumber("ts_materials_handling", to_household_member_skills.ts_materials_handling)
                    .setNumber("ts_producing", to_household_member_skills.ts_producing)
                    .setNumber("ts_inspecting", to_household_member_skills.ts_inspecting)
                    .setNumber("ts_warehousing", to_household_member_skills.ts_warehousing)
                    .setNumber("ts_building", to_household_member_skills.ts_building)
                    .setNumber("ts_precision_working", to_household_member_skills.ts_precision_working)
                    .setNumber("ts_restoring", to_household_member_skills.ts_restoring)
                    .setNumber("ts_feeding", to_household_member_skills.ts_feeding)
                    .setNumber("is_implementing", to_household_member_skills.is_implementing)
                    .setNumber("is_synthesizing", to_household_member_skills.is_synthesizing)
                    .setNumber("is_interpreting", to_household_member_skills.is_interpreting)
                    .setNumber("is_instruction", to_household_member_skills.is_instruction)
                    .setNumber("is_speculating", to_household_member_skills.is_speculating)
                    .setNumber("is_anticipating", to_household_member_skills.is_anticipating)
                    .setNumber("is_inventing", to_household_member_skills.is_inventing)
                    .setNumber("is_discovering", to_household_member_skills.is_discovering)
                    .setNumber("is_predicting", to_household_member_skills.is_predicting)
                    .setNumber("is_theorizing", to_household_member_skills.is_theorizing)
                    .setNumber("is_innovating", to_household_member_skills.is_innovating)
                    .setNumber("is_expressing", to_household_member_skills.is_expressing)
                    .setNumber("is_organizing", to_household_member_skills.is_organizing)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_skills.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_skills to_household_member_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_skills  "
                    + " where id='" + to_household_member_skills.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_skills.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_skills> ret_data(String where) {
        List<to_household_member_skills> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",ps_teaching"
                    + ",ps_negotiating"
                    + ",ps_diverting"
                    + ",ps_persuading"
                    + ",ps_promoting"
                    + ",ps_selling"
                    + ",ps_leading"
                    + ",ps_speaking"
                    + ",ps_serving"
                    + ",ps_helping"
                    + ",ps_encouraging"
                    + ",ps_motivating"
                    + ",ds_coordinating"
                    + ",ds_analyzing"
                    + ",ds_planning"
                    + ",ds_compiling"
                    + ",ds_computing"
                    + ",ds_recording"
                    + ",ds_checking"
                    + ",ds_researching"
                    + ",ds_testing"
                    + ",ds_comparing"
                    + ",ds_tabulating"
                    + ",ds_posting"
                    + ",ds_copying"
                    + ",ts_machine_work"
                    + ",ts_setting_up"
                    + ",ts_assembling"
                    + ",ts_operating"
                    + ",ts_driving"
                    + ",ts_repairing"
                    + ",ts_manipulating"
                    + ",ts_materials_handling"
                    + ",ts_producing"
                    + ",ts_inspecting"
                    + ",ts_warehousing"
                    + ",ts_building"
                    + ",ts_precision_working"
                    + ",ts_restoring"
                    + ",ts_feeding"
                    + ",is_implementing"
                    + ",is_synthesizing"
                    + ",is_interpreting"
                    + ",is_instruction"
                    + ",is_speculating"
                    + ",is_anticipating"
                    + ",is_inventing"
                    + ",is_discovering"
                    + ",is_predicting"
                    + ",is_theorizing"
                    + ",is_innovating"
                    + ",is_expressing"
                    + ",is_organizing"
                    + ",transient_no"
                    + " from household_member_skills"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                created_at = created_at.replace(".0", "");
                String updated_at = rs.getString(3);
                updated_at = updated_at.replace(".0", "");
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                String region = rs.getString(6);
                String region_id = rs.getString(7);
                String province = rs.getString(8);
                String province_id = rs.getString(9);
                String city = rs.getString(10);
                String city_id = rs.getString(11);
                String barangay = rs.getString(12);
                String barangay_id = rs.getString(13);
                String purok = rs.getString(14);
                String purok_id = rs.getString(15);
                int status = rs.getInt(16);
                String house_no = rs.getString(17);
                String household_no = rs.getString(18);
                String household_member_no = rs.getString(19);
                String fname = rs.getString(20);
                String mname = rs.getString(21);
                String lname = rs.getString(22);
                String sname = rs.getString(23);
                int ps_teaching = rs.getInt(24);
                int ps_negotiating = rs.getInt(25);
                int ps_diverting = rs.getInt(26);
                int ps_persuading = rs.getInt(27);
                int ps_promoting = rs.getInt(28);
                int ps_selling = rs.getInt(29);
                int ps_leading = rs.getInt(30);
                int ps_speaking = rs.getInt(31);
                int ps_serving = rs.getInt(32);
                int ps_helping = rs.getInt(33);
                int ps_encouraging = rs.getInt(34);
                int ps_motivating = rs.getInt(35);
                int ds_coordinating = rs.getInt(36);
                int ds_analyzing = rs.getInt(37);
                int ds_planning = rs.getInt(38);
                int ds_compiling = rs.getInt(39);
                int ds_computing = rs.getInt(40);
                int ds_recording = rs.getInt(41);
                int ds_checking = rs.getInt(42);
                int ds_researching = rs.getInt(43);
                int ds_testing = rs.getInt(44);
                int ds_comparing = rs.getInt(45);
                int ds_tabulating = rs.getInt(46);
                int ds_posting = rs.getInt(47);
                int ds_copying = rs.getInt(48);
                int ts_machine_work = rs.getInt(49);
                int ts_setting_up = rs.getInt(50);
                int ts_assembling = rs.getInt(51);
                int ts_operating = rs.getInt(52);
                int ts_driving = rs.getInt(53);
                int ts_repairing = rs.getInt(54);
                int ts_manipulating = rs.getInt(55);
                int ts_materials_handling = rs.getInt(56);
                int ts_producing = rs.getInt(57);
                int ts_inspecting = rs.getInt(58);
                int ts_warehousing = rs.getInt(59);
                int ts_building = rs.getInt(60);
                int ts_precision_working = rs.getInt(61);
                int ts_restoring = rs.getInt(62);
                int ts_feeding = rs.getInt(63);
                int is_implementing = rs.getInt(64);
                int is_synthesizing = rs.getInt(65);
                int is_interpreting = rs.getInt(66);
                int is_instruction = rs.getInt(67);
                int is_speculating = rs.getInt(68);
                int is_anticipating = rs.getInt(69);
                int is_inventing = rs.getInt(70);
                int is_discovering = rs.getInt(71);
                int is_predicting = rs.getInt(72);
                int is_theorizing = rs.getInt(73);
                int is_innovating = rs.getInt(74);
                int is_expressing = rs.getInt(75);
                int is_organizing = rs.getInt(76);
                String transient_no = rs.getString(77);
                to_household_member_skills to = new to_household_member_skills(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, ps_teaching, ps_negotiating, ps_diverting, ps_persuading, ps_promoting, ps_selling, ps_leading, ps_speaking, ps_serving, ps_helping, ps_encouraging, ps_motivating, ds_coordinating, ds_analyzing, ds_planning, ds_compiling, ds_computing, ds_recording, ds_checking, ds_researching, ds_testing, ds_comparing, ds_tabulating, ds_posting, ds_copying, ts_machine_work, ts_setting_up, ts_assembling, ts_operating, ts_driving, ts_repairing, ts_manipulating, ts_materials_handling, ts_producing, ts_inspecting, ts_warehousing, ts_building, ts_precision_working, ts_restoring, ts_feeding, is_implementing, is_synthesizing, is_interpreting, is_instruction, is_speculating, is_anticipating, is_inventing, is_discovering, is_predicting, is_theorizing, is_innovating, is_expressing, is_organizing, transient_no);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
