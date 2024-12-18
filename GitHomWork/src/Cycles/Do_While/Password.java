/*
Создайте программу которая запрашивает пароль у пользователя.
Цикл должен продолжаться до тех пор, пока пользователь
не введет правильный пароль.
 */
package Cycles.Do_While;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String password = "qwerty";
        Scanner in = new Scanner(System.in);
        String pas;
        int i = 0;

        do {
            System.out.print("Введите пароль: ");
            pas = in.nextLine();

            if (pas.equals(password)) {
                System.out.println("Пароль верен");
                break;
            } else {
                System.out.println("Введен не верный пароль");
                i++;
                System.out.println("Осталось попыток: " + (3 - i));
            }

        } while (i < 3);
        System.out.println("Попытки закончились");

    }
}
