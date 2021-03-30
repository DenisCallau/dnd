package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class LightCrossbow extends Weapon {
	
	public LightCrossbow() {
		name = "Light Crossbow";
		weight = 5;
		price = 25;
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.LOADING);
		properties.add(WeaponProperties.TWO_HANDED);
		properties.add(WeaponProperties.AMMUNITION);
		range.put("min", 80);
		range.put("max", 320);
	}

}
