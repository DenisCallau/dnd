package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class LightCrossbow extends Weapon {
	
	public LightCrossbow() {
		name = "Light Crossbow";
		weight = new Weight(5, WeightUnits.POUND);
		price = new Price(25, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range = new Range(80, 320);
	}

}
