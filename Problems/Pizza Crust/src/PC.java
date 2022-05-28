import java.util.Scanner;

public class PC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.next());
        int crust = Integer.parseInt(scanner.next());
        double cheese = radius - crust;

        double pizzaArea = Math.PI * Math.pow(radius, 2);
        //System.out.println(pizzaArea);
        double crustArea = Math.PI * Math.pow(crust, 2);
        //System.out.println(crustArea);
        double cheeseArea = Math.PI * Math.pow(cheese, 2);
        //System.out.println(cheeseArea);

        System.out.println((cheeseArea / pizzaArea) * 100);
    }
}
