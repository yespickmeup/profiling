/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_health_statuses;

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
public class Household_member_health_statuses {

    public static class to_household_member_health_statuses {

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
        public int is_seing_a_doctor;
        public int health_status;
        public String name_of_doctor;
        public String disabilities;
        public String level_of_disability;
        public String cause_of_disability;
        public String transient_no;

        public to_household_member_health_statuses(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, int is_seing_a_doctor, int health_status, String name_of_doctor, String disabilities, String level_of_disability, String cause_of_disability, String transient_no) {
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
            this.is_seing_a_doctor = is_seing_a_doctor;
            this.health_status = health_status;
            this.name_of_doctor = name_of_doctor;
            this.disabilities = disabilities;
            this.level_of_disability = level_of_disability;
            this.cause_of_disability = cause_of_disability;
            this.transient_no = transient_no;
        }

        public int getIs_seing_a_doctor() {
            return is_seing_a_doctor;
        }

        public void setIs_seing_a_doctor(int is_seing_a_doctor) {
            this.is_seing_a_doctor = is_seing_a_doctor;
        }

        public int getHealth_status() {
            return health_status;
        }

        public void setHealth_status(int health_status) {
            this.health_status = health_status;
        }

        public String getName_of_doctor() {
            return name_of_doctor;
        }

        public void setName_of_doctor(String name_of_doctor) {
            this.name_of_doctor = name_of_doctor;
        }

        public String getDisabilities() {
            return disabilities;
        }

        public void setDisabilities(String disabilities) {
            this.disabilities = disabilities;
        }

        public String getLevel_of_disability() {
            return level_of_disability;
        }

        public void setLevel_of_disability(String level_of_disability) {
            this.level_of_disability = level_of_disability;
        }

        public String getCause_of_disability() {
            return cause_of_disability;
        }

        public void setCause_of_disability(String cause_of_disability) {
            this.cause_of_disability = cause_of_disability;
        }

    }

