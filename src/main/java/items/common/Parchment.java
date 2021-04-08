package items.common;

import constants.CurrencyUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Parchment extends CommonItem {

	public Parchment() {
		name = "Parchment";
		price = new Price(1, CurrencyUnits.SILVER);
		weight = new Weight(0, WeightUnits.POUND);
		quantity = new Piece(1, OtherUnits.SHEET);
	}

}
