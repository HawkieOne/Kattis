import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dataPerMonth = Integer.parseInt(scanner.nextLine());
            int dataLeft = dataPerMonth;
            int months = Integer.parseInt(scanner.nextLine());
            int i = 0;
            while (i < months) {
                int dataUsage = Integer.parseInt(scanner.nextLine());
                dataLeft = dataLeft - dataUsage + dataPerMonth;
                i++;
            }
            System.out.println(dataLeft);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
