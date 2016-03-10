/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.schools;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guinness
 */
public class S1_schools {

    public static class to_schools {

        public final int id;
        public final String school;
        public final String address;

        public to_schools(int id, String school, String address) {
            this.id = id;
            this.school = school;
            this.address = address;
        }
    }

    public static List<to_schools> ret_data(String where) {
        List<to_schools> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",school"
                    + ",address"
                    + " from schools  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String school = rs.getString(2);
                String address = rs.getString(3);

                to_schools to = new to_schools(id, school, address);
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
