/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_positions;

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
public class Household_positions {

    public static class to_household_positions {

        public final int id;
        public final String household_position;

        public to_household_positions(int id, String household_position) {
            this.id = id;
            this.household_position = household_position;
        }
    }

    public static void add_data(to_household_positions to_household_positions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_positions("
                    + "household_position"
                    + ")values("
                    + ":household_position"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("household_position", to_household_positions.household_position)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_positions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_positions to_household_positions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_positions set "
                    + "household_position= :household_position "
                    + " where id='" + to_household_positions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("household_position", to_household_positions.household_position)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_positions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_positions to_household_positions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_positions  "
                    + " where id='" + to_household_positions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_positions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_positions> ret_data(String where) {
        List<to_household_positions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_position"
                    + " from household_positions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String household_position = rs.getString(2);

                to_household_positions to = new to_household_positions(id, household_position);
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
