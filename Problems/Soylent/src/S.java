import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cases; i++){
            double calories = Double.parseDouble(scanner.nextLine());
            double bottles = calories / 400;
            System.out.println((int)Math.ceil(bottles));
        }
    }
}
