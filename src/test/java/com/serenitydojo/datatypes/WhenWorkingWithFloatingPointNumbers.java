package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celsius to Fahrenheit
    // The equation is: fahrenheit = (9 / 5) * celsius + 32
    //
    @Test
    public void convertToFahrenheit() {
        double celsius = 27.0d;
        double farenheit = 0.0d;

        // TODO: Use a floating point calculation to calculate the fahrenheit equivalent of the celsius value.

        farenheit = ((9d / 5d) * celsius) + 32d;

        assertThat(farenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKgToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        weightInPounds = weightInKilograms * 2.20462d;

        assertThat(weightInPounds, equalTo(110.231));

    }
}
