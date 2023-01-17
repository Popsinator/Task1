package task1.ifElse;

import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число 101.
 * Если пользователь ввёл число 101, программа должна вывести сообщение: "Вы ввели число 101".
 * Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число неравное 101"
 */
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
