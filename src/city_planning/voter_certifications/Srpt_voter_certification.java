/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.voter_certifications;

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
public class Srpt_voter_certification {

    public final String province;
    public final String city;
    public final String barangay;
    public final String citizen;
    public final String day;
    public final String month;
    public final String punong_barangay;
    public final String img_city;
    public final String img_barangay;
    public final String certify;
    public final String certify2;
    public final String purpose;

    public Srpt_voter_certification(String province, String city, String barangay, String citizen, String day, String month, String punong_barangay, String img_city, String img_barangay, String certify, String certify2, String purpose) {
        this.province = province;
        this.city = city;
        this.barangay = barangay;
        this.citizen = citizen;
        this.day = day;
        this.month = month;
        this.punong_barangay = punong_barangay;
        this.img_city = img_city;
        this.img_barangay = img_barangay;
        this.certify = certify;
        this.certify2 = certify2;
        this.purpose = purpose;
    }

    public static void main(String[] args) {

        String province = "Province of Oriental Negros";
        String city = "City of Dumaguete";
        String barangay = "Barangay Poblacion 7";
        String citizen = "Ms./Mr. Ronald Cadayday Pascua";
        String day = "1st day";
        String month = "December, 2016";
        String punong_barangay = "JOSE O. DE GUZMAN";
        String home = System.getProperty("user.home");
        String img_city = home + "\\images_profiling\\city.png";
        String img_barangay = home + "\\images_profiling\\barangay.png";
        String certify = "Citizen, and a registered voter of " + barangay + ". She/he has no criminal offense or pending case recorded in this office.";
        String certify2 = "                                                                           at " + barangay + ", " + city + ", Philippines.";
        String purpose = "Business";
        Srpt_voter_certification rpt = new Srpt_voter_certification(province, city, barangay, citizen, day, month, punong_barangay, img_city, img_barangay, certify, certify2, purpose);
        String jrxml = "rpt_voter_certification.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_voter_certification.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_voter_certification to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}
