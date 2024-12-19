/*
9. Замена элемента
- Создайте массив из 5 чисел
- Запросите у пользователя индекс
элемента (от 0 до 4) и новое значение
- Замените элемент по указанному индексу
на новое значение и выведите массив
 */

import java.util.Scanner;

public class ChangeNum {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("");


        System.out.print("Задан массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Выберете номер элемента от 0 до 4: ");
        int NumArr = in.nextInt();

        System.out.print("Введите новое значение элемента: ");
        int NewNumAr = in.nextInt();
        arr[NumArr] = NewNumAr;
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}