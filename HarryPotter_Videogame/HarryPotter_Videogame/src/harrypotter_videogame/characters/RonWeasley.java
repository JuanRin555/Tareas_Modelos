
package harrypotter_videogame.characters;

import harrypotter_videogame.spells.Expelliarmus;
import harrypotter_videogame.Character;
 
public class RonWeasley extends Character {

    public RonWeasley() {
        spell = new Expelliarmus();
    }

    @Override
    public void showCharacter() {
        System.out.println(" I'm Ron Weasley ");
    }
}