import java.util.Scanner;

public class SS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 1) {
            System.out.println("Either");
        } else if (num == 4 || num == 8) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
