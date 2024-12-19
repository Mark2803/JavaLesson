/*
•	Создайте массив из 5 чисел.
•	Заполните его любыми числами (например, 1, 2, 3, 4, 5).
•	Выведите все элементы массива на экран, каждый элемент с новой строки.

 */

import java.util.Scanner;
public class CreateArrAndPrint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }

    }
}