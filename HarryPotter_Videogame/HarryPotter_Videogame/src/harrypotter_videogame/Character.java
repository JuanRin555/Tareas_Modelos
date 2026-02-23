
package harrypotter_videogame;

import harrypotter_videogame.spells.Spell;

public abstract class Character {

    protected Spell spell;

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void useSpell() {
        if (spell != null) {
            spell.useSpell();
        } else {
            System.out.println(" It has no assigned spell ");
        }
    }

    public abstract void showCharacter();
}