package com.geekbrains;

/**
 * @author Burntwood
 */
public class HomeWorkApp {

    private static final String[] FRUITS = {"Orange", "Banana", "Apple"};
    private static final String[] COLORS = {"Красный", "Жёлтый", "Зелёный"};

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-3,5);
        checkSumSign(2,-7);
        printColor(-24);
        printColor(6);
        printColor(137);
        compareNumbers(17,13);
        compareNumbers(5,9);
    }

    public static void log(String logString) {
        System.out.println(logString);
    }

    public static void printThreeWords() {
        for (String fruit : FRUITS) {
            log(fruit);
        }
    }

    public static void checkSumSign(int a, int b) {
        if (a+b>=0) {
            log("Сумма положительная");
        } else {
            log("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value<=0) {
            // Красный
            log(COLORS[0]);
        } else if (value > 0 && value <= 100) {
            // Жёлтый
            log(COLORS[1]);
        } else if (value > 100) {
            // Зелёный
            log(COLORS[2]);
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a>=b) {
            log("a >= b");
        } else {
            log("a < b");
        }
    }
}
