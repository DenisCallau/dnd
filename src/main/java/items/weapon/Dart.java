package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Dart extends Weapon {
	
	public Dart() {
		name = "Dart";
		weight = new Weight(4, WeightUnits.OUNCE);
		price = new Price(5, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.THROWN);
		range = new Range(20, 60);

	}

}
