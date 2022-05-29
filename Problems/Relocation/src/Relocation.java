import java.util.ArrayList;
import java.util.Scanner;

public class Relocation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nrOfcompanies = scanner.nextInt();
            int nrOfRequests = scanner.nextInt();
            ArrayList<Integer> locations = new ArrayList<>();
            for (int i = 0; i < nrOfcompanies; i++) {
                locations.add(scanner.nextInt());
            }
            for (int i = 0; i < nrOfRequests; i++) {
                int state = scanner.nextInt();
                if (state == 1) {
                    int company = scanner.nextInt();
                    int newLocation = scanner.nextInt();
                    locations.set(company - 1, newLocation);
                } else if (state == 2) {
                    int companyOne = scanner.nextInt();
                    int companyTwo = scanner.nextInt();
                    int distance = Math.abs(locations.get(companyOne - 1) - locations.get(companyTwo - 1));
                    System.out.println(distance);
                }
            }
        } catch (IOException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
