package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Blowgun extends Weapon {
	
	public Blowgun() {
		name = "Blowgun";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(10, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D4; //TODO: Fixed 1 damage
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.AMMUNITION);
		range = new Range(25, 100);
	}	

}
