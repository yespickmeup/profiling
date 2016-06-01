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
public class User_previleges {

    public static class to_user_previleges {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String user_id;
        public final String user_name;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String account;
        public final String previlege;

        public to_user_previleges(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String user_id, String user_name, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String account, String previlege) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.user_id = user_id;
            this.user_name = user_name;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.account = account;
            this.previlege = previlege;
        }
    }

    public static void add_data(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into user_previleges("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",user_id"
                    + ",user_name"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",account"
                    + ",previlege"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:user_id"
                    + ",:user_name"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:account"
                    + ",:previlege"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_user_previleges.created_at)
                    .setString("updated_at", to_user_previleges.updated_at)
                    .setString("created_by", to_user_previleges.created_by)
                    .setString("updated_by", to_user_previleges.updated_by)
                    .setNumber("status", to_user_previleges.status)
                    .setString("user_id", to_user_previleges.user_id)
                    .setString("user_name", to_user_previleges.user_name)
                    .setString("region", to_user_previleges.region)
                    .setString("region_id", to_user_previleges.region_id)
                    .setString("province", to_user_previleges.province)
                    .setString("province_id", to_user_previleges.province_id)
                    .setString("city", to_user_previleges.city)
                    .setString("city_id", to_user_previleges.city_id)
                    .setString("barangay", to_user_previleges.barangay)
                    .setString("barangay_id", to_user_previleges.barangay_id)
                    .setString("account", to_user_previleges.account)
                    .setString("previlege", to_user_previleges.previlege)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_data(List<to_user_previleges> to_user_previleges1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_user_previleges to_user_previleges : to_user_previleges1) {

                String s0 = "insert into user_previleges("
                        + "created_at"
                        + ",updated_at"
                        + ",created_by"
                        + ",updated_by"
                        + ",status"
                        + ",user_id"
                        + ",user_name"
                        + ",region"
                        + ",region_id"
                        + ",province"
                        + ",province_id"
                        + ",city"
                        + ",city_id"
                        + ",barangay"
                        + ",barangay_id"
                        + ",account"
                        + ",previlege"
                        + ")values("
                        + ":created_at"
                        + ",:updated_at"
                        + ",:created_by"
                        + ",:updated_by"
                        + ",:status"
                        + ",:user_id"
                        + ",:user_name"
                        + ",:region"
                        + ",:region_id"
                        + ",:province"
                        + ",:province_id"
                        + ",:city"
                        + ",:city_id"
                        + ",:barangay"
                        + ",:barangay_id"
                        + ",:account"
                        + ",:previlege"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("created_at", to_user_previleges.created_at)
                        .setString("updated_at", to_user_previleges.updated_at)
                        .setString("created_by", to_user_previleges.created_by)
                        .setString("updated_by", to_user_previleges.updated_by)
                        .setNumber("status", to_user_previleges.status)
                        .setString("user_id", to_user_previleges.user_id)
                        .setString("user_name", to_user_previleges.user_name)
                        .setString("region", to_user_previleges.region)
                        .setString("region_id", to_user_previleges.region_id)
                        .setString("province", to_user_previleges.province)
                        .setString("province_id", to_user_previleges.province_id)
                        .setString("city", to_user_previleges.city)
                        .setString("city_id", to_user_previleges.city_id)
                        .setString("barangay", to_user_previleges.barangay)
                        .setString("barangay_id", to_user_previleges.barangay_id)
                        .setString("account", to_user_previleges.account)
                        .setString("previlege", to_user_previleges.previlege)
                        .ok();

                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();

            }
            Lg.s(User_previleges.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update user_previleges set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",user_id= :user_id "
                    + ",user_name= :user_name "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",account= :account "
                    + ",previlege= :previlege "
                    + " where id='" + to_user_previleges.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_user_previleges.created_at)
                    .setString("updated_at", to_user_previleges.updated_at)
                    .setString("created_by", to_user_previleges.created_by)
                    .setString("updated_by", to_user_previleges.updated_by)
                    .setNumber("status", to_user_previleges.status)
                    .setString("user_id", to_user_previleges.user_id)
                    .setString("user_name", to_user_previleges.user_name)
                    .setString("region", to_user_previleges.region)
                    .setString("region_id", to_user_previleges.region_id)
                    .setString("province", to_user_previleges.province)
                    .setString("province_id", to_user_previleges.province_id)
                    .setString("city", to_user_previleges.city)
                    .setString("city_id", to_user_previleges.city_id)
                    .setString("barangay", to_user_previleges.barangay)
                    .setString("barangay_id", to_user_previleges.barangay_id)
                    .setString("account", to_user_previleges.account)
                    .setString("previlege", to_user_previleges.previlege)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_user_previleges to_user_previleges) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from user_previleges  "
                    + " where id='" + to_user_previleges.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(User_previleges.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_user_previleges> ret_data(String where) {
        List<to_user_previleges> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",user_id"
                    + ",user_name"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",account"
                    + ",previlege"
                    + " from user_previleges"
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
                String user_id = rs.getString(7);
                String user_name = rs.getString(8);
                String region = rs.getString(9);
                String region_id = rs.getString(10);
                String province = rs.getString(11);
                String province_id = rs.getString(12);
                String city = rs.getString(13);
                String city_id = rs.getString(14);
                String barangay = rs.getString(15);
                String barangay_id = rs.getString(16);
                String account = rs.getString(17);
                String previlege = rs.getString(18);

                to_user_previleges to = new to_user_previleges(id, created_at, updated_at, created_by, updated_by, status, user_id, user_name, region, region_id, province, province_id, city, city_id, barangay, barangay_id, account, previlege);
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
