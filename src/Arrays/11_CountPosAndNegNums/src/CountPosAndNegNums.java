/*
11. Подсчёт положительных и отрицательных чисел
•	Создайте массив из 10 чисел.
•	Заполните его произвольными числами.
•	Подсчитайте, сколько в массиве положительных и сколько отрицательных чисел, и выведите результат.
 */

import java.util.Random;

public class CountPosAndNegNums {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(21) - 10;
            arr[i] = num;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg++;
            }
        }
        System.out.println("Отрицательных числе в массиве: " + neg);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            }
        }
        System.out.println("Положительных числе в массиве: " + pos);
    }
}