
package tallerpractico_patronbuilder;

public class TallerPractico_PatronBuilder {

    public static void main(String[] args) {

        Hamburger classicBurger = new Hamburger.Builder("Sesame", "Beef")
                .addCheese(true)
                .addExtraIngredient("Lettuce")
                .addExtraIngredient("Tomato")
                .addExtraIngredient("Onion")
                .build();

        Hamburger chickenBurger = new Hamburger.Builder("Whole Wheat", "Chicken")
                .addCheese(false)
                .addExtraIngredient("Bacon")
                .build();

        System.out.println("=== Classic Hamburger ===");
        System.out.println(classicBurger);

        System.out.println("=== Chicken Hamburger ===");
        System.out.println(chickenBurger);
    }
}