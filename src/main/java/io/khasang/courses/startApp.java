package io.khasang.courses;

import io.khasang.courses.model.TrafficLight;
import io.khasang.courses.utils.ConsoleInputValues;

public class startApp {
    public static void main(String[] args) {
        boolean stopWork = false;
        TrafficLight trafficLight = new TrafficLight(2, 3, 4);
        ConsoleInputValues consoleInputValues = new ConsoleInputValues();

        while (!stopWork) {
            int value = consoleInputValues.stopOrGetPositiveIntValue("input new time or 's' for stop, please: ");
            if (value >= 0) trafficLight.showColorByTime(value);
            else {
                stopWork = true;
            }
        }
    }
}
