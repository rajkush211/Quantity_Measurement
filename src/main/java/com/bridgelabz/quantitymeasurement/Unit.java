package com.bridgelabz.quantitymeasurement;

import static com.bridgelabz.quantitymeasurement.QuantityType.*;

public enum Unit {
    FEET(12.0, LENGTH), INCH(1.0, LENGTH),
    YARD(36.0, LENGTH), CM(0.4, LENGTH),

    ML(0.001, VOLUME), LITRE(1, VOLUME),
    GALLON(3.78, VOLUME),

    GRAM(0.001, WEIGHT), KG(1.0, WEIGHT),
    TONNE(1000.0, WEIGHT),

    FAHRENHEIT(1.0, TEMPERATURE), CELSIUS(1.0,TEMPERATURE);

    double baseUnitConversion;
    QuantityType quantityType;

    Unit(double baseUnitConversion, QuantityType quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }
}
