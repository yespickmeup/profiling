/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.households;

import city_planning.household_assets.Household_assets;
import city_planning.household_consumptions.Household_consumptions;
import city_planning.household_expenditures.Household_expenditures;
import city_planning.household_member_competence_certificates.Household_member_competence_certificates;
import city_planning.household_member_educational_backgrounds.Household_member_educational_backgrounds;
import city_planning.household_member_employment_status.Household_member_employment_status;
import city_planning.household_member_health_statuses.Household_member_health_statuses;
import city_planning.household_member_licences.Household_member_licences;
import city_planning.household_member_medications.Household_member_medications;
import city_planning.household_member_prefered_works.Household_member_prefered_works;
import city_planning.household_member_skills.Household_member_skills;
import city_planning.household_member_vocational_experiences.Household_member_vocational_experiences;
import city_planning.household_member_work_experiences.Household_member_work_experiences;
import city_planning.household_members.Household_members;
import city_planning.houses.Houses;
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
public class Households {

    public static class to_households {

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
        public String occupancy_types;
        public String tenure;
        public int is_occupant_owns_the_land;
        public int is_occupant_owns_the_bldg;
        public double monthly_rental;
        public String drainage_system_concern;
        public String street_maintenance_concern;
        public String garbage_collection_concern;
        public String fire_protection_concern;
        public String police_protection_concern;
        public String ambulance_service_concern;
        public String livelihood_programs_concern;
        public String adolescent_pregnancy_rate;
        public String child_abuse_rating;
        public String crime_rating;
        public String domestic_violence_rating;
        public String drug_abuse_rating;
        public String hunger_rating;
        public String environmental_contamination_rating;
        public String health_disparities_rating;
        public List<Household_assets.to_household_assets> assets;
        public List<Household_expenditures.to_household_expenditures> household_expenditures;
        public List<Household_consumptions.to_household_consumptions> household_consumptions;
        public List<Household_members.to_household_members> household_members;
        public int no_of_household_members;

        public to_households(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String occupancy_types, String tenure, int is_occupant_owns_the_land, int is_occupant_owns_the_bldg, double monthly_rental, String drainage_system_concern, String street_maintenance_concern, String garbage_collection_concern, String fire_protection_concern, String police_protection_concern, String ambulance_service_concern, String livelihood_programs_concern, String adolescent_pregnancy_rate, String child_abuse_rating, String crime_rating, String domestic_violence_rating, String drug_abuse_rating, String hunger_rating, String environmental_contamination_rating, String health_disparities_rating, List<Household_assets.to_household_assets> assets, List<Household_expenditures.to_household_expenditures> household_expenditures, List<Household_consumptions.to_household_consumptions> household_consumptions, List<Household_members.to_household_members> household_members, int no_of_household_members) {
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
            this.occupancy_types = occupancy_types;
            this.tenure = tenure;
            this.is_occupant_owns_the_land = is_occupant_owns_the_land;
            this.is_occupant_owns_the_bldg = is_occupant_owns_the_bldg;
            this.monthly_rental = monthly_rental;
            this.drainage_system_concern = drainage_system_concern;
            this.street_maintenance_concern = street_maintenance_concern;
            this.garbage_collection_concern = garbage_collection_concern;
            this.fire_protection_concern = fire_protection_concern;
            this.police_protection_concern = police_protection_concern;
            this.ambulance_service_concern = ambulance_service_concern;
            this.livelihood_programs_concern = livelihood_programs_concern;
            this.adolescent_pregnancy_rate = adolescent_pregnancy_rate;
            this.child_abuse_rating = child_abuse_rating;
            this.crime_rating = crime_rating;
            this.domestic_violence_rating = domestic_violence_rating;
            this.drug_abuse_rating = drug_abuse_rating;
            this.hunger_rating = hunger_rating;
            this.environmental_contamination_rating = environmental_contamination_rating;
            this.health_disparities_rating = health_disparities_rating;
            this.assets = assets;
            this.household_expenditures = household_expenditures;
            this.household_consumptions = household_consumptions;
            this.household_members = household_members;
            this.no_of_household_members = no_of_household_members;
        }

        public String getOccupancy_types() {
            return occupancy_types;
        }

        public void setOccupancy_types(String occupancy_types) {
            this.occupancy_types = occupancy_types;
        }

        public String getTenure() {
            return tenure;
        }

        public void setTenure(String tenure) {
            this.tenure = tenure;
        }

