import java.util.Scanner;

public class JOC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());
        int number3 = Integer.parseInt(scanner.next());
        System.out.println(number1 * number2 * number3);
    }
}
