/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.toilet_types;
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
public class Toilet_types {

    public static class to_toilet_types {

        public final int id;
        public final String toilet_type;

        public to_toilet_types(int id, String toilet_type) {
            this.id = id;
            this.toilet_type = toilet_type;
        }
    }

    public static void add_data(to_toilet_types to_toilet_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into toilet_types("
                    + "toilet_type"
                    + ")values("
                    + ":toilet_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("toilet_type", to_toilet_types.toilet_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Toilet_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_toilet_types to_toilet_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update toilet_types set "
                    + "toilet_type= :toilet_type "
                    + " where id='" + to_toilet_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("toilet_type", to_toilet_types.toilet_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Toilet_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_toilet_types to_toilet_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from toilet_types  "
                    + " where id='" + to_toilet_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Toilet_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_toilet_types> ret_data(String where) {
        List<to_toilet_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",toilet_type"
                    + " from toilet_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String toilet_type = rs.getString(2);

                to_toilet_types to = new to_toilet_types(id, toilet_type);
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