        public int getIs_occupant_owns_the_land() {
            return is_occupant_owns_the_land;
        }

        public void setIs_occupant_owns_the_land(int is_occupant_owns_the_land) {
            this.is_occupant_owns_the_land = is_occupant_owns_the_land;
        }

        public int getIs_occupant_owns_the_bldg() {
            return is_occupant_owns_the_bldg;
        }

        public void setIs_occupant_owns_the_bldg(int is_occupant_owns_the_bldg) {
            this.is_occupant_owns_the_bldg = is_occupant_owns_the_bldg;
        }

        public double getMonthly_rental() {
            return monthly_rental;
        }

        public void setMonthly_rental(double monthly_rental) {
            this.monthly_rental = monthly_rental;
        }

        public String getDrainage_system_concern() {
            return drainage_system_concern;
        }

        public void setDrainage_system_concern(String drainage_system_concern) {
            this.drainage_system_concern = drainage_system_concern;
        }

        public String getStreet_maintenance_concern() {
            return street_maintenance_concern;
        }

        public void setStreet_maintenance_concern(String street_maintenance_concern) {
            this.street_maintenance_concern = street_maintenance_concern;
        }

        public String getGarbage_collection_concern() {
            return garbage_collection_concern;
        }

        public void setGarbage_collection_concern(String garbage_collection_concern) {
            this.garbage_collection_concern = garbage_collection_concern;
        }

        public String getFire_protection_concern() {
            return fire_protection_concern;
        }

        public void setFire_protection_concern(String fire_protection_concern) {
            this.fire_protection_concern = fire_protection_concern;
        }

        public String getPolice_protection_concern() {
            return police_protection_concern;
        }

        public void setPolice_protection_concern(String police_protection_concern) {
            this.police_protection_concern = police_protection_concern;
        }

        public String getAmbulance_service_concern() {
            return ambulance_service_concern;
        }

        public void setAmbulance_service_concern(String ambulance_service_concern) {
            this.ambulance_service_concern = ambulance_service_concern;
        }

        public String getLivelihood_programs_concern() {
            return livelihood_programs_concern;
        }

        public void setLivelihood_programs_concern(String livelihood_programs_concern) {
            this.livelihood_programs_concern = livelihood_programs_concern;
        }

        public String getAdolescent_pregnancy_rate() {
            return adolescent_pregnancy_rate;
        }

        public void setAdolescent_pregnancy_rate(String adolescent_pregnancy_rate) {
            this.adolescent_pregnancy_rate = adolescent_pregnancy_rate;
        }

        public String getChild_abuse_rating() {
            return child_abuse_rating;
        }

        public void setChild_abuse_rating(String child_abuse_rating) {
            this.child_abuse_rating = child_abuse_rating;
        }

        public String getCrime_rating() {
            return crime_rating;
        }

        public void setCrime_rating(String crime_rating) {
            this.crime_rating = crime_rating;
        }

        public String getDomestic_violence_rating() {
            return domestic_violence_rating;
        }

        public void setDomestic_violence_rating(String domestic_violence_rating) {
            this.domestic_violence_rating = domestic_violence_rating;
        }

        public String getDrug_abuse_rating() {
            return drug_abuse_rating;
        }

        public void setDrug_abuse_rating(String drug_abuse_rating) {
            this.drug_abuse_rating = drug_abuse_rating;
        }

        public String getHunger_rating() {
            return hunger_rating;
        }

        public void setHunger_rating(String hunger_rating) {
            this.hunger_rating = hunger_rating;
        }

        public String getEnvironmental_contamination_rating() {
            return environmental_contamination_rating;
        }

        public void setEnvironmental_contamination_rating(String environmental_contamination_rating) {
            this.environmental_contamination_rating = environmental_contamination_rating;
        }

        public String getHealth_disparities_rating() {
            return health_disparities_rating;
        }

        public void setHealth_disparities_rating(String health_disparities_rating) {
            this.health_disparities_rating = health_disparities_rating;
        }

        public List<Household_assets.to_household_assets> getAssets() {
            return assets;
        }

        public void setAssets(List<Household_assets.to_household_assets> assets) {
            this.assets = assets;
        }

        public List<Household_expenditures.to_household_expenditures> getHousehold_expenditures() {
            return household_expenditures;
        }

        public void setHousehold_expenditures(List<Household_expenditures.to_household_expenditures> household_expenditures) {
            this.household_expenditures = household_expenditures;
        }

