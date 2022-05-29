import java.util.ArrayList;
import java.util.Scanner;

public class ALG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.nextLine());
            ArrayList<Integer> list = new ArrayList<>();
            int count = 0;
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    number /= i;
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
