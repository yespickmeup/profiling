/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.kitchen_types;

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
public class Kitchen_types {

    public static class to_kitchen_types {

        public final int id;
        public final String kitchen_type;

        public to_kitchen_types(int id, String kitchen_type) {
            this.id = id;
            this.kitchen_type = kitchen_type;
        }
    }

    public static void add_data(to_kitchen_types to_kitchen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into kitchen_types("
                    + "kitchen_type"
                    + ")values("
                    + ":kitchen_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("kitchen_type", to_kitchen_types.kitchen_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_kitchen_types to_kitchen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update kitchen_types set "
                    + "kitchen_type= :kitchen_type "
                    + " where id='" + to_kitchen_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("kitchen_type", to_kitchen_types.kitchen_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_kitchen_types to_kitchen_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from kitchen_types  "
                    + " where id='" + to_kitchen_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Kitchen_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_kitchen_types> ret_data(String where) {
        List<to_kitchen_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",kitchen_type"
                    + " from kitchen_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String kitchen_type = rs.getString(2);

                to_kitchen_types to = new to_kitchen_types(id, kitchen_type);
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
