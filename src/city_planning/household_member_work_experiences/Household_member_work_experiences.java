package city_planning.household_member_work_experiences;

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cordura
 */
public class Household_member_work_experiences {

    public static class to_household_member_work_experiences {

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
        public String company;
        public String company_address;
        public String work_position;
        public String work_description;
        public String work_started;
        public String work_ended;
        public String transient_no;

        public to_household_member_work_experiences(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String company, String company_address, String work_position, String work_description, String work_started, String work_ended, String transient_no) {
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
            this.company = company;
            this.company_address = company_address;
            this.work_position = work_position;
            this.work_description = work_description;
            this.work_started = work_started;
            this.work_ended = work_ended;
            this.transient_no = transient_no;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCompany_address() {
            return company_address;
        }

        public void setCompany_address(String company_address) {
            this.company_address = company_address;
        }

        public String getWork_position() {
            return work_position;
        }

        public void setWork_position(String work_position) {
            this.work_position = work_position;
        }

        public String getWork_description() {
            return work_description;
        }

        public void setWork_description(String work_description) {
            this.work_description = work_description;
        }

        public String getWork_started() {
            return work_started;
        }

        public void setWork_started(String work_started) {
            this.work_started = work_started;
        }

        public String getWork_ended() {
            return work_ended;
        }

        public void setWork_ended(String work_ended) {
            this.work_ended = work_ended;
        }

    }

    public static void add_data(to_household_member_work_experiences to_household_member_work_experiences) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_work_experiences("
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
                    + ",company"
                    + ",company_address"
                    + ",work_position"
                    + ",work_description"
                    + ",work_started"
                    + ",work_ended"
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
                    + ",:company"
                    + ",:company_address"
                    + ",:work_position"
                    + ",:work_description"
                    + ",:work_started"
                    + ",:work_ended"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_work_experiences.created_at)
                    .setString("updated_at", to_household_member_work_experiences.updated_at)
                    .setString("created_by", to_household_member_work_experiences.created_by)
                    .setString("updated_by", to_household_member_work_experiences.updated_by)
                    .setString("region", to_household_member_work_experiences.region)
                    .setString("region_id", to_household_member_work_experiences.region_id)
                    .setString("province", to_household_member_work_experiences.province)
                    .setString("province_id", to_household_member_work_experiences.province_id)
                    .setString("city", to_household_member_work_experiences.city)
                    .setString("city_id", to_household_member_work_experiences.city_id)
                    .setString("barangay", to_household_member_work_experiences.barangay)
                    .setString("barangay_id", to_household_member_work_experiences.barangay_id)
                    .setString("purok", to_household_member_work_experiences.purok)
                    .setString("purok_id", to_household_member_work_experiences.purok_id)
                    .setNumber("status", to_household_member_work_experiences.status)
                    .setString("house_no", to_household_member_work_experiences.house_no)
                    .setString("household_no", to_household_member_work_experiences.household_no)
                    .setString("household_member_no", to_household_member_work_experiences.household_member_no)
                    .setString("fname", to_household_member_work_experiences.fname)
                    .setString("mname", to_household_member_work_experiences.mname)
                    .setString("lname", to_household_member_work_experiences.lname)
                    .setString("sname", to_household_member_work_experiences.sname)
                    .setString("company", to_household_member_work_experiences.company)
                    .setString("company_address", to_household_member_work_experiences.company_address)
                    .setString("work_position", to_household_member_work_experiences.work_position)
                    .setString("work_description", to_household_member_work_experiences.work_description)
                    .setString("work_started", to_household_member_work_experiences.work_started)
                    .setString("work_ended", to_household_member_work_experiences.work_ended)
                    .setString("transient_no", to_household_member_work_experiences.transient_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_work_experiences.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_work_experiences to_household_member_work_experiences) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_work_experiences set "
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
                    + ",company= :company "
                    + ",company_address= :company_address "
                    + ",work_position= :work_position "
                    + ",work_description= :work_description "
                    + ",work_started= :work_started "
                    + ",work_ended= :work_ended "
                    + " where id='" + to_household_member_work_experiences.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_work_experiences.created_at)
                    .setString("updated_at", to_household_member_work_experiences.updated_at)
                    .setString("created_by", to_household_member_work_experiences.created_by)
                    .setString("updated_by", to_household_member_work_experiences.updated_by)
                    .setString("region", to_household_member_work_experiences.region)
                    .setString("region_id", to_household_member_work_experiences.region_id)
                    .setString("province", to_household_member_work_experiences.province)
                    .setString("province_id", to_household_member_work_experiences.province_id)
                    .setString("city", to_household_member_work_experiences.city)
                    .setString("city_id", to_household_member_work_experiences.city_id)
                    .setString("barangay", to_household_member_work_experiences.barangay)
                    .setString("barangay_id", to_household_member_work_experiences.barangay_id)
                    .setString("purok", to_household_member_work_experiences.purok)
                    .setString("purok_id", to_household_member_work_experiences.purok_id)
                    .setNumber("status", to_household_member_work_experiences.status)
                    .setString("house_no", to_household_member_work_experiences.house_no)
                    .setString("household_no", to_household_member_work_experiences.household_no)
                    .setString("household_member_no", to_household_member_work_experiences.household_member_no)
                    .setString("fname", to_household_member_work_experiences.fname)
                    .setString("mname", to_household_member_work_experiences.mname)
                    .setString("lname", to_household_member_work_experiences.lname)
                    .setString("sname", to_household_member_work_experiences.sname)
                    .setString("company", to_household_member_work_experiences.company)
                    .setString("company_address", to_household_member_work_experiences.company_address)
                    .setString("work_position", to_household_member_work_experiences.work_position)
                    .setString("work_description", to_household_member_work_experiences.work_description)
                    .setString("work_started", to_household_member_work_experiences.work_started)
                    .setString("work_ended", to_household_member_work_experiences.work_ended)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_work_experiences.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_work_experiences to_household_member_work_experiences) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_work_experiences  "
                    + " where id='" + to_household_member_work_experiences.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_work_experiences.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_work_experiences> ret_data(String where) {
        List<to_household_member_work_experiences> datas = new ArrayList();

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
                    + ",company"
                    + ",company_address"
                    + ",work_position"
                    + ",work_description"
                    + ",work_started"
                    + ",work_ended"
                    + ",transient_no"
                    + " from household_member_work_experiences"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
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
                String company = rs.getString(24);
                String company_address = rs.getString(25);
                String work_position = rs.getString(26);
                String work_description = rs.getString(27);
                String work_started = rs.getString(28);
                String work_ended = rs.getString(29);
                String transient_no = rs.getString(30);
                to_household_member_work_experiences to = new to_household_member_work_experiences(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, company, company_address, work_position, work_description, work_started, work_ended, transient_no);
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
