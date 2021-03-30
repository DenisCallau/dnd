package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Sickle extends Weapon {
	
	public Sickle() {
		name = "Sickle";
		weight = 2;
		price = 1;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.LIGHT);
	}

}
