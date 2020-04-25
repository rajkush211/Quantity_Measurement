package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0, "length"), INCH(1.0, "length"),
    YARD(36.0, "length"), CM(0.4, "length"),

    ML(0.001, "volume"), LITRE(1, "volume"),
    GALLON(3.78, "volume"),

    GRAM(0.001, "mass"), KG(1.0, "mass"),
    TONNE(1000.0, "mass"),

    FAHRENHEIT(1.0, "temperature"), CELSIUS(1.0,"temperature");

    double baseUnitConversion;
    String quantityType;

    Unit(double baseUnitConversion, String quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }
}