    public static void add_data(to_household_member_health_statuses to_household_member_health_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_health_statuses("
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
                    + ",is_seing_a_doctor"
                    + ",health_status"
                    + ",name_of_doctor"
                    + ",disabilities"
                    + ",level_of_disability"
                    + ",cause_of_disability"
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
                    + ",:is_seing_a_doctor"
                    + ",:health_status"
                    + ",:name_of_doctor"
                    + ",:disabilities"
                    + ",:level_of_disability"
                    + ",:cause_of_disability"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_health_statuses.created_at)
                    .setString("updated_at", to_household_member_health_statuses.updated_at)
                    .setString("created_by", to_household_member_health_statuses.created_by)
                    .setString("updated_by", to_household_member_health_statuses.updated_by)
                    .setString("region", to_household_member_health_statuses.region)
                    .setString("region_id", to_household_member_health_statuses.region_id)
                    .setString("province", to_household_member_health_statuses.province)
                    .setString("province_id", to_household_member_health_statuses.province_id)
                    .setString("city", to_household_member_health_statuses.city)
                    .setString("city_id", to_household_member_health_statuses.city_id)
                    .setString("barangay", to_household_member_health_statuses.barangay)
                    .setString("barangay_id", to_household_member_health_statuses.barangay_id)
                    .setString("purok", to_household_member_health_statuses.purok)
                    .setString("purok_id", to_household_member_health_statuses.purok_id)
                    .setNumber("status", to_household_member_health_statuses.status)
                    .setString("house_no", to_household_member_health_statuses.house_no)
                    .setString("household_no", to_household_member_health_statuses.household_no)
                    .setString("household_member_no", to_household_member_health_statuses.household_member_no)
                    .setString("fname", to_household_member_health_statuses.fname)
                    .setString("mname", to_household_member_health_statuses.mname)
                    .setString("lname", to_household_member_health_statuses.lname)
                    .setString("sname", to_household_member_health_statuses.sname)
                    .setNumber("is_seing_a_doctor", to_household_member_health_statuses.is_seing_a_doctor)
                    .setNumber("health_status", to_household_member_health_statuses.health_status)
                    .setString("name_of_doctor", to_household_member_health_statuses.name_of_doctor)
                    .setString("disabilities", to_household_member_health_statuses.disabilities)
                    .setString("level_of_disability", to_household_member_health_statuses.level_of_disability)
                    .setString("cause_of_disability", to_household_member_health_statuses.cause_of_disability)
                    .setString("transient_no", to_household_member_health_statuses.transient_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_statuses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_health_statuses to_household_member_health_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_health_statuses set "
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
                    + ",is_seing_a_doctor= :is_seing_a_doctor "
                    + ",health_status= :health_status "
                    + ",name_of_doctor= :name_of_doctor "
                    + ",disabilities= :disabilities "
                    + ",level_of_disability= :level_of_disability "
                    + ",cause_of_disability= :cause_of_disability "
                    + " where id='" + to_household_member_health_statuses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_health_statuses.created_at)
                    .setString("updated_at", to_household_member_health_statuses.updated_at)
                    .setString("created_by", to_household_member_health_statuses.created_by)
                    .setString("updated_by", to_household_member_health_statuses.updated_by)
                    .setString("region", to_household_member_health_statuses.region)
                    .setString("region_id", to_household_member_health_statuses.region_id)
                    .setString("province", to_household_member_health_statuses.province)
                    .setString("province_id", to_household_member_health_statuses.province_id)
                    .setString("city", to_household_member_health_statuses.city)
                    .setString("city_id", to_household_member_health_statuses.city_id)
                    .setString("barangay", to_household_member_health_statuses.barangay)
                    .setString("barangay_id", to_household_member_health_statuses.barangay_id)
                    .setString("purok", to_household_member_health_statuses.purok)
                    .setString("purok_id", to_household_member_health_statuses.purok_id)
                    .setNumber("status", to_household_member_health_statuses.status)
                    .setString("house_no", to_household_member_health_statuses.house_no)
                    .setString("household_no", to_household_member_health_statuses.household_no)
                    .setString("household_member_no", to_household_member_health_statuses.household_member_no)
                    .setString("fname", to_household_member_health_statuses.fname)
                    .setString("mname", to_household_member_health_statuses.mname)
                    .setString("lname", to_household_member_health_statuses.lname)
                    .setString("sname", to_household_member_health_statuses.sname)
                    .setNumber("is_seing_a_doctor", to_household_member_health_statuses.is_seing_a_doctor)
                    .setNumber("health_status", to_household_member_health_statuses.health_status)
                    .setString("name_of_doctor", to_household_member_health_statuses.name_of_doctor)
                    .setString("disabilities", to_household_member_health_statuses.disabilities)
                    .setString("level_of_disability", to_household_member_health_statuses.level_of_disability)
                    .setString("cause_of_disability", to_household_member_health_statuses.cause_of_disability)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_statuses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_health_statuses to_household_member_health_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_health_statuses  "
                    + " where id='" + to_household_member_health_statuses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_health_statuses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_health_statuses> ret_data(String where) {
        List<to_household_member_health_statuses> datas = new ArrayList();

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
                    + ",is_seing_a_doctor"
                    + ",health_status"
                    + ",name_of_doctor"
                    + ",disabilities"
                    + ",level_of_disability"
                    + ",cause_of_disability"
                    + ",transient_no"
                    + " from household_member_health_statuses"
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
                int is_seing_a_doctor = rs.getInt(24);
                int health_status = rs.getInt(25);
                String name_of_doctor = rs.getString(26);
                String disabilities = rs.getString(27);
                String level_of_disability = rs.getString(28);
                String cause_of_disability = rs.getString(29);
                String transient_no = rs.getString(30);
                to_household_member_health_statuses to = new to_household_member_health_statuses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, is_seing_a_doctor, health_status, name_of_doctor, disabilities, level_of_disability, cause_of_disability, transient_no);
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
