/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.skills;

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
public class Skills {

    public static class to_skills {

        public final int id;
        public final String skill;

        public to_skills(int id, String skill) {
            this.id = id;
            this.skill = skill;
        }
    }

    public static void add_data(to_skills to_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into skills("
                    + "skill"
                    + ")values("
                    + ":skill"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("skill", to_skills.skill)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Skills.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_skills to_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update skills set "
                    + "skill= :skill "
                    + " where id='" + to_skills.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("skill", to_skills.skill)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Skills.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_skills to_skills) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from skills  "
                    + " where id='" + to_skills.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Skills.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_skills> ret_data(String where) {
        List<to_skills> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",skill"
                    + " from skills"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String skill = rs.getString(2);

                to_skills to = new to_skills(id, skill);
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
