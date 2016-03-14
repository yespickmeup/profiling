/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.compartments;

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
public class Compartments {

    public static class to_compartments {

        public final int id;
        public final String compartment;
        public final boolean selected;
        public to_compartments(int id, String compartment,boolean selected) {
            this.id = id;
            this.compartment = compartment;
            this.selected=selected;
        }
    }

    public static void add_data(to_compartments to_compartments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into compartments("
                    + "compartment"
                    + ")values("
                    + ":compartment"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("compartment", to_compartments.compartment)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Compartments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_compartments to_compartments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update compartments set "
                    + "compartment= :compartment "
                    + " where id='" + to_compartments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("compartment", to_compartments.compartment)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Compartments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_compartments to_compartments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from compartments  "
                    + " where id='" + to_compartments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Compartments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_compartments> ret_data(String where) {
        List<to_compartments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",compartment"
                    + " from compartments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String compartment = rs.getString(2);

                to_compartments to = new to_compartments(id, compartment,false);
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
