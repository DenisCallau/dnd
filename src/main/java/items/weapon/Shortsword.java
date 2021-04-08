package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Shortsword extends Weapon {
	
	public Shortsword() {
		name = "Shortsword";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
	}	
	

}
