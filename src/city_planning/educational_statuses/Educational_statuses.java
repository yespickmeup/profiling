/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.educational_statuses;

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
public class Educational_statuses {

    public static class to_educational_statuses {

        public final int id;
        public final String educational_status;

        public to_educational_statuses(int id, String educational_status) {
            this.id = id;
            this.educational_status = educational_status;
        }
    }

    public static void add_data(to_educational_statuses to_educational_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into educational_statuses("
                    + "educational_status"
                    + ")values("
                    + ":educational_status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("educational_status", to_educational_statuses.educational_status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Educational_statuses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_educational_statuses to_educational_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update educational_statuses set "
                    + "educational_status= :educational_status "
                    + " where id='" + to_educational_statuses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("educational_status", to_educational_statuses.educational_status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Educational_statuses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_educational_statuses to_educational_statuses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from educational_statuses  "
                    + " where id='" + to_educational_statuses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Educational_statuses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_educational_statuses> ret_data(String where) {
        List<to_educational_statuses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",educational_status"
                    + " from educational_statuses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String educational_status = rs.getString(2);

                to_educational_statuses to = new to_educational_statuses(id, educational_status);
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
