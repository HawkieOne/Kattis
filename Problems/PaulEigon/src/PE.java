import java.util.Scanner;

public class PE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serves = Integer.parseInt(scanner.next());
        int pScore = Integer.parseInt(scanner.next());
        int oScore = Integer.parseInt(scanner.next());
        int score = pScore + oScore;
        int times = score / serves;
        if ( times % 2 == 1) {
            System.out.println("opponent");
        } else {
            System.out.println("paul");
        }
    }
}
