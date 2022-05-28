import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.next());
        int Y = Integer.parseInt(scanner.next());

        String largerStringX = String.valueOf(X), reverseX = "";
        String largerStringY = String.valueOf(Y), reverseY = "";
        for(int i = largerStringX.length() - 1; i >= 0; i--) {
            reverseX += largerStringX.charAt(i);
        }for(int i = largerStringY.length() - 1; i >= 0; i--) {
            reverseY += largerStringY.charAt(i);
        }
        X = Integer.parseInt(reverseX);
        Y = Integer.parseInt(reverseY);

        int larger = 0;
        if(X > Y) {
            larger = X;
        }
        else {
            larger = Y;
        }
        System.out.println(larger);
    }
}
