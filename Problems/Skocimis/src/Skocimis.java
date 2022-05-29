import java.util.Scanner;

public class Skocimis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] kangaroos = new int[3];
            kangaroos[0] = Integer.parseInt(scanner.next());
            kangaroos[1] = Integer.parseInt(scanner.next());
            kangaroos[2] = Integer.parseInt(scanner.next());
            int count = 0;
            int quit = 0, temp;
            while (quit != 1) {
                if (kangaroos[1] - kangaroos[0] >= kangaroos[2] - kangaroos[1]) {
                    if (kangaroos[1] - kangaroos[0] != 1) {
                        temp = kangaroos[1];
                        kangaroos[1]--;
                        kangaroos[2] = temp;
                        count++;
                    } else {
                        quit = 1;
                    }
                } else {
                    if (kangaroos[2] - kangaroos[1] != 1) {
                        temp = kangaroos[1];
                        kangaroos[1]++;
                        kangaroos[0] = temp;
                        count++;
                    } else {
                        quit = 1;
                    }
                }
            }
            System.out.println(count);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
