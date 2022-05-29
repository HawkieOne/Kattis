import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int radius = Integer.parseInt(scanner.nextLine());
            double areaEuclidian = Math.pow(radius, 2) * Math.PI;
            System.out.println(areaEuclidian);
            double areaTaxicab = ((radius * radius) / 2.0) * 4;
            System.out.println(areaTaxicab);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
