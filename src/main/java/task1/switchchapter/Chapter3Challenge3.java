package task1.switchchapter;

import java.util.Scanner;

/**
 * Необходимо написать программу, где бы пользователю предлагалось ввести число 303.
 * Если пользователь ввёл число 303, программа должна вывести сообщение: "Выввеличисло 303".
 * Если пользователь ввёл другое число, программа вообще ничего не должна делать.
 */
public class Chapter3Challenge3 {

    public static void outputMessageForSuccessWithSwitch() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 303");
        int inputNumber = in.nextInt();
        switch (inputNumber) {
            case (303):
                System.out.println("Вы ввели число 303");
                break;
            default:
        }
    }
}
