package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Battleaxe extends Weapon {
	
	public Battleaxe() {
		name = "Battleaxe";
		weight = 4;
		price = 10;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D8;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.VERSATILE);
		versatileDice = Dices.D10;
	}

}
