/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_source_of_income;

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
public class Household_source_of_income {

    public static class to_household_source_of_income {

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
        public  int status;
        public  int is_uploaded;
        public final String house_no;
        public final String household_no;
        public  String date_of_income;
        public  String source_of_income;
        public  double amount;

        public to_household_source_of_income(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, int is_uploaded, String house_no, String household_no, String date_of_income, String source_of_income, double amount) {
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
            this.date_of_income = date_of_income;
            this.source_of_income = source_of_income;
            this.amount = amount;
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
        
        public String getDate_of_income() {
            return date_of_income;
        }

        public void setDate_of_income(String date_of_income) {
            this.date_of_income = date_of_income;
        }

        public String getSource_of_income() {
            return source_of_income;
        }

        public void setSource_of_income(String source_of_income) {
            this.source_of_income = source_of_income;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
        
    }

    public static void add_data(to_household_source_of_income to_household_source_of_income) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_source_of_income("
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
                    + ",is_uploaded"
                    + ",house_no"
                    + ",household_no"
                    + ",date_of_income"
                    + ",source_of_income"
                    + ",amount"
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
                    + ",:is_uploaded"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:date_of_income"
                    + ",:source_of_income"
                    + ",:amount"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_source_of_income.created_at)
                    .setString("updated_at", to_household_source_of_income.updated_at)
                    .setString("created_by", to_household_source_of_income.created_by)
                    .setString("updated_by", to_household_source_of_income.updated_by)
                    .setString("region", to_household_source_of_income.region)
                    .setString("region_id", to_household_source_of_income.region_id)
                    .setString("province", to_household_source_of_income.province)
                    .setString("province_id", to_household_source_of_income.province_id)
                    .setString("city", to_household_source_of_income.city)
                    .setString("city_id", to_household_source_of_income.city_id)
                    .setString("barangay", to_household_source_of_income.barangay)
                    .setString("barangay_id", to_household_source_of_income.barangay_id)
                    .setString("purok", to_household_source_of_income.purok)
                    .setString("purok_id", to_household_source_of_income.purok_id)
                    .setNumber("status", to_household_source_of_income.status)
                    .setNumber("is_uploaded", to_household_source_of_income.is_uploaded)
                    .setString("house_no", to_household_source_of_income.house_no)
                    .setString("household_no", to_household_source_of_income.household_no)
                    .setString("date_of_income", to_household_source_of_income.date_of_income)
                    .setString("source_of_income", to_household_source_of_income.source_of_income)
                    .setNumber("amount", to_household_source_of_income.amount)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_source_of_income.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_source_of_income to_household_source_of_income) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_source_of_income set "
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
                    + ",is_uploaded= :is_uploaded "
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",date_of_income= :date_of_income "
                    + ",source_of_income= :source_of_income "
                    + ",amount= :amount "
                    + " where id='" + to_household_source_of_income.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_source_of_income.created_at)
                    .setString("updated_at", to_household_source_of_income.updated_at)
                    .setString("created_by", to_household_source_of_income.created_by)
                    .setString("updated_by", to_household_source_of_income.updated_by)
                    .setString("region", to_household_source_of_income.region)
                    .setString("region_id", to_household_source_of_income.region_id)
                    .setString("province", to_household_source_of_income.province)
                    .setString("province_id", to_household_source_of_income.province_id)
                    .setString("city", to_household_source_of_income.city)
                    .setString("city_id", to_household_source_of_income.city_id)
                    .setString("barangay", to_household_source_of_income.barangay)
                    .setString("barangay_id", to_household_source_of_income.barangay_id)
                    .setString("purok", to_household_source_of_income.purok)
                    .setString("purok_id", to_household_source_of_income.purok_id)
                    .setNumber("status", to_household_source_of_income.status)
                    .setNumber("is_uploaded", to_household_source_of_income.is_uploaded)
                    .setString("house_no", to_household_source_of_income.house_no)
                    .setString("household_no", to_household_source_of_income.household_no)
                    .setString("date_of_income", to_household_source_of_income.date_of_income)
                    .setString("source_of_income", to_household_source_of_income.source_of_income)
                    .setNumber("amount", to_household_source_of_income.amount)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_source_of_income.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_source_of_income to_household_source_of_income) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_source_of_income  "
                    + " where id='" + to_household_source_of_income.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_source_of_income.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_source_of_income> ret_data(String where) {
        List<to_household_source_of_income> datas = new ArrayList();

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
                    + ",is_uploaded"
                    + ",house_no"
                    + ",household_no"
                    + ",date_of_income"
                    + ",source_of_income"
                    + ",amount"
                    + " from household_source_of_income"
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
                int is_uploaded = rs.getInt(17);
                String house_no = rs.getString(18);
                String household_no = rs.getString(19);
                String date_of_income = rs.getString(20);
                String source_of_income = rs.getString(21);
                double amount = rs.getDouble(22);

                to_household_source_of_income to = new to_household_source_of_income(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, household_no, date_of_income, source_of_income, amount);
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
