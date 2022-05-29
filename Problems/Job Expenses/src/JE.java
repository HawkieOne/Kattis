import java.util.Scanner;

public class JE {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numbers = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            for (int i = 0; i < numbers; i++) {
                int number = Integer.parseInt(scanner.next());
                if (number < 0) {
                    sum += Math.abs(number);
                }
            }
            System.out.println(sum);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
