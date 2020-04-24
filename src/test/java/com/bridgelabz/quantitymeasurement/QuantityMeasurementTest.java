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
        boolean compareCheck = compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Length feet1 = new Length(FEET, 0.0);
        Length feet2 = new Length(FEET, 1.0);
        boolean compareCheck = compare(feet1, feet2);
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
        boolean compareCheck = compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd0Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(INCH, 0.0);
        Length inch2 = new Length(INCH, 1.0);
        boolean compareCheck = compare(inch1, inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
        Length inch = new Length(INCH, 1.0);
        Length feet = new Length(FEET, 1.0);
        boolean compareCheck = compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 1.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 12.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1feet_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 1.0);
        Length inch = new Length(INCH, 12.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Length feet = new Length(FEET, 3.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(INCH, 36.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Length feet = new Length(FEET, 1.0);
        Length yard = new Length(YARD, 1.0);
        boolean compareCheck = compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnTrue() {
        Length inch = new Length(INCH, 2.0);
        Length cm = new Length(CM, 5.0);
        boolean compareCheck = compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Length inch1 = new Length(INCH, 2.0);
        Length inch2 = new Length(INCH, 2.0);
        double result = add(inch1, inch2);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Length inch = new Length(INCH, 2.0);
        Length feet = new Length(FEET, 1.0);
        double result = add(inch, feet);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn14Inch() {
        Length feet1 = new Length(FEET, 1.0);
        Length feet2 = new Length(FEET, 1.0);
        double result = add(feet1, feet2);
        Assert.assertEquals(24.0, result, 0.0);
    }
}
