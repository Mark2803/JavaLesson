/*
7. Среднее значение массива.
- Создайте  массив ищ 10 чисел
- Заполните его произвольными числами
- Найдите среднее значение всех элементов массива и выведете его
 */

import java.util.Random;

public class AverageNum {
    public static void main(String[] args) {

        Random Rand = new Random();
        int RandArr = Rand.nextInt(6) + 5;
        int sum = 0;
        double aver = 0;
        int[] Arr = new int[RandArr];

        System.out.print("Заданный масив: ");
        for (int i = 0; i < Arr.length; i++) {
            int RandNum = Rand.nextInt(100);
            Arr[i] = RandNum;
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
        System.out.print("Сумма чисел массива: ");
        for (int i = 0; i < Arr.length; i++) {
            sum = sum + Arr[i];
            aver++;
        }

        System.out.print(sum);
        System.out.println("");
        System.out.print("Колличество чисел в массиве: ");
        System.out.println((int) aver);

        System.out.print("Среднее значение: ");

        if ((sum / aver) % 1 == 0) {
            int Average = sum / (int) aver;
            System.out.print(Average);
        } else {
            System.out.print(sum / aver);
        }
    }
}