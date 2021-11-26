package com.company;

public class Task_55_CVT {
    public double centimeterToInch(double cm) {
        return cm * 0.394;
    }
    public double  inchToCentimeter(double inch) {
        return inch * 2.54;
    }
    public double meterToYards(double meter) {
        return meter * 1.09361;
    }
    public double yardsToMeter(double yards) {
        return yards * 0.9144;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
