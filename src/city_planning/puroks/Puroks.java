/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.puroks;

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
public class Puroks {

    public static class to_puroks {

        public final int id;
        public final int province_id;
        public final String province;
        public final int city_id;
        public final String city;
        public final String barangay_id;
        public final String barangay;
        public final String purok;
        public final String street;

        public to_puroks(int id, int province_id, String province, int city_id, String city, String barangay_id, String barangay, String purok, String street) {
            this.id = id;
            this.province_id = province_id;
            this.province = province;
            this.city_id = city_id;
            this.city = city;
            this.barangay_id = barangay_id;
            this.barangay = barangay;
            this.purok = purok;
            this.street = street;
        }
    }

    public static void add_data(to_puroks to_puroks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into puroks("
                    + "province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay_id"
                    + ",barangay"
                    + ",purok"
                    + ",street"
                    + ")values("
                    + ":province_id"
                    + ",:province"
                    + ",:city_id"
                    + ",:city"
                    + ",:barangay_id"
                    + ",:barangay"
                    + ",:purok"
                    + ",:street"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("province_id", to_puroks.province_id)
                    .setString("province", to_puroks.province)
                    .setNumber("city_id", to_puroks.city_id)
                    .setString("city", to_puroks.city)
                    .setString("barangay_id", to_puroks.barangay_id)
                    .setString("barangay", to_puroks.barangay)
                    .setString("purok", to_puroks.purok)
                    .setString("street", to_puroks.street)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Puroks.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_puroks to_puroks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update puroks set "
                    + "province_id= :province_id "
                    + ",province= :province "
                    + ",city_id= :city_id "
                    + ",city= :city "
                    + ",barangay_id= :barangay_id "
                    + ",barangay= :barangay "
                    + ",purok= :purok "
                    + ",street= :street "
                    + " where id='" + to_puroks.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("province_id", to_puroks.province_id)
                    .setString("province", to_puroks.province)
                    .setNumber("city_id", to_puroks.city_id)
                    .setString("city", to_puroks.city)
                    .setString("barangay_id", to_puroks.barangay_id)
                    .setString("barangay", to_puroks.barangay)
                    .setString("purok", to_puroks.purok)
                    .setString("street", to_puroks.street)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Puroks.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_puroks to_puroks) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from puroks  "
                    + " where id='" + to_puroks.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Puroks.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_puroks> ret_data(String where) {
        List<to_puroks> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",purok"
                    + ",barangay_id"
                    + ",barangay"
                    + ",city_id"
                    + ",city"
                    + ",province_id"
                    + ",province"
                    + ",region_id"
                    + ",region"
                    + ",street"
                    + " from puroks"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String purok = rs.getString(2);
                int barangay_id = rs.getInt(3);
                String barangay = rs.getString(4);
                int city_id = rs.getInt(5);
                String city = rs.getString(6);
                int province_id = rs.getInt(7);
                String province = rs.getString(8);
                int region_id = rs.getInt(9);
                String region = rs.getString(10);
                String street = rs.getString(11);

                to_puroks to = new to_puroks(id, province_id, province, city_id, city, barangay, barangay, purok, street);
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
