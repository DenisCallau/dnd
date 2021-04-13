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

}
