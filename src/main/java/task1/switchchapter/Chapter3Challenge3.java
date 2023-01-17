package task1.switchchapter;

import java.util.Scanner;

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
