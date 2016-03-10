/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.disposal_methods;

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
public class Disposal_methods {

    public static class to_disposal_methods {

        public final int id;
        public final String disposal_method;

        public to_disposal_methods(int id, String disposal_method) {
            this.id = id;
            this.disposal_method = disposal_method;
        }
    }

    public static void add_data(to_disposal_methods to_disposal_methods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into disposal_methods("
                    + "disposal_method"
                    + ")values("
                    + ":disposal_method"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("disposal_method", to_disposal_methods.disposal_method)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disposal_methods.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_disposal_methods to_disposal_methods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update disposal_methods set "
                    + "disposal_method= :disposal_method "
                    + " where id='" + to_disposal_methods.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("disposal_method", to_disposal_methods.disposal_method)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disposal_methods.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_disposal_methods to_disposal_methods) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from disposal_methods  "
                    + " where id='" + to_disposal_methods.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disposal_methods.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_disposal_methods> ret_data(String where) {
        List<to_disposal_methods> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",disposal_method"
                    + " from disposal_methods"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String disposal_method = rs.getString(2);

                to_disposal_methods to = new to_disposal_methods(id, disposal_method);
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
