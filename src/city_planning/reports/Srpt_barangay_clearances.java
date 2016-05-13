/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.reports;

import city_planning.barangay_clearances.Barangay_clearances;
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
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Srpt_barangay_clearances {

    public final List<field> fields;

    public Srpt_barangay_clearances() {
        this.fields = new ArrayList();
    }

    public static class field {

        String clearance_no;
        String date;
        String citizen;
        String purpose;
        int is_fixed;
        double amount;

        public field() {
        }

        public field(String clearance_no, String date, String citizen, String purpose, int is_fixed, double amount) {
            this.clearance_no = clearance_no;
            this.date = date;
            this.citizen = citizen;
            this.purpose = purpose;
            this.is_fixed = is_fixed;
            this.amount = amount;
        }

        public String getClearance_no() {
            return clearance_no;
        }

        public void setClearance_no(String clearance_no) {
            this.clearance_no = clearance_no;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCitizen() {
            return citizen;
        }

        public void setCitizen(String citizen) {
            this.citizen = citizen;
        }

        public String getPurpose() {
            return purpose;
        }

        public void setPurpose(String purpose) {
            this.purpose = purpose;
        }

        public int getIs_fixed() {
            return is_fixed;
        }

        public void setIs_fixed(int is_fixed) {
            this.is_fixed = is_fixed;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

    }

    public static void main(String[] args) {
        String where = "";
        List<Barangay_clearances.to_barangay_clearances> datas = Barangay_clearances.ret_data(where);
        List<Srpt_barangay_clearances.field> fields = new ArrayList();
        for (Barangay_clearances.to_barangay_clearances to : datas) {
            String clearance_no = to.barangay_clearance_no;
            String date = DateType.convert_jan_1_2013_datetime(to.created_at);
            String citizen = to.citizen;
            String purpose = to.purpose;
            int is_fixed = to.is_fixed;
            double amount = to.amount_due;
            Srpt_barangay_clearances.field field = new field(clearance_no, date, citizen, purpose, is_fixed, amount);
            fields.add(field);
        }
        Srpt_barangay_clearances rpt = new Srpt_barangay_clearances();
        rpt.fields.addAll(fields);
        String jrxml = "rpt_sample_report_with_fields.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_barangay_clearances.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_barangay_clearances to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }

}
