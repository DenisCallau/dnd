package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Pike extends Weapon {
	
	public Pike() {
		name = "Pike";
		weight = new Weight(18, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	

}
