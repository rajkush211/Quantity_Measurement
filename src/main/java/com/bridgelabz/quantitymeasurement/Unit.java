package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0, "length"), INCH(1.0, "length"),
    YARD(36.0, "length"), CM(0.4, "length"),

    LITRE(1000, "volume"), GALLON(3780, "volume"),
    ML(1, "volume");

    double baseUnitConversion;
    String quantityType;

    Unit(double baseUnitConversion, String quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

    public static double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.VALUE * quantity1.UNIT.baseUnitConversion +
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) {
        return Double.compare(quantity1.VALUE * quantity1.UNIT.baseUnitConversion,
                              quantity2.VALUE * quantity2.UNIT.baseUnitConversion) == 0;
    }
}
