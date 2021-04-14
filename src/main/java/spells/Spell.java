package spells;


import helpers.*;

import java.util.ArrayList;

public abstract class Spell {

    protected String name;
    protected int level; //0 = Cantrip
    protected Schools school;
    protected ArrayList<Components> components = new ArrayList<>();
    protected String material;
    protected CastingTime castingTime;
    protected Duration duration;
    protected Range range;
    protected Target target;
    protected ArrayList<Target> possibleTargets = new ArrayList<>();
    protected AreaOfEffect areaOfEffect;
    protected boolean ritual;
    protected String description;
    protected String higherLevels;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Schools getSchool() {
        return school;
    }

    public ArrayList<Components> getComponents() {
        return components;
    }

    public String getMaterial() {
        return material;
    }

    public CastingTime getCastingTime() {
        return castingTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public Range getRange() {
        return range;
    }

    public Target getTarget() {
        return target;
    }

    public ArrayList<Target> getPossibleTargets() {
        return possibleTargets;
    }

    public AreaOfEffect getAreaOfEffect() {
        return areaOfEffect;
    }

    public boolean isRitual() {
        return ritual;
    }

    public String getDescription() {
        return description;
    }

    public String getHigherLevels() {
        return higherLevels;
    }
}