        public List<Household_consumptions.to_household_consumptions> getHousehold_consumptions() {
            return household_consumptions;
        }

        public void setHousehold_consumptions(List<Household_consumptions.to_household_consumptions> household_consumptions) {
            this.household_consumptions = household_consumptions;
        }

        public List<Household_members.to_household_members> getHousehold_members() {
            return household_members;
        }

        public void setHousehold_members(List<Household_members.to_household_members> household_members) {
            this.household_members = household_members;
        }

    }

    public static void add_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            //<editor-fold defaultstate="collapsed" desc=" insert households ">
            String hh = "insert into households("
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
                    + ",occupancy_types"
                    + ",tenure"
                    + ",is_occupant_owns_the_land"
                    + ",is_occupant_owns_the_bldg"
                    + ",monthly_rental"
                    + ",drainage_system_concern"
                    + ",street_maintenance_concern"
                    + ",garbage_collection_concern"
                    + ",fire_protection_concern"
                    + ",police_protection_concern"
                    + ",ambulance_service_concern"
                    + ",livelihood_programs_concern"
                    + ",adolescent_pregnancy_rate"
                    + ",child_abuse_rating"
                    + ",crime_rating"
                    + ",domestic_violence_rating"
                    + ",drug_abuse_rating"
                    + ",hunger_rating"
                    + ",environmental_contamination_rating"
                    + ",health_disparities_rating"
                    + ",no_of_household_members"
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
                    + ",:occupancy_types"
                    + ",:tenure"
                    + ",:is_occupant_owns_the_land"
                    + ",:is_occupant_owns_the_bldg"
                    + ",:monthly_rental"
                    + ",:drainage_system_concern"
                    + ",:street_maintenance_concern"
                    + ",:garbage_collection_concern"
                    + ",:fire_protection_concern"
                    + ",:police_protection_concern"
                    + ",:ambulance_service_concern"
                    + ",:livelihood_programs_concern"
                    + ",:adolescent_pregnancy_rate"
                    + ",:child_abuse_rating"
                    + ",:crime_rating"
                    + ",:domestic_violence_rating"
                    + ",:drug_abuse_rating"
                    + ",:hunger_rating"
                    + ",:environmental_contamination_rating"
                    + ",:health_disparities_rating"
                    + ",:no_of_household_members"
                    + ")";

