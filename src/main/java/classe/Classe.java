package classe;

import java.util.ArrayList;
import java.util.HashMap;

import constants.Abilities;
;
import constants.Dices;
import proficiences.ArmorCategory;
import proficiences.WeaponCategory;

public class Classe {
	
	protected String name;
	protected int hp;
	protected Dices hpDice;
	protected ArrayList<Abilities> savingThrows = new ArrayList<>();
	protected ArrayList<ArmorCategory> armorProficiency = new ArrayList<>();
	protected ArrayList<WeaponCategory> weaponProficiency = new ArrayList<>();
	
	public ArrayList<ArmorCategory> getArmorProficiency() {
		return armorProficiency;
	}

	public void setArmorProficiency(ArrayList<ArmorCategory> armorProficiency) {
		this.armorProficiency = armorProficiency;
	}

	public ArrayList<WeaponCategory> getWeaponProficiency() {
		return weaponProficiency;
	}

	public void setWeaponProficiency(ArrayList<WeaponCategory> weaponProficiency) {
		this.weaponProficiency = weaponProficiency;
	}

	protected HashMap<Abilities, Integer> abilityBonus = new HashMap<>();

	public HashMap<Abilities, Integer> getAbilityBonus() {
		return this.abilityBonus;
	}
	
	public int getHp() {
		return hp;
	}

}
