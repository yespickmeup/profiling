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
public class S1_disposal_methods {

    public static List<to_disposal_methods> ret_data(String where) {
        List<to_disposal_methods> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",disposal_method"
                    + " from disposal_methods "
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String disposal_method = rs.getString(2);

                to_disposal_methods to = new to_disposal_methods(id, disposal_method);
                datas.add(to);
            }
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static class to_disposal_methods {

        public final int id;
        public final String disposal_method;

        public to_disposal_methods(int id, String disposal_method) {
            this.id = id;
            this.disposal_method = disposal_method;
        }
    }

}
