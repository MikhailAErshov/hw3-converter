//Необходимо написать программу конвертер физических величин. Пользователю сначала предлагается выбрать что переводить (масса или расстояние), затем предлагается выбрать единицу измерения. Далее пользователь должен ввести
//число. В результате программа должна вывести 4 строки с переведенными величинами.
//Масса: кг, грамм, фунт(lb), карат в любую сторону
//Длина (расстояние):
//метр, миля, ярд, фут в любую сторону

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, что переводить:");
        System.out.println("[1] Масса");
        System.out.println("[2] Расстояние");

        int value = sc.nextInt();

        if (value == 1) {

            System.out.println("Выберите единицу измерения: ");
            System.out.println("[1] Килограмм");
            System.out.println("[2] Грамм");
            System.out.println("[3] Фунт");
            System.out.println("[4] Карат");

            int weightValue = sc.nextInt();
            if (weightValue >= 1 && weightValue <= 4) {
                System.out.println("Введите число:");
                int quantity = sc.nextInt();

                switch (weightValue) {
                    case 1:
                        inKilograms(Math.abs(quantity));
                        break;
                    case 2:
                        inGrams(Math.abs(quantity));
                        break;
                    case 3:
                        inPounds(Math.abs(quantity));
                        break;
                    case 4:
                        inKarats(Math.abs(quantity));
                        break;
                    default:
                        break;
                }
            } else System.out.println("Введено некорректное значение");
        } else if (value == 2) {

            System.out.println("Выберите единицу измерения: ");
            System.out.println("[1] Метр");
            System.out.println("[2] Миля");
            System.out.println("[3] Ярд");
            System.out.println("[4] Фут");

            int lengthValue = sc.nextInt();
            if (lengthValue >= 1 && lengthValue <= 4) {
                System.out.println("Введите число:");
                int quantity = sc.nextInt();

                switch (lengthValue) {
                    case 1:
                        inMeters(Math.abs(quantity));
                        break;
                    case 2:
                        inMiles(Math.abs(quantity));
                        break;
                    case 3:
                        inYards(Math.abs(quantity));
                        break;
                    case 4:
                        inFoots(Math.abs(quantity));
                        break;
                    default:
                        break;
                }
            } else System.out.println("Введено некорректное значение");
        } else System.out.println("Введено некорректное значение");
    }

    public static void inMeters(int meters) {
        System.out.println("Метры: " + meters);
        System.out.println("Мили: " + meters * 0.00062);
        System.out.println("Ярды: " + meters * 1.094);
        System.out.println("Футы: " + meters * 3.28);
    }

    public static void inMiles(int miles) {
        System.out.println("Метры: " + miles * 1609.34);
        System.out.println("Мили: " + miles);
        System.out.println("Ярды: " + miles * 1760);
        System.out.println("Футы: " + miles * 5280);
    }

    public static void inYards(int yards) {
        System.out.println("Метры: " + yards * 0.9144);
        System.out.println("Мили: " + yards * 0.00057);
        System.out.println("Ярды: " + yards);
        System.out.println("Футы: " + yards * 3);
    }

    public static void inFoots(int foots) {
        System.out.println("Метры: " + foots * 0.3048);
        System.out.println("Мили: " + foots * 0.00019);
        System.out.println("Ярды: " + foots * 0.33);
        System.out.println("Футы: " + foots);
    }

    public static void inKilograms(int kilograms) {
        System.out.println("Килограммы: " + kilograms);
        System.out.println("Граммы: " + kilograms * 1000);
        System.out.println("Фунты: " + kilograms * 2.2046);
        System.out.println("Караты: " + kilograms * 5000);
    }

    public static void inGrams(int grams) {
        System.out.println("Килограммы: " + grams * 0.001);
        System.out.println("Граммы: " + grams);
        System.out.println("Фунты: " + grams * 0.002205);
        System.out.println("Караты: " + grams * 0.2);
    }

    public static void inPounds(int pounds) {
        System.out.println("Килограммы: " + pounds * 0.4536);
        System.out.println("Граммы: " + pounds * 453.6);
        System.out.println("Фунты: " + pounds);
        System.out.println("Караты: " + pounds * 2267.9619);
    }

    public static void inKarats(int karats) {
        System.out.println("Килограммы: " + karats * 0.0002);
        System.out.println("Граммы: " + karats * 0.2);
        System.out.println("Фунты: " + karats * 0.00044);
        System.out.println("Караты: " + karats);
    }

}
