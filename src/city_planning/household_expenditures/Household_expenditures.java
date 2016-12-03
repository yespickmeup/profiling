/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.household_expenditures;

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
public class Household_expenditures {

    public static class to_household_expenditures {

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
        public final int status;
        public final String house_no;
        public final String household_no;
        public String expenditure_date;
        public double fuel_expenses;
        public double internet_services;
        public double medical_expenses;
        public double cigarretes;
        public double hobbies_clubs;
        public double load_expenses;
        public double electric_gas_expenses;
        public double books_newspapers_expenses;
        public double gambling;
        public double personal_care;
        public double misc;
        public double alcohol;
        public double vacation;
        public double water_bill;
        public double cable_services;
        public double social_obligations;

        public to_household_expenditures(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String expenditure_date, double fuel_expenses, double internet_services, double medical_expenses, double cigarretes, double hobbies_clubs, double load_expenses, double electric_gas_expenses, double books_newspapers_expenses, double gambling, double personal_care, double misc, double alcohol, double vacation, double water_bill, double cable_services, double social_obligations) {
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
            this.house_no = house_no;
            this.household_no = household_no;
            this.expenditure_date = expenditure_date;
            this.fuel_expenses = fuel_expenses;
            this.internet_services = internet_services;
            this.medical_expenses = medical_expenses;
            this.cigarretes = cigarretes;
            this.hobbies_clubs = hobbies_clubs;
            this.load_expenses = load_expenses;
            this.electric_gas_expenses = electric_gas_expenses;
            this.books_newspapers_expenses = books_newspapers_expenses;
            this.gambling = gambling;
            this.personal_care = personal_care;
            this.misc = misc;
            this.alcohol = alcohol;
            this.vacation = vacation;
            this.water_bill = water_bill;
            this.cable_services = cable_services;
            this.social_obligations = social_obligations;
        }

        public String getExpenditure_date() {
            return expenditure_date;
        }

        public void setExpenditure_date(String expenditure_date) {
            this.expenditure_date = expenditure_date;
        }

        public double getFuel_expenses() {
            return fuel_expenses;
        }

        public void setFuel_expenses(double fuel_expenses) {
            this.fuel_expenses = fuel_expenses;
        }

        public double getInternet_services() {
            return internet_services;
        }

        public void setInternet_services(double internet_services) {
            this.internet_services = internet_services;
        }

        public double getMedical_expenses() {
            return medical_expenses;
        }

        public void setMedical_expenses(double medical_expenses) {
            this.medical_expenses = medical_expenses;
        }

        public double getCigarretes() {
            return cigarretes;
        }

        public void setCigarretes(double cigarretes) {
            this.cigarretes = cigarretes;
        }

        public double getHobbies_clubs() {
            return hobbies_clubs;
        }

        public void setHobbies_clubs(double hobbies_clubs) {
            this.hobbies_clubs = hobbies_clubs;
        }

        public double getLoad_expenses() {
            return load_expenses;
        }

        public void setLoad_expenses(double load_expenses) {
            this.load_expenses = load_expenses;
        }

        public double getElectric_gas_expenses() {
            return electric_gas_expenses;
        }

        public void setElectric_gas_expenses(double electric_gas_expenses) {
            this.electric_gas_expenses = electric_gas_expenses;
        }

        public double getBooks_newspapers_expenses() {
            return books_newspapers_expenses;
        }

        public void setBooks_newspapers_expenses(double books_newspapers_expenses) {
            this.books_newspapers_expenses = books_newspapers_expenses;
        }

        public double getGambling() {
            return gambling;
        }

        public void setGambling(double gambling) {
            this.gambling = gambling;
        }

        public double getPersonal_care() {
            return personal_care;
        }

        public void setPersonal_care(double personal_care) {
            this.personal_care = personal_care;
        }

        public double getMisc() {
            return misc;
        }

        public void setMisc(double misc) {
            this.misc = misc;
        }

        public double getAlcohol() {
            return alcohol;
        }

        public void setAlcohol(double alcohol) {
            this.alcohol = alcohol;
        }

        public double getVacation() {
            return vacation;
        }

        public void setVacation(double vacation) {
            this.vacation = vacation;
        }

        public double getWater_bill() {
            return water_bill;
        }

        public void setWater_bill(double water_bill) {
            this.water_bill = water_bill;
        }

        public double getCable_services() {
            return cable_services;
        }

        public void setCable_services(double cable_services) {
            this.cable_services = cable_services;
        }

