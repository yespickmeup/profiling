/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.barangay_clearances;

import city_planning.reports.Srpt_bc;
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
public class Srpt_barangay_clearance {

    public final String province;
    public final String city;
    public final String barangay;
    public final String name;
    public final String age;
    public final String civil_status;
    public final String date_issued;
    public final String punong_barangay;
    public final String or_no;
    public final String date_paid;
    public final String amount_paid;
    public final String community_tax_no;
    public final String issued_on;
    public final String issued_at;
    public final String body;
    public final String footer;
    public final String img_logo;
    public final String img_citizen;
   
    public Srpt_barangay_clearance(String province, String city, String barangay, String name, String age, String civil_status, String date_issued, String punong_barangay, String or_no, String date_paid, String amount_paid, String community_tax_no, String issued_on, String issued_at, String body, String footer, String img_logo, String img_citizen) {
        this.province = province;
        this.city = city;
        this.barangay = barangay;
        this.name = name;
        this.age = age;
        this.civil_status = civil_status;
        this.date_issued = date_issued;
        this.punong_barangay = punong_barangay;
        this.or_no = or_no;
        this.date_paid = date_paid;
        this.amount_paid = amount_paid;
        this.community_tax_no = community_tax_no;
        this.issued_on = issued_on;
        this.issued_at = issued_at;
        this.body = body;
        this.footer = footer;
        this.img_logo = img_logo;
        this.img_citizen = img_citizen;
    }

    public static void main(String[] args) {

        String province = "Province of Siquijor";
        String city = "Municipality of Siquijor";
        String barangay = "Barangay Siquijor";
        String name = "Mr./Mrs./Ms., Jannele Tagsip Amores";
        String age = "30 yrs of age";
        String civil_status = "single";
        String date_issued = "17th day of August 2015";
        String punong_barangay = "Peck Dominguez Cortez";
        String or_no = "20150818";
        String date_paid = "August 17,2015";
        String amount_paid = "Php 100.00";
        String community_tax_no = "1234";
        String issued_on = "August 17,2015";
        String issued_at = "Poblacion, Siquijor, Siquijor";
        String body = "This is to certify that " + name + ", " + age + ", Filipino, with residence and postal address at " + issued_at + ", is personally known to me to be a person of good"
                + " moral character in this community and to my knowledge has not been accused of any crime or misdemeanor.";
        String footer = "This clearance is being issued upon request of " + name + " for whatever legal purpose this may serve or deem necessary.";
        String home = System.getProperty("user.home");
        String img_logo = home + "\\images\\barangay.png";
        String img_citizen = home + "\\images\\Bcgrngy7i.png";
        Srpt_barangay_clearance rpt = new Srpt_barangay_clearance(province, city, barangay, name, age, civil_status, date_issued, punong_barangay, or_no, date_paid, amount_paid, community_tax_no, issued_on, issued_at, body, footer, img_logo, img_citizen);

        String jrxml = "rpt_barangay_clearance.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_barangay_clearance.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_barangay_clearance to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}
