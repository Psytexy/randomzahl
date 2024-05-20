import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZahlErrater();
    }

    public static void ZahlErrater() {
        Scanner scan = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int attempts = 5;

        System.out.println("Eine Zahl wurde ausgewählt zwischen 1-100. Errate diese Zahl innerhalb von 5 Versuchen.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Errate die Zahl: ");
            int guess = scan.nextInt();

            if (number == guess) {
                System.out.println("SupiDupi!! Du hast die Zahl erraten.");
                return;
            } else if (number > guess && i != attempts - 1) {
                System.out.println("Die Zahl ist größer als " + guess);
            } else if (number < guess && i != attempts - 1) {
                System.out.println("Die Zahl ist kleiner als " + guess);
            }
        }

        System.out.println("womp womp, keine Versuche mehr übrig. Die Zahl war " + number);
    }
}
