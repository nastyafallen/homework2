package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        byte colorVariants = 99;
        short salary = 98;
        int objects = 97;
        long d = 96L;
        float e = 95.1f;
        double f = 94.222;
        char g = 178;
        boolean h = 2 > 3;
        System.out.println(h);

        // Задание 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightDifference = boxer2 - boxer1;
        float totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров = " + totalWeight + " кг");
        System.out.println("Разница в весе между боксерами = " + weightDifference + " кг");

        // Задание 3
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int weightOfBreakfast = bananas + milk + iceCream + eggs;
        System.out.println("Общий вес завтрака = " + weightOfBreakfast + " г");
        float weightInKg = weightOfBreakfast / 1000f;
        System.out.println("Общий вес завтрака = " + weightInKg + "кг");

        // Задание 4
        int weightLossNeeded = 7 * 1000;
        int weightLossSlow = weightLossNeeded / 250;
        int weightLossFast = weightLossNeeded / 500;
        int weightLossAverage = (weightLossSlow + weightLossFast) / 2;

    }
}
