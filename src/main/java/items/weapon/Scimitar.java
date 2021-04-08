package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Scimitar extends Weapon {
	
	public Scimitar() {
		name = "Scimitar";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(25, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
	}	
	

}
