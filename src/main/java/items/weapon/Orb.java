package items.weapon;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Orb extends Weapon {
	
	public Orb() {
		name = "Orb";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(20, CurrencyUnits.GOLD);
		category = WeaponCategory.ARCANE_FOCUS;
	}	

}
