/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author nadruoj19
 */
public class S1_transportations {

    public static class to_transportation_types {

        public final int id;
        public final String transportation_type;

        public to_transportation_types( int id,String transportation_type) {
         
            this.transportation_type = transportation_type;
            this.id = id;
        }
    }

    public static List<to_transportation_types> ret_data(String where) {
        List<to_transportation_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",transportation_type"
                    + " from transportation_types "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String transportation_type = rs.getString(2);

                to_transportation_types to = new to_transportation_types(id,transportation_type);
                datas.add(to);
            }
        
            return datas;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void add_transportation_types(to_transportation_types to_transportation_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into transportation_types("
                   
                    + "transportation_type"
                    + ")values("
             
                    + ":transportation_type"
                    + ") ";

            s0 = SqlStringUtil.parse(s0)
                    
                    .setString("transportation_type", to_transportation_types.transportation_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(S1_transportations.class, "Successfully Added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
