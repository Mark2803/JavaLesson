/*
2. Сумма элементов массива
•	Создайте массив из 10 чисел.
•	Заполните его числами от 1 до 10.
•	Найдите и выведите сумму всех элементов массива.

 */
package Arrays;

import java.util.Scanner;

public class SummNumArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

