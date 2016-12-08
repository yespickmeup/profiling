/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_member_employment_status;

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
public class Household_member_employment_status {

    public static class to_household_member_employment_status {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final String region;
        public final String region_id;
        public final String province;
        public final String province_id;
        public final String city;
        public final String city_id;
        public final String barangay;
        public final String barangay_id;
        public final String purok;
        public final String purok_id;
        public int status;
        public int is_uploaded;
        public final String house_no;
        public final String household_no;
        public final String household_member_no;
        public final String fname;
        public final String mname;
        public final String lname;
        public final String sname;
        public final int employment_status;
        public final String employment_type;
        public final String unemployment_type;
        public final String company;
        public final String work_position;
        public final String work_description;
        public final int is_looking_for_work;
        public final String ofw_business_name;
        public final String ofw_business_address;
        public final String ofw_mailing_address;
        public final String ofw_type_of_business;
        public final double ofw_financial_assistance_amount;
        public final String ofw_country;
        public final String ofw_job;
        public final String ofw_reason_for_migration;
        public final String transient_no;

        public to_household_member_employment_status(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, int is_uploaded, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, int employment_status, String employment_type, String unemployment_type, String company, String work_position, String work_description, int is_looking_for_work, String ofw_business_name, String ofw_business_address, String ofw_mailing_address, String ofw_type_of_business, double ofw_financial_assistance_amount, String ofw_country, String ofw_job, String ofw_reason_for_migration, String transient_no) {

            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.status = status;
            this.is_uploaded = is_uploaded;
            this.house_no = house_no;
            this.household_no = household_no;
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.employment_status = employment_status;
            this.employment_type = employment_type;
            this.unemployment_type = unemployment_type;
            this.company = company;
            this.work_position = work_position;
            this.work_description = work_description;
            this.is_looking_for_work = is_looking_for_work;
            this.ofw_business_name = ofw_business_name;
            this.ofw_business_address = ofw_business_address;
            this.ofw_mailing_address = ofw_mailing_address;
            this.ofw_type_of_business = ofw_type_of_business;
            this.ofw_financial_assistance_amount = ofw_financial_assistance_amount;
            this.ofw_country = ofw_country;
            this.ofw_job = ofw_job;
            this.ofw_reason_for_migration = ofw_reason_for_migration;
            this.transient_no = transient_no;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getIs_uploaded() {
            return is_uploaded;
        }

        public void setIs_uploaded(int is_uploaded) {
            this.is_uploaded = is_uploaded;
        }

    }

