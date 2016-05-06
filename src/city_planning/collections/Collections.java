/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.collections;

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
public class Collections {

    public static class to_collections {

        public final int id;
        public final String collection_no;
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
        public final String issuance_type;
        public final String issuance_type_id;
        public final String purpose;
        public final int is_fixed;
        public final double amount_due;
        public final double amount_tendered;

        public to_collections(int id, String collection_no, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String citizen, String citizen_id, String house_no, String household_no, String household_member_no, String transient_no, String issuance_type, String issuance_type_id, String purpose, int is_fixed, double amount_due, double amount_tendered) {
            this.id = id;
            this.collection_no = collection_no;
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
            this.issuance_type = issuance_type;
            this.issuance_type_id = issuance_type_id;
            this.purpose = purpose;
            this.is_fixed = is_fixed;
            this.amount_due = amount_due;
            this.amount_tendered = amount_tendered;
        }
    }

    public static void add_data(to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into collections("
                    + "collection_no"
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
                    + ",issuance_type"
                    + ",issuance_type_id"
                    + ",purpose"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + ")values("
                    + ":collection_no"
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
                    + ",:issuance_type"
                    + ",:issuance_type_id"
                    + ",:purpose"
                    + ",:is_fixed"
                    + ",:amount_due"
                    + ",:amount_tendered"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("collection_no", to_collections.collection_no)
                    .setString("created_at", to_collections.created_at)
                    .setString("updated_at", to_collections.updated_at)
                    .setString("created_by", to_collections.created_by)
                    .setString("updated_by", to_collections.updated_by)
                    .setString("region", to_collections.region)
                    .setString("region_id", to_collections.region_id)
                    .setString("province", to_collections.province)
                    .setString("province_id", to_collections.province_id)
                    .setString("city", to_collections.city)
                    .setString("city_id", to_collections.city_id)
                    .setString("barangay", to_collections.barangay)
                    .setString("barangay_id", to_collections.barangay_id)
                    .setString("purok", to_collections.purok)
                    .setString("purok_id", to_collections.purok_id)
                    .setNumber("status", to_collections.status)
                    .setString("citizen", to_collections.citizen)
                    .setString("citizen_id", to_collections.citizen_id)
                    .setString("house_no", to_collections.house_no)
                    .setString("household_no", to_collections.household_no)
                    .setString("household_member_no", to_collections.household_member_no)
                    .setString("transient_no", to_collections.transient_no)
                    .setString("issuance_type", to_collections.issuance_type)
                    .setString("issuance_type_id", to_collections.issuance_type_id)
                    .setString("purpose", to_collections.purpose)
                    .setNumber("is_fixed", to_collections.is_fixed)
                    .setNumber("amount_due", to_collections.amount_due)
                    .setNumber("amount_tendered", to_collections.amount_tendered)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collections.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update collections set "
                    + "collection_no= :collection_no "
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
                    + ",issuance_type= :issuance_type "
                    + ",issuance_type_id= :issuance_type_id "
                    + ",purpose= :purpose "
                    + ",is_fixed= :is_fixed "
                    + ",amount_due= :amount_due "
                    + ",amount_tendered= :amount_tendered "
                    + " where id='" + to_collections.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("collection_no", to_collections.collection_no)
                    .setString("created_at", to_collections.created_at)
                    .setString("updated_at", to_collections.updated_at)
                    .setString("created_by", to_collections.created_by)
                    .setString("updated_by", to_collections.updated_by)
                    .setString("region", to_collections.region)
                    .setString("region_id", to_collections.region_id)
                    .setString("province", to_collections.province)
                    .setString("province_id", to_collections.province_id)
                    .setString("city", to_collections.city)
                    .setString("city_id", to_collections.city_id)
                    .setString("barangay", to_collections.barangay)
                    .setString("barangay_id", to_collections.barangay_id)
                    .setString("purok", to_collections.purok)
                    .setString("purok_id", to_collections.purok_id)
                    .setNumber("status", to_collections.status)
                    .setString("citizen", to_collections.citizen)
                    .setString("citizen_id", to_collections.citizen_id)
                    .setString("house_no", to_collections.house_no)
                    .setString("household_no", to_collections.household_no)
                    .setString("household_member_no", to_collections.household_member_no)
                    .setString("transient_no", to_collections.transient_no)
                    .setString("issuance_type", to_collections.issuance_type)
                    .setString("issuance_type_id", to_collections.issuance_type_id)
                    .setString("purpose", to_collections.purpose)
                    .setNumber("is_fixed", to_collections.is_fixed)
                    .setNumber("amount_due", to_collections.amount_due)
                    .setNumber("amount_tendered", to_collections.amount_tendered)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collections.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_collection(to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update collections set "
                    + "status = 0 "
                    + " where id='" + to_collections.id + "' "
                    + " ";

           

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collections.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_collections to_collections) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from collections  "
                    + " where id='" + to_collections.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collections.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_collections> ret_data(String where) {
        List<to_collections> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",collection_no"
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
                    + ",issuance_type"
                    + ",issuance_type_id"
                    + ",purpose"
                    + ",is_fixed"
                    + ",amount_due"
                    + ",amount_tendered"
                    + " from collections"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String collection_no = rs.getString(2);
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
                String issuance_type = rs.getString(24);
                String issuance_type_id = rs.getString(25);
                String purpose = rs.getString(26);
                int is_fixed = rs.getInt(27);
                double amount_due = rs.getDouble(28);
                double amount_tendered = rs.getDouble(29);

                to_collections to = new to_collections(id, collection_no, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, citizen, citizen_id, house_no, household_no, household_member_no, transient_no, issuance_type, issuance_type_id, purpose, is_fixed, amount_due, amount_tendered);
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
        String id = "000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from collections";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select collection_no from collections where id='" + id + "'";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "000000000000";
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
