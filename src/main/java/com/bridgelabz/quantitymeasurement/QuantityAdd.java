package com.bridgelabz.quantitymeasurement;

public class QuantityAdd implements IQtyOperation{
    @Override
    public Quantity add(Quantity quantity1, Quantity quantity2) throws QuantityException {
        if (!quantity1.UNIT.quantityType.equals(quantity2.UNIT.quantityType))
            throw new QuantityException(QuantityException.ExceptionType.UNIT_MISMATCH, "Quantities must be same to add");
        if (quantity1.UNIT.quantityType.equals("temperature"))
            throw new QuantityException(QuantityException.ExceptionType.TEMPERATURE_ADD, "Temperature cannot be added");
        return new Quantity(quantity1.UNIT, (quantity1.VALUE * quantity1.UNIT.baseUnitConversion +
                            quantity2.VALUE * quantity2.UNIT.baseUnitConversion));
    }
}
