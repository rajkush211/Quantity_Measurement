package com.bridgelabz.quantitymeasurement;

public interface IQtyOperation {
    Quantity add(Quantity quantity1, Quantity quantity2, Unit expectedUnit) throws QuantityException;
}
