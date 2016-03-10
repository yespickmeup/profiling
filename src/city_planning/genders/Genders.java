/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.genders;

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
public class Genders {

    public static class to_genders {

        public final int id;
        public final String gender;

        public to_genders(int id, String gender) {
            this.id = id;
            this.gender = gender;
        }
    }

    public static void add_data(to_genders to_genders) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into genders("
                    + "gender"
                    + ")values("
                    + ":gender"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("gender", to_genders.gender)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Genders.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_genders to_genders) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update genders set "
                    + "gender= :gender "
                    + " where id='" + to_genders.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("gender", to_genders.gender)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Genders.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_genders to_genders) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from genders  "
                    + " where id='" + to_genders.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Genders.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_genders> ret_data(String where) {
        List<to_genders> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",gender"
                    + " from genders"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String gender = rs.getString(2);

                to_genders to = new to_genders(id, gender);
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
