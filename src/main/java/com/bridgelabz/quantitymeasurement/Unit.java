package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0, "length"), INCH(1.0, "length"),
    YARD(36.0, "length"), CM(0.4, "length"),

    ML(0.001, "volume"), LITRE(1, "volume"),
    GALLON(3.78, "volume"),

    GRAM(0.001, "mass"), KG(1.0, "mass"),
    TONNE(1000.0, "mass"),

    FAHRENHEIT(1.0, "temperature"), CELSIUS(2.12,"temperature");

    double baseUnitConversion;
    String quantityType;

    Unit(double baseUnitConversion, String quantityType) {
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

    public static double add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityType.equals(quantity2.UNIT.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.UNIT_MISMATCH, "Quantities must be same to add");
        if (quantity1.UNIT.quantityType.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.TEMPERATURE_ADD, "Temperature cannot be added");
        return quantity1.VALUE * quantity1.UNIT.baseUnitConversion +
                quantity2.VALUE * quantity2.UNIT.baseUnitConversion;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityType.equals(quantity2.UNIT.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.UNIT_MISMATCH, "Quantities must be same to compare");
        return Double.compare(quantity1.VALUE * quantity1.UNIT.baseUnitConversion,
                              quantity2.VALUE * quantity2.UNIT.baseUnitConversion) == 0;
    }
}
