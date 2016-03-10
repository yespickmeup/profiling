/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.basic_needs;

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
 * @author raycha
 */
public class Basic_needs {

    public static class to_basic_needs {

        public final int id;
        public final String basic_needs;

        public to_basic_needs(int id, String basic_needs) {
            this.id = id;
            this.basic_needs = basic_needs;
        }
    }

    public static void add_data(to_basic_needs to_basic_needs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into basic_needs("
                    + "basic_needs"
                    + ")values("
                    + ":basic_needs"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("basic_needs", to_basic_needs.basic_needs)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Basic_needs.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_basic_needs to_basic_needs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update basic_needs set "
                    + "basic_needs= :basic_needs "
                    + " where id='" + to_basic_needs.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("basic_needs", to_basic_needs.basic_needs)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Basic_needs.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_basic_needs to_basic_needs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from basic_needs  "
                    + " where id='" + to_basic_needs.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Basic_needs.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_basic_needs> ret_data(String where) {
        List<to_basic_needs> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",basic_needs"
                    + " from basic_needs"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String basic_needs = rs.getString(2);

                to_basic_needs to = new to_basic_needs(id, basic_needs);
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
