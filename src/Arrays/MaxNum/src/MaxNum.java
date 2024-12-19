/*
3. Максимальный элемент массива
•	Создайте массив из 7 чисел.
•	Заполните его произвольными числами.
•	Найдите и выведите максимальное число в массиве.

 */

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[7];
        Integer max = MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}