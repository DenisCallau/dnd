package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class HeavyCrossbow extends Weapon {
	
	public HeavyCrossbow() {
		name = "Heavy Crossbow";
		weight = 18;
		price = 50;
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 100);
		range.put("max", 400);
	}

}
