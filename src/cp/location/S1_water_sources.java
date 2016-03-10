/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadruoj19
 */
public class S1_water_sources {

    public static class to_water_sources {

        public final int id;
        public final String water_source;

        public to_water_sources(int id, String water_source) {
            this.id = id;
            this.water_source = water_source;
        }
    }

    public static List<to_water_sources> ret_data(String where) {
        List<to_water_sources> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",water_source"
                    + " from water_sources "
                    + " "+where;

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
