/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_problems;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PeterGil
 */
public class Household_problems {

    public static class to_household_member_problems {

        public final int id;
        public final String problems;

        public to_household_member_problems(int id, String problems) {
            this.id = id;
            this.problems = problems;
        }
    }

    public static List<to_household_member_problems> ret_data(String where) {
        List<to_household_member_problems> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",problems"
                    + " from household_member_problems"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String problems = rs.getString(2);

                to_household_member_problems to = new to_household_member_problems(id, problems);
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
