/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangay_officials;

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
public class Barangay_officials {

    public static class to_barangay_officials {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String sname;
        public final String bday;
        public final String address;
        public final String contact_no;
        public final String term_started;
        public final String term_ended;
        public final String designation;
        public final int is_captain;

        public to_barangay_officials(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String fname, String mi, String lname, String sname, String bday, String address, String contact_no, String term_started, String term_ended, String designation, int is_captain) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.sname = sname;
            this.bday = bday;
            this.address = address;
            this.contact_no = contact_no;
            this.term_started = term_started;
            this.term_ended = term_ended;
            this.designation = designation;
            this.is_captain = is_captain;
        }
    }

    public static void add_data(to_barangay_officials to_barangay_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangay_officials("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",bday"
                    + ",address"
                    + ",contact_no"
                    + ",term_started"
                    + ",term_ended"
                    + ",designation"
                    + ",is_captain"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:sname"
                    + ",:bday"
                    + ",:address"
                    + ",:contact_no"
                    + ",:term_started"
                    + ",:term_ended"
                    + ",:designation"
                    + ",:is_captain"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_barangay_officials.created_at)
                    .setString("updated_at", to_barangay_officials.updated_at)
                    .setString("created_by", to_barangay_officials.created_by)
                    .setString("updated_by", to_barangay_officials.updated_by)
                    .setNumber("status", to_barangay_officials.status)
                    .setString("region", to_barangay_officials.region)
                    .setString("region_id", to_barangay_officials.region_id)
                    .setString("province", to_barangay_officials.province)
                    .setString("province_id", to_barangay_officials.province_id)
                    .setString("city", to_barangay_officials.city)
                    .setString("city_id", to_barangay_officials.city_id)
                    .setString("barangay", to_barangay_officials.barangay)
                    .setString("barangay_id", to_barangay_officials.barangay_id)
                    .setString("fname", to_barangay_officials.fname)
                    .setString("mi", to_barangay_officials.mi)
                    .setString("lname", to_barangay_officials.lname)
                    .setString("sname", to_barangay_officials.sname)
                    .setString("bday", to_barangay_officials.bday)
                    .setString("address", to_barangay_officials.address)
                    .setString("contact_no", to_barangay_officials.contact_no)
                    .setString("term_started", to_barangay_officials.term_started)
                    .setString("term_ended", to_barangay_officials.term_ended)
                    .setString("designation", to_barangay_officials.designation)
                    .setNumber("is_captain", to_barangay_officials.is_captain)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_officials.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_barangay_officials to_barangay_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangay_officials set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",bday= :bday "
                    + ",address= :address "
                    + ",contact_no= :contact_no "
                    + ",term_started= :term_started "
                    + ",term_ended= :term_ended "
                    + ",designation= :designation "
                    + ",is_captain= :is_captain "
                    + " where id='" + to_barangay_officials.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_barangay_officials.created_at)
                    .setString("updated_at", to_barangay_officials.updated_at)
                    .setString("created_by", to_barangay_officials.created_by)
                    .setString("updated_by", to_barangay_officials.updated_by)
                    .setNumber("status", to_barangay_officials.status)
                    .setString("region", to_barangay_officials.region)
                    .setString("region_id", to_barangay_officials.region_id)
                    .setString("province", to_barangay_officials.province)
                    .setString("province_id", to_barangay_officials.province_id)
                    .setString("city", to_barangay_officials.city)
                    .setString("city_id", to_barangay_officials.city_id)
                    .setString("barangay", to_barangay_officials.barangay)
                    .setString("barangay_id", to_barangay_officials.barangay_id)
                    .setString("fname", to_barangay_officials.fname)
                    .setString("mi", to_barangay_officials.mi)
                    .setString("lname", to_barangay_officials.lname)
                    .setString("sname", to_barangay_officials.sname)
                    .setString("bday", to_barangay_officials.bday)
                    .setString("address", to_barangay_officials.address)
                    .setString("contact_no", to_barangay_officials.contact_no)
                    .setString("term_started", to_barangay_officials.term_started)
                    .setString("term_ended", to_barangay_officials.term_ended)
                    .setString("designation", to_barangay_officials.designation)
                    .setNumber("is_captain", to_barangay_officials.is_captain)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_officials.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_barangay_officials to_barangay_officials) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangay_officials  "
                    + " where id='" + to_barangay_officials.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_officials.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_barangay_officials> ret_data(String where) {
        List<to_barangay_officials> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",sname"
                    + ",bday"
                    + ",address"
                    + ",contact_no"
                    + ",term_started"
                    + ",term_ended"
                    + ",designation"
                    + ",is_captain"
                    + " from barangay_officials"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                int status = rs.getInt(6);
                String region = rs.getString(7);
                String region_id = rs.getString(8);
                String province = rs.getString(9);
                String province_id = rs.getString(10);
                String city = rs.getString(11);
                String city_id = rs.getString(12);
                String barangay = rs.getString(13);
                String barangay_id = rs.getString(14);
                String fname = rs.getString(15);
                String mi = rs.getString(16);
                String lname = rs.getString(17);
                String sname = rs.getString(18);
                String bday = rs.getString(19);
                String address = rs.getString(20);
                String contact_no = rs.getString(21);
                String term_started = rs.getString(22);
                String term_ended = rs.getString(23);
                String designation = rs.getString(24);
                int is_captain = rs.getInt(25);

                to_barangay_officials to = new to_barangay_officials(id, created_at, updated_at, created_by, updated_by, status, region, region_id, province, province_id, city, city_id, barangay, barangay_id, fname, mi, lname, sname, bday, address, contact_no, term_started, term_ended, designation, is_captain);
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
