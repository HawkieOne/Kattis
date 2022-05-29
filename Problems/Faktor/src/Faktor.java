import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int articles = Integer.parseInt(scanner.next());
            int factor = Integer.parseInt(scanner.next());
            int bribes = (articles * (factor - 1)) + 1;
            System.out.println(bribes);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
