package task04;

import java.util.Scanner;

/**
 * Created by Julia on 26.02.2016.
 */
public final class Task04 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите последовательность действительных чисел: ");
            Scanner in = new Scanner(System.in);
            String number_string = in.nextLine();


        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введите размерность матрицы в виде натурального числа");
        }
    }
}
