import java.util.Scanner;

public class JT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        double semiperimeter = ((double)a + (double)b + (double)c + (double)d) / 2;

        double result = Math.sqrt((semiperimeter - a ) * (semiperimeter - b) *
                (semiperimeter - c) *(semiperimeter - d));
        System.out.println(result);
    }
}
