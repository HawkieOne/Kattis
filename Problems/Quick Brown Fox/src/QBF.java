import com.sun.tools.javac.Main;

import java.util.Scanner;

public class QBF {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int cases = Integer.parseInt(scanner.nextLine());
            String alphabet = "abcdefghijklmnopqrstuvwxyz", missingLetters = "";
            for (int i = 0; i < cases; i++) {
                String sentence = scanner.nextLine();
                sentence = sentence.toLowerCase();
                for (int j = 0; j < alphabet.length(); j++) {
                    if (!sentence.contains(String.valueOf(alphabet.charAt(j)))) {
                        missingLetters += alphabet.charAt(j);
                    }
                }
                if (missingLetters.equals("")) {
                    System.out.println("pangram");
                } else {
                    System.out.println("missing " + missingLetters);
                }
                missingLetters = "";
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
