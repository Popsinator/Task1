package task1.cycle;

/**
 * Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками.
 */
public class Challenge2 {

    static String name = "Попов Алексей Алексеевич";

    public static void standardMethodsForWorkWithString() {
        System.out.println("Результат работы метода - 'length()'");
        System.out.println(name.length());

        System.out.println("Результат работы метода - 'isEmpty()'");
        System.out.println(name.isEmpty());

        System.out.println("Результат работы метода - 'charAt(0)'");
        System.out.println(name.charAt(0));

        System.out.println("Результат работы метода - 'getChars'");
        char[] massive = new char[7];
        name.getChars(2, 9, massive, 0);
        System.out.print("Скопированное значение: " );
        System.out.println(massive);

        System.out.println("Результат работы метода - 'equals(\"попов алексей алексеевич\")'");
        System.out.println(name.equals("попов алексей алексеевич"));

        System.out.println("Результат работы метода - 'equalsIgnoreCase(\"попов алексей алексеевич\")'");
        System.out.println(name.equalsIgnoreCase("попов алексей алексеевич"));

        System.out.println("Результат работы метода - 'startsWith(\"П\", 0)'");
        System.out.println(name.startsWith("П", 0));

        System.out.println("Результат работы метода - 'endsWith(\"ч\")'");
        System.out.println(name.endsWith("ч"));

        System.out.println("Результат работы метода - 'concat'");
        System.out.println(name.concat(" - выполняет д/з"));

        System.out.println("Результат работы метода - 'replace'");
        System.out.println(name.replace(" ", "_"));

        System.out.println("Результат работы метода - 'contains'");
        System.out.println(name.contains("п"));
    }
}
