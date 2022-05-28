import java.util.Scanner;

public class QS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        if(x > 0 && y > 0 ) {
            System.out.println(1);
        }
        else if(x < 0 && y > 0) {
            System.out.println(2);
        }
        else if(x < 0 && y < 0 ) {
            System.out.println(3);
        }
        else {
            System.out.println(4);
        }
    }
}
