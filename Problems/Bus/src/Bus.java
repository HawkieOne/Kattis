import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.next());
            for (int i = 0; i < cases; i++) {
                int stops = Integer.parseInt(scanner.next());
                double passengers = 0;
                if (stops == 1) {
                    passengers = 1;
                } else {
                    for (int j = 0; j < stops; j++) {
                        passengers += 0.5;
                        passengers *= 2;
                    }
                }
                System.out.println((int) passengers);
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
