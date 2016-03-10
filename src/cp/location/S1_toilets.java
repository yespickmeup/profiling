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
public class S1_toilets {

    public static class to_toilet_types {

        public final int id;
        public final String toilet_type;

        public to_toilet_types(int id, String toilet_type) {
            this.id = id;
            this.toilet_type = toilet_type;
        }
    }

    public static List<to_toilet_types> ret_data(String where) {
        List<to_toilet_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",toilet_type"
                    + " from toilet_types"
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String toilet_type = rs.getString(2);

                to_toilet_types to = new to_toilet_types(id, toilet_type);
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
