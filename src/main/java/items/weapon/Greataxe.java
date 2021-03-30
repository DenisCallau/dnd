package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class Greataxe extends Weapon {
	
	public Greataxe() {
		name = "Greataxe";
		weight = 7;
		price = 30;
		category = WeaponCategory.MARTIAL_MELEE_WEAPON;
		damage = Dices.D12;
		damageType = DamageTypes.SLASHING;
		properties.add(WeaponProperties.HEAVY);
		properties.add(WeaponProperties.TWO_HANDED);
	}

}
