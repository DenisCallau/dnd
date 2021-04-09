package spells;


import helpers.*;

public abstract class Spell {
	
    protected String name;
    protected int level; //0 = Cantrip
    protected Schools school;
    protected Components[] components;
    protected CastingTime castingTime;
    protected Duration duration;
    protected Range range;
    protected Target target;
    protected Target[] possibleTargets;
    protected AreaOfEffect areaOfEffect;
    protected boolean ritual;
    protected String description;
    protected String higherLevels;

}
