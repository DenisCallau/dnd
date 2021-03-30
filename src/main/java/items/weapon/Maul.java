package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Maul extends Weapon {
	
	public Maul() {
		name = "Maul";
		weight = 10;
		price = 10;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6; //TODO: 2 D6
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}	
	

}
