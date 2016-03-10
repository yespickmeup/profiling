/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.blood_types;

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
 * @author Arcinue
 */
public class Blood_types {

    public static class to_blood_types {

        public final int id;
        public final String blood_type;

        public to_blood_types(int id, String blood_type) {
            this.id = id;
            this.blood_type = blood_type;
        }
    }

    public static void add_data(to_blood_types to_blood_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into blood_types("
                    + "blood_type"
                    + ")values("
                    + ":blood_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("blood_type", to_blood_types.blood_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Blood_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_blood_types to_blood_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update blood_types set "
                    + "blood_type= :blood_type "
                    + " where id='" + to_blood_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("blood_type", to_blood_types.blood_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Blood_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_blood_types to_blood_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from blood_types  "
                    + " where id='" + to_blood_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Blood_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_blood_types> ret_data(String where) {
        List<to_blood_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",blood_type"
                    + " from blood_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String blood_type = rs.getString(2);

                to_blood_types to = new to_blood_types(id, blood_type);
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
