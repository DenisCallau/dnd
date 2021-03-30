package classe;

import java.util.ArrayList;
import java.util.HashMap;

import constants.Abilities;
import dice.Dice;
import proficiences.ArmorCategory;
import proficiences.WeaponCategory;

public class Classe {
	
	protected String name;
	protected int hp;
	protected Dice hpDice;
	protected ArrayList<Abilities> savingThrows = new ArrayList<Abilities>();
	protected ArrayList<ArmorCategory> armorProficiency = new ArrayList<ArmorCategory>();
	protected ArrayList<WeaponCategory> weaponProficiency = new ArrayList<WeaponCategory>();
	
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

	protected HashMap<Abilities, Integer> abilityBonus = new HashMap<Abilities, Integer>();

	public HashMap<Abilities, Integer> getAbilityBonus() {
		return this.abilityBonus;
	}
	
	public int getHp() {
		return hp;
	}

}
