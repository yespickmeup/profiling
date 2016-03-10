/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.marital_statuses;

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
public class Marital_statuses {

    public static class to_marital_statuses {

        public final int id;
        public final String marital_status;

        public to_marital_statuses(int id, String marital_status) {
            this.id = id;
            this.marital_status = marital_status;
        }
    }

    public static void add_data(to_marital_statuses to_marital_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into marital_statuses("
                    + "marital_status"
                    + ")values("
                    + ":marital_status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("marital_status", to_marital_statuses.marital_status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marital_statuses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_marital_statuses to_marital_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update marital_statuses set "
                    + "marital_status= :marital_status "
                    + " where id='" + to_marital_statuses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("marital_status", to_marital_statuses.marital_status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marital_statuses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_marital_statuses to_marital_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from marital_statuses  "
                    + " where id='" + to_marital_statuses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Marital_statuses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_marital_statuses> ret_data(String where) {
        List<to_marital_statuses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",marital_status"
                    + " from marital_statuses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String marital_status = rs.getString(2);

                to_marital_statuses to = new to_marital_statuses(id, marital_status);
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
