import java.util.Scanner;

public class Vauvau {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dog1Att = scanner.nextInt();
            int dog1Rest = scanner.nextInt();
            int dog2Att = scanner.nextInt();
            int dog2Rest = scanner.nextInt();
            int postman = scanner.nextInt();
            int milkman = scanner.nextInt();
            int garbageman = scanner.nextInt();
            
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
