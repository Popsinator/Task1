package task1.switchchapter;

import java.util.Scanner;

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
