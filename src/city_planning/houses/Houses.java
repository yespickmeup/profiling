/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.houses;

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
import city_planning.households.Households;
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
public class Houses {

    public static class to_houses {

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
        public final int no_of_rooms;
        public final String bldg_types;
        public final String bldg_permit;
        public final String toilet_types;
        public final String compartments;
        public final String bathroom_types;
        public final String waste_disposal_methods;
        public final String kitchen_types;
        public final String trans_types;
        public final String construction_roof_types;
        public final String construction_wall_types;
        public final String construction_floor_types;
        public final String construction_communication_types;
        public final String lighting_fuels;
        public final String cooking_fuels;
        public final String water_sources;
        public final double drinking_water_source_distance;
        public final double nearest_water_source_distance;
        public List<Households.to_households> households;

        public to_houses(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, int no_of_rooms, String bldg_types, String bldg_permit, String toilet_types, String compartments, String bathroom_types, String waste_disposal_methods, String kitchen_types, String trans_types, String construction_roof_types, String construction_wall_types, String construction_floor_types, String construction_communication_types, String lighting_fuels, String cooking_fuels, String water_sources, double drinking_water_source_distance, double nearest_water_source_distance, List<Households.to_households> households) {
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
            this.no_of_rooms = no_of_rooms;
            this.bldg_types = bldg_types;
            this.bldg_permit = bldg_permit;
            this.toilet_types = toilet_types;
            this.compartments = compartments;
            this.bathroom_types = bathroom_types;
            this.waste_disposal_methods = waste_disposal_methods;
            this.kitchen_types = kitchen_types;
            this.trans_types = trans_types;
            this.construction_roof_types = construction_roof_types;
            this.construction_wall_types = construction_wall_types;
            this.construction_floor_types = construction_floor_types;
            this.construction_communication_types = construction_communication_types;
            this.lighting_fuels = lighting_fuels;
            this.cooking_fuels = cooking_fuels;
            this.water_sources = water_sources;
            this.drinking_water_source_distance = drinking_water_source_distance;
            this.nearest_water_source_distance = nearest_water_source_distance;
            this.households = households;
        }

        public List<Households.to_households> getHouseholds() {
            return households;
        }

        public void setHouseholds(List<Households.to_households> households) {
            this.households = households;
        }

    }

    public static void add_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            //<editor-fold defaultstate="collapsed" desc=" insert house ">
            String h = "insert into houses("
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
                    + ",no_of_rooms"
                    + ",bldg_types"
                    + ",bldg_permit"
                    + ",toilet_types"
                    + ",compartments"
                    + ",bathroom_types"
                    + ",waste_disposal_methods"
                    + ",kitchen_types"
                    + ",trans_types"
                    + ",construction_roof_types"
                    + ",construction_wall_types"
                    + ",construction_floor_types"
                    + ",construction_communication_types"
                    + ",lighting_fuels"
                    + ",cooking_fuels"
                    + ",water_sources"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
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
                    + ",:no_of_rooms"
                    + ",:bldg_types"
                    + ",:bldg_permit"
                    + ",:toilet_types"
                    + ",:compartments"
                    + ",:bathroom_types"
                    + ",:waste_disposal_methods"
                    + ",:kitchen_types"
                    + ",:trans_types"
                    + ",:construction_roof_types"
                    + ",:construction_wall_types"
                    + ",:construction_floor_types"
                    + ",:construction_communication_types"
                    + ",:lighting_fuels"
                    + ",:cooking_fuels"
                    + ",:water_sources"
                    + ",:drinking_water_source_distance"
                    + ",:nearest_water_source_distance"
                    + ")";

            h = SqlStringUtil.parse(h)
                    .setString("created_at", to_houses.created_at)
                    .setString("updated_at", to_houses.updated_at)
                    .setString("created_by", to_houses.created_by)
                    .setString("updated_by", to_houses.updated_by)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .setNumber("status", to_houses.status)
                    .setString("house_no", to_houses.house_no)
                    .setNumber("no_of_rooms", to_houses.no_of_rooms)
                    .setString("bldg_types", to_houses.bldg_types)
                    .setString("bldg_permit", to_houses.bldg_permit)
                    .setString("toilet_types", to_houses.toilet_types)
                    .setString("compartments", to_houses.compartments)
                    .setString("bathroom_types", to_houses.bathroom_types)
                    .setString("waste_disposal_methods", to_houses.waste_disposal_methods)
                    .setString("kitchen_types", to_houses.kitchen_types)
                    .setString("trans_types", to_houses.trans_types)
                    .setString("construction_roof_types", to_houses.construction_roof_types)
                    .setString("construction_wall_types", to_houses.construction_wall_types)
                    .setString("construction_floor_types", to_houses.construction_floor_types)
                    .setString("construction_communication_types", to_houses.construction_communication_types)
                    .setString("lighting_fuels", to_houses.lighting_fuels)
                    .setString("cooking_fuels", to_houses.cooking_fuels)
                    .setString("water_sources", to_houses.water_sources)
                    .setNumber("drinking_water_source_distance", to_houses.drinking_water_source_distance)
                    .setNumber("nearest_water_source_distance", to_houses.nearest_water_source_distance)
                    .ok();

