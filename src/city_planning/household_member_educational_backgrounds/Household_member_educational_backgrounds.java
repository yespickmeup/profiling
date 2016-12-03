/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_educational_backgrounds;

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
public class Household_member_educational_backgrounds {

    public static class to_household_member_educational_backgrounds {

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
        public String educational_status;
        public String name_of_school;
        public String achievements;
        public double highest_grade;
        public String year_graduated;
        public String transient_no;
        public to_household_member_educational_backgrounds(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String educational_status, String name_of_school, String achievements, double highest_grade, String year_graduated,String transient_no) {
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
            this.educational_status = educational_status;
            this.name_of_school = name_of_school;
            this.achievements = achievements;
            this.highest_grade = highest_grade;
            this.year_graduated = year_graduated;
            this.transient_no=transient_no;
        }

        public String getEducational_status() {
            return educational_status;
        }

        public void setEducational_status(String educational_status) {
            this.educational_status = educational_status;
        }

        public String getName_of_school() {
            return name_of_school;
        }

        public void setName_of_school(String name_of_school) {
            this.name_of_school = name_of_school;
        }

        public String getAchievements() {
            return achievements;
        }

        public void setAchievements(String achievements) {
            this.achievements = achievements;
        }

        public double getHighest_grade() {
            return highest_grade;
        }

        public void setHighest_grade(double highest_grade) {
            this.highest_grade = highest_grade;
        }

        public String getYear_graduated() {
            return year_graduated;
        }

        public void setYear_graduated(String year_graduated) {
            this.year_graduated = year_graduated;
        }

    }

    public static void add_data(to_household_member_educational_backgrounds to_household_member_educational_backgrounds) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_educational_backgrounds("
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
                    + ",educational_status"
                    + ",name_of_school"
                    + ",achievements"
                    + ",highest_grade"
                    + ",year_graduated"
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
                    + ",:educational_status"
                    + ",:name_of_school"
                    + ",:achievements"
                    + ",:highest_grade"
                    + ",:year_graduated"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_educational_backgrounds.created_at)
                    .setString("updated_at", to_household_member_educational_backgrounds.updated_at)
                    .setString("created_by", to_household_member_educational_backgrounds.created_by)
                    .setString("updated_by", to_household_member_educational_backgrounds.updated_by)
                    .setString("region", to_household_member_educational_backgrounds.region)
                    .setString("region_id", to_household_member_educational_backgrounds.region_id)
                    .setString("province", to_household_member_educational_backgrounds.province)
                    .setString("province_id", to_household_member_educational_backgrounds.province_id)
                    .setString("city", to_household_member_educational_backgrounds.city)
                    .setString("city_id", to_household_member_educational_backgrounds.city_id)
                    .setString("barangay", to_household_member_educational_backgrounds.barangay)
                    .setString("barangay_id", to_household_member_educational_backgrounds.barangay_id)
                    .setString("purok", to_household_member_educational_backgrounds.purok)
                    .setString("purok_id", to_household_member_educational_backgrounds.purok_id)
                    .setNumber("status", to_household_member_educational_backgrounds.status)
                    .setString("house_no", to_household_member_educational_backgrounds.house_no)
                    .setString("household_no", to_household_member_educational_backgrounds.household_no)
                    .setString("household_member_no", to_household_member_educational_backgrounds.household_member_no)
                    .setString("fname", to_household_member_educational_backgrounds.fname)
                    .setString("mname", to_household_member_educational_backgrounds.mname)
                    .setString("lname", to_household_member_educational_backgrounds.lname)
                    .setString("sname", to_household_member_educational_backgrounds.sname)
                    .setString("educational_status", to_household_member_educational_backgrounds.educational_status)
                    .setString("name_of_school", to_household_member_educational_backgrounds.name_of_school)
                    .setString("achievements", to_household_member_educational_backgrounds.achievements)
                    .setNumber("highest_grade", to_household_member_educational_backgrounds.highest_grade)
                    .setString("year_graduated", to_household_member_educational_backgrounds.year_graduated)
                    .setString("transient_no", to_household_member_educational_backgrounds.transient_no)
                    
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_backgrounds.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_educational_backgrounds to_household_member_educational_backgrounds) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_educational_backgrounds set "
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
                    + ",educational_status= :educational_status "
                    + ",name_of_school= :name_of_school "
                    + ",achievements= :achievements "
                    + ",highest_grade= :highest_grade "
                    + ",year_graduated= :year_graduated "
                    + " where id='" + to_household_member_educational_backgrounds.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_educational_backgrounds.created_at)
                    .setString("updated_at", to_household_member_educational_backgrounds.updated_at)
                    .setString("created_by", to_household_member_educational_backgrounds.created_by)
                    .setString("updated_by", to_household_member_educational_backgrounds.updated_by)
                    .setString("region", to_household_member_educational_backgrounds.region)
                    .setString("region_id", to_household_member_educational_backgrounds.region_id)
                    .setString("province", to_household_member_educational_backgrounds.province)
                    .setString("province_id", to_household_member_educational_backgrounds.province_id)
                    .setString("city", to_household_member_educational_backgrounds.city)
                    .setString("city_id", to_household_member_educational_backgrounds.city_id)
                    .setString("barangay", to_household_member_educational_backgrounds.barangay)
                    .setString("barangay_id", to_household_member_educational_backgrounds.barangay_id)
                    .setString("purok", to_household_member_educational_backgrounds.purok)
                    .setString("purok_id", to_household_member_educational_backgrounds.purok_id)
                    .setNumber("status", to_household_member_educational_backgrounds.status)
                    .setString("house_no", to_household_member_educational_backgrounds.house_no)
                    .setString("household_no", to_household_member_educational_backgrounds.household_no)
                    .setString("household_member_no", to_household_member_educational_backgrounds.household_member_no)
                    .setString("fname", to_household_member_educational_backgrounds.fname)
                    .setString("mname", to_household_member_educational_backgrounds.mname)
                    .setString("lname", to_household_member_educational_backgrounds.lname)
                    .setString("sname", to_household_member_educational_backgrounds.sname)
                    .setString("educational_status", to_household_member_educational_backgrounds.educational_status)
                    .setString("name_of_school", to_household_member_educational_backgrounds.name_of_school)
                    .setString("achievements", to_household_member_educational_backgrounds.achievements)
                    .setNumber("highest_grade", to_household_member_educational_backgrounds.highest_grade)
                    .setString("year_graduated", to_household_member_educational_backgrounds.year_graduated)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_backgrounds.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_educational_backgrounds to_household_member_educational_backgrounds) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_educational_backgrounds  "
                    + " where id='" + to_household_member_educational_backgrounds.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_educational_backgrounds.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_educational_backgrounds> ret_data(String where) {
        List<to_household_member_educational_backgrounds> datas = new ArrayList();

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
                    + ",educational_status"
                    + ",name_of_school"
                    + ",achievements"
                    + ",highest_grade"
                    + ",year_graduated"
                    + ",transient_no"
                    + " from household_member_educational_backgrounds"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                created_at=created_at.replace(".0", "");
                String updated_at = rs.getString(3);
                updated_at=updated_at.replace(".0", "");
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
                String educational_status = rs.getString(24);
                String name_of_school = rs.getString(25);
                String achievements = rs.getString(26);
                double highest_grade = rs.getDouble(27);
                String year_graduated = rs.getString(28);
                String transient_no=rs.getString(29);
                to_household_member_educational_backgrounds to = new to_household_member_educational_backgrounds(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, educational_status, name_of_school, achievements, highest_grade, year_graduated,transient_no);
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
