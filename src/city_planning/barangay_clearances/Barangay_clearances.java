/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangay_clearances;

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
public class Barangay_clearances {

    public static class to_barangay_clearances {

        public final int id;
        public final String barangay_clearance_no;
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
        public final String citizen;
        public final String citizen_id;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String transient_no;
        public final String purpose;
        public final int is_fixed;
        public final double amount_due;
        public final double amount_tendered;
        public final String punong_barangay;

        public to_barangay_clearances(int id, String barangay_clearance_no, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String citizen, String citizen_id, String house_no, String household_no, String household_member_no, String transient_no, String purpose, int is_fixed, double amount_due, double amount_tendered, String punong_barangay) {
            this.id = id;
            this.barangay_clearance_no = barangay_clearance_no;
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
            this.citizen = citizen;
            this.citizen_id = citizen_id;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.transient_no = transient_no;
            this.purpose = purpose;
            this.is_fixed = is_fixed;
            this.amount_due = amount_due;
            this.amount_tendered = amount_tendered;
            this.punong_barangay = punong_barangay;
        }
    }

    public static void add_data(to_barangay_clearances to_barangay_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangay_clearances("
                    + "barangay_clearance_no"
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
                    + ",citizen"
                    + ",citizen_id"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",transient_no"
                    + ",purpose"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ",punong_barangay"
                    + ")values("
                    + ":barangay_clearance_no"
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
                    + ",:citizen"
                    + ",:citizen_id"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:household_member_no"
                    + ",:transient_no"
                    + ",:purpose"
                    + ",:is_fixed"
                    + ",:amount_due"
                    + ",:amount_tendered"
                    + ",:punong_barangay"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("barangay_clearance_no", to_barangay_clearances.barangay_clearance_no)
                    .setString("created_at", to_barangay_clearances.created_at)
                    .setString("updated_at", to_barangay_clearances.updated_at)
                    .setString("created_by", to_barangay_clearances.created_by)
                    .setString("updated_by", to_barangay_clearances.updated_by)
                    .setString("region", to_barangay_clearances.region)
                    .setString("region_id", to_barangay_clearances.region_id)
                    .setString("province", to_barangay_clearances.province)
                    .setString("province_id", to_barangay_clearances.province_id)
                    .setString("city", to_barangay_clearances.city)
                    .setString("city_id", to_barangay_clearances.city_id)
                    .setString("barangay", to_barangay_clearances.barangay)
                    .setString("barangay_id", to_barangay_clearances.barangay_id)
                    .setString("purok", to_barangay_clearances.purok)
                    .setString("purok_id", to_barangay_clearances.purok_id)
                    .setNumber("status", to_barangay_clearances.status)
                    .setString("citizen", to_barangay_clearances.citizen)
                    .setString("citizen_id", to_barangay_clearances.citizen_id)
                    .setString("house_no", to_barangay_clearances.house_no)
                    .setString("household_no", to_barangay_clearances.household_no)
                    .setString("household_member_no", to_barangay_clearances.household_member_no)
                    .setString("transient_no", to_barangay_clearances.transient_no)
                    .setString("purpose", to_barangay_clearances.purpose)
                    .setNumber("is_fixed", to_barangay_clearances.is_fixed)
                    .setNumber("amount_due", to_barangay_clearances.amount_due)
                    .setNumber("amount_tendered", to_barangay_clearances.amount_tendered)
                    .setString("punong_barangay", to_barangay_clearances.punong_barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_clearances.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_barangay_clearances to_barangay_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangay_clearances set "
                    + "barangay_clearance_no= :barangay_clearance_no "
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
                    + ",citizen= :citizen "
                    + ",citizen_id= :citizen_id "
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + ",transient_no= :transient_no "
                    + ",purpose= :purpose "
                    + ",is_fixed= :is_fixed "
                    + ",amount_due= :amount_due "
                    + ",amount_tendered= :amount_tendered "
                    + ",punong_barangay= :punong_barangay"
                    + " where id='" + to_barangay_clearances.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("barangay_clearance_no", to_barangay_clearances.barangay_clearance_no)
                    .setString("created_at", to_barangay_clearances.created_at)
                    .setString("updated_at", to_barangay_clearances.updated_at)
                    .setString("created_by", to_barangay_clearances.created_by)
                    .setString("updated_by", to_barangay_clearances.updated_by)
                    .setString("region", to_barangay_clearances.region)
                    .setString("region_id", to_barangay_clearances.region_id)
                    .setString("province", to_barangay_clearances.province)
                    .setString("province_id", to_barangay_clearances.province_id)
                    .setString("city", to_barangay_clearances.city)
                    .setString("city_id", to_barangay_clearances.city_id)
                    .setString("barangay", to_barangay_clearances.barangay)
                    .setString("barangay_id", to_barangay_clearances.barangay_id)
                    .setString("purok", to_barangay_clearances.purok)
                    .setString("purok_id", to_barangay_clearances.purok_id)
                    .setNumber("status", to_barangay_clearances.status)
                    .setString("citizen", to_barangay_clearances.citizen)
                    .setString("citizen_id", to_barangay_clearances.citizen_id)
                    .setString("house_no", to_barangay_clearances.house_no)
                    .setString("household_no", to_barangay_clearances.household_no)
                    .setString("household_member_no", to_barangay_clearances.household_member_no)
                    .setString("transient_no", to_barangay_clearances.transient_no)
                    .setString("purpose", to_barangay_clearances.purpose)
                    .setNumber("is_fixed", to_barangay_clearances.is_fixed)
                    .setNumber("amount_due", to_barangay_clearances.amount_due)
                    .setNumber("amount_tendered", to_barangay_clearances.amount_tendered)
                    .setString("punong_barangay", to_barangay_clearances.punong_barangay)
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

    public static void delete_data(to_barangay_clearances to_barangay_clearances) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangay_clearances  "
                    + " where id='" + to_barangay_clearances.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangay_clearances.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_barangay_clearances> ret_data(String where) {
        List<to_barangay_clearances> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",barangay_clearance_no"
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
                    + ",citizen"
                    + ",citizen_id"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",transient_no"
                    + ",purpose"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ",punong_barangay"
                    + " from barangay_clearances"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String barangay_clearance_no = rs.getString(2);
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
                String citizen = rs.getString(18);
                String citizen_id = rs.getString(19);
                String house_no = rs.getString(20);
                String household_no = rs.getString(21);
                String household_member_no = rs.getString(22);
                String transient_no = rs.getString(23);
                String purpose = rs.getString(24);
                int is_fixed = rs.getInt(25);
                double amount_due = rs.getDouble(26);
                double amount_tendered = rs.getDouble(27);
                String punong_barangay=rs.getString(28);
                to_barangay_clearances to = new to_barangay_clearances(id, barangay_clearance_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, citizen, citizen_id, house_no, household_no, household_member_no, transient_no, purpose, is_fixed, amount_due, amount_tendered,punong_barangay);
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
        String id = "BA-000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from barangay_clearances";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select barangay_clearance_no from barangay_clearances where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "BA-000000000000";
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
