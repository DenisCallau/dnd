package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Greataxe extends Weapon {
	
	public Greataxe() {
		name = "Greataxe";
		weight = new Weight(7, WeightUnits.POUND);
		price = new Price(30, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D12;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}

}
