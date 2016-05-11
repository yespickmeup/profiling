/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.business_clearances;

import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Business_clearance_locations {

    public static class to_business_clearance_locations {

        public final int id;
        public final String location;

        public to_business_clearance_locations(int id, String location) {
            this.id = id;
            this.location = location;
        }
    }

    public static void add_data(to_business_clearance_locations to_business_clearance_locations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into business_clearance_locations("
                    + "location"
                    + ")values("
                    + ":location"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("location", to_business_clearance_locations.location)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_locations.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_business_clearance_locations to_business_clearance_locations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update business_clearance_locations set "
                    + "location= :location "
                    + " where id='" + to_business_clearance_locations.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("location", to_business_clearance_locations.location)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_locations.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_business_clearance_locations to_business_clearance_locations) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from business_clearance_locations  "
                    + " where id='" + to_business_clearance_locations.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_locations.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_business_clearance_locations> ret_data(String where) {
        List<to_business_clearance_locations> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",location"
                    + " from business_clearance_locations"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String location = rs.getString(2);

                to_business_clearance_locations to = new to_business_clearance_locations(id, location);
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
