package items.weapon;

import constants.CurrencyUnits;
import constants.DamageTypes;
import constants.Dices;
import constants.WeightUnits;
import helpers.Price;
import helpers.Weight;
import proficiences.WeaponCategory;

public class Warhammer extends Weapon {
	
	public Warhammer() {
		name = "Warhammer";
		weight = new Weight(2, WeightUnits.POUND);
		price = new Price(15, CurrencyUnits.GOLD);
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D10;
		
	}	
	

}
