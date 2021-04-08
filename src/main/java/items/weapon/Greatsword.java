package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Greatsword extends Weapon {
	
	public Greatsword() {
		name = "Greatsword";
		weight = new Weight(6, WeightUnits.POUND);
		price = new Price(50, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6; //TODO: 2 D6
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}

}
