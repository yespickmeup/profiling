/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.reports;

import city_planning.barangay_clearances.Dlg_report_barangay_clearance;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.util.DateType;

/**
 *
 * @author Cordura
 */
public class Srpt_with_fields {

    public final String cashier_name;
    public final String date;
    public final List<Srpt_with_fields.field> fields;

    public Srpt_with_fields(String cashier_name, String date) {
        this.cashier_name = cashier_name;
        this.date = date;
        this.fields = new ArrayList();
    }

    public static class field {

        double qty;
        String description;
        double selling_price;
        double discount;
        double amount;

        // alt+shift+s -> create constructor (empty & with params)
        // alt+shift+s -> create getter and setter
        public field() {
        }

        public field(double qty, String description, double selling_price, double discount, double amount) {
            this.qty = qty;
            this.description = description;
            this.selling_price = selling_price;
            this.discount = discount;
            this.amount = amount;
        }

        public double getQty() {
            return qty;
        }

        public void setQty(double qty) {
            this.qty = qty;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getSelling_price() {
            return selling_price;
        }

        public void setSelling_price(double selling_price) {
            this.selling_price = selling_price;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

        String cashier_name = "Juan Dela Cruz";
        String date = DateType.day_and_time.format(new Date());

        List<Srpt_with_fields.field> fields = new ArrayList();
        for (int i = 0; i < 10; i++) {
            double qty = 1;
            String description = "item 1";
            double selling_price = 100;
            double discount = 20;
            double amount = 200;
            Srpt_with_fields.field field = new field(qty, description, selling_price, discount, amount);
            fields.add(field);
        }
        Srpt_with_fields rpt = new Srpt_with_fields(cashier_name, date);
        rpt.fields.addAll(fields);
        String jrxml = "rpt_with_fields.jrxml";

        //compile jasperprint
        InputStream is = Srpt_bc.class.getResourceAsStream(jrxml);
        try {
            JasperReport jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(rpt), JasperUtil.emptyDatasource());

        } catch (JRException ex) {
            Logger.getLogger(Dlg_report_barangay_clearance.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

//        print();
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //<editor-fold defaultstate="collapsed" desc=" compile and build report ">
    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_with_fields.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_with_fields to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" print ">
    static JasperPrint jasperPrint = null;

    private static void print() {
        try {
            if (jasperPrint != null) {
                JasperPrintManager.printReport(jasperPrint, false); //true=show printers
            }

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
            throw new RuntimeException(e);
        }
    }

    //</editor-fold>
}
