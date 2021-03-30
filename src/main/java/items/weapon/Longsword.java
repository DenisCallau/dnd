package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Longsword extends Weapon {
	
	public Longsword() {
		name = "Longsword";
		weight = 3;
		price = 15;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D10;
		
	}	

}
