import java.util.Scanner;

public class JAM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double cases = Double.parseDouble(scanner.nextLine());
            double sumMinutesDisplayed = 0;
            double sumSeconds = 0;
            for (int i = 0; i < cases; i++) {
                sumMinutesDisplayed += Double.parseDouble(scanner.next()) * 60;
                sumSeconds += Double.parseDouble(scanner.next());
            }
            double convertedTime = sumSeconds / sumMinutesDisplayed;
            if (convertedTime > 1) {
                System.out.println(convertedTime);
            } else {
                System.out.println("measurement error");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
