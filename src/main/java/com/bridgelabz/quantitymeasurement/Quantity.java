package com.bridgelabz.quantitymeasurement;

public class Quantity {

    public final Unit UNIT;
    public final double VALUE;

    public Quantity(Unit unit, double value) throws QuantityException {
        this.UNIT = unit;
        if(value < 0.0 && !unit.quantityType.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.NEGATIVE_VALUE, "Value cannot be negative");
        this.VALUE = value;
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
