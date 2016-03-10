/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.pnl;

import city_planning.util.Center;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.CloseDialog;

/**
 *
 * @author Guinness
 */
public class MyMain {

    public static void main(String[] args) {
        ret_config();
    }

    static InputStream inputStream;

    private static void ret_config() {
        String home = System.getProperty("user.home") + "\\my_config_city_planning.conf";
        try {
            Properties prop = new Properties();
            inputStream = new FileInputStream(home);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + home + "' not found!");
            }

            System.setProperty("print_to_receipts", prop.getProperty("print_to_receipts", "false"));
            System.setProperty("print_to_receipts2", prop.getProperty("print_to_receipts2", "false"));
            System.setProperty("receipt_printer_show_dialog", prop.getProperty("receipt_printer_show_dialog", "false"));

            System.setProperty("business_name", prop.getProperty("business_name", ""));
            System.setProperty("address", prop.getProperty("address", ""));
            System.setProperty("operated_by", prop.getProperty("operated_by", ""));
            System.setProperty("slogan", prop.getProperty("slogan", ""));
            System.setProperty("contact_number", prop.getProperty("contact_number", ""));
            System.setProperty("fax_number", prop.getProperty("fax_number", ""));
            System.setProperty("email_address", prop.getProperty("email_address", ""));

            System.setProperty("license_code", prop.getProperty("license_code", ""));
            System.setProperty("version", prop.getProperty("version", ""));
            System.setProperty("developer", prop.getProperty("developer", ""));
            System.setProperty("developer_address", prop.getProperty("developer_address", ""));
            System.setProperty("developer_tin_no", prop.getProperty("developer_tin_no", ""));
            System.setProperty("developer_accreditation_no", prop.getProperty("developer_accreditation_no", ""));
            System.setProperty("developer_accreditation_date", prop.getProperty("developer_accreditation_date", ""));

            System.setProperty("support", prop.getProperty("support", ""));
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.setProperty("pool_port", prop.getProperty("pool_port", "3306"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.setProperty("pool_db", prop.getProperty("pool_db", "db_algorithm"));
            System.setProperty("cloud_host", prop.getProperty("cloud_host", "128.199.80.53"));
            System.setProperty("cloud_port", prop.getProperty("cloud_port", "3306"));
            System.setProperty("cloud_user", prop.getProperty("cloud_user", "root"));
            System.setProperty("cloud_password", prop.getProperty("cloud_password", "password"));
            System.setProperty("cloud_db", prop.getProperty("cloud_db", "db_algorithm"));
            System.setProperty("terminal_number", prop.getProperty("terminal_number", "0"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                Window p = (Window) new JFrame();
                loading nd = loading.create(p, true);
                nd.setTitle("");
                nd.setCallback(new loading.Callback() {
                    @Override
                    public void ok(CloseDialog closeDialog, loading.OutputData data) {
                        new MyMain().start();
                        closeDialog.ok();
                    }
                });
                Center.setCenter(nd);
                nd.setVisible(true);

            } catch (IOException ex) {
                Logger.getLogger(MyMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void start() {
        Application.setSystemLookAndFeel();
        Dashboard pnl = new Dashboard();
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/city_planning/img_menu/city_planning.png"));
        pnl.setIconImage(image);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        pnl.setSize(xSize, ySize);
        pnl.setVisible(true);
    }

    public static String getSerialNumber() {
        String drive = System.getProperty("hdd_drive", "");

        String result = "";
        try {
            File file = File.createTempFile("realhowto", ".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                    + "Set colDrives = objFSO.Drives\n"
                    + "Set objDrive = colDrives.item(\"" + drive + "\")\n"
                    + "Wscript.Echo objDrive.SerialNumber";  // see note
            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input
                    = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.trim();
    }
}
