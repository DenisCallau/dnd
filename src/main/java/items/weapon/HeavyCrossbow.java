package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class HeavyCrossbow extends Weapon {
	
	public HeavyCrossbow() {
		name = "Heavy Crossbow";
		weight = new Weight(18, WeightUnits.POUND);
		price = new Price(50, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 100);
		range.put("max", 400);
	}

}
