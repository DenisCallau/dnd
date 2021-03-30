package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Halberd extends Weapon {

	public Halberd() {
		name = "Halberd";
		weight = 6;
		price = 20;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D10;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.REACH);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	
}
