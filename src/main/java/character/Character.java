package character;

import java.util.ArrayList;
import java.util.HashMap;

import classe.Classe;
import constants.Abilities;
import helpers.AbilityIncrementalHelper;
import items.armor.Armor;
import items.weapon.Weapon;
import proficiences.ArmorCategory;
import race.Race;
import spells.Spell;

public class Character {
	
	private AbilityIncrementalHelper aih = new AbilityIncrementalHelper();
	
	private Race race;
	private Classe classe;
	private String name;
	private int level;
	protected HashMap<Abilities, Integer> abilityBonus;
	private int hp;
	private ArrayList<Weapon> weaponList = new ArrayList<>();
	private ArrayList<Armor> armorList = new ArrayList<>();
	private ArrayList<Spell> spellList = new ArrayList<>();
	private boolean bludgeoningResistance;
	private boolean piercingResistance;
	private boolean slashingResistance;

	public Character(String name, Race race, Classe classe) {
		this.setName(name);
		this.race = race;
		this.classe = classe;
		this.level = 1;
		this.abilityBonus = aih.combineAbilityList(race.getAbilityBonus(), classe.getAbilityBonus());
		this.setHp(classe.getHp() + abilityBonus.get(Abilities.CONSTITUITION));
	}
	
	public Race getRace() {
		return race;
	}

	public Classe getClasse() {
		return classe;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	
	public HashMap<Abilities, Integer> getAbilityBonus() {
		return abilityBonus;
	}

	public ArrayList<ArmorCategory> getArmorProficiencies() {
		return classe.getArmorProficiency();
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public ArrayList<Weapon> getWeaponList() {
		return weaponList;
	}

	public ArrayList<Armor> getArmorList() {
		return armorList;
	}

	public ArrayList<Spell> getSpellList() {
		return spellList;
	}

	public void setSpellList(ArrayList<Spell> spellList) {
		this.spellList = spellList;
	}
	
	public boolean isBludgeoningResistance() {
		return bludgeoningResistance;
	}

	public void setBludgeoningResistance(boolean bludgeoningResistance) {
		this.bludgeoningResistance = bludgeoningResistance;
	}

	public boolean isPiercingResistance() {
		return piercingResistance;
	}

	public void setPiercingResistance(boolean piercingResistance) {
		this.piercingResistance = piercingResistance;
	}

	public boolean isSlashingResistance() {
		return slashingResistance;
	}

	public void setSlashingResistance(boolean slashingResistance) {
		this.slashingResistance = slashingResistance;
	}

}
