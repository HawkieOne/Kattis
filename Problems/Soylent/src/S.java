import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < cases; i++) {
                double calories = Double.parseDouble(scanner.nextLine());
                double bottles = calories / 400;
                System.out.println((int) Math.ceil(bottles));
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
