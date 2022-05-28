import java.math.BigInteger;
import java.util.Scanner;

public class SA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scanner.next());
        BigInteger num2 = new BigInteger(scanner.next());
        BigInteger sum = num1.add(num2);
        System.out.println(sum);
    }
}
