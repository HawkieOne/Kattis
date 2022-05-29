import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String jonMarius = scanner.nextLine();
            String doctor = scanner.nextLine();
            if (doctor.length() <= jonMarius.length()) {
                System.out.println("go");
            } else {
                System.out.println("no");
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
