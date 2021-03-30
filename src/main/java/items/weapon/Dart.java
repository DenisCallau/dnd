package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Dart extends Weapon {
	
	public Dart() {
		name = "Dart";
		weight = 0.25;
		price = 0.05;
		category = WeaponCategory.SIMPLE_RANGED_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}

}
