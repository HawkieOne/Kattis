import java.util.Scanner;

public class PC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double radius = Double.parseDouble(scanner.next());
            int crust = Integer.parseInt(scanner.next());
            double cheese = radius - crust;

            double pizzaArea = Math.PI * Math.pow(radius, 2);
            double crustArea = Math.PI * Math.pow(crust, 2);
            double cheeseArea = Math.PI * Math.pow(cheese, 2);

            System.out.println((cheeseArea / pizzaArea) * 100);
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
