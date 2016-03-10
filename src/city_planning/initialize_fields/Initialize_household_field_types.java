/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.initialize_fields;

import city_planning.household_concerns.Household_concerns;
import city_planning.household_concerns.Household_concerns.to_household_member_concerns;
import city_planning.household_problems.Household_problems;
import static city_planning.initialize_fields.Initialize_household_field_types.problems;
import city_planning.util.TableRenderer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Initialize_household_field_types {

    static List<Household_concerns.to_household_member_concerns> concerns = new ArrayList();
    static List<Household_problems.to_household_member_problems> problems = new ArrayList();

    public static void ret_data() {

        Household_concerns.to_household_member_concerns concern1 = new Household_concerns.to_household_member_concerns(1, "Excellent");
        Household_concerns.to_household_member_concerns concern2 = new Household_concerns.to_household_member_concerns(2, "Adequate");
        Household_concerns.to_household_member_concerns concern3 = new Household_concerns.to_household_member_concerns(3, "Inadequate");
        concerns.add(concern1);
        concerns.add(concern2);
        concerns.add(concern3);

        Household_problems.to_household_member_problems problem1 = new Household_problems.to_household_member_problems(1, "Very Low");
        Household_problems.to_household_member_problems problem2 = new Household_problems.to_household_member_problems(2, "Average");
        Household_problems.to_household_member_problems problem3 = new Household_problems.to_household_member_problems(3, "Low");
        Household_problems.to_household_member_problems problem4 = new Household_problems.to_household_member_problems(4, "Above Average");
        Household_problems.to_household_member_problems problem5 = new Household_problems.to_household_member_problems(5, "High");
        Household_problems.to_household_member_problems problem6 = new Household_problems.to_household_member_problems(6, "Excellent");
        problems.add(problem1);
        problems.add(problem2);
        problems.add(problem3);
        problems.add(problem4);
        problems.add(problem5);
        problems.add(problem6);

    }

    //<editor-fold defaultstate="collapsed" desc=" Concerns "> 
    public static void init_concerns(final JTextField tf) {

        Object[][] obj = new Object[concerns.size()][1];
        int i = 0;
        for (Household_concerns.to_household_member_concerns to : concerns) {
            obj[i][0] = " " + to.concerns;
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
                Household_concerns.to_household_member_concerns to = concerns.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.concerns);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc=" Problems "> 

    public static void init_problems(final JTextField tf) {

        Object[][] obj = new Object[problems.size()][1];
        int i = 0;
        for (Household_problems.to_household_member_problems to : problems) {
            obj[i][0] = " " + to.problems;
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
                Household_problems.to_household_member_problems to = problems.get(data.selected_row);
                Field.Combo field = (Field.Combo) tf;
                field.setText(to.problems);
                field.setId("" + to.id);
            }
        });
    }
//</editor-fold> 
}
