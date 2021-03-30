package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Blowgun extends Weapon {
	
	public Blowgun() {
		name = "Blowgun";
		weight = 1;
		price = 10;
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D4; //TODO: Fixed 1 damage
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 25);
		range.put("max", 100);
	}	

}
