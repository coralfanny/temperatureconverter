package com.timebox.temperatureconverter;

/**
 * Created by shanshan on 2017/12/6.
 */

public class ConverterUtil {


    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5/9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public void test() {

    }
}
