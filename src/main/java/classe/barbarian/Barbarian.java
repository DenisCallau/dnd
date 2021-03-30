package classe.barbarian;

import classe.Classe;
import constants.Abilities;
import dice.D12;
import proficiences.ArmorCategory;
import proficiences.WeaponCategory;

public class Barbarian extends Classe {
	
	public Barbarian() {
		this.name = "Barbarian";
		this.hp = 12;
		this.hpDice = new D12();
		
		savingThrows.add(Abilities.STRENGTH);
		savingThrows.add(Abilities.CONSTITUITION);
		
		armorProficiency.add(ArmorCategory.LIGHT_ARMOR);
		armorProficiency.add(ArmorCategory.MEDIUM_ARMOR);
		armorProficiency.add(ArmorCategory.SHIELDS);
		
		weaponProficiency.add(WeaponCategory.SIMPLE_MELEE_WEAPON);
		weaponProficiency.add(WeaponCategory.SIMPLE_RANGED_WEAPON);
		weaponProficiency.add(WeaponCategory.MARTIAL_MELEE_WEAPON);
		weaponProficiency.add(WeaponCategory.MARTIAL_RANGED_WEAPON);
		
		
		
	}

}
