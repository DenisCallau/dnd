package spells.two;

import constants.TimeUnits;
import helpers.CastingTime;
import helpers.Duration;
import helpers.Range;
import spells.Components;
import spells.Schools;
import spells.Spell;

public class FindSteed extends Spell {

    public FindSteed() {
        name = "Find Steed";
        level = 2;
        school = Schools.CONJURATION;
        components.add(Components.VERBAL);
        components.add(Components.SOMATIC);
        castingTime = new CastingTime(10, TimeUnits.MINUTE);
        duration = new Duration(TimeUnits.INSTANTANEOUS);
        range = new Range(30);
        ritual = false;
        description = "You summon a spirit that assumes the form of an unusually intelligent, strong, and loyal " +
                "steed, creating a long-lasting bond with it. Appearing in an unoccupied space within range, the " +
                "steed takes on a form that you choose, such as a warhorse, a pony, a camel, an elk, or a mastiff. " +
                "(Your DM mught allow other animals to be summoned as steeds.) The steed has the statistics of the " +
                "chosen form, though it is a celestial, fey, or fiend (your choice) instead of its normal type. " +
                "Additionally, if your steed has an Intelligence of 5 or less, its Intelligence becomes 6, and it " +
                "gains the ability to understand one language of your choice that you speak.Your steed serves you as " +
                "a mount, both in combat and out, and you have an instinctive bond with it that allows you to fight " +
                "as a seamless unit. While mounted on your steed, you can make any spell you cast that targets only " +
                "you also target your steed.When the steed drops to 0 hit points, it disappears, leaving behind no " +
                "physical form. You can also dismiss your steed at any time as an action, causing it to disappear. In" +
                " either case, casting this spell again summons the same steed, restored to its hit point maximum" +
                ".While your steed is within 1 mile of you, you can communicate with it telepathically.You can't have" +
                " more than one steed bonded by this spell at a time. As an action, you can release the steed from " +
                "its bond at any time, causing it to disappear.";
    }

}
