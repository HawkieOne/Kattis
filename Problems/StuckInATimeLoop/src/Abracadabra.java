import java.util.Scanner;

public class Abracadabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        int i = 1;
        while(i <= number) {
            System.out.println(i + " Abracadabra");
            i++;
        }
    }
}

