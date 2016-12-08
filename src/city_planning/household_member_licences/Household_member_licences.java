/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_licences;

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
 * @author Cordura
 */
public class Household_member_licences {

    public static class to_household_member_licenses {

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
        public int status;
        public int is_uploaded;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        public String title;
        public String expiry;
        public String transient_no;

        public to_household_member_licenses(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, int is_uploaded, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String title, String expiry, String transient_no) {
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
            this.is_uploaded = is_uploaded;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.title = title;
            this.expiry = expiry;
            this.transient_no = transient_no;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getIs_uploaded() {
            return is_uploaded;
        }

        public void setIs_uploaded(int is_uploaded) {
            this.is_uploaded = is_uploaded;
        }

        public String getTransient_no() {
            return transient_no;
        }

        public void setTransient_no(String transient_no) {
            this.transient_no = transient_no;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getExpiry() {
            return expiry;
        }

        public void setExpiry(String expiry) {
            this.expiry = expiry;
        }

    }

    public static void add_data(to_household_member_licenses to_household_member_licenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_licenses("
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
                    + ",title"
                    + ",expiry"
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
                    + ",:title"
                    + ",:expiry"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_licenses.created_at)
                    .setString("updated_at", to_household_member_licenses.updated_at)
                    .setString("created_by", to_household_member_licenses.created_by)
                    .setString("updated_by", to_household_member_licenses.updated_by)
                    .setString("region", to_household_member_licenses.region)
                    .setString("region_id", to_household_member_licenses.region_id)
                    .setString("province", to_household_member_licenses.province)
                    .setString("province_id", to_household_member_licenses.province_id)
                    .setString("city", to_household_member_licenses.city)
                    .setString("city_id", to_household_member_licenses.city_id)
                    .setString("barangay", to_household_member_licenses.barangay)
                    .setString("barangay_id", to_household_member_licenses.barangay_id)
                    .setString("purok", to_household_member_licenses.purok)
                    .setString("purok_id", to_household_member_licenses.purok_id)
                    .setNumber("status", to_household_member_licenses.status)
                    .setString("house_no", to_household_member_licenses.house_no)
                    .setString("household_no", to_household_member_licenses.household_no)
                    .setString("household_member_no", to_household_member_licenses.household_member_no)
                    .setString("fname", to_household_member_licenses.fname)
                    .setString("mname", to_household_member_licenses.mname)
                    .setString("lname", to_household_member_licenses.lname)
                    .setString("sname", to_household_member_licenses.sname)
                    .setString("title", to_household_member_licenses.title)
                    .setString("expiry", to_household_member_licenses.expiry)
                    .setString("transient_no", to_household_member_licenses.transient_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(to_household_member_licenses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_licenses to_household_member_licenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_licenses set "
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
                    + ",title= :title "
                    + ",expiry= :expiry "
                    + ",is_uploaded= :is_uploaded"
                    + " where id='" + to_household_member_licenses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_licenses.created_at)
                    .setString("updated_at", to_household_member_licenses.updated_at)
                    .setString("created_by", to_household_member_licenses.created_by)
                    .setString("updated_by", to_household_member_licenses.updated_by)
                    .setString("region", to_household_member_licenses.region)
                    .setString("region_id", to_household_member_licenses.region_id)
                    .setString("province", to_household_member_licenses.province)
                    .setString("province_id", to_household_member_licenses.province_id)
                    .setString("city", to_household_member_licenses.city)
                    .setString("city_id", to_household_member_licenses.city_id)
                    .setString("barangay", to_household_member_licenses.barangay)
                    .setString("barangay_id", to_household_member_licenses.barangay_id)
                    .setString("purok", to_household_member_licenses.purok)
                    .setString("purok_id", to_household_member_licenses.purok_id)
                    .setNumber("status", to_household_member_licenses.status)
                    .setString("house_no", to_household_member_licenses.house_no)
                    .setString("household_no", to_household_member_licenses.household_no)
                    .setString("household_member_no", to_household_member_licenses.household_member_no)
                    .setString("fname", to_household_member_licenses.fname)
                    .setString("mname", to_household_member_licenses.mname)
                    .setString("lname", to_household_member_licenses.lname)
                    .setString("sname", to_household_member_licenses.sname)
                    .setString("title", to_household_member_licenses.title)
                    .setString("expiry", to_household_member_licenses.expiry)
                    .setNumber("is_uploaded", to_household_member_licenses.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(to_household_member_licenses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_licenses to_household_member_licenses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_licenses  "
                    + " where id='" + to_household_member_licenses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(to_household_member_licenses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_licenses> ret_data(String where) {
        List<to_household_member_licenses> datas = new ArrayList();

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
                    + ",title"
                    + ",expiry"
                    + ",transient_no"
                    + ",is_uploaded"
                    + " from household_member_licenses"
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
                String title = rs.getString(24);
                String expiry = rs.getString(25);
                String transient_no = rs.getString(26);
                int is_uploaded = rs.getInt(27);
                to_household_member_licenses to = new to_household_member_licenses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, household_no, household_member_no, fname, mname, lname, sname, title, expiry, transient_no);
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
