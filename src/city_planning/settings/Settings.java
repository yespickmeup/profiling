/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.settings;

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
public class Settings {

    public static class to_settings {

        public final int id;
        public final String default_barangay;
        public final String default_barangay_id;
        public final int barangay_is_city;
        public final String punong_barangay;
        public final int household_assets;
        public final int household_expenditures;
        public final int household_consumptions;
        public final int household_concerns;
        public final int household_source_of_income;
        public final int household_member_educational_background;
        public final int household_member_health_status;
        public final int household_member_medication;
        public final int household_member_work_experience;
        public final int household_member_license_and_certificates;
        public final int household_member_employment_status;
        public final int household_member_skills;

        public to_settings(int id, String default_barangay, String default_barangay_id, int barangay_is_city, String punong_barangay, int household_assets, int household_expenditures, int household_consumptions, int household_concerns, int household_source_of_income, int household_member_educational_background, int household_member_health_status, int household_member_medication, int household_member_work_experience, int household_member_license_and_certificates, int household_member_employment_status, int household_member_skills) {
            this.id = id;
            this.default_barangay = default_barangay;
            this.default_barangay_id = default_barangay_id;
            this.barangay_is_city = barangay_is_city;
            this.punong_barangay = punong_barangay;
            this.household_assets = household_assets;
            this.household_expenditures = household_expenditures;
            this.household_consumptions = household_consumptions;
            this.household_concerns = household_concerns;
            this.household_source_of_income = household_source_of_income;
            this.household_member_educational_background = household_member_educational_background;
            this.household_member_health_status = household_member_health_status;
            this.household_member_medication = household_member_medication;
            this.household_member_work_experience = household_member_work_experience;
            this.household_member_license_and_certificates = household_member_license_and_certificates;
            this.household_member_employment_status = household_member_employment_status;
            this.household_member_skills = household_member_skills;
        }
    }

