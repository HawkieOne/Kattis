import java.util.Scanner;

public class JJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.next());
        int sum = 0;
        for (int i = 0; i < cases; i++) {
            sum += Integer.parseInt(scanner.next());
        }
        sum -= (cases - 1);
        System.out.println(sum);
    }
}
