/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_certification;

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
public class Household_member_certification {

    public static class to_household_member_certification {

        public final int id;
        public final int household_member_id;
        public final String certification;
        public final String description;
        public final String address;
        public final String date;

        public to_household_member_certification(int id, int household_member_id, String certification, String description, String address, String date) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.certification = certification;
            this.description = description;
            this.address = address;
            this.date = date;
        }
    }

    public static void add_data(to_household_member_certification to_household_member_certification) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_certification("
                    + "household_member_id"
                    + ",certification"
                    + ",description"
                    + ",address"
                    + ",date"
                    + ")values("
                    + ":household_member_id"
                    + ",:certification"
                    + ",:description"
                    + ",:address"
                    + ",:date"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_certification.household_member_id)
                    .setString("certification", to_household_member_certification.certification)
                    .setString("description", to_household_member_certification.description)
                    .setString("address", to_household_member_certification.address)
                    .setString("date", to_household_member_certification.date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_certification.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_certification to_household_member_certification) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_certification set "
                    + "household_member_id= :household_member_id "
                    + ",certification= :certification "
                    + ",description= :description "
                    + ",address= :address "
                    + ",date= :date "
                    + " where id='" + to_household_member_certification.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_member_id", to_household_member_certification.household_member_id)
                    .setString("certification", to_household_member_certification.certification)
                    .setString("description", to_household_member_certification.description)
                    .setString("address", to_household_member_certification.address)
                    .setString("date", to_household_member_certification.date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_certification.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_certification to_household_member_certification) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_certification  "
                    + " where id='" + to_household_member_certification.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_certification.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_certification> ret_data(String where) {
        List<to_household_member_certification> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",household_member_id"
                    + ",certification"
                    + ",description"
                    + ",address"
                    + ",date"
                    + " from household_member_certification"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                int household_member_id = rs.getInt(2);
                String certification = rs.getString(3);
                String description = rs.getString(4);
                String address = rs.getString(5);
                String date = rs.getString(6);

                to_household_member_certification to = new to_household_member_certification(id, household_member_id, certification, description, address, date);
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
