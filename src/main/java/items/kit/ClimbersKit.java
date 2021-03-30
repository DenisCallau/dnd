package items.kit;

import constants.CurrencyTypes;
import helpers.Currency;
import constants.MeasureUnits;
import helpers.Measure;

public class ClimbersKit extends Kit {

	public ClimbersKit() {
		name = "Climber's Kit";
		price = new Currency(25, CurrencyTypes.GOLD);
		weight = new Measure(12, MeasureUnits.POUND);
		description = "A climber’s kit includes Special pitons, boot tips, gloves, and a harness. You can use the climber’s kit as an action to anchor yourself; when you do, you can’t fall more than 25 feet from the point where you anchored yourself, and you can’t climb more than 25 feet away from that point without undoing the anchor.";
	}

}
