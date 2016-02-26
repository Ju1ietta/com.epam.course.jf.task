package task02;

import java.util.Scanner;

/**
 * Created by Julia on 25.02.2016.
 */
public final class Task02 {
    public static void main(String[] args) {
        System.out.println("Введите значение eps: ");
        Scanner in = new Scanner(System.in);
        Double eps = in.nextDouble();
        int n = calculate(eps);
        System.out.println("Наименьший номер элемента последовательности равен " + n);
    }

    /**
     * Calculate
     * @param eps
     * @return n
     */
    private static int calculate(double eps) {
        int n = 0;
        double a = 0.0;
        do {
            n++;
            a = (1 / java.lang.Math.pow(n + 1, 2));
            System.out.println("a[" + n + "] = " + a);
        } while (a >= eps);
        return n;
    }
}
