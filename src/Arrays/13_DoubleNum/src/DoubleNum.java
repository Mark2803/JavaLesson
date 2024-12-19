/*13. Дублирование элементов массива
•	Создайте массив из 4 чисел.
•	Создайте новый массив, в котором каждый элемент будет повторяться дважды.
        Пример: [1, 2, 3] → [1, 1, 2, 2, 3, 3].
  */
        P.S. Результат выдается верный, но реализация наверное
        не совсем правильная. Прошу объяснить решение кода дополнительно.
*/

public class DoubleNum {
    public static void main(String[] args) {

        int length = 5;
        int[] arr = new int[length];
        int[] NewArr = new int[length * 2];

        for (int i = 0, j = 0; i < arr.length; i++) {
           arr[i] = i;

            NewArr[j] = arr[i];
            NewArr[j + 1] = arr[i];

            System.out.print(arr[i] + " ");
           // System.out.print(NewArr[j] + " ");
        }

        /*
        P.S. Результат выдается верный, но реализация наверное
        не совсем правильная. Прошу объяснить решение кода дополнительно.
                */

                System.out.println();
        for (int i = 0, j = 0; i < arr.length; i++) {
            arr[i] = i;

            NewArr[j] = arr[i];
            NewArr[j] = arr[i];

            System.out.print(arr[i] + " ");
            System.out.print(NewArr[j] + " ");
        }

    }
}