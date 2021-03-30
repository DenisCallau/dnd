package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Lance extends Weapon {
	
	public Lance() {
		name = "Lance";
		weight = 6;
		price = 10;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D12;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.SPECIAL);
	}	

}
