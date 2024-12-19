/*
10. Сортировка массива
•	Создайте массив из 8 чисел.
•	Заполните его произвольными числами.
•	Отсортируйте массив по возрастанию (можно использовать метод Arrays.sort()) и выведите результат.
 */

import java.util.Random;
import java.util.Arrays;

public class SortNums {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            int nums = rand.nextInt(100);
            arr[i] = rand.nextInt(nums);
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}