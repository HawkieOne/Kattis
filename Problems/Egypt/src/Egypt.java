import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean state = true;
            while (state) {
                ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(scanner.nextInt());
                numbers.add(scanner.nextInt());
                numbers.add(scanner.nextInt());
                Collections.sort(numbers);
                if (numbers.get(0) == 0 && numbers.get(1) == 0 && numbers.get(2) == 0) {
                    System.exit(0);
                }
                if (Math.pow(numbers.get(0), 2) + Math.pow(numbers.get(1), 2) == Math.pow(numbers.get(2), 2)) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
