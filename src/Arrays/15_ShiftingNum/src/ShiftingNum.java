/*
15. Сдвиг элементов массива
•	Создайте массив из 5 чисел.
•	Переместите все элементы массива на одну позицию вправо, последний элемент станет первым.
Пример: [1, 2, 3, 4] → [4, 1, 2, 3].
 */

public class ShiftingNum {

    /*
    Этот код я так до конца и не понял. Писал с подсказками от чата GPT,
    пытаясь осмысливать...
     */

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        System.out.print("Заданный массив: ");
        printArray(num);

        int LastNumArr = num[num.length - 1];
        int index = num.length - 1;

        while (index > 0) {
            num[index] = num[index - 1];
            index--;
        }

        num[0] = LastNumArr;

        System.out.print("Смещенный массив: ");
        printArray(num);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

}