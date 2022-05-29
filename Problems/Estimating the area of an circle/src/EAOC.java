import java.util.Scanner;

public class EAOC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double radius = Double.parseDouble(scanner.next());
            double markedPoints = Double.parseDouble(scanner.next());
            double pointsInCircle = Double.parseDouble(scanner.next());
            while (radius != 0 && markedPoints != 0 && pointsInCircle != 0) {
                double trueArea = Math.PI * Math.pow(radius, 2);
                double squareArea = Math.pow(radius * 2, 2);
                double calcArea = squareArea * (pointsInCircle / markedPoints);
                System.out.println(trueArea + " " + calcArea);
                radius = Double.parseDouble(scanner.next());
                markedPoints = Double.parseDouble(scanner.next());
                pointsInCircle = Double.parseDouble(scanner.next());
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
