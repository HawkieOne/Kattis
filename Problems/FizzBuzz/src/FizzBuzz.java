import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.next());
        int Y = Integer.parseInt(scanner.next());
        int N = Integer.parseInt(scanner.next());
        int i = 1;
        while(i <= N) {
            if(i % X == 0 && i % Y== 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % Y == 0) {
                System.out.println("Buzz");
            }
            else if(i % X == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
            i++;
        }
    }
}
