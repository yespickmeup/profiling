/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_assets;

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
 * @author PeterGil
 */
public class Household_assets {

    public static class to_household_assets {

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
        public  double qty;
        public  String assets;

        public to_household_assets(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, double qty, String assets) {
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
            this.qty = qty;
            this.assets = assets;
        }

        public double getQty() {
            return qty;
        }

        public void setQty(double qty) {
            this.qty = qty;
        }

        public String getAssets() {
            return assets;
        }

        public void setAssets(String assets) {
            this.assets = assets;
        }
        
    }

    public static void add_data(to_household_assets to_household_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_assets("
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
                    + ",qty"
                    + ",assets"
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
                    + ",:qty"
                    + ",:assets"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_assets.created_at)
                    .setString("updated_at", to_household_assets.updated_at)
                    .setString("created_by", to_household_assets.created_by)
                    .setString("updated_by", to_household_assets.updated_by)
                    .setString("region", to_household_assets.region)
                    .setString("region_id", to_household_assets.region_id)
                    .setString("province", to_household_assets.province)
                    .setString("province_id", to_household_assets.province_id)
                    .setString("city", to_household_assets.city)
                    .setString("city_id", to_household_assets.city_id)
                    .setString("barangay", to_household_assets.barangay)
                    .setString("barangay_id", to_household_assets.barangay_id)
                    .setString("purok", to_household_assets.purok)
                    .setString("purok_id", to_household_assets.purok_id)
                    .setNumber("status", to_household_assets.status)
                    .setString("house_no", to_household_assets.house_no)
                    .setString("household_no", to_household_assets.household_no)
                    .setNumber("qty", to_household_assets.qty)
                    .setString("assets", to_household_assets.assets)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_assets.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_assets to_household_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_assets set "
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
                    + ",qty= :qty "
                    + ",assets= :assets "
                    + " where id='" + to_household_assets.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_assets.created_at)
                    .setString("updated_at", to_household_assets.updated_at)
                    .setString("created_by", to_household_assets.created_by)
                    .setString("updated_by", to_household_assets.updated_by)
                    .setString("region", to_household_assets.region)
                    .setString("region_id", to_household_assets.region_id)
                    .setString("province", to_household_assets.province)
                    .setString("province_id", to_household_assets.province_id)
                    .setString("city", to_household_assets.city)
                    .setString("city_id", to_household_assets.city_id)
                    .setString("barangay", to_household_assets.barangay)
                    .setString("barangay_id", to_household_assets.barangay_id)
                    .setString("purok", to_household_assets.purok)
                    .setString("purok_id", to_household_assets.purok_id)
                    .setNumber("status", to_household_assets.status)
                    .setString("house_no", to_household_assets.house_no)
                    .setString("household_no", to_household_assets.household_no)
                    .setNumber("qty", to_household_assets.qty)
                    .setString("assets", to_household_assets.assets)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_assets.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_assets to_household_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_assets  "
                    + " where id='" + to_household_assets.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_assets.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_assets> ret_data(String where) {
        List<to_household_assets> datas = new ArrayList();

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
                    + ",qty"
                    + ",assets"
                    + " from household_assets"
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
                double qty = rs.getDouble(19);
                String assets = rs.getString(20);

                to_household_assets to = new to_household_assets(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, qty, assets);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void save_data(to_household_assets to_household_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_assets("
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
                    + ",qty"
                    + ",assets"
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
                    + ",:qty"
                    + ",:assets"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_assets.created_at)
                    .setString("updated_at", to_household_assets.updated_at)
                    .setString("created_by", to_household_assets.created_by)
                    .setString("updated_by", to_household_assets.updated_by)
                    .setString("region", to_household_assets.region)
                    .setString("region_id", to_household_assets.region_id)
                    .setString("province", to_household_assets.province)
                    .setString("province_id", to_household_assets.province_id)
                    .setString("city", to_household_assets.city)
                    .setString("city_id", to_household_assets.city_id)
                    .setString("barangay", to_household_assets.barangay)
                    .setString("barangay_id", to_household_assets.barangay_id)
                    .setString("purok", to_household_assets.purok)
                    .setString("purok_id", to_household_assets.purok_id)
                    .setNumber("status", to_household_assets.status)
                    .setString("house_no", to_household_assets.house_no)
                    .setString("household_no", to_household_assets.household_no)
                    .setNumber("qty", to_household_assets.qty)
                    .setString("assets", to_household_assets.assets)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_assets.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
