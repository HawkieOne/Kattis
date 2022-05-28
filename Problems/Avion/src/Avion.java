import java.util.Scanner;

public class Avion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] airports = new String[5];
        boolean escaped = false;
        for(int i = 1; i <= 5; i++) {
            airports[i - 1] = scanner.nextLine();
            if(airports[i - 1].contains("FBI")) {
                escaped = true;
                System.out.print(i + " ");
            }
        }
        if(escaped == false) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
