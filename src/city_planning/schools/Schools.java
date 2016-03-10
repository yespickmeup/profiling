/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.schools;

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
public class Schools {

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

    public static void add_data(to_schools to_schools) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into schools("
                    + "school"
                    + ",address"
                    + ")values("
                    + ":school"
                    + ",:address"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("school", to_schools.school)
                    .setString("address", to_schools.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Schools.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_schools to_schools) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update schools set "
                    + "school= :school "
                    + ",address= :address "
                    + " where id='" + to_schools.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("school", to_schools.school)
                    .setString("address", to_schools.address)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Schools.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_schools to_schools) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from schools  "
                    + " where id='" + to_schools.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Schools.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
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
                    + " from schools"
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
