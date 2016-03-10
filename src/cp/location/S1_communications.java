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
public class S1_communications {

    public static void add_communication_types(to_communication_types to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class to_communication_types {

        public final int id;
        public final String communication_type;

        public to_communication_types(int id, String communication_type) {
            this.id = id;
            this.communication_type = communication_type;
        }
    }

    public static List<to_communication_types> ret_data(String where) {
        List<to_communication_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",communication_type"
                    + " from communication_types "
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String communication_type = rs.getString(2);

                to_communication_types to = new to_communication_types(id, communication_type);
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
