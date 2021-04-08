package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Longsword extends Weapon {
	
	public Longsword() {
		name = "Longsword";
		weight = new Weight(3, WeightUnits.POUND);
		price = new Price(15, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D10;
		
	}	

}
