import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < cases; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == 1 || number == 2 || number == 4) {
                    System.out.println(number);
                } else if (number == 3) {
                    System.out.println(6);
                } else {
                    System.out.println(0);
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
