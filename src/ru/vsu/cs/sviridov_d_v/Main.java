package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double amount = readNumber("Введите сумму вклада (₽): ");
        checkNumber(amount);

        double term = readNumber("Введите срок вклада (годы): ");
        checkNumber(term);

        double rate = readNumber("Введите процентную ставку вклада (%): ");
        checkNumber(rate);

        double sum = countSum(amount, rate, term);

        printAnswer(sum);

    }


    static double readNumber(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    static void checkNumber(double value) {
        if (value <= 0) {
            System.out.print("Значение не может быть отрицательным или раным нулю");
        }

    }

    static double countSum(double pv, double r, double n) {
        return(pv * Math.pow((1 + r / 100), n));
    }

    static void printAnswer(double s) {
        System.out.printf("По окончании срока вклада получим %.2f₽", s);
    }

}