            //</editor-fold>
            PreparedStatement stmt = conn.prepareStatement(h);
            stmt.addBatch(h);

            List<Households.to_households> households = to_houses.households;
            for (Households.to_households household : households) {

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
                        + ")";

                hh = SqlStringUtil.parse(hh)
                        .setString("created_at", to_houses.created_at)
                        .setString("updated_at", to_houses.updated_at)
                        .setString("created_by", to_houses.created_by)
                        .setString("updated_by", to_houses.updated_by)
                        .setString("region", to_houses.region)
                        .setString("region_id", to_houses.region_id)
                        .setString("province", to_houses.province)
                        .setString("province_id", to_houses.province_id)
                        .setString("city", to_houses.city)
                        .setString("city_id", to_houses.city_id)
                        .setString("barangay", to_houses.barangay)
                        .setString("barangay_id", to_houses.barangay_id)
                        .setString("purok", to_houses.purok)
                        .setString("purok_id", to_houses.purok_id)
                        .setNumber("status", to_houses.status)
                        .setString("house_no", to_houses.house_no)
                        .setString("household_no", household.household_no)
                        .setString("occupancy_types", household.occupancy_types)
                        .setString("tenure", household.tenure)
                        .setNumber("is_occupant_owns_the_land", household.is_occupant_owns_the_land)
                        .setNumber("is_occupant_owns_the_bldg", household.is_occupant_owns_the_bldg)
                        .setNumber("monthly_rental", household.monthly_rental)
                        .setString("drainage_system_concern", household.drainage_system_concern)
                        .setString("street_maintenance_concern", household.street_maintenance_concern)
                        .setString("garbage_collection_concern", household.garbage_collection_concern)
                        .setString("fire_protection_concern", household.fire_protection_concern)
                        .setString("police_protection_concern", household.police_protection_concern)
                        .setString("ambulance_service_concern", household.ambulance_service_concern)
                        .setString("livelihood_programs_concern", household.livelihood_programs_concern)
                        .setString("adolescent_pregnancy_rate", household.adolescent_pregnancy_rate)
                        .setString("child_abuse_rating", household.child_abuse_rating)
                        .setString("crime_rating", household.crime_rating)
                        .setString("domestic_violence_rating", household.domestic_violence_rating)
                        .setString("drug_abuse_rating", household.drug_abuse_rating)
                        .setString("hunger_rating", household.hunger_rating)
                        .setString("environmental_contamination_rating", household.environmental_contamination_rating)
                        .setString("health_disparities_rating", household.health_disparities_rating)
                        .ok();
                stmt.addBatch(hh);

                //</editor-fold>
                //<editor-fold defaultstate="collapsed" desc=" insert household assets ">
                List<Household_assets.to_household_assets> assets = household.assets;
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
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
                            .setString("household_no", household_asset.household_no)
                            .setNumber("qty", household_asset.qty)
                            .setString("assets", household_asset.assets)
                            .ok();
                    stmt.addBatch(ha);
                }

