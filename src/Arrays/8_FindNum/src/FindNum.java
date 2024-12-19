/*
8. Поиск элемента в массиве.
- Создайте массив из 6 чисел
- Заполните его произвольными числами
- Запросите у пользователя число и проверьте,
есть ли это число в массиве
 */

import java.util.Scanner;
import java.util.Random;

public class FindNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        Random rand = new Random();
        boolean found = false;

        System.out.print("Я загадал 6 чисел. Угадай одно из них. ");

        for (int i = 0; i < arr.length; i++) {
            int RandNum = rand.nextInt(10);
            arr[i] = RandNum;
             System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int num = in.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

         if (found) {
             System.out.println("Ты угодал. Победа!");
         }
         else {

             System.out.print("Проиграл!");
         }
        in.close();
    }
}


