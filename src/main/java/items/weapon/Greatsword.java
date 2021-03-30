package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Greatsword extends Weapon {
	
	public Greatsword() {
		name = "Greatsword";
		weight = 6;
		price = 50;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6; //TODO: 2 D6
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}

}
