/*
5. Счётчик чётных чисел
•	Создайте массив из 8 чисел.
•	Заполните его произвольными числами.
•	Найдите количество чётных чисел в массиве и выведите это число.
 */

import java.util.Random;
import java.util.Scanner;
public class CountEvenNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            int rand = new Random().nextInt(100);
            arr[i] = rand;
        }



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(count);
    }
}