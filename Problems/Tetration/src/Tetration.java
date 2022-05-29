import java.util.Scanner;

public class Tetration {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double result = Double.parseDouble(scanner.nextLine());
            double x = Math.log10(result) / Math.log10(1000);
            System.out.println(Math.sqrt(result));
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
