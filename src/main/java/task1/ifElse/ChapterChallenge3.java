package task1.ifElse;

import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число 202.
 * Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
 * Если пользователь ввёл другое число, программа вообще ничего не должна делать.
 */
public class ChapterChallenge3 {

    public static void outputMessageForSuccess() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 202");
        int inputNumber = in.nextInt();
        if (inputNumber == 202) {
            System.out.println("Вы ввели число 202");
        }
    }
}
