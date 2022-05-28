import java.util.Scanner;

public class ARC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double side = Math.sqrt(area);
        System.out.println(side * 4);
    }
}
