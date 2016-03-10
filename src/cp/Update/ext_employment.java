/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.Update;

/**
 *
 * @author raycha
 */
public class ext_employment {

    public static class emp_extension {

        public String employment_status;
        public String company;

        public emp_extension(String employment_status, String company) {
            this.company = company;
            this.employment_status = employment_status;

        }

        public void setEmployment_status(String employment_status) {
            this.employment_status = employment_status;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getEmployment_status() {
            return employment_status;
        }

        public String getCompany() {
            return company;
        }

    }

}
