/*
Напишите программу, которая генерирует случайное число и проверяет,
больше ли он 90. Если нет, программа продолжает генерировать числа.
 */
package Cycles.Do_While;
import java.util.Random;

public class NumGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int RandNum;

        do {
            RandNum = rand.nextInt(100);
            System.out.println(RandNum);

        } while (RandNum < 90);
    }

}
