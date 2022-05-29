import java.util.Scanner;

public class PHM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double average = 0.0;
            int numbers = 0;
            double sum = 0.0;
            while (scanner.hasNextDouble() || scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                } else if (scanner.hasNext()) {

                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
