import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Autori {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            char[] charLine = line.toCharArray();
            for (int i = 0; i < charLine.length; i++) {
                if (charLine[i] == '-') {
                    System.out.print(charLine[i + 1]);
                } else if (i == 0) {
                    System.out.print(charLine[i]);
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
