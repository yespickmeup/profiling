/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.pnl;

import city_planning.settings.Settings;
import city_planning.util.Center;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Properties;
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

    private static void ret_config() {
        String home = System.getProperty("user.home") + "\\my_config_profiling.conf";
        String os = System.getProperty("os.name", "");
        System.out.println("os: " + os);
        if (!os.equalsIgnoreCase("Linux")) {
            home = System.getProperty("user.home") + "/my_config_profiling.conf";
        }
        try {

            Properties prop = new Properties();
            String conf = "my_config_profiling.conf";
            String userHome = System.getProperty("user.home");
            File file = new File(userHome + "/" + conf);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                prop.load(is);
            } else {
                file = new File(conf);
                if (file.exists()) {
                    InputStream is = new FileInputStream(file);
                    prop.load(is);
                }
            }
            String where = "";
            List<Settings.to_settings> datas = Settings.ret_data(where);
            if (!datas.isEmpty()) {
                Settings.to_settings setting = datas.get(0);
                String city = "City";
                if (setting.barangay_is_city == 0) {
                    city = "Municipality";
                }
                System.setProperty("city_label", city);
                System.setProperty("punong_barangay", setting.punong_barangay);

                //<editor-fold defaultstate="collapsed" desc=" callback ">
                if (setting.household_assets == 0) {
                    System.setProperty("household_assets", "0");
                } else {
                    System.setProperty("household_assets", "1");
                }

                if (setting.household_expenditures == 0) {
                    System.setProperty("household_expenditures", "0");
                } else {
                    System.setProperty("household_expenditures", "1");
                }

                if (setting.household_consumptions == 0) {
                    System.setProperty("household_consumptions", "0");
                } else {
                    System.setProperty("household_consumptions", "1");
                }

                if (setting.household_concerns == 0) {
                    System.setProperty("household_concerns", "0");
                } else {
                    System.setProperty("household_concerns", "1");
                }
                if (setting.household_source_of_income == 0) {
                    System.setProperty("household_source_of_income", "0");
                } else {
                    System.setProperty("household_source_of_income", "1");
                }
                // household members
                if (setting.household_member_educational_background == 0) {
                    System.setProperty("household_member_educational_background", "0");
                } else {
                    System.setProperty("household_member_educational_background", "1");
                }

                if (setting.household_member_health_status == 0) {
                    System.setProperty("household_member_health_status", "0");
                } else {
                    System.setProperty("household_member_health_status", "1");
                }
                if (setting.household_member_medication == 0) {
                    System.setProperty("household_member_medication", "");
                } else {
                    System.setProperty("household_member_medication", "");
                }

                if (setting.household_member_work_experience == 0) {
                    System.setProperty("household_member_work_experience", "0");
                } else {
                    System.setProperty("household_member_work_experience", "1");
                }

                if (setting.household_member_license_and_certificates == 0) {
                    System.setProperty("household_member_license_and_certificates", "0");
                } else {
                    System.setProperty("household_member_license_and_certificates", "1");
                }

                if (setting.household_member_employment_status == 0) {
                    System.setProperty("household_member_employment_status", "0");
                } else {
                    System.setProperty("household_member_employment_status", "1");
                }

                if (setting.household_member_skills == 0) {
                    System.setProperty("household_member_skills", "0");
                } else {
                    System.setProperty("household_member_skills", "1");
                }

                //</editor-fold>
            }

            System.out.println(home);
            System.setProperty("pool_host", prop.getProperty("pool_host", "localhost"));
            System.out.println("local_ip: " + System.getProperty("local_ip"));
            System.out.println("pool_host: " + System.getProperty("pool_host"));
            System.setProperty("license_code", prop.getProperty("license_code", ""));
            System.setProperty("version", prop.getProperty("version", ""));
            System.setProperty("pool_port", prop.getProperty("pool_port", "3306"));
            System.setProperty("pool_user", prop.getProperty("pool_user", "root"));
            System.setProperty("pool_password", prop.getProperty("pool_password", "password"));
            System.setProperty("pool_db", prop.getProperty("pool_db", "db_algorithm"));
            System.setProperty("cloud_host", prop.getProperty("cloud_host", "128.199.80.53"));
            System.setProperty("cloud_port", prop.getProperty("cloud_port", "3306"));
            System.setProperty("cloud_user", prop.getProperty("cloud_user", "root"));
            System.setProperty("cloud_password", prop.getProperty("cloud_password", "password"));
            System.setProperty("cloud_db", prop.getProperty("cloud_db", "db_algorithm"));
            System.setProperty("hdd_drive", prop.getProperty("hdd_drive", ""));
            System.setProperty("community_tax_no", prop.getProperty("community_tax_no", ""));
            System.setProperty("environment", prop.getProperty("environment", "production"));
            System.setProperty("type", prop.getProperty("type", "full"));

            //Modules
            //Households


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
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
        }
    }

    private void start() {
        Application.setSystemLookAndFeel();
        Dashboard pnl = new Dashboard();
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/city_planning/img_city_planning/synapse.png"));
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
