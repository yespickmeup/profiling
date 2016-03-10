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
public class ext_consumption {

    public static class cons_extension {

        public String consumption_month;
        public String basic_needs;
        public double amount;

        public cons_extension(String consumption_month, String basic_needs, double amount) {
            this.consumption_month = consumption_month;
            this.basic_needs = basic_needs;
            this.amount = amount;
        }

        public void setmonth_date(String consumption_month) {
            this.consumption_month = consumption_month;
        }

        public void setBasic_need(String basic_needs) {
            this.basic_needs = basic_needs;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

      
        public double getAmount() {
            return amount;
        }

    }
}
