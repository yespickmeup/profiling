/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.voter_certifications;

import city_planning.barangay_clearances.Barangay_clearances;
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
public class Voter_certifications {

    public static class to_voter_certifications {

        public final int id;
        public final String voter_certificate_no;
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
        public final String voter;
        public final String voter_id;
        public final String punong_barangay;
        public final int is_fixed;
        public final double amount_due;
        public final double amount_tendered;
        public final String purpose;

        public to_voter_certifications(int id, String voter_certificate_no, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String voter, String voter_id, String punong_barangay, int is_fixed, double amount_due, double amount_tendered, String purpose) {
            this.id = id;
            this.voter_certificate_no = voter_certificate_no;
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
            this.voter = voter;
            this.voter_id = voter_id;
            this.punong_barangay = punong_barangay;
            this.is_fixed = is_fixed;
            this.amount_due = amount_due;
            this.amount_tendered = amount_tendered;
            this.purpose = purpose;
        }
    }

    public static void add_data(to_voter_certifications to_voter_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into voter_certifications("
                    + "voter_certificate_no"
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
                    + ",voter"
                    + ",voter_id"
                    + ",punong_barangay"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ",purpose"
                    + ")values("
                    + ":voter_certificate_no"
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
                    + ",:voter"
                    + ",:voter_id"
                    + ",:punong_barangay"
                    + ",:is_fixed"
                    + ",:amount_due"
                    + ",:amount_tendered"
                    + ",:purpose"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("voter_certificate_no", to_voter_certifications.voter_certificate_no)
                    .setString("created_at", to_voter_certifications.created_at)
                    .setString("updated_at", to_voter_certifications.updated_at)
                    .setString("created_by", to_voter_certifications.created_by)
                    .setString("updated_by", to_voter_certifications.updated_by)
                    .setString("region", to_voter_certifications.region)
                    .setString("region_id", to_voter_certifications.region_id)
                    .setString("province", to_voter_certifications.province)
                    .setString("province_id", to_voter_certifications.province_id)
                    .setString("city", to_voter_certifications.city)
                    .setString("city_id", to_voter_certifications.city_id)
                    .setString("barangay", to_voter_certifications.barangay)
                    .setString("barangay_id", to_voter_certifications.barangay_id)
                    .setString("purok", to_voter_certifications.purok)
                    .setString("purok_id", to_voter_certifications.purok_id)
                    .setNumber("status", to_voter_certifications.status)
                    .setString("voter", to_voter_certifications.voter)
                    .setString("voter_id", to_voter_certifications.voter_id)
                    .setString("punong_barangay", to_voter_certifications.punong_barangay)
                    .setNumber("is_fixed", to_voter_certifications.is_fixed)
                    .setNumber("amount_due", to_voter_certifications.amount_due)
                    .setNumber("amount_tendered", to_voter_certifications.amount_tendered)
                    .setString("purpose", to_voter_certifications.purpose)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Voter_certifications.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_voter_certifications to_voter_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update voter_certifications set "
                    + "voter_certificate_no= :voter_certificate_no "
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
                    + ",voter= :voter "
                    + ",voter_id= :voter_id "
                    + ",punong_barangay= :punong_barangay "
                    + ",is_fixed= :is_fixed "
                    + ",amount_due= :amount_due "
                    + ",amount_tendered= :amount_tendered "
                    + ",purpose= :purpose"
                    + " where id='" + to_voter_certifications.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("voter_certificate_no", to_voter_certifications.voter_certificate_no)
                    .setString("created_at", to_voter_certifications.created_at)
                    .setString("updated_at", to_voter_certifications.updated_at)
                    .setString("created_by", to_voter_certifications.created_by)
                    .setString("updated_by", to_voter_certifications.updated_by)
                    .setString("region", to_voter_certifications.region)
                    .setString("region_id", to_voter_certifications.region_id)
                    .setString("province", to_voter_certifications.province)
                    .setString("province_id", to_voter_certifications.province_id)
                    .setString("city", to_voter_certifications.city)
                    .setString("city_id", to_voter_certifications.city_id)
                    .setString("barangay", to_voter_certifications.barangay)
                    .setString("barangay_id", to_voter_certifications.barangay_id)
                    .setString("purok", to_voter_certifications.purok)
                    .setString("purok_id", to_voter_certifications.purok_id)
                    .setNumber("status", to_voter_certifications.status)
                    .setString("voter", to_voter_certifications.voter)
                    .setString("voter_id", to_voter_certifications.voter_id)
                    .setString("punong_barangay", to_voter_certifications.punong_barangay)
                    .setNumber("is_fixed", to_voter_certifications.is_fixed)
                    .setNumber("amount_due", to_voter_certifications.amount_due)
                    .setNumber("amount_tendered", to_voter_certifications.amount_tendered)
                    .setString("purpose", to_voter_certifications.purpose)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Voter_certifications.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_voter_certifications to_voter_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from voter_certifications  "
                    + " where id='" + to_voter_certifications.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Voter_certifications.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_voter_certifications> ret_data(String where) {
        List<to_voter_certifications> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",voter_certificate_no"
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
                    + ",voter"
                    + ",voter_id"
                    + ",punong_barangay"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ",purpose"
                    + " from voter_certifications"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String voter_certificate_no = rs.getString(2);
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
                String voter = rs.getString(18);
                String voter_id = rs.getString(19);
                String punong_barangay = rs.getString(20);
                int is_fixed = rs.getInt(21);
                double amount_due = rs.getDouble(22);
                double amount_tendered = rs.getDouble(23);
                String purpose = rs.getString(24);
                to_voter_certifications to = new to_voter_certifications(id, voter_certificate_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, voter, voter_id, punong_barangay, is_fixed, amount_due, amount_tendered, purpose);
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
        String id = "VC-000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from voter_certifications";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select voter_certificate_no from voter_certifications where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "VC-000000000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void void_data(Voter_certifications.to_voter_certifications to_barangay_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update voter_certifications set "
                    + " status= :status "
                    + " where id='" + to_barangay_clearances.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("status", 0)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_clearances.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
