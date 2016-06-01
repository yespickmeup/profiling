/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package city_planning.household_members;

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
import city_planning.users.MyUser;
import city_planning.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Household_members {

    public static class to_household_members {

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
        public final String household_member_no;
        public String fname;
        public String mname;
        public String lname;
        public String sname;
        public String gender;
        public String marital_status;
        public String bday;
        public double occupancy_years;
        public String height;
        public String weight;
        public String birth_place;
        public String present_address;
        public String relation_to_household;
        public String religion;
        public String citizenship;
        public String email_address;
        public String blood_type;
        public String languages_spoken;
        public int is_registered_voter;
        public String voters_id_no;
        public List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses;
        public List<Household_member_medications.to_household_member_medications> health_medications;
        public List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds;
        public List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences;
        public List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates;
        public List<Household_member_licences.to_household_member_licenses> licenses;
        public List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences;
        public List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works;
        public Household_member_employment_status.to_household_member_employment_status employment_status;
        public Household_member_skills.to_household_member_skills skills;
        public String image;
        public String transient_no;
        public String contact_no;

        public to_household_members(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String gender, String marital_status, String bday, double occupancy_years, String height, String weight, String birth_place, String present_address, String relation_to_household, String religion, String citizenship, String email_address, String blood_type, String languages_spoken, int is_registered_voter, String voters_id_no, List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses, List<Household_member_medications.to_household_member_medications> health_medications, List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds, List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences, List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates, List<Household_member_licences.to_household_member_licenses> licenses, List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences, List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works, Household_member_employment_status.to_household_member_employment_status employment_status, Household_member_skills.to_household_member_skills skills, String image, String transient_no, String contact_no) {
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
            this.household_member_no = household_member_no;
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
            this.sname = sname;
            this.gender = gender;
            this.marital_status = marital_status;
            this.bday = bday;
            this.occupancy_years = occupancy_years;
            this.height = height;
            this.weight = weight;
            this.birth_place = birth_place;
            this.present_address = present_address;
            this.relation_to_household = relation_to_household;
            this.religion = religion;
            this.citizenship = citizenship;
            this.email_address = email_address;
            this.blood_type = blood_type;
            this.languages_spoken = languages_spoken;
            this.is_registered_voter = is_registered_voter;
            this.voters_id_no = voters_id_no;
            this.health_statuses = health_statuses;
            this.health_medications = health_medications;
            this.educational_backgrounds = educational_backgrounds;
            this.vocational_experiences = vocational_experiences;
            this.competence_certificates = competence_certificates;
            this.licenses = licenses;
            this.work_experiences = work_experiences;
            this.prefered_works = prefered_works;
            this.employment_status = employment_status;
            this.skills = skills;
            this.image = image;
            this.transient_no = transient_no;
            this.contact_no = contact_no;
        }

        public String getTransient_no() {
            return transient_no;
        }

        public void setTransient_no(String transient_no) {
            this.transient_no = transient_no;
        }

        public String getContact_no() {
            return contact_no;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getMname() {
            return mname;
        }

        public void setMname(String mname) {
            this.mname = mname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getMarital_status() {
            return marital_status;
        }

        public void setMarital_status(String marital_status) {
            this.marital_status = marital_status;
        }

        public String getBday() {
            return bday;
        }

        public void setBday(String bday) {
            this.bday = bday;
        }

        public double getOccupancy_years() {
            return occupancy_years;
        }

        public void setOccupancy_years(double occupancy_years) {
            this.occupancy_years = occupancy_years;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getBirth_place() {
            return birth_place;
        }

        public void setBirth_place(String birth_place) {
            this.birth_place = birth_place;
        }

        public String getPresent_address() {
            return present_address;
        }

        public void setPresent_address(String present_address) {
            this.present_address = present_address;
        }

        public String getRelation_to_household() {
            return relation_to_household;
        }

        public void setRelation_to_household(String relation_to_household) {
            this.relation_to_household = relation_to_household;
        }

        public String getReligion() {
            return religion;
        }

        public void setReligion(String religion) {
            this.religion = religion;
        }

        public String getCitizenship() {
            return citizenship;
        }

        public void setCitizenship(String citizenship) {
            this.citizenship = citizenship;
        }

        public String getEmail_address() {
            return email_address;
        }

        public void setEmail_address(String email_address) {
            this.email_address = email_address;
        }

        public String getBlood_type() {
            return blood_type;
        }

        public void setBlood_type(String blood_type) {
            this.blood_type = blood_type;
        }

        public String getLanguages_spoken() {
            return languages_spoken;
        }

        public void setLanguages_spoken(String languages_spoken) {
            this.languages_spoken = languages_spoken;
        }

        public int getIs_registered_voter() {
            return is_registered_voter;
        }

        public void setIs_registered_voter(int is_registered_voter) {
            this.is_registered_voter = is_registered_voter;
        }

        public String getVoters_id_no() {
            return voters_id_no;
        }

        public void setVoters_id_no(String voters_id_no) {
            this.voters_id_no = voters_id_no;
        }

        public List<Household_member_health_statuses.to_household_member_health_statuses> getHealth_statuses() {
            return health_statuses;
        }

        public void setHealth_statuses(List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses) {
            this.health_statuses = health_statuses;
        }

        public List<Household_member_medications.to_household_member_medications> getHealth_medications() {
            return health_medications;
        }

        public void setHealth_medications(List<Household_member_medications.to_household_member_medications> health_medications) {
            this.health_medications = health_medications;
        }

        public List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> getEducational_backgrounds() {
            return educational_backgrounds;
        }

        public void setEducational_backgrounds(List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds) {
            this.educational_backgrounds = educational_backgrounds;
        }

        public List<Household_member_vocational_experiences.to_household_member_vocational_experiences> getVocational_experiences() {
            return vocational_experiences;
        }

        public void setVocational_experiences(List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences) {
            this.vocational_experiences = vocational_experiences;
        }

        public List<Household_member_competence_certificates.to_household_member_competence_certificates> getCompetence_certificates() {
            return competence_certificates;
        }

        public void setCompetence_certificates(List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates) {
            this.competence_certificates = competence_certificates;
        }

        public List<Household_member_licences.to_household_member_licenses> getLicenses() {
            return licenses;
        }

        public void setLicenses(List<Household_member_licences.to_household_member_licenses> licenses) {
            this.licenses = licenses;
        }

        public List<Household_member_work_experiences.to_household_member_work_experiences> getWork_experiences() {
            return work_experiences;
        }

        public void setWork_experiences(List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences) {
            this.work_experiences = work_experiences;
        }

        public List<Household_member_prefered_works.to_household_member_prefered_works> getPrefered_works() {
            return prefered_works;
        }

        public void setPrefered_works(List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works) {
            this.prefered_works = prefered_works;
        }

        public Household_member_employment_status.to_household_member_employment_status getEmployment_status() {
            return employment_status;
        }

        public void setEmployment_status(Household_member_employment_status.to_household_member_employment_status employment_status) {
            this.employment_status = employment_status;
        }

        public Household_member_skills.to_household_member_skills getSkills() {
            return skills;
        }

        public void setSkills(Household_member_skills.to_household_member_skills skills) {
            this.skills = skills;
        }

    }

    public static void add_data(to_household_members household_member) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            //<editor-fold defaultstate="collapsed" desc=" insert household members ">

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
                    + ",image"
                    + ",transient_no"
                    + ",contact_no"
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
                    + ",:image"
                    + ",:transient_no"
                    + ",:contact_no"
                    + ")";

            hm = SqlStringUtil.parse(hm)
                    .setString("created_at", household_member.created_at)
                    .setString("updated_at", household_member.updated_at)
                    .setString("created_by", household_member.created_by)
                    .setString("updated_by", household_member.updated_by)
                    .setString("region", household_member.region)
                    .setString("region_id", household_member.region_id)
                    .setString("province", household_member.province)
                    .setString("province_id", household_member.province_id)
                    .setString("city", household_member.city)
                    .setString("city_id", household_member.city_id)
                    .setString("barangay", household_member.barangay)
                    .setString("barangay_id", household_member.barangay_id)
                    .setString("purok", household_member.purok)
                    .setString("purok_id", household_member.purok_id)
                    .setNumber("status", household_member.status)
                    .setString("house_no", household_member.house_no)
                    .setString("household_no", household_member.household_no)
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
                    .setString("image", household_member.image)
                    .setString("transient_no", household_member.transient_no)
                    .setString("contact_no", household_member.contact_no)
                    .ok();
            PreparedStatement stmt = conn.prepareStatement(hm);

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
                        + ",:is_seing_a_doctor"
                        + ",:health_status"
                        + ",:name_of_doctor"
                        + ",:disabilities"
                        + ",:level_of_disability"
                        + ",:cause_of_disability"
                        + ",:transient_no"
                        + ")";

                hs = SqlStringUtil.parse(hs)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
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
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:prescription"
                        + ",:dosage"
                        + ",:medication_date_started"
                        + ",:medication_date_ended"
                        + ",:transient_no"
                        + ")";

                hhm = SqlStringUtil.parse(hhm)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
                        .setString("household_member_no", household_member.household_member_no)
                        .setString("fname", health_medication.fname)
                        .setString("mname", health_medication.mname)
                        .setString("lname", health_medication.lname)
                        .setString("sname", health_medication.sname)
                        .setString("prescription", health_medication.prescription)
                        .setString("dosage", health_medication.dosage)
                        .setString("medication_date_started", health_medication.medication_date_started)
                        .setString("medication_date_ended", health_medication.medication_date_ended)
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:educational_status"
                        + ",:name_of_school"
                        + ",:achievements"
                        + ",:highest_grade"
                        + ",:year_graduated"
                        + ",:transient_no"
                        + ")";

                hheb = SqlStringUtil.parse(hheb)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
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
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:name_of_training"
                        + ",:certificate_received"
                        + ",:skills_required"
                        + ",:name_of_school"
                        + ",:period_of_training"
                        + ",:transient_no"
                        + ")";

                hhve = SqlStringUtil.parse(hhve)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
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
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:certificate"
                        + ",:rating"
                        + ",:issued_by"
                        + ",:date_issued"
                        + ",:transient_no"
                        + ")";

                hhcc = SqlStringUtil.parse(hhcc)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
                        .setString("household_member_no", household_member.household_member_no)
                        .setString("fname", competence_certificate.fname)
                        .setString("mname", competence_certificate.mname)
                        .setString("lname", competence_certificate.lname)
                        .setString("sname", competence_certificate.sname)
                        .setString("certificate", competence_certificate.certificate)
                        .setString("rating", competence_certificate.rating)
                        .setString("issued_by", competence_certificate.issued_by)
                        .setString("date_issued", competence_certificate.date_issued)
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:title"
                        + ",:expiry"
                        + ",:transient_no"
                        + ")";

                hhl = SqlStringUtil.parse(hhl)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
                        .setString("household_member_no", household_member.household_member_no)
                        .setString("fname", license.fname)
                        .setString("mname", license.mname)
                        .setString("lname", license.lname)
                        .setString("sname", license.sname)
                        .setString("title", license.title)
                        .setString("expiry", license.expiry)
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:company"
                        + ",:company_address"
                        + ",:work_position"
                        + ",:work_description"
                        + ",:work_started"
                        + ",:work_ended"
                        + ",:transient_no"
                        + ")";

                hhwe = SqlStringUtil.parse(hhwe)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
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
                        .setString("transient_no", household_member.transient_no)
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
                        + ",:work"
                        + ",:transient_no"
                        + ")";

                hhpw = SqlStringUtil.parse(hhpw)
                        .setString("created_at", household_member.created_at)
                        .setString("updated_at", household_member.updated_at)
                        .setString("created_by", household_member.created_by)
                        .setString("updated_by", household_member.updated_by)
                        .setString("region", household_member.region)
                        .setString("region_id", household_member.region_id)
                        .setString("province", household_member.province)
                        .setString("province_id", household_member.province_id)
                        .setString("city", household_member.city)
                        .setString("city_id", household_member.city_id)
                        .setString("barangay", household_member.barangay)
                        .setString("barangay_id", household_member.barangay_id)
                        .setString("purok", household_member.purok)
                        .setString("purok_id", household_member.purok_id)
                        .setNumber("status", household_member.status)
                        .setString("house_no", household_member.house_no)
                        .setString("household_no", household_member.household_no)
                        .setString("household_member_no", household_member.household_member_no)
                        .setString("fname", prefered_work.fname)
                        .setString("mname", prefered_work.mname)
                        .setString("lname", prefered_work.lname)
                        .setString("sname", prefered_work.sname)
                        .setString("work", prefered_work.work)
                        .setString("transient_no", household_member.transient_no)
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

            hhes = SqlStringUtil.parse(hhes)
                    .setString("created_at", household_member.created_at)
                    .setString("updated_at", household_member.updated_at)
                    .setString("created_by", household_member.created_by)
                    .setString("updated_by", household_member.updated_by)
                    .setString("region", household_member.region)
                    .setString("region_id", household_member.region_id)
                    .setString("province", household_member.province)
                    .setString("province_id", household_member.province_id)
                    .setString("city", household_member.city)
                    .setString("city_id", household_member.city_id)
                    .setString("barangay", household_member.barangay)
                    .setString("barangay_id", household_member.barangay_id)
                    .setString("purok", household_member.purok)
                    .setString("purok_id", household_member.purok_id)
                    .setNumber("status", household_member.status)
                    .setString("house_no", household_member.house_no)
                    .setString("household_no", household_member.household_no)
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
                    .setString("transient_no", household_member.transient_no)
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
                    + ",:transient_no"
                    + ")";

            hhs = SqlStringUtil.parse(hhs)
                    .setString("created_at", household_member.created_at)
                    .setString("updated_at", household_member.updated_at)
                    .setString("created_by", household_member.created_by)
                    .setString("updated_by", household_member.updated_by)
                    .setString("region", household_member.region)
                    .setString("region_id", household_member.region_id)
                    .setString("province", household_member.province)
                    .setString("province_id", household_member.province_id)
                    .setString("city", household_member.city)
                    .setString("city_id", household_member.city_id)
                    .setString("barangay", household_member.barangay)
                    .setString("barangay_id", household_member.barangay_id)
                    .setString("purok", household_member.purok)
                    .setString("purok_id", household_member.purok_id)
                    .setNumber("status", household_member.status)
                    .setString("house_no", household_member.house_no)
                    .setString("household_no", household_member.household_no)
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
                    .setString("transient_no", household_member.transient_no)
                    .ok();
            stmt.addBatch(hhs);
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc=" update household member count ">
            int count = 0;
            String h2 = "select count(id) from household_members where household_no='" + household_member.household_no + "' ";
            Statement stmtt = conn.createStatement();
            ResultSet rs2 = stmtt.executeQuery(h2);
            if (rs2.next()) {
                count = rs2.getInt(1);
            }
            count++;
            String h3 = "update households set no_of_household_members = '" + count + "' where household_no='" + household_member.household_no + "' ";
            stmt.addBatch(h3);
            System.out.println(h3);
            int count2 = 0;
            String hh3 = "select count(id) from household_members where house_no='" + household_member.house_no + "' ";
            Statement stmtt3 = conn.createStatement();
            ResultSet rs3 = stmtt3.executeQuery(hh3);
            if (rs3.next()) {
                count2 = rs3.getInt(1);
            }
            count2++;
            String hhh3 = "update houses set no_of_household_members = '" + count2 + "' where house_no='" + household_member.house_no + "' ";
            stmt.addBatch(hhh3);

            //</editor-fold>
            Lg.s(Household_members.class, "Successfully Added");
            stmt.executeBatch();
            conn.commit();
            //</editor-fold>

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            //<editor-fold defaultstate="collapsed" desc=" Basic Information  ">
            String s0 = "update household_members set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + ",gender= :gender "
                    + ",marital_status= :marital_status "
                    + ",bday= :bday "
                    + ",occupancy_years= :occupancy_years "
                    + ",height= :height "
                    + ",weight= :weight "
                    + ",birth_place= :birth_place "
                    + ",present_address= :present_address "
                    + ",relation_to_household= :relation_to_household "
                    + ",religion= :religion "
                    + ",citizenship= :citizenship "
                    + ",email_address= :email_address "
                    + ",blood_type= :blood_type "
                    + ",languages_spoken= :languages_spoken "
                    + ",is_registered_voter= :is_registered_voter "
                    + ",voters_id_no= :voters_id_no "
                    + ",image= :image "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + ",contact_no= :contact_no"
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("gender", to_household_members.gender)
                    .setString("marital_status", to_household_members.marital_status)
                    .setString("bday", to_household_members.bday)
                    .setNumber("occupancy_years", to_household_members.occupancy_years)
                    .setString("height", to_household_members.height)
                    .setString("weight", to_household_members.weight)
                    .setString("birth_place", to_household_members.birth_place)
                    .setString("present_address", to_household_members.present_address)
                    .setString("relation_to_household", to_household_members.relation_to_household)
                    .setString("religion", to_household_members.religion)
                    .setString("citizenship", to_household_members.citizenship)
                    .setString("email_address", to_household_members.email_address)
                    .setString("blood_type", to_household_members.blood_type)
                    .setString("languages_spoken", to_household_members.languages_spoken)
                    .setNumber("is_registered_voter", to_household_members.is_registered_voter)
                    .setString("voters_id_no", to_household_members.voters_id_no)
                    .setString("image", to_household_members.image)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .setString("contact_no", to_household_members.contact_no)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Educational Background ">
            String s2 = "update household_member_educational_backgrounds  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s2);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Vocational Experiences ">
            String s3 = "update household_member_vocational_experiences  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s3 = SqlStringUtil.parse(s3)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s3);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Health Status ">
            String s4 = "update household_member_health_statuses  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s4 = SqlStringUtil.parse(s4)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s4);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Medications ">
            String s5 = "update household_member_medications  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s5 = SqlStringUtil.parse(s5)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s5);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Work Experiences ">
            String s6 = "update household_member_work_experiences  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s6 = SqlStringUtil.parse(s6)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s6);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Prefered Works ">
            String s7 = "update household_member_prefered_works  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s7 = SqlStringUtil.parse(s7)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s7);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Competence Certificates ">
            String s8 = "update household_member_competence_certificates  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s8 = SqlStringUtil.parse(s8)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s8);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" licenses ">
            String s9 = "update household_member_licenses  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s9 = SqlStringUtil.parse(s9)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s9);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Employment Status ">
            String s10 = "update household_member_employment_status  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s10 = SqlStringUtil.parse(s10)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s10);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Skills ">
            String s11 = "update household_member_skills  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
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
                    + ",house_no= :house_no "
                    + ",household_no= :household_no "
                    + ",household_member_no= :household_member_no "
                    + " where transient_no='" + to_household_members.transient_no + "' "
                    + " ";

            s11 = SqlStringUtil.parse(s11)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .setString("region", to_household_members.region)
                    .setString("region_id", to_household_members.region_id)
                    .setString("province", to_household_members.province)
                    .setString("province_id", to_household_members.province_id)
                    .setString("city", to_household_members.city)
                    .setString("city_id", to_household_members.city_id)
                    .setString("barangay", to_household_members.barangay)
                    .setString("barangay_id", to_household_members.barangay_id)
                    .setString("purok", to_household_members.purok)
                    .setString("purok_id", to_household_members.purok_id)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
                    .ok();

            stmt.addBatch(s11);
            //</editor-fold>

            stmt.executeBatch();
            conn.commit();

            Lg.s(Household_members.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data2(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            String stmt5 = "delete from household_member_competence_certificates where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt6 = "delete from household_member_educational_backgrounds where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt7 = "delete from household_member_employment_status where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt8 = "delete from household_member_health_statuses where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt9 = "delete from household_member_licenses where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt10 = "delete from household_member_medications where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt11 = "delete from household_member_prefered_works where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt12 = "delete from household_member_skills where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt13 = "delete from household_member_vocational_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt14 = "delete from household_member_work_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
            String stmt15 = "delete from household_members where household_member_no='" + to_household_members.household_member_no + "' ";

            PreparedStatement stmt = conn.prepareStatement(stmt5);

            stmt.addBatch(stmt5);
            stmt.addBatch(stmt6);
            stmt.addBatch(stmt7);
            stmt.addBatch(stmt8);
            stmt.addBatch(stmt9);
            stmt.addBatch(stmt10);
            stmt.addBatch(stmt11);
            stmt.addBatch(stmt12);
            stmt.addBatch(stmt13);
            stmt.addBatch(stmt14);
            stmt.addBatch(stmt15);

            stmt.executeBatch();

            conn.commit();
            Lg.s(Household_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_household_members to_household_members, int no_of_households, int no_of_household_members) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            if (no_of_households == 1) {
                if (no_of_household_members == 1) {
                    String stmt1 = "delete from houses where house_no='" + to_household_members.house_no + "' ";
                    String stmt2 = "delete from household_assets where house_no='" + to_household_members.house_no + "' ";
                    String stmt3 = "delete from household_consumptions where house_no='" + to_household_members.house_no + "' ";
                    String stmt4 = "delete from household_expenditures where house_no='" + to_household_members.house_no + "' ";
                    String stmt5 = "delete from household_member_competence_certificates where house_no='" + to_household_members.house_no + "' ";
                    String stmt6 = "delete from household_member_educational_backgrounds where house_no='" + to_household_members.house_no + "' ";
                    String stmt7 = "delete from household_member_employment_status where house_no='" + to_household_members.house_no + "' ";
                    String stmt8 = "delete from household_member_health_statuses where house_no='" + to_household_members.house_no + "' ";
                    String stmt9 = "delete from household_member_licenses where house_no='" + to_household_members.house_no + "' ";
                    String stmt10 = "delete from household_member_medications where house_no='" + to_household_members.house_no + "' ";
                    String stmt11 = "delete from household_member_prefered_works where house_no='" + to_household_members.house_no + "' ";
                    String stmt12 = "delete from household_member_skills where house_no='" + to_household_members.house_no + "' ";
                    String stmt13 = "delete from household_member_vocational_experiences where house_no='" + to_household_members.house_no + "' ";
                    String stmt14 = "delete from household_member_work_experiences where house_no='" + to_household_members.house_no + "' ";
                    String stmt15 = "delete from household_members where house_no='" + to_household_members.house_no + "' ";
                    String stmt17 = "delete from households where house_no='" + to_household_members.house_no + "' ";
                    PreparedStatement stmt = conn.prepareStatement(stmt1);
                    stmt.addBatch(stmt1);
                    stmt.addBatch(stmt2);
                    stmt.addBatch(stmt3);
                    stmt.addBatch(stmt4);
                    stmt.addBatch(stmt5);
                    stmt.addBatch(stmt6);
                    stmt.addBatch(stmt7);
                    stmt.addBatch(stmt8);
                    stmt.addBatch(stmt9);
                    stmt.addBatch(stmt10);
                    stmt.addBatch(stmt11);
                    stmt.addBatch(stmt12);
                    stmt.addBatch(stmt13);
                    stmt.addBatch(stmt14);
                    stmt.addBatch(stmt15);

                    stmt.addBatch(stmt17);
                    stmt.executeBatch();
                } else {

                    String stmt5 = "delete from household_member_competence_certificates where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt6 = "delete from household_member_educational_backgrounds where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt7 = "delete from household_member_employment_status where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt8 = "delete from household_member_health_statuses where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt9 = "delete from household_member_licenses where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt10 = "delete from household_member_medications where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt11 = "delete from household_member_prefered_works where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt12 = "delete from household_member_skills where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt13 = "delete from household_member_vocational_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt14 = "delete from household_member_work_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                    String stmt15 = "delete from household_members where household_member_no='" + to_household_members.household_member_no + "' ";

                    PreparedStatement stmt = conn.prepareStatement(stmt5);

                    stmt.addBatch(stmt5);
                    stmt.addBatch(stmt6);
                    stmt.addBatch(stmt7);
                    stmt.addBatch(stmt8);
                    stmt.addBatch(stmt9);
                    stmt.addBatch(stmt10);
                    stmt.addBatch(stmt11);
                    stmt.addBatch(stmt12);
                    stmt.addBatch(stmt13);
                    stmt.addBatch(stmt14);
                    stmt.addBatch(stmt15);

                    stmt.executeBatch();
                }
            } else if (no_of_household_members == 1) {
                String stmt5 = "delete from household_member_competence_certificates where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt6 = "delete from household_member_educational_backgrounds where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt7 = "delete from household_member_employment_status where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt8 = "delete from household_member_health_statuses where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt9 = "delete from household_member_licenses where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt10 = "delete from household_member_medications where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt11 = "delete from household_member_prefered_works where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt12 = "delete from household_member_skills where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt13 = "delete from household_member_vocational_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt14 = "delete from household_member_work_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt15 = "delete from household_members where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt17 = "delete from households where household_no='" + to_household_members.household_no + "' ";
                PreparedStatement stmt = conn.prepareStatement(stmt5);
                stmt.addBatch(stmt5);
                stmt.addBatch(stmt6);
                stmt.addBatch(stmt7);
                stmt.addBatch(stmt8);
                stmt.addBatch(stmt9);
                stmt.addBatch(stmt10);
                stmt.addBatch(stmt11);
                stmt.addBatch(stmt12);
                stmt.addBatch(stmt13);
                stmt.addBatch(stmt14);
                stmt.addBatch(stmt15);
                stmt.addBatch(stmt17);
                stmt.executeBatch();
            } else {
                String stmt5 = "delete from household_member_competence_certificates where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt6 = "delete from household_member_educational_backgrounds where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt7 = "delete from household_member_employment_status where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt8 = "delete from household_member_health_statuses where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt9 = "delete from household_member_licenses where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt10 = "delete from household_member_medications where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt11 = "delete from household_member_prefered_works where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt12 = "delete from household_member_skills where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt13 = "delete from household_member_vocational_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt14 = "delete from household_member_work_experiences where household_member_no='" + to_household_members.household_member_no + "' ";
                String stmt15 = "delete from household_members where household_member_no='" + to_household_members.household_member_no + "' ";
                PreparedStatement stmt = conn.prepareStatement(stmt5);
                stmt.addBatch(stmt5);
                stmt.addBatch(stmt6);
                stmt.addBatch(stmt7);
                stmt.addBatch(stmt8);
                stmt.addBatch(stmt9);
                stmt.addBatch(stmt10);
                stmt.addBatch(stmt11);
                stmt.addBatch(stmt12);
                stmt.addBatch(stmt13);
                stmt.addBatch(stmt14);
                stmt.addBatch(stmt15);
                stmt.executeBatch();
            }

            conn.commit();
            Lg.s(Household_members.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_household_member(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);

            String stmt5 = "delete from household_member_competence_certificates where transient_no='" + to_household_members.transient_no + "' ";
            String stmt6 = "delete from household_member_educational_backgrounds where transient_no='" + to_household_members.transient_no + "' ";
            String stmt7 = "delete from household_member_employment_status where transient_no='" + to_household_members.transient_no + "' ";
            String stmt8 = "delete from household_member_health_statuses where transient_no='" + to_household_members.transient_no + "' ";
            String stmt9 = "delete from household_member_licenses where transient_no='" + to_household_members.transient_no + "' ";
            String stmt10 = "delete from household_member_medications where transient_no='" + to_household_members.transient_no + "' ";
            String stmt11 = "delete from household_member_prefered_works where transient_no='" + to_household_members.transient_no + "' ";
            String stmt12 = "delete from household_member_skills where transient_no='" + to_household_members.transient_no + "' ";
            String stmt13 = "delete from household_member_vocational_experiences where transient_no='" + to_household_members.transient_no + "' ";
            String stmt14 = "delete from household_member_work_experiences where transient_no='" + to_household_members.transient_no + "' ";
            String stmt15 = "delete from household_members where transient_no='" + to_household_members.transient_no + "' ";
            PreparedStatement stmt = conn.prepareStatement(stmt5);
            stmt.addBatch(stmt5);
            stmt.addBatch(stmt6);
            stmt.addBatch(stmt7);
            stmt.addBatch(stmt8);
            stmt.addBatch(stmt9);
            stmt.addBatch(stmt10);
            stmt.addBatch(stmt11);
            stmt.addBatch(stmt12);
            stmt.addBatch(stmt13);
            stmt.addBatch(stmt14);
            stmt.addBatch(stmt15);

            //<editor-fold defaultstate="collapsed" desc=" update household member count ">
            int count = 0;
            String h2 = "select count(id) from household_members where household_no='" + to_household_members.household_no + "' ";
            Statement stmtt = conn.createStatement();
            ResultSet rs2 = stmtt.executeQuery(h2);
            if (rs2.next()) {
                count = rs2.getInt(1);
            }
            count--;

            String h3 = "update households set no_of_household_members = '" + count + "' where household_no='" + to_household_members.household_no + "' ";
            stmt.addBatch(h3);

            int count2 = 0;
            String hh3 = "select count(id) from household_members where house_no='" + to_household_members.house_no + "' ";
            Statement stmtt3 = conn.createStatement();
            ResultSet rs3 = stmtt3.executeQuery(hh3);
            if (rs3.next()) {
                count2 = rs3.getInt(1);
            }
            count2--;
            String hhh3 = "update houses set no_of_household_members = '" + count2 + "' where house_no='" + to_household_members.house_no + "' ";
            stmt.addBatch(hhh3);

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

    public static List<to_household_members> ret_data(String where) {
        List<to_household_members> datas = new ArrayList();

        List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses = new ArrayList();
        List<Household_member_medications.to_household_member_medications> health_medications = new ArrayList();
        List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds = new ArrayList();
        List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences = new ArrayList();
        List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates = new ArrayList();
        List<Household_member_licences.to_household_member_licenses> licenses = new ArrayList();
        List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences = new ArrayList();
        List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works = new ArrayList();
        Household_member_employment_status.to_household_member_employment_status employment_status = null;
        Household_member_skills.to_household_member_skills skills = null;

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
                    + ",image"
                    + ",transient_no"
                    + ",contact_no"
                    + " from household_members"
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
                String household_member_no = rs.getString(19);
                String fname = rs.getString(20);
                String mname = rs.getString(21);
                String lname = rs.getString(22);
                String sname = rs.getString(23);
                String gender = rs.getString(24);
                String marital_status = rs.getString(25);
                String bday = rs.getString(26);
                double occupancy_years = rs.getDouble(27);
                String height = rs.getString(28);
                String weight = rs.getString(29);
                String birth_place = rs.getString(30);
                String present_address = rs.getString(31);
                String relation_to_household = rs.getString(32);
                String religion = rs.getString(33);
                String citizenship = rs.getString(34);
                String email_address = rs.getString(35);
                String blood_type = rs.getString(36);
                String languages_spoken = rs.getString(37);
                int is_registered_voter = rs.getInt(38);
                String voters_id_no = rs.getString(39);
                String image = rs.getString(40);
                String transient_no = rs.getString(41);
                String contact_no = rs.getString(42);
                to_household_members to = new to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experiences, prefered_works, employment_status, skills, image, transient_no, contact_no);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(increment_id());
    }

    public static String increment_id() {
        String id = "TRN" + MyUser.getBarangay_id() + "-000000000000";
        try {
            Connection conn = MyConnection.connect();
            String s0 = "select max(id) from household_members  ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            if (rs.next()) {
                id = rs.getString(1);
                String s2 = "select transient_no from household_members where id='" + id + "' and barangay_id ='" + MyUser.getBarangay_id() + "' ";
                Statement stmt2 = conn.createStatement();
                ResultSet rs2 = stmt2.executeQuery(s2);
                if (rs2.next()) {
                    id = rs2.getString(1);
                }
            }
            if (id == null) {
                id = "TRN" + MyUser.getBarangay_id() + "-000000000000";
            }
            id = ReceiptIncrementor.increment(id);
            return id;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }
}
