package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Trident extends Weapon {
	
	public Trident() {
		name = "Trident";
		weight = 4;
		price = 5;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}	
	

}
