package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Morningstar extends Weapon {
	
	public Morningstar() {
		name = "Morningstar";
		weight = new Weight(4, WeightUnits.POUND);
		price = new Price(15, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
	}	
	

}
