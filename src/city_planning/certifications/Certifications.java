/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.certifications;

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
public class Certifications {

    public static class to_certifications {

        public final int id;
        public final String certification;

        public to_certifications(int id, String certification) {
            this.id = id;
            this.certification = certification;
        }
    }

    public static void add_data(to_certifications to_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into certifications("
                    + "certification"
                    + ")values("
                    + ":certification"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("certification", to_certifications.certification)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Certifications.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_certifications to_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update certifications set "
                    + "certification= :certification "
                    + " where id='" + to_certifications.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("certification", to_certifications.certification)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Certifications.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_certifications to_certifications) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from certifications  "
                    + " where id='" + to_certifications.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Certifications.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_certifications> ret_data(String where) {
        List<to_certifications> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",certification"
                    + " from certifications"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String certification = rs.getString(2);

                to_certifications to = new to_certifications(id, certification);
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
