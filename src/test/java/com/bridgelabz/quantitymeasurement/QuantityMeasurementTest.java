package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import static com.bridgelabz.quantitymeasurement.Unit.*;


public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Length feet1 = new Length(FEET, 0.0);
        Length feet2 = new Length(FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_ShouldReturnNotEqual() {
        Length feet1 = new Length(FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoValuesWithDifferentReference_ShouldReturnNotSame() {
        Length feet1 = new Length(FEET, 0.0);
        Length feet2 = new Length(FEET, 0.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenDifferentType_WhenCompared_ShouldReturnNotEqual() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(FEET, 0.0);
        Length feet2 = new Length(FEET, 1.0);
        boolean compareCheck = Unit.compare(feet1, feet2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(INCH, 0.0);
        Length inch2 = new Length(INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullValue_ShouldReturnNotEqual() {
        Length inch1 = new Length(INCH, 0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameReference_ShouldReturnEqual() {
        Length inch1 = new Length(INCH, 0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void givenTwoDifferentType_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(INCH, 1.0);
        Length feet = new Length(FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(INCH, 0.0);
        Length inch2 = new Length(INCH, 1.0);
        boolean compareCheck = Unit.compare(inch1, inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(INCH, 1.0);
        Length feet = new Length(FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 12.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1feet_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 12.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 3.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(INCH, 36.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(FEET, 1.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }
}
