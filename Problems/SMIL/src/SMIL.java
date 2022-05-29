import java.util.Scanner;

public class SMIL {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String sequence = scanner.next();
            for (int i = 0; i < sequence.length(); i++) {
                char character = sequence.charAt(i);
                if (character == ':' || character == ';') {
                    if (i + 1 < sequence.length() && sequence.charAt(i + 1) == ')') {
                        System.out.println(i);
                    }
                    if (i + 2 < sequence.length() && sequence.charAt(i + 1) == '-' && sequence.charAt(i + 2) == ')') {
                        System.out.println(i);
                    }
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
