
package harrypotter_videogame.characters;

import harrypotter_videogame.spells.ExpectoPatronum;
import harrypotter_videogame.Character;

public class HarryPotter extends Character {

    public HarryPotter() {

        spell = new ExpectoPatronum();
    }

    @Override
    public void showCharacter() {
        System.out.println(" I'm Harry Potter ");
    }
}
