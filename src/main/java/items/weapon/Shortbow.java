package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Shortbow extends Weapon {
	
	public Shortbow() {
		name = "Shortbow";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(25, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 80);
		range.put("max", 320);
	}

}
