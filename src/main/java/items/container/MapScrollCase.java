package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import helpers.Weight;

public class MapScrollCase extends Container {
	
	public MapScrollCase() {
		name = "Map/Scroll Case";
		price = new Price(1, CurrencyUnits.GOLD);
		weight = new Weight(1, WeightUnits.POUND);
		capacity = new Piece(10, OtherUnits.PIECE);
	}

}
