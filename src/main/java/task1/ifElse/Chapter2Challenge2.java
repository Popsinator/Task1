package task1.ifElse;

import java.util.Scanner;

public class Chapter2Challenge2 {

    public static void outputMessage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 101");
        int inputNumber = in.nextInt();
        if (inputNumber == 101) {
            System.out.println("Вы ввели число 101");
        } else {
            System.out.println("Вы ввели число не равное 101");
        }
    }
}
