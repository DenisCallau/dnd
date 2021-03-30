package helpers;

import constants.MeasureUnits;

public class Measure {
	
	private double quantity;
	private MeasureUnits unit;
	
	public Measure(double quantity, MeasureUnits unit) {
		this.quantity = quantity;
		this.unit = unit;
	}

}
