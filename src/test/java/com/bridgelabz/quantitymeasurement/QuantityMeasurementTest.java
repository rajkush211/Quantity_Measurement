package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import static com.bridgelabz.quantitymeasurement.Unit.*;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual() {
        Quantity feet1 = new Quantity(FEET, 0.0);
        Quantity feet2 = new Quantity(FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullValue_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(FEET, 0.0);
        Quantity feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoValuesWithDifferentReference_ShouldReturnNotSame() {
        Quantity feet1 = new Quantity(FEET, 0.0);
        Quantity feet2 = new Quantity(FEET, 0.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenDifferentType_WhenCompared_ShouldReturnNotEqual() {
        Quantity feet = new Quantity(FEET, 1.0);
        Quantity inch = new Quantity(INCH, 1.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
        Quantity feet1 = new Quantity(FEET, 0.0);
        Quantity feet2 = new Quantity(FEET, 1.0);
        boolean compareCheck = compare(feet1, feet2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(INCH, 0.0);
        Quantity inch2 = new Quantity(INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullValue_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(INCH, 0.0);
        Quantity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenSameReference_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(INCH, 0.0);
        Assert.assertEquals(inch1, inch1);
    }

    @Test
    public void givenTwoDifferentType_WhenCompared_ShouldReturnFalse() {
        Quantity inch = new Quantity(INCH, 1.0);
        Quantity feet = new Quantity(FEET, 1.0);
        boolean compareCheck = compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd0Inch_ShouldReturnNotEqual() {
        Quantity inch1 = new Quantity(INCH, 0.0);
        Quantity inch2 = new Quantity(INCH, 1.0);
        boolean compareCheck = compare(inch1, inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_WhenCompared_ShouldReturnFalse() {
        Quantity inch = new Quantity(INCH, 1.0);
        Quantity feet = new Quantity(FEET, 1.0);
        boolean compareCheck = compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_WhenCompared_ShouldReturnFalse() {
        Quantity feet = new Quantity(FEET, 1.0);
        Quantity inch = new Quantity(INCH, 1.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_WhenCompared_ShouldReturnTrue() {
        Quantity feet = new Quantity(FEET, 1.0);
        Quantity inch = new Quantity(INCH, 12.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1feet_WhenCompared_ShouldReturnTrue() {
        Quantity feet = new Quantity(FEET, 1.0);
        Quantity inch = new Quantity(INCH, 12.0);
        boolean compareCheck = compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        Quantity feet = new Quantity(FEET, 3.0);
        Quantity yard = new Quantity(YARD, 1.0);
        boolean compareCheck = compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompared_ShouldReturnTrue() {
        Quantity inch = new Quantity(INCH, 36.0);
        Quantity yard = new Quantity(YARD, 1.0);
        boolean compareCheck = compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        Quantity feet = new Quantity(FEET, 1.0);
        Quantity yard = new Quantity(YARD, 1.0);
        boolean compareCheck = compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_ShouldReturnTrue() {
        Quantity inch = new Quantity(INCH, 2.0);
        Quantity cm = new Quantity(CM, 5.0);
        boolean compareCheck = compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Quantity inch1 = new Quantity(INCH, 2.0);
        Quantity inch2 = new Quantity(INCH, 2.0);
        double result = add(inch1, inch2);
        Assert.assertEquals(4.0, result, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        Quantity inch = new Quantity(INCH, 2.0);
        Quantity feet = new Quantity(FEET, 1.0);
        double result = add(inch, feet);
        Assert.assertEquals(14.0, result, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn14Inch() {
        Quantity feet1 = new Quantity(FEET, 1.0);
        Quantity feet2 = new Quantity(FEET, 1.0);
        double result = add(feet1, feet2);
        Assert.assertEquals(24.0, result, 0.0);
    }

    @Test
    public void given2InchAnd2AndHalfCm_WhenAdded_ShouldReturn3Inch() {
        Quantity inch = new Quantity(INCH, 2.0);
        Quantity cm = new Quantity(CM, 2.5);
        double result = add(inch, cm);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test
    public void given1GallonAnd3Dot78Litres_WhenCompared_ShouldReturnEqual() {
        Quantity gallon = new Quantity(GALLON, 1.0);
        Quantity litre = new Quantity(LITRE, 3.78);
        boolean compareCheck = compare(gallon, litre);
        Assert.assertTrue(compareCheck);
    }
}
