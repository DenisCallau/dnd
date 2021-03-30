package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Quarterstaff extends Weapon {
	
	public Quarterstaff() {
		name = "Quarterstaff";
		weight = 4;
		price = 0.2;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D8;
	}

}
