import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] stringArr = scanner.nextLine().split(" ");
            int carrots = Integer.parseInt(stringArr[1]);
            int i = 0;
            while(i < Integer.parseInt(stringArr[0])) {
                scanner.nextLine();
                i++;
            }
            System.out.println(carrots);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
