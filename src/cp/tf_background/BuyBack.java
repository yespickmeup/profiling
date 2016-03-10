/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.tf_background;

import cp.location.S1_barangays;
import cp.location.S1_bathrooms;
import cp.location.S1_buildings;
import cp.location.S1_communications;
import cp.location.S1_cookings;
import cp.location.S1_disposal_methods;
import cp.location.S1_floors;
import cp.location.S1_kitchens;
import cp.location.S1_roofs;
import cp.location.S1_toilets;
import cp.location.S1_transportations;
import cp.location.S1_walls;
import cp.location.S1_water_sources;

import city_planning.util.TableRenderer;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Guinness
 */
public class BuyBack {

    // categories popup
    public static void barangays(List<S1_barangays.to_barangays> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_barangays.to_barangays to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.barangay.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void buildings(List<S1_buildings.to_building_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_buildings.to_building_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.building_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void toilets(List<S1_toilets.to_toilet_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_toilets.to_toilet_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.toilet_type.toUpperCase();
            i++;

        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void disposal_methods(List<S1_disposal_methods.to_disposal_methods> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_disposal_methods.to_disposal_methods to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.disposal_method.toUpperCase();
            i++;

        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void bathrooms(List<S1_bathrooms.to_bathroom_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_bathrooms.to_bathroom_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.bathroom_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void kitchens(List<S1_kitchens.to_kitchen_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_kitchens.to_kitchen_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.kitchen_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void transportations(List<S1_transportations.to_transportation_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_transportations.to_transportation_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.transportation_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void roofs(List<S1_roofs.to_roof_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_roofs.to_roof_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.roof_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void walls(List<S1_walls.to_wall_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_walls.to_wall_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.wall_type.toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void floors(List<S1_floors.to_floor_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_floors.to_floor_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.floor_type
                    .toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void communications(List<S1_communications.to_communication_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_communications.to_communication_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.communication_type
                    .toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void cooking_method(List<S1_cookings.to_cooking_lighting_types> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_cookings.to_cooking_lighting_types to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.cooking_lighting_type
                    .toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }

    public static void water_sources(List<S1_water_sources.to_water_sources> categories, final JTextField tf) {
        Object[][] obj = new Object[categories.size()][2];
        int i = 0;
        for (S1_water_sources.to_water_sources to : categories) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.water_source
                    .toUpperCase();
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth()};
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
    }
}
