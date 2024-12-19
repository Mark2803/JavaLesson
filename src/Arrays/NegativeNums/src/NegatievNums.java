/*
6. Замена элементов на отрицательные
•	Создайте массив из 5 чисел.
•	Заполните его произвольными числами, включая положительные и отрицательные.
•	Замените все положительные числа на отрицательные (например, 5 на -5).
 */

import java.util.Random;

public class NegatievNums {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(6) +5;
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            int number = rand.nextInt(201) - 100;
            array[i] = number;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = array[i] * -1;
            }
            System.out.print(array[i] + " ");
        }
    }
}