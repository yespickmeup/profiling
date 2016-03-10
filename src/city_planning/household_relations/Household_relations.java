/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_relations;

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
public class Household_relations {

    public static class to_household_relations {

        public final int id;
        public final String household_relation;

        public to_household_relations(int id, String household_relation) {
            this.id = id;
            this.household_relation = household_relation;
        }
    }

    public static void add_data(to_household_relations to_household_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_relations("
                    + "household_relation"
                    + ")values("
                    + ":household_relation"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("household_relation", to_household_relations.household_relation)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_relations.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_relations to_household_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_relations set "
                    + "household_relation= :household_relation "
                    + " where id='" + to_household_relations.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("household_relation", to_household_relations.household_relation)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_relations.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_relations to_household_relations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_relations  "
                    + " where id='" + to_household_relations.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_relations.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_relations> ret_data(String where) {
        List<to_household_relations> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_relation"
                    + " from household_relations"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String household_relation = rs.getString(2);

                to_household_relations to = new to_household_relations(id, household_relation);
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