    public static void add_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_member_employment_status("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",employment_status"
                    + ",employment_type"
                    + ",unemployment_type"
                    + ",company"
                    + ",work_position"
                    + ",work_description"
                    + ",is_looking_for_work"
                    + ",ofw_business_name"
                    + ",ofw_business_address"
                    + ",ofw_mailing_address"
                    + ",ofw_type_of_business"
                    + ",ofw_financial_assistance_amount"
                    + ",ofw_country"
                    + ",ofw_job"
                    + ",ofw_reason_for_migration"
                    + ",transient_no"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:region"
                    + ",:region_id"
                    + ",:province"
                    + ",:province_id"
                    + ",:city"
                    + ",:city_id"
                    + ",:barangay"
                    + ",:barangay_id"
                    + ",:purok"
                    + ",:purok_id"
                    + ",:status"
                    + ",:house_no"
                    + ",:household_no"
                    + ",:household_member_no"
                    + ",:fname"
                    + ",:mname"
                    + ",:lname"
                    + ",:sname"
                    + ",:employment_status"
                    + ",:employment_type"
                    + ",:unemployment_type"
                    + ",:company"
                    + ",:work_position"
                    + ",:work_description"
                    + ",:is_looking_for_work"
                    + ",:ofw_business_name"
                    + ",:ofw_business_address"
                    + ",:ofw_mailing_address"
                    + ",:ofw_type_of_business"
                    + ",:ofw_financial_assistance_amount"
                    + ",:ofw_country"
                    + ",:ofw_job"
                    + ",:ofw_reason_for_migration"
                    + ",:transient_no"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_employment_status.created_at)
                    .setString("updated_at", to_household_member_employment_status.updated_at)
                    .setString("created_by", to_household_member_employment_status.created_by)
                    .setString("updated_by", to_household_member_employment_status.updated_by)
                    .setString("region", to_household_member_employment_status.region)
                    .setString("region_id", to_household_member_employment_status.region_id)
                    .setString("province", to_household_member_employment_status.province)
                    .setString("province_id", to_household_member_employment_status.province_id)
                    .setString("city", to_household_member_employment_status.city)
                    .setString("city_id", to_household_member_employment_status.city_id)
                    .setString("barangay", to_household_member_employment_status.barangay)
                    .setString("barangay_id", to_household_member_employment_status.barangay_id)
                    .setString("purok", to_household_member_employment_status.purok)
                    .setString("purok_id", to_household_member_employment_status.purok_id)
                    .setNumber("status", to_household_member_employment_status.status)
                    .setString("house_no", to_household_member_employment_status.house_no)
                    .setString("household_no", to_household_member_employment_status.household_no)
                    .setString("household_member_no", to_household_member_employment_status.household_member_no)
                    .setString("fname", to_household_member_employment_status.fname)
                    .setString("mname", to_household_member_employment_status.mname)
                    .setString("lname", to_household_member_employment_status.lname)
                    .setString("sname", to_household_member_employment_status.sname)
                    .setNumber("employment_status", to_household_member_employment_status.employment_status)
                    .setString("employment_type", to_household_member_employment_status.employment_type)
                    .setString("unemployment_type", to_household_member_employment_status.unemployment_type)
                    .setString("company", to_household_member_employment_status.company)
                    .setString("work_position", to_household_member_employment_status.work_position)
                    .setString("work_description", to_household_member_employment_status.work_description)
                    .setNumber("is_looking_for_work", to_household_member_employment_status.is_looking_for_work)
                    .setString("ofw_business_name", to_household_member_employment_status.ofw_business_name)
                    .setString("ofw_business_address", to_household_member_employment_status.ofw_business_address)
                    .setString("ofw_mailing_address", to_household_member_employment_status.ofw_mailing_address)
                    .setString("ofw_type_of_business", to_household_member_employment_status.ofw_type_of_business)
                    .setNumber("ofw_financial_assistance_amount", to_household_member_employment_status.ofw_financial_assistance_amount)
                    .setString("ofw_country", to_household_member_employment_status.ofw_country)
                    .setString("ofw_job", to_household_member_employment_status.ofw_job)
                    .setString("ofw_reason_for_migration", to_household_member_employment_status.ofw_reason_for_migration)
                    .setString("transient_no", to_household_member_employment_status.transient_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_member_employment_status set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + ",status= :status "
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + ",fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",employment_status= :employment_status "
                    + ",employment_type= :employment_type "
                    + ",unemployment_type= :unemployment_type "
                    + ",company= :company "
                    + ",work_position= :work_position "
                    + ",work_description= :work_description "
                    + ",is_looking_for_work= :is_looking_for_work "
                    + ",ofw_business_name= :ofw_business_name "
                    + ",ofw_business_address= :ofw_business_address "
                    + ",ofw_mailing_address= :ofw_mailing_address "
                    + ",ofw_type_of_business= :ofw_type_of_business "
                    + ",ofw_financial_assistance_amount= :ofw_financial_assistance_amount "
                    + ",ofw_country= :ofw_country "
                    + ",ofw_job= :ofw_job "
                    + ",ofw_reason_for_migration= :ofw_reason_for_migration "
                    + ",is_uploaded= :is_uploaded"
                    + " where household_member_no='" + to_household_member_employment_status.household_member_no + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_member_employment_status.created_at)
                    .setString("updated_at", to_household_member_employment_status.updated_at)
                    .setString("created_by", to_household_member_employment_status.created_by)
                    .setString("updated_by", to_household_member_employment_status.updated_by)
                    .setString("region", to_household_member_employment_status.region)
                    .setString("region_id", to_household_member_employment_status.region_id)
                    .setString("province", to_household_member_employment_status.province)
                    .setString("province_id", to_household_member_employment_status.province_id)
                    .setString("city", to_household_member_employment_status.city)
                    .setString("city_id", to_household_member_employment_status.city_id)
                    .setString("barangay", to_household_member_employment_status.barangay)
                    .setString("barangay_id", to_household_member_employment_status.barangay_id)
                    .setString("purok", to_household_member_employment_status.purok)
                    .setString("purok_id", to_household_member_employment_status.purok_id)
                    .setNumber("status", to_household_member_employment_status.status)
                    .setString("house_no", to_household_member_employment_status.house_no)
                    .setString("household_no", to_household_member_employment_status.household_no)
                    .setString("household_member_no", to_household_member_employment_status.household_member_no)
                    .setString("fname", to_household_member_employment_status.fname)
                    .setString("mname", to_household_member_employment_status.mname)
                    .setString("lname", to_household_member_employment_status.lname)
                    .setString("sname", to_household_member_employment_status.sname)
                    .setNumber("employment_status", to_household_member_employment_status.employment_status)
                    .setString("employment_type", to_household_member_employment_status.employment_type)
                    .setString("unemployment_type", to_household_member_employment_status.unemployment_type)
                    .setString("company", to_household_member_employment_status.company)
                    .setString("work_position", to_household_member_employment_status.work_position)
                    .setString("work_description", to_household_member_employment_status.work_description)
                    .setNumber("is_looking_for_work", to_household_member_employment_status.is_looking_for_work)
                    .setString("ofw_business_name", to_household_member_employment_status.ofw_business_name)
                    .setString("ofw_business_address", to_household_member_employment_status.ofw_business_address)
                    .setString("ofw_mailing_address", to_household_member_employment_status.ofw_mailing_address)
                    .setString("ofw_type_of_business", to_household_member_employment_status.ofw_type_of_business)
                    .setNumber("ofw_financial_assistance_amount", to_household_member_employment_status.ofw_financial_assistance_amount)
                    .setString("ofw_country", to_household_member_employment_status.ofw_country)
                    .setString("ofw_job", to_household_member_employment_status.ofw_job)
                    .setString("ofw_reason_for_migration", to_household_member_employment_status.ofw_reason_for_migration)
                    .setNumber("is_uploaded", to_household_member_employment_status.is_uploaded)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_member_employment_status to_household_member_employment_status) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_member_employment_status  "
                    + " where id='" + to_household_member_employment_status.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_member_employment_status.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_member_employment_status> ret_data(String where) {
        List<to_household_member_employment_status> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",region"
                    + ",region_id"
                    + ",province"
                    + ",province_id"
                    + ",city"
                    + ",city_id"
                    + ",barangay"
                    + ",barangay_id"
                    + ",purok"
                    + ",purok_id"
                    + ",status"
                    + ",house_no"
                    + ",household_no"
                    + ",household_member_no"
                    + ",fname"
                    + ",mname"
                    + ",lname"
                    + ",sname"
                    + ",employment_status"
                    + ",employment_type"
                    + ",unemployment_type"
                    + ",company"
                    + ",work_position"
                    + ",work_description"
                    + ",is_looking_for_work"
                    + ",ofw_business_name"
                    + ",ofw_business_address"
                    + ",ofw_mailing_address"
                    + ",ofw_type_of_business"
                    + ",ofw_financial_assistance_amount"
                    + ",ofw_country"
                    + ",ofw_job"
                    + ",ofw_reason_for_migration"
                    + ",transient_no"
                    + ",is_uploaded"
                    + " from household_member_employment_status"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                created_at = created_at.replace(".0", "");
                String updated_at = rs.getString(3);
                updated_at = updated_at.replace(".0", "");
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                String region = rs.getString(6);
                String region_id = rs.getString(7);
                String province = rs.getString(8);
                String province_id = rs.getString(9);
                String city = rs.getString(10);
                String city_id = rs.getString(11);
                String barangay = rs.getString(12);
                String barangay_id = rs.getString(13);
                String purok = rs.getString(14);
                String purok_id = rs.getString(15);
                int status = rs.getInt(16);
                String house_no = rs.getString(17);
                String household_no = rs.getString(18);
                String household_member_no = rs.getString(19);
                String fname = rs.getString(20);
                String mname = rs.getString(21);
                String lname = rs.getString(22);
                String sname = rs.getString(23);
                int employment_status = rs.getInt(24);
                String employment_type = rs.getString(25);
                String unemployment_type = rs.getString(26);
                String company = rs.getString(27);
                String work_position = rs.getString(28);
                String work_description = rs.getString(29);
                int is_looking_for_work = rs.getInt(30);
                String ofw_business_name = rs.getString(31);
                String ofw_business_address = rs.getString(32);
                String ofw_mailing_address = rs.getString(33);
                String ofw_type_of_business = rs.getString(34);
                double ofw_financial_assistance_amount = rs.getDouble(35);
                String ofw_country = rs.getString(36);
                String ofw_job = rs.getString(37);
                String ofw_reason_for_migration = rs.getString(38);
                String transient_no = rs.getString(39);
                int is_uploaded = rs.getInt(40);
                to_household_member_employment_status to = new to_household_member_employment_status(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, household_no, household_member_no, fname, mname, lname, sname, employment_status, employment_type, unemployment_type, company, work_position, work_description, is_looking_for_work, ofw_business_name, ofw_business_address, ofw_mailing_address, ofw_type_of_business, ofw_financial_assistance_amount, ofw_country, ofw_job, ofw_reason_for_migration, transient_no);
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
