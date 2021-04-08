package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Halberd extends Weapon {

	public Halberd() {
		name = "Halberd";
		weight = new Weight(6, WeightUnits.POUND);
		price = new Price(20, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	
}
