package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Sling extends Weapon {
	
	public Sling() {
		name = "Sling";
		weight = 0;
		price = 0.1;
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 30);
		range.put("max", 120);
	}

}