                //</editor-fold>
                //<editor-fold defaultstate="collapsed" desc=" insert household expenditures ">
                List<Household_expenditures.to_household_expenditures> household_expenditures = household.household_expenditures;
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
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
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
                List<Household_consumptions.to_household_consumptions> household_consumptions = household.household_consumptions;
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
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
                            .setString("household_no", household_consumption.household_no)
                            .setString("consumption_date", household_consumption.consumption_date)
                            .setString("items", household_consumption.items)
                            .setNumber("amount", household_consumption.amount)
                            .ok();
                    stmt.addBatch(hc);
                }
                //</editor-fold>
                //<editor-fold defaultstate="collapsed" desc=" insert household members ">
                List<Household_members.to_household_members> household_members = household.household_members;
                for (Household_members.to_household_members household_member : household_members) {

                    //<editor-fold defaultstate="collapsed" desc=" insert household member ">
                    String hm = "insert into household_members("
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
                            + ",gender"
                            + ",marital_status"
                            + ",bday"
                            + ",occupancy_years"
                            + ",height"
                            + ",weight"
                            + ",birth_place"
                            + ",present_address"
                            + ",relation_to_household"
                            + ",religion"
                            + ",citizenship"
                            + ",email_address"
                            + ",blood_type"
                            + ",languages_spoken"
                            + ",is_registered_voter"
                            + ",voters_id_no"
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
                            + ",:gender"
                            + ",:marital_status"
                            + ",:bday"
                            + ",:occupancy_years"
                            + ",:height"
                            + ",:weight"
                            + ",:birth_place"
                            + ",:present_address"
                            + ",:relation_to_household"
                            + ",:religion"
                            + ",:citizenship"
                            + ",:email_address"
                            + ",:blood_type"
                            + ",:languages_spoken"
                            + ",:is_registered_voter"
                            + ",:voters_id_no"
                            + ")";

                    hm = SqlStringUtil.parse(hm)
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
                            .setString("household_no", household.household_no)
                            .setString("household_member_no", household_member.household_member_no)
                            .setString("fname", household_member.fname)
                            .setString("mname", household_member.mname)
                            .setString("lname", household_member.lname)
                            .setString("sname", household_member.sname)
                            .setString("gender", household_member.gender)
                            .setString("marital_status", household_member.marital_status)
                            .setString("bday", household_member.bday)
                            .setNumber("occupancy_years", household_member.occupancy_years)
                            .setString("height", household_member.height)
                            .setString("weight", household_member.weight)
                            .setString("birth_place", household_member.birth_place)
                            .setString("present_address", household_member.present_address)
                            .setString("relation_to_household", household_member.relation_to_household)
                            .setString("religion", household_member.religion)
                            .setString("citizenship", household_member.citizenship)
                            .setString("email_address", household_member.email_address)
                            .setString("blood_type", household_member.blood_type)
                            .setString("languages_spoken", household_member.languages_spoken)
                            .setNumber("is_registered_voter", household_member.is_registered_voter)
                            .setString("voters_id_no", household_member.voters_id_no)
                            .ok();
                    stmt.addBatch(hm);
                    //</editor-fold>

                    //<editor-fold defaultstate="collapsed" desc=" insert household member health statuses ">
                    List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = household_member.health_statuses;
                    for (Household_member_health_statuses.to_household_member_health_statuses health_status : health_statuses) {
                        String hs = "insert into household_member_health_statuses("
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
                                + ",is_seing_a_doctor"
                                + ",health_status"
                                + ",name_of_doctor"
                                + ",disabilities"
                                + ",level_of_disability"
                                + ",cause_of_disability"
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
                                + ",:is_seing_a_doctor"
                                + ",:health_status"
                                + ",:name_of_doctor"
                                + ",:disabilities"
                                + ",:level_of_disability"
                                + ",:cause_of_disability"
                                + ")";

                        hs = SqlStringUtil.parse(hs)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", health_status.fname)
                                .setString("mname", health_status.mname)
                                .setString("lname", health_status.lname)
                                .setString("sname", health_status.sname)
                                .setNumber("is_seing_a_doctor", health_status.is_seing_a_doctor)
                                .setNumber("health_status", health_status.health_status)
                                .setString("name_of_doctor", health_status.name_of_doctor)
                                .setString("disabilities", health_status.disabilities)
                                .setString("level_of_disability", health_status.level_of_disability)
                                .setString("cause_of_disability", health_status.cause_of_disability)
                                .ok();
                        stmt.addBatch(hs);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household member health medications ">
                    List<Household_member_medications.to_household_member_medications> health_medications = household_member.health_medications;
                    for (Household_member_medications.to_household_member_medications health_medication : health_medications) {
                        String hhm = "insert into household_member_medications("
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
                                + ",prescription"
                                + ",dosage"
                                + ",medication_date_started"
                                + ",medication_date_ended"
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
                                + ",:prescription"
                                + ",:dosage"
                                + ",:medication_date_started"
                                + ",:medication_date_ended"
                                + ")";

                        hhm = SqlStringUtil.parse(hhm)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", health_medication.fname)
                                .setString("mname", health_medication.mname)
                                .setString("lname", health_medication.lname)
                                .setString("sname", health_medication.sname)
                                .setString("prescription", health_medication.prescription)
                                .setString("dosage", health_medication.dosage)
                                .setString("medication_date_started", health_medication.medication_date_started)
                                .setString("medication_date_ended", health_medication.medication_date_ended)
                                .ok();
                        stmt.addBatch(hhm);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household member educational backgrounds ">
                    List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = household_member.educational_backgrounds;
                    for (Household_member_educational_backgrounds.to_household_member_educational_backgrounds educational_background : educational_backgrounds) {
                        String hheb = "insert into household_member_educational_backgrounds("
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
                                + ",educational_status"
                                + ",name_of_school"
                                + ",achievements"
                                + ",highest_grade"
                                + ",year_graduated"
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
                                + ",:educational_status"
                                + ",:name_of_school"
                                + ",:achievements"
                                + ",:highest_grade"
                                + ",:year_graduated"
                                + ")";

                        hheb = SqlStringUtil.parse(hheb)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", educational_background.fname)
                                .setString("mname", educational_background.mname)
                                .setString("lname", educational_background.lname)
                                .setString("sname", educational_background.sname)
                                .setString("educational_status", educational_background.educational_status)
                                .setString("name_of_school", educational_background.name_of_school)
                                .setString("achievements", educational_background.achievements)
                                .setNumber("highest_grade", educational_background.highest_grade)
                                .setString("year_graduated", educational_background.year_graduated)
                                .ok();
                        stmt.addBatch(hheb);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household member vocational experiences ">
                    List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = household_member.vocational_experiences;
                    for (Household_member_vocational_experiences.to_household_member_vocational_experiences vocational_experience : vocational_experiences) {
                        String hhve = "insert into household_member_vocational_experiences("
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
                                + ",name_of_training"
                                + ",certificate_received"
                                + ",skills_required"
                                + ",name_of_school"
                                + ",period_of_training"
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
                                + ",:name_of_training"
                                + ",:certificate_received"
                                + ",:skills_required"
                                + ",:name_of_school"
                                + ",:period_of_training"
                                + ")";

                        hhve = SqlStringUtil.parse(hhve)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", vocational_experience.fname)
                                .setString("mname", vocational_experience.mname)
                                .setString("lname", vocational_experience.lname)
                                .setString("sname", vocational_experience.sname)
                                .setString("name_of_training", vocational_experience.name_of_training)
                                .setString("certificate_received", vocational_experience.certificate_received)
                                .setString("skills_required", vocational_experience.skills_required)
                                .setString("name_of_school", vocational_experience.name_of_school)
                                .setString("period_of_training", vocational_experience.period_of_training)
                                .ok();
                        stmt.addBatch(hhve);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household member competence certificates ">
                    List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = household_member.competence_certificates;
                    for (Household_member_competence_certificates.to_household_member_competence_certificates competence_certificate : competence_certificates) {
                        String hhcc = "insert into household_member_competence_certificates("
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
                                + ",certificate"
                                + ",rating"
                                + ",issued_by"
                                + ",date_issued"
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
                                + ",:certificate"
                                + ",:rating"
                                + ",:issued_by"
                                + ",:date_issued"
                                + ")";

                        hhcc = SqlStringUtil.parse(hhcc)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", competence_certificate.fname)
                                .setString("mname", competence_certificate.mname)
                                .setString("lname", competence_certificate.lname)
                                .setString("sname", competence_certificate.sname)
                                .setString("certificate", competence_certificate.certificate)
                                .setString("rating", competence_certificate.rating)
                                .setString("issued_by", competence_certificate.issued_by)
                                .setString("date_issued", competence_certificate.date_issued)
                                .ok();
                        stmt.addBatch(hhcc);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household member licenses ">
                    List<Household_member_licences.to_household_member_licenses> licenses = household_member.licenses;
                    for (Household_member_licences.to_household_member_licenses license : licenses) {
                        String hhl = "insert into household_member_licenses("
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
                                + ",title"
                                + ",expiry"
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
                                + ",:title"
                                + ",:expiry"
                                + ")";

                        hhl = SqlStringUtil.parse(hhl)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", license.fname)
                                .setString("mname", license.mname)
                                .setString("lname", license.lname)
                                .setString("sname", license.sname)
                                .setString("title", license.title)
                                .setString("expiry", license.expiry)
                                .ok();
                        stmt.addBatch(hhl);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household work experiences ">
                    List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences = household_member.work_experiences;
                    for (Household_member_work_experiences.to_household_member_work_experiences work_experience : work_experiences) {
                        String hhwe = "insert into household_member_work_experiences("
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
                                + ",company"
                                + ",company_address"
                                + ",work_position"
                                + ",work_description"
                                + ",work_started"
                                + ",work_ended"
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
                                + ",:company"
                                + ",:company_address"
                                + ",:work_position"
                                + ",:work_description"
                                + ",:work_started"
                                + ",:work_ended"
                                + ")";

                        hhwe = SqlStringUtil.parse(hhwe)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", work_experience.fname)
                                .setString("mname", work_experience.mname)
                                .setString("lname", work_experience.lname)
                                .setString("sname", work_experience.sname)
                                .setString("company", work_experience.company)
                                .setString("company_address", work_experience.company_address)
                                .setString("work_position", work_experience.work_position)
                                .setString("work_description", work_experience.work_description)
                                .setString("work_started", work_experience.work_started)
                                .setString("work_ended", work_experience.work_ended)
                                .ok();
                        stmt.addBatch(hhwe);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household prefered works ">
                    List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = household_member.prefered_works;
                    for (Household_member_prefered_works.to_household_member_prefered_works prefered_work : prefered_works) {
                        String hhpw = "insert into household_member_prefered_works("
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
                                + ",work"
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
                                + ",:work"
                                + ")";

                        hhpw = SqlStringUtil.parse(hhpw)
                                .setString("created_at", to_houses.created_at)
                                .setString("updated_at", to_houses.updated_at)
                                .setString("created_by", to_houses.created_by)
                                .setString("updated_by", to_houses.updated_by)
                                .setString("region", to_houses.region)
                                .setString("region_id", to_houses.region_id)
                                .setString("province", to_houses.province)
                                .setString("province_id", to_houses.province_id)
                                .setString("city", to_houses.city)
                                .setString("city_id", to_houses.city_id)
                                .setString("barangay", to_houses.barangay)
                                .setString("barangay_id", to_houses.barangay_id)
                                .setString("purok", to_houses.purok)
                                .setString("purok_id", to_houses.purok_id)
                                .setNumber("status", to_houses.status)
                                .setString("house_no", to_houses.house_no)
                                .setString("household_no", household.household_no)
                                .setString("household_member_no", household_member.household_member_no)
                                .setString("fname", prefered_work.fname)
                                .setString("mname", prefered_work.mname)
                                .setString("lname", prefered_work.lname)
                                .setString("sname", prefered_work.sname)
                                .setString("work", prefered_work.work)
                                .ok();
                        stmt.addBatch(hhpw);
                    }
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household employment status ">
                    Household_member_employment_status.to_household_member_employment_status employment_status = household_member.employment_status;
                    String hhes = "insert into household_member_employment_status("
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
                            + ")";

                    hhes = SqlStringUtil.parse(hhes)
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
                            .setString("household_no", household.household_no)
                            .setString("household_member_no", household_member.household_member_no)
                            .setString("fname", employment_status.fname)
                            .setString("mname", employment_status.mname)
                            .setString("lname", employment_status.lname)
                            .setString("sname", employment_status.sname)
                            .setNumber("employment_status", employment_status.employment_status)
                            .setString("employment_type", employment_status.employment_type)
                            .setString("unemployment_type", employment_status.unemployment_type)
                            .setString("company", employment_status.company)
                            .setString("work_position", employment_status.work_position)
                            .setString("work_description", employment_status.work_description)
                            .setNumber("is_looking_for_work", employment_status.is_looking_for_work)
                            .setString("ofw_business_name", employment_status.ofw_business_name)
                            .setString("ofw_business_address", employment_status.ofw_business_address)
                            .setString("ofw_mailing_address", employment_status.ofw_mailing_address)
                            .setString("ofw_type_of_business", employment_status.ofw_type_of_business)
                            .setNumber("ofw_financial_assistance_amount", employment_status.ofw_financial_assistance_amount)
                            .setString("ofw_country", employment_status.ofw_country)
                            .setString("ofw_job", employment_status.ofw_job)
                            .setString("ofw_reason_for_migration", employment_status.ofw_reason_for_migration)
                            .ok();
                    stmt.addBatch(hhes);
                    //</editor-fold>
                    //<editor-fold defaultstate="collapsed" desc=" insert household skills ">
                    Household_member_skills.to_household_member_skills skills = household_member.skills;
                    String hhs = "insert into household_member_skills("
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
                            + ",ps_teaching"
                            + ",ps_negotiating"
                            + ",ps_diverting"
                            + ",ps_persuading"
                            + ",ps_promoting"
                            + ",ps_selling"
                            + ",ps_leading"
                            + ",ps_speaking"
                            + ",ps_serving"
                            + ",ps_helping"
                            + ",ps_encouraging"
                            + ",ps_motivating"
                            + ",ds_coordinating"
                            + ",ds_analyzing"
                            + ",ds_planning"
                            + ",ds_compiling"
                            + ",ds_computing"
                            + ",ds_recording"
                            + ",ds_checking"
                            + ",ds_researching"
                            + ",ds_testing"
                            + ",ds_comparing"
                            + ",ds_tabulating"
                            + ",ds_posting"
                            + ",ds_copying"
                            + ",ts_machine_work"
                            + ",ts_setting_up"
                            + ",ts_assembling"
                            + ",ts_operating"
                            + ",ts_driving"
                            + ",ts_repairing"
                            + ",ts_manipulating"
                            + ",ts_materials_handling"
                            + ",ts_producing"
                            + ",ts_inspecting"
                            + ",ts_warehousing"
                            + ",ts_building"
                            + ",ts_precision_working"
                            + ",ts_restoring"
                            + ",ts_feeding"
                            + ",is_implementing"
                            + ",is_synthesizing"
                            + ",is_interpreting"
                            + ",is_instruction"
                            + ",is_speculating"
                            + ",is_anticipating"
                            + ",is_inventing"
                            + ",is_discovering"
                            + ",is_predicting"
                            + ",is_theorizing"
                            + ",is_innovating"
                            + ",is_expressing"
                            + ",is_organizing"
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
                            + ",:ps_teaching"
                            + ",:ps_negotiating"
                            + ",:ps_diverting"
                            + ",:ps_persuading"
                            + ",:ps_promoting"
                            + ",:ps_selling"
                            + ",:ps_leading"
                            + ",:ps_speaking"
                            + ",:ps_serving"
                            + ",:ps_helping"
                            + ",:ps_encouraging"
                            + ",:ps_motivating"
                            + ",:ds_coordinating"
                            + ",:ds_analyzing"
                            + ",:ds_planning"
                            + ",:ds_compiling"
                            + ",:ds_computing"
                            + ",:ds_recording"
                            + ",:ds_checking"
                            + ",:ds_researching"
                            + ",:ds_testing"
                            + ",:ds_comparing"
                            + ",:ds_tabulating"
                            + ",:ds_posting"
                            + ",:ds_copying"
                            + ",:ts_machine_work"
                            + ",:ts_setting_up"
                            + ",:ts_assembling"
                            + ",:ts_operating"
                            + ",:ts_driving"
                            + ",:ts_repairing"
                            + ",:ts_manipulating"
                            + ",:ts_materials_handling"
                            + ",:ts_producing"
                            + ",:ts_inspecting"
                            + ",:ts_warehousing"
                            + ",:ts_building"
                            + ",:ts_precision_working"
                            + ",:ts_restoring"
                            + ",:ts_feeding"
                            + ",:is_implementing"
                            + ",:is_synthesizing"
                            + ",:is_interpreting"
                            + ",:is_instruction"
                            + ",:is_speculating"
                            + ",:is_anticipating"
                            + ",:is_inventing"
                            + ",:is_discovering"
                            + ",:is_predicting"
                            + ",:is_theorizing"
                            + ",:is_innovating"
                            + ",:is_expressing"
                            + ",:is_organizing"
                            + ")";

                    hhs = SqlStringUtil.parse(hhs)
                            .setString("created_at", to_houses.created_at)
                            .setString("updated_at", to_houses.updated_at)
                            .setString("created_by", to_houses.created_by)
                            .setString("updated_by", to_houses.updated_by)
                            .setString("region", to_houses.region)
                            .setString("region_id", to_houses.region_id)
                            .setString("province", to_houses.province)
                            .setString("province_id", to_houses.province_id)
                            .setString("city", to_houses.city)
                            .setString("city_id", to_houses.city_id)
                            .setString("barangay", to_houses.barangay)
                            .setString("barangay_id", to_houses.barangay_id)
                            .setString("purok", to_houses.purok)
                            .setString("purok_id", to_houses.purok_id)
                            .setNumber("status", to_houses.status)
                            .setString("house_no", to_houses.house_no)
                            .setString("household_no", household.household_no)
                            .setString("household_member_no", household_member.household_member_no)
                            .setString("fname", skills.fname)
                            .setString("mname", skills.mname)
                            .setString("lname", skills.lname)
                            .setString("sname", skills.sname)
                            .setNumber("ps_teaching", skills.ps_teaching)
                            .setNumber("ps_negotiating", skills.ps_negotiating)
                            .setNumber("ps_diverting", skills.ps_diverting)
                            .setNumber("ps_persuading", skills.ps_persuading)
                            .setNumber("ps_promoting", skills.ps_promoting)
                            .setNumber("ps_selling", skills.ps_selling)
                            .setNumber("ps_leading", skills.ps_leading)
                            .setNumber("ps_speaking", skills.ps_speaking)
                            .setNumber("ps_serving", skills.ps_serving)
                            .setNumber("ps_helping", skills.ps_helping)
                            .setNumber("ps_encouraging", skills.ps_encouraging)
                            .setNumber("ps_motivating", skills.ps_motivating)
                            .setNumber("ds_coordinating", skills.ds_coordinating)
                            .setNumber("ds_analyzing", skills.ds_analyzing)
                            .setNumber("ds_planning", skills.ds_planning)
                            .setNumber("ds_compiling", skills.ds_compiling)
                            .setNumber("ds_computing", skills.ds_computing)
                            .setNumber("ds_recording", skills.ds_recording)
                            .setNumber("ds_checking", skills.ds_checking)
                            .setNumber("ds_researching", skills.ds_researching)
                            .setNumber("ds_testing", skills.ds_testing)
                            .setNumber("ds_comparing", skills.ds_comparing)
                            .setNumber("ds_tabulating", skills.ds_tabulating)
                            .setNumber("ds_posting", skills.ds_posting)
                            .setNumber("ds_copying", skills.ds_copying)
                            .setNumber("ts_machine_work", skills.ts_machine_work)
                            .setNumber("ts_setting_up", skills.ts_setting_up)
                            .setNumber("ts_assembling", skills.ts_assembling)
                            .setNumber("ts_operating", skills.ts_operating)
                            .setNumber("ts_driving", skills.ts_driving)
                            .setNumber("ts_repairing", skills.ts_repairing)
                            .setNumber("ts_manipulating", skills.ts_manipulating)
                            .setNumber("ts_materials_handling", skills.ts_materials_handling)
                            .setNumber("ts_producing", skills.ts_producing)
                            .setNumber("ts_inspecting", skills.ts_inspecting)
                            .setNumber("ts_warehousing", skills.ts_warehousing)
                            .setNumber("ts_building", skills.ts_building)
                            .setNumber("ts_precision_working", skills.ts_precision_working)
                            .setNumber("ts_restoring", skills.ts_restoring)
                            .setNumber("ts_feeding", skills.ts_feeding)
                            .setNumber("is_implementing", skills.is_implementing)
                            .setNumber("is_synthesizing", skills.is_synthesizing)
                            .setNumber("is_interpreting", skills.is_interpreting)
                            .setNumber("is_instruction", skills.is_instruction)
                            .setNumber("is_speculating", skills.is_speculating)
                            .setNumber("is_anticipating", skills.is_anticipating)
                            .setNumber("is_inventing", skills.is_inventing)
                            .setNumber("is_discovering", skills.is_discovering)
                            .setNumber("is_predicting", skills.is_predicting)
                            .setNumber("is_theorizing", skills.is_theorizing)
                            .setNumber("is_innovating", skills.is_innovating)
                            .setNumber("is_expressing", skills.is_expressing)
                            .setNumber("is_organizing", skills.is_organizing)
                            .ok();
                    stmt.addBatch(hhs);
                    //</editor-fold>

                }
                //</editor-fold>
            }

            Lg.s(Houses.class, "Successfully Added");
            stmt.executeBatch();
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            //<editor-fold defaultstate="collapsed" desc=" House ">
            String s0 = "insert into houses("
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
                    + ",no_of_rooms"
                    + ",bldg_types"
                    + ",bldg_permit"
                    + ",toilet_types"
                    + ",compartments"
                    + ",bathroom_types"
                    + ",waste_disposal_methods"
                    + ",kitchen_types"
                    + ",trans_types"
                    + ",construction_roof_types"
                    + ",construction_wall_types"
                    + ",construction_floor_types"
                    + ",construction_communication_types"
                    + ",lighting_fuels"
                    + ",cooking_fuels"
                    + ",water_sources"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
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
                    + ",:no_of_rooms"
                    + ",:bldg_types"
                    + ",:bldg_permit"
                    + ",:toilet_types"
                    + ",:compartments"
                    + ",:bathroom_types"
                    + ",:waste_disposal_methods"
                    + ",:kitchen_types"
                    + ",:trans_types"
                    + ",:construction_roof_types"
                    + ",:construction_wall_types"
                    + ",:construction_floor_types"
                    + ",:construction_communication_types"
                    + ",:lighting_fuels"
                    + ",:cooking_fuels"
                    + ",:water_sources"
                    + ",:drinking_water_source_distance"
                    + ",:nearest_water_source_distance"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_houses.created_at)
                    .setString("updated_at", to_houses.updated_at)
                    .setString("created_by", to_houses.created_by)
                    .setString("updated_by", to_houses.updated_by)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .setNumber("status", to_houses.status)
                    .setString("house_no", to_houses.house_no)
                    .setNumber("no_of_rooms", to_houses.no_of_rooms)
                    .setString("bldg_types", to_houses.bldg_types)
                    .setString("bldg_permit", to_houses.bldg_permit)
                    .setString("toilet_types", to_houses.toilet_types)
                    .setString("compartments", to_houses.compartments)
                    .setString("bathroom_types", to_houses.bathroom_types)
                    .setString("waste_disposal_methods", to_houses.waste_disposal_methods)
                    .setString("kitchen_types", to_houses.kitchen_types)
                    .setString("trans_types", to_houses.trans_types)
                    .setString("construction_roof_types", to_houses.construction_roof_types)
                    .setString("construction_wall_types", to_houses.construction_wall_types)
                    .setString("construction_floor_types", to_houses.construction_floor_types)
                    .setString("construction_communication_types", to_houses.construction_communication_types)
                    .setString("lighting_fuels", to_houses.lighting_fuels)
                    .setString("cooking_fuels", to_houses.cooking_fuels)
                    .setString("water_sources", to_houses.water_sources)
                    .setNumber("drinking_water_source_distance", to_houses.drinking_water_source_distance)
                    .setNumber("nearest_water_source_distance", to_houses.nearest_water_source_distance)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Households ">
            String s2 = "update households set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id).ok();

            stmt.addBatch(s2);

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Assets">
            String s3 = "update household_assets set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s3 = SqlStringUtil.parse(s3)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s3);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Expenditures">
            String s4 = "update household_expenditures set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s4 = SqlStringUtil.parse(s4)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s4);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Consumptions">
            String s5 = "update household_consumptions set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s5 = SqlStringUtil.parse(s5)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s5);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Members">
            String s6 = "update household_members set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s6 = SqlStringUtil.parse(s6)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s6);
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc=" Households Member Educational Background">
            String s7 = "update household_member_educational_backgrounds set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s7 = SqlStringUtil.parse(s7)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s7);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Vocational Experiences">
            String s8 = "update household_member_vocational_experiences set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s8 = SqlStringUtil.parse(s8)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s8);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Health Status">
            String s9 = "update household_member_health_statuses set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s9 = SqlStringUtil.parse(s9)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s9);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Medications">
            String s10 = "update household_member_medications set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s10 = SqlStringUtil.parse(s10)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s10);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Work Experiences">
            String s11 = "update household_member_work_experiences set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s11 = SqlStringUtil.parse(s11)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s11);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Preferred Work">
            String s12 = "update household_member_prefered_works set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s12 = SqlStringUtil.parse(s12)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s12);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Certificate of Competence">
            String s13 = "update household_member_competence_certificates set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s13 = SqlStringUtil.parse(s13)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s13);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Licenses">
            String s14 = "update household_member_licenses set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s14 = SqlStringUtil.parse(s14)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s14);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Employment Status">
            String s15 = "update household_member_employment_status set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s15 = SqlStringUtil.parse(s15)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s15);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Households Member Skills">
            String s16 = "update household_member_skills set "
                    + " region= :region "
                    + ",region_id= :region_id "
                    + ",province= :province "
                    + ",province_id= :province_id "
                    + ",city= :city "
                    + ",city_id= :city_id "
                    + ",barangay= :barangay "
                    + ",barangay_id= :barangay_id "
                    + ",purok= :purok "
                    + ",purok_id= :purok_id "
                    + " where house_no='" + to_houses.house_no + "' "
                    + " ";

            s16 = SqlStringUtil.parse(s16)
                    .setString("region", to_houses.region)
                    .setString("region_id", to_houses.region_id)
                    .setString("province", to_houses.province)
                    .setString("province_id", to_houses.province_id)
                    .setString("city", to_houses.city)
                    .setString("city_id", to_houses.city_id)
                    .setString("barangay", to_houses.barangay)
                    .setString("barangay_id", to_houses.barangay_id)
                    .setString("purok", to_houses.purok)
                    .setString("purok_id", to_houses.purok_id)
                    .ok();
            stmt.addBatch(s16);
            //</editor-fold>
            
            stmt.executeBatch();
            conn.commit();

            Lg.s(Houses.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_houses to_houses) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from houses  "
                    + " where id='" + to_houses.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Houses.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_houses> ret_data(String where) {
        List<to_houses> datas = new ArrayList();

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
                    + ",no_of_rooms"
                    + ",bldg_types"
                    + ",bldg_permit"
                    + ",toilet_types"
                    + ",compartments"
                    + ",bathroom_types"
                    + ",waste_disposal_methods"
                    + ",kitchen_types"
                    + ",trans_types"
                    + ",construction_roof_types"
                    + ",construction_wall_types"
                    + ",construction_floor_types"
                    + ",construction_communication_types"
                    + ",lighting_fuels"
                    + ",cooking_fuels"
                    + ",water_sources"
                    + ",drinking_water_source_distance"
                    + ",nearest_water_source_distance"
                    + " from houses"
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
                int no_of_rooms = rs.getInt(18);
                String bldg_types = rs.getString(19);
                String bldg_permit = rs.getString(20);
                String toilet_types = rs.getString(21);
                String compartments = rs.getString(22);
                String bathroom_types = rs.getString(23);
                String waste_disposal_methods = rs.getString(24);
                String kitchen_types = rs.getString(25);
                String trans_types = rs.getString(26);
                String construction_roof_types = rs.getString(27);
                String construction_wall_types = rs.getString(28);
                String construction_floor_types = rs.getString(29);
                String construction_communication_types = rs.getString(30);
                String lighting_fuels = rs.getString(31);
                String cooking_fuels = rs.getString(32);
                String water_sources = rs.getString(33);
                double drinking_water_source_distance = rs.getDouble(34);
                double nearest_water_source_distance = rs.getDouble(35);

                to_houses to = new to_houses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance, new ArrayList());
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
