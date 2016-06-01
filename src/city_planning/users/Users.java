/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.users;

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
public class Users {

    public static class to_users {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final String screen_name;
        public final String user_name;
        public final String password;
        public final int status;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;

        public to_users(int id, String created_at, String updated_at, String created_by, String updated_by, String screen_name, String user_name, String password, int status, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.screen_name = screen_name;
            this.user_name = user_name;
            this.password = password;
            this.status = status;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
        }
    }

    public static void add_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into users("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",screen_name"
                    + ",user_name"
                    + ",password"
                    + ",status"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:screen_name"
                    + ",:user_name"
                    + ",:password"
                    + ",:status"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_users.created_at)
                    .setString("updated_at", to_users.updated_at)
                    .setString("created_by", to_users.created_by)
                    .setString("updated_by", to_users.updated_by)
                    .setString("screen_name", to_users.screen_name)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setNumber("status", to_users.status)
                    .setString("region", to_users.region)
                    .setString("region_id", to_users.region_id)
                    .setString("province", to_users.province)
                    .setString("province_id", to_users.province_id)
                    .setString("city", to_users.city)
                    .setString("city_id", to_users.city_id)
                    .setString("barangay", to_users.barangay)
                    .setString("barangay_id", to_users.barangay_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update users set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",screen_name= :screen_name "
                    + ",user_name= :user_name "
                    + ",password= :password "
                    + ",status= :status "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + " where id='" + to_users.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_users.created_at)
                    .setString("updated_at", to_users.updated_at)
                    .setString("created_by", to_users.created_by)
                    .setString("updated_by", to_users.updated_by)
                    .setString("screen_name", to_users.screen_name)
                    .setString("user_name", to_users.user_name)
                    .setString("password", to_users.password)
                    .setNumber("status", to_users.status)
                    .setString("region", to_users.region)
                    .setString("region_id", to_users.region_id)
                    .setString("province", to_users.province)
                    .setString("province_id", to_users.province_id)
                    .setString("city", to_users.city)
                    .setString("city_id", to_users.city_id)
                    .setString("barangay", to_users.barangay)
                    .setString("barangay_id", to_users.barangay_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_users to_users) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from users  "
                    + " where id='" + to_users.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Users.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_users> ret_data(String where) {
        List<to_users> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",screen_name"
                    + ",user_name"
                    + ",password"
                    + ",status"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + " from users"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                String screen_name = rs.getString(6);
                String user_name = rs.getString(7);
                String password = rs.getString(8);
                int status = rs.getInt(9);
                String region = rs.getString(10);
                String region_id = rs.getString(11);
                String province = rs.getString(12);
                String province_id = rs.getString(13);
                String city = rs.getString(14);
                String city_id = rs.getString(15);
                String barangay = rs.getString(16);
                String barangay_id = rs.getString(17);

                to_users to = new to_users(id, created_at, updated_at, created_by, updated_by, screen_name, user_name, password, status, region, region_id, province, province_id, city, city_id, barangay, barangay_id);
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
