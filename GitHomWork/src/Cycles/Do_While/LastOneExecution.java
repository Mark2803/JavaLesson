/*
Напишите программу, которая запрашивает у пользователя число и выводит
его удвоенное значение. Цикл должен выполняться до тех пор,
пока пользователь не введет число больше 10.
 */

package Cycles.Do_While;
import java.util.Scanner;

public class LastOneExecution {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int num;
            do {
                System.out.println("Введите число");
                num = in.nextInt();
                System.out.println(num * 2);
            } while (num <= 10);

        }

    }

