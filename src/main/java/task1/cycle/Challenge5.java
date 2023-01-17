package task1.cycle;

/**
 * Напишитепрограмму,котораявыводитнаэкран «5,4,3,2,1» используяцикл for.
 */
public class Challenge5 {

    public static void digital54321() {
        for (int i = 5; i > 0; i--) {
            if(i == 1) {
                System.out.print(i);
                continue;
            }
            System.out.print(i + ",");
        }
    }
}
