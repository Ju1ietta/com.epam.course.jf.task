package task03and04;

import java.util.Scanner;

/**
 * Created by Julia on 26.02.2016.
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите значения концов отрезка a и b, на котором будет вычисляться значение функции: ");
        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        System.out.println("Введите значения шага h: ");
        Double h = in.nextDouble();
        System.out.printf("%-10s%-20s%n", "Аргумент","Значение функции");
        System.out.println("----------------------------");

        do{
            double f = Math.tan(2*a) - 3;
            System.out.println(a + "     " + f);
        } while((a += h) <= b);
    }
}