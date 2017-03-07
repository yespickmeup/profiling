/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.medical_diseases;

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
public class Medical_diseases {

    public static class to_medical_diseases {

        public final int id;
        public final String medical_disease;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final int is_uploaded;

        public to_medical_diseases(int id, String medical_disease, String created_at, String updated_at, String created_by, String updated_by, int status, int is_uploaded) {
            this.id = id;
            this.medical_disease = medical_disease;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.is_uploaded = is_uploaded;
        }
    }

    public static void add_data(to_medical_diseases to_medical_diseases) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into medical_diseases("
                    + "medical_disease"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + ")values("
                    + ":medical_disease"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:is_uploaded"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("medical_disease", to_medical_diseases.medical_disease)
                    .setString("created_at", to_medical_diseases.created_at)
                    .setString("updated_at", to_medical_diseases.updated_at)
                    .setString("created_by", to_medical_diseases.created_by)
                    .setString("updated_by", to_medical_diseases.updated_by)
                    .setNumber("status", to_medical_diseases.status)
                    .setNumber("is_uploaded", to_medical_diseases.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Medical_diseases.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_medical_diseases to_medical_diseases) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update medical_diseases set "
                    + "medical_disease= :medical_disease "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",is_uploaded= :is_uploaded "
                    + " where id='" + to_medical_diseases.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("medical_disease", to_medical_diseases.medical_disease)
                    .setString("created_at", to_medical_diseases.created_at)
                    .setString("updated_at", to_medical_diseases.updated_at)
                    .setString("created_by", to_medical_diseases.created_by)
                    .setString("updated_by", to_medical_diseases.updated_by)
                    .setNumber("status", to_medical_diseases.status)
                    .setNumber("is_uploaded", to_medical_diseases.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Medical_diseases.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_medical_diseases to_medical_diseases) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from medical_diseases  "
                    + " where id='" + to_medical_diseases.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Medical_diseases.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_medical_diseases> ret_data(String where) {
        List<to_medical_diseases> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",medical_disease"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",is_uploaded"
                    + " from medical_diseases"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String medical_disease = rs.getString(2);
                String created_at = rs.getString(3);
                String updated_at = rs.getString(4);
                String created_by = rs.getString(5);
                String updated_by = rs.getString(6);
                int status = rs.getInt(7);
                int is_uploaded = rs.getInt(8);

                to_medical_diseases to = new to_medical_diseases(id, medical_disease, created_at, updated_at, created_by, updated_by, status, is_uploaded);
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
