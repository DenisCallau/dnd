package helpers;

import character.Character;
import spells.Spell;

public class SpellcastManager {

    private Character user;
    private Spell spell;
    private Character target;

    public SpellcastManager(Character user, Spell spell, Character target) {
        this.user = user;
        this.spell = spell;
        this.target = target;
    }

    public boolean canCast(Character user, Spell spell, Character target) {

        // check components
        // have materials
        // have line of sight

        return false;
    }


}
