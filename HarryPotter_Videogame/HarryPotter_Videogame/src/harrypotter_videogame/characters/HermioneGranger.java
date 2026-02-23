
package harrypotter_videogame.characters;

import harrypotter_videogame.spells.WingardiumLeviosa;
import harrypotter_videogame.Character;

public class HermioneGranger extends Character {

    public HermioneGranger() {
        spell = new WingardiumLeviosa();
    }

    @Override
    public void showCharacter() {
        System.out.println(" I'm Hermione Granger ");
    }
}
