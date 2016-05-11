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
public class Business_clearance_applicants {

    public static class to_business_clearance_applicants {

        public final int id;
        public final String applicant;
        public final String address;
        public final String email_address;
        public final String contact_no;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;

        public to_business_clearance_applicants(int id, String applicant, String address, String email_address, String contact_no, String created_at, String updated_at, String created_by, String updated_by, int status) {
            this.id = id;
            this.applicant = applicant;
            this.address = address;
            this.email_address = email_address;
            this.contact_no = contact_no;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
        }
    }

    public static void add_data(to_business_clearance_applicants to_business_clearance_applicants) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into business_clearance_applicants("
                    + "applicant"
                    + ",address"
                    + ",email_address"
                    + ",contact_no"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ")values("
                    + ":applicant"
                    + ",:address"
                    + ",:email_address"
                    + ",:contact_no"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("applicant", to_business_clearance_applicants.applicant)
                    .setString("address", to_business_clearance_applicants.address)
                    .setString("email_address", to_business_clearance_applicants.email_address)
                    .setString("contact_no", to_business_clearance_applicants.contact_no)
                    .setString("created_at", to_business_clearance_applicants.created_at)
                    .setString("updated_at", to_business_clearance_applicants.updated_at)
                    .setString("created_by", to_business_clearance_applicants.created_by)
                    .setString("updated_by", to_business_clearance_applicants.updated_by)
                    .setNumber("status", to_business_clearance_applicants.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_applicants.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_business_clearance_applicants to_business_clearance_applicants) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update business_clearance_applicants set "
                    + "applicant= :applicant "
                    + ",address= :address "
                    + ",email_address= :email_address "
                    + ",contact_no= :contact_no "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + " where id='" + to_business_clearance_applicants.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("applicant", to_business_clearance_applicants.applicant)
                    .setString("address", to_business_clearance_applicants.address)
                    .setString("email_address", to_business_clearance_applicants.email_address)
                    .setString("contact_no", to_business_clearance_applicants.contact_no)
                    .setString("created_at", to_business_clearance_applicants.created_at)
                    .setString("updated_at", to_business_clearance_applicants.updated_at)
                    .setString("created_by", to_business_clearance_applicants.created_by)
                    .setString("updated_by", to_business_clearance_applicants.updated_by)
                    .setNumber("status", to_business_clearance_applicants.status)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_applicants.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_business_clearance_applicants to_business_clearance_applicants) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from business_clearance_applicants  "
                    + " where id='" + to_business_clearance_applicants.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Business_clearance_applicants.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_business_clearance_applicants> ret_data(String where) {
        List<to_business_clearance_applicants> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",applicant"
                    + ",address"
                    + ",email_address"
                    + ",contact_no"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + " from business_clearance_applicants"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String applicant = rs.getString(2);
                String address = rs.getString(3);
                String email_address = rs.getString(4);
                String contact_no = rs.getString(5);
                String created_at = rs.getString(6);
                String updated_at = rs.getString(7);
                String created_by = rs.getString(8);
                String updated_by = rs.getString(9);
                int status = rs.getInt(10);

                to_business_clearance_applicants to = new to_business_clearance_applicants(id, applicant, address, email_address, contact_no, created_at, updated_at, created_by, updated_by, status);
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
