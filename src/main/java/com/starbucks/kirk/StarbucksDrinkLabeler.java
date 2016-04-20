package com.starbucks.kirk;

import com.google.common.base.Joiner;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Daniel Hinojosa
 * @since 4/20/16 4:21 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class StarbucksDrinkLabeler {
    private String label;

    private Set<String> sizes;
    private Set<String> drinks;
    private Set<String> sizeChoices;
    public StarbucksDrinkLabeler() {

        this.label = "";
        sizes = new HashSet<>();
        drinks = new HashSet<>();
        sizeChoices = new HashSet<>();
        sizeChoices.add("Tall");
        sizeChoices.add("Grande");
        sizeChoices.add("Venti");
        sizeChoices.add("Short");
        sizeChoices.add("Trenta");
    }

    public String getLabel() {
        return label;
    }

    public void addItem(String item) {
         if (sizeChoices.contains(item)) {
             sizes.add(item);
         } else {
             drinks.add(item);
         }
         this.label = Joiner.on(",").join(sizes) + ", " + Joiner.on(",").join(drinks);
    }
}
