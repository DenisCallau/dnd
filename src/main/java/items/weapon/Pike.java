package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Pike extends Weapon {
	
	public Pike() {
		name = "Pike";
		weight = 18;
		price = 5;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	

}
