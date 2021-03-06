/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.dlg;

import city_planning.barangays.Barangays;
import city_planning.barangays.Dlg_barangays;
import city_planning.bathroom_types.Dlg_bathroom_types;
import city_planning.building_types.Dlg_building_types;
import city_planning.cities.Dlg_cities;
import city_planning.communication_types.Dlg_communication;
import city_planning.compartments.Dlg_compartments;
import city_planning.cooking_lighting_types.Dlg_cooking_lightning_types;
import city_planning.floor_types.Dlg_floor_types;
import city_planning.household_assets.Household_assets;
import city_planning.household_consumptions.Household_consumptions;
import city_planning.household_expenditures.Household_expenditures;
import city_planning.household_members.Household_members;
import city_planning.household_source_of_income.Household_source_of_income;
import city_planning.households.Households;
import city_planning.houses.Houses;
import city_planning.initialize_fields.Initialize_house_field_types;
import city_planning.initialize_fields.Initialize_search_record_field_types;
import city_planning.kitchen_types.Dlg_kitchen_types;
import city_planning.provinces.Dlg_provinces;
import city_planning.puroks.Dlg_puroks;
import city_planning.regions.Dlg_regions;
import city_planning.roof_types.Dlg_roof_types;
import city_planning.solid_waste_disposal_methods.Dlg_solid_waste_disposal_methods;
import city_planning.toilet_types.Dlg_toilet_types;
import city_planning.tranportation_types.Dlg_transportation_types;
import city_planning.users.MyUser;
import city_planning.util.Alert;
import city_planning.util.Dlg_confirm_action;
import city_planning.wall_types.Dlg_wall_types;
import city_planning.water_sources.Dlg_water_sources;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.ReceiptIncrementor;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Dlg_house extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_house
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {

        String region;
        String region_id;
        String province;
        String province_id;
        String city;
        String city_id;
        String barangay;
        String barangay_id;
        String purok;
        String purok_id;
        int status;
        String house_no;
        int no_of_rooms;
        String bldg_types;
        String bldg_permit;
        String toilet_types;
        String compartments;
        String bathroom_types;
        String waste_disposal_methods;
        String kitchen_types;
        String trans_types;
        String construction_roof_types;
        String construction_wall_types;
        String construction_floor_types;
        String construction_communication_types;
        String lighting_fuels;
        String cooking_fuels;
        String water_sources;
        double drinking_water_source_distance;
        double nearest_water_source_distance;
        List<Households.to_households> households;
        String latitude;
        String longtitude;

        public OutputData(String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, int status, String house_no, int no_of_rooms, String bldg_types, String bldg_permit, String toilet_types, String compartments, String bathroom_types, String waste_disposal_methods, String kitchen_types, String trans_types, String construction_roof_types, String construction_wall_types, String construction_floor_types, String construction_communication_types, String lighting_fuels, String cooking_fuels, String water_sources, double drinking_water_source_distance, double nearest_water_source_distance, List<Households.to_households> households, String latitude, String longtitude) {
            this.region = region;
            this.region_id = region_id;
            this.province = province;
            this.province_id = province_id;
            this.city = city;
            this.city_id = city_id;
            this.barangay = barangay;
            this.barangay_id = barangay_id;
            this.purok = purok;
            this.purok_id = purok_id;
            this.status = status;
            this.house_no = house_no;
            this.no_of_rooms = no_of_rooms;
            this.bldg_types = bldg_types;
            this.bldg_permit = bldg_permit;
            this.toilet_types = toilet_types;
            this.compartments = compartments;
            this.bathroom_types = bathroom_types;
            this.waste_disposal_methods = waste_disposal_methods;
            this.kitchen_types = kitchen_types;
            this.trans_types = trans_types;
            this.construction_roof_types = construction_roof_types;
            this.construction_wall_types = construction_wall_types;
            this.construction_floor_types = construction_floor_types;
            this.construction_communication_types = construction_communication_types;
            this.lighting_fuels = lighting_fuels;
            this.cooking_fuels = cooking_fuels;
            this.water_sources = water_sources;
            this.drinking_water_source_distance = drinking_water_source_distance;
            this.nearest_water_source_distance = nearest_water_source_distance;
            this.households = households;
            this.latitude = latitude;
            this.longtitude = longtitude;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_house(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_house(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_house() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_house myRef;

    private void setThisRef(Dlg_house myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_house> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_house create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_house create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_house dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_house((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_house dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_house((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_house dialog = Dlg_house.create(new javax.swing.JFrame(), true);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().
                getWidth());
        int ySize = ((int) tk.getScreenSize().
                getHeight());
        dialog.setSize(xSize, ySize);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_basic_Information1 = new javax.swing.JLabel();
        lbl_house_number1 = new javax.swing.JLabel();
        tf_house_number = new Field.Input();
        lbl_barangay1 = new javax.swing.JLabel();
        tf_barangay = new Field.Combo();
        lbl_purok1 = new javax.swing.JLabel();
        tf_purok = new Field.Combo();
        lbl_barangay3 = new javax.swing.JLabel();
        tf_region = new Field.Combo();
        lbl_barangay2 = new javax.swing.JLabel();
        tf_province = new Field.Combo();
        lbl_barangay4 = new javax.swing.JLabel();
        tf_city = new Field.Combo();
        jPanel3 = new javax.swing.JPanel();
        lbl_house_condition2 = new javax.swing.JLabel();
        lbl_no_rooms1 = new javax.swing.JLabel();
        tf_no_rooms = new Field.Input();
        tf_bldg_permit = new Field.Input();
        tf_transportations = new Field.Combo();
        lbl_facilities2 = new javax.swing.JLabel();
        tf_buildings = new Field.Combo();
        jLabel200 = new javax.swing.JLabel();
        tf_disposals = new Field.Combo();
        tf_kitchens = new Field.Combo();
        jLabel151 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        tf_compartments = new Field.Combo();
        jLabel152 = new javax.swing.JLabel();
        tf_toilets = new Field.Combo();
        jLabel203 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        tf_bathrooms = new Field.Combo();
        lbl_facilities3 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        tf_roofs = new Field.Combo();
        tf_walls = new Field.Combo();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        tf_communications = new Field.Combo();
        tf_floors = new Field.Combo();
        jPanel4 = new javax.swing.JPanel();
        tf_nearest_water_src = new Field.Input();
        tf_water_sources = new Field.Combo();
        jLabel208 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        tf_lighting = new Field.Combo();
        jLabel206 = new javax.swing.JLabel();
        tf_cookings = new Field.Combo();
        jLabel212 = new javax.swing.JLabel();
        tf_drinking_water_src = new Field.Combo();
        jLabel211 = new javax.swing.JLabel();
        lbl_house_condition3 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        tf_nearest_water_src1 = new Field.Input();
        tf_nearest_water_src2 = new Field.Input();
        jLabel214 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_households = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_house_condition4 = new javax.swing.JLabel();
        tf_assets1 = new Button.Default();
        jButton3 = new Button.Default();
        jButton2 = new Button.Success();
        jButton13 = new Button.Info();
        jPanel6 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        tf_buildings1 = new Field.Input();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        tf_buildings2 = new Field.Input();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_basic_Information1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_basic_Information1.setText("HOUSE BASIC INFORMATION");

        lbl_house_number1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_house_number1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_house_number1.setText("House Number:");

        tf_house_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_house_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_house_numberActionPerformed(evt);
            }
        });

        lbl_barangay1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay1.setText("Barangay:");

        tf_barangay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_barangay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_barangayMouseClicked(evt);
            }
        });
        tf_barangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_barangayActionPerformed(evt);
            }
        });

        lbl_purok1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_purok1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_purok1.setText("Purok:");

        tf_purok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_purok.setNextFocusableComponent(tf_no_rooms);
        tf_purok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_purokMouseClicked(evt);
            }
        });
        tf_purok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_purokActionPerformed(evt);
            }
        });

        lbl_barangay3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay3.setText("Region:");

        tf_region.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_regionMouseClicked(evt);
            }
        });
        tf_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_regionActionPerformed(evt);
            }
        });

        lbl_barangay2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay2.setText("Province:");

        tf_province.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_province.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_provinceMouseClicked(evt);
            }
        });
        tf_province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_provinceActionPerformed(evt);
            }
        });

        lbl_barangay4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_barangay4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barangay4.setText("City/Municipality:");

        tf_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cityMouseClicked(evt);
            }
        });
        tf_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_basic_Information1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_barangay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_barangay3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(lbl_house_number1)
                            .addComponent(lbl_barangay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_purok1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_purok, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_barangay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_house_number)
                            .addComponent(tf_province, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_city)
                            .addComponent(tf_region))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_basic_Information1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_house_number1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_house_number, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_region, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_province, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_barangay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_barangay4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_city, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_barangay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_barangay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_purok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_purok1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_house_condition2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_house_condition2.setText("HOUSE CONDITION (A)");

        lbl_no_rooms1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_no_rooms1.setText("No. of rooms  used for sleeping:");

        tf_no_rooms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_bldg_permit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_transportations.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_transportations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_transportationsMouseClicked(evt);
            }
        });
        tf_transportations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_transportationsActionPerformed(evt);
            }
        });

        lbl_facilities2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities2.setText("[FACILITIES]");

        tf_buildings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_buildings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_buildingsMouseClicked(evt);
            }
        });
        tf_buildings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buildingsActionPerformed(evt);
            }
        });

        jLabel200.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel200.setText("Common Method of Waste Disposal:");

        tf_disposals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_disposals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_disposalsMouseClicked(evt);
            }
        });
        tf_disposals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_disposalsActionPerformed(evt);
            }
        });

        tf_kitchens.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_kitchens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_kitchensMouseClicked(evt);
            }
        });
        tf_kitchens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kitchensActionPerformed(evt);
            }
        });

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel151.setText("Bulding Type:");

        jLabel216.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel216.setText("Compartments:");

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel195.setText("Bathroom Type:");

        jLabel194.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel194.setText("Bldg. Permit:");

        tf_compartments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_compartments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_compartmentsMouseClicked(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel152.setText("Toilet Type:");

        tf_toilets.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_toilets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_toiletsMouseClicked(evt);
            }
        });
        tf_toilets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_toiletsActionPerformed(evt);
            }
        });

        jLabel203.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel203.setText("Transportation Available:");

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel202.setText("Kitchen Type:");

        tf_bathrooms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_bathrooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_bathroomsMouseClicked(evt);
            }
        });
        tf_bathrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bathroomsActionPerformed(evt);
            }
        });

        lbl_facilities3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_facilities3.setText("[TYPE OF MATERIAL USED IN CONSTRUCTION]");

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel196.setText("Roof:");

        tf_roofs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_roofs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_roofsMouseClicked(evt);
            }
        });
        tf_roofs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_roofsActionPerformed(evt);
            }
        });

        tf_walls.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_walls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_wallsMouseClicked(evt);
            }
        });
        tf_walls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_wallsActionPerformed(evt);
            }
        });

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel197.setText("Wall:");

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel198.setText("Floor:");

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel205.setText("Communication/s:");

        tf_communications.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_communications.setNextFocusableComponent(tf_lighting);
        tf_communications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_communicationsMouseClicked(evt);
            }
        });
        tf_communications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_communicationsActionPerformed(evt);
            }
        });

        tf_floors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_floors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_floorsMouseClicked(evt);
            }
        });
        tf_floors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_floorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_facilities3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel202, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel203, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_kitchens)
                            .addComponent(tf_transportations)))
                    .addComponent(lbl_facilities2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_house_condition2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_disposals, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(tf_compartments, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel195)
                            .addComponent(jLabel151, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_buildings, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_toilets, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel216)
                                    .addComponent(jLabel194))
                                .addGap(5, 5, 5)
                                .addComponent(tf_bldg_permit))
                            .addComponent(tf_bathrooms)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_no_rooms1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_no_rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_communications, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_walls, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_roofs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(tf_floors, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_house_condition2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_no_rooms)
                    .addComponent(lbl_no_rooms1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lbl_facilities2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_buildings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bldg_permit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_toilets, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_compartments, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_bathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_disposals, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_kitchens, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_transportations, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_facilities3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_roofs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_walls, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_floors, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_communications, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tf_nearest_water_src.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_nearest_water_src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nearest_water_srcActionPerformed(evt);
            }
        });

        tf_water_sources.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_water_sources.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_water_sourcesMouseClicked(evt);
            }
        });
        tf_water_sources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_water_sourcesActionPerformed(evt);
            }
        });

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel208.setText("Main Source of Water for Drinking:");

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel207.setText("Lighting:");

        tf_lighting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_lighting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_lightingMouseClicked(evt);
            }
        });
        tf_lighting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_lightingActionPerformed(evt);
            }
        });

        jLabel206.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel206.setText("[FUEL MAINLY USED FOR]");

        tf_cookings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_cookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_cookingsMouseClicked(evt);
            }
        });
        tf_cookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cookingsActionPerformed(evt);
            }
        });

        jLabel212.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel212.setText("Nearest Water Src:");

        tf_drinking_water_src.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_drinking_water_src.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_water_sourcesMouseClicked(evt);
            }
        });
        tf_drinking_water_src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        tf_drinking_water_src.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_drinking_water_srcMouseClicked(evt);
            }
        });
        tf_drinking_water_src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_drinking_water_srcActionPerformed(evt);
            }
        });

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel211.setText("Cooking:");

        lbl_house_condition3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_house_condition3.setText("HOUSE CONDITION (B)");

        jLabel209.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel209.setText("[DISTANCE IN KILOMETERS]");

        jLabel210.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel210.setText("Drinking Water Src:");

        jLabel213.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel213.setText("Latitude:");

        tf_nearest_water_src1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tf_nearest_water_src2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel214.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel214.setText("Longtitude:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel208)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_water_sources, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_cookings)
                                    .addComponent(tf_lighting)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel213, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_drinking_water_src)
                                    .addComponent(tf_nearest_water_src)
                                    .addComponent(tf_nearest_water_src1))))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_house_condition3)
                            .addComponent(jLabel206)
                            .addComponent(jLabel209))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nearest_water_src2)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_house_condition3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_lighting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_cookings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_water_sources, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_drinking_water_src, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nearest_water_src, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nearest_water_src1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nearest_water_src2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tbl_households.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_households.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_householdsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_households);

        jLabel1.setText("No. of Rows:");

        jLabel2.setText("0");

        lbl_house_condition4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_house_condition4.setText("HOUSEHOLDS");

        tf_assets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/city_planning/img_city_planning/new-file.png"))); // NOI18N
        tf_assets1.setText("New");
        tf_assets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_assets1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_house_condition4, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addGap(94, 94, 94)
                        .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_house_condition4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_assets1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel215.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel215.setText("[PRONE TO]");

        jCheckBox1.setBackground(new java.awt.Color(102, 51, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Flood");

        jCheckBox2.setBackground(java.awt.Color.red);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Fire");

        jCheckBox3.setBackground(java.awt.Color.yellow);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Epidemic");

        jCheckBox4.setBackground(java.awt.Color.blue);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Storm Surge");

        tf_buildings1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_buildings1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_buildings1MouseClicked(evt);
            }
        });
        tf_buildings1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buildings1ActionPerformed(evt);
            }
        });

        jLabel217.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel217.setText("Distance from river banks:");

        jLabel218.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel218.setText("Distance from shoreline:");

        tf_buildings2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_buildings2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_buildings2MouseClicked(evt);
            }
        });
        tf_buildings2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_buildings2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel217, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_buildings2)
                    .addComponent(tf_buildings1))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_buildings1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel217, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_buildings2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_barangayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_barangayMouseClicked
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayMouseClicked

    private void tf_house_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_house_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_house_numberActionPerformed

    private void tf_disposalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_disposalsMouseClicked
        Initialize_house_field_types.init_solid(tf_disposals);
    }//GEN-LAST:event_tf_disposalsMouseClicked

    private void tf_buildingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_buildingsMouseClicked
        Initialize_house_field_types.init_building(tf_buildings);
    }//GEN-LAST:event_tf_buildingsMouseClicked

    private void tf_kitchensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_kitchensMouseClicked
        Initialize_house_field_types.init_kitchen(tf_kitchens);
    }//GEN-LAST:event_tf_kitchensMouseClicked

    private void tf_toiletsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_toiletsMouseClicked
        Initialize_house_field_types.init_toilet(tf_toilets);
    }//GEN-LAST:event_tf_toiletsMouseClicked

    private void tf_bathroomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_bathroomsMouseClicked
        Initialize_house_field_types.init_bathroom(tf_bathrooms);
    }//GEN-LAST:event_tf_bathroomsMouseClicked

    private void tf_transportationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_transportationsMouseClicked
        Initialize_house_field_types.init_transportation_types(tf_transportations);
    }//GEN-LAST:event_tf_transportationsMouseClicked

    private void tf_floorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_floorsMouseClicked
        Initialize_house_field_types.init_floor(tf_floors);
    }//GEN-LAST:event_tf_floorsMouseClicked

    private void tf_communicationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_communicationsMouseClicked
        Initialize_house_field_types.init_communication(tf_communications);
    }//GEN-LAST:event_tf_communicationsMouseClicked

    private void tf_roofsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_roofsMouseClicked
        Initialize_house_field_types.init_roof(tf_roofs);
    }//GEN-LAST:event_tf_roofsMouseClicked

    private void tf_wallsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_wallsMouseClicked
        Initialize_house_field_types.init_wall(tf_walls);
    }//GEN-LAST:event_tf_wallsMouseClicked

    private void tf_water_sourcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_water_sourcesMouseClicked
        Initialize_house_field_types.init_water(tf_water_sources);
    }//GEN-LAST:event_tf_water_sourcesMouseClicked

    private void tf_lightingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_lightingMouseClicked
        Initialize_house_field_types.init_cooking_lighting(tf_lighting);
    }//GEN-LAST:event_tf_lightingMouseClicked

    private void tf_cookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cookingsMouseClicked
        Initialize_house_field_types.init_cooking_lighting(tf_cookings);
    }//GEN-LAST:event_tf_cookingsMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ok();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_barangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_barangayActionPerformed
        Initialize_search_record_field_types.init_barangays(tf_barangay, tf_region, tf_province, tf_city);
    }//GEN-LAST:event_tf_barangayActionPerformed

    private void tf_purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_purokActionPerformed
        Initialize_search_record_field_types.init_puroks(tf_purok, tf_region, tf_province, tf_city, tf_barangay);
    }//GEN-LAST:event_tf_purokActionPerformed

    private void tf_purokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_purokMouseClicked
        Initialize_search_record_field_types.init_puroks(tf_purok, tf_region, tf_province, tf_city, tf_barangay);
    }//GEN-LAST:event_tf_purokMouseClicked

    private void tf_roofsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_roofsActionPerformed
        Initialize_house_field_types.init_roof(tf_roofs);
    }//GEN-LAST:event_tf_roofsActionPerformed

    private void tf_wallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_wallsActionPerformed
        Initialize_house_field_types.init_wall(tf_walls);
    }//GEN-LAST:event_tf_wallsActionPerformed

    private void tf_floorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_floorsActionPerformed
        Initialize_house_field_types.init_floor(tf_floors);
    }//GEN-LAST:event_tf_floorsActionPerformed

    private void tf_communicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_communicationsActionPerformed
        Initialize_house_field_types.init_communication(tf_communications);
    }//GEN-LAST:event_tf_communicationsActionPerformed

    private void tf_buildingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buildingsActionPerformed
        Initialize_house_field_types.init_building(tf_buildings);
    }//GEN-LAST:event_tf_buildingsActionPerformed

    private void tf_toiletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_toiletsActionPerformed
        Initialize_house_field_types.init_toilet(tf_toilets);
    }//GEN-LAST:event_tf_toiletsActionPerformed

    private void tf_bathroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bathroomsActionPerformed
        Initialize_house_field_types.init_bathroom(tf_bathrooms);
    }//GEN-LAST:event_tf_bathroomsActionPerformed

    private void tf_disposalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_disposalsActionPerformed
        Initialize_house_field_types.init_solid(tf_disposals);
    }//GEN-LAST:event_tf_disposalsActionPerformed

    private void tf_kitchensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kitchensActionPerformed
        Initialize_house_field_types.init_kitchen(tf_kitchens);
    }//GEN-LAST:event_tf_kitchensActionPerformed

    private void tf_water_sourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_water_sourcesActionPerformed
        Initialize_house_field_types.init_water(tf_water_sources);
    }//GEN-LAST:event_tf_water_sourcesActionPerformed

    private void tf_lightingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_lightingActionPerformed
        Initialize_house_field_types.init_cooking_lighting(tf_lighting);
    }//GEN-LAST:event_tf_lightingActionPerformed

    private void tf_cookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cookingsActionPerformed
        Initialize_house_field_types.init_cooking_lighting(tf_cookings);
    }//GEN-LAST:event_tf_cookingsActionPerformed

    private void tf_transportationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_transportationsActionPerformed
        Initialize_house_field_types.init_transportation_types(tf_transportations);
    }//GEN-LAST:event_tf_transportationsActionPerformed

    private void tf_regionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_regionMouseClicked
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionMouseClicked

    private void tf_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_regionActionPerformed
        Initialize_search_record_field_types.init_regions(tf_region);
    }//GEN-LAST:event_tf_regionActionPerformed

    private void tf_provinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_provinceMouseClicked
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceMouseClicked

    private void tf_provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_provinceActionPerformed
        Initialize_search_record_field_types.init_provinces(tf_province, tf_region);
    }//GEN-LAST:event_tf_provinceActionPerformed

    private void tf_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_cityMouseClicked
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityMouseClicked

    private void tf_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cityActionPerformed
        Initialize_search_record_field_types.init_cities(tf_city, tf_region, tf_province);
    }//GEN-LAST:event_tf_cityActionPerformed

    private void tf_assets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_assets1ActionPerformed
        new_household();
    }//GEN-LAST:event_tf_assets1ActionPerformed

    private void tbl_householdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_householdsMouseClicked
        select_household();
    }//GEN-LAST:event_tbl_householdsMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        update_house();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tf_compartmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_compartmentsMouseClicked
        Initialize_house_field_types.init_compartments(tf_compartments);
    }//GEN-LAST:event_tf_compartmentsMouseClicked

    private void tf_drinking_water_srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_drinking_water_srcActionPerformed
        Initialize_house_field_types.init_water(tf_drinking_water_src);
    }//GEN-LAST:event_tf_drinking_water_srcActionPerformed

    private void tf_drinking_water_srcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_drinking_water_srcMouseClicked
        Initialize_house_field_types.init_water(tf_drinking_water_src);
    }//GEN-LAST:event_tf_drinking_water_srcMouseClicked

    private void tf_nearest_water_srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nearest_water_srcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nearest_water_srcActionPerformed

    private void tf_buildings1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_buildings1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buildings1MouseClicked

    private void tf_buildings1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buildings1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buildings1ActionPerformed

    private void tf_buildings2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_buildings2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buildings2MouseClicked

    private void tf_buildings2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_buildings2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_buildings2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_barangay1;
    private javax.swing.JLabel lbl_barangay2;
    private javax.swing.JLabel lbl_barangay3;
    private javax.swing.JLabel lbl_barangay4;
    private javax.swing.JLabel lbl_basic_Information1;
    private javax.swing.JLabel lbl_facilities2;
    private javax.swing.JLabel lbl_facilities3;
    private javax.swing.JLabel lbl_house_condition2;
    private javax.swing.JLabel lbl_house_condition3;
    private javax.swing.JLabel lbl_house_condition4;
    private javax.swing.JLabel lbl_house_number1;
    private javax.swing.JLabel lbl_no_rooms1;
    private javax.swing.JLabel lbl_purok1;
    private javax.swing.JTable tbl_households;
    private javax.swing.JButton tf_assets1;
    private javax.swing.JTextField tf_barangay;
    private javax.swing.JTextField tf_bathrooms;
    private javax.swing.JTextField tf_bldg_permit;
    private javax.swing.JTextField tf_buildings;
    private javax.swing.JTextField tf_buildings1;
    private javax.swing.JTextField tf_buildings2;
    private javax.swing.JTextField tf_city;
    private javax.swing.JTextField tf_communications;
    private javax.swing.JTextField tf_compartments;
    private javax.swing.JTextField tf_cookings;
    private javax.swing.JTextField tf_disposals;
    private javax.swing.JTextField tf_drinking_water_src;
    private javax.swing.JTextField tf_floors;
    private javax.swing.JTextField tf_house_number;
    private javax.swing.JTextField tf_kitchens;
    private javax.swing.JTextField tf_lighting;
    private javax.swing.JTextField tf_nearest_water_src;
    private javax.swing.JTextField tf_nearest_water_src1;
    private javax.swing.JTextField tf_nearest_water_src2;
    private javax.swing.JTextField tf_no_rooms;
    private javax.swing.JTextField tf_province;
    private javax.swing.JTextField tf_purok;
    private javax.swing.JTextField tf_region;
    private javax.swing.JTextField tf_roofs;
    private javax.swing.JTextField tf_toilets;
    private javax.swing.JTextField tf_transportations;
    private javax.swing.JTextField tf_walls;
    private javax.swing.JTextField tf_water_sources;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        ret_default_location();
        Field.Combo pur = (Field.Combo) tf_purok;
        pur.setText("");
        pur.setId("");
        Initialize_table_households.init_tbl_households(tbl_households);
        jPanel5.setVisible(false);
        jButton13.setVisible(false);
        tf_house_number.grabFocus();
    }

    Houses.to_houses house = new Houses.to_houses(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, 0, "", 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, 0, new ArrayList(), "", "", 0, 0);

    public void do_pass(Houses.to_houses house1) {
        house = house1;
        jButton13.setVisible(true);
        tf_house_number.setFocusable(false);
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        //<editor-fold defaultstate="collapsed" desc=" set house details">
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;

        tf_house_number.setText(house1.house_no);
        reg.setId(house1.region_id);
        reg.setText(house1.region);
        prov.setId(house1.province_id);
        prov.setText(house1.province);
        cit.setId(house1.city_id);
        cit.setText(house1.city);
        bar.setId(house1.barangay_id);
        bar.setText(house1.barangay);
        pur.setId(house1.purok_id);
        pur.setText(house1.purok);

        tf_no_rooms.setText(FitIn.fmt_woc(house1.no_of_rooms));
        tf_buildings.setText(house1.bldg_types);
        tf_toilets.setText(house1.toilet_types);
        tf_bldg_permit.setText(house1.bldg_permit);
        tf_compartments.setText(house1.compartments);
        tf_bathrooms.setText(house1.bathroom_types);
        tf_disposals.setText(house1.waste_disposal_methods);
        tf_kitchens.setText(house1.kitchen_types);
        tf_transportations.setText(house1.trans_types);
        tf_roofs.setText(house1.construction_roof_types);
        tf_walls.setText(house1.construction_wall_types);
        tf_floors.setText(house1.construction_floor_types);
        tf_communications.setText(house1.construction_communication_types);

        tf_lighting.setText(house1.lighting_fuels);
        tf_cookings.setText(house1.cooking_fuels);
        tf_water_sources.setText(house1.water_sources);
        tf_drinking_water_src.setText(FitIn.fmt_wc_0(house1.drinking_water_source_distance));
        tf_nearest_water_src.setText(FitIn.fmt_wc_0(house1.nearest_water_source_distance));
        tf_nearest_water_src1.setText(house1.latitude);
        tf_nearest_water_src2.setText(house1.longtitude);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" load households ">
//        List<Households.to_households> households = house.households;
//        int row_to_select = 0;
//        int count = 0;
//        for (Households.to_households household : households) {
//            String where = " where household_no='" + household.household_no + "' ";
//            List<Household_assets.to_household_assets> assets = Household_assets.ret_data(where);
//            List<Household_expenditures.to_household_expenditures> household_expenditures = Household_expenditures.ret_data(where);
//            List<Household_consumptions.to_household_consumptions> household_consumptions = Household_consumptions.ret_data(where);
//            List<Household_members.to_household_members> household_members = Household_members.ret_data(where);
//            household.setAssets(assets);
//            household.setHousehold_expenditures(household_expenditures);
//            household.setHousehold_consumptions(household_consumptions);
//            household.setHousehold_members(household_members);
//            if (household.household_no.equalsIgnoreCase(member.household_no)) {
//                row_to_select = count;
//            }
//            count++;
//        }

//        Initialize_table_households.loadData_households(households);
//        tbl_households.getSelectionModel().setSelectionInterval(row_to_select, row_to_select);
//        jLabel2.setText("" + Initialize_table_households.tbl_households_ALM.size());
        //</editor-fold>
    }

    public void do_pass_new(String region, String region_id, String province, String province_id, String city, String city_id, String barangay, String barangay_id, String purok, String purok_id, Houses.to_houses house1) {
        house = house1;
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;
        reg.setText(region);
        reg.setId(region_id);
        prov.setText(province);
        prov.setId(province_id);
        cit.setText(city);
        cit.setId(city_id);
        bar.setText(barangay);
        bar.setId(barangay_id);
        pur.setText(purok);
        pur.setId(purok_id);
    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
        tf_region.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    regions();
                }
            }
        });
        tf_province.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    provinces();
                }
            }
        });
        tf_city.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    cities();
                }
            }
        });
        tf_barangay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    barangays();
                }
            }
        });
        tf_purok.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    puroks();
                }
            }
        });

        tf_buildings.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    building_types();
                }
            }
        });
        tf_toilets.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    toilet_types();
                }
            }
        });
        tf_compartments.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    compartments();
                }
            }
        });
        tf_bathrooms.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    bathroom_types();
                }
            }
        });
        tf_disposals.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    waste_disposal();
                }
            }
        });
        tf_kitchens.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    kitchen_types();
                }
            }
        });
        tf_transportations.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    transportation_types();
                }
            }
        });
        tf_roofs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    roof_types();
                }
            }
        });
        tf_walls.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    wall_types();
                }
            }
        });
        tf_floors.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    floor_types();
                }
            }
        });
        tf_communications.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    communication();
                }
            }
        });
        tf_lighting.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    lighting();
                }
            }
        });
        tf_cookings.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    lighting();
                }
            }
        });
        tf_water_sources.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    water_sources();
                }
            }
        });
        tf_drinking_water_src.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    water_sources();
                }
            }
        });
        tf_nearest_water_src.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_F1) {
                    water_sources();
                }
            }
        });
    }

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" prompts ">
    private void regions() {
        Window p = (Window) this;
        Dlg_regions nd = Dlg_regions.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_regions.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_regions.OutputData data) {
                Initialize_search_record_field_types.ret_data_regions();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void provinces() {
        Window p = (Window) this;
        Dlg_provinces nd = Dlg_provinces.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_provinces.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_provinces.OutputData data) {
                Initialize_search_record_field_types.ret_data_provinces();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void cities() {
        Window p = (Window) this;
        Dlg_cities nd = Dlg_cities.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_cities.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cities.OutputData data) {
                Initialize_search_record_field_types.ret_data_cities();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void barangays() {
        Window p = (Window) this;
        Dlg_barangays nd = Dlg_barangays.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_barangays.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_barangays.OutputData data) {
                Initialize_search_record_field_types.ret_data_barangays();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void puroks() {
        Window p = (Window) this;
        Dlg_puroks nd = Dlg_puroks.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_puroks.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_puroks.OutputData data) {
                Initialize_search_record_field_types.ret_data_puroks();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void building_types() {
        Window p = (Window) this;
        Dlg_building_types nd = Dlg_building_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_building_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_building_types.OutputData data) {
                Initialize_house_field_types.ret_data_building();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void toilet_types() {
        Window p = (Window) this;
        Dlg_toilet_types nd = Dlg_toilet_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_toilet_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_toilet_types.OutputData data) {
                Initialize_house_field_types.ret_data_toilet();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void compartments() {
        Window p = (Window) this;
        Dlg_compartments nd = Dlg_compartments.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_compartments.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_compartments.OutputData data) {
                Initialize_house_field_types.ret_data_compartments();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void bathroom_types() {
        Window p = (Window) this;
        Dlg_bathroom_types nd = Dlg_bathroom_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_bathroom_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_bathroom_types.OutputData data) {
                Initialize_house_field_types.ret_data_bathroom();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void waste_disposal() {
        Window p = (Window) this;
        Dlg_solid_waste_disposal_methods nd = Dlg_solid_waste_disposal_methods.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_solid_waste_disposal_methods.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_solid_waste_disposal_methods.OutputData data) {
                Initialize_house_field_types.ret_data_solid();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void kitchen_types() {
        Window p = (Window) this;
        Dlg_kitchen_types nd = Dlg_kitchen_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_kitchen_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_kitchen_types.OutputData data) {
                Initialize_house_field_types.ret_data_kitchen();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void transportation_types() {
        Window p = (Window) this;
        Dlg_transportation_types nd = Dlg_transportation_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_transportation_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_transportation_types.OutputData data) {
                Initialize_house_field_types.ret_data_transportation();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void roof_types() {
        Window p = (Window) this;
        Dlg_roof_types nd = Dlg_roof_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_roof_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_roof_types.OutputData data) {
                Initialize_house_field_types.ret_data_roofs();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void wall_types() {
        Window p = (Window) this;
        Dlg_wall_types nd = Dlg_wall_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_wall_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_wall_types.OutputData data) {
                Initialize_house_field_types.ret_data_walls();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void floor_types() {
        Window p = (Window) this;
        Dlg_floor_types nd = Dlg_floor_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_floor_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_floor_types.OutputData data) {
                Initialize_house_field_types.ret_data_floor();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void communication() {
        Window p = (Window) this;
        Dlg_communication nd = Dlg_communication.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_communication.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_communication.OutputData data) {
                Initialize_house_field_types.ret_data_communication();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void lighting() {
        Window p = (Window) this;
        Dlg_cooking_lightning_types nd = Dlg_cooking_lightning_types.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_cooking_lightning_types.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_cooking_lightning_types.OutputData data) {
                Initialize_house_field_types.ret_data_cooking();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void water_sources() {
        Window p = (Window) this;
        Dlg_water_sources nd = Dlg_water_sources.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_water_sources.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_water_sources.OutputData data) {
                Initialize_house_field_types.ret_data_water();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }
    //</editor-fold>

    private void ret_default_location() {
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;

        String where = " where is_default=1";
        List<Barangays.to_barangays> datas = Barangays.ret_data(where);
        Barangays.to_barangays location = datas.get(0);

        reg.setId("" + location.region_id);
        reg.setText(location.region);
        prov.setId("" + location.province_id);
        prov.setText(location.province);
        cit.setId("" + location.city_id);
        cit.setText(location.city);
        bar.setId("" + location.id);
        bar.setText(location.barangay);

    }

    //<editor-fold defaultstate="collapsed" desc=" Households ">
    private void new_household() {
        final Field.Combo reg = (Field.Combo) tf_region;
        final Field.Combo pro = (Field.Combo) tf_province;
        final Field.Combo cit = (Field.Combo) tf_city;
        final Field.Combo bar = (Field.Combo) tf_barangay;
        final Field.Combo pur = (Field.Combo) tf_purok;

        List<Households.to_households> households = Initialize_table_households.tbl_households_ALM;

        String household_no = "";
        for (Households.to_households household : households) {
            household_no = household.household_no;
        }
        if (households.isEmpty()) {
            household_no = tf_house_number.getText() + "-01";
        } else {
            household_no = ReceiptIncrementor.increment(household_no);
        }
        String house_no = tf_house_number.getText();
        Window p = (Window) this;
        Dlg_households nd = Dlg_households.create(p, true);
        nd.setTitle("");
        nd.do_pass_new(household_no, reg.getText(), reg.getId(), pro.getText(), pro.getId(), cit.getText(), cit.getId(), bar.getText(), bar.getId(), pur.getText(), pur.getId());
        nd.setCallback(new Dlg_households.Callback() {
            @Override
            public void ok(CloseDialog closeDialog, Dlg_households.OutputData data) {
                closeDialog.ok();
                if (house.id == 0) {

                    int id = 0;
                    String created_at = DateType.now();
                    String updated_at = DateType.now();
                    String created_by = MyUser.getUser_id();
                    String updated_by = MyUser.getUser_id();
                    String region = reg.getText();
                    String region_id = reg.getId();
                    String province = pro.getText();
                    String province_id = pro.getId();
                    String city = cit.getText();
                    String city_id = cit.getText();
                    String barangay = bar.getText();
                    String barangay_id = bar.getId();
                    String purok = pur.getText();
                    String purok_id = pur.getId();
                    int status = 0;
                    int is_uploaded = 0;
                    String house_no = tf_house_number.getText();
                    String household_no = data.household_no;
                    String occupancy_types = data.occupancy_types;
                    String tenure = data.tenure;
                    int is_occupant_owns_the_land = data.is_occupant_owns_the_land;
                    int is_occupant_owns_the_bldg = data.is_occupant_owns_the_bldg;
                    double monthly_rental = data.monthly_rental;
                    String drainage_system_concern = data.drainage_system_concern;
                    String street_maintenance_concern = data.street_maintenance_concern;
                    String garbage_collection_concern = data.garbage_collection_concern;
                    String fire_protection_concern = data.fire_protection_concern;
                    String police_protection_concern = data.police_protection_concern;
                    String ambulance_service_concern = data.ambulance_service_concern;
                    String livelihood_programs_concern = data.livelihood_programs_concern;
                    String adolescent_pregnancy_rate = data.adolescent_pregnancy_rate;
                    String child_abuse_rating = data.child_abuse_rating;
                    String crime_rating = data.crime_rating;
                    String domestic_violence_rating = data.domestic_violence_rating;
                    String drug_abuse_rating = data.drug_abuse_rating;
                    String hunger_rating = data.hunger_rating;
                    String environmental_contamination_rating = data.environmental_contamination_rating;
                    String health_disparities_rating = data.health_disparities_rating;
                    List<Household_assets.to_household_assets> assets = data.assets;
                    List<Household_expenditures.to_household_expenditures> household_expenditures = data.household_expenditures;
                    List<Household_consumptions.to_household_consumptions> household_consumptions = data.household_consumptions;
                    List<Household_members.to_household_members> household_members = data.household_members;
                    List<Household_source_of_income.to_household_source_of_income> household_source_of_income = data.household_source_of_income;
                    Households.to_households household = new Households.to_households(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, household_no, occupancy_types, tenure, is_occupant_owns_the_land, is_occupant_owns_the_bldg, monthly_rental, drainage_system_concern, street_maintenance_concern, garbage_collection_concern, fire_protection_concern, police_protection_concern, ambulance_service_concern, livelihood_programs_concern, adolescent_pregnancy_rate, child_abuse_rating, crime_rating, domestic_violence_rating, drug_abuse_rating, hunger_rating, environmental_contamination_rating, health_disparities_rating, assets, household_expenditures, household_consumptions, household_members, 0, household_source_of_income);
                    Initialize_table_households.tbl_households_ALM.add(household);
                    Initialize_table_households.tbl_households_M.fireTableDataChanged();
                    jLabel2.setText("" + Initialize_table_households.tbl_households_ALM.size());
                }
            }
        }
        );
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void select_household() {
        final int row = tbl_households.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Households.to_households household = (Households.to_households) Initialize_table_households.tbl_households_ALM.get(row);
        int col = tbl_households.getSelectedColumn();

        if (col == 2) {
            Window p = (Window) this;
            Dlg_households nd = Dlg_households.create(p, true);
            nd.setTitle("");
            nd.do_pass(household);
            nd.setCallback(new Dlg_households.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_households.OutputData data) {
                    closeDialog.ok();
                    if (house.id == 0) {

                        household.setOccupancy_types(data.occupancy_types);
                        household.setTenure(data.tenure);
                        household.setIs_occupant_owns_the_land(data.is_occupant_owns_the_land);
                        household.setIs_occupant_owns_the_bldg(data.is_occupant_owns_the_bldg);
                        household.setMonthly_rental(data.monthly_rental);
                        household.setDrainage_system_concern(data.drainage_system_concern);
                        household.setStreet_maintenance_concern(data.street_maintenance_concern);
                        household.setGarbage_collection_concern(data.garbage_collection_concern);
                        household.setFire_protection_concern(data.fire_protection_concern);
                        household.setPolice_protection_concern(data.police_protection_concern);
                        household.setAmbulance_service_concern(data.ambulance_service_concern);
                        household.setLivelihood_programs_concern(data.livelihood_programs_concern);
                        household.setAdolescent_pregnancy_rate(data.adolescent_pregnancy_rate);
                        household.setChild_abuse_rating(data.child_abuse_rating);
                        household.setCrime_rating(data.crime_rating);
                        household.setDomestic_violence_rating(data.domestic_violence_rating);
                        household.setDrug_abuse_rating(data.drug_abuse_rating);
                        household.setHunger_rating(data.hunger_rating);
                        household.setEnvironmental_contamination_rating(data.environmental_contamination_rating);
                        household.setHealth_disparities_rating(data.health_disparities_rating);
                        household.setAssets(data.assets);
                        household.setHousehold_expenditures(data.household_expenditures);
                        household.setHousehold_consumptions(data.household_consumptions);
                        household.setHousehold_members(data.household_members);

                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                tbl_households.getSelectionModel().clearSelection();
                                Initialize_table_households.tbl_household_members_M.fireTableDataChanged();

                            }
                        });
                    } else {

                    }
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 3) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    if (house.id == 0) {
                        Initialize_table_households.tbl_households_ALM.remove(row);
                        Initialize_table_households.tbl_households_M.fireTableDataChanged();
                        jLabel2.setText("" + Initialize_table_households.tbl_households_ALM.size());
                        Alert.set(3, "");
                    } else {

                    }
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }
    //</editor-fold>

    private void ok() {
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;

        String region = reg.getText();
        String region_id = reg.getId();
        String province = prov.getText();
        String province_id = prov.getText();
        String city = cit.getText();
        String city_id = cit.getId();
        String barangay = bar.getText();
        String barangay_id = bar.getId();
        String purok = pur.getText();
        String purok_id = pur.getId();
        int status = 1;
        String house_no = tf_house_number.getText();
        if (house_no.isEmpty()) {
            Alert.set(0, "Input House Number!");
            return;
        }
        String where = " where house_no='" + house_no + "' ";
        List<Houses.to_houses> datas = Houses.ret_data(where);
        if (!datas.isEmpty()) {
            Alert.set(0, "Duplicate House No, Retry!");
            return;
        }
        int no_of_rooms = FitIn.toInt(tf_no_rooms.getText());
        String bldg_types = tf_buildings.getText();
        String bldg_permit = tf_bldg_permit.getText();
        String toilet_types = tf_toilets.getText();
        String compartments = tf_compartments.getText();
        String bathroom_types = tf_bathrooms.getText();
        String waste_disposal_methods = tf_disposals.getText();
        String kitchen_types = tf_kitchens.getText();
        String trans_types = tf_transportations.getText();
        String construction_roof_types = tf_roofs.getText();
        String construction_wall_types = tf_walls.getText();
        String construction_floor_types = tf_floors.getText();
        String construction_communication_types = tf_communications.getText();
        String lighting_fuels = tf_lighting.getText();
        String cooking_fuels = tf_cookings.getText();
        String water_sources = tf_water_sources.getText();
        double drinking_water_source_distance = FitIn.toDouble(tf_drinking_water_src.getText());
        double nearest_water_source_distance = FitIn.toDouble(tf_nearest_water_src.getText());
        List<Households.to_households> households = Initialize_table_households.tbl_households_ALM;
        String latitude = tf_nearest_water_src1.getText();
        String longtitude = tf_nearest_water_src2.getText();
        int no_of_households = 0;
        int no_of_household_members = 0;

        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance, households, latitude, longtitude));
        }
    }

    private void update_house() {
        //<editor-fold defaultstate="collapsed" desc=" Update ">
        Field.Combo reg = (Field.Combo) tf_region;
        Field.Combo prov = (Field.Combo) tf_province;
        Field.Combo cit = (Field.Combo) tf_city;
        Field.Combo bar = (Field.Combo) tf_barangay;
        Field.Combo pur = (Field.Combo) tf_purok;
        int id = house.id;
        String created_at = house.created_at;
        String updated_at = house.updated_at;
        String created_by = house.created_by;
        String updated_by = house.updated_by;
        String region = reg.getText();
        String region_id = reg.getId();
        String province = prov.getText();
        String province_id = prov.getId();
        String city = cit.getText();
        String city_id = cit.getId();
        String barangay = bar.getText();
        String barangay_id = bar.getId();
        String purok = pur.getText();
        String purok_id = pur.getId();
        int status = house.status;
        int is_uploaded = house.is_uploaded;
        String house_no = house.house_no;
        if (house_no.isEmpty()) {
            Alert.set(0, "Input House Number!");
            return;
        }
        int no_of_rooms = FitIn.toInt(tf_no_rooms.getText());
        String bldg_types = tf_buildings.getText();
        String bldg_permit = tf_bldg_permit.getText();
        String toilet_types = tf_toilets.getText();
        String compartments = tf_compartments.getText();
        String bathroom_types = tf_bathrooms.getText();
        String waste_disposal_methods = tf_disposals.getText();
        String kitchen_types = tf_kitchens.getText();
        String trans_types = tf_transportations.getText();
        String construction_roof_types = tf_roofs.getText();
        String construction_wall_types = tf_walls.getText();
        String construction_floor_types = tf_floors.getText();
        String construction_communication_types = tf_communications.getText();
        String lighting_fuels = tf_lighting.getText();
        String cooking_fuels = tf_cookings.getText();
        String water_sources = tf_water_sources.getText();
        double drinking_water_source_distance = FitIn.toDouble(tf_drinking_water_src.getText());
        double nearest_water_source_distance = FitIn.toDouble(tf_nearest_water_src.getText());
        List<Households.to_households> households = new ArrayList();
        String latitude = tf_nearest_water_src1.getText();
        String longtitude = tf_nearest_water_src2.getText();

        if (status == 0 && is_uploaded == 0) {
            status = 2;
        } else if ((status == 0 && is_uploaded == 1) || (status == 2 && is_uploaded == 1)) {
            status = 1;
            is_uploaded = 0;
        } else {
            is_uploaded = 0;
        }

        Houses.to_houses hou = new Houses.to_houses(id, created_at, updated_at, created_by, updated_by, region, region_id, province, province_id, city, city_id, barangay, barangay_id, purok, purok_id, status, is_uploaded, house_no, no_of_rooms, bldg_types, bldg_permit, toilet_types, compartments, bathroom_types, waste_disposal_methods, kitchen_types, trans_types, construction_roof_types, construction_wall_types, construction_floor_types, construction_communication_types, lighting_fuels, cooking_fuels, water_sources, drinking_water_source_distance, nearest_water_source_distance, households, latitude, longtitude, 0, 0);
        Houses.update_data(hou);
        Alert.set(2, "");
        //</editor-fold>
    }
}
