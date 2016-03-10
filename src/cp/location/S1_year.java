/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.location;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author nadruoj19
 */
public class S1_year {

    public static class years {

        public final String years_list;

        public years(String years_list) {

            this.years_list = years_list;
        }

    }

    public static List<years> ret_items() {
        List<years> years = new ArrayList();
        Calendar cal = new GregorianCalendar();
        int yrs = cal.get(Calendar.YEAR);

        while (yrs >= 1980) {

            years to1 = new years(" "+yrs);
            years.add(to1);
            yrs--;
        }

        return years;

    }

}
