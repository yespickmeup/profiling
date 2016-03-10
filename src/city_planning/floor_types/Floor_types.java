/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.floor_types;

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
public class Floor_types {

    public static class to_floor_types {

        public final int id;
        public final String floor_type;

        public to_floor_types(int id, String floor_type) {
            this.id = id;
            this.floor_type = floor_type;
        }
    }

    public static void add_data(to_floor_types to_floor_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into floor_types("
                    + "floor_type"
                    + ")values("
                    + ":floor_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("floor_type", to_floor_types.floor_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Floor_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_floor_types to_floor_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update floor_types set "
                    + "floor_type= :floor_type "
                    + " where id='" + to_floor_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("floor_type", to_floor_types.floor_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Floor_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_floor_types to_floor_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from floor_types  "
                    + " where id='" + to_floor_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Floor_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_floor_types> ret_data(String where) {
        List<to_floor_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",floor_type"
                    + " from floor_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String floor_type = rs.getString(2);

                to_floor_types to = new to_floor_types(id, floor_type);
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
