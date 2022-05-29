import java.util.Scanner;

public class ARC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double area = Double.parseDouble(scanner.nextLine());
            double side = Math.sqrt(area);
            System.out.println(side * 4);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
