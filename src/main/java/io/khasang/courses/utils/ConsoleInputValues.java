package io.khasang.courses.utils;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInputValues {

    public int stopOrGetPositiveIntValue(String s) {
        boolean isReading = true;
        int value = -1;
        System.out.print(s);
        while (isReading) {
            Scanner scanner = new Scanner(System.in);
            try {
                String str = scanner.next();
                if (!str.startsWith("s")) {
                    value = Integer.valueOf(str);
                    if (value < 0) throw new InputMismatchException();
                }
                isReading = false;
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println("Input positive number, please");
            }
        }
        return value;
    }
}
