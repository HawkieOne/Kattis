import java.util.Scanner;

public class TripleTexting {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String words = scanner.nextLine();
            int length = words.length();

            String[] word = new String[3];
            word[0] = "";
            word[1] = "";
            word[2] = "";
            for (int i = 0; i < words.length(); i++) {
                if (i >= 0 && i <= words.length() / 3 - 1) {
                    word[0] = word[0] + words.charAt(i);
                } else if (i >= words.length() / 3 && i <= (words.length() / 3) * 2 - 1) {
                    word[1] = word[1] + words.charAt(i);
                } else {
                    word[2] = word[2] + words.charAt(i);
                }
            }
            if (word[0].equals(word[1])) {
                System.out.println(word[0]);
            } else {
                System.out.println(word[2]);
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
