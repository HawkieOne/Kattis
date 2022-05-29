import java.util.Scanner;

public class ATN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOne = scanner.nextInt();
            int numberTwo = scanner.nextInt();
            System.out.println(numberOne + numberTwo);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
