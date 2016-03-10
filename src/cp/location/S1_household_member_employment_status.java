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
public class S1_household_member_employment_status {

    public static class to_household_member_employment_status {

        public final int id;
        public final int household_member_id;
        public final String status;
        public final String employment_status;
        public final String name_of_company;
        public final String name_of_business;
        public final String business_address;
        public final String mailing_address;
        public final String type_of_business;
        public final String is_homebased_business;
        public final double net_income_estimation;
        public final String country;
        public final String profession;
        public final double financial_assistance_amount;
        public final String reason_for_migration;

        public to_household_member_employment_status(int id, int household_member_id, String status, String employment_status, String name_of_company, String name_of_business, String business_address, String mailing_address, String type_of_business, String is_homebased_business, double net_income_estimation, String country, String profession, double financial_assistance_amount, String reason_for_migration) {
            this.id = id;
            this.household_member_id = household_member_id;
            this.status = status;
            this.employment_status = employment_status;
            this.name_of_company = name_of_company;
            this.name_of_business = name_of_business;
            this.business_address = business_address;
            this.mailing_address = mailing_address;
            this.type_of_business = type_of_business;
            this.is_homebased_business = is_homebased_business;
            this.net_income_estimation = net_income_estimation;
            this.country = country;
            this.profession = profession;
            this.financial_assistance_amount = financial_assistance_amount;
            this.reason_for_migration = reason_for_migration;
        }
    }

}
