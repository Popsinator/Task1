package org.example;

import task1.cycle.*;
import task1.ifElse.Chapter2Challenge1;
import task1.ifElse.Chapter2Challenge2;
import task1.ifElse.ChapterChallenge3;
import task1.switchchapter.Chapter3Challenge1;
import task1.switchchapter.Chapter3Challenge2;
import task1.switchchapter.Chapter3Challenge3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showMenu();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название раздела, результаты работы которого Вы хотите посмотреть(1-4)");
            int chapter = in.nextInt();

            if (chapter == 4) {
                break;
            }

            System.out.println("Введите номер пункта, результаты работы которого Вы хотите посмотреть");
            int challenge = in.nextInt();

            switch (chapter) {
                case (1):
                    switch (challenge) {
                        case (1):
                            Challenge1.outVariable();
                            continue;
                        case (2):
                            Challenge2.standardMethodsForWorkWithString();
                            continue;
                        case (3):
                            System.out.println("Введите Вашу зарплату: ");
                            int salary = +in.nextInt();
                            Challenge3.addMoney(salary);
                            continue;
                        case (4):
                            Challenge4.decreaseSalary();
                            continue;
                        case (5):
                            Challenge5.digital54321();
                            continue;
                        default:
                            System.out.println("Введён несуществующий номер пункта. Вводите от 1 до 5");
                            continue;
                    }
                case (2):
                    switch (challenge) {
                        case (1):
                            Chapter2Challenge1.outputNumber();
                            continue;
                        case (2):
                            Chapter2Challenge2.outputMessage();
                            continue;
                        case (3):
                            ChapterChallenge3.outputMessageForSuccess();
                            continue;
                        default:
                            System.out.println("Введён несуществующий номер пункта. Повторите ввод. Вводите от 1 до 3.");
                            continue;
                    }
                case (3):
                    switch (challenge) {
                        case (1):
                            Chapter3Challenge1.outputNumberWithSwitch();
                            continue;
                        case (2):
                            Chapter3Challenge2.outputMessageWithSwitch();
                            continue;
                        case (3):
                            Chapter3Challenge3.outputMessageForSuccessWithSwitch();
                            continue;
                        default:
                            System.out.println("Введён несуществующий номер пункта. Повторите ввод. Вводите от 1 до 3.");
                            continue;
                    }
                default:
                    System.out.println("Введён несуществующий номер раздела. Повторите ввод. Вводите от 1 до 3.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 - Циклы");
        System.out.println("1.  Объявить переменные всех вам известных типов и вывести их значения на экран.");
        System.out.println("2.  Объявить строку с вашим полным именем и вывести на экран результат работы всех" +
                " стандартных методов работы со строками.");
        System.out.println("3.  Написать программу, которая увеличивает вам зарплату каждый месяц на $1000, " +
                "используя циклы while/ do ... while, for. (Все три реализации)");
        System.out.println("4.  Написать программу, которая вам уменьшает зп с $10000 до $0 каждый месяц," +
                " используя циклы while/ do ... while, for. (Все три реализации).");
        System.out.println("5.  Напишитепрограмму,котораявыводитнаэкран «5,4,3,2,1» используяцикл for.");
        System.out.println("");
        System.out.println("2 - If/else");
        System.out.println("1.  Необходимо написать программу, где бы пользователю предлагалось ввести число " +
                "на выбор: 5, 4 или 1, а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.");
        System.out.println("2.  Необходимо написать программу, где бы пользователю предлагалось ввести число 101. " +
                "Если пользователь ввёл число 101, программа должна вывести сообщение: \"Вы ввели число 101\". " +
                "Если пользователь ввёл другое число, программа должна вывести такое сообщение: " +
                "\"Вы ввели число неравное 101\"");
        System.out.println("3.  Необходимо написать программу, где бы пользователю предлагалось ввести число 202. " +
                "Если пользователь ввёл число 202, программа должна вывести сообщение: \"Вы ввели число 202\". Если " +
                "пользователь ввёл другое число, программа вообще ничего не должна делать.");
        System.out.println("");
        System.out.println("3 - Switch");
        System.out.println("1. Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:" +
                " 7, 3 или 2, а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.");
        System.out.println("2. Необходимо написать программу, где бы пользователю предлагалось ввести число 202. " +
                "Если пользователь ввёл число 202, программа должна вывести сообщение: \"Вы ввели число 202\". " +
                "Если пользователь ввёл другое число, программа должна вывести такое сообщение: \"Вы ввели число " +
                "неравное 202\"");
        System.out.println("3. Необходимо написать программу, где бы пользователю предлагалось ввести число 303. " +
                "Если пользователь ввёл число 303, программа должна вывести сообщение: \"Выввеличисло 303\". Если " +
                "пользователь ввёл другое число, программа вообще ничего не должна делать.");
        System.out.println("");
        System.out.println("4 - Exit");
    }
}