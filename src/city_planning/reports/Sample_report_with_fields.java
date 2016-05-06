/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.reports;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author User
 */
public class Sample_report_with_fields {

    public final String fname;
    public final String lname;
    public final int age;
    public final List<field> fields;

    public Sample_report_with_fields(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.fields = new ArrayList();
    }

    public static class field {

        // 1.) empty constructor - alt+shift+s
        // 2.) constructor with params
        // 3.) getter and setter
        String program;
        int days;

        public field() {
        }

        public field(String program, int days) {
            this.program = program;
            this.days = days;
        }

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }

    }

    public static void main(String[] args) {

        String fname = "juan";
        String lname = "cruz";
        int age = 90;
        List<field> fields=new ArrayList();
        for(int i=0;i<10;i++){
            String program="program "+i;
            int days=i*7;
            field field=new field(program, days);
            fields.add(field);
        }
        Sample_report_with_fields rpt = new Sample_report_with_fields(fname, lname, age);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_sample_report_with_fields.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Sample_report_with_fields.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Sample_report_with_fields to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
    
    
}
