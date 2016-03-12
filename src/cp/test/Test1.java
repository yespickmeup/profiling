/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.test;

import java.io.File;

/**
 *
 * @author Guinness
 */
public class Test1 {

    public static void main1(String[] args) {
        String member_no = "-01-01";
        String[] stmt = member_no.split("-");
        for (String s : stmt) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\Guinness\\Desktop\\images\\01\\01\\01.txt";
        File files = new File(path);
        if (files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        } else {
            if (files.mkdirs()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
    }
}
