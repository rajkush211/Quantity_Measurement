package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoValuesWithDifferentReference_ShouldReturnNotSame() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenDifferentType_WhenCompared_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Inch inch1 = new Inch(0.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
}
