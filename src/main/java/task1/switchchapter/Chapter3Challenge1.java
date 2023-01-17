package task1.switchchapter;

import java.util.Scanner;

public class Chapter3Challenge1 {

    public static void outputNumberWithSwitch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 7, 3 или 2");
        int inputNumber = in.nextInt();
        switch (inputNumber) {
            case (7):
                System.out.println("Пользователь ввёл число 7");
                break;
            case (3):
                System.out.println("Пользователь ввёл число 3");
                break;
            case (2):
                System.out.println("Пользователь ввёл число 2");
                break;
            default:
                System.out.println("Пользователь ввёл некорректное число");
                break;
        }
    }
}
