/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.tenure;

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
public class Tenure {

    public static class to_tenure {

        public final int id;
        public final String tenure;

        public to_tenure(int id, String tenure) {
            this.id = id;
            this.tenure = tenure;
        }
    }

    public static void add_data(to_tenure to_tenure) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into tenure_types("
                    + "tenure_type"
                    + ")values("
                    + ":tenure_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("tenure", to_tenure.tenure)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Tenure.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_tenure to_tenure) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update blood_types set "
                    + "blood_type= :blood_type "
                    + " where id='" + to_tenure.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("blood_type", to_tenure.tenure)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Tenure.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_tenure to_tenure) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from tenure_types  "
                    + " where id='" + to_tenure.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Tenure.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_tenure> ret_data(String where) {
        List<to_tenure> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",tenure_type"
                    + " from tenure_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String tenure_type = rs.getString(2);

                to_tenure to = new to_tenure(id, tenure_type);
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
