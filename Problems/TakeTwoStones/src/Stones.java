import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int stones = Integer.parseInt(scanner.nextLine());
            while (stones >= 2) {
                stones -= 2;
            }
            if (stones % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
