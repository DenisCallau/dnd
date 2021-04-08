package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class WarPick extends Weapon {
	
	public WarPick() {
		name = "War Pick";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
	}	
	

}
