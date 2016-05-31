/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.business_clearances;

import java.io.InputStream;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Guinness
 */
public class Srpt_business_clearance {

    public final String province;
    public final String city;
    public final String barangay;
    public final String applicant;
    public final String business_name;
    public final String location;
    public final String valid_on;
    public final String issued_on;
    public final String issued_at;
    public final String clearance_no;
    public final String punong_barangay;
    public final String img_city;
    public final String img_barangay;

    public Srpt_business_clearance(String province, String city, String barangay, String applicant, String business_name, String location, String valid_on, String issued_on, String issued_at, String clearance_no, String punong_barangay, String img_city, String img_barangay) {
        this.province = province;
        this.city = city;
        this.barangay = barangay;
        this.applicant = applicant;
        this.business_name = business_name;
        this.location = location;
        this.valid_on = valid_on;
        this.issued_on = issued_on;
        this.issued_at = issued_at;
        this.clearance_no = clearance_no;
        this.punong_barangay = punong_barangay;
        this.img_city = img_city;
        this.img_barangay = img_barangay;
    }

    public static void main(String[] args) {

        String province = "Province of Siquijor";
        String city = "Municipality of Siquijor";
        String barangay = "Barangay Siquijor";
        String applicant = "ASIATECH, DEVELOPMENT & BUILDERS [ADB] CORP.";
        String business_name = "ASIATECH, DEVELOPMENT & BUILDERS [ADB] CORP.";
        String location = "59 7TH AVENUE. JUSTICE LOURDES PAREDES SAN DIEGO AVENUE.";
        String valid_on = "December 31,2016";
        String issued_on = "January 13, 2016";
        String issued_at = "Barangay Socorro, Quezon City";
        String clearance_no = "12345";
        String punong_barangay = "JOSE O. DE GUZMAN";
        String home = System.getProperty("user.home");
        String img_city = home + "\\images\\city.png";
        String img_barangay = home + "\\images\\barangay.png";
        Srpt_business_clearance rpt = new Srpt_business_clearance(province, city, barangay, applicant, business_name, location, valid_on, issued_on, issued_at, clearance_no, punong_barangay, img_city, img_barangay);
        String jrxml = "rpt_business_clearance.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_business_clearance.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_business_clearance to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}
