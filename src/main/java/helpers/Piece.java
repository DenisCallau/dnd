package helpers;

import constants.OtherUnits;

public class Piece extends Measure {

    private OtherUnits unit;

    public Piece(double qty, OtherUnits unit) {
        this.qty = qty;
        this.unit = unit;
    }
}
