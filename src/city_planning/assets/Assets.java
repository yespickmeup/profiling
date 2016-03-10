/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.assets;

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
public class Assets {

    public static class to_assets {

        public final int id;
        public final String asset;

        public to_assets(int id, String asset) {
            this.id = id;
            this.asset = asset;
        }
    }

    public static void add_data(to_assets to_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into assets("
                    + "asset"
                    + ")values("
                    + ":asset"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("asset", to_assets.asset)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Assets.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_assets to_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update assets set "
                    + "asset= :asset "
                    + " where id='" + to_assets.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("asset", to_assets.asset)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Assets.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_assets to_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from assets  "
                    + " where id='" + to_assets.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Assets.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_assets> ret_data(String where) {
        List<to_assets> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",asset"
                    + " from assets"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String asset = rs.getString(2);

                to_assets to = new to_assets(id, asset);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

        public static void save_data(to_assets to_assets) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into assets("
                    + "asset"
                    + ")values("
                    + ":asset"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("asset", to_assets.asset)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Assets.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
