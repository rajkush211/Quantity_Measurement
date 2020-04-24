package com.bridgelabz.quantitymeasurement;

public class Quantity {

    public final Unit UNIT;
    public final double VALUE;

    public Quantity(Unit unit, double value) {
        this.UNIT = unit;
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
