import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (i % 3 == 0 && word.charAt(i) != 'P') {
                    count++;
                }
                if (i % 3 == 1 && word.charAt(i) != 'E') {
                    count++;
                }
                if (i % 3 == 2 && word.charAt(i) != 'R') {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
