package helpers;

import constants.Dices;

public abstract class DamageCalculator {

    public static int calculateDamage(Dices dice, int quantity) {
        return dice.roll() * quantity;
    }

}
