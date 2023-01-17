package task1.ifElse;

import java.util.Scanner;

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
