/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_concerns;

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
 * @author PeterGil
 */
public class Household_concerns {

    public static class to_household_member_concerns {

        public final int id;
        public final String concerns;

        public to_household_member_concerns(int id, String concerns) {
            this.id = id;
            this.concerns = concerns;
        }
    }

    public static void add_data(to_household_member_concerns to_household_member_concerns) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_concerns("
                    + "concerns"
                    + ")values("
                    + ":concerns"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("concerns", to_household_member_concerns.concerns)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_concerns.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_concerns to_household_member_concerns) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_concerns set "
                    + "concerns= :concerns "
                    + " where id='" + to_household_member_concerns.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("concerns", to_household_member_concerns.concerns)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_concerns.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_concerns to_household_member_concerns) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_concerns  "
                    + " where id='" + to_household_member_concerns.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_concerns.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    //<editor-fold defaultstate="collapsed" desc=" Household Members ">
    public static List<to_household_member_concerns> ret_data(String where) {
        List<to_household_member_concerns> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",concerns"
                    + " from household_member_concerns"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String concerns = rs.getString(2);

                to_household_member_concerns to = new to_household_member_concerns(id, concerns);
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
