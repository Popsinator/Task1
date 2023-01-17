package task1.cycle;

public class Challenge3 {

    public static int increase = 1000;

    public static void addMoney(int salary) {
        int tempSalary = salary;
        int month = 1;
        while(month < 12) {
            tempSalary = tempSalary + increase;
            month = month + 1;
        }
        System.out.println("Результат раюоты цикла while: " + tempSalary);
        month = 1;
        tempSalary = salary;

        do {
            tempSalary = tempSalary + increase;
            month = month + 1;
        } while (month < 12);
        System.out.println("Результат раюоты цикла do...while: " + tempSalary);
        month = 1;
        tempSalary = salary;

        for (int i = 1; i < 12; i++) {
            tempSalary = tempSalary + increase;
        }
        System.out.println("Результат раюоты цикла for: " + tempSalary);
    }

}
