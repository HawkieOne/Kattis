import java.util.Scanner;

public class IIH {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String date = scanner.nextLine();
            String[] times = date.split(" ");
            if (times[0].equals("OCT") && Integer.parseInt(times[1]) == 31
                    || times[0].equals("DEC") && Integer.parseInt(times[1]) == 25) {
                System.out.println("yup");
            } else {
                System.out.println("nope");
            }
        }
    }
}
