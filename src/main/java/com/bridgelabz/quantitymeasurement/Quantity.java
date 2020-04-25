package com.bridgelabz.quantitymeasurement;

import static com.bridgelabz.quantitymeasurement.QuantityType.TEMPERATURE;
import static com.bridgelabz.quantitymeasurement.Unit.FAHRENHEIT;

public class Quantity {

    public final Unit UNIT;
    public final double VALUE;

    public Quantity(Unit unit, double value) throws QuantityException {
        this.UNIT = unit;
        if(value < 0.0 && !unit.quantityType.equals(TEMPERATURE))
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE, "Value cannot be negative");
        this.VALUE = value;
    }

    private static double farenheitToCelcius(double fahrenheit) {
        return ((fahrenheit - 32) * (5.0 / 9.0));
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityType.equals(quantity2.UNIT.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.UNIT_MISMATCH, "Quantities must be same to compare");
        if (quantity1.UNIT.equals(FAHRENHEIT))
            return Double.compare(farenheitToCelcius(quantity1.VALUE * quantity1.UNIT.baseUnitConversion),
                    quantity2.VALUE * quantity2.UNIT.baseUnitConversion) == 0;
        if (quantity2.UNIT.equals(FAHRENHEIT))
            return Double.compare(quantity1.VALUE * quantity1.UNIT.baseUnitConversion,
                    farenheitToCelcius(quantity2.VALUE * quantity2.UNIT.baseUnitConversion)) == 0;
        return Double.compare(quantity1.VALUE * quantity1.UNIT.baseUnitConversion,
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.VALUE, VALUE) == 0 &&
                UNIT == quantity.UNIT;
    }
}
