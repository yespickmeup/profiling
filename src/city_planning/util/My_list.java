/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guinness
 */
public class My_list {

    public static class genders {

        public final String gender;

        public genders(String gender) {
            this.gender = gender;
        }

    }

    public static List<genders> ret_genders() {
        List<genders> datas = new ArrayList();

        genders to1 = new genders("Male");
        genders to2 = new genders("Female");
        genders to3 = new genders("Shemale");
        datas.add(to1);
        datas.add(to2);
        datas.add(to3);
        return datas;
    }
}
