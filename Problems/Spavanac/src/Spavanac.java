import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double H = Double.parseDouble(scanner.next());
            double M = Double.parseDouble(scanner.next());
            if (H == 0) {
                H = 23;
                if (M >= 45) {
                    M -= 45;
                } else {
                    M += 15;
                }
            } else {
                if (M >= 45) {
                    M -= 45;
                } else {
                    M += 15;
                    H -= 1;
                }
            }
            System.out.println((int) H + " " + (int) M);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
