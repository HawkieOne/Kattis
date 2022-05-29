import java.util.Scanner;

public class AaB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cards = Integer.parseInt(scanner.next());
            int alex = Integer.parseInt(scanner.next());
            int barb = Integer.parseInt(scanner.next());
            System.out.println(cards % (alex + barb) < alex ? "Barb\n" : "Alex\n");
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
