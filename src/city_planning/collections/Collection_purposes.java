/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.collections;

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
public class Collection_purposes {

    public static class to_collection_purposes {

        public final int id;
        public final String purpose;

        public to_collection_purposes(int id, String purpose) {
            this.id = id;
            this.purpose = purpose;
        }
    }

    public static void add_data(to_collection_purposes to_collection_purposes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into collection_purposes("
                    + "purpose"
                    + ")values("
                    + ":purpose"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("purpose", to_collection_purposes.purpose)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collection_purposes.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_collection_purposes to_collection_purposes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update collection_purposes set "
                    + "purpose= :purpose "
                    + " where id='" + to_collection_purposes.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("purpose", to_collection_purposes.purpose)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collection_purposes.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_collection_purposes to_collection_purposes) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from collection_purposes  "
                    + " where id='" + to_collection_purposes.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Collection_purposes.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_collection_purposes> ret_data(String where) {
        List<to_collection_purposes> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",purpose"
                    + " from collection_purposes"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String purpose = rs.getString(2);

                to_collection_purposes to = new to_collection_purposes(id, purpose);
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
