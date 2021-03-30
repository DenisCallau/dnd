package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Spear extends Weapon {
	
	public Spear() {
		name = "Spear";
		weight = 3;
		price = 1;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.PIERCING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}	

}
