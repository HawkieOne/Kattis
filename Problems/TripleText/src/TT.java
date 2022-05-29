import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String string = scanner.nextLine();
            String word = "";
            int wordLength = string.length() / 3;
            for (int i = 0; i < wordLength; i++) {
                word += string.charAt(i);
            }
            System.out.println(word);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
