package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Maul extends Weapon {
	
	public Maul() {
		name = "Maul";
		weight = new Weight(10, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6; //TODO: 2 D6
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	

}
