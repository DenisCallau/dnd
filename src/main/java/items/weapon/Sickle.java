package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Sickle extends Weapon {
	
	public Sickle() {
		name = "Sickle";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.LIGHT);
	}

}