    public static void add_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into settings("
                    + "default_barangay"
                    + ",default_barangay_id"
                    + ",barangay_is_city"
                    + ",punong_barangay"
                    + ",household_assets"
                    + ",household_expenditures"
                    + ",household_consumptions"
                    + ",household_concerns"
                    + ",household_source_of_income"
                    + ",household_member_educational_background"
                    + ",household_member_health_status"
                    + ",household_member_medication"
                    + ",household_member_work_experience"
                    + ",household_member_license_and_certificates"
                    + ",household_member_employment_status"
                    + ",household_member_skills"
                    + ")values("
                    + ":default_barangay"
                    + ",:default_barangay_id"
                    + ",:barangay_is_city"
                    + ",:punong_barangay"
                    + ",:household_assets"
                    + ",:household_expenditures"
                    + ",:household_consumptions"
                    + ",:household_concerns"
                    + ",:household_source_of_income"
                    + ",:household_member_educational_background"
                    + ",:household_member_health_status"
                    + ",:household_member_medication"
                    + ",:household_member_work_experience"
                    + ",:household_member_license_and_certificates"
                    + ",:household_member_employment_status"
                    + ",:household_member_skills"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("default_barangay", to_settings.default_barangay)
                    .setString("default_barangay_id", to_settings.default_barangay_id)
                    .setNumber("barangay_is_city", to_settings.barangay_is_city)
                    .setString("punong_barangay", to_settings.punong_barangay)
                    .setNumber("household_assets", to_settings.household_assets)
                    .setNumber("household_expenditures", to_settings.household_expenditures)
                    .setNumber("household_consumptions", to_settings.household_consumptions)
                    .setNumber("household_concerns", to_settings.household_concerns)
                    .setNumber("household_source_of_income", to_settings.household_source_of_income)
                    .setNumber("household_member_educational_background", to_settings.household_member_educational_background)
                    .setNumber("household_member_health_status", to_settings.household_member_health_status)
                    .setNumber("household_member_medication", to_settings.household_member_medication)
                    .setNumber("household_member_work_experience", to_settings.household_member_work_experience)
                    .setNumber("household_member_license_and_certificates", to_settings.household_member_license_and_certificates)
                    .setNumber("household_member_employment_status", to_settings.household_member_employment_status)
                    .setNumber("household_member_skills", to_settings.household_member_skills)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update settings set "
                    + "default_barangay= :default_barangay "
                    + ",default_barangay_id= :default_barangay_id "
                    + ",barangay_is_city= :barangay_is_city "
                    + ",punong_barangay= :punong_barangay "
                    + ",household_assets= :household_assets "
                    + ",household_expenditures= :household_expenditures "
                    + ",household_consumptions= :household_consumptions "
                    + ",household_concerns= :household_concerns "
                    + ",household_source_of_income= :household_source_of_income "
                    + ",household_member_educational_background= :household_member_educational_background "
                    + ",household_member_health_status= :household_member_health_status "
                    + ",household_member_medication= :household_member_medication "
                    + ",household_member_work_experience= :household_member_work_experience "
                    + ",household_member_license_and_certificates= :household_member_license_and_certificates "
                    + ",household_member_employment_status= :household_member_employment_status "
                    + ",household_member_skills= :household_member_skills "
                    + " where id='" + to_settings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("default_barangay", to_settings.default_barangay)
                    .setString("default_barangay_id", to_settings.default_barangay_id)
                    .setNumber("barangay_is_city", to_settings.barangay_is_city)
                    .setString("punong_barangay", to_settings.punong_barangay)
                    .setNumber("household_assets", to_settings.household_assets)
                    .setNumber("household_expenditures", to_settings.household_expenditures)
                    .setNumber("household_consumptions", to_settings.household_consumptions)
                    .setNumber("household_concerns", to_settings.household_concerns)
                    .setNumber("household_source_of_income", to_settings.household_source_of_income)
                    .setNumber("household_member_educational_background", to_settings.household_member_educational_background)
                    .setNumber("household_member_health_status", to_settings.household_member_health_status)
                    .setNumber("household_member_medication", to_settings.household_member_medication)
                    .setNumber("household_member_work_experience", to_settings.household_member_work_experience)
                    .setNumber("household_member_license_and_certificates", to_settings.household_member_license_and_certificates)
                    .setNumber("household_member_employment_status", to_settings.household_member_employment_status)
                    .setNumber("household_member_skills", to_settings.household_member_skills)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data2(String default_barangay, String default_barangay_id, int barangay_is_city, String punong_barangay) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update settings set "
                    + " default_barangay= :default_barangay "
                    + ",default_barangay_id= :default_barangay_id "
                    + ",punong_barangay= :punong_barangay "
                    + ",barangay_is_city= :barangay_is_city "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("default_barangay", default_barangay)
                    .setString("default_barangay_id", default_barangay_id)
                    .setNumber("barangay_is_city", barangay_is_city)
                    .setString("punong_barangay", punong_barangay)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data3(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update settings set "
                    + " household_assets= :household_assets "
                    + ",household_expenditures= :household_expenditures "
                    + ",household_consumptions= :household_consumptions "
                    + ",household_concerns= :household_concerns "
                    + ",household_source_of_income= :household_source_of_income "
                    + ",household_member_educational_background= :household_member_educational_background "
                    + ",household_member_health_status= :household_member_health_status "
                    + ",household_member_medication= :household_member_medication "
                    + ",household_member_work_experience= :household_member_work_experience "
                    + ",household_member_license_and_certificates= :household_member_license_and_certificates "
                    + ",household_member_employment_status= :household_member_employment_status "
                    + ",household_member_skills= :household_member_skills "
                    + " where id='" + to_settings.id + "' "
                    + " ";
            
            s0 = SqlStringUtil.parse(s0)
                    .setNumber("household_assets", to_settings.household_assets)
                    .setNumber("household_expenditures", to_settings.household_expenditures)
                    .setNumber("household_consumptions", to_settings.household_consumptions)
                    .setNumber("household_concerns", to_settings.household_concerns)
                    .setNumber("household_source_of_income", to_settings.household_source_of_income)
                    .setNumber("household_member_educational_background", to_settings.household_member_educational_background)
                    .setNumber("household_member_health_status", to_settings.household_member_health_status)
                    .setNumber("household_member_medication", to_settings.household_member_medication)
                    .setNumber("household_member_work_experience", to_settings.household_member_work_experience)
                    .setNumber("household_member_license_and_certificates", to_settings.household_member_license_and_certificates)
                    .setNumber("household_member_employment_status", to_settings.household_member_employment_status)
                    .setNumber("household_member_skills", to_settings.household_member_skills)
                    .ok();
            System.out.println(s0);
            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_settings to_settings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from settings  "
                    + " where id='" + to_settings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Settings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_settings> ret_data(String where) {
        List<to_settings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",default_barangay"
                    + ",default_barangay_id"
                    + ",barangay_is_city"
                    + ",punong_barangay"
                    + ",household_assets"
                    + ",household_expenditures"
                    + ",household_consumptions"
                    + ",household_concerns"
                    + ",household_source_of_income"
                    + ",household_member_educational_background"
                    + ",household_member_health_status"
                    + ",household_member_medication"
                    + ",household_member_work_experience"
                    + ",household_member_license_and_certificates"
                    + ",household_member_employment_status"
                    + ",household_member_skills"
                    + " from settings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String default_barangay = rs.getString(2);
                String default_barangay_id = rs.getString(3);
                int barangay_is_city = rs.getInt(4);
                String punong_barangay = rs.getString(5);
                int household_assets = rs.getInt(6);
                int household_expenditures = rs.getInt(7);
                int household_consumptions = rs.getInt(8);
                int household_concerns = rs.getInt(9);
                int household_source_of_income = rs.getInt(10);
                int household_member_educational_background = rs.getInt(11);
                int household_member_health_status = rs.getInt(12);
                int household_member_medication = rs.getInt(13);
                int household_member_work_experience = rs.getInt(14);
                int household_member_license_and_certificates = rs.getInt(15);
                int household_member_employment_status = rs.getInt(16);
                int household_member_skills = rs.getInt(17);

                to_settings to = new to_settings(id, default_barangay, default_barangay_id, barangay_is_city, punong_barangay, household_assets, household_expenditures, household_consumptions, household_concerns, household_source_of_income, household_member_educational_background, household_member_health_status, household_member_medication, household_member_work_experience, household_member_license_and_certificates, household_member_employment_status, household_member_skills);
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
