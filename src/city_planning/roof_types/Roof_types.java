/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.roof_types;

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
public class Roof_types {

    public static class to_roof_types {

        public final int id;
        public final String roof_type;
        public  boolean selected;
        public to_roof_types(int id, String roof_type,boolean selected) {
            this.id = id;
            this.roof_type = roof_type;
            this.selected=selected;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }
        
    }

    public static void add_data(to_roof_types to_roof_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into roof_types("
                    + "roof_type"
                    + ")values("
                    + ":roof_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("roof_type", to_roof_types.roof_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Roof_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_roof_types to_roof_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update roof_types set "
                    + "roof_type= :roof_type "
                    + " where id='" + to_roof_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("roof_type", to_roof_types.roof_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Roof_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_roof_types to_roof_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from roof_types  "
                    + " where id='" + to_roof_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Roof_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_roof_types> ret_data(String where) {
        List<to_roof_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",roof_type"
                    + " from roof_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String roof_type = rs.getString(2);

                to_roof_types to = new to_roof_types(id, roof_type,false);
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
