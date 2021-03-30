package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Dagger extends Weapon {
	
	public Dagger() {
		name = "Dagger";
		weight = 1;
		price = 2;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);		
	}

}
