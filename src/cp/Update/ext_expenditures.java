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
public class ext_expenditures {

    public static class exp_extension {

        public double total;
        public String month;

        public exp_extension(double total, String month) {
            this.total = total;
            this.month = month;
        }

        public double getTotal() {
            return total;
        }

        public String getMonth() {
            return month;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public void setMonth(String month) {
            this.month = month;
        }

    }
}
