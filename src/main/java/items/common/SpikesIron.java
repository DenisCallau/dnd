package items.common;

import constants.CurrencyUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import constants.DistanceUnits;
import helpers.Weight;

public class SpikesIron extends CommonItem {

	public SpikesIron() {
		name = "Spikes (Iron)";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(5, WeightUnits.POUND);
		quantity = new Piece(10, OtherUnits.PIECE);
	}

}
