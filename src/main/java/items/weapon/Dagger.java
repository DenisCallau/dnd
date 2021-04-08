package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Dagger extends Weapon {
	
	public Dagger() {
		name = "Dagger";
		weight = new Weight(1, WeightUnits.POUND);
		price = new Price(2, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);		
	}

}
