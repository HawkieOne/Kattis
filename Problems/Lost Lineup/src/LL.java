import java.util.Arrays;
import java.util.Scanner;

public class LL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int persons = Integer.parseInt(scanner.nextLine());
            int[] queue = new int[persons];
            queue[0] = 1;
            for (int i = 0; i < persons - 1; i++) {
                int number = Integer.parseInt(scanner.next());
                queue[1 + number] = i + 2;
                // System.out.println(Arrays.toString(queue));
            }
            for (int i = 0; i < persons; i++) {
                System.out.print(queue[i] + " ");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
