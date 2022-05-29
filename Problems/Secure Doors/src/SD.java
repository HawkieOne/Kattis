import java.util.ArrayList;
import java.util.Scanner;

public class SD {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            ArrayList<String> personsInside = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                String id = scanner.next();
                String person = scanner.next();
                if (id.equals("entry")) {
                    if (personsInside.contains(person)) {
                        System.out.println(person + " entered (ANOMALY)");
                    } else {
                        personsInside.add(person);
                        System.out.println(person + " entered");
                    }
                } else {
                    if (personsInside.contains(person)) {
                        personsInside.remove(person);
                        System.out.println(person + " exited");
                    } else {
                        System.out.println(person + " exited (ANOMALY)");
                    }
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
