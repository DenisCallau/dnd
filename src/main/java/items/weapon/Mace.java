package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;


public class Mace extends Weapon {
	
	public Mace() {
		name = "Mace";
		weight = new Weight(4, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.BLUDGEONING;
	}

}
