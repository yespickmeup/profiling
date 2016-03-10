/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.building_types;

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
public class Building_types {

    public static class to_building_types {

        public final int id;
        public final String building_type;

        public to_building_types(int id, String building_type) {
            this.id = id;
            this.building_type = building_type;
        }
    }

    public static void add_data(to_building_types to_building_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into building_types("
                    + "building_type"
                    + ")values("
                    + ":building_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("building_type", to_building_types.building_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Building_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_building_types to_building_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update building_types set "
                    + "building_type= :building_type "
                    + " where id='" + to_building_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("building_type", to_building_types.building_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Building_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_building_types to_building_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from building_types  "
                    + " where id='" + to_building_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Building_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_building_types> ret_data(String where) {
        List<to_building_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",building_type"
                    + " from building_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String building_type = rs.getString(2);

                to_building_types to = new to_building_types(id, building_type);
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
