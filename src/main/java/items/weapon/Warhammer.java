package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Warhammer extends Weapon {
	
	public Warhammer() {
		name = "Warhammer";
		weight = 2;
		price = 15;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D10;
		
	}	
	

}
