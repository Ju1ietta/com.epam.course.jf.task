package task04;

import java.util.Scanner;

/**
 * Created by Julia on 26.02.2016.
 */
public final class Task04 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.print("1. Ввод с консоли.\n" + "2. Чтение массива с файла.\n" +
                "Выберите пункт меню: ");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                maxSum(new ReadArrayConsole().readFromConsole());
                break;
            case 2:
                maxSum(new ReadArrayFile().readArrayFromFile());
                break;
            default:
                System.out.println("Такого пункта меню не существует!");
                break;
        }
    }

    public static double maxSum(final double[] arrayNumber) {
        double maxSum = 0.0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] + arrayNumber[arrayNumber.length - i - 1] > maxSum) {
                maxSum = arrayNumber[i] + arrayNumber[arrayNumber.length - i - 1];
            }
        }
        System.out.println("Максимальная сумма равна " + maxSum);
        return maxSum;
    }
}
