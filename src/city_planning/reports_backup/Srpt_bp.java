/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.reports_backup;

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
public class Srpt_bp {

    public final String Barangay_Permit;
    public final String Barangay_Permit1;
    public final String Barangay_Permit2;
    public final String Barangay_Permit3;
    public final String Barangay_Permit4;
    public final String Barangay_Permit5;
    public final String Barangay_Permit6;
    public final String Barangay_Permit7;
    public final String Barangay_Permit8;
    public final String Barangay_Permit9;
    public final String Barangay_Permit10;
    public final String Barangay_Permit11;
    public final String Barangay_Permit12;
    public final String Barangay_Permit13;
    public final String Barangay_Permit14;
    public final String Barangay_Permit15;
    public final String Barangay_Permit16;
    public final String Barangay_Permit17;
    public final String Barangay_Permit18;
    public final String Barangay_Permit19;
    public final String Barangay_Permit20;
    public final String Barangay_Permit21;

       

    public Srpt_bp(String Barangay_Permit, String Barangay_Permit1, String Barangay_Permit2, String Barangay_Permit3, String Barangay_Permit4, String Barangay_Permit5, String Barangay_Permit6, String Barangay_Permit7, String Barangay_Permit8, String Barangay_Permit9, String Barangay_Permit10, String Barangay_Permit11, String Barangay_Permit12, String Barangay_Permit13, String Barangay_Permit14, String Barangay_Permit15, String Barangay_Permit16, String Barangay_Permit17, String Barangay_Permit18, String Barangay_Permit19, String Barangay_Permit20, String Barangay_Permit21 ) {

        this.Barangay_Permit = Barangay_Permit;
        this.Barangay_Permit1 = Barangay_Permit1;
        this.Barangay_Permit2 = Barangay_Permit2;
        this.Barangay_Permit3 = Barangay_Permit3;
        this.Barangay_Permit4 = Barangay_Permit4;
        this.Barangay_Permit5 = Barangay_Permit5;
        this.Barangay_Permit6 = Barangay_Permit6;
        this.Barangay_Permit7 = Barangay_Permit7;
        this.Barangay_Permit8 = Barangay_Permit8;
        this.Barangay_Permit9 = Barangay_Permit9;
        this.Barangay_Permit10 = Barangay_Permit10;
        this.Barangay_Permit11 = Barangay_Permit11;
        this.Barangay_Permit12 = Barangay_Permit12;
        this.Barangay_Permit13 = Barangay_Permit13;
        this.Barangay_Permit14 = Barangay_Permit14;
        this.Barangay_Permit15 = Barangay_Permit15;
        this.Barangay_Permit16 = Barangay_Permit16;
        this.Barangay_Permit17 = Barangay_Permit17;
        this.Barangay_Permit18 = Barangay_Permit18;
        this.Barangay_Permit19 = Barangay_Permit19;
        this.Barangay_Permit20 = Barangay_Permit20;
        this.Barangay_Permit21 = Barangay_Permit21;
       
    }

    public static void main(String[] args) {

        String Barangay_Permit = "Control # 1234 - 2016";
        String Barangay_Permit1 = "BARANGAY BANILAD BACONG";
        String Barangay_Permit2 = "OFFICE OF THE BARANGAY COUNCIL";
        String Barangay_Permit3 = "B A R A N G A Y B U S I N E S S C L E A R A N C E";
        String Barangay_Permit4 = "This is to certify that";
        String Barangay_Permit5 = "Kenneth Arcinue";
        String Barangay_Permit6 = "Name";
        String Barangay_Permit7 = "Kenneth Salon:";
        String Barangay_Permit8 = "Name of Business";
        String Barangay_Permit9 = "Second Floor Martin- Anita Building, Perdices Street corner, San Jose St, Dumaguete, Negros Oriental";
        String Barangay_Permit10 = "Address";
        String Barangay_Permit11 = "Is hereby granted to operate business with the conditions that said business must comply strictly on the laws as provided for";
        String Barangay_Permit12 = "by the City and that NO sidewalk ar any part of the street shall be used as extension of his/her business.";
        String Barangay_Permit13 = "Issued this March 3, 2016";
        String Barangay_Permit14 = "Peter D. Sulima ";
        String Barangay_Permit15 = "Barangay Chairman ";
        String Barangay_Permit16 = "For Barangay Use only ";
        String Barangay_Permit17 = "O>R> # 123456 ";
        String Barangay_Permit18 = "Amount Pd: Php 50.00 ";
        String Barangay_Permit19 = "Date: 03-03-2016";
        String Barangay_Permit20 = "Business plate No: 136";
        String Barangay_Permit21 = "BBA OR No: ";
      
        
        
                                                        

        Srpt_bp rpt = new Srpt_bp(Barangay_Permit, Barangay_Permit1, Barangay_Permit2,  Barangay_Permit3,  Barangay_Permit4, Barangay_Permit5, Barangay_Permit6, Barangay_Permit7, Barangay_Permit8, Barangay_Permit9, Barangay_Permit10, Barangay_Permit11, Barangay_Permit12, Barangay_Permit13, Barangay_Permit14, Barangay_Permit15, Barangay_Permit16, Barangay_Permit17, Barangay_Permit18, Barangay_Permit19, Barangay_Permit20, Barangay_Permit21 );

        String jrxml = "rpt_bc.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_bp.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_bp to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

}
