/*
14. Сравнение двух массивов
•	Создайте два массива одинаковой длины (например, из 5 чисел).
•	Сравните элементы массивов и выведите, совпадают ли они.
 */

import java.util.Arrays;
import java.util.Scanner;

public class CompareArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] ArrOne = new int[5];
        int[] ArrTwo = new int[5];

        System.out.print("Введите 5 чисел первого массива: ");
        for (int i = 0; i < ArrOne.length; i++) {
            int num = in.nextInt();
            ArrOne[i] = num;
        }
        System.out.println();
        System.out.print("Введен массив: ");
        for (int i = 0; i < ArrOne.length; i++) {
            System.out.print(ArrOne[i] + " ");
        }

        System.out.println();
        System.out.println("Введите 5 чисел второго массива: ");
        for (int i = 0; i < ArrTwo.length; i++) {
            int num = in.nextInt();
            ArrTwo[i] = num;
        }
        System.out.print("Введен массив: ");
        for (int i = 0; i < ArrTwo.length; i++) {
            System.out.print(ArrTwo[i] + " ");}

        System.out.println();
            if (Arrays.equals(ArrOne, ArrTwo)) {
                System.out.println("Массивы равны");

            }
            else {
                System.out.print("Массивы не равны");
            }

        }
    }


