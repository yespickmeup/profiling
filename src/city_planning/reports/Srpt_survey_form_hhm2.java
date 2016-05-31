/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.reports;

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
public class Srpt_survey_form_hhm2 {

    public final String province;
    public final String city;
    public final String barangay;

    public final String img_city;
    public final String img_barangay;

    public Srpt_survey_form_hhm2(String province, String city, String barangay, String img_city, String img_barangay) {
        this.province = province;
        this.city = city;
        this.barangay = barangay;
        this.img_city = img_city;
        this.img_barangay = img_barangay;
    }

    public static void main(String[] args) {

        String province = "Province of Negros Oriental";
        String city = "City of Dumaguete";
        String barangay = "Barangay Poblacion 7";

        String home = System.getProperty("user.home");
        String img_city = home + "\\images\\city.png";
        String img_barangay = home + "\\images\\barangay.png";
        Srpt_survey_form_hhm2 rpt = new Srpt_survey_form_hhm2(province, city, barangay, img_city, img_barangay);

        String jrxml = "rpt_survey_form_2.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_survey_form_hhm2.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_survey_form_hhm2 to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }
}
