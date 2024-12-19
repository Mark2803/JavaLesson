/*
12. Сумма чисел с нечётными индексами

•	Создайте массив из 7 чисел.
•	Заполните его произвольными числами.
•	Найдите сумму чисел, которые стоят на нечётных индексах
(например, элементы с индексами 1, 3, 5).
*/

import java.util.Random;

public class SummOddInd {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[7];
        int count = 0;
        System.out.print("Задан массив: ");
        for (int i = 0; i < arr.length; i++) {
            int num = rand.nextInt(10);
            arr[i] = num;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                count = count + arr[i];
            }
        }
        System.out.print(count);
    }
}
