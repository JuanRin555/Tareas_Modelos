
package harrypotter_videogame;

import harrypotter_videogame.spells.*;
import harrypotter_videogame.characters.*;

public class HarryPotter_Videogame {

    public static void main(String[] args) {

        Character harry = new HarryPotter();
        Character ron = new RonWeasley();
        Character hermione = new HermioneGranger();

        harry.showCharacter();
        harry.useSpell();

        ron.showCharacter();
        ron.useSpell();

        hermione.showCharacter();
        hermione.useSpell();

        System.out.println("\n--- Hermione changes spell ---\n");

        hermione.setSpell(new OculusReparo());
        hermione.useSpell();
    }
}