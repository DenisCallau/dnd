package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Spear extends Weapon {
	
	public Spear() {
		name = "Spear";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(1, CurrencyUnits.GOLD);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}	

}
