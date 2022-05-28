import java.util.Scanner;

public class LS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthLaptop = scanner.nextInt();
        int heightLaptop = scanner.nextInt();
        int widthSticker = scanner.nextInt();
        int heightSticker = scanner.nextInt();
        if (widthSticker < widthLaptop - 1 && heightSticker < heightLaptop - 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
