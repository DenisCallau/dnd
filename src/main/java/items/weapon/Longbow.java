package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Longbow extends Weapon {
	
	public Longbow() {
		name = "Longbow";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(50, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.AMMUNITION);
		range = new Range(150, 600);
	}

}
