package items.weapon;

import constants.DamageTypes;
import constants.Dices;
import proficiences.WeaponCategory;

public class LightHammer extends Weapon {
	
	public LightHammer() {
		name = "Light Hammer";
		weight = 2;
		price = 0.2;
		category = WeaponCategory.SIMPLE_MELEE_WEAPON;
		damage = Dices.D4;
		damageType = DamageTypes.BLUDGEONING;
		properties.add(WeaponProperties.LIGHT);
		properties.add(WeaponProperties.THROWN);
		range.put("min", 20);
		range.put("max", 60);
	}

}
