/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_list;

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
public class Household_list {

    public static class to_household_list {

        public final int id;
        public final String house_no;
        public final String household_no;
        public final int no_of_members;
        public final String date_modified;

        public to_household_list(int id, String house_no, String household_no, int no_of_members, String date_modified) {
            this.id = id;
            this.house_no = house_no;
            this.household_no = household_no;
            this.no_of_members = no_of_members;
            this.date_modified = date_modified;
        }
    }

    public static void add_data(to_household_list to_household_list) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_list("
                    + "house_no"
                    + ",household_no"
                    + ",no_of_members"
                    + ",date_modified"
                    + ")values("
                    + ":house_no"
                    + ",:household_no"
                    + ",:no_of_members"
                    + ",:date_modified"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_list.house_no)
                    .setString("household_no", to_household_list.household_no)
                    .setNumber("no_of_members", to_household_list.no_of_members)
                    .setString("date_modified", to_household_list.date_modified)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_list.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_list to_household_list) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_list set "
                    + "house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",no_of_members= :no_of_members "
                    + ",date_modified= :date_modified "
                    + " where id='" + to_household_list.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("house_no", to_household_list.house_no)
                    .setString("household_no", to_household_list.household_no)
                    .setNumber("no_of_members", to_household_list.no_of_members)
                    .setString("date_modified", to_household_list.date_modified)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_list.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_list to_household_list) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_list  "
                    + " where id='" + to_household_list.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_list.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_list> ret_data(String where) {
        List<to_household_list> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",house_no"
                    + ",household_no"
                    + ",no_of_members"
                    + ",date_modified"
                    + " from household_list"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String house_no = rs.getString(2);
                String household_no = rs.getString(3);
                int no_of_members = rs.getInt(4);
                String date_modified = rs.getString(5);

                to_household_list to = new to_household_list(id, house_no, household_no, no_of_members, date_modified);
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
