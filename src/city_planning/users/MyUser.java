/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.users;

/**
 *
 * @author Guinness
 */
public class MyUser {

    public static String user_id;
    public static String user_screen_name;
    public static String user_name;
    public static String region;
    public static String region_id;
    public static String province;
    public static String province_id;
    public static String city;
    public static String city_id;
    public static String barangay;
    public static String barangay_id;

    public MyUser() {
    }

    //<editor-fold defaultstate="collapsed" desc=" user ">
    public static String getUser_id() {
        if (user_id == null) {
            return "";
        }
        return user_id;
    }

    public static void setUser_id(String user_id) {
        MyUser.user_id = user_id;
    }

    public static String getUser_screen_name() {
        if (user_screen_name == null) {
            return "";
        }
        return user_screen_name;
    }

    public static void setUser_screen_name(String user_screen_name) {
        MyUser.user_screen_name = user_screen_name;
    }

    public static String getUser_name() {
        if (user_name == null) {
            return "";
        }
        return user_name;
    }

    public static void setUser_name(String user_name) {
        MyUser.user_name = user_name;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" location ">
    //</editor-fold>
    public static String getRegion() {
        if (region == null) {
            return "";
        }
        return region;
    }

    public static void setRegion(String region) {
        MyUser.region = region;
    }

    public static String getRegion_id() {
        if (region_id == null) {
            return "";
        }
        return region_id;
    }

    public static void setRegion_id(String region_id) {
        MyUser.region_id = region_id;
    }

    public static String getProvince() {
        if (province == null) {
            return "";
        }
        return province;
    }

    public static void setProvince(String province) {
        MyUser.province = province;
    }

    public static String getProvince_id() {
        if (province_id == null) {
            return "";
        }
        return province_id;
    }

    public static void setProvince_id(String province_id) {
        MyUser.province_id = province_id;
    }

    public static String getCity() {
        if (city == null) {
            return "";
        }
        return city;
    }

    public static void setCity(String city) {
        MyUser.city = city;
    }

    public static String getCity_id() {
        if (city_id == null) {
            return "";
        }
        return city_id;
    }

    public static void setCity_id(String city_id) {
        MyUser.city_id = city_id;
    }

    public static String getBarangay() {
        if (barangay == null) {
            return "";
        }
        return barangay;
    }

    public static void setBarangay(String barangay) {
        MyUser.barangay = barangay;
    }

    public static String getBarangay_id() {
        if (barangay_id == null) {
            return "";
        }
        return barangay_id;
    }

    public static void setBarangay_id(String barangay_id) {
        MyUser.barangay_id = barangay_id;
    }
}
