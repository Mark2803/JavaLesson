/*
Напишите программу, которая печатает все числа от 1 до 100,
пока сумма напечатанных чисел не станет больше 500.
 */
package Cycles.While;

public class SumNum500 {
    public static void main(String[] args) {

        int num = 0;
        int tmp = num;
        while (tmp <= 500) {
            num++;
            tmp = tmp + num;

            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print(tmp);
    }
}
