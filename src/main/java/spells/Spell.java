package spells;

import java.util.ArrayList;

import character.Character;
import dices.D20;
import dices.Dice;

public abstract class Spell {
	
	protected String name;
	protected int level;
	protected SpellSchools school;
	protected SpellCastingTime castingTime;
	protected SpellRange range;
	protected Character caster;
	protected ArrayList<SpellComponents> components = new ArrayList<>();
	protected SpellDuration duration;
	protected boolean concentration;
	protected SpellTarget target;
	protected SpellAreaOfEffect areaOfEffect;
	protected String description;
	protected String atHigherLevelsDescription;
	protected Dice valueDice;
	protected int numberOfDices;
	
	public int rollHit() {
		return new D20().roll();
	}
	
	public int rollValue() {
		int value = 0;		
		ArrayList<Integer> rolls = new ArrayList<>(); 		
		for(int i = 0; i < numberOfDices; i++) {
			rolls.add(valueDice.roll());
		}		
		for (Integer roll : rolls) {
			System.out.println(roll + " + ");
			value += roll;
		}
		return value;
	}
	
}
