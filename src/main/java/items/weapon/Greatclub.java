package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Greatclub extends Weapon {
	
	public Greatclub() {
		name = "Greatclub";
		weight = 10;
		price = 0.2;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.TWO_HANDED);		
	}

}
