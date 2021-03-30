package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Scimitar extends Weapon {
	
	public Scimitar() {
		name = "Scimitar";
		weight = 3;
		price = 25;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D6;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.FINESSE);
		properties.add(WeaponProperties.LIGHT);
	}	
	

}
