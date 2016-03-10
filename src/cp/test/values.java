/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.test;

/**
 *
 * @author nadruoj19
 */
public class values {
       
        public String description;
        public double qty;
        public double price;

      

        public values( String description, double qty, double price) {

           
            this.description = description;
            this.qty = qty;
            this.price = price;
       
            
        }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        

        
}
