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
public class S1_roofs {

    public static class to_roof_types {

        public final int id;
        public final String roof_type;

        public to_roof_types(int id, String roof_type) {
            this.id = id;
            this.roof_type = roof_type;
        }
    }

    public static List<to_roof_types> ret_data(String where) {
        List<to_roof_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",roof_type"
                    + " from roof_types  "
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String roof_type = rs.getString(2);

                to_roof_types to = new to_roof_types(id, roof_type);
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
