import java.util.Scanner;

public class IM {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int inch = 1000;
            int foot = 12;
            int yard = 3;
            int chain = 22;
            int furlong = 10;
            int mile = 8;
            int league = 3;
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
