import java.util.Scanner;

public class OG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int gnomeGroups = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < gnomeGroups; i++) {
                int amountOfGnomes = Integer.parseInt(scanner.next());
                int gnomeNumber = Integer.parseInt(scanner.next());
                int king = 0;
                for (int j = 0; j < amountOfGnomes - 1; j++) {
                    int nextGnome = Integer.parseInt(scanner.next());
                    if (nextGnome - 1 != gnomeNumber && king == 0) {
                        king = j + 2;
                        System.out.println(j + 2);
                    }
                    gnomeNumber = nextGnome;
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
