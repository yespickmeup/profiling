/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadruoj19
 */
public class S1_cookings {

    public static class to_cooking_lighting_types {

        public final int id;
        public final String cooking_lighting_type;

        public to_cooking_lighting_types(int id, String cooking_lighting_type) {
            this.id = id;
            this.cooking_lighting_type = cooking_lighting_type;
        }
    }

    public static List<to_cooking_lighting_types> ret_data(String where) {
        List<to_cooking_lighting_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",cooking_lighting_type"
                    + " from cooking_lighting_types"
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String cooking_lighting_type = rs.getString(2);

                to_cooking_lighting_types to = new to_cooking_lighting_types(id, cooking_lighting_type);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
