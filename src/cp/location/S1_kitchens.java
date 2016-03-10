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
public class S1_kitchens {

    public static class to_kitchen_types {

        public final int id;
        public final String kitchen_type;

        public to_kitchen_types(int id, String kitchen_type) {
            this.id = id;
            this.kitchen_type = kitchen_type;
        }
    }

    public static List<to_kitchen_types> ret_data(String where) {
        List<to_kitchen_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",kitchen_type"
                    + " from kitchen_types"
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String kitchen_type = rs.getString(2);

                to_kitchen_types to = new to_kitchen_types(id, kitchen_type);
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
