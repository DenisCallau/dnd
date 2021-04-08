package items.common;

import constants.CurrencyUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Tent extends CommonItem {

	public Tent() {
		name = "Tent";
		price = new Price(2, CurrencyUnits.GOLD);
		weight = new Weight(20, WeightUnits.POUND);
		quantity = new Piece(2, OtherUnits.PERSON);
	}

}
