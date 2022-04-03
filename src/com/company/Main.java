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
        int a = (int) (7 / 0.25);
        int b = (int) (7 / 0.5);
        int c = (a + b) / 2;
        System.out.println("Ели спортсмен будет терять по 250 г в день, то потребуется " + weightLossSlow + " дней");
        System.out.println("Если спортсмен будет терять по 500 г в день, то потребуется " + weightLossFast + " дней");
        System.out.println("В среднем спортсмену потребуется" + weightLossAverage + " дней");
        System.out.println("Остаток " + c);

        // Задание 5
        int zpMasha = 67_760;
        int zpDenis = 83_690;
        int zpKristina = 76_230;
        double zpMashaNew = zpMasha + zpMasha * 0.1;
        double zpDenisNew = zpDenis + zpDenis * 0.1;
        double zpKristinaNew = zpKristina + zpKristina * 0.1;
        System.out.println("Зарплата Маши после повышения составит " + zpMashaNew + " рублей в месяц");
        System.out.println("Зарплата Дениса после повышения составит " + zpDenisNew + " рублей в месяц");
        System.out.println("Зарплата Кристины после повышения составит " + zpKristinaNew + " рублей в месяц");
        double zpMashaDifference = zpMashaNew * 12 - zpMasha * 12;
        double zpDenisDifference = zpDenisNew * 12 - zpDenis * 12;
        double zpKristinaDifference = zpKristinaNew * 12 - zpKristina * 12;
        System.out.println("Годовой доход Маши вырос на " + zpMashaDifference + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + zpDenisDifference + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + zpKristinaDifference + " рублей");


    }
}
