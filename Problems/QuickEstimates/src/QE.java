import java.util.Scanner;

public class QE {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < number; i++) {
                String estimate = scanner.nextLine();
                System.out.println(estimate.length());
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
