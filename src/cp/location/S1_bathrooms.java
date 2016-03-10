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
public class S1_bathrooms {

   
    public static List<to_bathroom_types> ret_data(String where) {
        List<to_bathroom_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",bathroom_type"
                    + " from bathroom_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String bathroom_type = rs.getString(2);

                to_bathroom_types to = new to_bathroom_types(id, bathroom_type);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static class to_bathroom_types {

        public final int id;
        public final String bathroom_type;

        public to_bathroom_types(int id, String bathroom_type) {
            this.id = id;
            this.bathroom_type = bathroom_type;
        }
    }

}
