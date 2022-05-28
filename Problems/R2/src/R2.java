import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = Integer.parseInt(scanner.next());
        int S = Integer.parseInt(scanner.next());
        int R2 = S * 2 - R1;
        System.out.println(R2);
    }
}
