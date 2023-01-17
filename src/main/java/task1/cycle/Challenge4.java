package task1.cycle;

/**
 * Написать программу, которая вам уменьшает зп с $10000 до $0 каждый месяц,
 * используя циклы while/ do ... while, for. (Все три реализации).
 */
public class Challenge4 {

    public static int decrease = 1000;

    public static void decreaseSalary() {
        int salary = 10000;
        int tempSalary = salary;
        int month = 0;
        while(tempSalary > 0) {
            tempSalary = tempSalary - decrease;
            month = month + 1;
        }
        System.out.println("Результат работы цикла while: " + tempSalary + " за " + month + " месяцев");
        month = 0;
        tempSalary = salary;

        do {
            tempSalary = tempSalary - decrease;
            month = month + 1;
        } while (tempSalary > 0);
        System.out.println("Результат раюоты цикла do...while: " + tempSalary + " за " + month + " месяцев");
        tempSalary = salary;

        for (int i = 1; tempSalary > 0; i++) {
            tempSalary = tempSalary - decrease;
            month = i;
        }
        System.out.println("Результат раюоты цикла for: " + tempSalary + " за " + month + " месяцев");
    }
}
