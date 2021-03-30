package items.weapon;

import proficiences.WeaponCategory;

public class Net extends Weapon {
	
	public Net() {
		name = "Net";
		weight = 3;
		price = 1;
		category = WeaponCategory.MARTIAL_RANGED_WEAPON;
		properties.add(WeaponProperties.SPECIAL);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 5);
		range.put("max", 15);
	}

}
