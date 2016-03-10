/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.water_sources;

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
public class Water_sources {

    public static class to_water_sources {

        public final int id;
        public final String water_source;

        public to_water_sources(int id, String water_source) {
            this.id = id;
            this.water_source = water_source;
        }
    }

    public static void add_data(to_water_sources to_water_sources) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into water_sources("
                    + "water_source"
                    + ")values("
                    + ":water_source"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("water_source", to_water_sources.water_source)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Water_sources.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_water_sources to_water_sources) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update water_sources set "
                    + "water_source= :water_source "
                    + " where id='" + to_water_sources.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("water_source", to_water_sources.water_source)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Water_sources.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_water_sources to_water_sources) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from water_sources  "
                    + " where id='" + to_water_sources.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Water_sources.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_water_sources> ret_data(String where) {
        List<to_water_sources> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",water_source"
                    + " from water_sources"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String water_source = rs.getString(2);

                to_water_sources to = new to_water_sources(id, water_source);
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
