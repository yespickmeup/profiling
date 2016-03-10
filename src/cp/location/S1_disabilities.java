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
 * @author nadruoj
 */
public class S1_disabilities {

    public static class to_disabilities {

        public final int id;
        public final String disability;

        public to_disabilities(int id, String disability) {
            this.id = id;
            this.disability = disability;
        }
    }

    public static List<to_disabilities> ret_data(String where) {
        List<to_disabilities> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",disability"
                    + " from disabilities"
                    + " "+where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String disability = rs.getString(2);

                to_disabilities to = new to_disabilities(id, disability);
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
