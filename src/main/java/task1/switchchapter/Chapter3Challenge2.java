package task1.switchchapter;

import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число 202.
 * Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
 * Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число неравное 202"
 */
public class Chapter3Challenge2 {

    public static void outputMessageWithSwitch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 202");
        int inputNumber = in.nextInt();
        switch (inputNumber) {
            case (202):
                System.out.println("Вы ввели число 202");
                break;
            default:
                System.out.println("Вы ввели число не равное 202");
        }
    }
}
