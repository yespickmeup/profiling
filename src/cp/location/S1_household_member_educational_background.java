/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

/**
 *
 * @author nadruoj19
 */
public class S1_household_member_educational_background {

    public static class to_household_member_educational_background {

        public final int id;
        public String educational_status;
        public int household_member_id;
        public String name_of_school;
        public String highest_grade_computed;
        public String year;
        public String achievements;

        public to_household_member_educational_background(int id, String educational_status, int household_member_id, String name_of_school, String highest_grade_computed, String year, String achievements) {
            this.id = id;
            this.educational_status = educational_status;
            this.household_member_id = household_member_id;
            this.name_of_school = name_of_school;
            this.highest_grade_computed = highest_grade_computed;
            this.year = year;
            this.achievements = achievements;
        }

        public String getEducational_status() {
            return educational_status;
        }

        public void setEducational_status(String educational_status) {
            this.educational_status = educational_status;
        }

        public int getHousehold_member_id() {
            return household_member_id;
        }

        public void setHousehold_member_id(int household_member_id) {
            this.household_member_id = household_member_id;
        }

        public String getName_of_school() {
            return name_of_school;
        }

        public void setName_of_school(String name_of_school) {
            this.name_of_school = name_of_school;
        }

        public String getHighest_grade_computed() {
            return highest_grade_computed;
        }

        public void setHighest_grade_computed(String highest_grade_computed) {
            this.highest_grade_computed = highest_grade_computed;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getAchievements() {
            return achievements;
        }

        public void setAchievements(String achievements) {
            this.achievements = achievements;
        }

    }

}
