import java.util.Scanner;

public class Volim {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int player = Integer.parseInt(scanner.nextLine());
            int questions = Integer.parseInt(scanner.nextLine());
            int time = 0;
            String result = "";
            for (int i = 0; i < questions; i++) {
                time += Integer.parseInt(scanner.next());
                result = scanner.next();
                if (result.equals("T") && time < 210) {
                    player++;
                    if (player == 9) {
                        player = 1;
                    }
                }
            }
            System.out.println(player);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
