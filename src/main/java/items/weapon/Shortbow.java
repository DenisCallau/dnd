package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Shortbow extends Weapon {
	
	public Shortbow() {
		name = "Shortbow";
		weight = 2;
		price = 25;
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 80);
		range.put("max", 320);
	}

}
