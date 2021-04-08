package items.common;

import constants.CurrencyUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class Paper extends CommonItem {

	public Paper() {
		name = "Paper";
		price = new Price(2, CurrencyUnits.SILVER);
		weight = new Weight(0, WeightUnits.POUND);
		quantity = new Piece(1, OtherUnits.PIECE);
	}

}
