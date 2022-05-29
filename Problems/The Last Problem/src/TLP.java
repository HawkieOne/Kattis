import java.util.Scanner;

public class TLP {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.println("Thank you, " + name + ", and farewell!");
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
