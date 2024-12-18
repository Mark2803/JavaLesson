package Cycles.While;
/*
Напишите программу, которая считывает строки с клавиатуры и завершает работу,
когда пользователь вводит слово "exit".
 */

import java.util.Scanner;

public class StringsTillExit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = "Hi";

        String ex = "exit";

        while (!input.equals(ex)) {
            input = in.nextLine();

        }
    }
}
