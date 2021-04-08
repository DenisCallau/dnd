package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Range;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Trident extends Weapon {
	
	public Trident() {
		name = "Trident";
		weight = new Weight(4, WeightUnits.POUND);
		price = new Price(5, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
		properties.add(WeaponProperties.THROWN);
		range = new Range(20, 60);
	}	
	

}
