/*
1. Считать 6 строк и заполнить ими массив strings
2. Удалить повторяющиеся строки из массива string,
заменив их на null.
 */


import java.util.Scanner;

public class DellEqalsStringV1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = in.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (strings[i] == null) {
                continue;
            }
            for (int j = i + 1; j < 6; j++) {
                if (s.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                    //strings[i] = strings[j];
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            String comp = strings[i];
            System.out.println(comp);
        }
    }
}

