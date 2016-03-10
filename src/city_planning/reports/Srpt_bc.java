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
public class Srpt_bc {

    public final String Barangay_Clearance;
    public final String Barangay_Clearance1;
    public final String Barangay_Clearance2;
    public final String Barangay_Clearance3;
    public final String Barangay_Clearance4;
    public final String Barangay_Clearance5;
    public final String Barangay_Clearance6;
    public final String Barangay_Clearance7;
    public final String Barangay_Clearance8;
    public final String Barangay_Clearance9;
    public final String Barangay_Clearance10;
    public final String Barangay_Clearance11;
    public final String Barangay_Clearance12;
    public final String Barangay_Clearance13;
    public final String Barangay_Clearance14;
    public final String Barangay_Clearance15;
    public final String Barangay_Clearance16;
    public final String Barangay_Clearance17;
    public final String Barangay_Clearance18;
    public final String Barangay_Clearance19;
    public final String Barangay_Clearance20;

    public Srpt_bc(String Barangay_Clearance, String Barangay_Clearance1, String Barangay_Clearance2, String Barangay_Clearance3, String Barangay_Clearance4, String Barangay_Clearance5, String Barangay_Clearance6, String Barangay_Clearance7, String Barangay_Clearance8, String Barangay_Clearance9, String Barangay_Clearance10, String Barangay_Clearance11, String Barangay_Clearance12, String Barangay_Clearance13, String Barangay_Clearance14, String Barangay_Clearance15, String Barangay_Clearance16, String Barangay_Clearance17, String Barangay_Clearance18, String Barangay_Clearance19, String Barangay_Clearance20) {

        this.Barangay_Clearance = Barangay_Clearance;
        this.Barangay_Clearance1 = Barangay_Clearance1;
        this.Barangay_Clearance2 = Barangay_Clearance2;
        this.Barangay_Clearance3 = Barangay_Clearance3;
        this.Barangay_Clearance4 = Barangay_Clearance4;
        this.Barangay_Clearance5 = Barangay_Clearance5;
        this.Barangay_Clearance6 = Barangay_Clearance6;
        this.Barangay_Clearance7 = Barangay_Clearance7;
        this.Barangay_Clearance8 = Barangay_Clearance8;
        this.Barangay_Clearance9 = Barangay_Clearance9;
        this.Barangay_Clearance10 = Barangay_Clearance10;
        this.Barangay_Clearance11 = Barangay_Clearance11;
        this.Barangay_Clearance12 = Barangay_Clearance12;
        this.Barangay_Clearance13 = Barangay_Clearance13;
        this.Barangay_Clearance14 = Barangay_Clearance14;
        this.Barangay_Clearance15 = Barangay_Clearance15;
        this.Barangay_Clearance16 = Barangay_Clearance16;
        this.Barangay_Clearance17 = Barangay_Clearance17;
        this.Barangay_Clearance18 = Barangay_Clearance18;
        this.Barangay_Clearance19 = Barangay_Clearance19;
        this.Barangay_Clearance20 = Barangay_Clearance20;
        
    }

    public static void main(String[] args) {

        String Barangay_Clearance = "Republic of the Philippines";
        String Barangay_Clearance1 = "Province of Negros Oriental";
        String Barangay_Clearance2 = "Municipality of Bacong";
        String Barangay_Clearance3 = "Barangay Banilad Bacong";
        String Barangay_Clearance4 = "OFFICE OF THE PUNONG BARANGAY";
        String Barangay_Clearance5 = "B A R A N G A Y   C L E A R A N C E";
        String Barangay_Clearance6 = "TO WHOM IT MAY CONCERN:";
        String Barangay_Clearance7 = "This is to certify that Mr./Mrs./Ms., Kenneth Arcinue, 19 years of age, single/married/widow, Filipino";
        String Barangay_Clearance8 = "with residence and postal address at Barangay Banilad Bacong is personally known to me to be a person of a good";
        String Barangay_Clearance9 = "moral character in this community and to my knowledge has not been accused of any crime or misdemeanor. ";
        String Barangay_Clearance10 = "This clearance is being issued upon of Mr./Mrs./Ms., Kenneth Arcinue for whatever legal purpose this may serve.";
        String Barangay_Clearance11 = "GIVEN: this 3rd day of March 2016 at";
        String Barangay_Clearance12 = "Barangay Banilad, Bacong ";
        String Barangay_Clearance13 = "Peter D. Sulima ";
        String Barangay_Clearance14 = "Punong Barangay ";
        String Barangay_Clearance15 = "O.R. No:13000544700 ";
        String Barangay_Clearance16 = "Date Pd: March 3 2016 ";
        String Barangay_Clearance17 = "Amount Pd: Php 50.00 ";
        String Barangay_Clearance18 = "Community Tax No: 1234";
        String Barangay_Clearance19 = "Issued On: March 3, 2016";
        String Barangay_Clearance20 = "Issued At.: Barangay Banilad Bacong  ";
                                                        

        Srpt_bc rpt = new Srpt_bc(Barangay_Clearance, Barangay_Clearance1, Barangay_Clearance2, Barangay_Clearance3, Barangay_Clearance4, Barangay_Clearance5, Barangay_Clearance6, Barangay_Clearance7, Barangay_Clearance8, Barangay_Clearance9, Barangay_Clearance10, Barangay_Clearance11, Barangay_Clearance12, Barangay_Clearance13, Barangay_Clearance14, Barangay_Clearance15, Barangay_Clearance16, Barangay_Clearance17, Barangay_Clearance18, Barangay_Clearance19, Barangay_Clearance20);

        String jrxml = "rpt_bc.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_bc.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_bc to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}
