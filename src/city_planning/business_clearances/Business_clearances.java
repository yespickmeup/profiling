/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.business_clearances;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Business_clearances {

    public static class to_business_clearances {

        public final int id;
        public final String business_clearance_no;
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
        public final String applicant;
        public final String applicant_id;
        public final String business_name;
        public final String business_location;
        public final String valid_on;
        public final String issued_on;
        public final String punong_barangay;
        public final int is_fixed;
        public final double amount_due;
        public final double amount_tendered;

        public to_business_clearances(int id, String business_clearance_no, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String applicant, String applicant_id, String business_name, String business_location, String valid_on, String issued_on, String punong_barangay, int is_fixed, double amount_due, double amount_tendered) {
            this.id = id;
            this.business_clearance_no = business_clearance_no;
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
            this.applicant = applicant;
            this.applicant_id = applicant_id;
            this.business_name = business_name;
            this.business_location = business_location;
            this.valid_on = valid_on;
            this.issued_on = issued_on;
            this.punong_barangay = punong_barangay;
            this.is_fixed = is_fixed;
            this.amount_due = amount_due;
            this.amount_tendered = amount_tendered;
        }
    }

    public static void add_data(to_business_clearances to_business_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into business_clearances("
                    + "business_clearance_no"
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
                    + ",applicant"
                    + ",applicant_id"
                    + ",business_name"
                    + ",business_location"
                    + ",valid_on"
                    + ",issued_on"
                    + ",punong_barangay"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ")values("
                    + ":business_clearance_no"
                    + ",:created_at"
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
                    + ",:applicant"
                    + ",:applicant_id"
                    + ",:business_name"
                    + ",:business_location"
                    + ",:valid_on"
                    + ",:issued_on"
                    + ",:punong_barangay"
                    + ",:is_fixed"
                    + ",:amount_due"
                    + ",:amount_tendered"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("business_clearance_no", to_business_clearances.business_clearance_no)
                    .setString("created_at", to_business_clearances.created_at)
                    .setString("updated_at", to_business_clearances.updated_at)
                    .setString("created_by", to_business_clearances.created_by)
                    .setString("updated_by", to_business_clearances.updated_by)
                    .setString("region", to_business_clearances.region)
                    .setString("region_id", to_business_clearances.region_id)
                    .setString("province", to_business_clearances.province)
                    .setString("province_id", to_business_clearances.province_id)
                    .setString("city", to_business_clearances.city)
                    .setString("city_id", to_business_clearances.city_id)
                    .setString("barangay", to_business_clearances.barangay)
                    .setString("barangay_id", to_business_clearances.barangay_id)
                    .setString("purok", to_business_clearances.purok)
                    .setString("purok_id", to_business_clearances.purok_id)
                    .setNumber("status", to_business_clearances.status)
                    .setString("applicant", to_business_clearances.applicant)
                    .setString("applicant_id", to_business_clearances.applicant_id)
                    .setString("business_name", to_business_clearances.business_name)
                    .setString("business_location", to_business_clearances.business_location)
                    .setString("valid_on", to_business_clearances.valid_on)
                    .setString("issued_on", to_business_clearances.issued_on)
                    .setString("punong_barangay", to_business_clearances.punong_barangay)
                    .setNumber("is_fixed", to_business_clearances.is_fixed)
                    .setNumber("amount_due", to_business_clearances.amount_due)
                    .setNumber("amount_tendered", to_business_clearances.amount_tendered)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearances.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_business_clearances to_business_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update business_clearances set "
                    + "business_clearance_no= :business_clearance_no "
                    + ",created_at= :created_at "
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
                    + ",applicant= :applicant "
                    + ",applicant_id= :applicant_id "
                    + ",business_name= :business_name "
                    + ",business_location= :business_location "
                    + ",valid_on= :valid_on "
                    + ",issued_on= :issued_on "
                    + ",punong_barangay= :punong_barangay "
                    + ",is_fixed= :is_fixed "
                    + ",amount_due= :amount_due "
                    + ",amount_tendered= :amount_tendered "
                    + " where id='" + to_business_clearances.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("business_clearance_no", to_business_clearances.business_clearance_no)
                    .setString("created_at", to_business_clearances.created_at)
                    .setString("updated_at", to_business_clearances.updated_at)
                    .setString("created_by", to_business_clearances.created_by)
                    .setString("updated_by", to_business_clearances.updated_by)
                    .setString("region", to_business_clearances.region)
                    .setString("region_id", to_business_clearances.region_id)
                    .setString("province", to_business_clearances.province)
                    .setString("province_id", to_business_clearances.province_id)
                    .setString("city", to_business_clearances.city)
                    .setString("city_id", to_business_clearances.city_id)
                    .setString("barangay", to_business_clearances.barangay)
                    .setString("barangay_id", to_business_clearances.barangay_id)
                    .setString("purok", to_business_clearances.purok)
                    .setString("purok_id", to_business_clearances.purok_id)
                    .setNumber("status", to_business_clearances.status)
                    .setString("applicant", to_business_clearances.applicant)
                    .setString("applicant_id", to_business_clearances.applicant_id)
                    .setString("business_name", to_business_clearances.business_name)
                    .setString("business_location", to_business_clearances.business_location)
                    .setString("valid_on", to_business_clearances.valid_on)
                    .setString("issued_on", to_business_clearances.issued_on)
                    .setString("punong_barangay", to_business_clearances.punong_barangay)
                    .setNumber("is_fixed", to_business_clearances.is_fixed)
                    .setNumber("amount_due", to_business_clearances.amount_due)
                    .setNumber("amount_tendered", to_business_clearances.amount_tendered)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearances.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void void_data(to_business_clearances to_business_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update business_clearances set "
                    + " status= :status "
                    + " where id='" + to_business_clearances.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("status", 0)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearances.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_business_clearances to_business_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from business_clearances  "
                    + " where id='" + to_business_clearances.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearances.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_business_clearances> ret_data(String where) {
        List<to_business_clearances> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",business_clearance_no"
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
                    + ",applicant"
                    + ",applicant_id"
                    + ",business_name"
                    + ",business_location"
                    + ",valid_on"
                    + ",issued_on"
                    + ",punong_barangay"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + " from business_clearances"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String business_clearance_no = rs.getString(2);
                String created_at = rs.getString(3);
                String updated_at = rs.getString(4);
                String created_by = rs.getString(5);
                String updated_by = rs.getString(6);
                String region = rs.getString(7);
                String region_id = rs.getString(8);
                String province = rs.getString(9);
                String province_id = rs.getString(10);
                String city = rs.getString(11);
                String city_id = rs.getString(12);
                String barangay = rs.getString(13);
                String barangay_id = rs.getString(14);
                String purok = rs.getString(15);
                String purok_id = rs.getString(16);
                int status = rs.getInt(17);
                String applicant = rs.getString(18);
                String applicant_id = rs.getString(19);
                String business_name = rs.getString(20);
                String business_location = rs.getString(21);
                String valid_on = rs.getString(22);
                String issued_on = rs.getString(23);
                String punong_barangay = rs.getString(24);
                int is_fixed = rs.getInt(25);
                double amount_due = rs.getDouble(26);
                double amount_tendered = rs.getDouble(27);

                to_business_clearances to = new to_business_clearances(id, business_clearance_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, applicant, applicant_id, business_name, business_location, valid_on, issued_on, punong_barangay, is_fixed, amount_due, amount_tendered);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String increment_id() {
        String id = "BU-000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from business_clearances";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select business_clearance_no from business_clearances where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "BU-000000000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
