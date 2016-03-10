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

    public MyUser() {
    }

    public static String getUser_id() {
        if(user_id==null){
            return "";
        }
        return user_id;
    }

    public static void setUser_id(String user_id) {
        MyUser.user_id = user_id;
    }

    public static String getUser_screen_name() {
        if(user_screen_name==null){
            return "";
        }
        return user_screen_name;
    }

    public static void setUser_screen_name(String user_screen_name) {
        MyUser.user_screen_name = user_screen_name;
    }

    public static String getUser_name() {
        if(user_name==null){
            return "";
        }
        return user_name;
    }

    public static void setUser_name(String user_name) {
        MyUser.user_name = user_name;
    }

}
