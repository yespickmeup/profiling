/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.clearances;

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
public class Clearance_types {

    public static class to_collection_types {

        public final int id;
        public final String clearance_type;
        public final int is_fixed;
        public final double amount_due;

        public to_collection_types(int id, String clearance_type, int is_fixed, double amount_due) {
            this.id = id;
            this.clearance_type = clearance_type;
            this.is_fixed = is_fixed;
            this.amount_due = amount_due;
        }
    }

    public static void add_data(to_collection_types to_collection_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into clearance_types("
                    + "clearance_type"
                    + ",is_fixed"
                    + ",amount_due"
                    + ")values("
                    + ":clearance_type"
                    + ",:is_fixed"
                    + ",:amount_due"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clearance_type", to_collection_types.clearance_type)
                    .setNumber("is_fixed", to_collection_types.is_fixed)
                    .setNumber("amount_due", to_collection_types.amount_due)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clearance_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_collection_types to_collection_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update clearance_types set "
                    + "clearance_type= :clearance_type "
                    + ",is_fixed= :is_fixed "
                    + ",amount_due= :amount_due "
                    + " where id='" + to_collection_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("clearance_type", to_collection_types.clearance_type)
                    .setNumber("is_fixed", to_collection_types.is_fixed)
                    .setNumber("amount_due", to_collection_types.amount_due)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clearance_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_collection_types to_collection_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from clearance_types  "
                    + " where id='" + to_collection_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Clearance_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_collection_types> ret_data(String where) {
        List<to_collection_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",clearance_type"
                    + ",is_fixed"
                    + ",amount_due"
                    + " from clearance_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String collection_type = rs.getString(2);
                int is_fixed = rs.getInt(3);
                double amount_due = rs.getDouble(4);

                to_collection_types to = new to_collection_types(id, collection_type, is_fixed, amount_due);
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
