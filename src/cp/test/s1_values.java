/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadruoj19
 */
public class s1_values {
        public static class items {

        public final String item_code;
        public final String description;

        public items(String item_code, String description) {
            this.item_code = item_code;
            this.description = description;
        }

    }

    public static List<items> ret_items() {
        List<items> items = new ArrayList();

        items to1 = new items("001", "Item1");
        items to2 = new items("002", "Item2");
        items to3 = new items("003", "Item3");
        items to4 = new items("004", "Item4");
        items to5 = new items("005", "Item5");

        items.add(to1);
        items.add(to2);
        items.add(to3);
        items.add(to4);
        items.add(to5);

        return items;

    }
}
