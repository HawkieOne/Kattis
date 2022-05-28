import java.util.Scanner;

public class MW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int launchMonth = 4;
        int launchYear = 2018;
        int year = scanner.nextInt();
        int months = (year - launchYear) * 12 - launchMonth;
        if (months % 24 <= 12) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
