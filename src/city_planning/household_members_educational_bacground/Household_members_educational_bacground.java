/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_members_educational_bacground;

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
public class Household_members_educational_bacground {

    public static class to_household_members_educational_bacground {

        public final int id;
        public final int household_members_id;
        public final String educational_status;
        public final String name_of_school;
        public final String highest_grade_computed;
        public final String year;
        public final String achievements;

        public to_household_members_educational_bacground(int id, int household_members_id, String educational_status, String name_of_school, String highest_grade_computed, String year, String achievements) {
            this.id = id;
            this.household_members_id = household_members_id;
            this.educational_status = educational_status;
            this.name_of_school = name_of_school;
            this.highest_grade_computed = highest_grade_computed;
            this.year = year;
            this.achievements = achievements;
        }
    }

    public static void add_data(to_household_members_educational_bacground to_household_members_educational_bacground) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_members_educational_bacground("
                    + "household_members_id"
                    + ",educational_status"
                    + ",name_of_school"
                    + ",highest_grade_computed"
                    + ",year"
                    + ",achievements"
                    + ")values("
                    + ":household_members_id"
                    + ",:educational_status"
                    + ",:name_of_school"
                    + ",:highest_grade_computed"
                    + ",:year"
                    + ",:achievements"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_members_id", to_household_members_educational_bacground.household_members_id)
                    .setString("educational_status", to_household_members_educational_bacground.educational_status)
                    .setString("name_of_school", to_household_members_educational_bacground.name_of_school)
                    .setString("highest_grade_computed", to_household_members_educational_bacground.highest_grade_computed)
                    .setString("year", to_household_members_educational_bacground.year)
                    .setString("achievements", to_household_members_educational_bacground.achievements)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members_educational_bacground.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_members_educational_bacground to_household_members_educational_bacground) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_members_educational_bacground set "
                    + "household_members_id= :household_members_id "
                    + ",educational_status= :educational_status "
                    + ",name_of_school= :name_of_school "
                    + ",highest_grade_computed= :highest_grade_computed "
                    + ",year= :year "
                    + ",achievements= :achievements "
                    + " where id='" + to_household_members_educational_bacground.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_members_id", to_household_members_educational_bacground.household_members_id)
                    .setString("educational_status", to_household_members_educational_bacground.educational_status)
                    .setString("name_of_school", to_household_members_educational_bacground.name_of_school)
                    .setString("highest_grade_computed", to_household_members_educational_bacground.highest_grade_computed)
                    .setString("year", to_household_members_educational_bacground.year)
                    .setString("achievements", to_household_members_educational_bacground.achievements)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members_educational_bacground.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_members_educational_bacground to_household_members_educational_bacground) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_members_educational_bacground  "
                    + " where id='" + to_household_members_educational_bacground.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members_educational_bacground.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_members_educational_bacground> ret_data(String where) {
        List<to_household_members_educational_bacground> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_members_id"
                    + ",educational_status"
                    + ",name_of_school"
                    + ",highest_grade_computed"
                    + ",year"
                    + ",achievements"
                    + " from household_members_educational_bacground"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int household_members_id = rs.getInt(2);
                String educational_status = rs.getString(3);
                String name_of_school = rs.getString(4);
                String highest_grade_computed = rs.getString(5);
                String year = rs.getString(6);
                String achievements = rs.getString(7);

                to_household_members_educational_bacground to = new to_household_members_educational_bacground(id, household_members_id, educational_status, name_of_school, highest_grade_computed, year, achievements);
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
