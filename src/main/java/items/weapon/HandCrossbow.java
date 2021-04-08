package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class HandCrossbow extends Weapon {
	
	public HandCrossbow() {
		name = "Hand Crossbow";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(75, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.AMMUNITION);
		range = new Range(30, 120);
	}

}
