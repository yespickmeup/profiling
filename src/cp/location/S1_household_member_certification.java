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
public class S1_household_member_certification {

    public static class to_household_member_certification {

        public final int id;
        public final int household_member_id;
        public final String certification;
        public final String description;
        public final String address;
        public final String date;

        public to_household_member_certification(int id, int household_member_id, String certification, String description, String address, String date) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.certification = certification;
            this.description = description;
            this.address = address;
            this.date = date;
        }
    }
}
