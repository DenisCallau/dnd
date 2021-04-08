package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Javelin extends Weapon {
	
	public Javelin() {
		name = "Javelin";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.THROWN);
		range.put("min", 30);
		range.put("max", 120);
	}

}
