/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.initialize_fields;

import city_planning.barangays.Barangays;
import city_planning.cities.Cities;
import city_planning.provinces.Provinces;
import city_planning.puroks.Puroks;
import city_planning.regions.Regions;
import city_planning.util.TableRenderer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.apache.commons.lang3.StringUtils;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Initialize_search_record_field_types {

    static List<Regions.to_regions> regions = new ArrayList();
    static List<Provinces.to_provinces> provinces = new ArrayList();
    static List<Cities.to_cities> cities = new ArrayList();
    static List<Barangays.to_barangays> barangays = new ArrayList();
    static List<Puroks.to_puroks> puroks = new ArrayList();

    public static void ret_data() {

        provinces = Provinces.ret_data(" order by province asc ");
        cities = Cities.ret_data(" order by city asc ");
        barangays = Barangays.ret_data(" order by barangay asc ");
        puroks = Puroks.ret_data(" order by purok asc ");
        regions = Regions.ret_data(" order by region asc ");

    }

    //<editor-fold defaultstate="collapsed" desc=" Regions "> 
    public static void init_regions(final JTextField tf) {

        final List<Regions.to_regions> in_search = new ArrayList();
        Object[][] obj = null;
        int i = 0;
        if (tf.getText().isEmpty()) {
            obj = new Object[regions.size()][1];
            for (Regions.to_regions to : regions) {
                obj[i][0] = " " + to.region;
                i++;
            }
        } else {

            for (Regions.to_regions to : regions) {
                boolean contains = StringUtils.containsIgnoreCase(to.region, tf.getText());
                if (contains) {
                    in_search.add(to);
                }
            }
            obj = new Object[in_search.size()][1];
            for (Regions.to_regions to : in_search) {
                obj[i][0] = " " + to.region;
                i++;
            }
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Regions.to_regions to = null;

                if (tf.getText().isEmpty()) {
                    to = regions.get(data.selected_row);
                } else {
                    to = in_search.get(data.selected_row);
                }

                Field.Combo field = (Field.Combo) tf;
                field.setText(to.region);
                field.setId("" + to.id);
            }
        });
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Provinces ">
    public static void init_provinces(final JTextField tf, final JTextField tf_regions) {

        final List<Provinces.to_provinces> in_search = new ArrayList();
        Object[][] obj = null;
        int i = 0;
        if (tf.getText().isEmpty()) {
            obj = new Object[provinces.size()][1];
            for (Provinces.to_provinces to : provinces) {
                obj[i][0] = " " + to.province;
                i++;
            }
        } else {

            for (Provinces.to_provinces to : provinces) {
                boolean contains = StringUtils.containsIgnoreCase(to.province, tf.getText());
                if (contains) {
                    in_search.add(to);
                }
            }
            obj = new Object[in_search.size()][1];
            for (Provinces.to_provinces to : in_search) {
                obj[i][0] = " " + to.province;
                i++;
            }
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Provinces.to_provinces to = null;

                if (tf.getText().isEmpty()) {
                    to = provinces.get(data.selected_row);
                } else {
                    to = in_search.get(data.selected_row);
                }
                Field.Combo field = (Field.Combo) tf;
                Field.Combo field_region = (Field.Combo) tf_regions;
                field.setText(to.province);
                field.setId("" + to.id);

                field_region.setText(to.region);
                field_region.setId(to.region_id);

            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Cities ">
    public static void init_cities(final JTextField tf, final JTextField region, final JTextField province) {

        final List<Cities.to_cities> in_search = new ArrayList();
        Object[][] obj = null;
        int i = 0;
        if (tf.getText().isEmpty()) {
            obj = new Object[cities.size()][1];
            for (Cities.to_cities to : cities) {
                obj[i][0] = " " + to.city;
                i++;
            }
        } else {

            for (Cities.to_cities to : cities) {
                boolean contains = StringUtils.containsIgnoreCase(to.city, tf.getText());
                if (contains) {
                    in_search.add(to);
                }
            }
            obj = new Object[in_search.size()][1];
            for (Cities.to_cities to : in_search) {
                obj[i][0] = " " + to.city;
                i++;
            }
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Cities.to_cities to = null;

                if (tf.getText().isEmpty()) {
                    to = cities.get(data.selected_row);
                } else {
                    to = in_search.get(data.selected_row);
                }
                Field.Combo field = (Field.Combo) tf;
                Field.Combo field2 = (Field.Combo) region;
                Field.Combo field3 = (Field.Combo) province;
                field.setText(to.city);
                field.setId("" + to.id);

                field2.setText(to.region);
                field2.setId("" + to.region_id);
                field3.setText(to.province);
                field3.setId("" + to.province_id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Barangays ">
    public static void init_barangays(final JTextField tf, final JTextField region, final JTextField province, final JTextField city) {

        final List<Barangays.to_barangays> in_search = new ArrayList();
        Object[][] obj = null;
        int i = 0;
        if (tf.getText().isEmpty()) {
            obj = new Object[barangays.size()][1];
            for (Barangays.to_barangays to : barangays) {
                obj[i][0] = " " + to.barangay;
                i++;
            }
        } else {

            for (Barangays.to_barangays to : barangays) {
                boolean contains = StringUtils.containsIgnoreCase(to.barangay, tf.getText());
                if (contains) {
                    in_search.add(to);
                }
            }
            obj = new Object[in_search.size()][1];
            for (Barangays.to_barangays to : in_search) {
                obj[i][0] = " " + to.barangay;
                i++;
            }
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Barangays.to_barangays to = null;

                if (tf.getText().isEmpty()) {
                    to = barangays.get(data.selected_row);
                } else {
                    to = in_search.get(data.selected_row);
                }

                Field.Combo field = (Field.Combo) tf;
                field.setText(to.barangay);
                field.setId("" + to.id);

                Field.Combo field2 = (Field.Combo) region;
                Field.Combo field3 = (Field.Combo) province;
                Field.Combo field4 = (Field.Combo) city;

                field2.setText(to.region);
                field2.setId("" + to.region_id);
                field3.setText(to.province);
                field3.setId("" + to.province_id);
                field4.setText(to.city);
                field4.setId("" + to.city_id);

            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" puroks "> 
    public static void init_puroks(final JTextField tf) {

        Object[][] obj = new Object[puroks.size()][1];
        int i = 0;
        for (Puroks.to_puroks to : puroks) {
            obj[i][0] = " " + to.purok;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.
                setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Puroks.to_puroks to = puroks.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.purok);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 

}
