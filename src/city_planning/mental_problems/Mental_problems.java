/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.mental_problems;

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
public class Mental_problems {

    public static class to_mental_problems {

        public final int id;
        public final String mental_problem;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_mental_problems(int id, String mental_problem, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.mental_problem = mental_problem;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_mental_problems to_mental_problems) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into mental_problems("
                    + "mental_problem"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":mental_problem"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("mental_problem", to_mental_problems.mental_problem)
                    .setString("created_at", to_mental_problems.created_at)
                    .setString("updated_at", to_mental_problems.updated_at)
                    .setString("created_by", to_mental_problems.created_by)
                    .setString("updated_by", to_mental_problems.updated_by)
                    .setNumber("status", to_mental_problems.status)
                    .setNumber("is_uploaded", to_mental_problems.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mental_problems.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_mental_problems to_mental_problems) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update mental_problems set "
                    + "mental_problem= :mental_problem "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_mental_problems.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("mental_problem", to_mental_problems.mental_problem)
                    .setString("created_at", to_mental_problems.created_at)
                    .setString("updated_at", to_mental_problems.updated_at)
                    .setString("created_by", to_mental_problems.created_by)
                    .setString("updated_by", to_mental_problems.updated_by)
                    .setNumber("status", to_mental_problems.status)
                    .setNumber("is_uploaded", to_mental_problems.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mental_problems.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_mental_problems to_mental_problems) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from mental_problems  "
                    + " where id='" + to_mental_problems.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Mental_problems.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_mental_problems> ret_data(String where) {
        List<to_mental_problems> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",mental_problem"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from mental_problems"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String mental_problem = rs.getString(2);
                String created_at = rs.getString(3);
                String updated_at = rs.getString(4);
                String created_by = rs.getString(5);
                String updated_by = rs.getString(6);
                int status = rs.getInt(7);
                int is_uploaded = rs.getInt(8);

                to_mental_problems to = new to_mental_problems(id, mental_problem, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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
