package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double amount = readNumber("Введите сумму вклада (₽): ");

        double term = readNumber("Введите срок вклада (годы): ");

        double rate = readNumber("Введите процентную ставку вклада (%): ");

        double sum = countSum(amount, rate, term);

        printAnswer(sum);

    }

    static double readNumber(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value <= 0) {
            do {
                System.out.println("Значение не может быть отрицательным или раным нулю");
                System.out.print(text);
                scn = new Scanner(System.in);
                value = scn.nextDouble();
            }   while (value <= 0);
        }
        return value;
    }

    static double countSum(double pv, double r, double n) {
        return(pv * Math.pow((1 + r / 100), n));
    }

    static void printAnswer(double s) {
        System.out.printf("По окончании срока вклада получим %.2f₽", s);
    }

}