            hh = SqlStringUtil.parse(hh)
                    .setString("created_at", to_households.created_at)
                    .setString("updated_at", to_households.updated_at)
                    .setString("created_by", to_households.created_by)
                    .setString("updated_by", to_households.updated_by)
                    .setString("region", to_households.region)
                    .setString("region_id", to_households.region_id)
                    .setString("province", to_households.province)
                    .setString("province_id", to_households.province_id)
                    .setString("city", to_households.city)
                    .setString("city_id", to_households.city_id)
                    .setString("barangay", to_households.barangay)
                    .setString("barangay_id", to_households.barangay_id)
                    .setString("purok", to_households.purok)
                    .setString("purok_id", to_households.purok_id)
                    .setNumber("status", to_households.status)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("occupancy_types", to_households.occupancy_types)
                    .setString("tenure", to_households.tenure)
                    .setNumber("is_occupant_owns_the_land", to_households.is_occupant_owns_the_land)
                    .setNumber("is_occupant_owns_the_bldg", to_households.is_occupant_owns_the_bldg)
                    .setNumber("monthly_rental", to_households.monthly_rental)
                    .setString("drainage_system_concern", to_households.drainage_system_concern)
                    .setString("street_maintenance_concern", to_households.street_maintenance_concern)
                    .setString("garbage_collection_concern", to_households.garbage_collection_concern)
                    .setString("fire_protection_concern", to_households.fire_protection_concern)
                    .setString("police_protection_concern", to_households.police_protection_concern)
                    .setString("ambulance_service_concern", to_households.ambulance_service_concern)
                    .setString("livelihood_programs_concern", to_households.livelihood_programs_concern)
                    .setString("adolescent_pregnancy_rate", to_households.adolescent_pregnancy_rate)
                    .setString("child_abuse_rating", to_households.child_abuse_rating)
                    .setString("crime_rating", to_households.crime_rating)
                    .setString("domestic_violence_rating", to_households.domestic_violence_rating)
                    .setString("drug_abuse_rating", to_households.drug_abuse_rating)
                    .setString("hunger_rating", to_households.hunger_rating)
                    .setString("environmental_contamination_rating", to_households.environmental_contamination_rating)
                    .setString("health_disparities_rating", to_households.health_disparities_rating)
                    .setNumber("no_of_household_members", to_households.no_of_household_members)
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(hh);
            stmt.addBatch(hh);

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" insert household assets ">
            List<Household_assets.to_household_assets> assets = to_households.assets;
            for (Household_assets.to_household_assets household_asset : assets) {
                String ha = "insert into household_assets("
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
                        + ",qty"
                        + ",assets"
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
                        + ",:qty"
                        + ",:assets"
                        + ")";

                ha = SqlStringUtil.parse(ha)
                        .setString("created_at", to_households.created_at)
                        .setString("updated_at", to_households.updated_at)
                        .setString("created_by", to_households.created_by)
                        .setString("updated_by", to_households.updated_by)
                        .setString("region", to_households.region)
                        .setString("region_id", to_households.region_id)
                        .setString("province", to_households.province)
                        .setString("province_id", to_households.province_id)
                        .setString("city", to_households.city)
                        .setString("city_id", to_households.city_id)
                        .setString("barangay", to_households.barangay)
                        .setString("barangay_id", to_households.barangay_id)
                        .setString("purok", to_households.purok)
                        .setString("purok_id", to_households.purok_id)
                        .setNumber("status", to_households.status)
                        .setString("house_no", to_households.house_no)
                        .setString("household_no", household_asset.household_no)
                        .setNumber("qty", household_asset.qty)
                        .setString("assets", household_asset.assets)
                        .ok();
                stmt.addBatch(ha);
            }

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" insert household expenditures ">
            List<Household_expenditures.to_household_expenditures> household_expenditures = to_households.household_expenditures;
            for (Household_expenditures.to_household_expenditures household_expenditure : household_expenditures) {
                String he = "insert into household_expenditures("
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

                he = SqlStringUtil.parse(he)
                        .setString("created_at", to_households.created_at)
                        .setString("updated_at", to_households.updated_at)
                        .setString("created_by", to_households.created_by)
                        .setString("updated_by", to_households.updated_by)
                        .setString("region", to_households.region)
                        .setString("region_id", to_households.region_id)
                        .setString("province", to_households.province)
                        .setString("province_id", to_households.province_id)
                        .setString("city", to_households.city)
                        .setString("city_id", to_households.city_id)
                        .setString("barangay", to_households.barangay)
                        .setString("barangay_id", to_households.barangay_id)
                        .setString("purok", to_households.purok)
                        .setString("purok_id", to_households.purok_id)
                        .setNumber("status", to_households.status)
                        .setString("house_no", to_households.house_no)
                        .setString("household_no", household_expenditure.household_no)
                        .setString("expenditure_date", household_expenditure.expenditure_date)
                        .setNumber("fuel_expenses", household_expenditure.fuel_expenses)
                        .setNumber("internet_services", household_expenditure.internet_services)
                        .setNumber("medical_expenses", household_expenditure.medical_expenses)
                        .setNumber("cigarretes", household_expenditure.cigarretes)
                        .setNumber("hobbies_clubs", household_expenditure.hobbies_clubs)
                        .setNumber("load_expenses", household_expenditure.load_expenses)
                        .setNumber("electric_gas_expenses", household_expenditure.electric_gas_expenses)
                        .setNumber("books_newspapers_expenses", household_expenditure.books_newspapers_expenses)
                        .setNumber("gambling", household_expenditure.gambling)
                        .setNumber("personal_care", household_expenditure.personal_care)
                        .setNumber("misc", household_expenditure.misc)
                        .setNumber("alcohol", household_expenditure.alcohol)
                        .setNumber("vacation", household_expenditure.vacation)
                        .setNumber("water_bill", household_expenditure.water_bill)
                        .setNumber("cable_services", household_expenditure.cable_services)
                        .setNumber("social_obligations", household_expenditure.social_obligations)
                        .ok();
                stmt.addBatch(he);
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" insert household consumptions ">
            List<Household_consumptions.to_household_consumptions> household_consumptions = to_households.household_consumptions;
            for (Household_consumptions.to_household_consumptions household_consumption : household_consumptions) {
                String hc = "insert into household_consumptions("
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
                        + ",consumption_date"
                        + ",items"
                        + ",amount"
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
                        + ",:consumption_date"
                        + ",:items"
                        + ",:amount"
                        + ")";

                hc = SqlStringUtil.parse(hc)
                        .setString("created_at", to_households.created_at)
                        .setString("updated_at", to_households.updated_at)
                        .setString("created_by", to_households.created_by)
                        .setString("updated_by", to_households.updated_by)
                        .setString("region", to_households.region)
                        .setString("region_id", to_households.region_id)
                        .setString("province", to_households.province)
                        .setString("province_id", to_households.province_id)
                        .setString("city", to_households.city)
                        .setString("city_id", to_households.city_id)
                        .setString("barangay", to_households.barangay)
                        .setString("barangay_id", to_households.barangay_id)
                        .setString("purok", to_households.purok)
                        .setString("purok_id", to_households.purok_id)
                        .setNumber("status", to_households.status)
                        .setString("house_no", to_households.house_no)
                        .setString("household_no", household_consumption.household_no)
                        .setString("consumption_date", household_consumption.consumption_date)
                        .setString("items", household_consumption.items)
                        .setNumber("amount", household_consumption.amount)
                        .ok();
                stmt.addBatch(hc);
            }
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc=" update household count ">
            int count = 0;
            String h2 = "select count(id) from households where house_no='" + to_households.house_no + "' ";
            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery(h2);
            if (rs2.next()) {
                count = rs2.getInt(1);
            }
            count++;
            String h3 = "update houses set no_of_households = '" + count + "' where house_no='" + to_households.house_no + "' ";
            stmt.addBatch(h3);
            //</editor-fold>

            Lg.s(Houses.class, "Successfully Added");
            stmt.executeBatch();
            conn.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update households set "
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
                    + ",occupancy_types= :occupancy_types "
                    + ",tenure= :tenure "
                    + ",is_occupant_owns_the_land= :is_occupant_owns_the_land "
                    + ",is_occupant_owns_the_bldg= :is_occupant_owns_the_bldg "
                    + ",monthly_rental= :monthly_rental "
                    + ",drainage_system_concern= :drainage_system_concern "
                    + ",street_maintenance_concern= :street_maintenance_concern "
                    + ",garbage_collection_concern= :garbage_collection_concern "
                    + ",fire_protection_concern= :fire_protection_concern "
                    + ",police_protection_concern= :police_protection_concern "
                    + ",ambulance_service_concern= :ambulance_service_concern "
                    + ",livelihood_programs_concern= :livelihood_programs_concern "
                    + ",adolescent_pregnancy_rate= :adolescent_pregnancy_rate "
                    + ",child_abuse_rating= :child_abuse_rating "
                    + ",crime_rating= :crime_rating "
                    + ",domestic_violence_rating= :domestic_violence_rating "
                    + ",drug_abuse_rating= :drug_abuse_rating "
                    + ",hunger_rating= :hunger_rating "
                    + ",environmental_contamination_rating= :environmental_contamination_rating "
                    + ",health_disparities_rating= :health_disparities_rating "
                    + " where household_no='" + to_households.household_no + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_households.created_at)
                    .setString("updated_at", to_households.updated_at)
                    .setString("created_by", to_households.created_by)
                    .setString("updated_by", to_households.updated_by)
                    .setString("region", to_households.region)
                    .setString("region_id", to_households.region_id)
                    .setString("province", to_households.province)
                    .setString("province_id", to_households.province_id)
                    .setString("city", to_households.city)
                    .setString("city_id", to_households.city_id)
                    .setString("barangay", to_households.barangay)
                    .setString("barangay_id", to_households.barangay_id)
                    .setString("purok", to_households.purok)
                    .setString("purok_id", to_households.purok_id)
                    .setNumber("status", to_households.status)
                    .setString("house_no", to_households.house_no)
                    .setString("household_no", to_households.household_no)
                    .setString("occupancy_types", to_households.occupancy_types)
                    .setString("tenure", to_households.tenure)
                    .setNumber("is_occupant_owns_the_land", to_households.is_occupant_owns_the_land)
                    .setNumber("is_occupant_owns_the_bldg", to_households.is_occupant_owns_the_bldg)
                    .setNumber("monthly_rental", to_households.monthly_rental)
                    .setString("drainage_system_concern", to_households.drainage_system_concern)
                    .setString("street_maintenance_concern", to_households.street_maintenance_concern)
                    .setString("garbage_collection_concern", to_households.garbage_collection_concern)
                    .setString("fire_protection_concern", to_households.fire_protection_concern)
                    .setString("police_protection_concern", to_households.police_protection_concern)
                    .setString("ambulance_service_concern", to_households.ambulance_service_concern)
                    .setString("livelihood_programs_concern", to_households.livelihood_programs_concern)
                    .setString("adolescent_pregnancy_rate", to_households.adolescent_pregnancy_rate)
                    .setString("child_abuse_rating", to_households.child_abuse_rating)
                    .setString("crime_rating", to_households.crime_rating)
                    .setString("domestic_violence_rating", to_households.domestic_violence_rating)
                    .setString("drug_abuse_rating", to_households.drug_abuse_rating)
                    .setString("hunger_rating", to_households.hunger_rating)
                    .setString("environmental_contamination_rating", to_households.environmental_contamination_rating)
                    .setString("health_disparities_rating", to_households.health_disparities_rating)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Households.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_households to_households) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            String stmt2 = "delete from household_assets where house_no='" + to_households.house_no + "' ";
            String stmt3 = "delete from household_consumptions where house_no='" + to_households.house_no + "' ";
            String stmt4 = "delete from household_expenditures where house_no='" + to_households.house_no + "' ";
            String stmt17 = "delete from households where house_no='" + to_households.house_no + "' ";
            PreparedStatement stmt = conn.prepareStatement(stmt2);
            stmt.addBatch(stmt2);
            stmt.addBatch(stmt2);
            stmt.addBatch(stmt3);
            stmt.addBatch(stmt4);
            stmt.addBatch(stmt17);

            //<editor-fold defaultstate="collapsed" desc=" update household count ">
            int count = 0;
            String h2 = "select count(id) from households where house_no='" + to_households.house_no + "' ";
            Statement stmtt = conn.createStatement();
            ResultSet rs2 = stmtt.executeQuery(h2);
            if (rs2.next()) {
                count = rs2.getInt(1);
            }
            count--;
            String h3 = "update houses set no_of_households = '" + count + "' where house_no='" + to_households.house_no + "' ";
            stmt.addBatch(h3);
            //</editor-fold>

            stmt.executeBatch();
            conn.commit();
            Lg.s(Household_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_households> ret_data(String where) {
        List<to_households> datas = new ArrayList();
        List<Household_assets.to_household_assets> assets = new ArrayList();
        List<Household_expenditures.to_household_expenditures> household_expenditures = new ArrayList();
        List<Household_consumptions.to_household_consumptions> household_consumptions = new ArrayList();
        List<Household_members.to_household_members> household_members = new ArrayList();
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
                    + ",occupancy_types"
                    + ",tenure"
                    + ",is_occupant_owns_the_land"
                    + ",is_occupant_owns_the_bldg"
                    + ",monthly_rental"
                    + ",drainage_system_concern"
                    + ",street_maintenance_concern"
                    + ",garbage_collection_concern"
                    + ",fire_protection_concern"
                    + ",police_protection_concern"
                    + ",ambulance_service_concern"
                    + ",livelihood_programs_concern"
                    + ",adolescent_pregnancy_rate"
                    + ",child_abuse_rating"
                    + ",crime_rating"
                    + ",domestic_violence_rating"
                    + ",drug_abuse_rating"
                    + ",hunger_rating"
                    + ",environmental_contamination_rating"
                    + ",health_disparities_rating"
                    + ",no_of_household_members"
                    + " from households"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
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
                String occupancy_types = rs.getString(19);
                String tenure = rs.getString(20);
                int is_occupant_owns_the_land = rs.getInt(21);
                int is_occupant_owns_the_bldg = rs.getInt(22);
                double monthly_rental = rs.getDouble(23);
                String drainage_system_concern = rs.getString(24);
                String street_maintenance_concern = rs.getString(25);
                String garbage_collection_concern = rs.getString(26);
                String fire_protection_concern = rs.getString(27);
                String police_protection_concern = rs.getString(28);
                String ambulance_service_concern = rs.getString(29);
                String livelihood_programs_concern = rs.getString(30);
                String adolescent_pregnancy_rate = rs.getString(31);
                String child_abuse_rating = rs.getString(32);
                String crime_rating = rs.getString(33);
                String domestic_violence_rating = rs.getString(34);
                String drug_abuse_rating = rs.getString(35);
                String hunger_rating = rs.getString(36);
                String environmental_contamination_rating = rs.getString(37);
                String health_disparities_rating = rs.getString(38);
                int no_of_household_members=rs.getInt(39);
                to_households to = new to_households(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, occupancy_types, tenure, is_occupant_owns_the_land, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating, assets, household_expenditures, household_consumptions, household_members,no_of_household_members);
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
