package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Javelin extends Weapon {
	
	public Javelin() {
		name = "Javelin";
		weight = 2;
		price = 0.5;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.THROWN);
		range.put("min", 30);
		range.put("max", 120);
	}

}
