/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.disabilities;

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
public class Disabilities {

    public static class to_disabilities {

        public final int id;
        public final String disability;

        public to_disabilities(int id, String disability) {
            this.id = id;
            this.disability = disability;
        }
    }

    public static void add_data(to_disabilities to_disabilities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into disabilities("
                    + "disability"
                    + ")values("
                    + ":disability"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("disability", to_disabilities.disability)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disabilities.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_disabilities to_disabilities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update disabilities set "
                    + "disability= :disability "
                    + " where id='" + to_disabilities.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("disability", to_disabilities.disability)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disabilities.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_disabilities to_disabilities) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from disabilities  "
                    + " where id='" + to_disabilities.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Disabilities.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_disabilities> ret_data(String where) {
        List<to_disabilities> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",disability"
                    + " from disabilities"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String disability = rs.getString(2);

                to_disabilities to = new to_disabilities(id, disability);
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
