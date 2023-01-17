package task1.ifElse;

import java.util.Scanner;

public class Chapter2Challenge1 {

    public static void outputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 5, 4 или 1");
        int inputNumber = in.nextInt();
        if (inputNumber == 5) {
            System.out.println("Пользователь ввёл число 5");
        } else if (inputNumber == 4) {
            System.out.println("Пользователь ввёл число 4");
        } else if (inputNumber == 1) {
            System.out.println("Пользователь ввёл число 1");
        } else {
            System.out.println("Пользователь ввёл некорректное число");
        }
    }
}
