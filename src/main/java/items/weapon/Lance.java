package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Lance extends Weapon {
	
	public Lance() {
		name = "Lance";
		weight = new Weight(6, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D12;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.SPECIAL);
	}	

}
