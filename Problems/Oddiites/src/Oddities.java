import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            int i = 0;
            int number = 0;
            while (i < cases) {
                number = Integer.parseInt(scanner.nextLine());
                if (number % 2 == 0) {
                    System.out.println(number + " is even");
                } else {
                    System.out.println(number + " is odd");
                }
                i++;
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
