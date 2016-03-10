/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

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
 * @author Dennison
 */
public class S1_barangays {

    public static class to_barangays {

        public final int id;
        public final String province_id;
        public final String province;
        public final String city_id;
        public final String city;
        public final String barangay;

        public to_barangays(int id, String province_id, String province, String city_id, String city, String barangay) {
            this.id = id;
            this.province_id = province_id;
            this.province = province;
            this.city_id = city_id;
            this.city = city;
            this.barangay = barangay;
        }
    }

    public static void add_barangays(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into barangays("
                    + "province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay"
                    + ")values("
                    + ":province_id"
                    + ",:province"
                    + ",:city_id"
                    + ",:city"
                    + ",:barangay"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_barangays.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_barangays(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update barangays set "
                    + "province_id= :province_id"
                    + ",province= :province"
                    + ",city_id= :city_id"
                    + ",city= :city"
                    + ",barangay= :barangay"
                    + " where "
                    + " id ='" + to_barangays.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("province_id", to_barangays.province_id)
                    .setString("province", to_barangays.province)
                    .setString("city_id", to_barangays.city_id)
                    .setString("city", to_barangays.city)
                    .setString("barangay", to_barangays.barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_barangays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_barangays(to_barangays to_barangays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from barangays where "
                    + " id ='" + to_barangays.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_barangays.class, "Successfully Deleted");
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
                    + ",province_id"
                    + ",province"
                    + ",city_id"
                    + ",city"
                    + ",barangay"
                    + " from barangays  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String province_id = rs.getString(2);
                String province = rs.getString(3);
                String city_id = rs.getString(4);
                String city = rs.getString(5);
                String barangay = rs.getString(6);

                to_barangays to = new to_barangays(id, province_id, province, city_id, city, barangay);
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
