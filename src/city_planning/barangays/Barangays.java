/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangays;

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
public class Barangays {

    public static class to_barangays {

        public final int id;
        public final String barangay;
        public final int city_id;
        public final String city;
        public final int province_id;
        public final String province;
        public final int region_id;
        public final String region;
        public final int is_default;

        public to_barangays(int id, String barangay, int city_id, String city, int province_id, String province, int region_id, String region, int is_default) {
            this.id = id;
            this.barangay = barangay;
            this.city_id = city_id;
            this.city = city;
            this.province_id = province_id;
            this.province = province;
            this.region_id = region_id;
            this.region = region;
            this.is_default = is_default;
        }
    }

    public static void add_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangays("
                    + "barangay"
                    + ",city_id"
                    + ",city"
                    + ",province_id"
                    + ",province"
                    + ",region_id"
                    + ",region"
                    + ",is_default"
                    + ")values("
                    + ":barangay"
                    + ",:city_id"
                    + ",:city"
                    + ",:province_id"
                    + ",:province"
                    + ",:region_id"
                    + ",:region"
                    + ",:is_default"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("barangay", to_barangays.barangay)
                    .setNumber("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setNumber("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setNumber("region_id", to_barangays.region_id)
                    .setString("region", to_barangays.region)
                    .setNumber("is_default", to_barangays.is_default)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangays set "
                    + "barangay= :barangay "
                    + ",city_id= :city_id "
                    + ",city= :city "
                    + ",province_id= :province_id "
                    + ",province= :province "
                    + ",region_id= :region_id "
                    + ",region= :region "
                    + ",is_default= :is_default "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("barangay", to_barangays.barangay)
                    .setNumber("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setNumber("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setNumber("region_id", to_barangays.region_id)
                    .setString("region", to_barangays.region)
                    .setNumber("is_default", to_barangays.is_default)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangays  "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Barangays.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_barangays> ret_data(String where) {
        List<to_barangays> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",barangay"
                    + ",city_id"
                    + ",city"
                    + ",province_id"
                    + ",province"
                    + ",region_id"
                    + ",region"
                    + ",is_default"
                    + " from barangays"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String barangay = rs.getString(2);
                int city_id = rs.getInt(3);
                String city = rs.getString(4);
                int province_id = rs.getInt(5);
                String province = rs.getString(6);
                int region_id = rs.getInt(7);
                String region = rs.getString(8);
                int is_default = rs.getInt(9);

                to_barangays to = new to_barangays(id, barangay, city_id, city, province_id, province, region_id, region, is_default);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void set_default_location(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();

            String s0 = "update barangays set "
                    + " is_default= :is_default "
                    + " where is_default=1 ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("is_default", 0)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();

            String s2 = "update barangays set "
                    + " is_default= :is_default "
                    + " where id='" + to_barangays.id + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setNumber("is_default", 1)
                    .ok();

            PreparedStatement stmt2 = conn.prepareStatement(s2);
            stmt2.execute();
            Lg.s(Barangays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
