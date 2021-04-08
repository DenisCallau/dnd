package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Sling extends Weapon {
	
	public Sling() {
		name = "Sling";
		weight = new Weight(0, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 30);
		range.put("max", 120);
	}

}
