package com.bridgelabz.quantitymeasurement;

public class QuantityException extends Exception {

    public enum ExceptionType {
        UNIT_MISMATCH, NEGATIVE_VALUE, TEMPERATURE_ADD }

    public ExceptionType type;

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
