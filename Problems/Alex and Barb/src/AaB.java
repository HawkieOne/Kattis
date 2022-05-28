import java.util.Scanner;

public class AaB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cards = Integer.parseInt(scanner.next());
        int alex = Integer.parseInt(scanner.next());
        int barb = Integer.parseInt(scanner.next());
        System.out.println(cards % (alex+barb) < alex ? "Barb\n" : "Alex\n");
    }
}
