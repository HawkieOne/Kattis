import java.util.Scanner;

public class DTH {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int battles = Integer.parseInt(scanner.nextLine());
            int battlesWon = 0, victory = 0;
            for (int i = 0; i < battles; i++) {
                String keyPressed = scanner.nextLine();
                for (int j = 0; j < keyPressed.length() - 1; j++) {
                    if (keyPressed.charAt(j) == 'C' && keyPressed.charAt(j + 1) == 'D') {
                        victory = 1;
                    }
                }
                if (victory == 0) {
                    battlesWon++;
                }
                victory = 0;
            }
            System.out.println(battlesWon);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
