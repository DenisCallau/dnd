package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Handaxe extends Weapon {
	
	public Handaxe() {
		name = "Handaxe";
		weight = 2;
		price = 5;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}

}
