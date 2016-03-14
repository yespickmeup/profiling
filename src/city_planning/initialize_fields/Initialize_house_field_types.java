/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.initialize_fields;

import city_planning.barangays.Barangays;
import city_planning.bathroom_types.Bathroom_types;
import city_planning.building_types.Building_types;
import city_planning.cities.Cities;
import city_planning.communication_types.Communication_types;
import city_planning.compartments.Compartments;
import city_planning.cooking_lighting_types.Cooking_lighting_types;
import city_planning.floor_types.Floor_types;
import city_planning.kitchen_types.Kitchen_types;
import city_planning.provinces.Provinces;
import city_planning.puroks.Puroks;
import city_planning.roof_types.Roof_types;
import city_planning.solid_waste_disposal_methods.Solid_waste_disposal_methods;
import city_planning.streets.Streets;
import city_planning.toilet_types.Toilet_types;
import city_planning.util.CheckBox;
import city_planning.util.TableCheckBoxRenderer;
import city_planning.util.TableRenderer;
import city_planning.wall_types.Wall_types;
import city_planning.water_sources.Water_sources;
import city_planning_transportation_available.Transportation_types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Initialize_house_field_types {

    static List<Provinces.to_provinces> provinces = new ArrayList();
    static List<Cities.to_cities> cities = new ArrayList();
    static List<Barangays.to_barangays> barangays = new ArrayList();
    static List<Streets.to_streets> streets = new ArrayList();
    static List<Puroks.to_puroks> puroks = new ArrayList();
    static List<Building_types.to_building_types> building = new ArrayList();
    static List<Toilet_types.to_toilet_types> toilet = new ArrayList();
    static List<Bathroom_types.to_bathroom_types> bathroom = new ArrayList();
    static List<Solid_waste_disposal_methods.to_solid_waste_disposal_methods> solid = new ArrayList();
    static List<Kitchen_types.to_kitchen_types> kitchen = new ArrayList();
    static List<Transportation_types.to_transportation_types> transportation = new ArrayList();
    static List<Water_sources.to_water_sources> water = new ArrayList();
    static List<Cooking_lighting_types.to_cooking_lighting_types> cooking = new ArrayList();
    static List<Roof_types.to_roof_types> roofs = new ArrayList();
    static List<Wall_types.to_wall_types> walls = new ArrayList();
    static List<Floor_types.to_floor_types> floor = new ArrayList();
    static List<Communication_types.to_communication_types> communication = new ArrayList();
    static List<Compartments.to_compartments> compartments = new ArrayList();

    public static void ret_data() {

        provinces = Provinces.ret_data(" order by province asc ");
        cities = Cities.ret_data(" order by city asc ");
        barangays = Barangays.ret_data(" order by barangay asc ");
        streets = Streets.ret_data(" order by street asc ");
        puroks = Puroks.ret_data(" order by purok asc ");
        roofs = Roof_types.ret_data(" order by roof_type asc ");
        building = Building_types.ret_data(" order by building_type asc ");
        toilet = Toilet_types.ret_data(" order by toilet_type asc ");
        bathroom = Bathroom_types.ret_data(" order by bathroom_type asc ");
        solid = Solid_waste_disposal_methods.ret_data(" order by disposal_method asc ");
        cooking = Cooking_lighting_types.ret_data(" order by cooking_lighting_type asc ");
        kitchen = Kitchen_types.ret_data(" order by kitchen_type asc ");
        water = Water_sources.ret_data(" order by water_source asc ");
        walls = Wall_types.ret_data("order by wall_type asc");
        transportation = Transportation_types.ret_data("order by transportation_type asc");
        floor = Floor_types.ret_data("order by floor_type asc");
        communication = Communication_types.ret_data("order by communication_type asc");
        compartments = Compartments.ret_data("order by compartment asc");
    }

    //<editor-fold defaultstate="collapsed" desc=" Province ">
    public static void init_provinces(final JTextField tf) {

        Object[][] obj = new Object[provinces.size()][1];
        int i = 0;
        for (Provinces.to_provinces to : provinces) {
            obj[i][0] = " " + to.province;
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
                Provinces.to_provinces to = provinces.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.province);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Cities ">
    public static void init_cities(final JTextField tf) {

        Object[][] obj = new Object[cities.size()][1];
        int i = 0;
        for (Cities.to_cities to : cities) {
            obj[i][0] = " " + to.city;
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
                Cities.to_cities to = cities.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.city);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Barangays ">
    public static void init_barangays(final JTextField tf) {

        Object[][] obj = new Object[barangays.size()][1];
        int i = 0;
        for (Barangays.to_barangays to : barangays) {
            obj[i][0] = " " + to.barangay;
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
                Barangays.to_barangays to = barangays.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.barangay);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Streets ">
    public static void init_streets(final JTextField tf) {

        Object[][] obj = new Object[streets.size()][1];
        int i = 0;
        for (Streets.to_streets to : streets) {
            obj[i][0] = " " + to.street;
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
                Streets.to_streets to = streets.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.street);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Puroks ">
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
    //<editor-fold defaultstate="collapsed" desc=" Building_types ">
    public static void init_building(final JTextField tf) {

        Object[][] obj = new Object[building.size()][1];
        int i = 0;
        for (Building_types.to_building_types to : building) {
            obj[i][0] = " " + to.building_type;
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
                Building_types.to_building_types to = building.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.building_type);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Toilet_types ">
    public static void init_toilet(final JTextField tf) {

        Object[][] obj = new Object[toilet.size()][1];
        int i = 0;
        for (Toilet_types.to_toilet_types to : toilet) {
            obj[i][0] = " " + to.toilet_type;
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
                Toilet_types.to_toilet_types to = toilet.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.toilet_type);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Kitchen_types ">
    public static void init_kitchen(final JTextField tf) {

        Object[][] obj = new Object[kitchen.size()][1];
        int i = 0;
        for (Kitchen_types.to_kitchen_types to : kitchen) {
            obj[i][0] = " " + to.kitchen_type;
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
                Kitchen_types.to_kitchen_types to = kitchen.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.kitchen_type);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Water Sources ">
    public static void init_water(final JTextField tf) {

        Object[][] obj = new Object[water.size()][1];
        int i = 0;
        for (Water_sources.to_water_sources to : water) {
            obj[i][0] = " " + to.water_source;
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
                Water_sources.to_water_sources to = water.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.water_source);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc=" Disposal_Methods ">
    public static void init_solid(final JTextField tf) {

        Object[][] obj = new Object[solid.size()][1];
        int i = 0;
        for (Solid_waste_disposal_methods.to_solid_waste_disposal_methods to : solid) {
            obj[i][0] = " " + to.disposal_method;
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
                Solid_waste_disposal_methods.to_solid_waste_disposal_methods to = solid.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.disposal_method);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Cooking_Lighting_types ">
    public static void init_cooking_lighting(final JTextField tf) {

        Object[][] obj = new Object[cooking.size()][1];
        int i = 0;
        for (Cooking_lighting_types.to_cooking_lighting_types to : cooking) {
            obj[i][0] = " " + to.cooking_lighting_type;
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
                Cooking_lighting_types.to_cooking_lighting_types to = cooking.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.cooking_lighting_type);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Transportation_types ">
    public static void init_transportation_types(final JTextField tf) {

        Object[][] obj = new Object[transportation.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Transportation_types.to_transportation_types to : transportation) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.transportation_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.transportation_type;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Transportation_types.to_transportation_types to = transportation.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.transportation_type);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Bathroom_types ">
    public static void init_bathroom(final JTextField tf) {

        Object[][] obj = new Object[bathroom.size()][1];
        int i = 0;
        for (Bathroom_types.to_bathroom_types to : bathroom) {
            obj[i][0] = " " + to.bathroom_type;
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
                Bathroom_types.to_bathroom_types to = bathroom.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.bathroom_type);
                field.setId("" + to.id);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Roof_types ">
    public static void init_roof(final JTextField tf) {

        Object[][] obj = new Object[roofs.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Roof_types.to_roof_types to : roofs) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.roof_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.roof_type;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Roof_types.to_roof_types to = roofs.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.roof_type);
                field.setId("" + to.id);
                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);

            }
        });
    }

    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Wall_types ">
    public static void init_wall(final JTextField tf) {

        Object[][] obj = new Object[walls.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Wall_types.to_wall_types to : walls) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.wall_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.wall_type;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Wall_types.to_wall_types to = walls.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.wall_type);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Floor_types ">
    public static void init_floor(final JTextField tf) {

        Object[][] obj = new Object[floor.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Floor_types.to_floor_types to : floor) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.floor_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.floor_type;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Floor_types.to_floor_types to = floor.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.floor_type);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Communication/s_types ">
    public static void init_communication(final JTextField tf) {

        Object[][] obj = new Object[communication.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Communication_types.to_communication_types to : communication) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.communication_type)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.communication_type;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Communication_types.to_communication_types to = communication.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.communication_type);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" Compartments ">
    public static void init_compartments(final JTextField tf) {

        Object[][] obj = new Object[compartments.size()][2];
        int i = 0;
        String[] stmt = tf.getText().split(",");
        for (Compartments.to_compartments to : compartments) {
            int exist = 0;
            for (String s : stmt) {
                if (s.equalsIgnoreCase(to.compartment)) {
                    exist = 1;
                }
            }
            if (exist == 1) {
                obj[i][0] = true;
            } else {
                obj[i][0] = false;
            }
            obj[i][1] = " " + to.compartment;
            i++;
        }

        JLabel[] labels = {};
        int[] tbl_widths_customers = {30, tf.getWidth()};
        String[] col_names = {"", "Name"};
        TableCheckBoxRenderer tr = new TableCheckBoxRenderer();
        TableCheckBoxRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableCheckBoxRenderer.Callback() {
            @Override
            public void ok(TableCheckBoxRenderer.OutputData data) {
                Compartments.to_compartments to = compartments.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.compartment);
                field.setId("" + to.id);

                String values = "";
                List<CheckBox.list> datas = data.output;
                int i = 0;
                for (CheckBox.list l : datas) {
                    if (l.selected == true) {

                        if (i == 0) {
                            values = l.stmt;
                        } else {
                            values = values + "," + l.stmt;
                        }
                        i++;
                    }

                }
                tf.setText(values);
            }
        });
    }
    //</editor-fold>
}
