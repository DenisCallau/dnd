package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Longbow extends Weapon {
	
	public Longbow() {
		name = "Longbow";
		weight = 2;
		price = 50;
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 150);
		range.put("max", 600);
	}

}
