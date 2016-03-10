/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.citizenships;

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
public class Citizenships {

    public static class to_citizenships {

        public final int id;
        public final String citizenship;

        public to_citizenships(int id, String citizenship) {
            this.id = id;
            this.citizenship = citizenship;
        }
    }

    public static void add_data(to_citizenships to_citizenships) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into citizenships("
                    + "citizenship"
                    + ")values("
                    + ":citizenship"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("citizenship", to_citizenships.citizenship)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Citizenships.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_citizenships to_citizenships) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update citizenships set "
                    + "citizenship= :citizenship "
                    + " where id='" + to_citizenships.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("citizenship", to_citizenships.citizenship)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Citizenships.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_citizenships to_citizenships) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from citizenships  "
                    + " where id='" + to_citizenships.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Citizenships.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_citizenships> ret_data(String where) {
        List<to_citizenships> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",citizenship"
                    + " from citizenships"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String citizenship = rs.getString(2);

                to_citizenships to = new to_citizenships(id, citizenship);
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
