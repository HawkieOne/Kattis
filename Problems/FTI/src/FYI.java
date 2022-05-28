import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        boolean prefix = true;
        for (int i = 0; i < 3; i++) {
            char c = word.charAt(i);
            if ( c != '5') {
                prefix = false;
            }
        }
        if (!prefix) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
