/*
Реализуйте счетчик обратного отсчета от 10 до 1 с проверкой,
что счетчик не стал отрицательным.
 */

package Cycles.While;

public class CountDown {
    public static void main(String[] args) {

        int count = 10;

        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }
}
