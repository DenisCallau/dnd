package items.kit;

import constants.CurrencyUnits;
import constants.WeightUnits;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class ClimbersKit extends Kit {

	public ClimbersKit() {
		name = "Climber's Kit";
		price = new Price(25, CurrencyUnits.GOLD);
		weight = new Weight(12, WeightUnits.POUND);
		description = "A climber’s kit includes Special pitons, boot tips, gloves, and a harness. You can use the climber’s kit as an action to anchor yourself; when you do, you can’t fall more than 25 feet from the point where you anchored yourself, and you can’t climb more than 25 feet away from that point without undoing the anchor.";
	}

}
