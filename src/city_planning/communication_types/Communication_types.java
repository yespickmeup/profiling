/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.communication_types;

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
public class Communication_types {

    public static class to_communication_types {

        public final int id;
        public final String communication_type;
        public final boolean selected;
        public to_communication_types(int id, String communication_type,boolean selected) {
            this.id = id;
            this.communication_type = communication_type;
            this.selected=selected;
        }
    }

    public static void add_data(to_communication_types to_communication_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into communication_types("
                    + "communication_type"
                    + ")values("
                    + ":communication_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("communication_type", to_communication_types.communication_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Communication_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_communication_types to_communication_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update communication_types set "
                    + "communication_type= :communication_type "
                    + " where id='" + to_communication_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("communication_type", to_communication_types.communication_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Communication_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_communication_types to_communication_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from communication_types  "
                    + " where id='" + to_communication_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Communication_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_communication_types> ret_data(String where) {
        List<to_communication_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",communication_type"
                    + " from communication_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String communication_type = rs.getString(2);

                to_communication_types to = new to_communication_types(id, communication_type,false);
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
