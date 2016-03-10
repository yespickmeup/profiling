/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.businesses;

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
public class Businesses {

    public static class to_businesses {

        public final int id;
        public final String business;
        public final String address;
        public final String mailing_address;
        public final String business_type;
        public final String contact_no;
        public final String remarks;

        public to_businesses(int id, String business, String address, String mailing_address, String business_type, String contact_no, String remarks) {
            this.id = id;
            this.business = business;
            this.address = address;
            this.mailing_address = mailing_address;
            this.business_type = business_type;
            this.contact_no = contact_no;
            this.remarks = remarks;
        }
    }

    public static void add_data(to_businesses to_businesses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into businesses("
                    + "business"
                    + ",address"
                    + ",mailing_address"
                    + ",business_type"
                    + ",contact_no"
                    + ",remarks"
                    + ")values("
                    + ":business"
                    + ",:address"
                    + ",:mailing_address"
                    + ",:business_type"
                    + ",:contact_no"
                    + ",:remarks"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("business", to_businesses.business)
                    .setString("address", to_businesses.address)
                    .setString("mailing_address", to_businesses.mailing_address)
                    .setString("business_type", to_businesses.business_type)
                    .setString("contact_no", to_businesses.contact_no)
                    .setString("remarks", to_businesses.remarks)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Businesses.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_businesses to_businesses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update businesses set "
                    + "business= :business "
                    + ",address= :address "
                    + ",mailing_address= :mailing_address "
                    + ",business_type= :business_type "
                    + ",contact_no= :contact_no "
                    + ",remarks= :remarks "
                    + " where id='" + to_businesses.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("business", to_businesses.business)
                    .setString("address", to_businesses.address)
                    .setString("mailing_address", to_businesses.mailing_address)
                    .setString("business_type", to_businesses.business_type)
                    .setString("contact_no", to_businesses.contact_no)
                    .setString("remarks", to_businesses.remarks)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Businesses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_businesses to_businesses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from businesses  "
                    + " where id='" + to_businesses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Businesses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_businesses> ret_data(String where) {
        List<to_businesses> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",business"
                    + ",address"
                    + ",mailing_address"
                    + ",business_type"
                    + ",contact_no"
                    + ",remarks"
                    + " from businesses"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String business = rs.getString(2);
                String address = rs.getString(3);
                String mailing_address = rs.getString(4);
                String business_type = rs.getString(5);
                String contact_no = rs.getString(6);
                String remarks = rs.getString(7);

                to_businesses to = new to_businesses(id, business, address, mailing_address, business_type, contact_no, remarks);
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
