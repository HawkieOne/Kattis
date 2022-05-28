import java.util.Scanner;

public class JAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cases = Double.parseDouble(scanner.nextLine());
        double slMinute = 0;
        for(int i = 0; i < cases; i++){
            double minutesDisplayed = Double.parseDouble(scanner.next());
            double seconds = Double.parseDouble(scanner.next());
            slMinute += seconds / (60 * minutesDisplayed);
            System.out.println(String.valueOf(slMinute));
        }
        slMinute = slMinute / cases;
        System.out.println(String.valueOf(slMinute));
    }
}
