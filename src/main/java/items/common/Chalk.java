package items.common;

import constants.CurrencyUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Chalk extends CommonItem {

	public Chalk() {
		name = "Chalk";
		price = new Price(1, CurrencyUnits.COPPER);
		weight = new Weight(0, WeightUnits.POUND);
		quantity = new Piece(1, OtherUnits.PIECE);
	}

}
