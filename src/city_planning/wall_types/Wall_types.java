/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.wall_types;

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
public class Wall_types {

    public static class to_wall_types {

        public final int id;
        public final String wall_type;
        public final boolean selected;
        public to_wall_types(int id, String wall_type,boolean selected) {
            this.id = id;
            this.wall_type = wall_type;
            this.selected=selected;
        }
    }

    public static void add_data(to_wall_types to_wall_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into wall_types("
                    + "wall_type"
                    + ")values("
                    + ":wall_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("wall_type", to_wall_types.wall_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Wall_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_wall_types to_wall_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update wall_types set "
                    + "wall_type= :wall_type "
                    + " where id='" + to_wall_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("wall_type", to_wall_types.wall_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Wall_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_wall_types to_wall_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from wall_types  "
                    + " where id='" + to_wall_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Wall_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_wall_types> ret_data(String where) {
        List<to_wall_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",wall_type"
                    + " from wall_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String wall_type = rs.getString(2);

                to_wall_types to = new to_wall_types(id, wall_type,false);
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
