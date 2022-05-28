import java.util.Scanner;

public class MT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int state = 1;
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                int c2 = word.charAt(j);
                if (j != i && c == c2) {
                    state = 0;
                    break;
                }
            }
        }
        System.out.println(state);
    }
}
