/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.streets;

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
public class Streets {

    public static class to_streets {

        public final int id;
        public final int province_id;
        public final String province;
        public final int city_id;
        public final String city;
        public final int barangay_id;
        public final String barangay;
        public final int purok_id;
        public final String purok;
        public final String street;

        public to_streets(int id, int province_id, String province, int city_id, String city, int barangay_id, String barangay, int purok_id, String purok, String street) {
            this.id = id;
            this.province_id = province_id;
            this.province = province;
            this.city_id = city_id;
            this.city = city;
            this.barangay_id = barangay_id;
            this.barangay = barangay;
            this.purok_id = purok_id;
            this.purok = purok;
            this.street = street;
        }
    }

    public static void add_data(to_streets to_streets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into streets("
                    + "province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay_id"
                    + ",barangay"
                    + ",purok_id"
                    + ",purok"
                    + ",street"
                    + ")values("
                    + ":province_id"
                    + ",:province"
                    + ",:city_id"
                    + ",:city"
                    + ",:barangay_id"
                    + ",:barangay"
                    + ",:purok_id"
                    + ",:purok"
                    + ",:street"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("province_id", to_streets.province_id)
                    .setString("province", to_streets.province)
                    .setNumber("city_id", to_streets.city_id)
                    .setString("city", to_streets.city)
                    .setNumber("barangay_id", to_streets.barangay_id)
                    .setString("barangay", to_streets.barangay)
                    .setNumber("purok_id", to_streets.purok_id)
                    .setString("purok", to_streets.purok)
                    .setString("street", to_streets.street)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Streets.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_streets to_streets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update streets set "
                    + "province_id= :province_id "
                    + ",province= :province "
                    + ",city_id= :city_id "
                    + ",city= :city "
                    + ",barangay_id= :barangay_id "
                    + ",barangay= :barangay "
                    + ",purok_id= :purok_id "
                    + ",purok= :purok "
                    + ",street= :street "
                    + " where id='" + to_streets.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("province_id", to_streets.province_id)
                    .setString("province", to_streets.province)
                    .setNumber("city_id", to_streets.city_id)
                    .setString("city", to_streets.city)
                    .setNumber("barangay_id", to_streets.barangay_id)
                    .setString("barangay", to_streets.barangay)
                    .setNumber("purok_id", to_streets.purok_id)
                    .setString("purok", to_streets.purok)
                    .setString("street", to_streets.street)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Streets.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_streets to_streets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from streets  "
                    + " where id='" + to_streets.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Streets.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_streets> ret_data(String where) {
        List<to_streets> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay_id"
                    + ",barangay"
                    + ",purok_id"
                    + ",purok"
                    + ",street"
                    + " from streets"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int province_id = rs.getInt(2);
                String province = rs.getString(3);
                int city_id = rs.getInt(4);
                String city = rs.getString(5);
                int barangay_id = rs.getInt(6);
                String barangay = rs.getString(7);
                int purok_id = rs.getInt(8);
                String purok = rs.getString(9);
                String street = rs.getString(10);

                to_streets to = new to_streets(id, province_id, province, city_id, city, barangay_id, barangay, purok_id, purok, street);
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