        public double getSocial_obligations() {
            return social_obligations;
        }

        public void setSocial_obligations(double social_obligations) {
            this.social_obligations = social_obligations;
        }

    }

    public static void add_data(to_household_expenditures to_household_expenditures) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_expenditures("
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
                    + ",expenditure_date"
                    + ",fuel_expenses"
                    + ",internet_services"
                    + ",medical_expenses"
                    + ",cigarretes"
                    + ",hobbies_clubs"
                    + ",load_expenses"
                    + ",electric_gas_expenses"
                    + ",books_newspapers_expenses"
                    + ",gambling"
                    + ",personal_care"
                    + ",misc"
                    + ",alcohol"
                    + ",vacation"
                    + ",water_bill"
                    + ",cable_services"
                    + ",social_obligations"
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
                    + ",:expenditure_date"
                    + ",:fuel_expenses"
                    + ",:internet_services"
                    + ",:medical_expenses"
                    + ",:cigarretes"
                    + ",:hobbies_clubs"
                    + ",:load_expenses"
                    + ",:electric_gas_expenses"
                    + ",:books_newspapers_expenses"
                    + ",:gambling"
                    + ",:personal_care"
                    + ",:misc"
                    + ",:alcohol"
                    + ",:vacation"
                    + ",:water_bill"
                    + ",:cable_services"
                    + ",:social_obligations"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_expenditures.created_at)
                    .setString("updated_at", to_household_expenditures.updated_at)
                    .setString("created_by", to_household_expenditures.created_by)
                    .setString("updated_by", to_household_expenditures.updated_by)
                    .setString("region", to_household_expenditures.region)
                    .setString("region_id", to_household_expenditures.region_id)
                    .setString("province", to_household_expenditures.province)
                    .setString("province_id", to_household_expenditures.province_id)
                    .setString("city", to_household_expenditures.city)
                    .setString("city_id", to_household_expenditures.city_id)
                    .setString("barangay", to_household_expenditures.barangay)
                    .setString("barangay_id", to_household_expenditures.barangay_id)
                    .setString("purok", to_household_expenditures.purok)
                    .setString("purok_id", to_household_expenditures.purok_id)
                    .setNumber("status", to_household_expenditures.status)
                    .setString("house_no", to_household_expenditures.house_no)
                    .setString("household_no", to_household_expenditures.household_no)
                    .setString("expenditure_date", to_household_expenditures.expenditure_date)
                    .setNumber("fuel_expenses", to_household_expenditures.fuel_expenses)
                    .setNumber("internet_services", to_household_expenditures.internet_services)
                    .setNumber("medical_expenses", to_household_expenditures.medical_expenses)
                    .setNumber("cigarretes", to_household_expenditures.cigarretes)
                    .setNumber("hobbies_clubs", to_household_expenditures.hobbies_clubs)
                    .setNumber("load_expenses", to_household_expenditures.load_expenses)
                    .setNumber("electric_gas_expenses", to_household_expenditures.electric_gas_expenses)
                    .setNumber("books_newspapers_expenses", to_household_expenditures.books_newspapers_expenses)
                    .setNumber("gambling", to_household_expenditures.gambling)
                    .setNumber("personal_care", to_household_expenditures.personal_care)
                    .setNumber("misc", to_household_expenditures.misc)
                    .setNumber("alcohol", to_household_expenditures.alcohol)
                    .setNumber("vacation", to_household_expenditures.vacation)
                    .setNumber("water_bill", to_household_expenditures.water_bill)
                    .setNumber("cable_services", to_household_expenditures.cable_services)
                    .setNumber("social_obligations", to_household_expenditures.social_obligations)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_expenditures.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_expenditures to_household_expenditures) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update household_expenditures set "
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
                    + ",expenditure_date= :expenditure_date "
                    + ",fuel_expenses= :fuel_expenses "
                    + ",internet_services= :internet_services "
                    + ",medical_expenses= :medical_expenses "
                    + ",cigarretes= :cigarretes "
                    + ",hobbies_clubs= :hobbies_clubs "
                    + ",load_expenses= :load_expenses "
                    + ",electric_gas_expenses= :electric_gas_expenses "
                    + ",books_newspapers_expenses= :books_newspapers_expenses "
                    + ",gambling= :gambling "
                    + ",personal_care= :personal_care "
                    + ",misc= :misc "
                    + ",alcohol= :alcohol "
                    + ",vacation= :vacation "
                    + ",water_bill= :water_bill "
                    + ",cable_services= :cable_services "
                    + ",social_obligations= :social_obligations "
                    + " where id='" + to_household_expenditures.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_expenditures.created_at)
                    .setString("updated_at", to_household_expenditures.updated_at)
                    .setString("created_by", to_household_expenditures.created_by)
                    .setString("updated_by", to_household_expenditures.updated_by)
                    .setString("region", to_household_expenditures.region)
                    .setString("region_id", to_household_expenditures.region_id)
                    .setString("province", to_household_expenditures.province)
                    .setString("province_id", to_household_expenditures.province_id)
                    .setString("city", to_household_expenditures.city)
                    .setString("city_id", to_household_expenditures.city_id)
                    .setString("barangay", to_household_expenditures.barangay)
                    .setString("barangay_id", to_household_expenditures.barangay_id)
                    .setString("purok", to_household_expenditures.purok)
                    .setString("purok_id", to_household_expenditures.purok_id)
                    .setNumber("status", to_household_expenditures.status)
                    .setString("house_no", to_household_expenditures.house_no)
                    .setString("household_no", to_household_expenditures.household_no)
                    .setString("expenditure_date", to_household_expenditures.expenditure_date)
                    .setNumber("fuel_expenses", to_household_expenditures.fuel_expenses)
                    .setNumber("internet_services", to_household_expenditures.internet_services)
                    .setNumber("medical_expenses", to_household_expenditures.medical_expenses)
                    .setNumber("cigarretes", to_household_expenditures.cigarretes)
                    .setNumber("hobbies_clubs", to_household_expenditures.hobbies_clubs)
                    .setNumber("load_expenses", to_household_expenditures.load_expenses)
                    .setNumber("electric_gas_expenses", to_household_expenditures.electric_gas_expenses)
                    .setNumber("books_newspapers_expenses", to_household_expenditures.books_newspapers_expenses)
                    .setNumber("gambling", to_household_expenditures.gambling)
                    .setNumber("personal_care", to_household_expenditures.personal_care)
                    .setNumber("misc", to_household_expenditures.misc)
                    .setNumber("alcohol", to_household_expenditures.alcohol)
                    .setNumber("vacation", to_household_expenditures.vacation)
                    .setNumber("water_bill", to_household_expenditures.water_bill)
                    .setNumber("cable_services", to_household_expenditures.cable_services)
                    .setNumber("social_obligations", to_household_expenditures.social_obligations)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_expenditures.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_expenditures to_household_expenditures) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from household_expenditures  "
                    + " where id='" + to_household_expenditures.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_expenditures.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_household_expenditures> ret_data(String where) {
        List<to_household_expenditures> datas = new ArrayList();

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
                    + ",expenditure_date"
                    + ",fuel_expenses"
                    + ",internet_services"
                    + ",medical_expenses"
                    + ",cigarretes"
                    + ",hobbies_clubs"
                    + ",load_expenses"
                    + ",electric_gas_expenses"
                    + ",books_newspapers_expenses"
                    + ",gambling"
                    + ",personal_care"
                    + ",misc"
                    + ",alcohol"
                    + ",vacation"
                    + ",water_bill"
                    + ",cable_services"
                    + ",social_obligations"
                    + " from household_expenditures"
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
                String expenditure_date = rs.getString(19);
                double fuel_expenses = rs.getDouble(20);
                double internet_services = rs.getDouble(21);
                double medical_expenses = rs.getDouble(22);
                double cigarretes = rs.getDouble(23);
                double hobbies_clubs = rs.getDouble(24);
                double load_expenses = rs.getDouble(25);
                double electric_gas_expenses = rs.getDouble(26);
                double books_newspapers_expenses = rs.getDouble(27);
                double gambling = rs.getDouble(28);
                double personal_care = rs.getDouble(29);
                double misc = rs.getDouble(30);
                double alcohol = rs.getDouble(31);
                double vacation = rs.getDouble(32);
                double water_bill = rs.getDouble(33);
                double cable_services = rs.getDouble(34);
                double social_obligations = rs.getDouble(35);

                to_household_expenditures to = new to_household_expenditures(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, expenditure_date, fuel_expenses, internet_services, medical_expenses, cigarretes, hobbies_clubs, load_expenses, electric_gas_expenses, books_newspapers_expenses, gambling, personal_care, misc, alcohol, vacation, water_bill, cable_services, social_obligations);
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
