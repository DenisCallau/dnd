package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class HandCrossbow extends Weapon {
	
	public HandCrossbow() {
		name = "Hand Crossbow";
		weight = 3;
		price = 75;
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 30);
		range.put("max", 120);
	}

}
