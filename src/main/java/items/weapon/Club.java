package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Club extends Weapon {
	
	public Club() {
		name = "Club";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.LIGHT);		
	}

}
