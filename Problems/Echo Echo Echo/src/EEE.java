import java.util.Scanner;

public class EEE {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String word = scanner.next();
            System.out.println(word + " " + word + " " + word);
        }
    }
}
