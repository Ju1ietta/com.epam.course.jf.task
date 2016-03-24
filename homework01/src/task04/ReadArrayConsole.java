package task04;

import java.util.Scanner;

/**
 * Created by Julia on 28.02.2016.
 */
public final class ReadArrayConsole {

    public final double[] readFromConsole() {
        try {
            System.out.println("Введите длину последовательности действительных чисел(длину массива): ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            double[] arrayNumber = new double[n];
            for (int i = 0; i < arrayNumber.length; i++) {
                System.out.println("Введите " + i + "-ый элемент последовательности");
                arrayNumber[i] = in.nextDouble();
            }
            return arrayNumber;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите натуральное число для длины последовательности");
        }
        return null;
    }
}
