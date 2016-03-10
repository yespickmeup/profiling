/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.professions;

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
public class Professions {

    public static class to_professions {

        public final int id;
        public final String profession;

        public to_professions(int id, String profession) {
            this.id = id;
            this.profession = profession;
        }
    }

    public static void add_data(to_professions to_professions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into professions("
                    + "profession"
                    + ")values("
                    + ":profession"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("profession", to_professions.profession)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Professions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_professions to_professions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update professions set "
                    + "profession= :profession "
                    + " where id='" + to_professions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("profession", to_professions.profession)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Professions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_professions to_professions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from professions  "
                    + " where id='" + to_professions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Professions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_professions> ret_data(String where) {
        List<to_professions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",profession"
                    + " from professions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String profession = rs.getString(2);

                to_professions to = new to_professions(id, profession);
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
