/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.cooking_lighting_types;

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
public class Cooking_lighting_types {

    public static class to_cooking_lighting_types {

        public final int id;
        public final String cooking_lighting_type;

        public to_cooking_lighting_types(int id, String cooking_lighting_type) {
            this.id = id;
            this.cooking_lighting_type = cooking_lighting_type;
        }
    }

    public static void add_data(to_cooking_lighting_types to_cooking_lighting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into cooking_lighting_types("
                    + "cooking_lighting_type"
                    + ")values("
                    + ":cooking_lighting_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("cooking_lighting_type", to_cooking_lighting_types.cooking_lighting_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cooking_lighting_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_cooking_lighting_types to_cooking_lighting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update cooking_lighting_types set "
                    + "cooking_lighting_type= :cooking_lighting_type "
                    + " where id='" + to_cooking_lighting_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("cooking_lighting_type", to_cooking_lighting_types.cooking_lighting_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cooking_lighting_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_cooking_lighting_types to_cooking_lighting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from cooking_lighting_types  "
                    + " where id='" + to_cooking_lighting_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Cooking_lighting_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();

        }
    }

    public static List<to_cooking_lighting_types> ret_data(String where) {
        List<to_cooking_lighting_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",cooking_lighting_type"
                    + " from cooking_lighting_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String cooking_lighting_type = rs.getString(2);

                to_cooking_lighting_types to = new to_cooking_lighting_types(id, cooking_lighting_type);
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
