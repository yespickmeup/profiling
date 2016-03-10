/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.regions;

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
public class Regions {

    public static class to_regions {

        public final int id;
        public final String region;

        public to_regions(int id, String region) {
            this.id = id;
            this.region = region;
        }
    }

    public static void add_data(to_regions to_regions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into regions("
                    + "region"
                    + ")values("
                    + ":region"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("region", to_regions.region)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Regions.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_regions to_regions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update regions set "
                    + "region= :region "
                    + " where id='" + to_regions.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("region", to_regions.region)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Regions.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_regions to_regions) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from regions  "
                    + " where id='" + to_regions.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Regions.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_regions> ret_data(String where) {
        List<to_regions> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",region"
                    + " from regions"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String region = rs.getString(2);

                to_regions to = new to_regions(id, region);
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
