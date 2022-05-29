import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double iterations = Double.parseDouble(scanner.next());
            double dots = 0, totaldots = 0;
            for (int i = 1; i <= iterations; i++) {
                dots = (1 + Math.pow(2, i));
                totaldots = Math.pow(dots, 2);
            }
            System.out.println((int) totaldots);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
