package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Quarterstaff extends Weapon {
	
	public Quarterstaff() {
		name = "Quarterstaff";
		weight = new Weight(4, WeightUnits.POUND);
		price = new Price(2, CurrencyUnits.SILVER);
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
	}

}
