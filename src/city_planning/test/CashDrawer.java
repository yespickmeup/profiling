/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cordura
 */
public class CashDrawer {

    public static void main(String[] args) {
        try {
            String path = "cmd /c start  C:\\Users\\Cordura\\Documents\\MVC\\libraries\\SERIAL1.BAT";
            Runtime rn = Runtime.getRuntime();
            Process pr = rn.exec(path);
          
        } catch (IOException ex) {
            Logger.getLogger(CashDrawer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
