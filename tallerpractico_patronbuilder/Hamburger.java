
package tallerpractico_patronbuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hamburger {

    private final String breadType;
    private final String meatType;

    private final boolean cheese;
    private final List<String> extraIngredients;

    private Hamburger(Builder hamburgerBuilder) {
        this.breadType = hamburgerBuilder.breadType;
        this.meatType = hamburgerBuilder.meatType;
        this.cheese = hamburgerBuilder.cheese;

        this.extraIngredients = Collections.unmodifiableList(
                new ArrayList<>(hamburgerBuilder.extraIngredients)
        );
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public List<String> getExtraIngredients() {
        return extraIngredients;
    }

    @Override
    public String toString() {
        return "Hamburger Details:\n" +
                "Bread Type: " + breadType + "\n" +
                "Meat Type: " + meatType + "\n" +
                "Cheese: " + (cheese ? "Yes" : "No") + "\n" +
                "Extra Ingredients: " +
                (extraIngredients.isEmpty() ? "None" : extraIngredients) +
                "\n";
    }

    public static class Builder {

        private final String breadType;
        private final String meatType;

        private boolean cheese = false;
        private List<String> extraIngredients = new ArrayList<>();

        public Builder(String breadType, String meatType) {
            this.breadType = breadType;
            this.meatType = meatType;
        }

        public Builder addCheese(boolean hasCheese) {
            this.cheese = hasCheese;
            return this;
        }

        public Builder addExtraIngredient(String ingredient) {
            this.extraIngredients.add(ingredient);
            return this; 
        }

        public Hamburger build() {
            return new Hamburger(this);
        }
    }
}
