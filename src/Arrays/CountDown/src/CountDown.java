/*
4. Перевернуть массив
•	Создайте массив из 6 чисел.
•	Заполните его числами.
•	Выведите элементы массива в обратном порядке
    (например, если был 1, 2, 3, то станет 3, 2, 1).
 */

import java.util.Scanner;
public class CountDown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(arr[i] + " "); }
    }
}