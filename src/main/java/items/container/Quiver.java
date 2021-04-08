package items.container;

import constants.CurrencyUnits;
import constants.DistanceUnits;
import constants.OtherUnits;
import constants.WeightUnits;
import helpers.Piece;
import helpers.Price;
import helpers.Weight;

public class Quiver extends Container {

    public Quiver() {
        name = "Quiver";
        price = new Price(1, CurrencyUnits.GOLD);
        weight = new Weight(1, WeightUnits.POUND);
        capacity = new Piece(20, OtherUnits.PIECE);
    }

}
