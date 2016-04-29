/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.achievements;

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


/* 
march 25, 2016 - janica1 baboy
march 25, 2016 - kenneth
march 25, 2016 - ronald1
april 29, 2016 - kenneth - ok
april 29, 2016 - peter - ok
*/
public class Achievements {

    public static class to_achievements {
        
        
        public final int id;
        public final String achievement;

        public to_achievements(int id, String achievement) {
            this.id = id;
            this.achievement = achievement;
                    }
    }

    public static void add_data(to_achievements to_achievements) {
        try {
            
          
            Connection conn = MyConnection.connect();
            String s0 = "insert into achievements("
                    + "achievement"
                    + ")values("
                    + ":achievement"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("achievement", to_achievements.achievement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Achievements.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_achievements to_achievements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update achievements set "
                    + "achievement= :achievement "
                    + " where id='" + to_achievements.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("achievement", to_achievements.achievement)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Achievements.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_achievements to_achievements) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from achievements  "
                    + " where id='" + to_achievements.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Achievements.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_achievements> ret_data(String where) {
        List<to_achievements> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",achievement"
                    + " from achievements"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String achievement = rs.getString(2);

                to_achievements to = new to_achievements(id, achievement);
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
