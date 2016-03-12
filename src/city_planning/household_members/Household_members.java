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

        public to_household_members(int id, String created_at, String updated_at, String created_by, String updated_by, String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, String household_no, String household_member_no, String fname, String mname, String lname, String sname, String gender, String marital_status, String bday, double occupancy_years, String height, String weight, String birth_place, String present_address, String relation_to_household, String religion, String citizenship, String email_address, String blood_type, String languages_spoken, int is_registered_voter, String voters_id_no, List<Household_member_health_statuses.to_household_member_health_statuses> health_statuses, List<Household_member_medications.to_household_member_medications> health_medications, List<Household_member_educational_backgrounds.to_household_member_educational_backgrounds> educational_backgrounds, List<Household_member_vocational_experiences.to_household_member_vocational_experiences> vocational_experiences, List<Household_member_competence_certificates.to_household_member_competence_certificates> competence_certificates, List<Household_member_licences.to_household_member_licenses> licenses, List<Household_member_work_experiences.to_household_member_work_experiences> work_experiences, List<Household_member_prefered_works.to_household_member_prefered_works> prefered_works, Household_member_employment_status.to_household_member_employment_status employment_status, Household_member_skills.to_household_member_skills skills, String image) {
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

    public static void add_data(to_household_members to_household_members) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into household_members("
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
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_household_members.created_at)
                    .setString("updated_at", to_household_members.updated_at)
                    .setString("created_by", to_household_members.created_by)
                    .setString("updated_by", to_household_members.updated_by)
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
                    .setNumber("status", to_household_members.status)
                    .setString("house_no", to_household_members.house_no)
                    .setString("household_no", to_household_members.household_no)
                    .setString("household_member_no", to_household_members.household_member_no)
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
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Household_members.class, "Successfully Added");
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
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
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
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s2 = SqlStringUtil.parse(s2)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s2);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Vocational Experiences ">
            String s3 = "update household_member_vocational_experiences  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s3 = SqlStringUtil.parse(s3)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s3);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Health Status ">
            String s4 = "update household_member_health_statuses  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s4 = SqlStringUtil.parse(s4)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s4);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Medications ">
            String s5 = "update household_member_medications  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s5 = SqlStringUtil.parse(s5)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s5);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Work Experiences ">
            String s6 = "update household_member_work_experiences  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s6 = SqlStringUtil.parse(s6)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s6);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Prefered Works ">
            String s7 = "update household_member_prefered_works  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s7 = SqlStringUtil.parse(s7)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s7);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Competence Certificates ">
            String s8 = "update household_member_competence_certificates  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s8 = SqlStringUtil.parse(s8)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s8);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" licenses ">
            String s9 = "update household_member_licenses  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s9 = SqlStringUtil.parse(s9)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s9);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Employment Status ">
            String s10 = "update household_member_employment_status  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s10 = SqlStringUtil.parse(s10)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
                    .ok();

            stmt.addBatch(s10);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc=" Skills ">
            String s11 = "update household_member_skills  set "
                    + " fname= :fname "
                    + ",mname= :mname "
                    + ",lname= :lname "
                    + ",sname= :sname "
                    + " where household_member_no='" + to_household_members.household_member_no + "' "
                    + " ";

            s11 = SqlStringUtil.parse(s11)
                    .setString("fname", to_household_members.fname)
                    .setString("mname", to_household_members.mname)
                    .setString("lname", to_household_members.lname)
                    .setString("sname", to_household_members.sname)
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
            } else {
                if (no_of_household_members == 1) {
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
            }

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
                to_household_members to = new to_household_members(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, household_no, household_member_no, fname, mname, lname, sname, gender, marital_status, bday, occupancy_years, height, weight, birth_place, present_address, relation_to_household, religion, citizenship, email_address, blood_type, languages_spoken, is_registered_voter, voters_id_no, health_statuses, health_medications, educational_backgrounds, vocational_experiences, competence_certificates, licenses, work_experiences, prefered_works, employment_status, skills, image);
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
