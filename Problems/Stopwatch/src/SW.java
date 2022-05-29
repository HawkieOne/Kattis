import java.util.Scanner;

public class SW {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int timesPressed = Integer.parseInt(scanner.next());
            if (timesPressed % 2 == 0) {
                int result = 0;
                for (int i = 0; i < timesPressed / 2; i++) {
                    int first = Integer.parseInt(scanner.next());
                    int second = Integer.parseInt(scanner.next());
                    result += second - first;
                }
                System.out.println(result);
            } else {
                System.out.println("still running");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
