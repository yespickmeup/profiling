/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.bathroom_types;

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
public class Bathroom_types {

    public static class to_bathroom_types {

        public final int id;
        public final String bathroom_type;

        public to_bathroom_types(int id, String bathroom_type) {
            this.id = id;
            this.bathroom_type = bathroom_type;
        }
    }

    public static void add_data(to_bathroom_types to_bathroom_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into bathroom_types("
                    + "bathroom_type"
                    + ")values("
                    + ":bathroom_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("bathroom_type", to_bathroom_types.bathroom_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Bathroom_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_bathroom_types to_bathroom_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update bathroom_types set "
                    + "bathroom_type= :bathroom_type "
                    + " where id='" + to_bathroom_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("bathroom_type", to_bathroom_types.bathroom_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Bathroom_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_bathroom_types to_bathroom_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from bathroom_types  "
                    + " where id='" + to_bathroom_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Bathroom_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_bathroom_types> ret_data(String where) {
        List<to_bathroom_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",bathroom_type"
                    + " from bathroom_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String bathroom_type = rs.getString(2);

                to_bathroom_types to = new to_bathroom_types(id, bathroom_type);
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
