package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Greatclub extends Weapon {
	
	public Greatclub() {
		name = "Greatclub";
		weight = new Weight(10, WeightUnits.POUND);
		price = new Price(2, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.TWO_HANDED);		
	}

}
