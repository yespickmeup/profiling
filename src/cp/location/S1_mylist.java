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
 * @author nadruoj
 */
public class S1_mylist {

    public static class months {

        public final String month;

        public months(String month) {
            this.month = month;
        }

    }

    public static class years {

        public final int year;

        public years(int year) {
            this.year = year;
        }

    }

    public static class genders {

        public final String gender;

        public genders(String gender) {
            this.gender = gender;
        }

    }

    public static class relations {

        public final String relation;

        public relations(String relation) {
            this.relation = relation;
        }

    }

    public static class maritals {

        public final String marital;

        public maritals(String marital) {
            this.marital = marital;
        }

    }

    public static class religions {

        public final String religion;

        public religions(String religion) {
            this.religion = religion;
        }

    }

    public static class disabilities {

        public final String disability;

        public disabilities(String disability) {
            this.disability = disability;
        }

    }

    public static List<months> ret_months() {
        List<months> datas = new ArrayList();

        months to1 = new months("January");
        months to2 = new months("Febuary");
        months to3 = new months("March");
        months to4 = new months("April");
        months to5 = new months("May");
        months to6 = new months("June");
        months to7 = new months("July");
        months to8 = new months("August");
        months to9 = new months("September");
        months to10 = new months("October");
        months to11 = new months("November");
        months to12 = new months("December");

        datas.add(to1);
        datas.add(to2);
        datas.add(to3);
        datas.add(to4);
        datas.add(to5);
        datas.add(to6);
        datas.add(to7);
        datas.add(to8);
        datas.add(to9);
        datas.add(to10);
        datas.add(to11);
        datas.add(to12);

        return datas;
    }

    public static List<years> ret_years() {
        List<years> datas = new ArrayList();
        Calendar cal = new GregorianCalendar();

        for (int loop = cal.get(Calendar.YEAR); loop >= 1980; loop--) {
            years to = new years(loop);
            datas.add(to);
        }

        return datas;
    }

    public static List<genders> ret_genders() {
        List<genders> datas = new ArrayList();

        genders to = new genders("Male");
        genders to1 = new genders("Genders");

        datas.add(to);
        datas.add(to1);
        return datas;
    }

    public static List<relations> ret_relations() {
        List<relations> datas = new ArrayList();
        Calendar cal = new GregorianCalendar();

        relations to = new relations("Father");
        relations to1 = new relations("Mother");
        relations to2 = new relations("Son");
        relations to3 = new relations("Daugther");
        relations to4 = new relations("Grand-child");
        relations to5 = new relations("Uncle");
        relations to6 = new relations("Auntie");
        relations to7 = new relations("cousin");
        relations to8 = new relations("Grand-Father");
        relations to9 = new relations("Grand-Mother");

        datas.add(to);
        datas.add(to1);
        datas.add(to2);
        datas.add(to3);
        datas.add(to4);
        datas.add(to5);
        datas.add(to6);
        datas.add(to7);
        datas.add(to8);
        datas.add(to9);

        return datas;
    }

    public static List<maritals> ret_maritals() {
        List<maritals> datas = new ArrayList();

        maritals to = new maritals("Single");
        maritals to1 = new maritals("Married");
        maritals to2 = new maritals("Annulled");

        datas.add(to);
        datas.add(to1);
        datas.add(to2);
        return datas;
    }

    public static List<religions> ret_religions() {
        List<religions> datas = new ArrayList();

        religions to1 = new religions("Buddhism");
        religions to2 = new religions("Protestant");
        religions to3 = new religions("Roman Catholic");
        religions to4 = new religions("Iglesia Ni Cristo");
        religions to5 = new religions("Born-Again");
        religions to6 = new religions("Baptist");
        religions to7 = new religions("Jehovah's Witness");
        religions to8 = new religions("Islam");
        religions to9 = new religions("September");
        religions to10 = new religions("Taoism");
        religions to11 = new religions("Atheist");
   

        datas.add(to1);
        datas.add(to2);
        datas.add(to3);
        datas.add(to4);
        datas.add(to5);
        datas.add(to6);
        datas.add(to7);
        datas.add(to8);
        datas.add(to9);
        datas.add(to10);
        datas.add(to11);


        return datas;
    }
}
