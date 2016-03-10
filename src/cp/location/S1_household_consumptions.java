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
public class S1_household_consumptions {

  public static class to_household_consumptions{

   public final int id;
   public final String house_no;
   public final int household_no;
   public final String basic_need;
   public final double amount;
   public final String consumption_date;
   public final String date_added;

public to_household_consumptions( int id, String house_no, int household_no, String basic_need, double amount, String consumption_date, String date_added){
   this.id = id;
   this.house_no = house_no;
   this.household_no = household_no;
   this.basic_need = basic_need;
   this.amount = amount;
   this.consumption_date = consumption_date;
   this.date_added = date_added;
     }
  
  }

}
