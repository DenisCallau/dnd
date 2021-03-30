package helpers;

import constants.CurrencyTypes;
import constants.Dices;
import constants.MeasureUnits;

public class AlchemistsFire extends AttackItem {

    public AlchemistsFire() {
        name = "Alchemist's Fire";
        weight = new Measure(1, MeasureUnits.POUND);
        price = new Currency(50, CurrencyTypes.GOLD);
        description = "This sticky, adhesive fluid ignites when exposed to air. As an action, you can throw this flask up to 20 feet, shattering it on impact. Make a ranged Attack against a creature or object, treating the alchemist's fire as an Improvised Weapon. On a hit, the target takes 1d4 fire damage at the start of each of its turns. A creature can end this damage by using its action to make a DC 10 Dexterity check to extinguish the flames.";
        damageDice = Dices.D4;
        diceNumber = 1;

    }

    @Override
    public int doDamage() {
        return DamageCalculator.calculateDamage(damageDice, diceNumber);
    }
}
