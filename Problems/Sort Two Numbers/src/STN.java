import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class STN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOne = scanner.nextInt();
            int numberTwo = scanner.nextInt();
            if (numberOne >= numberTwo) {
                System.out.println(numberTwo + " " + numberOne);
            } else {
                System.out.println(numberOne + " " + numberTwo);
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
